package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import model.ArchivedPatientBean;
import model.AuditBean;
import utility.database.SQLOperations;
import utility.database.SQLOperationsBaseline;

@WebServlet("/UnarchivePatientServlet")
public class UnarchivePatientServlet extends HttpServlet {
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

	public UnarchivePatientServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession(true);
		response.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");

		if (action.equals("restore")) {
			int patientID = Integer.parseInt(request.getParameter("patientID"));
			if (connection != null) {
				if (SQLOperations.unarchivePatient(patientID, connection)) {
					System.out.println("Successful delete");
					response.getWriter().write("Success");
				} else {
					System.out.println("Failed delete");
				}
			} else {
				System.out.println("Invalid connection restore patient");
			}
		}

		if (action.equals("load")) {
			System.out.println("test load");
			response.setContentType("application/json");
			List<ArchivedPatientBean> archivedPatientList = new ArrayList<ArchivedPatientBean>();
			if (connection != null) {
				try {
					ResultSet patientsRS = SQLOperations.getArchivedPatientList(connection);
					while (patientsRS.next()) {
						int patientID = patientsRS.getInt("PatientID");
						System.out.println(patientID);
						int generalDataID = patientsRS.getInt("GeneralDataID");

						ResultSet generalDataRS = SQLOperationsBaseline.getGeneralData(generalDataID, connection);
						generalDataRS.first();

						String patientName = generalDataRS.getString("FirstNameDec") + " " + generalDataRS
								.getString("MiddleNameDec") + " " + generalDataRS.getString("LastNameDec");

						ArchivedPatientBean apb = new ArchivedPatientBean(patientID, patientName);
						archivedPatientList.add(apb);

						AuditBean auditBean = new AuditBean("Unarchived patient",
								generalDataRS.getString("LastNameDec") + ", " + generalDataRS
										.getString("FirstNameDec") + " " + generalDataRS.getString("MiddleNameDec"),
								(String) session.getAttribute("name"), Integer.parseInt((String) session.getAttribute("accountID")));
						SQLOperations.addAudit(auditBean, connection);

					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			String json = new Gson().toJson(archivedPatientList);
			response.getWriter().write(json);
		}

	}

}
