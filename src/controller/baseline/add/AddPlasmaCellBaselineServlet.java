package controller.baseline.add;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.*;
import utility.database.SQLOperations;
import utility.database.SQLOperationsBaseline;
import utility.database.Security;
import utility.factory.BeanFactory;
import utility.values.DefaultValues;

@WebServlet("/AddPlasmaCellBaselineServlet")
public class AddPlasmaCellBaselineServlet extends HttpServlet implements DefaultValues {
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

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		getServletContext().log("AddPlasmaCellBaselineServlet insert test");

		int disease = 6;

		// GENERAL DATA
		String lastName = Security.encrypt(request.getParameter("lastName").trim().toUpperCase());
		String firstName = Security.encrypt(request.getParameter("firstName").trim().toUpperCase());
		String middleInitial = Security.encrypt(request.getParameter("middleInitial").trim().toUpperCase());
		int gender = Integer.parseInt(request.getParameter("gender"));
		String dateOfBirth = request.getParameter("dateOfBirth");
		String address = request.getParameter("address");
		String dateOfEntry = request.getParameter("dateOfEntry");

		String specimenType = noValue;
		if (Integer.parseInt(request.getParameter("tissueSpecimenCollected")) == 1) {
			specimenType = request.getParameter("specimenType");
		}

		// CLINICAL DATA
		String dateOfInitialDiagnosis = request.getParameter("dateOfInitialDiagnosis");
		String diagnosis = request.getParameter("diagnosis");
		String issStagingName = request.getParameter("issStaging");

		String chiefComplaint = request.getParameter("chiefComplaint");
		String constitutionalSymptoms = request.getParameter("constitutionalSymptoms");
		String otherSymptoms = request.getParameter("otherSymptoms");

		String relationshipToPatient = noValue;
		String cancerName = noValue;
		String otherDiseasesInTheFamily = noValue;
		if (Integer.parseInt(request.getParameter("familyHistoryOfCancer")) == 1) {
			relationshipToPatient = request.getParameter("relationshipToPatient");
			cancerName = request.getParameter("specifyCancer");
			otherDiseasesInTheFamily = request.getParameter("otherDiseasesInTheFamily");
		}

		String comorbidities = request.getParameter("comorbidities");

		String genericName = noValue;
		Double dose = 0.0;
		String frequency = noValue;
		if (Integer.parseInt(request.getParameter("concomitantMedications")) == 1) {
			genericName = request.getParameter("genericName");
			dose = Double.parseDouble(request.getParameter("dose"));
			frequency = request.getParameter("frequency");
		}

		String smokingHistorySpecify = request.getParameter("smokingHistorySpecify");
		String alchoholIntakeHistorySpecify = request.getParameter("alcoholIntakeSpecify");
		String chemicalExposureSpecify = request.getParameter("chemicalExposureSpecify");

		////// Physical Exam
		double height = Double.parseDouble(request.getParameter("height"));
		double weight = Double.parseDouble(request.getParameter("weight"));
		double ecog = Double.parseDouble(request.getParameter("ecog"));
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
		double myelocytes = Double.parseDouble(request.getParameter("myelocytes"));
		double metamyelocytes = Double.parseDouble(request.getParameter("metamyelocytes"));
		double blasts = Double.parseDouble(request.getParameter("blasts"));
		double plateletCount = Double.parseDouble(request.getParameter("plateletCount"));

		////// Other Laboratories / Blood Chemistry
		double bun = Double.parseDouble(request.getParameter("bun"));
		double creatinine = Double.parseDouble(request.getParameter("creatinine"));
		double uricAcid = Double.parseDouble(request.getParameter("uricAcid"));
		double iCa = Double.parseDouble(request.getParameter("iCa"));
		double na = Double.parseDouble(request.getParameter("na"));
		double k = Double.parseDouble(request.getParameter("k"));
		double totalProtein = Double.parseDouble(request.getParameter("totalProtein"));
		double albumin = Double.parseDouble(request.getParameter("albumin"));
		double globulin = Double.parseDouble(request.getParameter("globulin"));
		double beta2Microglobulin = Double.parseDouble(request.getParameter("beta2Microglobulin"));
		double ldh = Double.parseDouble(request.getParameter("ldh"));

