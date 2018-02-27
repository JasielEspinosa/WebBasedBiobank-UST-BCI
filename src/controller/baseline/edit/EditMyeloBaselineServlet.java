package controller.baseline.edit;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.*;
import utility.database.SQLOperationsBaseline;
import utility.factory.BeanFactory;
import utility.values.DefaultValues;

@WebServlet("/EditMyeloBaselineServlet")
public class EditMyeloBaselineServlet extends HttpServlet implements DefaultValues {
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

	public EditMyeloBaselineServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get form data

		getServletContext().log("EditMyeloBaselineServlet insert test");

		int disease = 5;

		// GENERAL DATA
		String lastName = request.getParameter("lastName");
		String firstName = request.getParameter("firstName");
		String middleInitial = request.getParameter("middleInitial");
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
		String diagnosisOthers = noValue;
		if (diagnosis.equals("Others")) {
			diagnosisOthers = request.getParameter("diagnosisOthers");
		}

		String prognosticRiskScoring = request.getParameter("prognosticRiskScoring");
		String prognosticRiskScoringOthers = noValue;
		if (prognosticRiskScoring.equals("Others")) {
			prognosticRiskScoringOthers = request.getParameter("prognosticRiskScoringOthers");
		}

		String riskScoreName = request.getParameter("riskScore");
		String riskScoreOthers = noValue;
		if (riskScoreName.equals("Others")) {
			riskScoreOthers = request.getParameter("riskScoreOthers");
		}

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
		String thrombosisHistorySpecify = request.getParameter("thrombosisHistorySpecify");

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
		double sgot = Double.parseDouble(request.getParameter("sgot"));
		double sgpt = Double.parseDouble(request.getParameter("sgpt"));
		double ldh = Double.parseDouble(request.getParameter("ldh"));
		double epoLevel = Double.parseDouble(request.getParameter("epoLevel"));

		String boneMarrowAspirateDatePerformed = noValue;
		String boneMarrowAspirateDescription = noValue;
		// Part boneMarrowAspirateAttachScannedDocument;
		if (Integer.parseInt(request.getParameter("boneMarrowAspirate")) == 1) {
			boneMarrowAspirateDatePerformed = request.getParameter("boneMarrowAspirateDatePerformed");
			boneMarrowAspirateDescription = request.getParameter("boneMarrowAspirateDescription");
			//boneMarrowAspirateAttachScannedDocument = request.getPart("boneMarrowAspirateAttachScannedDocument");
		}

		String molecularAnalysisResult = noValue;
		if (Integer.parseInt(request.getParameter("molecularAnalysis")) == 1) {
			molecularAnalysisResult = request.getParameter("molecularAnalysisResult");
		}

		// TREATMENT / THERAPHY AND RESPONSE
		String modeOfTreatment = request.getParameter("treatment");
		String medications = request.getParameter("medications");
		String dateStarted = request.getParameter("dateStarted");

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

				int prognosticRiskScoringID = clinicalData.getInt("PrognosticRiskScoringID");
				int riskScoreID = clinicalData.getInt("RiskScoreID");
				int physicalExamID = clinicalData.getInt("PhysicalExamID");

				int laboratoryID = patientInfo.getInt("LaboratoryID");
				ResultSet laboratoryProfile = SQLOperationsBaseline.getLaboratoryProfile(laboratoryID, connection);
				laboratoryProfile.first();

				int hematologyID = laboratoryProfile.getInt("HematologyID");
				int bloodChemistryID = laboratoryProfile.getInt("BloodChemistryID");
				int boneMarrowAspirateID = laboratoryProfile.getInt("BoneMarrowAspirateID");
				int cytogeneticMolecularID = laboratoryProfile.getInt("CytogeneticMolecularID");

				int treatmentID = patientInfo.getInt("TreatmentID");
				ResultSet treatment = SQLOperationsBaseline.getTreatment(treatmentID, connection);
				treatment.first();

				int modeOfTreatmentID = treatment.getInt("ModeOfTreatmentID");
				int chemoMedicationID = treatment.getInt("ChemoMedicationID");

				//start of edit
				AddressBean ab = BeanFactory.getAddressBean(addressArray[0], addressArray[1], addressArray[2]);
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

