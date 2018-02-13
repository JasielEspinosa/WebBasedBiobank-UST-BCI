package controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.*;
import utility.database.SQLOperationsBaseline;
import utility.database.SQLOperationsFollowUp;
import utility.factory.BeanFactory;

@WebServlet("/AddPlateletCellFollowUpServlet")
public class AddPlateletCellFollowUpServlet extends HttpServlet {
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

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		getServletContext().log("AddPlateletCellFollowUpServlet insert test");

		int disease = 6;

		String dateOfEntry = request.getParameter("dateOfEntry");
		String dateOfVisit = request.getParameter("dateOfVisit");
		String hematologicMalignancy = request.getParameter("specifyHematologicMalignancy");
		String procedureIntervention = request.getParameter("specifyProcedure");
		String chemotherapyComplication = request.getParameter("specifyChemotherapy");

		// CLINICAL
		String currentSymptoms = request.getParameter("currentSymptoms");
		double weight = Double.parseDouble(request.getParameter("weight"));
		double ecog = Double.parseDouble(request.getParameter("ecog"));

		// pertinent findings (not yet added in table), boolean or int?

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
		double plateletCount = Double.parseDouble(request.getParameter("plateletCount"));
		String imagingStudiesResult = request.getParameter("imagingStudiesResult");

		String diseaseStatus = request.getParameter("diseaseStatus");
		String otherDiseaseStatus = request.getParameter("diseaseStatusOthers");
		String notes = request.getParameter("specialNotes");

		MedicalEventsBean meb = BeanFactory.getMedicalEventsBean(hematologicMalignancy, "", "", "", 0.0,
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

		PhysicalExamBean peb = BeanFactory.getPhysicalExamBean(0.0, weight, ecog, 0.0, 0.0, 0.0, false, false, "", "",
				"");
		if (connection != null) {
			if (SQLOperationsFollowUp.addPhysicalExam(peb, connection, disease)) {
				System.out.println("Successful insert PhysicalExamBean");
			} else {
				System.out.println("Failed insert PhysicalExamBean");
			}
		} else {
			System.out.println("Invalid connection PhysicalExamBean");
		}

		ClinicalDataBean cdb = BeanFactory.getClinicalDataBean(dateOfVisit, "", "", "", "", currentSymptoms, "", "", "",
				"", "", "", "", "", "");
		if (connection != null) {
			if (SQLOperationsFollowUp.addClinicalData(cdb, connection, disease)) {
				System.out.println("Successful insert ClinicalDataBean");
			} else {
				System.out.println("Failed insert ClinicalDataBean");
			}
		} else {
			System.out.println("Invalid connection ClinicalDataBean");
		}

		HematologyBean hb = BeanFactory.getHematologyBean(hemoglobin, hematocrit, whiteBloodCells, neutrophils,
				lymphocytes, monocytes, eosinophils, basophils, 0.0, 0.0, 0.0, plateletCount);
		if (connection != null) {
			if (SQLOperationsBaseline.addHematology(hb, connection, disease)) {
				System.out.println("Successful insert HematologyBean");
			} else {
				System.out.println("Failed insert HematologyBean");
			}
		} else {
			System.out.println("Invalid connection HematologyBean");
		}

		ImagingStudiesBean isb = BeanFactory.getImagingStudiesBean(imagingStudiesResult.getBytes());
		if (connection != null) {
			if (SQLOperationsBaseline.addImagingStudies(isb, connection, disease)) {
				System.out.println("Successful insert ImagingStudiesBean");
			} else {
				System.out.println("Failed insert ImagingStudiesBean");
			}
		} else {
			System.out.println("Invalid connection ImagingStudiesBean");
		}

		LaboratoryProfileBean lpb = BeanFactory.getLaboratoryProfileBean(dateOfBloodCollection, "");
		if (connection != null) {
			if (SQLOperationsBaseline.addLaboratoryProfile(lpb, connection, disease)) {
				System.out.println("Successful insert LaboratoryProfileBean");
			} else {
				System.out.println("Failed insert LaboratoryProfileBean");
			}
		} else {
			System.out.println("Invalid connection LaboratoryProfileBean");
		}

		DiseaseStatusBean dsb = BeanFactory.getDiseaseStatusBean(diseaseStatus, "", otherDiseaseStatus);
		if (connection != null) {
			if (SQLOperationsFollowUp.addDiseaseStatus(dsb, connection, disease)) {
				System.out.println("Successful insert DiseaseStatusBean");
			} else {
				System.out.println("Failed insert DiseaseStatusBean");
			}
		} else {
			System.out.println("Invalid connection DiseaseStatusBean");
		}

		FollowUpBean fub = BeanFactory.getFollowUpBean(dateOfEntry, dateOfVisit, notes);
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
