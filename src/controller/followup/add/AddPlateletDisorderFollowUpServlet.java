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

@WebServlet("/AddPlateletFollowUpServlet")
public class AddPlateletDisorderFollowUpServlet extends HttpServlet implements DefaultValues {
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
		getServletContext().log("AddPlateletCellFollowUpServlet insert test");
		try {
			int disease = 6;
			int patientID = Integer.parseInt(request.getParameter("patientID"));
			String dateOfEntry = request.getParameter("dateOfEntry");
			String dateOfVisit = request.getParameter("dateOfVisit");
			String otherDiseaseMedication = noValue;
			if (Integer.parseInt(request.getParameter("otherDiseaseMedication")) == 1) {
				otherDiseaseMedication = request.getParameter("specifyOtherDiseaseMedication");
			}
			String procedureIntervention = noValue;
			if (Integer.parseInt(request.getParameter("procedure")) == 1) {
				procedureIntervention = request.getParameter("specifyProcedure");
			}
			String chemotherapyComplication = noValue;
			if (Integer.parseInt(request.getParameter("chemotherapy")) == 1) {
				chemotherapyComplication = request.getParameter("specifyChemotherapy");
			}
			// CLINICAL
			String currentSymptoms = request.getParameter("currentSymptoms");
			double weight = Double.parseDouble(request.getParameter("weight"));
			double ecog = Double.parseDouble(request.getParameter("ecog"));
			boolean pertinentFindings = false;
			if (Integer.parseInt(request.getParameter("pertinentFindings")) == 1) {
				pertinentFindings = true;
				System.out.println("Pertinent Findings: " + pertinentFindings);
			} else if (Integer.parseInt(request.getParameter("pertinentFindings")) == 0) {
				pertinentFindings = false;
				System.out.println("Pertinent Findings: " + pertinentFindings);
			}
			// LABORATORY
			String dateOfBloodCollection = request.getParameter("dateOfBloodCollection");
			////// Hematology
			double hemoglobin = Double.parseDouble(request.getParameter("hemoglobin"));
			double hematocrit = Double.parseDouble(request.getParameter("hematocrit"));
			double whiteBloodCells = Double.parseDouble(request.getParameter("whiteBloodCells"));
			double neutrophils = Double.parseDouble(request.getParameter("neutrophils"));
			double lymphocytes = Double.parseDouble(request.getParameter("lymphocytes"));
			double monocytes = Double.parseDouble(request.getParameter("monocytes"));
			double eosinophils = Double.parseDouble(request.getParameter("eosinophils"));
			double basophils = Double.parseDouble(request.getParameter("basophils"));
			double myelocytes = Double.parseDouble(request.getParameter("myelocytes"));
			double metamyelocytes = Double.parseDouble(request.getParameter("metamyelocytes"));
			double blasts = Double.parseDouble(request.getParameter("blasts"));
			double plateletCount = Double.parseDouble(request.getParameter("plateletCount"));
			String imagingStudiesResult = request.getParameter("imagingStudiesResult");
			String qualityOfResponse = request.getParameter("qualityOfResponse");
			String otherDisease = noValue;
			if (qualityOfResponse.equalsIgnoreCase("Others")) {
				otherDisease = request.getParameter("diseaseStatusOthers");
			}
			if (qualityOfResponse.contains("&#40;") || qualityOfResponse.contains("&#41;")) {
				qualityOfResponse = qualityOfResponse.replaceAll("&#40;", "(");
				qualityOfResponse = qualityOfResponse.replaceAll("&#41;", ")");
			}
			if (otherDisease.contains("&#40;") || otherDisease.contains("&#41;")) {
				otherDisease = otherDisease.replaceAll("&#40;", "(");
				otherDisease = otherDisease.replaceAll("&#41;", ")");
			}
			String notes = request.getParameter("specialNotes");
			MedicalEventsBean meb = BeanFactory.getMedicalEventsBean("", otherDiseaseMedication, "", "", 0.0, procedureIntervention,
					chemotherapyComplication);
			if (connection != null) {
				if (SQLOperationsFollowUp.addMedicalEvents(meb, connection, disease)) {
					System.out.println("Successful insert MedicalEventsBean");
				} else {
					System.out.println("Failed insert MedicalEventsBean");
				}
			} else {
				System.out.println("Invalid connection MedicalEventsBean");
			}
			PhysicalExamBean peb = BeanFactory.getPhysicalExamBean(0.0, weight, ecog, 0.0, 0.0, 0.0, false, false, "", "",
					pertinentFindings, "");
			if (connection != null) {
				if (SQLOperationsFollowUp.addPhysicalExam(peb, connection, disease)) {
					System.out.println("Successful insert PhysicalExamBean");
				} else {
					System.out.println("Failed insert PhysicalExamBean");
				}
			} else {
				System.out.println("Invalid connection PhysicalExamBean");
			}
			ClinicalDataBean cdb = BeanFactory.getClinicalDataBean(dateOfVisit, "", "", "", "", currentSymptoms, "", "", "", "", "", "", "",
					"", "");
			if (connection != null) {
				if (SQLOperationsFollowUp.addClinicalData(cdb, connection, disease)) {
					System.out.println("Successful insert ClinicalDataBean");
				} else {
					System.out.println("Failed insert ClinicalDataBean");
				}
			} else {
				System.out.println("Invalid connection ClinicalDataBean");
			}
			HematologyBean hb = BeanFactory.getHematologyBean(hemoglobin, hematocrit, whiteBloodCells, neutrophils, lymphocytes, monocytes,
					eosinophils, basophils, myelocytes, metamyelocytes, blasts, plateletCount);
			if (connection != null) {
				if (SQLOperationsFollowUp.addHematology(hb, connection, disease)) {
					System.out.println("Successful insert HematologyBean");
				} else {
					System.out.println("Failed insert HematologyBean");
				}
			} else {
				System.out.println("Invalid connection HematologyBean");
			}
			ImagingStudiesBean isb = BeanFactory.getImagingStudiesBean(imagingStudiesResult.getBytes());
			if (connection != null) {
				if (SQLOperationsFollowUp.addImagingStudies(isb, connection, disease)) {
					System.out.println("Successful insert ImagingStudiesBean");
				} else {
					System.out.println("Failed insert ImagingStudiesBean");
				}
			} else {
				System.out.println("Invalid connection ImagingStudiesBean");
			}
			LaboratoryProfileBean lpb = BeanFactory.getLaboratoryProfileBean(dateOfBloodCollection, "");
			if (connection != null) {
				if (SQLOperationsFollowUp.addLaboratoryProfile(lpb, connection, disease)) {
					System.out.println("Successful insert LaboratoryProfileBean");
				} else {
					System.out.println("Failed insert LaboratoryProfileBean");
				}
			} else {
				System.out.println("Invalid connection LaboratoryProfileBean");
			}
			DiseaseStatusBean dsb = BeanFactory.getDiseaseStatusBean(qualityOfResponse, "", otherDisease);
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
			AuditBean auditBean = new AuditBean("Add Follow Up patient in Platelet Disorder",
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
