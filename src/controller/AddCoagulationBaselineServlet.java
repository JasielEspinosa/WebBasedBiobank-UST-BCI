package controller;

import java.io.IOException;
//import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.*;
import utility.database.SQLOperations;
import utility.factory.BeanFactory;

@WebServlet("/AddCoagulationBaselineServlet")
public class AddCoagulationBaselineServlet extends HttpServlet {
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

	protected void doGet(
			HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(
			HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		//
		
		int disease = 2;

		// GENERAL DATA
		int patientIDNumber = Integer.parseInt(request.getParameter("patientIDNumber"));
		String lastName = request.getParameter("lastName");
		String firstName = request.getParameter("firstName");
		String middleInitial = request.getParameter("middleInitial");
		int gender = Integer.parseInt(request.getParameter("gender"));
		String dateOfBirth = request.getParameter("dateOfBirth");
		String address = request.getParameter("address");
		String dateOfEntry = request.getParameter("dateOfEntry");

		System.out.println(patientIDNumber);
		System.out.println(lastName);
		System.out.println(firstName);
		System.out.println(middleInitial);
		System.out.println(gender);
		System.out.println(dateOfBirth);
		System.out.println(address);
		System.out.println(dateOfEntry);

		// CLINICAL DATA
		String dateOfVisit = request.getParameter("dateOfVisit");
		String diagnosis = request.getParameter("diagnosis");

		// String diagnosisOthers = request.getParameter("diagnosisOthers");

		String severity = request.getParameter("severity");
		//int severity = Integer.parseInt(request.getParameter("severity"));
		

		String chiefComplaint = request.getParameter("chiefComplaint");
		String otherSymptoms = request.getParameter("otherSymptoms");

		// String familyHistoryOfBleedingDiathesis =
		// request.getParameter("familyHistoryOfBleedingDiathesis");
		// String relationshipToPatient =
		// request.getParameter("relationshipToPatient");
		// String otherDiseasesInTheFamily =
		// request.getParameter("otherDiseasesInTheFamily");

		String comorbidities = request.getParameter("comorbidities");

		// int concomitantMedications =
		// Integer.parseInt(request.getParameter("concomitantMedications"));
		// String genericName = request.getParameter("genericName");
		// double dose = Double.parseDouble(request.getParameter("dose"));
		// String frequency = request.getParameter("frequecy");
		// String smokingHistory = request.getParameter("smokingHistory");

		String smokingHistorySpecify = request.getParameter("smokingHistorySpecify");

		// String alchoholIntakeHistory =
		// request.getParameter("alchoholIntakeHistory");

		String alchoholIntakeHistorySpecify = request.getParameter("alchoholIntakeHistorySpecify");

		// String chemicalExposureHistory =
		// request.getParameter("chemicalExposureHistory");

		String chemicalExposureHistorySpecify = request.getParameter("chemicalExposureSpecify");

		// Physical Exam
		double height = Double.parseDouble(request.getParameter("height"));
		double weight = Double.parseDouble(request.getParameter("weight"));
		boolean presenceOfHemarthroses;
		if (Integer.parseInt(request.getParameter("presenceOfHemarthroses")) != 0) {
			presenceOfHemarthroses = true;
		} else {
			presenceOfHemarthroses = false;
		}
		boolean presenceOfContracturesAndMuscleAtrophy;
		if (Integer.parseInt(request.getParameter("presenceOfContracturesAndMuscleAtrophy")) != 0) {
			presenceOfContracturesAndMuscleAtrophy = true;
		} else {
			presenceOfContracturesAndMuscleAtrophy = false;
		}
		String otherFindings = request.getParameter("otherFindings");

		// LABORATORY
		String dateOfBloodCollection = request.getParameter("dateOfBloodCollection");

		// Hematology
		double hemoglobin = Double.parseDouble(request.getParameter("hemoglobin"));
		double hematocrit = Double.parseDouble(request.getParameter("hematocrit"));
		double whiteBloodCells = Double.parseDouble(request.getParameter("whiteBloodCells"));
		double neutrophils = Double.parseDouble(request.getParameter("neutrophils"));
		double lymphocytes = Double.parseDouble(request.getParameter("lymphocytes"));
		double monocytes = Double.parseDouble(request.getParameter("monocytes"));
		double eosinophils = Double.parseDouble(request.getParameter("eosinophils"));
		double basophils = Double.parseDouble(request.getParameter("basophils"));
		double plateletCount = Double.parseDouble(request.getParameter("plateletCount"));

		// Coagulation
		double factorVIIILevel = Double.parseDouble(request.getParameter("factorVIIILevel"));
		double factorIXLevel = Double.parseDouble(request.getParameter("factorIXLevel"));
		double inhibitorAssay = Double.parseDouble(request.getParameter("inhibitorAssay"));
		double bethesdaUnits = Double.parseDouble(request.getParameter("bethesdaUnits"));
		double creatinine = Double.parseDouble(request.getParameter("creatine"));
		double uricAcid = Double.parseDouble(request.getParameter("uricAcid"));
		double na = Double.parseDouble(request.getParameter("na"));
		double k = Double.parseDouble(request.getParameter("k"));
		double sgot = Double.parseDouble(request.getParameter("sgot"));
		double sgpt = Double.parseDouble(request.getParameter("sgpt"));
		double ldh = Double.parseDouble(request.getParameter("ldh"));

		// Imaging Studies
		String imagingStudiesResult = request.getParameter("imagingStudiesResult");

		// Treatment
		int treatment = Integer.parseInt(request.getParameter("treatment"));
		//String treatmentSpecify = request.getParameter("treatmentSpecify");

		// INSERT VALUES
		String addressArray[] = address.split(",");

		AddressBean ab = BeanFactory.getAddressBean(addressArray[0], addressArray[1], addressArray[2]);
		if (connection != null) {
			if (SQLOperations.addAddress(ab, connection)) {
				System.out.println("Successful insert AddressBean");
			} else {
				System.out.println("Failed insert AddressBean");
			}
		} else {
			System.out.println("Invalid connection AddressBean");
		}

		GeneralDataBean gdb = BeanFactory.getGeneralDataBean(lastName, middleInitial, firstName, gender, dateOfBirth,
				dateOfEntry);
		if (connection != null) {
			if (SQLOperations.addGeneralData(gdb, connection, disease)) {
				System.out.println("Successful insert GeneralDataBean");
			} else {
				System.out.println("Failed insert GeneralDataBean");
			}
		} else {
			System.out.println("Invalid connection GeneralDataBean");
		}

		PhysicalExamBean peb = BeanFactory.getPhysicalExamBean(height, weight, 0.0, 0.0, 0.0, 0.0,
				presenceOfHemarthroses, presenceOfContracturesAndMuscleAtrophy, "", "", otherFindings);
		if (connection != null) {
			if (SQLOperations.addPhysicalExam(peb, connection, disease)) {
				System.out.println("Successful insert PhysicalExamBean");
			} else {
				System.out.println("Failed insert PhysicalExamBean");
			}
		} else {
			System.out.println("Invalid connection PhysicalExamBean");
		}	
		
		SeverityBean sb = BeanFactory.getSeverityBean(severity);
		if (connection != null) {
			if (SQLOperations.addSeverity(sb, connection)){
				System.out.println("Successful insert DiseaseStatusBean");
			} else {
				System.out.println("Failed insert DiseaseStatusBean");
			}
		} else {
			System.out.println("Invalid connection DiseaseStatusBean");
		}

		ClinicalDataBean cdb = BeanFactory.getClinicalDataBean(dateOfVisit, diagnosis, "", chiefComplaint, "",
				otherSymptoms, comorbidities, smokingHistorySpecify, alchoholIntakeHistorySpecify,
				chemicalExposureHistorySpecify, "", "", otherFindings);
		if (connection != null) {
			if (SQLOperations.addClinicalData(cdb, connection, disease)) {
				System.out.println("Successful insert ClinicalDataBean");
			} else {
				System.out.println("Failed insert ClinicalDataBean");
			}
		} else {
			System.out.println("Invalid connection ClinicalDataBean");
		}

		HematologyBean hb = BeanFactory.getHematologyBean(hemoglobin, hematocrit, whiteBloodCells, neutrophils,
				lymphocytes, monocytes, eosinophils, basophils, 0, 0, 0, plateletCount);
		if (connection != null) {
			if (SQLOperations.addHematology(hb, connection, disease)) {
				System.out.println("Successful insert HematologyBean");
			} else {
				System.out.println("Failed insert HematologyBean");
			}
		} else {
			System.out.println("Invalid connection HematologyBean");
		}

		CoagulationTestingBean ctb = BeanFactory.getCoagulationTestingBean(factorVIIILevel, factorIXLevel,
				inhibitorAssay, bethesdaUnits);
		if (connection != null) {
			if (SQLOperations.addCoagulationTesting(ctb, connection, disease)) {
				System.out.println("Successful insert CoagulationTestingBean");
			} else {
				System.out.println("Failed insert CoagulationTestingBean");
			}
		} else {
			System.out.println("Invalid connection CoagulationTestingBean");
		}

		BloodChemistryBean bcb = BeanFactory.getBloodChemistryBean(0, creatinine, uricAcid, sgot, sgpt, ldh, 0, na, k,
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		if (connection != null) {
			if (SQLOperations.addBloodChemistry(bcb, connection, disease)) {
				System.out.println("Successful insert BloodChemistryBean");
			} else {
				System.out.println("Failed insert BloodChemistryBean");
			}
		} else {
			System.out.println("Invalid connection BloodChemistryBean");
		}

		ImagingStudiesBean isb = BeanFactory.getImagingStudiesBean(imagingStudiesResult.getBytes());
		if (connection != null) {
			if (SQLOperations.addImagingStudies(isb, connection, disease)) {
				System.out.println("Successful insert ImagingStudiesBean");
			} else {
				System.out.println("Failed insert ImagingStudiesBean");
			}
		} else {
			System.out.println("Invalid connection ImagingStudiesBean");
		}

		LaboratoryProfileBean lpb = BeanFactory.getLaboratoryProfileBean(dateOfBloodCollection);
		if (connection != null) {
			if (SQLOperations.addLaboratoryProfile(lpb, connection, disease)) {
				System.out.println("Successful insert LaboratoryProfileBean");
			} else {
				System.out.println("Failed insert LaboratoryProfileBean");
			}
		} else {
			System.out.println("Invalid connection LaboratoryProfileBean");
		}

		// [treatment] int is the cycle number for mode of treatment
		// "Specify" of treatment not in use; not existed in SQL and
		// BeanFactory
		TreatmentBean tb = BeanFactory.getTreatmentBean(true, "", "", treatment, "", "");
		if (connection != null) {
			if (SQLOperations.addTreatment(tb, connection, disease)) {
				System.out.println("Successful insert TreatmentBean");
			} else {
				System.out.println("Failed insert TreatmentBean");
			}
		} else {
			System.out.println("Invalid connection TreatmentBean");
		}

		// ADD PATIENT
		if (connection != null) {
			if (SQLOperations.addPatient(connection, disease)) {
				System.out.println("Successful insert AddPatient");
			} else {
				System.out.println("Failed insert AddPatient");
			}
		} else {
			System.out.println("Invalid connection AddPatient");
		}
	}

}
