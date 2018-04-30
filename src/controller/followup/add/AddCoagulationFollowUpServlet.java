package controller.followup.add;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.*;
import utility.database.SQLOperations;
import utility.database.SQLOperationsBaseline;
import utility.database.SQLOperationsFollowUp;
import utility.factory.BeanFactory;
import utility.values.DefaultValues;

@WebServlet("/AddCoagulationFollowUpServlet")
public class AddCoagulationFollowUpServlet extends HttpServlet implements DefaultValues {
	private static final long serialVersionUID = 1L;
	
	private Connection connection;
	
	public void init() throws ServletException {
		connection = SQLOperationsFollowUp.getConnection();
		if (connection != null) {
			getServletContext().setAttribute("dbConnection", connection);
			System.out.println("connection is READY.");
		} else {
			System.err.println("connection is NULL.");
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().log("AddCoagulationFollowUpServlet insert test");
		try {
			int disease = 2;
			int patientID = Integer.parseInt(request.getParameter("patientID"));
			String dateOfEntry = request.getParameter("dateOfEntry");
			String dateOfVisit = request.getParameter("dateOfVisit");
			String factorConcentrate = noValue;
			String factorConcentrateDates = noValue;
			Double factorConcentrateDose = 0.0;
			if (Integer.parseInt(request.getParameter("factorConcentrate")) == 1) {
				factorConcentrate = request.getParameter("specifyReasonFactorConcentrate");
				factorConcentrateDates = request.getParameter("datesOfAdministrationFactorConcentrate");
				factorConcentrateDose = Double.parseDouble(request.getParameter("doseOfFactorConcentrate"));
			}
			String procedureIntervention = noValue;
			if (Integer.parseInt(request.getParameter("procedure")) == 1) {
				procedureIntervention = request.getParameter("specifyProcedure");
			}
			String notes = request.getParameter("specialNotes");
			MedicalEventsBean meb = BeanFactory.getMedicalEventsBean("", "", factorConcentrate, factorConcentrateDates,
					factorConcentrateDose, procedureIntervention, "");
			if (connection != null) {
				if (SQLOperationsFollowUp.addMedicalEvents(meb, connection, disease)) {
					System.out.println("Successful insert MedicalEventsBean");
				} else {
					System.out.println("Failed insert MedicalEventsBean");
				}
			} else {
				System.out.println("Invalid connection MedicalEventsBean");
			}
			DiseaseStatusBean dsb = BeanFactory.getDiseaseStatusBean("Stable Disease", "", "");
			if (connection != null) {
				if (SQLOperationsFollowUp.addDiseaseStatus(dsb, connection, disease)) {
					System.out.println("Successful insert DiseaseStatusBean");
				} else {
					System.out.println("Failed insert DiseaseStatusBean");
				}
			} else {
				System.out.println("Invalid connection DiseaseStatusBean");
			}
			FollowUpBean fub = BeanFactory.getFollowUpBean(patientID, dateOfEntry, dateOfVisit, notes);
			if (connection != null) {
				if (SQLOperationsFollowUp.addFollowUp(fub, connection, disease)) {
					System.out.println("Successful insert FollowUpBean");
				} else {
					System.out.println("Failed insert FollowUpBean");
				}
			} else {
				System.out.println("Invalid connection FollowUpBean");
			}
			//int patientID = Integer.parseInt(request.getParameter("patientID"));
			ResultSet patientInfoRS = SQLOperationsBaseline.getPatient(patientID, connection);
			patientInfoRS.first();
			int generalDataID = patientInfoRS.getInt("GeneralDataID");
			ResultSet generalDataRS = SQLOperationsBaseline.getGeneralData(generalDataID, connection);
			generalDataRS.first();
			HttpSession session = request.getSession(true);
			AuditBean auditBean = new AuditBean("Add Follow Up patient in Coagulation Disorder",
					(String) session.getAttribute("patientLastName") + ", " + session.getAttribute("patientFirstName") + " " + session
							.getAttribute("patientMiddleName"),
					(String) session.getAttribute("name"), Integer.parseInt((String) session.getAttribute("accountID")));
			SQLOperations.addAudit(auditBean, connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
