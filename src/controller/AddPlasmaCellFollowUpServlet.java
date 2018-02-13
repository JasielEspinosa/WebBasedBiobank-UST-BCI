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

@WebServlet("/AddPlasmaCellFollowUpServlet")
public class AddPlasmaCellFollowUpServlet extends HttpServlet {
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
		getServletContext().log("AddPlasmaCellFollowUpServlet insert test");

		int disease = 6;

		String dateOfEntry = request.getParameter("dateOfEntry");
		String dateOfVisit = request.getParameter("dateOfVisit");
		String hematologicMalignancy = request.getParameter("specifyHematologicMalignancy");
		String otherDiseaseMedication = request.getParameter("specifyOtherDiseaseMedication");
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
		double myelocytes = Double.parseDouble(request.getParameter("myelocytes"));
		double metamyelocytes = Double.parseDouble(request.getParameter("metamyelocytes"));
		double blasts = Double.parseDouble(request.getParameter("blasts"));
		double plateletCount = Double.parseDouble(request.getParameter("plateletCount"));
		////// Other Laboratories / Blood Chemistry
		double creatinine = Double.parseDouble(request.getParameter("creatinine"));
		double iCa = Double.parseDouble(request.getParameter("iCa"));
		double totalProtein = Double.parseDouble(request.getParameter("totalProtein"));
		double albumin = Double.parseDouble(request.getParameter("albumin"));
		double globulin = Double.parseDouble(request.getParameter("globulin"));
		String imagingStudiesResult = request.getParameter("imagingStudiesResult");
		String boneMarrowAspirateDatePerformed = request.getParameter("boneMarrowAspirateDatePerformed");
		String boneMarrowAspirateDescription = request.getParameter("boneMarrowAspirateDescription");
		String serumFree = request.getParameter("serumFreeLightChainAsssayResult");
		String serumProteinElectrophoresisResult = request.getParameter("serumProteinElectrophoresisResult");
		String serumImmunofixationResult = request.getParameter("serumImmunofixationResult");
		String urineProteinResult = request.getParameter("urineProteinResult");

		String diseaseStatus = request.getParameter("diseaseStatus");
		String relapseDisease = request.getParameter("relapseDisease");
		String otherDisease = request.getParameter("diseaseStatusOthers");
		String notes = request.getParameter("specialNotes");

		MedicalEventsBean meb = BeanFactory.getMedicalEventsBean(hematologicMalignancy, otherDiseaseMedication, "", "",
				0.0, procedureIntervention, chemotherapyComplication);
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
				lymphocytes, monocytes, eosinophils, basophils, myelocytes, metamyelocytes, blasts, plateletCount);
		if (connection != null) {
			if (SQLOperationsFollowUp.addHematology(hb, connection, disease)) {
				System.out.println("Successful insert HematologyBean");
			} else {
				System.out.println("Failed insert HematologyBean");
			}
		} else {
			System.out.println("Invalid connection HematologyBean");
		}

		BloodChemistryBean bcb = BeanFactory.getBloodChemistryBean(0.0, creatinine, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, iCa, totalProtein, albumin, globulin, 0.0, 0.0);
		if (connection != null) {
			if (SQLOperationsFollowUp.addBloodChemistry(bcb, connection, disease)) {
				System.out.println("Successful insert BloodChemistryBean");
			} else {
				System.out.println("Failed insert BloodChemistryBean");
			}
		} else {
			System.out.println("Invalid connection BloodChemistryBean");
		}

		BoneMarrowAspirateBean bmab = BeanFactory.getBoneMarrowAspirateBean(boneMarrowAspirateDatePerformed,
				boneMarrowAspirateDescription);
		if (connection != null) {
			if (SQLOperationsFollowUp.addBoneMarrowAspirate(bmab, connection, disease)) {
				System.out.println("Successful insert BoneMarrowAspirateBean");
			} else {
				System.out.println("Failed insert BoneMarrowAspirateBean");
			}
		} else {
			System.out.println("Invalid connection BoneMarrowAspirateBean");
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

		SerumFreeBean sfb = BeanFactory.getSerumFreeBean(serumFree);
		if (connection != null) {
			if (SQLOperationsFollowUp.addSerumFree(sfb, connection, disease)) {
				System.out.println("Successful insert SerumFreeBean");
			} else {
				System.out.println("Failed insert SerumFreeBean");
			}
		} else {
			System.out.println("Invalid connection SerumFreeBean");
		}

		SerumProteinBean spb = BeanFactory.getSerumProteinBean(serumProteinElectrophoresisResult);
		if (connection != null) {
			if (SQLOperationsFollowUp.addSerumProtein(spb, connection, disease)) {
				System.out.println("Successful insert SerumProteinBean");
			} else {
				System.out.println("Failed insert SerumProteinBean");
			}
		} else {
			System.out.println("Invalid connection SerumProteinBean");
		}

		SerumImmunofixationBean sifb = BeanFactory.getSerumImmunofixationBean(serumImmunofixationResult);
		if (connection != null) {
			if (SQLOperationsFollowUp.addSerumImmunofixation(sifb, connection, disease)) {
				System.out.println("Successful insert SerumImmunofixationBean");
			} else {
				System.out.println("Failed insert SerumImmunofixationBean");
			}
		} else {
			System.out.println("Invalid connection SerumImmunofixationBean");
		}

		UrineProteinBean upb = BeanFactory.getUrineProteinBean(urineProteinResult);
		if (connection != null) {
			if (SQLOperationsFollowUp.addUrineProtein(upb, connection, disease)) {
				System.out.println("Successful insert UrineProteinBean");
			} else {
				System.out.println("Failed insert UrineProteinBean");
			}
		} else {
			System.out.println("Invalid connection UrineProteinBean");
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

		DiseaseStatusBean dsb = BeanFactory.getDiseaseStatusBean(diseaseStatus, relapseDisease, otherDisease);
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
