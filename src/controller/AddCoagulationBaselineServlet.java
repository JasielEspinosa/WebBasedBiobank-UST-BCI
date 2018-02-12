package controller;

import java.io.IOException;
// import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.*;
import utility.database.SQLOperationsBaseline;
import utility.factory.BeanFactory;

@WebServlet("/AddCoagulationBaselineServlet")
public class AddCoagulationBaselineServlet extends HttpServlet {
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

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		getServletContext().log("AddCoagulationBaselineServlet insert test");

		int disease = 2;

		// GENERAL DATA
		String lastName = request.getParameter("lastName");
		String firstName = request.getParameter("firstName");
		String middleInitial = request.getParameter("middleInitial");
		int gender = Integer.parseInt(request.getParameter("gender"));
		String dateOfBirth = request.getParameter("dateOfBirth");
		String address = request.getParameter("address");
		String dateOfEntry = request.getParameter("dateOfEntry");

/*		System.out.println(patientIDNumber);
		System.out.println(lastName);
		System.out.println(firstName);
		System.out.println(middleInitial);
		System.out.println(gender);
		System.out.println(dateOfBirth);
		System.out.println(address);
		System.out.println(dateOfEntry);*/

		// CLINICAL DATA
		String dateOfVisit = request.getParameter("dateOfVisit");
		String diagnosis = request.getParameter("diagnosis");
		String otherDiagnosis = request.getParameter("diagnosisOthers");
		String severity = request.getParameter("severity");
		// int severity = Integer.parseInt(request.getParameter("severity"));
		String chiefComplaint = request.getParameter("chiefComplaint");
		String otherSymptoms = request.getParameter("otherSymptoms");
		String relationshipToPatient = request.getParameter("relationshipToPatient");
		String cancerName = request.getParameter("specifyCancer");
		String otherDiseasesInTheFamily = request.getParameter("otherDiseasesInTheFamily");
		String comorbidities = request.getParameter("comorbidities");
		String genericName = request.getParameter("genericName");
		double dose = Double.parseDouble(request.getParameter("dose"));
		String frequency = request.getParameter("frequency");
		String smokingHistorySpecify = request.getParameter("smokingHistorySpecify");
		String alchoholIntakeHistorySpecify = request.getParameter("alchoholIntakeHistorySpecify");
		String chemicalExposureHistorySpecify = request.getParameter("chemicalExposureSpecify");
		////// Physical Exam
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
		////// Coagulation Testing
		double factorVIIILevel = Double.parseDouble(request.getParameter("factorVIIILevel"));
		double factorIXLevel = Double.parseDouble(request.getParameter("factorIXLevel"));
		double inhibitorAssay = Double.parseDouble(request.getParameter("inhibitorAssay"));
		double bethesdaUnits = Double.parseDouble(request.getParameter("bethesdaUnits"));
		////// Blood Chemistry
		double creatinine = Double.parseDouble(request.getParameter("creatine"));
		double uricAcid = Double.parseDouble(request.getParameter("uricAcid"));
		double na = Double.parseDouble(request.getParameter("na"));
		double k = Double.parseDouble(request.getParameter("k"));
		double sgot = Double.parseDouble(request.getParameter("sgot"));
		double sgpt = Double.parseDouble(request.getParameter("sgpt"));
		double ldh = Double.parseDouble(request.getParameter("ldh"));
		// int imagingStudies =
		// Integer.parseInt(request.getParameter("imagingStudies"));
		String imagingStudiesResult = request.getParameter("imagingStudiesResult");

		// TREATMENT / THERAPHY AND RESPONSE
		String treatment = request.getParameter("treatment");
		String treatmentSpecify = request.getParameter("treatmentSpecify");

		// INSERT VALUES
		String addressArray[] = address.split(",");

		AddressBean ab = BeanFactory.getAddressBean(addressArray[0], addressArray[1], addressArray[2]);
		if (connection != null) {
			if (SQLOperationsBaseline.addAddress(ab, connection, disease)) {
				System.out.println("Successful insert AddressBean");
			} else {
				System.out.println("Failed insert AddressBean");
			}
		} else {
			System.out.println("Invalid connection AddressBean");
		}

		TissueSpecimenBean tsb = BeanFactory.getTissueSpecimenBean("");
		if (connection != null) {
			if (SQLOperationsBaseline.addTissueSpecimenData(tsb, connection, disease)) {
				System.out.println("Successful insert TissueSpecimenBean");
			} else {
				System.out.println("Failed insert TissueSpecimenBean");
			}
		} else {
			System.out.println("Invalid connection TissueSpecimenBean");
		}

