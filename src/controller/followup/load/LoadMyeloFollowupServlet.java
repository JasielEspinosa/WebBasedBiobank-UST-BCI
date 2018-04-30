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
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import model.AuditBean;
import utility.database.SQLOperations;
import utility.database.SQLOperationsBaseline;
import utility.database.SQLOperationsFollowUp;

@WebServlet("/LoadMyeloFollowUpServlet")
public class LoadMyeloFollowupServlet extends HttpServlet {
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
	
	public LoadMyeloFollowupServlet() {
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
				followupData.put("dateOfEntry", followup.getString("DateOfEntryDec"));
				followupData.put("dateOfVisit", followup.getString("DateOfVisitDec"));
				followupData.put("notes", followup.getString("notes"));
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
				followupData.put("currentSymptoms", clinicalData.getString("currentSymptoms"));
				//physical exam
				int physicalExamId = clinicalData.getInt("PhysicalExamID");
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
				int boneMarrowAspirateId = laboratoryProfile.getInt("BoneMarrowAspirateID");
				ResultSet boneMarrowAspirate = SQLOperationsFollowUp.getBoneMarrowAspirate(boneMarrowAspirateId, connection);
				boneMarrowAspirate.first();
				followupData.put("boneMarrowAspirateDatePerformed", boneMarrowAspirate.getString("DatePerformed"));
				followupData.put("boneMarrowAspirateDescription", boneMarrowAspirate.getString("Result"));
				int diseaseStatusId = followup.getInt("DiseaseStatusID");
				ResultSet diseaseStatusRS = SQLOperationsFollowUp.getDiseaseStatus(diseaseStatusId, connection);
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
				followupData.put("diseaseStatus", diseaseStatus);
				followupData.put("diseaseStatusOthers", diseaseStatusOthers);
				int patientID = Integer.parseInt(request.getParameter("patientID"));
				ResultSet patientInfoRS = SQLOperationsBaseline.getPatient(patientID, connection);
				patientInfoRS.first();
				int generalDataID = patientInfoRS.getInt("GeneralDataID");
				ResultSet generalDataRS = SQLOperationsBaseline.getGeneralData(generalDataID, connection);
				generalDataRS.first();
				HttpSession session = request.getSession(true);
				AuditBean auditBean = new AuditBean("Load patient in Myeloproliferative Neoplasm Follow Up",
						(String) session.getAttribute("patientLastName") + ", " + session.getAttribute("patientFirstName") + " " + session
								.getAttribute("patientMiddleName"),
						(String) session.getAttribute("name"), Integer.parseInt((String) session.getAttribute("accountID")));
				SQLOperations.addAudit(auditBean, connection);
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
