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
import utility.database.SQLOperationsFollowUp;
import utility.factory.BeanFactory;
import utility.values.DefaultValues;

@WebServlet("/EditPlasmaFollowUpServlet")
public class EditPlasmaCellFollowUpServlet extends HttpServlet implements DefaultValues {
	private static final long serialVersionUID = 1L;

	private Connection connection;

	public void init() throws ServletException {
		connection = SQLOperationsFollowUp.getConnection();

		if (connection != null) {
			getServletContext().setAttribute("dbConnection", connection);
			System.out.println("connection is READY.");
		} else {
			System.err.println("connection is NULL.");
		}
	}

	public EditPlasmaCellFollowUpServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int disease = 6;

		int patientID = Integer.parseInt(request.getParameter("patientID"));
		int followupId = Integer.parseInt(request.getParameter("followupID"));

		String dateOfEntry = request.getParameter("dateOfEntry");
		String dateOfVisit = request.getParameter("dateOfVisit");

		String hematologicMalignancy = noValue;
		if (Integer.parseInt(request.getParameter("hematologicMalignancy")) == 1) {
			hematologicMalignancy = request.getParameter("specifyHematologicMalignancy");
		}

		String otherDiseaseMedication = noValue;
		if (Integer.parseInt(request.getParameter("otherDiseaseMedication")) == 1) {
			otherDiseaseMedication = request.getParameter("specifyOtherDiseaseMedication");
		}

		String procedureIntervention = noValue;
		if (Integer.parseInt(request.getParameter("procedure")) == 1) {
			procedureIntervention = request.getParameter("specifyProcedure");
		}

		String chemotherapyComplication = noValue;
		if (Integer.parseInt(request.getParameter("chemotherapy")) == 1) {
			chemotherapyComplication = request.getParameter("specifyChemotherapy");
		}
		// CLINICAL
		String currentSymptoms = request.getParameter("currentSymptoms");
		double weight = Double.parseDouble(request.getParameter("weight"));
		double ecog = Double.parseDouble(request.getParameter("ecog"));

		boolean pertinentFindings = false;
		if (Integer.parseInt(request.getParameter("pertinentFindings")) == 1) {
			pertinentFindings = true;
			System.out.println("Pertinent Findings: " + pertinentFindings);
		} else if (Integer.parseInt(request.getParameter("pertinentFindings")) == 0) {
			pertinentFindings = false;
			System.out.println("Pertinent Findings: " + pertinentFindings);
		}

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
		////// Other Laboratories / Blood Chemistry
		double creatinine = Double.parseDouble(request.getParameter("creatinine"));
		double iCa = Double.parseDouble(request.getParameter("iCa"));
		double totalProtein = Double.parseDouble(request.getParameter("totalProtein"));
		double albumin = Double.parseDouble(request.getParameter("albumin"));
		double globulin = Double.parseDouble(request.getParameter("globulin"));
		String imagingStudiesResult = request.getParameter("imagingStudiesResult");
		String boneMarrowAspirateDatePerformed = request.getParameter("boneMarrowAspirateDatePerformed");
		String boneMarrowAspirateDescription = request.getParameter("boneMarrowAspirateDescription");
		String serumFree = request.getParameter("serumFreeLightChainAsssayResult");
		String serumProteinElectrophoresisResult = request.getParameter("serumProteinElectrophoresisResult");
		String serumImmunofixationResult = request.getParameter("serumImmunofixationResult");
		String urineProteinResult = request.getParameter("urineProteinResult");

		String diseaseStatus = request.getParameter("diseaseStatus");
		String relapseDisease = noValue;
		String otherDisease = noValue;
		if (diseaseStatus.equalsIgnoreCase("Others")) {
			otherDisease = request.getParameter("diseaseStatusOthers");
		} else if (diseaseStatus.equalsIgnoreCase("Relapse")) {
			relapseDisease = request.getParameter("relapseDisease");
		}

		String notes = request.getParameter("specialNotes");

