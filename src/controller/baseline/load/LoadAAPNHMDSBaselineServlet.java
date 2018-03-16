package controller.baseline.load;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import model.AuditBean;
import utility.database.SQLOperations;
import utility.database.SQLOperationsBaseline;
import utility.database.Security;

@WebServlet("/LoadAAPNHMDSBaselineServlet")
public class LoadAAPNHMDSBaselineServlet extends HttpServlet {
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

	public LoadAAPNHMDSBaselineServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		Map<String, String> patientData = new LinkedHashMap<>();

		int patientID = Integer.parseInt(request.getParameter("patientID"));
		patientData.put("patientID", Integer.toString(patientID));

		try {
			if (connection != null) {

				ResultSet patientInfoRS = SQLOperationsBaseline.getPatient(patientID, connection);
				patientInfoRS.first();
				patientData.put("patientIDNumber", patientInfoRS.getString("PatientID"));

				int generalDataID = patientInfoRS.getInt("GeneralDataID");
				ResultSet generalDataRS = SQLOperationsBaseline.getGeneralData(generalDataID, connection);
				generalDataRS.first();
				patientData.put("lastName", Security.decrypt(generalDataRS.getString("LastName")));
				patientData.put("firstName", Security.decrypt(generalDataRS.getString("FirstName")));
				patientData.put("middleInitial", Security.decrypt(generalDataRS.getString("MiddleName")));
				patientData.put("gender", generalDataRS.getString("Gender"));
				patientData.put("dateOfBirth", generalDataRS.getString("DateOfBirthDec"));

				int addressID = generalDataRS.getInt("AddressID");
				ResultSet addressRS = SQLOperationsBaseline.getAddress(addressID, connection);
				addressRS.first();

				String StreetAddress = Security.decrypt(addressRS.getString("StreetAddress"));
				String City = Security.decrypt(addressRS.getString("City"));
				String ZIPCode = Security.decrypt(addressRS.getString("ZIPCode"));
				patientData.put("address", StreetAddress + "," + City + "," + ZIPCode);

				patientData.put("dateOfEntry", generalDataRS.getString("DateOfEntryDec"));

				int tissueSpecimenID = generalDataRS.getInt("TissueSpecimenID");
				ResultSet tissueSpecimenRS = SQLOperationsBaseline.getTissueSpecimen(tissueSpecimenID, connection);
				tissueSpecimenRS.first();
				patientData.put("specimenType", tissueSpecimenRS.getString("TissueSpecimenName"));

				int clinicalDataID = patientInfoRS.getInt("ClinicalDataID");
				ResultSet clinicalDataRS = SQLOperationsBaseline.getClinicalData(clinicalDataID, connection);
				clinicalDataRS.first();
				patientData.put("dateOfVisit", clinicalDataRS.getString("DateOfVisitDec"));
				patientData.put("diagnosis", clinicalDataRS.getString("Diagnosis"));

				int classificationID = clinicalDataRS.getInt("ClassificationID");
				ResultSet classificationRS = SQLOperationsBaseline.getClassification(classificationID, connection);
				classificationRS.first();
				patientData.put("severity", classificationRS.getString("ClassificationName"));

				patientData.put("chiefComplaint", clinicalDataRS.getString("ChiefComplaint"));
				patientData.put("otherSymptoms", clinicalDataRS.getString("OtherSymptoms"));

				ResultSet familyCancerRS = SQLOperationsBaseline.getFamilyCancer(clinicalDataID, connection);
				familyCancerRS.first();
				patientData.put("relationshipToPatient", familyCancerRS.getString("RelationshipToPatient"));
				patientData.put("specifyCancer", familyCancerRS.getString("CancerName"));

				ResultSet otherDiseasesRS = SQLOperationsBaseline.getOtherDiseases(clinicalDataID, connection);
				otherDiseasesRS.first();
				patientData.put("otherDiseasesInTheFamily", otherDiseasesRS.getString("OtherDiseases"));

				patientData.put("comorbidities", clinicalDataRS.getString("Comorbidities"));

				//get medications
				ResultSet medicationsRS = SQLOperationsBaseline.getMedications(clinicalDataID, connection);
				medicationsRS.first();

				patientData.put("genericName", medicationsRS.getString("GenericName"));
				String dose = medicationsRS.getString("Dose");
				if (dose.equals("0")) {
					dose = "";
				}
				patientData.put("dose", dose);
				patientData.put("frequency", medicationsRS.getString("Frequency"));

				patientData.put("smokingHistorySpecify", clinicalDataRS.getString("SmokingHistory"));
				patientData.put("alcoholIntakeSpecify", clinicalDataRS.getString("AlcoholIntakeHistory"));
				patientData.put("chemicalExposureSpecify", clinicalDataRS.getString("ChemicalExposure"));
				patientData.put("previousInfectionSpecify", clinicalDataRS.getString("PreviousInfection"));
				patientData.put("previousHematologicDisorderSpecify", clinicalDataRS.getString("PreviousHematologicDisorder"));

				int physicalExamID = clinicalDataRS.getInt("PhysicalExamID");
				ResultSet physicalExamRS = SQLOperationsBaseline.getPhysicalExam(physicalExamID, connection);
				physicalExamRS.first();
				patientData.put("height", physicalExamRS.getString("Height"));
				patientData.put("weight", physicalExamRS.getString("Weight"));
				patientData.put("ecog", physicalExamRS.getString("ECOG"));
				patientData.put("otherFindings", physicalExamRS.getString("OtherFindings"));

				//get laboratory profile
				int laboratoryID = patientInfoRS.getInt("LaboratoryID");
				ResultSet laboratoryProfileRS = SQLOperationsBaseline.getLaboratoryProfile(laboratoryID, connection);
				laboratoryProfileRS.first();
				patientData.put("dateOfBloodCollection", laboratoryProfileRS.getString("DateOfBloodCollection"));

				int hematologyID = laboratoryProfileRS.getInt("HematologyID");
				ResultSet hematologyRS = SQLOperationsBaseline.getHematology(hematologyID, connection);
				hematologyRS.first();
				patientData.put("hemoglobin", hematologyRS.getString("Hemoglobin"));
				patientData.put("hematocrit", hematologyRS.getString("hematocrit"));
				patientData.put("whiteBloodCells", hematologyRS.getString("whiteBloodCells"));
				patientData.put("neutrophils", hematologyRS.getString("neutrophils"));
				patientData.put("lymphocytes", hematologyRS.getString("lymphocytes"));
				patientData.put("monocytes", hematologyRS.getString("monocytes"));
				patientData.put("eosinophils", hematologyRS.getString("eosinophils"));
				patientData.put("basophils", hematologyRS.getString("basophils"));
				patientData.put("myelocytes", hematologyRS.getString("myelocytes"));
				patientData.put("metamyelocytes", hematologyRS.getString("metamyelocytes"));
				patientData.put("blasts", hematologyRS.getString("blasts"));
				patientData.put("plateletCount", hematologyRS.getString("plateletCount"));

				int otherLaboratoriesID = laboratoryProfileRS.getInt("OtherLaboratoriesID");
				ResultSet otherLaboratoriesRS = SQLOperationsBaseline.getOtherLaboratoriesAAPNHMDS(otherLaboratoriesID, connection);
				otherLaboratoriesRS.first();
				patientData.put("creatinine", otherLaboratoriesRS.getString("Creatinine"));
				patientData.put("uricAcid", otherLaboratoriesRS.getString("UricAcid"));
				patientData.put("reticulocyteCount", otherLaboratoriesRS.getString("ReticulocyteCount"));
				patientData.put("serumIron", otherLaboratoriesRS.getString("SerumIron"));
				patientData.put("ironBindingCapacity", otherLaboratoriesRS.getString("IronbindingCapacity"));
				patientData.put("serumFerritin", otherLaboratoriesRS.getString("SerumFerritin"));
				patientData.put("directAntiglobulin", otherLaboratoriesRS.getString("DirectAntiglobulin"));
				patientData.put("indirectAntiglobulin", otherLaboratoriesRS.getString("IndirectAntiglobulin"));
				patientData.put("sgot", otherLaboratoriesRS.getString("SGOT"));
				patientData.put("sgpt", otherLaboratoriesRS.getString("SGPT"));
				patientData.put("ldh", otherLaboratoriesRS.getString("LDH"));
				patientData.put("screeningTestsForHepatitisVirusesABC", otherLaboratoriesRS.getString("ScreenTestHepatitis"));
				patientData.put("screeningTestsForEBVCMVHIV", otherLaboratoriesRS.getString("ScreenTestEBVCytomegalovirusHIV"));
				patientData.put("erythropoeitinLevel", otherLaboratoriesRS.getString("ErythropeitinLevel"));
				patientData.put("serumFolicAcid", otherLaboratoriesRS.getString("SerumFolicAcid"));
				patientData.put("serumB12", otherLaboratoriesRS.getString("SerumB12"));
				patientData.put("tsh", otherLaboratoriesRS.getString("TSH"));

				int boneMarrowAspirateID = laboratoryProfileRS.getInt("BoneMarrowAspirateID");
				ResultSet boneMarrowAspirateRS = SQLOperationsBaseline.getBoneMarrowAspirate(boneMarrowAspirateID, connection);
				boneMarrowAspirateRS.first();
				patientData.put("boneMarrowAspirateDatePerformed", boneMarrowAspirateRS.getString("DatePerformed"));
				patientData.put("boneMarrowAspirateDescription", boneMarrowAspirateRS.getString("Result"));

				int flowCytometryID = laboratoryProfileRS.getInt("FlowCytometryID");
				ResultSet flowCytometryRS = SQLOperationsBaseline.getFlowCytometry(flowCytometryID, connection);
				flowCytometryRS.first();
				patientData.put("flowCytometryResult", flowCytometryRS.getString("Result"));

				int cytogeneticMolecularAAPNHID = laboratoryProfileRS.getInt("CytogeneticMolecularAAPNHID");
				ResultSet cytogeneticMolecularAAPNHRS = SQLOperationsBaseline.getCytogeneticMolecularAAPNH(cytogeneticMolecularAAPNHID,
						connection);
				cytogeneticMolecularAAPNHRS.first();
				patientData.put("cytogeneticAndMolecularAnalysisAAPNHResult", cytogeneticMolecularAAPNHRS.getString("Result"));

				int cytogeneticMolecularMDSID = laboratoryProfileRS.getInt("CytogeneticMolecularMDSID");
				ResultSet cytogeneticMolecularMDSRS = SQLOperationsBaseline.getCytogeneticMolecularMDSAAPNH(cytogeneticMolecularMDSID,
						connection);
				cytogeneticMolecularMDSRS.first();
				patientData.put("cytogeneticAndMolecularAnalysisMDSResult", cytogeneticMolecularMDSRS.getString("Result"));

				int treatmentID = patientInfoRS.getInt("TreatmentID");
				ResultSet treatmentRS = SQLOperationsBaseline.getTreatment(treatmentID, connection);
				treatmentRS.first();
				patientData.put("transplantCandidate", treatmentRS.getString("Transplant"));
				patientData.put("dateStarted", treatmentRS.getString("DateStarted"));

				int chemoMedicationID = treatmentRS.getInt("ChemoMedicationID");
				ResultSet chemoMedicationRS = SQLOperationsBaseline.getChemoMedication(chemoMedicationID, connection);
				chemoMedicationRS.first();
				patientData.put("medications", chemoMedicationRS.getString("MedicationName"));

				int modeOfTreatmentID = treatmentRS.getInt("ModeOfTreatmentID");
				ResultSet modeOfTreatmentRS = SQLOperationsBaseline.getModeOfTreatment(modeOfTreatmentID, connection);
				modeOfTreatmentRS.first();

				String modeOfTreatment = modeOfTreatmentRS.getString("NameOfTreatment");

				if (modeOfTreatment.contains("&#40;") || modeOfTreatment.contains("&#41;")) {
					modeOfTreatment = modeOfTreatment.replaceAll("&#40;", "(");
					modeOfTreatment = modeOfTreatment.replaceAll("&#41;", ")");
				}

				patientData.put("modeOfTreatment", modeOfTreatment);

				int diseaseStatusID = patientInfoRS.getInt("DiseaseStatusID");
				ResultSet diseaseStatusRS = SQLOperationsBaseline.getDiseaseStatus(diseaseStatusID, connection);
				diseaseStatusRS.first();

				String diseaseStatus = diseaseStatusRS.getString("DiseaseStatus");
				String diseaseStatusOthers = diseaseStatusRS.getString("OtherDisease");

				if (diseaseStatus.contains("&#40;") || diseaseStatus.contains("&#41;")) {
					diseaseStatus = diseaseStatus.replaceAll("&#40;", "(");
					diseaseStatus = diseaseStatus.replaceAll("&#41;", ")");
				}

				if (diseaseStatusOthers.contains("&#40;") || diseaseStatusOthers.contains("&#41;")) {
					diseaseStatusOthers = diseaseStatusOthers.replaceAll("&#40;", "(");
					diseaseStatusOthers = diseaseStatusOthers.replaceAll("&#41;", ")");
				}

				patientData.put("diseaseStatus", diseaseStatus);
				patientData.put("diseaseStatusOthers", diseaseStatusOthers);

				HttpSession session = request.getSession(true);

				AuditBean auditBean = new AuditBean("Load patient in AA PNH MDS Baseline",
						Security.decrypt(generalDataRS.getString("LastName")) + ", "
								+ Security.decrypt(generalDataRS.getString("FirstName")) + " "
								+ Security.decrypt(generalDataRS.getString("MiddleName")),
						(String) session.getAttribute("name"), Integer.parseInt((String) session.getAttribute("accountID")));
				SQLOperations.addAudit(auditBean, connection);

				//return data to js
				String json = new Gson().toJson(patientData);
				response.getWriter().write(json);

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
