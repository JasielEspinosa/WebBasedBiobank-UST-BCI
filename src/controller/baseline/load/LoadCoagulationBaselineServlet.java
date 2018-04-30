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

/** Servlet implementation class LoadAAPHSMDSBaselineServlet */
@WebServlet("/LoadCoagulationBaselineServlet")
public class LoadCoagulationBaselineServlet extends HttpServlet {
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
	
	public LoadCoagulationBaselineServlet() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
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
				session.setAttribute("patientLastName", generalDataRS.getString("LastNameDec"));
				session.setAttribute("patientFirstName", generalDataRS.getString("FirstNameDec"));
				session.setAttribute("patientMiddleName", generalDataRS.getString("MiddleNameDec"));
				int addressID = generalDataRS.getInt("AddressID");
				ResultSet addressRS = SQLOperationsBaseline.getAddress(addressID, connection);
				addressRS.first();
				String StreetAddress = Security.decrypt(addressRS.getString("StreetAddress"));
				String City = Security.decrypt(addressRS.getString("City"));
				String ZIPCode = Security.decrypt(addressRS.getString("ZIPCode"));
				patientData.put("address", StreetAddress + "," + City + "," + ZIPCode);
				patientData.put("civilStatus", generalDataRS.getString("CivilStatus"));
				patientData.put("dateOfEntry", generalDataRS.getString("DateOfEntryDec"));
				int clinicalDataID = patientInfoRS.getInt("ClinicalDataID");
				ResultSet clinicalDataRS = SQLOperationsBaseline.getClinicalData(clinicalDataID, connection);
				clinicalDataRS.first();
				patientData.put("dateOfVisit", clinicalDataRS.getString("DateOfVisitDec"));
				patientData.put("diagnosis", clinicalDataRS.getString("Diagnosis"));
				patientData.put("diagnosisOthers", clinicalDataRS.getString("OtherDiagnosis"));
				int severityID = clinicalDataRS.getInt("SeverityID");
				ResultSet severityRS = SQLOperationsBaseline.getSeverity(severityID, connection);
				severityRS.first();
				patientData.put("severity", severityRS.getString("SeverityName"));
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
				int physicalExamID = clinicalDataRS.getInt("PhysicalExamID");
				ResultSet physicalExamRS = SQLOperationsBaseline.getPhysicalExam(physicalExamID, connection);
				physicalExamRS.first();
				patientData.put("height", physicalExamRS.getString("Height"));
				patientData.put("weight", physicalExamRS.getString("Weight"));
				patientData.put("presenceOfHemarthroses", physicalExamRS.getString("Hemarthroses"));
				patientData.put("presenceOfContracturesAndMuscleAtrophy", physicalExamRS.getString("ContracturesAndMuscleAtrophy"));
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
				patientData.put("plateletCount", hematologyRS.getString("plateletCount"));
				int coagulationTestingID = laboratoryProfileRS.getInt("CoagulationTestingID");
				ResultSet coagulationTestingRS = SQLOperationsBaseline.getCoagulationTesting(coagulationTestingID, connection);
				coagulationTestingRS.first();
				patientData.put("factorVIIILevel", coagulationTestingRS.getString("FactorVIIILevel"));
				patientData.put("factorIXLevel", coagulationTestingRS.getString("FactorIXLevel"));
				patientData.put("inhibitorAssay", coagulationTestingRS.getString("InhibitorAssay"));
				patientData.put("bethesdaUnits", coagulationTestingRS.getString("BethesdaUnits"));
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
				int imagingStudiesID = laboratoryProfileRS.getInt("ImagingStudiesID");
				ResultSet imagingStudiesRS = SQLOperationsBaseline.getImagingStudies(imagingStudiesID, connection);
				imagingStudiesRS.first();
				patientData.put("imagingStudiesResult", imagingStudiesRS.getString("Result"));
				int treatmentID = patientInfoRS.getInt("TreatmentID");
				ResultSet treatmentRS = SQLOperationsBaseline.getTreatment(treatmentID, connection);
				treatmentRS.first();
				int modeOfTreatmentID = treatmentRS.getInt("ModeOfTreatmentID");
				ResultSet modeOfTreatmentRS = SQLOperationsBaseline.getModeOfTreatment(modeOfTreatmentID, connection);
				modeOfTreatmentRS.first();
				String modeOfTreatment = modeOfTreatmentRS.getString("ModeOfTreatment");
				String nameOfTreatment = modeOfTreatmentRS.getString("NameOfTreatment");
				if (modeOfTreatment.contains("&#40;") || modeOfTreatment.contains("&#41;")) {
					modeOfTreatment = modeOfTreatment.replaceAll("&#40;", "(");
					modeOfTreatment = modeOfTreatment.replaceAll("&#41;", ")");
				}
				if (nameOfTreatment.contains("&#40;") || nameOfTreatment.contains("&#41;")) {
					nameOfTreatment = nameOfTreatment.replaceAll("&#40;", "(");
					nameOfTreatment = nameOfTreatment.replaceAll("&#41;", ")");
				}
				patientData.put("modeOfTreatment", modeOfTreatment);
				patientData.put("nameOfTreatment", nameOfTreatment);
				AuditBean auditBean = new AuditBean("Load patient in Coagulation Disease Baseline",
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
