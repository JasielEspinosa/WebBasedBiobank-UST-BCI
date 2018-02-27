package controller.followup.load;

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
import utility.database.SQLOperationsFollowUp;

/**
 * Servlet implementation class LoadAAPHSMDSFollowupServlet
 */
@WebServlet("/LoadAAPHSMDSFollowupServlet")
public class LoadPlasmaCellFollowupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
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
    public LoadPlasmaCellFollowupServlet() {
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
	    Map<String, String> followupData = new LinkedHashMap<>();
		
		int followupId = Integer.parseInt(request.getParameter("followupId"));
		followupData.put("followupId", Integer.toString(followupId));
		
		try {	
			if (connection != null) {
				
				//get followup table
				ResultSet followup = SQLOperationsFollowUp.getFollowup(followupId, connection);
				followup.first();
				followupData.put("dateOfEntry", followup.getString("dateOfEntry"));
				followupData.put("dateOfVisit", followup.getString("dateOfVisit"));
				followupData.put("notes", followup.getString("notes"));
				
				int medicalEventsid =  followup.getInt("MedicalEventsID");
				int clinicalDataId =  followup.getInt("ClinicalDataID");
				int laboratoryId =  followup.getInt("LaboratoryID");
				int qualityOfResponseId =  followup.getInt("QualityOfResponseID");
				int diseaseStatusId =  followup.getInt("DiseaseStatusID");
				int patientId = followup.getInt("PatientID");
				
				//medical events
				ResultSet medicalEvents = SQLOperationsFollowUp.getMedicalEvents(medicalEventsid, connection);
				medicalEvents.first();
				
				followupData.put("hematologicMalignancy", medicalEvents.getString("hematologicMalignancy"));
				followupData.put("otherDiseaseMedication", medicalEvents.getString("otherDiseaseMedication"));
				followupData.put("procedureIntervention", medicalEvents.getString("procedureIntervention"));
				followupData.put("chemotherapyComplication", medicalEvents.getString("Chemotherapy"));
				
				//clinical data
				ResultSet clinicalData = SQLOperationsFollowUp.getClinicalData(clinicalDataId, connection);
				clinicalData.first();
				
				int physicalExamId = clinicalData.getInt("PhysicalExamID");
				
				followupData.put("currentSymptoms", clinicalData.getString("currentSymptoms"));
				
				//physical exam
				ResultSet physicalExam = SQLOperationsFollowUp.getPhysicalExam(physicalExamId, connection);
				physicalExam.first();
				
				followupData.put("weight", physicalExam.getString("weight"));
				followupData.put("ecog", physicalExam.getString("ecog"));
				

				
				//laboratory profile
				ResultSet laboratoryProfile = SQLOperationsFollowUp.getLaboratoryProfile(laboratoryId, connection);
				laboratoryProfile.first();
				
				followupData.put("dateOfBloodCollection", laboratoryProfile.getString("dateOfBloodCollection"));

				
				int hematologyId = laboratoryProfile.getInt("HematologyID");
				int otherLaboratoriesId = laboratoryProfile.getInt("OtherLaboratoriesID");
				int bloodChemistryId = laboratoryProfile.getInt("BloodChemistryID");
				int boneMarrowAspirateId = laboratoryProfile.getInt("BoneMarrowAspirateID");
				int imagingStudiesId = laboratoryProfile.getInt("ImagingStudiesID");
				int serumFreeId = laboratoryProfile.getInt("SerumFreeID");
				int serumProteinId = laboratoryProfile.getInt("SerumProteinID");
				int serumImmunofixationId = laboratoryProfile.getInt("SerumImmunofixationID");
				int urineProteinId = laboratoryProfile.getInt("UrineProteinID");

				
				//hematology
				ResultSet hematology = SQLOperationsFollowUp.getHematology(hematologyId, connection);
				hematology.first();
				
				followupData.put("hemoglobin", hematology.getString("hemoglobin"));
				followupData.put("hematocrit", hematology.getString("hematocrit"));
				followupData.put("whiteBloodCells", hematology.getString("whiteBloodCells"));
				followupData.put("neutrophils", hematology.getString("neutrophils"));
				followupData.put("lymphocytes", hematology.getString("lymphocytes"));
				followupData.put("monocytes", hematology.getString("monocytes"));
				followupData.put("eosinophils", hematology.getString("eosinophils"));
				followupData.put("basophils", hematology.getString("basophils"));
				followupData.put("myelocytes", hematology.getString("myelocytes"));
				followupData.put("metamyelocytes", hematology.getString("metamyelocytes"));
				followupData.put("blasts", hematology.getString("blasts"));
				followupData.put("plateletCount", hematology.getString("plateletCount"));
				
				ResultSet bloodChemistry = SQLOperationsFollowUp.getBloodChemistry(bloodChemistryId, connection);
				bloodChemistry.first();
				
				followupData.put("creatinine", bloodChemistry.getString("creatinine"));
				followupData.put("totalProtein", bloodChemistry.getString("totalProtein"));
				followupData.put("albumin", bloodChemistry.getString("albumin"));
				followupData.put("globulin", bloodChemistry.getString("globulin"));

				ResultSet boneMarrowAspirate = SQLOperationsFollowUp.getBoneMarrowAspirate(boneMarrowAspirateId, connection);
				boneMarrowAspirate.first();
				
				followupData.put("boneMarrowAspirateDatePerformed", boneMarrowAspirate.getString("DatePerformed"));
				followupData.put("boneMarrowAspirateDescription", boneMarrowAspirate.getString("Result"));
				
				ResultSet imagingStudies = SQLOperationsFollowUp.getImagingStudies(imagingStudiesId, connection);
				imagingStudies.first();
				
				followupData.put("imagingStudiesResult", imagingStudies.getString("Result"));
				
				ResultSet serumFree = SQLOperationsFollowUp.getSerumFree(serumFreeId, connection);
				serumFree.first();
				
				followupData.put("serumFree", serumFree.getString("Result"));
				
				ResultSet serumProtein = SQLOperationsFollowUp.getSerumProtein(serumProteinId, connection);
				serumProtein.first();
				
				followupData.put("serumProteinElectrophoresisResult", serumProtein.getString("Result"));
				
				ResultSet serumImmunofixation = SQLOperationsFollowUp.getSerumImmunofixation(serumImmunofixationId, connection);
				serumImmunofixation.first();
				
				followupData.put("serumImmunofixationResult", serumImmunofixation.getString("Result"));
				
				ResultSet urineProtein = SQLOperationsFollowUp.getUrineProtein(urineProteinId, connection);
				urineProtein.first();
				
				followupData.put("urineProteinResult", urineProtein.getString("Result"));
				
				
				ResultSet diseaseStatus = SQLOperationsFollowUp.getDiseaseStatus(diseaseStatusId, connection);
				diseaseStatus.first();
				
				followupData.put("diseaseStatus", diseaseStatus.getString("diseaseStatus"));
				followupData.put("relapseDisease", diseaseStatus.getString("relapseDisease"));
				followupData.put("otherDisease", diseaseStatus.getString("otherDisease"));

				//return data to js
			    String json = new Gson().toJson(followupData);
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