		//load
		try {
			if (connection != null) {
				ResultSet followup = SQLOperationsFollowUp.getFollowup(followupId, connection);
				followup.first();

				int medicalEventsid = followup.getInt("MedicalEventsID");
				int clinicalDataId = followup.getInt("ClinicalDataID");
				int laboratoryId = followup.getInt("LaboratoryID");
				int diseaseStatusId = followup.getInt("DiseaseStatusID");
				//int patientId = followup.getInt("PatientID");

				ResultSet clinicalData = SQLOperationsFollowUp.getClinicalData(clinicalDataId, connection);
				clinicalData.first();

				int physicalExamId = clinicalData.getInt("PhysicalExamID");

				ResultSet laboratoryProfile = SQLOperationsFollowUp.getLaboratoryProfile(laboratoryId, connection);
				laboratoryProfile.first();

				int hematologyId = laboratoryProfile.getInt("HematologyID");
				int bloodChemistryId = laboratoryProfile.getInt("BloodChemistryID");
				int boneMarrowAspirateId = laboratoryProfile.getInt("BoneMarrowAspirateID");
				int imagingStudiesId = laboratoryProfile.getInt("ImagingStudiesID");
				int serumFreeId = laboratoryProfile.getInt("SerumFreeID");
				int serumProteinId = laboratoryProfile.getInt("SerumProteinID");
				int serumImmunofixationId = laboratoryProfile.getInt("SerumImmunofixationID");
				int urineProteinId = laboratoryProfile.getInt("UrineProteinID");

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

				PhysicalExamBean peb = BeanFactory.getPhysicalExamBean(0.0, weight, ecog, 0.0, 0.0, 0.0, false, false, "", "", pertinentFindings, "");
				if (connection != null) {
					if (SQLOperationsFollowUp.updatePhysicalExam(peb, connection, disease, physicalExamId)) {
						System.out.println("Successful insert PhysicalExamBean");
					} else {
						System.out.println("Failed insert PhysicalExamBean");
					}
				} else {
					System.out.println("Invalid connection PhysicalExamBean");
				}

				ClinicalDataBean cdb = BeanFactory.getClinicalDataBean(dateOfVisit, "", "", "", "", currentSymptoms, "", "", "", "", "", "",
						"", "", "");
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

				BloodChemistryBean bcb = BeanFactory.getBloodChemistryBean(0.0, creatinine, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
						0.0, 0.0, 0.0, 0.0, iCa, totalProtein, albumin, globulin, 0.0, 0.0);
				if (connection != null) {
					if (SQLOperationsFollowUp.updateBloodChemistry(bcb, connection, disease, bloodChemistryId)) {
						System.out.println("Successful insert BloodChemistryBean");
					} else {
						System.out.println("Failed insert BloodChemistryBean");
					}
				} else {
					System.out.println("Invalid connection BloodChemistryBean");
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

				ImagingStudiesBean isb = BeanFactory.getImagingStudiesBean(imagingStudiesResult.getBytes());
				if (connection != null) {
					if (SQLOperationsFollowUp.updateImagingStudies(isb, connection, disease, imagingStudiesId)) {
						System.out.println("Successful insert ImagingStudiesBean");
					} else {
						System.out.println("Failed insert ImagingStudiesBean");
					}
				} else {
					System.out.println("Invalid connection ImagingStudiesBean");
				}

				SerumFreeBean sfb = BeanFactory.getSerumFreeBean(serumFree);
				if (connection != null) {
					if (SQLOperationsFollowUp.updateSerumFree(sfb, connection, disease, serumFreeId)) {
						System.out.println("Successful insert SerumFreeBean");
					} else {
						System.out.println("Failed insert SerumFreeBean");
					}
				} else {
					System.out.println("Invalid connection SerumFreeBean");
				}

				SerumProteinBean spb = BeanFactory.getSerumProteinBean(serumProteinElectrophoresisResult);
				if (connection != null) {
					if (SQLOperationsFollowUp.updateSerumProtein(spb, connection, disease, serumProteinId)) {
						System.out.println("Successful insert SerumProteinBean");
					} else {
						System.out.println("Failed insert SerumProteinBean");
					}
				} else {
					System.out.println("Invalid connection SerumProteinBean");
				}

				SerumImmunofixationBean sifb = BeanFactory.getSerumImmunofixationBean(serumImmunofixationResult);
				if (connection != null) {
					if (SQLOperationsFollowUp.updateSerumImmunofixation(sifb, connection, disease, serumImmunofixationId)) {
						System.out.println("Successful insert SerumImmunofixationBean");
					} else {
						System.out.println("Failed insert SerumImmunofixationBean");
					}
				} else {
					System.out.println("Invalid connection SerumImmunofixationBean");
				}

				UrineProteinBean upb = BeanFactory.getUrineProteinBean(urineProteinResult);
				if (connection != null) {
					if (SQLOperationsFollowUp.updateUrineProtein(upb, connection, disease, urineProteinId)) {
						System.out.println("Successful insert UrineProteinBean");
					} else {
						System.out.println("Failed insert UrineProteinBean");
					}
				} else {
					System.out.println("Invalid connection UrineProteinBean");
				}

				LaboratoryProfileBean lpb = BeanFactory.getLaboratoryProfileBean(dateOfBloodCollection, "");
				if (connection != null) {
					if (SQLOperationsFollowUp.updateLaboratoryProfile(lpb, connection, diseaseStatusId, laboratoryId)) {
						System.out.println("Successful insert LaboratoryProfileBean");
					} else {
						System.out.println("Failed insert LaboratoryProfileBean");
					}
				} else {
					System.out.println("Invalid connection LaboratoryProfileBean");
				}

				DiseaseStatusBean dsb = BeanFactory.getDiseaseStatusBean(diseaseStatus, relapseDisease, otherDisease);
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
