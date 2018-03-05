package controller.followup.add;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.*;
import utility.database.SQLOperationsFollowUp;
import utility.factory.BeanFactory;
import utility.values.DefaultValues;

@WebServlet("/AddMyeloFollowUpServlet")
public class AddMyeloFollowUpServlet extends HttpServlet implements DefaultValues {
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
		getServletContext().log("AddMyeloFollowUpServlet insert test");

		int disease = 5;

		int patientID = Integer.parseInt(request.getParameter("patientID"));

		String dateOfEntry = request.getParameter("dateOfEntry");
		String dateOfVisit = request.getParameter("dateOfVisit");

		String hematologicMalignancy = noValue;
		if (Integer.parseInt(request.getParameter("hematologicMalignancy")) == 1) {
			hematologicMalignancy = request.getParameter("specifyHematologicMalignancy");
		}

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

		String boneMarrowAspirateDatePerformed = noValue;
		String boneMarrowAspirateDescription = noValue;
		if (Integer.parseInt(request.getParameter("boneMarrowAspirate")) == 1) {
			boneMarrowAspirateDatePerformed = request.getParameter("boneMarrowAspirateDatePerformed");
			boneMarrowAspirateDescription = request.getParameter("boneMarrowAspirateDescription");
		}

		String diseaseStatus = request.getParameter("diseaseStatus");
		String otherDisease = noValue;
		if (diseaseStatus.equalsIgnoreCase("Others")) {
			otherDisease = request.getParameter("diseaseStatusOthers");
		}

		String notes = request.getParameter("specialNotes");

		MedicalEventsBean meb = BeanFactory.getMedicalEventsBean(hematologicMalignancy, otherDiseaseMedication, "", "", 0.0,
				procedureIntervention, chemotherapyComplication);
		if (connection != null) {
			if (SQLOperationsFollowUp.addMedicalEvents(meb, connection, disease)) {
				System.out.println("Successful insert MedicalEventsBean");
			} else {
				System.out.println("Failed insert MedicalEventsBean");
			}
		} else {
			System.out.println("Invalid connection MedicalEventsBean");
		}

		PhysicalExamBean peb = BeanFactory.getPhysicalExamBean(0.0, weight, ecog, 0.0, 0.0, 0.0, false, false, "", "", pertinentFindings, "");
		if (connection != null) {
			if (SQLOperationsFollowUp.addPhysicalExam(peb, connection, disease)) {
				System.out.println("Successful insert PhysicalExamBean");
			} else {
				System.out.println("Failed insert PhysicalExamBean");
			}
		} else {
			System.out.println("Invalid connection PhysicalExamBean");
		}

		ClinicalDataBean cdb = BeanFactory.getClinicalDataBean(dateOfVisit, "", "", "", "", currentSymptoms, "", "", "", "", "", "", "", "",
				"");
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

		BoneMarrowAspirateBean bmab = BeanFactory.getBoneMarrowAspirateBean(boneMarrowAspirateDatePerformed, boneMarrowAspirateDescription);
		if (connection != null) {
			if (SQLOperationsFollowUp.addBoneMarrowAspirate(bmab, connection, disease)) {
				System.out.println("Successful insert BoneMarrowAspirateBean");
			} else {
				System.out.println("Failed insert BoneMarrowAspirateBean");
			}
		} else {
			System.out.println("Invalid connection BoneMarrowAspirateBean");
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

		DiseaseStatusBean dsb = BeanFactory.getDiseaseStatusBean(diseaseStatus, "", otherDisease);
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

	}
}
