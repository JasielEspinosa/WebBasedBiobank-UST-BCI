package controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.*;
import utility.database.SQLOperations;
import utility.factory.BeanFactory;

@WebServlet("/AddLymphomaBaselineServlet")
public class AddLymphomaBaselineServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Connection connection;

	public void init()
			throws ServletException {
		connection = SQLOperations.getConnection();

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

		getServletContext().log("AddLymphomaBaselineServlet insert test");

		int disease = 4;

		// GENERAL DATA
		String lastName = request.getParameter("lastName");
		String firstName = request.getParameter("firstName");
		String middleInitial = request.getParameter("middleInitial");
		int gender = Integer.parseInt(request.getParameter("gender"));
		String dateOfBirth = request.getParameter("dateOfBirth");
		String address = request.getParameter("address");
		String dateOfEntry = request.getParameter("dateOfEntry");
		String specimenType = request.getParameter("specimenType");

		// CLINICAL DATA
		String dateOfInitialDiagnosis = request.getParameter("dateOfInitialDiagnosis");
		String diagnosis = request.getParameter("diagnosis");
		String stageOfDisease = request.getParameter("stageOfDisease");
		String chiefComplaint = request.getParameter("chiefComplaint");
		String constitutionalSymptoms = request.getParameter("constitutionalSymptoms");
		String otherSymptoms = request.getParameter("otherSymptoms");
		String relationshipToPatient = request.getParameter("relationshipToPatient");
		String otherDiseasesInTheFamily = request.getParameter("otherDiseasesInTheFamily");
		String comorbidities = request.getParameter("comorbidities");
		String genericName = request.getParameter("genericName");
		double dose = Double.parseDouble(request.getParameter("dose"));
		String frequency = request.getParameter("frequency");
		String smokingHistorySpecify = request.getParameter("smokingHistorySpecify");
		String alchoholIntakeSpecify = request.getParameter("alchoholIntakeSpecify");
		String chemicalExposureSpecify = request.getParameter("chemicalExposureSpecify");
		////// Physical Exam
		double height = Double.parseDouble(request.getParameter("height"));
		double weight = Double.parseDouble(request.getParameter("weight"));
		double ecog = Double.parseDouble(request.getParameter("ecog"));
		double presenceOfSplenomegaly = Double.parseDouble(request.getParameter("presenceOfSplenomegaly"));
		double presenceOfHepatomegaly = Double.parseDouble(request.getParameter("presenceOfHepatomegaly"));
		double presenceOfLymphadenopathies = Double.parseDouble(request.getParameter("presenceOfLymphadenopathies"));

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

		
		//wala pang parameters sa JSPs
		double myelocytes = Double.parseDouble(request.getParameter(""));
		double metamyelocytes = Double.parseDouble(request.getParameter(""));
		double blasts = Double.parseDouble(request.getParameter(""));
		double plateletCount = Double.parseDouble(request.getParameter(""));

		////// Other Laboratories
		//wala pang parameters sa JSPs
		double creatinine = Double.parseDouble(request.getParameter(""));
		double uricAcid = Double.parseDouble(request.getParameter(""));
		double na = Double.parseDouble(request.getParameter(""));
		double k = Double.parseDouble(request.getParameter(""));
		//double bilirubin = Double.parseDouble(request.getParameter(""));
		double bilirubinTotal = Double.parseDouble(request.getParameter(""));
		double bilirubinDirect = Double.parseDouble(request.getParameter(""));
		double bilirubinIndirect = Double.parseDouble(request.getParameter(""));
		double sgot = Double.parseDouble(request.getParameter(""));
		double sgpt = Double.parseDouble(request.getParameter(""));
		double microglobulin = Double.parseDouble(request.getParameter(""));
		double hepatitisBTesting = Double.parseDouble(request.getParameter(""));
		double ldh = Double.parseDouble(request.getParameter(""));
		double esr = Double.parseDouble(request.getParameter(""));

		//may duplicate parameters sa JSPs, need revisions

		String hematopathologyDatePerformed = request.getParameter("");
		String hematopathologyDescription = request.getParameter("");
/*		Part hematopathologAttachScannedDocument = request
				.getPart("hematopathologAttachScannedDocument");*/

		String immunohistochemistryOfTissueDatePerformed = request.getParameter("");
		String immunohistochemistryOfTissueDescription = request.getParameter("");
/*		Part immunohistochemistryOfTissueAttachScannedDocument = request
				.getPart("immunohistochemistryOfTissueAttachScannedDocument");*/

		//int imagingStudies = Integer.parseInt(request.getParameter("imagingStudies"));
		String imagingStudiesResult = request.getParameter("");

		String boneMarrowAspirateAndBiopsyOfTissueDatePerformed = request.getParameter("");
		String boneMarrowAspirateAndBiopsyOfTissueDescription = request.getParameter("");
/*		Part boneMarrowAspirateAndBiopsyOfTissueAttachScannedDocument = request
				.getPart("boneMarrowAspirateAndBiopsyOfTissueAttachScannedDocument");*/

		// int flowCytometry = Integer.parseInt(request.getParameter("flowCytometry"));
		String flowCytometryResult = request.getParameter("flowCytometryResult");
		// Part flowCytometryAttachScannedDocument = request.getPart("flowCytometryAttachScannedDocument");

		// TREATMENT / THERAPHY AND RESPONSE
		String modeOfTreatment = request.getParameter("treatment");
		String regimenProtocol = request.getParameter("regimenProtocol");
		String chemotherapyMedications = request.getParameter("chemotherapyMedications");
		int cycleNumber = Integer.parseInt(request.getParameter("cycleNumber"));
		String dateStarted = request.getParameter("dateStarted");
		String complications = request.getParameter("complications");
		String diseaseStatus = request.getParameter("diseaseStatus");

		// INSERT VALUES
		String addressArray[] = address.split(",");

		AddressBean ab = BeanFactory.getAddressBean(addressArray[0], addressArray[1], addressArray[2]);
		if (connection != null) {
			if (SQLOperations.addAddress(ab, connection, disease)) {
				System.out.println("Successful insert AddressBean");
			} else {
				System.out.println("Failed insert AddressBean");
			}
		} else {
			System.out.println("Invalid connection AddressBean");
		}

		TissueSpecimenBean tsb = BeanFactory.getTissueSpecimenBean(specimenType);
		if (connection != null) {
			if (SQLOperations.addTissueSpecimenData(tsb, connection, disease)) {
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
			if (SQLOperations.addGeneralData(gdb, connection, disease)) {
				System.out.println("Successful insert GeneralDataBean");
			} else {
				System.out.println("Failed insert GeneralDataBean");
			}
		} else {
			System.out.println("Invalid connection GeneralDataBean");
		}

		PhysicalExamBean peb = BeanFactory.getPhysicalExamBean(height, weight, ecog, presenceOfSplenomegaly,
				presenceOfHepatomegaly, presenceOfLymphadenopathies, false, false, "", "", otherFindings);
		if (connection != null) {
			if (SQLOperations.addPhysicalExam(peb, connection, disease)) {
				System.out.println("Successful insert PhysicalExamBean");
			} else {
				System.out.println("Failed insert PhysicalExamBean");
			}
		} else {
			System.out.println("Invalid connection PhysicalExamBean");
		}

		ClinicalDataBean cdb = BeanFactory.getClinicalDataBean(dateOfInitialDiagnosis, diagnosis, "", stageOfDisease,
				chiefComplaint, constitutionalSymptoms, otherSymptoms, comorbidities, smokingHistorySpecify,
				alchoholIntakeSpecify, chemicalExposureSpecify, "", "", otherFindings);
		if (connection != null) {
			if (SQLOperations.addClinicalData(cdb, connection, disease)) {
				System.out.println("Successful insert ClinicalDataBean");
			} else {
				System.out.println("Failed insert ClinicalDataBean");
			}
		} else {
			System.out.println("Invalid connection ClinicalDataBean");
		}

		FamilyCancerBean famcb = BeanFactory.getFamilyCancerBean(relationshipToPatient, otherDiseasesInTheFamily);
		if (connection != null) {
			if (SQLOperations.addFamilyCancer(famcb, connection, disease)) {
				System.out.println("Successful insert FamilyCancerBean");
			} else {
				System.out.println("Failed insert FamilyCancerBean");
			}
		} else {
			System.out.println("Invalid connection FamilyCancerBean");
		}

		MedicationsBean mb = BeanFactory.getMedicationsBean(genericName, dose, frequency);
		if (connection != null) {
			if (SQLOperations.addMedications(mb, connection, disease)) {
				System.out.println("Successful insert MedicationsBean");
			} else {
				System.out.println("Failed insert MedicationsBean");
			}
		} else {
			System.out.println("Invalid connection MedicationsBean");
		}

		HematologyBean hb = BeanFactory.getHematologyBean(hemoglobin, hematocrit, whiteBloodCells, neutrophils,
				lymphocytes, monocytes, eosinophils, basophils, myelocytes, metamyelocytes, blasts, plateletCount);
		if (connection != null) {
			if (SQLOperations.addHematology(hb, connection, disease)) {
				System.out.println("Successful insert HematologyBean");
			} else {
				System.out.println("Failed insert HematologyBean");
			}
		} else {
			System.out.println("Invalid connection HematologyBean");
		}

		BloodChemistryBean bcb = BeanFactory.getBloodChemistryBean(0, creatinine, uricAcid, sgot, sgpt, ldh, 0, na, k,
				bilirubinTotal, bilirubinDirect, bilirubinIndirect, microglobulin, hepatitisBTesting, esr, 0, 0, 0, 0,
				0, 0);
		if (connection != null) {
			if (SQLOperations.addBloodChemistry(bcb, connection, disease)) {
				System.out.println("Successful insert BloodChemistryBean");
			} else {
				System.out.println("Failed insert BloodChemistryBean");
			}
		} else {
			System.out.println("Invalid connection BloodChemistryBean");
		}

		BoneMarrowAspirateBean bmab = BeanFactory.getBoneMarrowAspirateBean(
				boneMarrowAspirateAndBiopsyOfTissueDatePerformed, boneMarrowAspirateAndBiopsyOfTissueDescription);
		if (connection != null) {
			if (SQLOperations.addBoneMarrowAspirate(bmab, connection, disease)) {
				System.out.println("Successful insert BoneMarrowAspirateBean");
			} else {
				System.out.println("Failed insert BoneMarrowAspirateBean");
			}
		} else {
			System.out.println("Invalid connection BoneMarrowAspirateBean");
		}

		FlowCytometryBean fcb = BeanFactory.getFlowCytometryBean(flowCytometryResult);
		if (connection != null) {
			if (SQLOperations.addFlowCytometry(fcb, connection, disease)) {
				System.out.println("Successful insert FlowCytometryBean");
			} else {
				System.out.println("Failed insert FlowCytometryBean");
			}
		} else {
			System.out.println("Invalid connection FlowCytometryBean");
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

		HematopathologyBean hpb = BeanFactory.getHematopathologyBean(hematopathologyDatePerformed,
				hematopathologyDescription);
		if (connection != null) {
			if (SQLOperations.addHematopathology(hpb, connection, disease)) {
				System.out.println("Successful insert HematopathologyBean");
			} else {
				System.out.println("Failed insert HematopathologyBean");
			}
		} else {
			System.out.println("Invalid connection HematopathologyBean");
		}

		ImmunohistochemistryBean ihcb = BeanFactory.getImmunohistochemistryBean(
				immunohistochemistryOfTissueDatePerformed, immunohistochemistryOfTissueDescription);
		if (connection != null) {
			if (SQLOperations.addImmunohistochemistry(ihcb, connection, disease)) {
				System.out.println("Successful insert ImmunohistochemistryBean");
			} else {
				System.out.println("Failed insert ImmunohistochemistryBean");
			}
		} else {
			System.out.println("Invalid connection ImmunohistochemistryBean");
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

		ModeOfTreatmentBean motb = BeanFactory.getModeOfTreatmentBean(modeOfTreatment, modeOfTreatment);
		if (connection != null) {
			if (SQLOperations.addModeOfTreatment(motb, connection, disease)) {
				System.out.println("Successful insert ModeOfTreatmentBean");
			} else {
				System.out.println("Failed insert ModeOfTreatmentBean");
			}
		} else {
			System.out.println("Invalid connection ModeOfTreatmentBean");
		}

		ChemotherapyMedicationsBean cmb = BeanFactory.getChemotherapyMedicationsBean(chemotherapyMedications);
		if (connection != null) {
			if (SQLOperations.addChemotherapyMedications(cmb, connection, disease)) {
				System.out.println("Successful insert ChemotherapyMedicationsBean");
			} else {
				System.out.println("Failed insert ChemotherapyMedicationsBean");
			}
		} else {
			System.out.println("Invalid connection ChemotherapyMedicationsBean");
		}

		RegimenBean rb = BeanFactory.getRegimenBean(regimenProtocol);
		if (connection != null) {
			if (SQLOperations.addRegimen(rb, connection, disease)) {
				System.out.println("Successful insert RegimenBean");
			} else {
				System.out.println("Failed insert RegimenBean");
			}
		} else {
			System.out.println("Invalid connection RegimenBean");
		}

		TreatmentBean tb = BeanFactory.getTreatmentBean(true, dateStarted, "", cycleNumber, complications, "");
		if (connection != null) {
			if (SQLOperations.addTreatment(tb, connection, disease)) {
				System.out.println("Successful insert TreatmentBean");
			} else {
				System.out.println("Failed insert TreatmentBean");
			}
		} else {
			System.out.println("Invalid connection TreatmentBean");
		}

		DiseaseStatusBean dsb = BeanFactory.getDiseaseStatusBean(diseaseStatus);
		if (connection != null) {
			if (SQLOperations.addDiseaseStatus(dsb, connection, disease)) {
				System.out.println("Successful insert DiseaseStatusBean");
			} else {
				System.out.println("Failed insert DiseaseStatusBean");
			}
		} else {
			System.out.println("Invalid connection DiseaseStatusBean");
		}

		// ADD PATIENT
		if (connection != null) {
			if (SQLOperations.addPatient(connection, disease)) {
				System.out.println("Successful insert PatientBean");
			} else {
				System.out.println("Failed insert PatientBean");
			}
		} else {
			System.out.println("Invalid connection PatientBean");
		}

	}

}
