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

@WebServlet("/LoadPlasmaCellBaselineServlet")
public class LoadPlasmaCellBaselineServlet extends HttpServlet {
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

	public LoadPlasmaCellBaselineServlet() {
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

				int issStagingID = clinicalDataRS.getInt("ISSStagingID");
				ResultSet issStagingRS = SQLOperationsBaseline.getISSStaging(issStagingID, connection);
				issStagingRS.first();
				patientData.put("issStaging", issStagingRS.getString("ISSStagingName"));

				patientData.put("chiefComplaint", clinicalDataRS.getString("ChiefComplaint"));
				patientData.put("constitutionalSymptoms", clinicalDataRS.getString("ConstitutionalSymptoms"));
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
				patientData.put("dose", medicationsRS.getString("Dose"));
				patientData.put("frequency", medicationsRS.getString("Frequency"));

				patientData.put("smokingHistorySpecify", clinicalDataRS.getString("SmokingHistory"));
				patientData.put("alcoholIntakeSpecify", clinicalDataRS.getString("AlcoholIntakeHistory"));
				patientData.put("chemicalExposureSpecify", clinicalDataRS.getString("ChemicalExposure"));

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

				int bloodChemistryID = laboratoryProfileRS.getInt("BloodChemistryID");
				ResultSet bloodChemistryRS = SQLOperationsBaseline.getBloodChemistry(bloodChemistryID, connection);
				bloodChemistryRS.first();
				patientData.put("bun", bloodChemistryRS.getString("BloodUreaNitrogen"));
				patientData.put("creatinine", bloodChemistryRS.getString("Creatinine"));
				patientData.put("uricAcid", bloodChemistryRS.getString("UricAcid"));
				patientData.put("iCa", bloodChemistryRS.getString("iCa"));
				patientData.put("na", bloodChemistryRS.getString("Na"));
				patientData.put("k", bloodChemistryRS.getString("K"));
				patientData.put("totalProtein", bloodChemistryRS.getString("TotalProtein"));
				patientData.put("albumin", bloodChemistryRS.getString("Albumin"));
				patientData.put("globulin", bloodChemistryRS.getString("Globulin"));
				patientData.put("beta2Microglobulin", bloodChemistryRS.getString("Beta2Microglobulin"));
				patientData.put("ldh", bloodChemistryRS.getString("LDH"));

				int imagingStudiesID = laboratoryProfileRS.getInt("ImagingStudiesID");
				ResultSet imagingStudiesRS = SQLOperationsBaseline.getImagingStudies(imagingStudiesID, connection);
				imagingStudiesRS.first();
				patientData.put("imagingStudiesResult", imagingStudiesRS.getString("Result"));

				int boneMarrowAspirateID = laboratoryProfileRS.getInt("BoneMarrowAspirateID");
				ResultSet boneMarrowAspirateRS = SQLOperationsBaseline.getBoneMarrowAspirate(boneMarrowAspirateID, connection);
				boneMarrowAspirateRS.first();
				patientData.put("boneMarrowAspirateDatePerformed", boneMarrowAspirateRS.getString("DatePerformed"));
				patientData.put("boneMarrowAspirateDescription", boneMarrowAspirateRS.getString("Result"));

				int serumFreeID = laboratoryProfileRS.getInt("SerumFreeID");
				ResultSet serumFreeRS = SQLOperationsBaseline.getSerumFree(serumFreeID, connection);
				serumFreeRS.first();
				patientData.put("serumFreeLightChainAsssayResult", serumFreeRS.getString("Result"));

				int serumProteinID = laboratoryProfileRS.getInt("SerumProteinID");
				ResultSet serumProteinRS = SQLOperationsBaseline.getSerumProtein(serumProteinID, connection);
				serumProteinRS.first();
				patientData.put("serumProteinElectrophoresisResult", serumProteinRS.getString("Result"));

				int serumImmunofixationID = laboratoryProfileRS.getInt("SerumImmunofixationID");
				ResultSet serumImmunofixationIDRS = SQLOperationsBaseline.getSerumImmunofixation(serumImmunofixationID, connection);
				serumImmunofixationIDRS.first();
				patientData.put("serumImmunofixationResult", serumImmunofixationIDRS.getString("Result"));

				int urineProteinID = laboratoryProfileRS.getInt("UrineProteinID");
				ResultSet urineProteinRS = SQLOperationsBaseline.getUrineProtein(urineProteinID, connection);
				urineProteinRS.first();
				patientData.put("urineProteinResult", urineProteinRS.getString("Result"));

				int cytogeneticMolecularID = laboratoryProfileRS.getInt("CytogeneticMolecularID");
				ResultSet cytogeneticMolecularRS = SQLOperationsBaseline.getCytogeneticMolecular(cytogeneticMolecularID, connection);
				cytogeneticMolecularRS.first();
				patientData.put("cytogeneticAndMolecularAnalysisResult", cytogeneticMolecularRS.getString("Result"));

				int treatmentID = patientInfoRS.getInt("TreatmentID");
				ResultSet treatmentRS = SQLOperationsBaseline.getTreatment(treatmentID, connection);
				treatmentRS.first();
				patientData.put("transplantCandidate", treatmentRS.getString("Transplant"));

				int modeOfTreatmentID = treatmentRS.getInt("ModeOfTreatmentID");
				ResultSet modeOfTreatmentRS = SQLOperationsBaseline.getModeOfTreatment(modeOfTreatmentID, connection);
				modeOfTreatmentRS.first();
				patientData.put("treatment", modeOfTreatmentRS.getString("ModeOfTreatment"));

				int regimenID = treatmentRS.getInt("RegimenID");
				ResultSet regimenRS = SQLOperationsBaseline.getRegimen(regimenID, connection);
				regimenRS.first();
				patientData.put("otherRegimens", regimenRS.getString("OtherRegimen"));

				int regimenTransplantID = treatmentRS.getInt("RegimenTransplantID");
				ResultSet regimenTransplantRS = SQLOperationsBaseline.getRegimenTransplant(regimenTransplantID, connection);
				regimenTransplantRS.first();
				patientData.put("regimenProtocolTransplant", regimenTransplantRS.getString("RegimenName"));
				patientData.put("otherRegimensTransplant", regimenTransplantRS.getString("OtherRegimen"));

				int regimenNonTransplantID = treatmentRS.getInt("RegimenNonTransplantID");
				ResultSet regimenNonTransplantRS = SQLOperationsBaseline.getRegimenNonTransplant(regimenNonTransplantID, connection);
				regimenNonTransplantRS.first();
				patientData.put("regimenProtocolNonTransplant", regimenNonTransplantRS.getString("RegimenName"));
				patientData.put("otherRegimensNonTransplant", regimenNonTransplantRS.getString("OtherRegimen"));

				int maintenanceTherapyID = treatmentRS.getInt("MaintenanceTherapyID");
				ResultSet maintenanceTherapyRS = SQLOperationsBaseline.getMaintenanceTherapy(maintenanceTherapyID, connection);
				maintenanceTherapyRS.first();
				patientData.put("regimenProtocolMaintenanceTherapy", maintenanceTherapyRS.getString("MaintenanceTherapyName"));
				patientData.put("otherRegimensMaintenanceTherapy", maintenanceTherapyRS.getString("OtherMaintenanceTherapy"));

				patientData.put("cycleNumber", treatmentRS.getString("CycleNumber"));

				int otherTreatmentID = patientInfoRS.getInt("OtherTreatmentID");
				ResultSet otherTreatmentRS = SQLOperationsBaseline.getOtherTreatment(otherTreatmentID, connection);
				otherTreatmentRS.first();
				patientData.put("bisphosphonatesSpecify", otherTreatmentRS.getString("Bisphosphonates"));
				patientData.put("radiotherapyDoseAndFrequency", otherTreatmentRS.getString("Radiotherapy"));
				patientData.put("otherMedications", otherTreatmentRS.getString("OtherMedications"));

				patientData.put("dateStarted", treatmentRS.getString("DateStarted"));
				patientData.put("complications", treatmentRS.getString("Complications"));

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
