package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import model.AuditBean;
import model.ChartAge;
import model.ChartModeOfTreatmentBean;
import model.ChartModel;
import model.ChartStatusBaseline;
import model.ChartStatusFollowup;
import utility.database.SQLOperations;
import utility.database.SQLOperationsBaseline;

@WebServlet("/DashboardDataServlet")
public class DashboardDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Connection connection;

	public void init() throws ServletException {
		connection = SQLOperations.getConnection();

		if (connection != null) {
			getServletContext().setAttribute("dbConnection", connection);
			System.out.println("connection is READY.");
		} else {
			System.err.println("connection is NULL.");
		}
	}

	public DashboardDataServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// params from js
		int agePass = Integer.parseInt(request.getParameter("agePass"));
		int genderPass = Integer.parseInt(request.getParameter("genderPass"));
		int modeOfTreatmentPass = Integer.parseInt(request.getParameter("modeOfTreatmentPass"));
		int baselinePass = Integer.parseInt(request.getParameter("baselinePass"));
		int followupPass = Integer.parseInt(request.getParameter("followupPass"));

		String sortFrom = request.getParameter("sortFrom");
		String sortTo = request.getParameter("sortTo");

		Boolean sortFromStat = true;
		Boolean sortToStat = true;

		if (sortFrom.equals("")) {
			sortFromStat = false;
		}
		if (sortTo.equals("")) {
			sortToStat = false;
		}

		int action = Integer.parseInt(request.getParameter("action"));
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");

		ChartModel dashboardData;
		ResultSet patientListRS = null;

		ChartAge chartAge = new ChartAge();
		ChartModeOfTreatmentBean chartModeOfTreatmentBean = new ChartModeOfTreatmentBean();
		ChartStatusBaseline chartStatusBaseline = new ChartStatusBaseline();
		ChartStatusFollowup chartStatusFollowup = new ChartStatusFollowup();

		int maleChart = 0;
		int femaleChart = 0;

		try {
			if (connection != null) {
				System.out.println(action);

				// logic for sort
				if (sortFromStat && sortToStat) {
					patientListRS = SQLOperations.getChartPatients(action, connection, sortFrom, sortTo);
				}
				if (!sortFromStat && !sortToStat) {
					patientListRS = SQLOperations.getChartPatientsAll(action, connection);
				}
				if (sortFromStat && !sortToStat) {
					patientListRS = SQLOperations.getChartPatientsFrom(action, connection, sortFrom);
				}
				if (!sortFromStat && sortToStat) {
					patientListRS = SQLOperations.getChartPatientsTo(action, connection, sortTo);
				}

				System.out.println(patientListRS.getFetchSize());

				int diseaseStatusID;
				ResultSet diseaseStatusRS = null;

				while (patientListRS.next()) {
					System.out.println("aaaaaaaaaaaaaaaa");
					int generalDataID = patientListRS.getInt("GeneralDataID");

					ResultSet generalDataRS = SQLOperations.getChartGeneralData(generalDataID, connection);

					while (generalDataRS.next()) {

						if (genderPass == 1) {
							System.out.println("p0");
							int gender = generalDataRS.getInt("Gender");
							if (gender == 1) {
								maleChart += 1;
							} else {
								femaleChart += 1;
							}
						}

						if (agePass == 1) {
							System.out.println("p1");
							String dateOfBirth = generalDataRS.getString("DateOfBirthDec");

							DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
							LocalDateTime getLocalTime = LocalDateTime.now();

							Calendar cal1 = new GregorianCalendar();
							Calendar cal2 = new GregorianCalendar();

							int age = 0;
							int factor = 0;
							Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(dateOfBirth);
							Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(dateFormat.format(getLocalTime));
							cal1.setTime(date1);
							cal2.setTime(date2);
							if (cal2.get(Calendar.DAY_OF_YEAR) < cal1.get(Calendar.DAY_OF_YEAR)) {
								factor = -1;
							}
							age = cal2.get(Calendar.YEAR) - cal1.get(Calendar.YEAR) + factor;

							chartAge.setAgeChart(age);
						}

						if (modeOfTreatmentPass == 1) {
							System.out.println("p2");
							int treatmentID = patientListRS.getInt("TreatmentID");

							ResultSet treatmentRS = SQLOperationsBaseline.getTreatment(treatmentID, connection);
							treatmentRS.first();
							int modeOfTreatmentID = treatmentRS.getInt("ModeOfTreatmentID");
							ResultSet modeOfTreatmentRS = SQLOperationsBaseline.getModeOfTreatment(modeOfTreatmentID, connection);
							modeOfTreatmentRS.first();

							String modeOfTreatmentValue = modeOfTreatmentRS.getString("ModeOfTreatment");
							chartModeOfTreatmentBean.setModeOfTreatment(modeOfTreatmentValue);
						}

						if (baselinePass == 1) {
							System.out.println("p3");
							diseaseStatusID = patientListRS.getInt("DiseaseStatusID");
							diseaseStatusRS = SQLOperationsBaseline.getDiseaseStatus(diseaseStatusID, connection);
							//diseaseStatusRS.first();

							if (diseaseStatusRS.first()) {
								String diseaseStatusBaselineValue = diseaseStatusRS.getString("DiseaseStatus");
								chartStatusBaseline.setDiseaseStatus(diseaseStatusBaselineValue);
							}

						}
					}
				}

				if (followupPass == 1) {
					System.out.println("p4");
					ResultSet followupRS = null;

					// logic for sort
					if (sortFromStat && sortToStat) {
						followupRS = SQLOperations.getChartFollowup(action, connection, sortFrom, sortTo);
					}
					if (!sortFromStat && !sortToStat) {
						followupRS = SQLOperations.getChartFollowupAll(action, connection);
					}
					if (sortFromStat && !sortToStat) {
						followupRS = SQLOperations.getChartFollowupFrom(action, connection, sortFrom);
					}
					if (!sortFromStat && sortToStat) {
						followupRS = SQLOperations.getChartFollowupTo(action, connection, sortTo);
					}

					while (followupRS.next()) {
						diseaseStatusID = followupRS.getInt("DiseaseStatusID");
						diseaseStatusRS = SQLOperationsBaseline.getDiseaseStatus(diseaseStatusID, connection);
						//diseaseStatusRS.first();
						if (diseaseStatusRS.first()) {
							String diseaseStatusBaselineValue = diseaseStatusRS.getString("DiseaseStatus");
							chartStatusBaseline.setDiseaseStatus(diseaseStatusBaselineValue);
						}
					}
				}

				dashboardData = new ChartModel(maleChart, femaleChart, chartAge, chartModeOfTreatmentBean, chartStatusBaseline,
						chartStatusFollowup);
				String json = new Gson().toJson(dashboardData);
				response.getWriter().write(json);
				
				HttpSession session = request.getSession(true);
				
				AuditBean auditBean = new AuditBean("Dashboard page - Viewing of diseases accessed", (String) session.getAttribute("name"),
						(String) session.getAttribute("name"), Integer.parseInt((String) session.getAttribute("accountID")));
				SQLOperations.addAudit(auditBean, connection);

			} else {
				System.out.println("Invalid Connection resource");
			}

		} catch (NullPointerException npe) {
			System.err.println("Invalid Connection resource - " + npe.getMessage());
		} catch (Exception e) {
			System.err.println("Exception - " + e.getMessage());
		}
	}

}
