package controller.baseline.load;

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

import com.google.gson.Gson;

import model.AuditBean;
import utility.database.SQLOperations;
import utility.database.SQLOperationsBaseline;
import utility.database.Security;

@WebServlet("/LoadErrorHandlingTestServlet")
public class LoadErrorHandlingTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Connection connection;
	
	public void init() throws ServletException {
		connection = SQLOperationsBaseline.getConnection();
		if (connection != null) {
			getServletContext().setAttribute("dbConnection", connection);
			System.out.println("connection is READY.");
		} else {
			System.err.println("connection is NULL.");
		}
	}
	
	public LoadErrorHandlingTestServlet() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		Map<String, String> patientData = new LinkedHashMap<>();
		int patientID = Integer.parseInt(request.getParameter("patientID"));
		patientData.put("patientID", Integer.toString(patientID));
		try {
			if (connection != null) {
				ResultSet patientInfoRS = SQLOperationsBaseline.getPatient(patientID, connection);
				patientInfoRS.first();
				patientData.put("patientIDNumber", patientInfoRS.getString("PatientID"));
				int generalDataID = patientInfoRS.getInt("GeneralDataID");
				ResultSet generalDataRS = SQLOperationsBaseline.getGeneralData(generalDataID, connection);
				generalDataRS.first();
				patientData.put("lastName", generalDataRS.getString("LastNameDec"));
				patientData.put("firstName", generalDataRS.getString("FirstNameDec"));
				patientData.put("middleInitial", generalDataRS.getString("MiddleNameDec"));
				patientData.put("gender", generalDataRS.getString("Gender"));
				patientData.put("dateOfBirth", generalDataRS.getString("DateOfBirthDec"));
				session.setAttribute("patientLastName", generalDataRS.getString("LastNameDec"));
				session.setAttribute("patientFirstName", generalDataRS.getString("FirstNameDec"));
				session.setAttribute("patientMiddleName", generalDataRS.getString("MiddleNameDec"));
				int addressID = generalDataRS.getInt("AddressID");
				ResultSet addressRS = SQLOperationsBaseline.getAddress(addressID, connection);
				addressRS.first();
				String StreetAddress = Security.decrypt(addressRS.getString("StreetAddress"));
				String City = Security.decrypt(addressRS.getString("City"));
				String ZIPCode = Security.decrypt(addressRS.getString("ZIPCode"));
				patientData.put("address", StreetAddress + "," + City + "," + ZIPCode);
				patientData.put("civilStatus", generalDataRS.getString("CivilStatus"));
				patientData.put("dateOfEntry", generalDataRS.getString("DateOfEntryDec"));
				int tissueSpecimenID = generalDataRS.getInt("TissueSpecimenID");
				ResultSet tissueSpecimenRS = SQLOperationsBaseline.getTissueSpecimen(tissueSpecimenID, connection);
				tissueSpecimenRS.first();
				patientData.put("specimenType", tissueSpecimenRS.getString("TissueSpecimenName"));
				int clinicalDataID = patientInfoRS.getInt("ClinicalDataID");
				ResultSet clinicalDataRS = SQLOperationsBaseline.getClinicalData(clinicalDataID, connection);
				clinicalDataRS.first();
				patientData.put("dateOfVisit", clinicalDataRS.getString("DateOfVisitDec"));
				patientData.put("diagnosis", clinicalDataRS.getString("Diagnosis"));
				int classificationID = clinicalDataRS.getInt("ClassificationID");
				ResultSet classificationRS = SQLOperationsBaseline.getClassification(classificationID, connection);
				classificationRS.first();
				if (classificationRS.first() == false) {
					patientData.put("severity", "N/A");
				} else {
					patientData.put("severity", classificationRS.getString("ClassificationName"));
				}
				AuditBean auditBean = new AuditBean("Load Error Test Baseline",
						generalDataRS.getString("LastNameDec") + ", " + generalDataRS.getString("FirstNameDec") + " " + generalDataRS
								.getString("MiddleNameDec"),
						(String) session.getAttribute("name"), Integer.parseInt((String) session.getAttribute("accountID")));
				SQLOperations.addAudit(auditBean, connection);
				//return data to js
				String json = new Gson().toJson(patientData);
				response.getWriter().write(json);
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
