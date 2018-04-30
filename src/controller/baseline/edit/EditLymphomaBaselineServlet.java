package controller.baseline.edit;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;

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

@WebServlet("/EditLymphomaBaselineServlet")
public class EditLymphomaBaselineServlet extends HttpServlet implements DefaultValues {
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
	
	public EditLymphomaBaselineServlet() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get form data
		getServletContext().log("EditLymphomaBaselineServlet insert test");
		int disease = 4;
		// GENERAL DATA
		String lastName = request.getParameter("lastName").trim().toUpperCase();
		String firstName = request.getParameter("firstName").trim().toUpperCase();
		String middleInitial = request.getParameter("middleInitial").trim().toUpperCase();
		int gender = Integer.parseInt(request.getParameter("gender"));
		String dateOfBirth = request.getParameter("dateOfBirth");
		String address = request.getParameter("address");
		String civilStatus = request.getParameter("civilStatus");
		String dateOfEntry = request.getParameter("dateOfEntry");
		String specimenType = noValue;
		if (Integer.parseInt(request.getParameter("tissueSpecimenCollected")) == 1) {
			specimenType = request.getParameter("specimenType");
		}
		// CLINICAL DATA
		String dateOfInitialDiagnosis = request.getParameter("dateOfInitialDiagnosis");
		String diagnosis = request.getParameter("diagnosis");
		String stageOfDisease = request.getParameter("stageOfDisease");
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
		////// Physical Exam
		double height = Double.parseDouble(request.getParameter("height"));
		double weight = Double.parseDouble(request.getParameter("weight"));
		double ecog = Double.parseDouble(request.getParameter("ecog"));
		double splenomegaly = Double.parseDouble(request.getParameter("presenceOfSplenomegaly"));
		double hepatomegaly = Double.parseDouble(request.getParameter("presenceOfHepatomegaly"));
		double lymphadenopathies = Double.parseDouble(request.getParameter("presenceOfLymphadenopathies"));
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
		double na = Double.parseDouble(request.getParameter("na"));
		double k = Double.parseDouble(request.getParameter("k"));
		// double bilirubin = Double.parseDouble(request.getParameter(""));
		double bilirubinTotal = Double.parseDouble(request.getParameter("total"));
		double bilirubinDirect = Double.parseDouble(request.getParameter("direct"));
		double bilirubinIndirect = Double.parseDouble(request.getParameter("indirect"));
		double sgot = Double.parseDouble(request.getParameter("sgot"));
		double sgpt = Double.parseDouble(request.getParameter("sgpt"));
		double microglobulin = Double.parseDouble(request.getParameter("beta2Microglobulin"));
		double hepatitisBTesting = Double.parseDouble(request.getParameter("hepatitisBTesting"));
		double ldh = Double.parseDouble(request.getParameter("ldh"));
		double esr = Double.parseDouble(request.getParameter("esr"));
		String hematopathologyDatePerformed = noValue;
		String hematopathologyDescription = noValue;
		//Part hematopathologAttachScannedDocument;
		if (Integer.parseInt(request.getParameter("hematopathologyReviewOfSlides")) == 1) {
			hematopathologyDatePerformed = request.getParameter("hematopathologyDatePerformed");
			hematopathologyDescription = request.getParameter("hematopathologyDescription");
			//hematopathologAttachScannedDocument = request.getPart("hematopathologAttachScannedDocument");
		}
		String immunohistochemistryOfTissueDatePerformed = noValue;
		String immunohistochemistryOfTissueDescription = noValue;
		//Part immunohistochemistryOfTissueAttachScannedDocument;
		if (Integer.parseInt(request.getParameter("immunohistochemistryReviewOfSlides")) == 1) {
			immunohistochemistryOfTissueDatePerformed = request.getParameter("immunohistochemistryDatePerformed");
			immunohistochemistryOfTissueDescription = request.getParameter("immunohistochemistryDescription");
			//immunohistochemistryOfTissueAttachScannedDocument = request.getPart("immunohistochemistryOfTissueAttachScannedDocument");
		}
		String imagingStudiesResult = noValue;
		if (Integer.parseInt(request.getParameter("imagingStudies")) == 1) {
			imagingStudiesResult = request.getParameter("imagingStudiesResult");
		}
		String boneMarrowAspirateDatePerformed = noValue;
		String boneMarrowAspirateDescription = noValue;
		//Part boneMarrowAspirateAndBiopsyOfTissueAttachScannedDocument;
		if (Integer.parseInt(request.getParameter("boneMarrowAspirate")) == 1) {
			boneMarrowAspirateDatePerformed = request.getParameter("boneMarrowAspirateDatePerformed");
			boneMarrowAspirateDescription = request.getParameter("boneMarrowAspirateDescription");
			//boneMarrowAspirateAndBiopsyOfTissueAttachScannedDocument = request.getPart("boneMarrowAspirateAndBiopsyOfTissueAttachScannedDocument");
		}
		String flowCytometryResult = noValue;
		// Part flowCytometryAttachScannedDocument;
		if (Integer.parseInt(request.getParameter("flowCytometry")) == 1) {
			flowCytometryResult = request.getParameter("flowCytometryResult");
			// flowCytometryAttachScannedDocument = request.getPart("flowCytometryAttachScannedDocument");
		}
		// TREATMENT / THERAPHY AND RESPONSE
		String modeOfTreatment = request.getParameter("treatment");
		String regimenProtocol = request.getParameter("regimenProtocol");
		String chemotherapyMedications = request.getParameter("chemotherapyMedications");
		int cycleNumber = Integer.parseInt(request.getParameter("cycleNumber"));
		String dateStarted = request.getParameter("dateStarted");
		String complications = request.getParameter("complications");
		String diseaseStatus = request.getParameter("diseaseStatus");
		if (modeOfTreatment.contains("&#40;") || modeOfTreatment.contains("&#41;")) {
			modeOfTreatment = modeOfTreatment.replaceAll("&#40;", "(");
			modeOfTreatment = modeOfTreatment.replaceAll("&#41;", ")");
		}
		if (diseaseStatus.contains("&#40;") || diseaseStatus.contains("&#41;")) {
			diseaseStatus = diseaseStatus.replaceAll("&#40;", "(");
			diseaseStatus = diseaseStatus.replaceAll("&#41;", ")");
		}
		String addressArray[] = address.split(",");
		//get all id
		int patientID = Integer.parseInt(request.getParameter("patientIDNumber"));
		try {
			if (connection != null) {
				ResultSet patientInfo = SQLOperationsBaseline.getPatient(patientID, connection);
				patientInfo.first();
				int generalDataID = patientInfo.getInt("GeneralDataID");
				ResultSet generalData = SQLOperationsBaseline.getGeneralData(generalDataID, connection);
				generalData.first();
				int addressID = generalData.getInt("AddressID");
				int tissueSpecimenID = generalData.getInt("TissueSpecimenID");
				int clinicalDataID = patientInfo.getInt("ClinicalDataID");
				ResultSet clinicalData = SQLOperationsBaseline.getClinicalData(clinicalDataID, connection);
				clinicalData.first();
				int physicalExamID = clinicalData.getInt("PhysicalExamID");
				int laboratoryID = patientInfo.getInt("LaboratoryID");
				ResultSet laboratoryProfile = SQLOperationsBaseline.getLaboratoryProfile(laboratoryID, connection);
				laboratoryProfile.first();
				int hematologyID = laboratoryProfile.getInt("HematologyID");
				int bloodChemistryID = laboratoryProfile.getInt("BloodChemistryID");
				int hematopathologyID = laboratoryProfile.getInt("HematopathologyID");
				int imagingStudiesID = laboratoryProfile.getInt("ImagingStudiesID");
				int boneMarrowAspirateID = laboratoryProfile.getInt("BoneMarrowAspirateID");
				int flowCytometryID = laboratoryProfile.getInt("FlowCytometryID");
				int immunohistochemistryID = laboratoryProfile.getInt("ImmunohistochemistryID");
				int treatmentID = patientInfo.getInt("TreatmentID");
				ResultSet treatment = SQLOperationsBaseline.getTreatment(treatmentID, connection);
				treatment.first();
				int modeOfTreatmentID = treatment.getInt("ModeOfTreatmentID");
				int chemoMedicationID = treatment.getInt("ChemoMedicationID");
				int regimenID = treatment.getInt("RegimenID");
				int diseaseStatusID = patientInfo.getInt("DiseaseStatusID");
				//start of edit
				AddressBean ab = BeanFactory.getAddressBean(Security.encrypt(addressArray[0]).trim(),
						Security.encrypt(addressArray[1]).trim(), Security.encrypt(addressArray[2]).trim());
				if (connection != null) {
					if (SQLOperationsBaseline.editAddress(ab, connection, disease, addressID)) {
						System.out.println("Successful insert AddressBean");
					} else {
						System.out.println("Failed insert AddressBean");
					}
				} else {
					System.out.println("Invalid connection AddressBean");
				}
				TissueSpecimenBean tsb = BeanFactory.getTissueSpecimenBean(specimenType);
				if (connection != null) {
					if (SQLOperationsBaseline.editTissueSpecimenData(tsb, connection, disease, tissueSpecimenID)) {
						System.out.println("Successful insert TissueSpecimenBean");
					} else {
						System.out.println("Failed insert TissueSpecimenBean");
					}
				} else {
					System.out.println("Invalid connection TissueSpecimenBean");
				}
				GeneralDataBean gdb = BeanFactory.getGeneralDataBean(lastName, firstName, middleInitial, gender, dateOfBirth, dateOfEntry,
						civilStatus);
				if (connection != null) {
					if (SQLOperationsBaseline.editGeneralData(gdb, connection, disease, generalDataID)) {
						System.out.println("Successful insert GeneralDataBean");
					} else {
						System.out.println("Failed insert GeneralDataBean");
					}
				} else {
					System.out.println("Invalid connection GeneralDataBean");
				}
				PhysicalExamBean peb = BeanFactory.getPhysicalExamBean(height, weight, ecog, splenomegaly, hepatomegaly, lymphadenopathies,
						false, false, "", "", false, otherFindings);
				if (connection != null) {
					if (SQLOperationsBaseline.editPhysicalExam(peb, connection, disease, physicalExamID)) {
						System.out.println("Successful insert PhysicalExamBean");
					} else {
						System.out.println("Failed insert PhysicalExamBean");
					}
				} else {
					System.out.println("Invalid connection PhysicalExamBean");
				}
				ClinicalDataBean cdb = BeanFactory.getClinicalDataBean(dateOfInitialDiagnosis, diagnosis, "", stageOfDisease,
						chiefComplaint, "", constitutionalSymptoms, otherSymptoms, comorbidities, smokingHistorySpecify,
						alchoholIntakeSpecify, chemicalExposureSpecify, "", "", otherFindings);
				if (connection != null) {
					if (SQLOperationsBaseline.editClinicalData(cdb, connection, disease, clinicalDataID)) {
						System.out.println("Successful insert ClinicalDataBean");
					} else {
						System.out.println("Failed insert ClinicalDataBean");
					}
				} else {
					System.out.println("Invalid connection ClinicalDataBean");
				}
				FamilyCancerBean famcb = BeanFactory.getFamilyCancerBean(relationshipToPatient, cancerName);
				if (connection != null) {
					if (SQLOperationsBaseline.editFamilyCancer(famcb, connection, disease, clinicalDataID)) {
						System.out.println("Successful insert FamilyCancerBean");
					} else {
						System.out.println("Failed insert FamilyCancerBean");
					}
				} else {
					System.out.println("Invalid connection FamilyCancerBean");
				}
				OtherDiseasesBean odb = BeanFactory.getOtherDiseasesBean(otherDiseasesInTheFamily);
				if (connection != null) {
					if (SQLOperationsBaseline.editOtherDiseases(odb, connection, disease, clinicalDataID)) {
						System.out.println("Successful insert OtherDiseasesBean");
					} else {
						System.out.println("Failed insert OtherDiseasesBean");
					}
				} else {
					System.out.println("Invalid connection OtherDiseasesBean");
				}
				MedicationsBean mb = BeanFactory.getMedicationsBean(genericName, dose, frequency);
				if (connection != null) {
					if (SQLOperationsBaseline.editMedications(mb, connection, disease, clinicalDataID)) {
						System.out.println("Successful insert MedicationsBean");
					} else {
						System.out.println("Failed insert MedicationsBean");
					}
				} else {
					System.out.println("Invalid connection MedicationsBean");
				}
				HematologyBean hb = BeanFactory.getHematologyBean(hemoglobin, hematocrit, whiteBloodCells, neutrophils, lymphocytes,
						monocytes, eosinophils, basophils, myelocytes, metamyelocytes, blasts, plateletCount);
				if (connection != null) {
					if (SQLOperationsBaseline.editHematology(hb, connection, disease, hematologyID)) {
						System.out.println("Successful insert HematologyBean");
					} else {
						System.out.println("Failed insert HematologyBean");
					}
				} else {
					System.out.println("Invalid connection HematologyBean");
				}
				BloodChemistryBean bcb = BeanFactory.getBloodChemistryBean(0.0, creatinine, uricAcid, sgot, sgpt, ldh, 0.0, na, k,
						bilirubinTotal, bilirubinDirect, bilirubinIndirect, microglobulin, hepatitisBTesting, esr, 0.0, 0.0, 0.0, 0.0, 0.0,
						0.0);
				if (connection != null) {
					if (SQLOperationsBaseline.editBloodChemistry(bcb, connection, disease, bloodChemistryID)) {
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
					if (SQLOperationsBaseline.editBoneMarrowAspirate(bmab, connection, disease, boneMarrowAspirateID)) {
						System.out.println("Successful insert BoneMarrowAspirateBean");
					} else {
						System.out.println("Failed insert BoneMarrowAspirateBean");
					}
				} else {
					System.out.println("Invalid connection BoneMarrowAspirateBean");
				}
				FlowCytometryBean fcb = BeanFactory.getFlowCytometryBean(flowCytometryResult);
				if (connection != null) {
					if (SQLOperationsBaseline.editFlowCytometry(fcb, connection, disease, flowCytometryID)) {
						System.out.println("Successful insert FlowCytometryBean");
					} else {
						System.out.println("Failed insert FlowCytometryBean");
					}
				} else {
					System.out.println("Invalid connection FlowCytometryBean");
				}
				HematopathologyBean hpb = BeanFactory.getHematopathologyBean(hematopathologyDatePerformed, hematopathologyDescription);
				if (connection != null) {
					if (SQLOperationsBaseline.editHematopathology(hpb, connection, disease, hematopathologyID)) {
						System.out.println("Successful insert HematopathologyBean");
					} else {
						System.out.println("Failed insert HematopathologyBean");
					}
				} else {
					System.out.println("Invalid connection HematopathologyBean");
				}
				ImagingStudiesBean isb = BeanFactory.getImagingStudiesBean(imagingStudiesResult.getBytes());
				if (connection != null) {
					if (SQLOperationsBaseline.editImagingStudies(isb, connection, disease, imagingStudiesID)) {
						System.out.println("Successful insert ImagingStudiesBean");
					} else {
						System.out.println("Failed insert ImagingStudiesBean");
					}
				} else {
					System.out.println("Invalid connection ImagingStudiesBean");
				}
				ImmunohistochemistryBean ihcb = BeanFactory.getImmunohistochemistryBean(immunohistochemistryOfTissueDatePerformed,
						immunohistochemistryOfTissueDescription);
				if (connection != null) {
					if (SQLOperationsBaseline.editImmunohistochemistry(ihcb, connection, disease, immunohistochemistryID)) {
						System.out.println("Successful insert ImmunohistochemistryBean");
					} else {
						System.out.println("Failed insert ImmunohistochemistryBean");
					}
				} else {
					System.out.println("Invalid connection ImmunohistochemistryBean");
				}
				LaboratoryProfileBean lpb = BeanFactory.getLaboratoryProfileBean(dateOfBloodCollection, "");
				if (connection != null) {
					if (SQLOperationsBaseline.editLaboratoryProfile(lpb, connection, disease, laboratoryID)) {
						System.out.println("Successful insert LaboratoryProfileBean");
					} else {
						System.out.println("Failed insert LaboratoryProfileBean");
					}
				} else {
					System.out.println("Invalid connection LaboratoryProfileBean");
				}
				ModeOfTreatmentBean motb = BeanFactory.getModeOfTreatmentBean(modeOfTreatment, modeOfTreatment);
				if (connection != null) {
					if (SQLOperationsBaseline.editModeOfTreatment(motb, connection, disease, modeOfTreatmentID)) {
						System.out.println("Successful insert ModeOfTreatmentBean");
					} else {
						System.out.println("Failed insert ModeOfTreatmentBean");
					}
				} else {
					System.out.println("Invalid connection ModeOfTreatmentBean");
				}
				ChemotherapyMedicationsBean cmb = BeanFactory.getChemotherapyMedicationsBean(chemotherapyMedications);
				if (connection != null) {
					if (SQLOperationsBaseline.editChemotherapyMedications(cmb, connection, disease, chemoMedicationID)) {
						System.out.println("Successful insert ChemotherapyMedicationsBean");
					} else {
						System.out.println("Failed insert ChemotherapyMedicationsBean");
					}
				} else {
					System.out.println("Invalid connection ChemotherapyMedicationsBean");
				}
				RegimenBean rb = BeanFactory.getRegimenBean(regimenProtocol, "");
				if (connection != null) {
					if (SQLOperationsBaseline.editRegimen(rb, connection, disease, regimenID)) {
						System.out.println("Successful insert RegimenBean");
					} else {
						System.out.println("Failed insert RegimenBean");
					}
				} else {
					System.out.println("Invalid connection RegimenBean");
				}
				TreatmentBean tb = BeanFactory.getTreatmentBean(true, dateStarted, cycleNumber, complications, "");
				if (connection != null) {
					if (SQLOperationsBaseline.editTreatment(tb, connection, disease, treatmentID)) {
						System.out.println("Successful insert TreatmentBean");
					} else {
						System.out.println("Failed insert TreatmentBean");
					}
				} else {
					System.out.println("Invalid connection TreatmentBean");
				}
				DiseaseStatusBean dsb = BeanFactory.getDiseaseStatusBean(diseaseStatus, "", "");
				if (connection != null) {
					if (SQLOperationsBaseline.editDiseaseStatus(dsb, connection, disease, diseaseStatusID)) {
						System.out.println("Successful insert DiseaseStatusBean");
					} else {
						System.out.println("Failed insert DiseaseStatusBean");
					}
				} else {
					System.out.println("Invalid connection DiseaseStatusBean");
				}
				HttpSession session = request.getSession(true);
				AuditBean auditBean = new AuditBean("Edit patient in Lymphoma Disease Baseline",
						request.getParameter("lastName").trim().toUpperCase() + ", " + request.getParameter("firstName").trim()
								.toUpperCase() + " " + request.getParameter("middleInitial").trim().toUpperCase(),
						(String) session.getAttribute("name"), Integer.parseInt((String) session.getAttribute("accountID")));
				SQLOperations.addAudit(auditBean, connection);
			} else {
				System.out.println("Invalid Connection resource");
			}
		} catch (NullPointerException npe) {
			System.err.println("Invalid Connection resource - " + npe.getMessage());
		} catch (Exception e) {
			System.err.println("Exception - " + e.getMessage());
		}
	}
}
