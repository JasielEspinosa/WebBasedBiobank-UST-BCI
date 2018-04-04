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

@WebServlet("/LoadPlateletBaselineServlet")
public class LoadPlateletDisorderBaselineServlet extends HttpServlet {
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

	public LoadPlateletDisorderBaselineServlet() {
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
				patientData.put("lastName", generalDataRS.getString("LastNameDec"));
				patientData.put("firstName", generalDataRS.getString("FirstNameDec"));
				patientData.put("middleInitial", generalDataRS.getString("MiddleNameDec"));
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

				int clinicalDataID = patientInfoRS.getInt("ClinicalDataID");
				ResultSet clinicalDataRS = SQLOperationsBaseline.getClinicalData(clinicalDataID, connection);
				clinicalDataRS.first();
				patientData.put("dateOfVisit", clinicalDataRS.getString("DateOfVisitDec"));
				patientData.put("diagnosis", clinicalDataRS.getString("Diagnosis"));
				patientData.put("diagnosisOthers", clinicalDataRS.getString("OtherDiagnosis"));
				patientData.put("chiefComplaint", clinicalDataRS.getString("ChiefComplaint"));
				patientData.put("constitutionalSymptoms", clinicalDataRS.getString("constitutionalSymptoms"));
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

				int physicalExamID = clinicalDataRS.getInt("PhysicalExamID");
				ResultSet physicalExamRS = SQLOperationsBaseline.getPhysicalExam(physicalExamID, connection);
				physicalExamRS.first();
				patientData.put("height", physicalExamRS.getString("Height"));
				patientData.put("weight", physicalExamRS.getString("Weight"));
				patientData.put("presenceOfSplenomegaly", physicalExamRS.getString("Splenomegaly"));
				patientData.put("skin", physicalExamRS.getString("Skin"));
				patientData.put("otherFindings", physicalExamRS.getString("OtherFindings"));

				//get laboratory profile
				int laboratoryID = patientInfoRS.getInt("LaboratoryID");
				ResultSet laboratoryProfileRS = SQLOperationsBaseline.getLaboratoryProfile(laboratoryID, connection);
				laboratoryProfileRS.first();
				patientData.put("dateOfBloodCollection", laboratoryProfileRS.getString("DateOfBloodCollection"));

				int hematologyID = laboratoryProfileRS.getInt("HematologyID");
				ResultSet hematologyRS = SQLOperationsBaseline.getHematology(hematologyID, connection);
				hematologyRS.first();
				patientData.put("hemoglobin", hematologyRS.getString("hemoglobin"));
				patientData.put("hematocrit", hematologyRS.getString("hematocrit"));
				patientData.put("whiteBloodCells", hematologyRS.getString("whiteBloodCells"));
				patientData.put("neutrophils", hematologyRS.getString("neutrophils"));
				patientData.put("lymphocytes", hematologyRS.getString("lymphocytes"));
				patientData.put("monocytes", hematologyRS.getString("monocytes"));
				patientData.put("eosinophils", hematologyRS.getString("eosinophils"));
				patientData.put("basophils", hematologyRS.getString("basophils"));
				patientData.put("plateletCount", hematologyRS.getString("plateletCount"));

				int bloodChemistryID = laboratoryProfileRS.getInt("BloodChemistryID");
				ResultSet bloodChemistryRS = SQLOperationsBaseline.getBloodChemistry(bloodChemistryID, connection);
				bloodChemistryRS.first();
				patientData.put("creatinine", bloodChemistryRS.getString("Creatinine"));
				patientData.put("uricAcid", bloodChemistryRS.getString("UricAcid"));
				patientData.put("na", bloodChemistryRS.getString("Na"));
				patientData.put("k", bloodChemistryRS.getString("K"));
				patientData.put("sgot", bloodChemistryRS.getString("SGOT"));
				patientData.put("sgpt", bloodChemistryRS.getString("SGPT"));
				patientData.put("ldh", bloodChemistryRS.getString("LDH"));
				patientData.put("anaTiter", bloodChemistryRS.getString("ANATiter"));
				patientData.put("hepatitisCRNA", bloodChemistryRS.getString("HepatitisCRna"));

				int imagingStudiesID = laboratoryProfileRS.getInt("ImagingStudiesID");
				ResultSet imagingStudiesRS = SQLOperationsBaseline.getImagingStudies(imagingStudiesID, connection);
				imagingStudiesRS.first();
				patientData.put("imagingStudiesResult", imagingStudiesRS.getString("Result"));

				int boneMarrowAspirateID = laboratoryProfileRS.getInt("BoneMarrowAspirateID");
				ResultSet boneMarrowAspirateRS = SQLOperationsBaseline.getBoneMarrowAspirate(boneMarrowAspirateID, connection);
				boneMarrowAspirateRS.first();
				patientData.put("boneMarrowAspirateDatePerformed", boneMarrowAspirateRS.getString("DatePerformed"));
				patientData.put("boneMarrowAspirateDescription", boneMarrowAspirateRS.getString("Result"));

				int upperGIEndoscopyID = laboratoryProfileRS.getInt("UpperGIEndoscopyID");
				ResultSet upperGIEndoscopyRS = SQLOperationsBaseline.getUpperGIEndoscopy(upperGIEndoscopyID, connection);
				upperGIEndoscopyRS.first();
				patientData.put("upperGIEndoscopyDatePerformed", upperGIEndoscopyRS.getString("DatePerformed"));
				patientData.put("upperGIEndoscopyDescription", upperGIEndoscopyRS.getString("Description"));
				patientData.put("hPylori", upperGIEndoscopyRS.getString("HPylori"));

				patientData.put("formOfITP", laboratoryProfileRS.getString("ITP"));

				int treatmentID = patientInfoRS.getInt("TreatmentID");
				ResultSet treatmentRS = SQLOperationsBaseline.getTreatment(treatmentID, connection);
				treatmentRS.first();

				int modeOfTreatmentID = treatmentRS.getInt("ModeOfTreatmentID");
				ResultSet modeOfTreatmentRS = SQLOperationsBaseline.getModeOfTreatment(modeOfTreatmentID, connection);
				modeOfTreatmentRS.first();
				patientData.put("treatment", modeOfTreatmentRS.getString("ModeOfTreatment"));
				//patientData.put("treatmentSpecify", modeOfTreatmentRS.getString("NameOfTreatment"));

				int regimenID = treatmentRS.getInt("RegimenID");
				ResultSet regimenRS = SQLOperationsBaseline.getRegimen(regimenID, connection);
				regimenRS.first();
				patientData.put("regimenProtocol", regimenRS.getString("RegimenName"));

				patientData.put("dateStarted", treatmentRS.getString("DateStarted"));
				patientData.put("complications", treatmentRS.getString("Complications"));

				int diseaseStatusID = patientInfoRS.getInt("DiseaseStatusID");
				ResultSet diseaseStatusRS = SQLOperationsBaseline.getDiseaseStatus(diseaseStatusID, connection);
				diseaseStatusRS.first();

				String diseaseStatus = diseaseStatusRS.getString("DiseaseStatus");
				//String diseaseStatusOthers = diseaseStatusRS.getString("OtherDisease");

				if (diseaseStatus.contains("&#40;") || diseaseStatus.contains("&#41;")) {
					diseaseStatus = diseaseStatus.replaceAll("&#40;", "(");
					diseaseStatus = diseaseStatus.replaceAll("&#41;", ")");
				}

				/*if (diseaseStatusOthers.contains("&#40;") || diseaseStatusOthers.contains("&#41;")) {
					diseaseStatusOthers = diseaseStatusOthers.replaceAll("&#40;", "(");
					diseaseStatusOthers = diseaseStatusOthers.replaceAll("&#41;", ")");
				}*/

				patientData.put("diseaseStatus", diseaseStatus);
				//patientData.put("diseaseStatusOthers", diseaseStatusOthers);

				HttpSession session = request.getSession(true);

				AuditBean auditBean = new AuditBean("Load patient in Platelet Disorder Baseline",
						generalDataRS.getString("LastNameDec") + ", " + generalDataRS.getString("FirstNameDec") + " " + generalDataRS
								.getString("MiddleNameDec"),
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