		String imagingStudiesResult = noValue;
		if (Integer.parseInt(request.getParameter("imagingStudies")) == 1) {
			imagingStudiesResult = request.getParameter("imagingStudiesResult");
		}

		String boneMarrowAspirateDatePerformed = noValue;
		String boneMarrowAspirateDescription = noValue;
		// Part boneMarrowAspirateAttachScannedDocument;
		if (Integer.parseInt(request.getParameter("boneMarrowAspirate")) == 1) {
			boneMarrowAspirateDatePerformed = request.getParameter("boneMarrowAspirateDatePerformed");
			boneMarrowAspirateDescription = request.getParameter("boneMarrowAspirateDescription");
			//boneMarrowAspirateAttachScannedDocument = request.getPart("boneMarrowAspirateAttachScannedDocument");
		}

		String serumFree = noValue;
		// Part serumFreeAttachScannedDocument;
		if (Integer.parseInt(request.getParameter("serumFreeLightChainAsssay")) == 1) {
			serumFree = request.getParameter("serumFreeLightChainAsssayResult");
			//serumFreeAttachScannedDocument = request.getPart("serumFreeLightChainAsssayAttachScannedDocument");
		}

		String serumProteinElectrophoresisResult = noValue;
		// Part serumProteinElectrophoresisAttachScannedDocument;
		if (Integer.parseInt(request.getParameter("serumProteinElectrophoresis")) == 1) {
			serumProteinElectrophoresisResult = request.getParameter("serumProteinElectrophoresisResult");
			//serumProteinElectrophoresisAttachScannedDocument = request.getPart("serumProteinElectrophoresisAttachScannedDocument");
		}

		String serumImmunofixationResult = noValue;
		// Part serumImmunofixationAttachScannedDocument;
		if (Integer.parseInt(request.getParameter("serumImmunofixation")) == 1) {
			serumImmunofixationResult = request.getParameter("serumImmunofixationResult");
			//serumImmunofixationAttachScannedDocument = request.getPart("serumImmunofixationAttachScannedDocument");
		}

		String urineProteinResult = noValue;
		// Part urineProteinAttachScannedDocument;
		if (Integer.parseInt(request.getParameter("urineProtein")) == 1) {
			urineProteinResult = request.getParameter("urineProteinResult");
			//urineProteinAttachScannedDocument = request.getPart("urineProteinAttachScannedDocument");
		}

		String cytogeneticAndMolecularAnalysisResult = noValue;
		// Part cytogeneticAndMolecularAnalysisAttachScannedDocument;
		if (Integer.parseInt(request.getParameter("cytogeneticAndMolecularAnalysis")) == 1) {
			cytogeneticAndMolecularAnalysisResult = request.getParameter("cytogeneticAndMolecularAnalysisResult");
			//cytogeneticAndMolecularAnalysisAttachScannedDocument = request.getPart("cytogeneticAndMolecularAnalysisAttachScannedDocument");
		}

		// TREATMENT / THERAPHY AND RESPONSE

		boolean transplantCandidate;
		if (Integer.parseInt(request.getParameter("transplantCandidate")) != 0) {
			transplantCandidate = true;
		} else {
			transplantCandidate = false;
		}

		String modeOfTreatment = request.getParameter("treatment");
		String otherRegimen = noValue;
		if (modeOfTreatment.equalsIgnoreCase("Others")) {
			otherRegimen = request.getParameter("otherRegimens");
		}

		String regimenTransplant = request.getParameter("regimenProtocolTransplant");
		String otherRegimenTransplant = noValue;
		if (regimenTransplant.equalsIgnoreCase("Others")) {
			otherRegimenTransplant = request.getParameter("otherRegimensTransplant");
		}

		String regimenNonTransplant = request.getParameter("regimenProtocolNonTransplant");
		String otherRegimenNonTransplant = noValue;
		if (regimenNonTransplant.equalsIgnoreCase("Others")) {
			otherRegimenNonTransplant = request.getParameter("otherRegimensNonTransplant");
		}