		GeneralDataBean gdb = BeanFactory.getGeneralDataBean(lastName, middleInitial, firstName, gender, dateOfBirth,
				dateOfEntry);
		if (connection != null) {
			if (SQLOperationsBaseline.addGeneralData(gdb, connection, disease)) {
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
			if (SQLOperationsBaseline.addPhysicalExam(peb, connection, disease)) {
				System.out.println("Successful insert PhysicalExamBean");
			} else {
				System.out.println("Failed insert PhysicalExamBean");
			}
		} else {
			System.out.println("Invalid connection PhysicalExamBean");
		}

		SeverityBean sb = BeanFactory.getSeverityBean(severity);
		if (connection != null) {
			if (SQLOperationsBaseline.addSeverity(sb, connection, disease)) {
				System.out.println("Successful insert SeverityBean");
			} else {
				System.out.println("Failed insert SeverityBean");
			}
		} else {
			System.out.println("Invalid connection SeverityBean");
		}

		ClinicalDataBean cdb = BeanFactory.getClinicalDataBean(dateOfVisit, diagnosis, otherDiagnosis, "",
				chiefComplaint, "", "", otherSymptoms, comorbidities, smokingHistorySpecify,
				alchoholIntakeHistorySpecify, chemicalExposureHistorySpecify, "", "", otherFindings);
		if (connection != null) {
			if (SQLOperationsBaseline.addClinicalData(cdb, connection, disease)) {
				System.out.println("Successful insert ClinicalDataBean");
			} else {
				System.out.println("Failed insert ClinicalDataBean");
			}
		} else {
			System.out.println("Invalid connection ClinicalDataBean");
		}

		FamilyCancerBean famcb = BeanFactory.getFamilyCancerBean(relationshipToPatient, cancerName);
		if (connection != null) {
			if (SQLOperationsBaseline.addFamilyCancer(famcb, connection, disease)) {
				System.out.println("Successful insert FamilyCancerBean");
			} else {
				System.out.println("Failed insert FamilyCancerBean");
			}
		} else {
			System.out.println("Invalid connection FamilyCancerBean");
		}

		OtherDiseasesBean odb = BeanFactory.getOtherDiseasesBean(otherDiseasesInTheFamily);
		if (connection != null) {
			if (SQLOperationsBaseline.addOtherDiseases(odb, connection, disease)) {
				System.out.println("Successful insert OtherDiseasesBean");
			} else {
				System.out.println("Failed insert OtherDiseasesBean");
			}
		} else {
			System.out.println("Invalid connection OtherDiseasesBean");
		}

		MedicationsBean mb = BeanFactory.getMedicationsBean(genericName, dose, frequency);
		if (connection != null) {
			if (SQLOperationsBaseline.addMedications(mb, connection, disease)) {
				System.out.println("Successful insert MedicationsBean");
			} else {
				System.out.println("Failed insert MedicationsBean");
			}
		} else {
			System.out.println("Invalid connection MedicationsBean");
		}

		HematologyBean hb = BeanFactory.getHematologyBean(hemoglobin, hematocrit, whiteBloodCells, neutrophils,
				lymphocytes, monocytes, eosinophils, basophils, 0, 0, 0, plateletCount);
		if (connection != null) {
			if (SQLOperationsBaseline.addHematology(hb, connection, disease)) {
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
			if (SQLOperationsBaseline.addCoagulationTesting(ctb, connection, disease)) {
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
			if (SQLOperationsBaseline.addBloodChemistry(bcb, connection, disease)) {
				System.out.println("Successful insert BloodChemistryBean");
			} else {
				System.out.println("Failed insert BloodChemistryBean");
			}
		} else {
			System.out.println("Invalid connection BloodChemistryBean");
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

		ModeOfTreatmentBean motb = BeanFactory.getModeOfTreatmentBean(treatment, treatmentSpecify);
		if (connection != null) {
			if (SQLOperationsBaseline.addModeOfTreatment(motb, connection, disease)) {
				System.out.println("Successful insert ModeOfTreatmentBean");
			} else {
				System.out.println("Failed insert ModeOfTreatmentBean");
			}
		} else {
			System.out.println("Invalid connection ModeOfTreatmentBean");
		}

		TreatmentBean tb = BeanFactory.getTreatmentBean(true, "", "", "", "", "", 0, "", "");
		if (connection != null) {
			if (SQLOperationsBaseline.addTreatment(tb, connection, disease)) {
				System.out.println("Successful insert TreatmentBean");
			} else {
				System.out.println("Failed insert TreatmentBean");
			}
		} else {
			System.out.println("Invalid connection TreatmentBean");
		}

		DiseaseStatusBean dsb = BeanFactory.getDiseaseStatusBean("", "", "");
		if (connection != null) {
			if (SQLOperationsBaseline.addDiseaseStatus(dsb, connection, disease)) {
				System.out.println("Successful insert DiseaseStatusBean");
			} else {
				System.out.println("Failed insert DiseaseStatusBean");
			}
		} else {
			System.out.println("Invalid connection DiseaseStatusBean");
		}

		// ADD PATIENT
		if (connection != null) {
			if (SQLOperationsBaseline.addPatient(connection, disease)) {
				System.out.println("Successful insert AddPatient");
			} else {
				System.out.println("Failed insert AddPatient");
			}
		} else {
			System.out.println("Invalid connection AddPatient");
		}
	}

}
