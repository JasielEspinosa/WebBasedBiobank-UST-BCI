package controller.followup.edit;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.*;
import utility.database.SQLOperationsBaseline;
import utility.database.SQLOperationsFollowUp;
import utility.factory.BeanFactory;
import utility.values.DefaultValues;

@WebServlet("/EditLeukemiaFollowUpServlet")
public class EditLeukemiaFollowUpServlet extends HttpServlet implements DefaultValues {
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

	public EditLeukemiaFollowUpServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String noValue = "";

		int disease = 3;

		int patientID = Integer.parseInt(request.getParameter("patientID"));
		int followupId = Integer.parseInt(request.getParameter("followupID"));

		String dateOfEntry = request.getParameter("dateOfEntry");
		String dateOfVisit = request.getParameter("dateOfVisit");
		String hematologicMalignancy = request.getParameter("specifyHematologicMalignancy");
		String otherDiseaseMedication = request.getParameter("specifyOtherDiseaseMedication");
		String procedureIntervention = request.getParameter("specifyProcedure");
		String chemotherapyComplication = request.getParameter("specifyChemotherapy");

		// CLINICAL
		String currentSymptoms = request.getParameter("currentSymptoms");
		double weight = Double.parseDouble(request.getParameter("weight"));
		double ecog = Double.parseDouble(request.getParameter("ecog"));

		// pertinent findings (not yet added in table), boolean or int?

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
		double myelocytes = Double.parseDouble(request.getParameter("myelocytes"));
		double metamyelocytes = Double.parseDouble(request.getParameter("metamyelocytes"));
		double blasts = Double.parseDouble(request.getParameter("blasts"));
		double plateletCount = Double.parseDouble(request.getParameter("plateletCount"));
		String boneMarrowAspirateDatePerformed = request.getParameter("boneMarrowAspirateDatePerformed");
		String boneMarrowAspirateDescription = request.getParameter("boneMarrowAspirateDescription");
		String flowCytometryResult = request.getParameter("flowCytometryResult");
		String cytogeneticAndMolecularAnalysisResult = request.getParameter("molecularAnalysisResult");

		String diseaseStatus = request.getParameter("diseaseStatus");
		String otherDisease = request.getParameter("diseaseStatusOthers");
		String notes = request.getParameter("specialNotes");

