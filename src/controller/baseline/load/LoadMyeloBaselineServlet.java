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

import com.google.gson.Gson;

import utility.database.SQLOperationsBaseline;
import utility.database.Security;

/** Servlet implementation class LoadAAPHSMDSBaselineServlet */
@WebServlet("/LoadMyeloBaselineServlet")
public class LoadMyeloBaselineServlet extends HttpServlet {
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

	public LoadMyeloBaselineServlet() {
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
				patientData.put("dateOfBirth", generalDataRS.getString("DateOfBirth"));

				int addressID = generalDataRS.getInt("AddressID");
				ResultSet addressRS = SQLOperationsBaseline.getAddress(addressID, connection);
				addressRS.first();

				String StreetAddress = addressRS.getString("StreetAddress");
				String City = addressRS.getString("City");
				String ZIPCode = addressRS.getString("ZIPCode");
				patientData.put("address", StreetAddress + "," + City + "," + ZIPCode);

				patientData.put("dateOfEntry", generalDataRS.getString("DateOfEntry"));

				int tissueSpecimenID = generalDataRS.getInt("TissueSpecimenID");
				ResultSet tissueSpecimenRS = SQLOperationsBaseline.getTissueSpecimen(tissueSpecimenID, connection);
				tissueSpecimenRS.first();
				patientData.put("specimenType", tissueSpecimenRS.getString("TissueSpecimenName"));

				int clinicalDataID = patientInfoRS.getInt("ClinicalDataID");
				ResultSet clinicalDataRS = SQLOperationsBaseline.getClinicalData(clinicalDataID, connection);
				clinicalDataRS.first();
				patientData.put("dateOfInitialDiagnosis", clinicalDataRS.getString("DateOfVisit"));
				patientData.put("diagnosis", clinicalDataRS.getString("Diagnosis"));
				patientData.put("diagnosisOthers", clinicalDataRS.getString("OtherDiagnosis"));

				int prognosticRiskScoringID = clinicalDataRS.getInt("PrognosticRiskScoringID");
				ResultSet prognosticRiskScoringRS = SQLOperationsBaseline.getPrognosticRiskScoring(prognosticRiskScoringID, connection);
				prognosticRiskScoringRS.first();
				patientData.put("prognosticRiskScoring", prognosticRiskScoringRS.getString("PrognosticRiskScoringName"));
				patientData.put("prognosticRiskScoringOthers", prognosticRiskScoringRS.getString("OtherPrognosticRiskScoring"));

				int riskScoreID = clinicalDataRS.getInt("RiskScoreID");
				ResultSet riskScoreRS = SQLOperationsBaseline.getRiskScore(riskScoreID, connection);
				riskScoreRS.first();
				patientData.put("riskScore", riskScoreRS.getString("RiskScoreName"));
				patientData.put("riskScoreOthers", riskScoreRS.getString("OtherRiskScore"));

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

				int physicalExamID = clinicalDataRS.getInt("PhysicalExamID");
				ResultSet physicalExamRS = SQLOperationsBaseline.getPhysicalExam(physicalExamID, connection);
				physicalExamRS.first();
				patientData.put("thrombosisHistorySpecify", physicalExamRS.getString("ThrombosisHistory"));

				//get medications
				ResultSet medicationsRS = SQLOperationsBaseline.getMedications(clinicalDataID, connection);
				medicationsRS.first();

				patientData.put("genericName", medicationsRS.getString("GenericName"));
				patientData.put("dose", medicationsRS.getString("Dose"));
				patientData.put("frequency", medicationsRS.getString("Frequency"));

				patientData.put("smokingHistorySpecify", clinicalDataRS.getString("SmokingHistory"));
				patientData.put("alcoholIntakeSpecify", clinicalDataRS.getString("AlcoholIntakeHistory"));
				patientData.put("chemicalExposureSpecify", clinicalDataRS.getString("ChemicalExposure"));

				patientData.put("height", physicalExamRS.getString("Height"));
				patientData.put("weight", physicalExamRS.getString("Weight"));
				patientData.put("ecog", physicalExamRS.getString("ECOG"));
				patientData.put("presenceOfSplenomegaly", physicalExamRS.getString("Splenomegaly"));
				patientData.put("presenceOfHepatomegaly", physicalExamRS.getString("Hepatomegaly"));
				patientData.put("presenceOfLymphadenopathies", physicalExamRS.getString("Lymphadenopathies"));
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

				int bloodChemistryID = laboratoryProfileRS.getInt("BloodChemistryID");
				ResultSet bloodChemistryRS = SQLOperationsBaseline.getBloodChemistry(bloodChemistryID, connection);
				bloodChemistryRS.first();
				patientData.put("creatinine", bloodChemistryRS.getString("Creatinine"));
				patientData.put("uricAcid", bloodChemistryRS.getString("UricAcid"));
				patientData.put("sgot", bloodChemistryRS.getString("SGOT"));
				patientData.put("sgpt", bloodChemistryRS.getString("SGPT"));
				patientData.put("ldh", bloodChemistryRS.getString("LDH"));
				patientData.put("epoLevel", bloodChemistryRS.getString("EPOLevel"));

				int boneMarrowAspirateID = laboratoryProfileRS.getInt("BoneMarrowAspirateID");
				ResultSet boneMarrowAspirateRS = SQLOperationsBaseline.getBoneMarrowAspirate(boneMarrowAspirateID, connection);
				boneMarrowAspirateRS.first();
				patientData.put("boneMarrowAspirateDatePerformed", boneMarrowAspirateRS.getString("DatePerformed"));
				patientData.put("boneMarrowAspirateDescription", boneMarrowAspirateRS.getString("Result"));

				int cytogeneticMolecularID = laboratoryProfileRS.getInt("CytogeneticMolecularID");
				ResultSet cytogeneticMolecularRS = SQLOperationsBaseline.getCytogeneticMolecular(cytogeneticMolecularID, connection);
				cytogeneticMolecularRS.first();
				patientData.put("molecularAnalysisResult", cytogeneticMolecularRS.getString("Result"));

				int treatmentID = patientInfoRS.getInt("TreatmentID");
				ResultSet treatmentRS = SQLOperationsBaseline.getTreatment(treatmentID, connection);
				treatmentRS.first();

				int modeOfTreatmentID = treatmentRS.getInt("ModeOfTreatmentID");
				ResultSet modeOfTreatmentRS = SQLOperationsBaseline.getModeOfTreatment(modeOfTreatmentID, connection);
				modeOfTreatmentRS.first();
				patientData.put("treatment", modeOfTreatmentRS.getString("ModeOfTreatment"));

				int chemoMedicationID = treatmentRS.getInt("ChemoMedicationID");
				ResultSet chemoMedicationRS = SQLOperationsBaseline.getChemoMedication(chemoMedicationID, connection);
				chemoMedicationRS.first();
				patientData.put("medications", chemoMedicationRS.getString("MedicationName"));

				patientData.put("dateStarted", treatmentRS.getString("DateStarted"));

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
