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

@WebServlet("/LoadLymphomaFollowUpServlet")
public class LoadLymphomaFollowupServlet extends HttpServlet {
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

	public LoadLymphomaFollowupServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		Map<String, String> followupData = new LinkedHashMap<>();

		int followupID = Integer.parseInt(request.getParameter("followupID"));
		followupData.put("followupID", Integer.toString(followupID));

		try {
			if (connection != null) {

				//get followup table
				ResultSet followup = SQLOperationsFollowUp.getFollowup(followupID, connection);
				followup.first();
				followupData.put("dateOfEntry", followup.getString("dateOfEntry"));
				followupData.put("dateOfVisit", followup.getString("dateOfVisit"));
				followupData.put("notes", followup.getString("notes"));


				//int patientId = followup.getInt("PatientID");

				//medical events
				int medicalEventsid = followup.getInt("MedicalEventsID");
				ResultSet medicalEvents = SQLOperationsFollowUp.getMedicalEvents(medicalEventsid, connection);
				medicalEvents.first();

				followupData.put("specifyHematologicMalignancy", medicalEvents.getString("hematologicMalignancy"));
				followupData.put("specifyOtherDiseaseMedication", medicalEvents.getString("otherDiseaseMedication"));
				followupData.put("specifyProcedure", medicalEvents.getString("procedureIntervention"));
				followupData.put("specifyChemotherapy", medicalEvents.getString("Chemotherapy"));

				//clinical data
				int clinicalDataId = followup.getInt("ClinicalDataID");
				ResultSet clinicalData = SQLOperationsFollowUp.getClinicalData(clinicalDataId, connection);
				clinicalData.first();

				int physicalExamId = clinicalData.getInt("PhysicalExamID");

				followupData.put("currentSymptoms", clinicalData.getString("currentSymptoms"));

				//physical exam
				ResultSet physicalExam = SQLOperationsFollowUp.getPhysicalExam(physicalExamId, connection);
				physicalExam.first();

				followupData.put("weight", physicalExam.getString("weight"));
				followupData.put("ecog", physicalExam.getString("ecog"));
				followupData.put("pertinentFindings", physicalExam.getString("pertinentFindings"));

				//laboratory profile
				int laboratoryId = followup.getInt("LaboratoryID");
				ResultSet laboratoryProfile = SQLOperationsFollowUp.getLaboratoryProfile(laboratoryId, connection);
				laboratoryProfile.first();

				followupData.put("dateOfBloodCollection", laboratoryProfile.getString("dateOfBloodCollection"));

				int hematologyId = laboratoryProfile.getInt("HematologyID");
				int bloodChemistryId = laboratoryProfile.getInt("BloodChemistryID");
				int imagingStudiesId = laboratoryProfile.getInt("ImagingStudiesID");

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

				followupData.put("ldh", bloodChemistry.getString("LDH"));
				followupData.put("esr", bloodChemistry.getString("ESR"));

				ResultSet imagingStudies = SQLOperationsFollowUp.getImagingStudies(imagingStudiesId, connection);
				imagingStudies.first();

				followupData.put("imagingStudiesResult", imagingStudies.getString("Result"));

				int diseaseStatusId = followup.getInt("DiseaseStatusID");
				ResultSet diseaseStatus = SQLOperationsFollowUp.getDiseaseStatus(diseaseStatusId, connection);
				diseaseStatus.first();

				followupData.put("diseaseStatus", diseaseStatus.getString("diseaseStatus"));
				followupData.put("diseaseStatusOthers", diseaseStatus.getString("otherDisease"));

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
