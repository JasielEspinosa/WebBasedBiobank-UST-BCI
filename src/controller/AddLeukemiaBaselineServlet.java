package controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.Part;

import model.*;
import utility.database.SQLOperations;
import utility.factory.BeanFactory;

@WebServlet("/AddLeukemiaBaselineServlet")
public class AddLeukemiaBaselineServlet extends HttpServlet {
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(
			HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		//

		int disease = 3;

		// GENERAL DATA
		int patientIDNumber = Integer.parseInt(request.getParameter("patientIDNumber"));
		String lastName = request.getParameter("lastName");
		String firstName = request.getParameter("firstName");
		String middleInitial = request.getParameter("middleInitial");
		int gender = Integer.parseInt(request.getParameter("gender"));
		String dateOfBirth = request.getParameter("dateOfBirth");
		String address = request.getParameter("address");
		String dateOfEntry = request.getParameter("dateOfEntry");
		
		int tissueSpecimentCollected = Integer.parseInt(request.getParameter("tissueSpecimenCollected"));

		String specimenType = request.getParameter("specimenType");
		// int specimenType =
		// Integer.parseInt(request.getParameter("specimenType"));

		System.out.println(patientIDNumber);
		System.out.println(lastName);
		System.out.println(firstName);
		System.out.println(middleInitial);
		System.out.println(gender);
		System.out.println(dateOfBirth);
		System.out.println(address);
		System.out.println(dateOfEntry);
		System.out.println(specimenType);

		// CLINICAL DATA
		String dateOfInitialDiagnosis = request.getParameter("dateOfInitialDiagnosis");
		// String dateOfVisit = request.getParameter("dateOfVisit");
		String diagnosis = request.getParameter("diagnosis");
		// String diagnosisOthers = request.getParameter("diagnosisOthers");
		
		String severity = request.getParameter("severity");
		//int severity = Integer.parseInt(request.getParameter("severity"));
		
		String chiefComplaint = request.getParameter("chiefComplaint");
		String constitutionalSymptoms = request.getParameter("constitutionalSymptoms");
		String otherSymptoms = request.getParameter("otherSymptoms");
		
		String familyHistoryOfCancer = request.getParameter("familyHistoryOfCancer");
		String relationshipToPatient = request.getParameter("relationshipToPatient");
		String otherDiseasesInTheFamily = request.getParameter("otherDiseasesInTheFamily");
		
		String comorbidities = request.getParameter("comorbidities");
		
		int concomitantMedications = Integer.parseInt(request.getParameter("concomitantMedications"));
		String genericName = request.getParameter("genericName");
		double dose = Double.parseDouble(request.getParameter("dose"));
		String frequency = request.getParameter("frequecy");
		String smokingHistory = request.getParameter("smokingHistory");
		
		String smokingHistorySpecify = request.getParameter("smokingHistorySpecify");
		String alchoholIntakeHistory = request.getParameter("alchoholIntakeHistory");
		
		String alchoholIntakeHistorySpecify = request.getParameter("alchoholIntakeSpecify");
		String chemicalExposureHistory = request.getParameter("chemicalExposureHistory");
		
		String chemicalExposureHistorySpecify = request.getParameter("chemicalExposureSpecify");
		// String previousInfection =
		// request.getParameter("previousInfection");
		// String previousInfectionSpecify =
		// request.getParameter("previousInfection");
		// String previousHematologicDisorder =
		// request.getParameter("previousHematologicDisorder");
		// String previousHematologicDisorderSpecify =
		// request.getParameter("previousHematologicDisorderSpecify");

		// Physical Exam
		double height = Double.parseDouble(request.getParameter("height"));
		double weight = Double.parseDouble(request.getParameter("weight"));
		double ecog = Double.parseDouble(request.getParameter("ecog"));
		int presenceOfSplenomegaly = Integer.parseInt(request.getParameter("presenceOfSplenomegaly"));
		int presenceOfHepatomegaly = Integer.parseInt(request.getParameter("presenceOfHepatomegaly"));
		int presenceOfLymphadenopathies = Integer.parseInt(request.getParameter("presenceOfLymphadenopathies"));
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
		double myelocytes = Double.parseDouble(request.getParameter("myelocytes"));
		double metamyelocytes = Double.parseDouble(request.getParameter("metamyelocytes"));
		double blasts = Double.parseDouble(request.getParameter("blasts"));
		double plateletCount = Double.parseDouble(request.getParameter("plateletCount"));

		// Coagulation
		// double factorVIIILevel =
		// Double.parseDouble(request.getParameter("factorVIIILevel"));
		// double factorIXLevel =
		// Double.parseDouble(request.getParameter("factorIXLevel"));
		// double inhibitorAssay =
		// Double.parseDouble(request.getParameter("inhibitorAssay"));
		// double bethesdaUnits =
		// Double.parseDouble(request.getParameter("bethesdaUnits"));
		
		double creatinine = Double.parseDouble(request.getParameter("creatinine"));
		double uricAcide = Double.parseDouble(request.getParameter("uricAcid"));
		double na = Double.parseDouble(request.getParameter("na"));
		double k = Double.parseDouble(request.getParameter("k"));
		
		// double reticulocyteCount =
		// Double.parseDouble(request.getParameter("reticulocyteCount"));
		// double serumIron =
		// Double.parseDouble(request.getParameter("serumIron"));
		// double ironBindingCapacity =
		// Double.parseDouble(request.getParameter("ironBindingCapacity"));
		// double serumFerritin =
		// Double.parseDouble(request.getParameter("serumFerritin"));
		// double directAntiglobulin =
		// Double.parseDouble(request.getParameter("directAntiglobulin"));
		// double indirectAntiglobulin =
		// Double.parseDouble(request.getParameter("indirectAntiglobulin"));
		
		double sgot = Double.parseDouble(request.getParameter("sgot"));
		double sgpt = Double.parseDouble(request.getParameter("sgpt"));
		double ldh = Double.parseDouble(request.getParameter("ldh"));
		
		// double screeningTestsForHepatitisVirusesABC =
		// Double.parseDouble(request.getParameter("screeningTestsForHepatitisVirusesABC"));
		// double screeningTestsForEBVCMVHIV =
		// Double.parseDouble(request.getParameter("screeningTestsForEBVCMVHIV"));
		// double erythropoeitinLevel =
		// Double.parseDouble(request.getParameter("erythropoeitinLevel"));
		// double serumFolicAcid =
		// Double.parseDouble(request.getParameter("serumFolicAcid"));
		// double serumB12 =
		// Double.parseDouble(request.getParameter("serumB12"));
		// double tsh = Double.parseDouble(request.getParameter("tsh"));
		//
		// Imaging Studies
		
		int imagingStudies = Integer.parseInt(request.getParameter("imagingStudies"));
		
		String imagingStudiesResult = request.getParameter("imagingStudiesResult");

		int boneMarrowAspirate = Integer.parseInt(request.getParameter("boneMarrowAspirate"));
		
		String boneMarrowAspirateDatePerformed = request.getParameter("boneMarrowAspirateDatePerformed");
		String boneMarrowAspirateDescription = request.getParameter("boneMarrowAspirateDescription");
		
		// Part boneMarrowAspirateAttachScannedDocument =
		// request.getPart("boneMarrowAspirateAttachScannedDocument");
		
		int flowCytometry = Integer.parseInt(request.getParameter("flowCytometry"));
		String flowCytometryResult = request.getParameter("flowCytometryResult");
		
		// Part flowCytometryAttachScannedDocument =
		// request.getPart("flowCytometryAttachScannedDocument");
		
		int cytogeneticAndMolecularAnalysis = Integer.parseInt(request.getParameter("cytogeneticAndMolecularAnalysis"));
		
		String cytogeneticAndMolecularAnalysisResult = request.getParameter("cytogeneticAndMolecularAnalysisResult");
		// Part cytogeneticAndMolecularAnalysisAttachScannedDocument =
		// request.getPart("cytogeneticAndMolecularAnalysisAttachScannedDocument");

		// int cytogeneticAndMolecularAnalysisAAPNH =
		// Integer.parseInt(request.getParameter("cytogeneticAndMolecularAnalysisAAPNH"));
		// String cytogeneticAndMolecularAnalysisAAPNHResult =
		// request.getParameter("cytogeneticAndMolecularAnalysisAAPNHResult");
		// Part cytogeneticAndMolecularAnalysisAAPNHAttachScannedDocument =
		// request.getPart("cytogeneticAndMolecularAnalysisAAPNHAttachScannedDocument");
		// int cytogeneticAndMolecularAnalysisMDS =
		// Integer.parseInt(request.getParameter("cytogeneticAndMolecularAnalysisMDS"));
		// String cytogeneticAndMolecularAnalysisMDSResult =
		// request.getParameter("cytogeneticAndMolecularAnalysisMDSResult");
		// Part cytogeneticAndMolecularAnalysisMDSAttachScannedDocument =
		// request.getPart("cytogeneticAndMolecularAnalysisMDSAttachScannedDocument");
		//

		// Treatment
		// int transplantCandidate =
		// Integer.parseInt(request.getParameter("transplantCandidate"));
		// String modeOfTreatment = request.getParameter("modeOfTreatment");
		// String medications = request.getParameter("medications");
		String dateStarted = request.getParameter("dateStarted");
		
		String treatment = request.getParameter("treatment");
		
		String regimenProtocol = request.getParameter("regimenProtocol");
		String chemotherapyMedications = request.getParameter("chemotherapyMedications");
		
		int cycleNumber = Integer.parseInt(request.getParameter("cycleNumber"));
		String diseaseStatus = request.getParameter("diseaseStatus");
		
		// String treatmentSpecify = request.getParameter("treatmentSpecify");

		String addressArray[] = address.split(",");
		AddressBean ab = BeanFactory.getAddressBean(addressArray[0], addressArray[1], addressArray[2]);
		if (connection != null) {
			if (SQLOperations.addAddress(ab, connection)) {
				System.out.println("Successful insert Address");
			} else {
				System.out.println("Failed insert Address");
			}
		} else {
			System.out.println("Invalid connection Address");
		}

		TissueSpecimenBean tsb = BeanFactory.getTissueSpecimenBean(specimenType);
		if (connection != null) {
			if (SQLOperations.addTissueSpecimenData(tsb, connection)) {
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

		SeverityBean sb = BeanFactory.getSeverityBean(severity);
		if (connection != null) {
			if (SQLOperations.addSeverity(sb, connection, disease)) {
				System.out.println("Successful insert SeverityBean");
			} else {
				System.out.println("Failed insert SeverityBean");
			}
		} else {
			System.out.println("Invalid connection SeverityBean");
		}

		ClinicalDataBean cdb = BeanFactory.getClinicalDataBean(dateOfInitialDiagnosis, diagnosis, "", chiefComplaint,
				constitutionalSymptoms, otherSymptoms, comorbidities, smokingHistorySpecify, alchoholIntakeHistory,
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

		BloodChemistryBean bcb = BeanFactory.getBloodChemistryBean(0.0, creatinine, uricAcide, sgot, sgpt, ldh, 0.0, na,
				k, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
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

		BoneMarrowAspirateBean bmab = BeanFactory.getBoneMarrowAspirateBean(boneMarrowAspirateDatePerformed,
				boneMarrowAspirateDescription);
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

		CytogeneticAAPNHBean caapnhb = BeanFactory.getCytogeneticAAPNHBean(cytogeneticAndMolecularAnalysisResult);
		if (connection != null) {
			if (SQLOperations.addCytogeneticAAPNH(caapnhb, connection, disease)) {
				System.out.println("Successful insert CytogeneticAAPNHBean");
			} else {
				System.out.println("Failed insert CytogeneticAAPNHBean");
			}
		} else {
			System.out.println("Invalid connection CytogeneticAAPNHBean");
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

		TreatmentBean tb = BeanFactory.getTreatmentBean(true, dateStarted, "", 0, "", "");
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
				System.out.println("Successful insert PatientBean");
			} else {
				System.out.println("Failed insert PatientBean");
			}
		} else {
			System.out.println("Invalid connection PatientBean");
		}

		/*OtherLaboratoriesBean olb = BeanFactory.getOtherLaboratoriesBean(creatinine, uricAcid, reticulocyteCount,
				serumIron, ironBindingCapacity, serumFerritin, directAntiglobulin, indirectAntiglobulin, sgot, sgpt,
				ldh, screeningTestsForHepatitisVirusesABC, screeningTestsForEBVCMVHIV, erythropoeitinLevel,
				serumFolicAcid, serumB12, tsh);
		if (connection != null) {
			if (SQLOperations.addOtherLaboratories(olb, connection, disease)) {
				System.out.println("Successful insert OtherLaboratoriesBean");
			} else {
				System.out.println("Failed insert OtherLaboratoriesBean");
			}
		} else {
			System.out.println("Invalid connection OtherLaboratoriesBean");
		}
		BoneMarrowAspirateBean bmab = BeanFactory.getBoneMarrowAspirateBean(boneMarrowAspirateDatePerformed,
				boneMarrowAspirateDescription);
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
		CytogeneticAAPNHBean caapnhb = BeanFactory.getCytogeneticAAPNHBean(cytogeneticAndMolecularAnalysisAAPNHResult);
		if (connection != null) {
			if (SQLOperations.addCytogeneticAAPNH(caapnhb, connection, disease)) {
				System.out.println("Successful insert CytogeneticAAPNHBean");
			} else {
				System.out.println("Failed insert CytogeneticAAPNHBean");
			}
		} else {
			System.out.println("Invalid connection CytogeneticAAPNHBean");
		}
		CytogeneticMDSBean cmdsb = BeanFactory.getCytogeneticMDSBean(cytogeneticAndMolecularAnalysisMDSResult);
		if (connection != null) {
			if (SQLOperations.addCytogeneticMDS(cmdsb, connection, disease)) {
				System.out.println("Successful insert CytogeneticMDSBean");
			} else {
				System.out.println("Failed insert CytogeneticMDSBean");
			}
		} else {
			System.out.println("Invalid connection CytogeneticMDSBean");
		}
		LaboratoryProfileBean lpb = BeanFactory.getLaboratoryProfileBean(dateOfBloodCollection, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0, 0);
		if (connection != null) {
			if (SQLOperations.addLaboratoryProfile(lpb, connection, disease)) {
				System.out.println("Successful insert LaboratoryProfileBean");
			} else {
				System.out.println("Failed insert LaboratoryProfileBean");
			}
		} else {
			System.out.println("Invalid connection LaboratoryProfileBean");
		}
		ChemotherapyMedicationsBean cmb = BeanFactory.getChemotherapyMedicationsBean(medications);
		if (connection != null) {
			if (SQLOperations.addChemotherapyMedications(cmb, connection, disease)) {
				System.out.println("Successful insert ChemotherapyMedicationsBean");
			} else {
				System.out.println("Failed insert ChemotherapyMedicationsBean");
			}
		} else {
			System.out.println("Invalid connection ChemotherapyMedicationsBean");
		}
		TreatmentBean tb = BeanFactory.getTreatmentBean(transplantCandidate, modeOfTreatment, 0, dateStarted, "", 0, 0,
				0, "", "");
		if (connection != null) {
			if (SQLOperations.addTreatment(tb, connection, disease)) {
				System.out.println("Successful insert TreatmentBean");
			} else {
				System.out.println("Failed insert TreatmentBean");
			}
		} else {
			System.out.println("Invalid connection TreatmentBean");
		}*/

	}

}
