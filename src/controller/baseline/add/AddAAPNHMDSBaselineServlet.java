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
import utility.factory.BeanFactory;
import utility.values.DefaultValues;
import utility.database.SQLOperations;
import utility.database.SQLOperationsBaseline;
import utility.database.Security;

@WebServlet("/AddAAPNHMDSBaselineServlet")
public class AddAAPNHMDSBaselineServlet extends HttpServlet implements DefaultValues {
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

		getServletContext().log("AddAAPNHMDSBaselineServlet insert test");

		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain");

		int disease = 1;

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
		String dateOfVisit = request.getParameter("dateOfVisit");
		String diagnosis = request.getParameter("diagnosis");
		////// Classification/Risk Statification
		String severity = request.getParameter("severity");
		String chiefComplaint = request.getParameter("chiefComplaint");
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

		String smokingHistorySpecify = noValue;
		if (Integer.parseInt(request.getParameter("smokingHistory")) == 1) {
			smokingHistorySpecify = request.getParameter("smokingHistorySpecify");
		}

		String alchoholIntakeSpecify = noValue;
		if (Integer.parseInt(request.getParameter("alcoholIntakeHistory")) == 1) {
			alchoholIntakeSpecify = request.getParameter("alcoholIntakeSpecify");
		}

		String chemicalExposureSpecify = noValue;
		if (Integer.parseInt(request.getParameter("chemicalExposureHistory")) == 1) {
			chemicalExposureSpecify = request.getParameter("chemicalExposureSpecify");
		}

		String previousInfectionSpecify = noValue;
		if (Integer.parseInt(request.getParameter("previousInfection")) == 1) {
			previousInfectionSpecify = request.getParameter("previousInfectionSpecify");
		}

		String previousHematologicDisorderSpecify = noValue;
		if (Integer.parseInt(request.getParameter("previousHematologicDisorder")) == 1) {
			previousHematologicDisorderSpecify = request.getParameter("previousHematologicDisorderSpecify");
		}

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
		////// Other Laboratories
		double creatinine = Double.parseDouble(request.getParameter("creatinine"));
		double uricAcid = Double.parseDouble(request.getParameter("uricAcid"));
		double reticulocyteCount = Double.parseDouble(request.getParameter("reticulocyteCount"));
		double serumIron = Double.parseDouble(request.getParameter("serumIron"));
		double ironBindingCapacity = Double.parseDouble(request.getParameter("ironBindingCapacity"));
		double serumFerritin = Double.parseDouble(request.getParameter("serumFerritin"));
		String directAntiglobulin = request.getParameter("directAntiglobulin");
		String indirectAntiglobulin = request.getParameter("indirectAntiglobulin");
		double sgot = Double.parseDouble(request.getParameter("sgot"));
		double sgpt = Double.parseDouble(request.getParameter("sgpt"));
		double ldh = Double.parseDouble(request.getParameter("ldh"));
		String screeningTestsForHepatitisVirusesABC = request.getParameter("screeningTestsForHepatitisVirusesABC");
		String screeningTestsForEBVCMVHIV = request.getParameter("screeningTestsForEBVCMVHIV");
		double erythropoeitinLevel = Double.parseDouble(request.getParameter("erythropoeitinLevel"));
		double serumFolicAcid = Double.parseDouble(request.getParameter("serumFolicAcid"));
		double serumB12 = Double.parseDouble(request.getParameter("serumB12"));
		double tsh = Double.parseDouble(request.getParameter("tsh"));

		String boneMarrowAspirateDatePerformed = noValue;
		String boneMarrowAspirateDescription = noValue;
		// Part boneMarrowAspirateAttachScannedDocument;
		if (Integer.parseInt(request.getParameter("boneMarrowAspirate")) == 1) {
			boneMarrowAspirateDatePerformed = request.getParameter("boneMarrowAspirateDatePerformed");
			boneMarrowAspirateDescription = request.getParameter("boneMarrowAspirateDescription");
			//boneMarrowAspirateAttachScannedDocument = request.getPart("boneMarrowAspirateAttachScannedDocument");
		}

