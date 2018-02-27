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

@WebServlet("/EditAAPNHMDSBaselineServlet")
public class EditAAPNHMDSBaselineServlet extends HttpServlet implements DefaultValues {
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

	public EditAAPNHMDSBaselineServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get form data

		getServletContext().log("EditAAPNHMDSBaselineServlet insert test");

		int disease = 1;

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

		// INSERT VALUES
		String addressArray[] = address.split(",");

		//get all id
		int patientID = Integer.parseInt(request.getParameter("patientIDNumber"));
		try {
			if (connection != null) {
				ResultSet patientInfo = SQLOperationsBaseline.getPatient(patientID, connection);
				patientInfo.first();

				int generalDataID = patientInfo.getInt("GeneralDataID");
				int clinicalDataID = patientInfo.getInt("ClinicalDataID");
				int laboratoryID = patientInfo.getInt("LaboratoryID");
				int treatmentID = patientInfo.getInt("TreatmentID");

				ResultSet generalData = SQLOperationsBaseline.getGeneralData(generalDataID, connection);
				generalData.first();

				int addressID = generalData.getInt("AddressID");
				int tissueSpecimenID = generalData.getInt("TissueSpecimenID");

				ResultSet clinicalData = SQLOperationsBaseline.getClinicalData(clinicalDataID, connection);
				clinicalData.first();

				int classificationID = clinicalData.getInt("ClassificationID");
				int physicalExamID = clinicalData.getInt("PhysicalExamID");

				ResultSet laboratoryProfile = SQLOperationsBaseline.getLaboratoryProfile(laboratoryID, connection);
				laboratoryProfile.first();

				int hematologyID = laboratoryProfile.getInt("HematologyID");
				int otherLaboratoriesID = laboratoryProfile.getInt("OtherLaboratoriesID");
				int boneMarrowAspirateID = laboratoryProfile.getInt("BoneMarrowAspirateID");
				int flowCytometryID = laboratoryProfile.getInt("FlowCytometryID");
				int cytogeneticMolecularAAPNHID = laboratoryProfile.getInt("CytogeneticMolecularAAPNHID");
				int cytogeneticMolecularMDSID = laboratoryProfile.getInt("CytogeneticMolecularMDSID");

				ResultSet treatment = SQLOperationsBaseline.getTreatment(treatmentID, connection);
				treatment.first();

				int chemoMedicationID = treatment.getInt("ChemoMedicationID");
				int modeOfTreatmentID = treatment.getInt("ModeOfTreatmentID");

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

				ClassificationBean csb = BeanFactory.getClassificationBean(severity);
				if (connection != null) {
					if (SQLOperationsBaseline.editClassification(csb, connection, disease, classificationID)) {
						System.out.println("Successful insert ClassificationBean");
					} else {
						System.out.println("Failed insert ClassificationBean");
					}
				} else {
					System.out.println("Invalid connection ClassificationBean");
				}

				PhysicalExamBean peb = BeanFactory.getPhysicalExamBean(height, weight, ecog, 0.0, 0.0, 0.0, false, false, "", "",
						otherFindings);
				if (connection != null) {
					if (SQLOperationsBaseline.editPhysicalExam(peb, connection, disease, physicalExamID)) {
						System.out.println("Successful insert PhysicalExamBean");
					} else {
						System.out.println("Failed insert PhysicalExamBean");
					}
				} else {
					System.out.println("Invalid connection PhysicalExamBean");
				}

				ClinicalDataBean cdb = BeanFactory.getClinicalDataBean(dateOfVisit, diagnosis, "", "", chiefComplaint, "", "",
						otherSymptoms, comorbidities, smokingHistorySpecify, alchoholIntakeSpecify, chemicalExposureSpecify,
						previousInfectionSpecify, previousHematologicDisorderSpecify, "");
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

				OtherLaboratoriesBean olb = BeanFactory.getOtherLaboratoriesBean(creatinine, uricAcid, reticulocyteCount, serumIron,
						ironBindingCapacity, serumFerritin, directAntiglobulin, indirectAntiglobulin, sgot, sgpt, ldh,
						screeningTestsForHepatitisVirusesABC, screeningTestsForEBVCMVHIV, erythropoeitinLevel, serumFolicAcid, serumB12,
						tsh);
				if (connection != null) {
					if (SQLOperationsBaseline.editOtherLaboratories(olb, connection, disease, otherLaboratoriesID)) {
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

				CytogeneticMolecularAAPNHBean cmaapnhb = BeanFactory
						.getCytogeneticMolecularAAPNHBean(cytogeneticAndMolecularAnalysisAAPNHResult);
				if (connection != null) {
					if (SQLOperationsBaseline.editCytogeneticMolecularAAPNH(cmaapnhb, connection, disease, cytogeneticMolecularAAPNHID)) {
						System.out.println("Successful insert CytogeneticAAPNHBean");
					} else {
						System.out.println("Failed insert CytogeneticAAPNHBean");
					}
				} else {
					System.out.println("Invalid connection CytogeneticAAPNHBean");
				}

				CytogeneticMolecularMDSBean cmmdsb = BeanFactory.getCytogeneticMolecularMDSBean(cytogeneticAndMolecularAnalysisMDSResult);
				if (connection != null) {
					if (SQLOperationsBaseline.editCytogeneticMolecularMDS(cmmdsb, connection, disease, cytogeneticMolecularMDSID)) {
						System.out.println("Successful insert CytogeneticMDSBean");
					} else {
						System.out.println("Failed insert CytogeneticMDSBean");
					}
				} else {
					System.out.println("Invalid connection CytogeneticMDSBean");
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

				ChemotherapyMedicationsBean cmb = BeanFactory.getChemotherapyMedicationsBean(medications);
				if (connection != null) {
					if (SQLOperationsBaseline.editChemotherapyMedications(cmb, connection, disease, chemoMedicationID)) {
						System.out.println("Successful insert ChemotherapyMedicationsBean");
					} else {
						System.out.println("Failed insert ChemotherapyMedicationsBean");
					}
				} else {
					System.out.println("Invalid connection ChemotherapyMedicationsBean");
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

				TreatmentBean tb = BeanFactory.getTreatmentBean(transplantCandidate, dateStarted, 0, "", "");
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
