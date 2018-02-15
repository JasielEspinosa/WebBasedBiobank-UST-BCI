package controller;

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

/**
 * Servlet implementation class LoadAAPHSMDSBaselineServlet
 */
@WebServlet("/LoadAAPHSMDSBaselineServlet")
public class LoadAAPHSMDSBaselineServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private Connection connection;

	public void init()
			throws ServletException {
		connection = SQLOperationsBaseline.getConnection();

		if (connection != null) {
			getServletContext().setAttribute("dbConnection", connection);
			System.out.println("connection is READY.");
		} else {
			System.err.println("connection is NULL.");
		}
	}
		
    public LoadAAPHSMDSBaselineServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json"); 
	    Map<String, String> patientData = new LinkedHashMap<>();
		
		int patientId = Integer.parseInt(request.getParameter("patientId"));
		patientData.put("patientId", Integer.toString(patientId));
		
		try {	
			if (connection != null) {		
				
				//get patient table
				ResultSet patientInfo = SQLOperationsBaseline.getPatient(patientId, connection); 			
				patientInfo.first();
				
				int generalDataId = patientInfo.getInt("generalDataId");
				int clinicalDataId = patientInfo.getInt("clinicalDataId");
				int laboratoryId = patientInfo.getInt("laboratoryId");
				int treatmentId = patientInfo.getInt("treatmentId");
				//end get patient table 	
				
				//get general data
				ResultSet generalData = SQLOperationsBaseline.getGeneralData(generalDataId, connection);
				generalData.first();
				
				patientData.put("lastName", generalData.getString("LastName"));
				patientData.put("middleInitial", generalData.getString("MiddleName"));
				patientData.put("firstName", generalData.getString("FirstName"));
				patientData.put("gender", generalData.getString("Gender"));
				patientData.put("dateOfBirth", generalData.getString("DateOfBirth"));
				patientData.put("dateOfEntry", generalData.getString("DateOfEntry"));
				
				int addressId = generalData.getInt("AddressID");
				ResultSet address = SQLOperationsBaseline.getAddress(addressId, connection);
				address.first();
				
				String StreetAddress = address.getString("StreetAddress");
				String City = address.getString("City");
				String ZIPCode = address.getString("ZIPCode");
				patientData.put("address", StreetAddress + "," + City +"," +ZIPCode);

				int tissueSpecimenId = generalData.getInt("TissueSpecimenID");
				ResultSet tissueSpecimen = SQLOperationsBaseline.getTissueSpecimen(tissueSpecimenId, connection);
				tissueSpecimen.first();
				
				patientData.put("specimenType", tissueSpecimen.getString("TissueSpecimenName"));
				
				//get clinical data
				ResultSet clinicalData = SQLOperationsBaseline.getClinicalData(clinicalDataId, connection);
				clinicalData.first();
				
				int classificationId = clinicalData.getInt("ClassificationID");
				int physicalExamId = clinicalData.getInt("physicalExamId");
				patientData.put("dateOfVisit", clinicalData.getString("DateOfVisit"));
				patientData.put("diagnosis", clinicalData.getString("Diagnosis"));
				patientData.put("chiefComplaint", clinicalData.getString("ChiefComplaint"));
				patientData.put("otherSymptoms", clinicalData.getString("OtherSymptoms"));
				patientData.put("comorbidities", clinicalData.getString("Combordities"));
				patientData.put("smokingHistorySpecify", clinicalData.getString("SmokingHistory"));
				patientData.put("alchoholIntakeSpecify", clinicalData.getString("AlcoholIntakeHistory"));
				patientData.put("chemicalExposureSpecify", clinicalData.getString("ChemicalExposure"));
				patientData.put("previousInfectionSpecify", clinicalData.getString("PreviousInfection"));
				patientData.put("previousHematologicDisorderSpecify", clinicalData.getString("PreviousHematologicDisorder"));
				
				ResultSet classification = SQLOperationsBaseline.getClassification(classificationId, connection);
				classification.first();
				
				patientData.put("severity", classification.getString("ClassificationName"));
				
				ResultSet physicalExam = SQLOperationsBaseline.getPhysicalExam(physicalExamId, connection);
				physicalExam.first();
				
				patientData.put("height", physicalExam.getString("Height"));
				patientData.put("weight", physicalExam.getString("Weight"));
				patientData.put("ecog", physicalExam.getString("ECOG"));
				patientData.put("otherFindings", physicalExam.getString("OtherFindings"));
				
				//get family cancer
				ResultSet familyCancer = SQLOperationsBaseline.getFamilyCancer(clinicalDataId, connection);
				familyCancer.first();
				
				patientData.put("relationshipToPatient", familyCancer.getString("RelationshipToPatient"));
				patientData.put("cancerName", familyCancer.getString("CancerName"));
				
				//get other diseases
				ResultSet otherDiseases = SQLOperationsBaseline.getOtherDiseases(clinicalDataId, connection);
				otherDiseases.first();
				
				patientData.put("otherDiseasesInTheFamily", otherDiseases.getString("OtherDiseases"));
				
				//get medications
				ResultSet medications = SQLOperationsBaseline.getMedications(clinicalDataId, connection);
				medications.first();
				
				patientData.put("genericName", medications.getString("GenericName"));
				patientData.put("dose", medications.getString("Dose"));
				patientData.put("frequency", medications.getString("Frequency"));
				
				//get laboratory profile
				ResultSet laboratoryProfile = SQLOperationsBaseline.getLaboratoryProfile(laboratoryId, connection);
				laboratoryProfile.first();
				patientData.put("dateOfBloodCollection", laboratoryProfile.getString("DateOfBloodCollection"));
				
				int hematologyId = laboratoryProfile.getInt("hematologyId");
				int otherLaboratoriesId = laboratoryProfile.getInt("otherLaboratoriesId");
				int boneMarrowAspirateId = laboratoryProfile.getInt("boneMarrowAspirateId");
				int flowCytometryId = laboratoryProfile.getInt("FlowCytometryID");
				int cytogeneticAAPNHId = laboratoryProfile.getInt("CytogeneticMolecularAAPNHID");
				int cytogeneticMDSId = laboratoryProfile.getInt("CytogeneticMolecularMDSID");
				
				ResultSet hematology = SQLOperationsBaseline.getHematology(hematologyId, connection);
				hematology.first();
				
				patientData.put("hemoglobin", hematology.getString("Hemoglobin"));
				patientData.put("hematocrit", hematology.getString("hematocrit"));
				patientData.put("whiteBloodCells", hematology.getString("whiteBloodCells"));
				patientData.put("neutrophils", hematology.getString("neutrophils"));
				patientData.put("lymphocytes", hematology.getString("lymphocytes"));
				patientData.put("monocytes", hematology.getString("monocytes"));
				patientData.put("eosinophils", hematology.getString("eosinophils"));
				patientData.put("basophils", hematology.getString("basophils"));
				patientData.put("myelocytes", hematology.getString("myelocytes"));
				patientData.put("metamyelocytes", hematology.getString("metamyelocytes"));
				patientData.put("blasts", hematology.getString("blasts"));
				patientData.put("plateletCount", hematology.getString("plateletCount"));

				
				ResultSet otherLaboratories = SQLOperationsBaseline.getOtherLaboratoriesAAPNHMDS(otherLaboratoriesId, connection);
				otherLaboratories.first();
				
				patientData.put("creatinine", otherLaboratories.getString("Creatinine"));
				patientData.put("uricAcid", otherLaboratories.getString("UricAcid"));
				patientData.put("reticulocyteCount", otherLaboratories.getString("ReticulocyteCount"));
				patientData.put("serumIron", otherLaboratories.getString("SerumIron"));
				patientData.put("ironBindingCapacity", otherLaboratories.getString("IronbindingCapacity"));
				patientData.put("serumFerritin", otherLaboratories.getString("SerrumFerritin"));
				patientData.put("directAntiglobulin", otherLaboratories.getString("DirectAntiglobulin"));
				patientData.put("indirectAntiglobulin", otherLaboratories.getString("IndirectAntiglobulin"));
				patientData.put("sgot", otherLaboratories.getString("SGOT"));
				patientData.put("sgpt", otherLaboratories.getString("SGPT"));
				patientData.put("ldh", otherLaboratories.getString("LDH"));
				patientData.put("screeningTestsForHepatitisVirusesABC", otherLaboratories.getString("ScreenTestHepatitis"));
				patientData.put("screeningTestsForEBVCMVHIV", otherLaboratories.getString("ScreenTestEBVCytomegalovirusHIV"));
				patientData.put("erythropoeitinLevel", otherLaboratories.getString("ErythropeitinLevel"));
				patientData.put("serumFolicAcid", otherLaboratories.getString("SerumFolicAcid"));
				patientData.put("serumB12", otherLaboratories.getString("SerumB12"));
				patientData.put("tsh", otherLaboratories.getString("TSH"));

				ResultSet boneMarrowAspirate = SQLOperationsBaseline.getBoneMarrowAspirate(boneMarrowAspirateId, connection);
				boneMarrowAspirate.first();
				
				patientData.put("boneMarrowAspirateDatePerformed", boneMarrowAspirate.getString("DatePerformed"));
				patientData.put("boneMarrowAspirateDescription", boneMarrowAspirate.getString("Result"));

				ResultSet flowCytometry = SQLOperationsBaseline.getFlowCytometry(flowCytometryId, connection);
				flowCytometry.first();
				
				patientData.put("flowCytometryResult", flowCytometry.getString("Result"));
	
				ResultSet cytogeneticAAPNH = SQLOperationsBaseline.getCytogeneticAAPNH(cytogeneticAAPNHId, connection);
				cytogeneticAAPNH.first();
				
				patientData.put("cytogeneticAndMolecularAnalysisAAPNHResult", cytogeneticAAPNH.getString("Result"));
	
				ResultSet cytogeneticMDS = SQLOperationsBaseline.getCytogeneticMDSAAPNH(cytogeneticMDSId, connection);
				cytogeneticMDS.first();
				
				patientData.put("cytogeneticAndMolecularAnalysisMDSResult", cytogeneticMDS.getString("Result"));
	
				ResultSet treatment = SQLOperationsBaseline.getTreatment(treatmentId, connection);
				treatment.first();
				
				patientData.put("transplantCandidate", treatment.getString("Transplant"));
				patientData.put("dateStarted", treatment.getString("DateStarted"));

				int chemoMedicationId = treatment.getInt("ChemoMedicationID");
				int modeOfTreatmentId = treatment.getInt("ModeOfTreatmentID");
				
				ResultSet chemoMedication = SQLOperationsBaseline.getChemoMedication(chemoMedicationId, connection);
				chemoMedication.first();
				
				patientData.put("medications", chemoMedication.getString("MedicationName"));
				
				ResultSet modeOfTreatment = SQLOperationsBaseline.getModeOfTreatment(modeOfTreatmentId, connection);
				modeOfTreatment.first();
				
				patientData.put("modeOfTreatment", modeOfTreatment.getString("ModeOfTreatment"));

				
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