		String regimenMaintenanceTherapy = request.getParameter("regimenProtocolMaintenanceTherapy");
		String otherRegimenMaintenanceTherapy = noValue;
		if (regimenMaintenanceTherapy.equalsIgnoreCase("Others")) {
			otherRegimenMaintenanceTherapy = request.getParameter("otherRegimensMaintenanceTherapy");
		}

		int cycleNumber = Integer.parseInt(request.getParameter("cycleNumber"));

		// Other Treatment Modalities/Adjunctive treatment
		String bisphosphonates = request.getParameter("bisphosphonatesSpecify");
		String radiotherapy = request.getParameter("radiotherapyDoseAndFrequency");
		String otherMedications = request.getParameter("otherMedications");
		String dateStarted = request.getParameter("dateStarted");
		String complications = request.getParameter("complications");
		
		String diseaseStatus = request.getParameter("diseaseStatus");
		String relapseDisease = noValue;
		String otherDisease = noValue;
		if (diseaseStatus.equalsIgnoreCase("Others")) {
			otherDisease = request.getParameter("diseaseStatusOthers");
		} else if (diseaseStatus.equalsIgnoreCase("Relapse")) {
			relapseDisease = request.getParameter("relapseDisease");
		}

		// INSERT VALUES
		String addressArray[] = address.split(",");

		AddressBean ab = BeanFactory.getAddressBean(Security.encrypt(addressArray[0]), Security.encrypt(addressArray[1]), Security.encrypt(addressArray[2]));
		if (connection != null) {
			if (SQLOperationsBaseline.addAddress(ab, connection, disease)) {
				System.out.println("Successful insert AddressBean");
			} else {
				System.out.println("Failed insert AddressBean");
			}
		} else {
			System.out.println("Invalid connection AddressBean");
		}

		TissueSpecimenBean tsb = BeanFactory.getTissueSpecimenBean(specimenType);
		if (connection != null) {
			if (SQLOperationsBaseline.addTissueSpecimenData(tsb, connection, disease)) {
				System.out.println("Successful insert TissueSpecimenBean");
			} else {
				System.out.println("Failed insert TissueSpecimenBean");
			}
		} else {
			System.out.println("Invalid connection TissueSpecimenBean");
		}

		GeneralDataBean gdb = BeanFactory.getGeneralDataBean(lastName, firstName, middleInitial, gender, dateOfBirth, dateOfEntry);
		if (connection != null) {
			if (SQLOperationsBaseline.addGeneralData(gdb, connection, disease)) {
				System.out.println("Successful insert GeneralDataBean");
			} else {
				System.out.println("Failed insert GeneralDataBean");
			}
		} else {
			System.out.println("Invalid connection GeneralDataBean");
		}

		ISSStagingBean issb = BeanFactory.getISSStagingBean(issStagingName);
		if (connection != null) {
			if (SQLOperationsBaseline.addISSStaging(issb, connection, disease)) {
				System.out.println("Successful insert ISSStagingBean");
			} else {
				System.out.println("Failed insert ISSStagingBean");
			}
		} else {
			System.out.println("Invalid connection ISSStagingBean");
		}

		PhysicalExamBean peb = BeanFactory.getPhysicalExamBean(height, weight, ecog, 0.0, 0.0, 0.0, false, false, "", "", false, otherFindings);
		if (connection != null) {
			if (SQLOperationsBaseline.addPhysicalExam(peb, connection, disease)) {
				System.out.println("Successful insert PhysicalExamBean");
			} else {
				System.out.println("Failed insert PhysicalExamBean");
			}
		} else {
			System.out.println("Invalid connection PhysicalExamBean");
		}

		ClinicalDataBean cdb = BeanFactory.getClinicalDataBean(dateOfInitialDiagnosis, diagnosis, "", "", chiefComplaint, "",
				constitutionalSymptoms, otherSymptoms, comorbidities, smokingHistorySpecify, alchoholIntakeHistorySpecify,
				chemicalExposureSpecify, "", "", otherFindings);
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

