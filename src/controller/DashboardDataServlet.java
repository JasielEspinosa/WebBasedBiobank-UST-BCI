package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.AuditBean;
import model.ChartAge;
import utility.database.SQLOperations;
import utility.database.SQLOperationsBaseline;

/** Servlet implementation class DashboardDataServlet */
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
		// TODO Auto-generated constructor stub
	}

	/** @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response) */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/** @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response) */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		int action = Integer.parseInt(request.getParameter("action"));
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		Map<String, String> dashboardData = new LinkedHashMap<>();
		ResultSet patientListRS;

		ChartAge chartAge = new ChartAge();
		int maleChart = 0;
		int femaleChart = 0;

		try {
			if (connection != null) {

				if (action == 1) {
					patientListRS = SQLOperations.getChartPatients(1, connection);
					int patientID = patientListRS.getInt("PatientID");
					int generalDataID = patientListRS.getInt("GeneralDataID");
					ResultSet generalDataRS = SQLOperationsBaseline.getGeneralData(generalDataID, connection);
					while (generalDataRS.next()) {
						int gender = generalDataRS.getInt("Gender");
						if (gender == 1) {
							maleChart += 1;
						} else {
							femaleChart += 1;
						}

						//put age algo here jas
						String dateOfBirth = generalDataRS.getString("DateOfBirthDec");

						int ageValue = 0;

						chartAge.setAgeChart(ageValue);

						//end of age algo

						int treatmentID = patientListRS.getInt("TreatmentID");

						ResultSet treatmentRS = SQLOperationsBaseline.getTreatment(treatmentID, connection);
						treatmentRS.first();
						int modeOfTreatmentID = treatmentRS.getInt("ModeOfTreatmentID");
						ResultSet modeOfTreatmentRS = SQLOperationsBaseline.getModeOfTreatment(modeOfTreatmentID, connection);
						modeOfTreatmentRS.first();

						String modeOfTreatmentValue = modeOfTreatmentRS.getString("ModeOfTreatment");

						//logic for mode of treatment

						int diseaseStatusID = patientListRS.getInt("DiseaseStatusID");
						ResultSet diseaseStatusRS = SQLOperationsBaseline.getDiseaseStatus(diseaseStatusID, connection);
						diseaseStatusRS.first();

						String diseaseStatusBaselineValue = diseaseStatusRS.getString("DiseaseStatus");

						//logic for disease status baseline

						ResultSet followupRS = SQLOperations.getChartFollowup(patientID, connection);
						followupRS.last();
						diseaseStatusID = followupRS.getInt("DiseaseStatusID");
						diseaseStatusRS = SQLOperationsBaseline.getDiseaseStatus(diseaseStatusID, connection);
						diseaseStatusRS.first();
						String diseaseStatusFollowupValue = diseaseStatusRS.getString("DiseaseStatus");
					}
				}

				if (action == 2) {
					patientListRS = SQLOperations.getChartPatients(2, connection);
				}
				if (action == 3) {
					patientListRS = SQLOperations.getChartPatients(3, connection);
				}
				if (action == 4) {
					patientListRS = SQLOperations.getChartPatients(4, connection);
				}
				if (action == 5) {
					patientListRS = SQLOperations.getChartPatients(5, connection);
				}
				if (action == 6) {
					patientListRS = SQLOperations.getChartPatients(6, connection);
				}
				if (action == 7) {
					patientListRS = SQLOperations.getChartPatients(7, connection);
				}

				HttpSession session = request.getSession(true);

				AuditBean auditBean = new AuditBean("Dashboard", (String) session.getAttribute("name"), (String) session.getAttribute("name"),
						Integer.parseInt((String) session.getAttribute("accountID")));
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