		String flowCytometryResult = noValue;
		// Part flowCytometryAttachScannedDocument;
		if (Integer.parseInt(request.getParameter("flowCytometry")) == 1) {
			flowCytometryResult = request.getParameter("flowCytometryResult");
			// flowCytometryAttachScannedDocument = request.getPart("flowCytometryAttachScannedDocument");
		}

		String cytogeneticAndMolecularAnalysisAAPNHResult = noValue;
		// Part cytogeneticAndMolecularAnalysisAAPNHAttachScannedDocument;
		if (Integer.parseInt(request.getParameter("cytogeneticAndMolecularAnalysisAAPNH")) == 1) {
			cytogeneticAndMolecularAnalysisAAPNHResult = request.getParameter("cytogeneticAndMolecularAnalysisAAPNHResult");
			//cytogeneticAndMolecularAnalysisAAPNHAttachScannedDocument = request.getPart("cytogeneticAndMolecularAnalysisAAPNHAttachScannedDocument");
		}

		String cytogeneticAndMolecularAnalysisMDSResult = noValue;
		// Part cytogeneticAndMolecularAnalysisMDSAttachScannedDocument;
		if (Integer.parseInt(request.getParameter("cytogeneticAndMolecularAnalysisMDS")) == 1) {
			cytogeneticAndMolecularAnalysisMDSResult = request.getParameter("cytogeneticAndMolecularAnalysisMDSResult");
			//cytogeneticAndMolecularAnalysisMDSAttachScannedDocument = request.getPart("cytogeneticAndMolecularAnalysisMDSAttachScannedDocument");
		}

		// TREATMENT / THERAPHY AND RESPONSE
		boolean transplantCandidate;
		if (Integer.parseInt(request.getParameter("transplantCandidate")) != 0) {
			transplantCandidate = true;
		} else {
			transplantCandidate = false;
		}
		String modeOfTreatment = request.getParameter("modeOfTreatment");
		String medications = request.getParameter("medications");
		String dateStarted = request.getParameter("dateStarted");

		String diseaseStatus = request.getParameter("diseaseStatus");
		String diseaseStatusOthers = noValue;
		if (diseaseStatus.equalsIgnoreCase("Others")) {
			diseaseStatusOthers = request.getParameter("diseaseStatusOthers");
		}

		// INSERT VALUES
		String addressArray[] = address.split(",");

		AddressBean ab = BeanFactory.getAddressBean(Security.encrypt(addressArray[0]), Security.encrypt(addressArray[1]),
				Security.encrypt(addressArray[2]));
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

		ClassificationBean csb = BeanFactory.getClassificationBean(severity);
		if (connection != null) {
			if (SQLOperationsBaseline.addClassification(csb, connection, disease)) {
				System.out.println("Successful insert ClassificationBean");
			} else {
				System.out.println("Failed insert ClassificationBean");
			}
		} else {
			System.out.println("Invalid connection ClassificationBean");
		}

		PhysicalExamBean peb = BeanFactory.getPhysicalExamBean(height, weight, ecog, 0.0, 0.0, 0.0, false, false, "", "", false,
				otherFindings);
		if (connection != null) {
			if (SQLOperationsBaseline.addPhysicalExam(peb, connection, disease)) {
				System.out.println("Successful insert PhysicalExamBean");
			} else {
				System.out.println("Failed insert PhysicalExamBean");
			}
		} else {
			System.out.println("Invalid connection PhysicalExamBean");
		}

		ClinicalDataBean cdb = BeanFactory.getClinicalDataBean(dateOfVisit, diagnosis, "", "", chiefComplaint, "", "", otherSymptoms,
				comorbidities, smokingHistorySpecify, alchoholIntakeSpecify, chemicalExposureSpecify, previousInfectionSpecify,
				previousHematologicDisorderSpecify, "");
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