				GeneralDataBean gdb = BeanFactory.getGeneralDataBean(lastName, firstName, middleInitial, gender, dateOfBirth, dateOfEntry);
				if (connection != null) {
					if (SQLOperationsBaseline.editGeneralData(gdb, connection, disease, generalDataID)) {
						System.out.println("Successful insert GeneralDataBean");
					} else {
						System.out.println("Failed insert GeneralDataBean");
					}
				} else {
					System.out.println("Invalid connection GeneralDataBean");
				}

				PrognosticRiskScoringBean prsb = BeanFactory.getPrognosticRiskScoringBean(prognosticRiskScoring, prognosticRiskScoringOthers);
				if (connection != null) {
					if (SQLOperationsBaseline.editPrognosticRiskScoring(prsb, connection, disease, prognosticRiskScoringID)) {
						System.out.println("Successful insert PrognosticRiskScoringBean");
					} else {
						System.out.println("Failed insert PrognosticRiskScoringBean");
					}
				} else {
					System.out.println("Invalid connection PrognosticRiskScoringBean");
				}

				RiskScoreBean rsb = BeanFactory.getRiskScoreBean(riskScoreName, riskScoreOthers);
				if (connection != null) {
					if (SQLOperationsBaseline.editRiskScore(rsb, connection, disease, riskScoreID)) {
						System.out.println("Successful insert RiskScoreBean");
					} else {
						System.out.println("Failed insert RiskScoreBean");
					}
				} else {
					System.out.println("Invalid connection RiskScoreBean");
				}

				PhysicalExamBean peb = BeanFactory.getPhysicalExamBean(height, weight, ecog, splenomegaly, hepatomegaly, lymphadenopathies,
						false, false, thrombosisHistorySpecify, "", otherFindings);
				if (connection != null) {
					if (SQLOperationsBaseline.editPhysicalExam(peb, connection, disease, physicalExamID)) {
						System.out.println("Successful insert PhysicalExamBean");
					} else {
						System.out.println("Failed insert PhysicalExamBean");
					}
				} else {
					System.out.println("Invalid connection PhysicalExamBean");
				}

				ClinicalDataBean cdb = BeanFactory.getClinicalDataBean(dateOfInitialDiagnosis, diagnosis, diagnosisOthers, "", chiefComplaint, "",
						constitutionalSymptoms, otherSymptoms, comorbidities, smokingHistorySpecify, alchoholIntakeSpecify, chemicalExposureSpecify,
						"", "", otherFindings);
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

				BloodChemistryBean bcb = BeanFactory.getBloodChemistryBean(0.0, creatinine, uricAcid, sgot, sgpt, ldh, epoLevel, 0.0, 0.0,
						0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
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

				CytogeneticMolecularBean cmb = BeanFactory.getCytogeneticMolecularBean(molecularAnalysisResult);
				if (connection != null) {
					if (SQLOperationsBaseline.editCytogeneticMolecular(cmb, connection, disease, cytogeneticMolecularID)) {
						System.out.println("Successful insert CytogeneticMolecularBean");
					} else {
						System.out.println("Failed insert CytogeneticMolecularBean");
					}
				} else {
					System.out.println("Invalid connection CytogeneticMolecularBean");
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

				ChemotherapyMedicationsBean chmb = BeanFactory.getChemotherapyMedicationsBean(medications);
				if (connection != null) {
					if (SQLOperationsBaseline.editChemotherapyMedications(chmb, connection, disease, chemoMedicationID)) {
						System.out.println("Successful insert ChemotherapyMedicationsBean");
					} else {
						System.out.println("Failed insert ChemotherapyMedicationsBean");
					}
				} else {
					System.out.println("Invalid connection ChemotherapyMedicationsBean");
				}

				TreatmentBean tb = BeanFactory.getTreatmentBean(true, dateStarted, 0, "", "");
				if (connection != null) {
					if (SQLOperationsBaseline.editTreatment(tb, connection, disease, treatmentID)) {
						System.out.println("Successful insert TreatmentBean");
					} else {
						System.out.println("Failed insert TreatmentBean");
					}
				} else {
					System.out.println("Invalid connection TreatmentBean");
				}

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