		//load
		try {
			if (connection != null) {
				ResultSet followup = SQLOperationsFollowUp.getFollowup(followupId, connection);
				followup.first();

				int medicalEventsid = followup.getInt("MedicalEventsID");
				int clinicalDataId = followup.getInt("ClinicalDataID");
				int laboratoryId = followup.getInt("LaboratoryID");
				int qualityOfResponseId = followup.getInt("QualityOfResponseID");
				int diseaseStatusId = followup.getInt("DiseaseStatusID");
				int patientId = followup.getInt("PatientID");

				ResultSet clinicalData = SQLOperationsFollowUp.getClinicalData(clinicalDataId, connection);
				clinicalData.first();

				int physicalExamId = clinicalData.getInt("PhysicalExamID");

				ResultSet laboratoryProfile = SQLOperationsFollowUp.getLaboratoryProfile(laboratoryId, connection);
				laboratoryProfile.first();

				int hematologyId = laboratoryProfile.getInt("HematologyID");
				int otherLaboratoriesId = laboratoryProfile.getInt("OtherLaboratoriesID");
				int boneMarrowAspirateId = laboratoryProfile.getInt("BoneMarrowAspirateID");
				int flowCytometryId = laboratoryProfile.getInt("FlowCytometryID");
				int cytogeneticMolecularId = laboratoryProfile.getInt("CytogeneticMolecularID");

				MedicalEventsBean meb = BeanFactory.getMedicalEventsBean(hematologicMalignancy, otherDiseaseMedication, "", "", 0.0,
						procedureIntervention, chemotherapyComplication);
				if (connection != null) {
					if (SQLOperationsFollowUp.updateMedicalEvents(meb, connection, disease, medicalEventsid)) {
						System.out.println("Successful insert MedicalEventsBean");
					} else {
						System.out.println("Failed insert MedicalEventsBean");
					}
				} else {
					System.out.println("Invalid connection MedicalEventsBean");
				}

				PhysicalExamBean peb = BeanFactory.getPhysicalExamBean(0.0, weight, ecog, 0.0, 0.0, 0.0, false, false, "", "", "");
				if (connection != null) {
					if (SQLOperationsFollowUp.updatePhysicalExam(peb, connection, disease, physicalExamId)) {
						System.out.println("Successful insert PhysicalExamBean");
					} else {
						System.out.println("Failed insert PhysicalExamBean");
					}
				} else {
					System.out.println("Invalid connection PhysicalExamBean");
				}

				ClinicalDataBean cdb = BeanFactory.getClinicalDataBean("", "", "", "", "", currentSymptoms, "", "", "", "", "", "", "", "",
						"");
				if (connection != null) {
					if (SQLOperationsFollowUp.updateClinicalData(cdb, connection, disease, clinicalDataId)) {
						System.out.println("Successful insert ClinicalDataBean");
					} else {
						System.out.println("Failed insert ClinicalDataBean");
					}
				} else {
					System.out.println("Invalid connection ClinicalDataBean");
				}

				HematologyBean hb = BeanFactory.getHematologyBean(hemoglobin, hematocrit, whiteBloodCells, neutrophils, lymphocytes,
						monocytes, eosinophils, basophils, myelocytes, metamyelocytes, blasts, plateletCount);
				if (connection != null) {
					if (SQLOperationsFollowUp.updateHematology(hb, connection, disease, hematologyId)) {
						System.out.println("Successful insert HematologyBean");
					} else {
						System.out.println("Failed insert HematologyBean");
					}
				} else {
					System.out.println("Invalid connection HematologyBean");
				}

				BoneMarrowAspirateBean bmab = BeanFactory.getBoneMarrowAspirateBean(boneMarrowAspirateDatePerformed,
						boneMarrowAspirateDescription);
				if (connection != null) {
					if (SQLOperationsFollowUp.updateBoneMarrowAspirate(bmab, connection, disease, boneMarrowAspirateId)) {
						System.out.println("Successful insert BoneMarrowAspirateBean");
					} else {
						System.out.println("Failed insert BoneMarrowAspirateBean");
					}
				} else {
					System.out.println("Invalid connection BoneMarrowAspirateBean");
				}

				FlowCytometryBean fcb = BeanFactory.getFlowCytometryBean(flowCytometryResult);
				if (connection != null) {
					if (SQLOperationsFollowUp.updateFlowCytometry(fcb, connection, disease, flowCytometryId)) {
						System.out.println("Successful insert FlowCytometryBean");
					} else {
						System.out.println("Failed insert FlowCytometryBean");
					}
				} else {
					System.out.println("Invalid connection FlowCytometryBean");
				}

				CytogeneticMolecularBean cmb = BeanFactory.getCytogeneticMolecularBean(cytogeneticAndMolecularAnalysisResult);
				if (connection != null) {
					if (SQLOperationsFollowUp.updateCytogeneticMolecular(cmb, connection, disease, cytogeneticMolecularId)) {
						System.out.println("Successful insert CytogeneticMolecularBean");
					} else {
						System.out.println("Failed insert CytogeneticMolecularBean");
					}
				} else {
					System.out.println("Invalid connection CytogeneticMolecularBean");
				}

				LaboratoryProfileBean lpb = BeanFactory.getLaboratoryProfileBean(dateOfBloodCollection, "");
				if (connection != null) {
					if (SQLOperationsFollowUp.updateLaboratoryProfile(lpb, connection, disease, laboratoryId)) {
						System.out.println("Successful insert LaboratoryProfileBean");
					} else {
						System.out.println("Failed insert LaboratoryProfileBean");
					}
				} else {
					System.out.println("Invalid connection LaboratoryProfileBean");
				}

				DiseaseStatusBean dsb = BeanFactory.getDiseaseStatusBean(diseaseStatus, "", otherDisease);
				if (connection != null) {
					if (SQLOperationsFollowUp.updateDiseaseStatus(dsb, connection, disease, diseaseStatusId)) {
						System.out.println("Successful insert DiseaseStatusBean");
					} else {
						System.out.println("Failed insert DiseaseStatusBean");
					}
				} else {
					System.out.println("Invalid connection DiseaseStatusBean");
				}

				FollowUpBean fub = BeanFactory.getFollowUpBean(patientID, dateOfEntry, dateOfVisit, notes);
				if (connection != null) {
					if (SQLOperationsFollowUp.updateFollowUp(fub, connection, disease, followupId)) {
						System.out.println("Successful insert FollowUpBean");
					} else {
						System.out.println("Failed insert FollowUpBean");
					}
				} else {
					System.out.println("Invalid connection FollowUpBean");
				}

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