		OtherLaboratoriesBean olb = BeanFactory.getOtherLaboratoriesBean(creatinine, uricAcid, reticulocyteCount, serumIron,
				ironBindingCapacity, serumFerritin, directAntiglobulin, indirectAntiglobulin, sgot, sgpt, ldh,
				screeningTestsForHepatitisVirusesABC, screeningTestsForEBVCMVHIV, erythropoeitinLevel, serumFolicAcid, serumB12, tsh);
		if (connection != null) {
			if (SQLOperationsBaseline.addOtherLaboratories(olb, connection, disease)) {
				System.out.println("Successful insert OtherLaboratoriesBean");
			} else {
				System.out.println("Failed insert OtherLaboratoriesBean");
			}
		} else {
			System.out.println("Invalid connection OtherLaboratoriesBean");
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

		FlowCytometryBean fcb = BeanFactory.getFlowCytometryBean(flowCytometryResult);
		if (connection != null) {
			if (SQLOperationsBaseline.addFlowCytometry(fcb, connection, disease)) {
				System.out.println("Successful insert FlowCytometryBean");
			} else {
				System.out.println("Failed insert FlowCytometryBean");
			}
		} else {
			System.out.println("Invalid connection FlowCytometryBean");
		}

		CytogeneticMolecularAAPNHBean cmaapnhb = BeanFactory.getCytogeneticMolecularAAPNHBean(cytogeneticAndMolecularAnalysisAAPNHResult);
		if (connection != null) {
			if (SQLOperationsBaseline.addCytogeneticMolecularAAPNH(cmaapnhb, connection, disease)) {
				System.out.println("Successful insert CytogeneticAAPNHBean");
			} else {
				System.out.println("Failed insert CytogeneticAAPNHBean");
			}
		} else {
			System.out.println("Invalid connection CytogeneticAAPNHBean");
		}

		CytogeneticMolecularMDSBean cmmdsb = BeanFactory.getCytogeneticMolecularMDSBean(cytogeneticAndMolecularAnalysisMDSResult);
		if (connection != null) {
			if (SQLOperationsBaseline.addCytogeneticMolecularMDS(cmmdsb, connection, disease)) {
				System.out.println("Successful insert CytogeneticMDSBean");
			} else {
				System.out.println("Failed insert CytogeneticMDSBean");
			}
		} else {
			System.out.println("Invalid connection CytogeneticMDSBean");
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

		ChemotherapyMedicationsBean cmb = BeanFactory.getChemotherapyMedicationsBean(medications);
		if (connection != null) {
			if (SQLOperationsBaseline.addChemotherapyMedications(cmb, connection, disease)) {
				System.out.println("Successful insert ChemotherapyMedicationsBean");
			} else {
				System.out.println("Failed insert ChemotherapyMedicationsBean");
			}
		} else {
			System.out.println("Invalid connection ChemotherapyMedicationsBean");
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

		TreatmentBean tb = BeanFactory.getTreatmentBean(transplantCandidate, dateStarted, 0, "", "");
		if (connection != null) {
			if (SQLOperationsBaseline.addTreatment(tb, connection, disease)) {
				System.out.println("Successful insert TreatmentBean");
			} else {
				System.out.println("Failed insert TreatmentBean");
			}
		} else {
			System.out.println("Invalid connection TreatmentBean");
		}

		DiseaseStatusBean dsb = BeanFactory.getDiseaseStatusBean(diseaseStatus, "", diseaseStatusOthers);
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

		HttpSession session = request.getSession(true);

		AuditBean auditBean = new AuditBean("Add patient in AA PNH MDS Baseline",
				request.getParameter("lastName").trim().toUpperCase() + ", " + request.getParameter("firstName").trim().toUpperCase() + " "
						+ request.getParameter("middleInitial").trim().toUpperCase(),
				(String) session.getAttribute("name"), Integer.parseInt((String) session.getAttribute("accountID")));
		SQLOperations.addAudit(auditBean, connection);

		response.getWriter().write("Success");

	}

}