		HematologyBean hb = BeanFactory.getHematologyBean(hemoglobin, hematocrit, whiteBloodCells, neutrophils, lymphocytes, monocytes,
				eosinophils, basophils, myelocytes, metamyelocytes, blasts, plateletCount);
		if (connection != null) {
			if (SQLOperationsBaseline.addHematology(hb, connection, disease)) {
				System.out.println("Successful insert HematologyBean");
			} else {
				System.out.println("Failed insert HematologyBean");
			}
		} else {
			System.out.println("Invalid connection HematologyBean");
		}

		BloodChemistryBean bcb = BeanFactory.getBloodChemistryBean(bun, creatinine, uricAcid, 0.0, 0.0, ldh, 0.0, na, k, 0.0, 0.0, 0.0,
				beta2Microglobulin, 0.0, 0.0, iCa, totalProtein, albumin, globulin, 0.0, 0.0);
		if (connection != null) {
			if (SQLOperationsBaseline.addBloodChemistry(bcb, connection, disease)) {
				System.out.println("Successful insert BloodChemistryBean");
			} else {
				System.out.println("Failed insert BloodChemistryBean");
			}
		} else {
			System.out.println("Invalid connection BloodChemistryBean");
		}

		BoneMarrowAspirateBean bmab = BeanFactory.getBoneMarrowAspirateBean(boneMarrowAspirateDatePerformed, boneMarrowAspirateDescription);
		if (connection != null) {
			if (SQLOperationsBaseline.addBoneMarrowAspirate(bmab, connection, disease)) {
				System.out.println("Successful insert BoneMarrowAspirateBean");
			} else {
				System.out.println("Failed insert BoneMarrowAspirateBean");
			}
		} else {
			System.out.println("Invalid connection BoneMarrowAspirateBean");
		}

