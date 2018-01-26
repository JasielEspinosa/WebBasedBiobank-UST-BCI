package controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utility.database.SQLOperations;

@WebServlet("/AddLymphomaBaselineServlet")
public class AddLymphomaBaselineServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Connection connection;

	public void init()
			throws ServletException {
		connection = SQLOperations.getConnection();

		if (connection != null) {
			getServletContext().setAttribute("dbConnection", connection);
			System.out.println("connection is READY.");
		} else {
			System.err.println("connection is NULL.");
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		getServletContext().log("AddLymphomaBaselineServlet insert test");

		int disease = 4;

		// GENERAL DATA
		int patientIDNumber = Integer.parseInt(request.getParameter("patientIDNumber"));
		String lastName = request.getParameter("lastName");
		String firstName = request.getParameter("firstName");
		String middleInitial = request.getParameter("middleInitial");
		int gender = Integer.parseInt(request.getParameter("gender"));
		String dateOfBirth = request.getParameter("dateOfBirth");
		String address = request.getParameter("address");
		String dateOfEntry = request.getParameter("dateOfEntry");
		String specimenType = request.getParameter("specimenType");

		// CLINICAL DATA
		String dateOfInitialDiagnosis = request.getParameter("dateOfInitialDiagnosis");
		String diagnosis = request.getParameter("diagnosis");
		String stageOfDisease = request.getParameter("stageOfDisease");
		String constitutionalSymptoms = request.getParameter("constitutionalSymptoms");
		String otherSymptoms = request.getParameter("otherSymptoms");
		String relationshipToPatient = request.getParameter("relationshipToPatient");
		String otherDiseasesInTheFamily = request.getParameter("otherDiseasesInTheFamily");
		String comorbidities = request.getParameter("comorbidities");
		String genericName = request.getParameter("genericName");
		double dose = Double.parseDouble(request.getParameter("dose"));
		String frequency = request.getParameter("frequency");
		String smokingHistorySpecify = request.getParameter("smokingHistorySpecify");
		String alchoholIntakeSpecify = request.getParameter("alchoholIntakeSpecify");
		String chemicalExposureSpecify = request.getParameter("chemicalExposureSpecify");
		////// Physical Exam
		double height = Double.parseDouble(request.getParameter("height"));
		double weight = Double.parseDouble(request.getParameter("weight"));
		double ecog = Double.parseDouble(request.getParameter("ecog"));

		boolean presenceOfSplenomegaly;
		if (Integer.parseInt(request.getParameter("presenceOfSplenomegaly")) != 0) {
			presenceOfSplenomegaly = true;
		} else {
			presenceOfSplenomegaly = false;
		}

		boolean presenceOfHepatomegaly;
		if (Integer.parseInt(request.getParameter("presenceOfHepatomegaly")) != 0) {
			presenceOfHepatomegaly = true;
		} else {
			presenceOfHepatomegaly = false;
		}

		boolean presenceOfLymphadenopathies;
		if (Integer.parseInt(request.getParameter("presenceOfLymphadenopathies")) != 0) {
			presenceOfLymphadenopathies = true;
		} else {
			presenceOfLymphadenopathies = false;
		}

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

		//wala pang parameters sa JSPs
		double myelocytes = Double.parseDouble(request.getParameter(""));
		double metamyelocytes = Double.parseDouble(request.getParameter(""));
		double blasts = Double.parseDouble(request.getParameter(""));
		double plateletCount = Double.parseDouble(request.getParameter(""));

		////// Other Laboratories
		//wala pang parameters sa JSPs
		double creatinine = Double.parseDouble(request.getParameter(""));
		double uricAcid = Double.parseDouble(request.getParameter(""));
		double na = Double.parseDouble(request.getParameter(""));
		double k = Double.parseDouble(request.getParameter(""));
		double bilirubin = Double.parseDouble(request.getParameter(""));
		double total = Double.parseDouble(request.getParameter(""));
		String direct = request.getParameter("");
		String indirectn = request.getParameter("");
		double sgot = Double.parseDouble(request.getParameter(""));
		double sgpt = Double.parseDouble(request.getParameter(""));
		double microglobulin = Double.parseDouble(request.getParameter(""));
		String hepatitisBTesting = request.getParameter("");
		String ldh = request.getParameter("");
		double esr = Double.parseDouble(request.getParameter(""));

		//may duplicate parameters sa JSPs, need revisions

		String hematopathologyDatePerformed = request.getParameter("");
		String hematopathologyDescription = request.getParameter("");
/*		Part hematopathologAttachScannedDocument = request
				.getPart("hematopathologAttachScannedDocument");*/

		String immunohistochemistryOfTissueDatePerformed = request.getParameter("");
		String immunohistochemistryOfTissueDescription = request.getParameter("");
/*		Part immunohistochemistryOfTissueAttachScannedDocument = request
				.getPart("immunohistochemistryOfTissueAttachScannedDocument");*/

		//int imagingStudies = Integer.parseInt(request.getParameter("imagingStudies"));
		String imagingStudiesResult = request.getParameter("");

		String boneMarrowAspirateAndBiopsyOfTissueDatePerformed = request.getParameter("");
		String boneMarrowAspirateAndBiopsyOfTissueDescription = request.getParameter("");
/*		Part boneMarrowAspirateAndBiopsyOfTissueAttachScannedDocument = request
				.getPart("boneMarrowAspirateAndBiopsyOfTissueAttachScannedDocument");*/

		// int flowCytometry = Integer.parseInt(request.getParameter("flowCytometry"));
		String flowCytometryResult = request.getParameter("flowCytometryResult");
		// Part flowCytometryAttachScannedDocument = request.getPart("flowCytometryAttachScannedDocument");

		// TREATMENT / THERAPHY AND RESPONSE
		String treatment = request.getParameter("treatment");
		String modeOfTreatment = request.getParameter("treatment");
		String regimenProtocol = request.getParameter("regimenProtocol");
		String chemotherapyMedications = request.getParameter("chemotherapyMedications");
		int cycleNumber = Integer.parseInt(request.getParameter("cycleNumber"));
		String dateStarted = request.getParameter("dateStarted");
		String complications = request.getParameter("complications");
		String diseaseStatus = request.getParameter("diseaseStatus");

	}

}