		CytogeneticMolecularBean cmb = BeanFactory.getCytogeneticMolecularBean(cytogeneticAndMolecularAnalysisResult);
		if (connection != null) {
			if (SQLOperationsBaseline.addCytogeneticMolecular(cmb, connection, disease)) {
				System.out.println("Successful insert CytogeneticMolecularBean");
			} else {
				System.out.println("Failed insert CytogeneticMolecularBean");
			}
		} else {
			System.out.println("Invalid connection CytogeneticMolecularBean");
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

		SerumFreeBean sfb = BeanFactory.getSerumFreeBean(serumFree);
		if (connection != null) {
			if (SQLOperationsBaseline.addSerumFree(sfb, connection, disease)) {
				System.out.println("Successful insert SerumFreeBean");
			} else {
				System.out.println("Failed insert SerumFreeBean");
			}
		} else {
			System.out.println("Invalid connection SerumFreeBean");
		}

		SerumImmunofixationBean sifb = BeanFactory.getSerumImmunofixationBean(serumImmunofixationResult);
		if (connection != null) {
			if (SQLOperationsBaseline.addSerumImmunofixation(sifb, connection, disease)) {
				System.out.println("Successful insert SerumImmunofixationBean");
			} else {
				System.out.println("Failed insert SerumImmunofixationBean");
			}
		} else {
			System.out.println("Invalid connection SerumImmunofixationBean");
		}

		SerumProteinBean spb = BeanFactory.getSerumProteinBean(serumProteinElectrophoresisResult);
		if (connection != null) {
			if (SQLOperationsBaseline.addSerumProtein(spb, connection, disease)) {
				System.out.println("Successful insert SerumProteinBean");
			} else {
				System.out.println("Failed insert SerumProteinBean");
			}
		} else {
			System.out.println("Invalid connection SerumProteinBean");
		}

		UrineProteinBean upb = BeanFactory.getUrineProteinBean(urineProteinResult);
		if (connection != null) {
			if (SQLOperationsBaseline.addUrineProtein(upb, connection, disease)) {
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

		ModeOfTreatmentBean motb = BeanFactory.getModeOfTreatmentBean(modeOfTreatment, modeOfTreatment);
		if (connection != null) {
			if (SQLOperationsBaseline.addModeOfTreatment(motb, connection, disease)) {
				System.out.println("Successful insert ModeOfTreatmentBean");
			} else {
				System.out.println("Failed insert ModeOfTreatmentBean");
			}
		} else {
			System.out.println("Invalid connection ModeOfTreatmentBean");
		}

		RegimenBean rb = BeanFactory.getRegimenBean(otherRegimen, otherRegimen);
		if (connection != null) {
			if (SQLOperationsBaseline.addRegimen(rb, connection, disease)) {
				System.out.println("Successful insert RegimenBean");
			} else {
				System.out.println("Failed insert RegimenBean");
			}
		} else {
			System.out.println("Invalid connection RegimenBean");
		}

		RegimenTransplantBean rtb = BeanFactory.getRegimenTransplantBean(regimenTransplant, otherRegimenTransplant);
		if (connection != null) {
			if (SQLOperationsBaseline.addRegimenTransplant(rtb, connection, disease)) {
				System.out.println("Successful insert RegimenTransplantBean");
			} else {
				System.out.println("Failed insert RegimenTransplantBean");
			}
		} else {
			System.out.println("Invalid connection RegimenTransplantBean");
		}

		RegimenNonTransplantBean rntb = BeanFactory.getRegimenNonTransplantBean(regimenNonTransplant, otherRegimenNonTransplant);
		if (connection != null) {
			if (SQLOperationsBaseline.addRegimenNonTransplant(rntb, connection, disease)) {
				System.out.println("Successful insert RegimenNonTransplantBean");
			} else {
				System.out.println("Failed insert RegimenNonTransplantBean");
			}
		} else {
			System.out.println("Invalid connection RegimenNonTransplantBean");
		}

		MaintenanceTherapyBean mtb = BeanFactory.getMaintenanceTherapyBean(regimenMaintenanceTherapy, otherRegimenMaintenanceTherapy);
		if (connection != null) {
			if (SQLOperationsBaseline.addMaintenanceTherapy(mtb, connection, disease)) {
				System.out.println("Successful insert MaintenanceTherapyBean");
			} else {
				System.out.println("Failed insert MaintenanceTherapyBean");
			}
		} else {
			System.out.println("Invalid connection MaintenanceTherapyBean");
		}

		TreatmentBean tb = BeanFactory.getTreatmentBean(transplantCandidate, dateStarted, cycleNumber, complications, "");
		if (connection != null) {
			if (SQLOperationsBaseline.addTreatment(tb, connection, disease)) {
				System.out.println("Successful insert TreatmentBean");
			} else {
				System.out.println("Failed insert TreatmentBean");
			}
		} else {
			System.out.println("Invalid connection TreatmentBean");
		}

		OtherTreatmentBean otb = BeanFactory.getOtherTreatmentBean(bisphosphonates, radiotherapy, true, otherMedications, complications);
		if (connection != null) {
			if (SQLOperationsBaseline.addOtherTreatment(otb, connection, disease)) {
				System.out.println("Successful insert OtherTreatmentBean");
			} else {
				System.out.println("Failed insert OtherTreatmentBean");
			}
		} else {
			System.out.println("Invalid connection OtherTreatmentBean");
		}

		DiseaseStatusBean dsb = BeanFactory.getDiseaseStatusBean(diseaseStatus, relapseDisease, otherDisease);
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
				System.out.println("Successful insert PatientBean");
			} else {
				System.out.println("Failed insert PatientBean");
			}
		} else {
			System.out.println("Invalid connection PatientBean");
		}
		
		HttpSession session = request.getSession(true);

		AuditBean auditBean = new AuditBean("Add patient in Plasma Cell Baseline",
				request.getParameter("lastName").trim().toUpperCase() + ", " + request.getParameter("firstName").trim().toUpperCase() + " "
						+ request.getParameter("middleInitial").trim().toUpperCase(),
				(String) session.getAttribute("name"), Integer.parseInt((String) session.getAttribute("accountID")));
		SQLOperations.addAudit(auditBean, connection);

	}

}
