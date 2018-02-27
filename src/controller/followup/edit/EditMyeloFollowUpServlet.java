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

/**
 * Servlet implementation class EditAAPHSMDSFollowUpServlet
 */
@WebServlet("/EditAAPHSMDSFollowUpServlet")
public class EditMyeloFollowUpServlet extends HttpServlet {
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
	
    public EditMyeloFollowUpServlet() {
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
		
		String noValue = "";
		
		int disease = 5;
		System.out.println(request.getParameter("patientId"));
		int patientID = Integer.parseInt(request.getParameter("patientId"));
		int followupId = Integer.parseInt(request.getParameter("followupId"));

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
		
		String boneMarrowAspirateDatePerformed = noValue;
		String boneMarrowAspirateDescription = noValue;
		if (Integer.parseInt(request.getParameter("boneMarrowAspirate")) == 1) {
			boneMarrowAspirateDatePerformed = request.getParameter("boneMarrowAspirateDatePerformed");
			boneMarrowAspirateDescription = request.getParameter("boneMarrowAspirateDescription");
		}
		
		String diseaseStatus = request.getParameter("diseaseStatus");
		String otherDisease = noValue;
		if (diseaseStatus == "Others") {
			otherDisease = request.getParameter("diseaseStatusOthers");
		}
		
		String notes = request.getParameter("specialNotes");
		
		//load
		try {	
			if (connection != null) {
				ResultSet followup = SQLOperationsFollowUp.getFollowup(followupId, connection);
				followup.first();
				
				int medicalEventsid =  followup.getInt("MedicalEventsID");
				int clinicalDataId =  followup.getInt("ClinicalDataID");
				int laboratoryId =  followup.getInt("LaboratoryID");
				int diseaseStatusId =  followup.getInt("DiseaseStatusID");
				
				ResultSet clinicalData = SQLOperationsFollowUp.getClinicalData(clinicalDataId, connection);
				clinicalData.first();
				
				int physicalExamId = clinicalData.getInt("PhysicalExamID");
				
				ResultSet laboratoryProfile = SQLOperationsFollowUp.getLaboratoryProfile(laboratoryId, connection);
				laboratoryProfile.first();
				
				int hematologyId = laboratoryProfile.getInt("HematologyID");
				int boneMarrowAspirateId = laboratoryProfile.getInt("BoneMarrowAspirateID");

				MedicalEventsBean meb = BeanFactory.getMedicalEventsBean(hematologicMalignancy, otherDiseaseMedication, "", "", 0.0,
						procedureIntervention, chemotherapyComplication);
				if (connection != null) {
					if (SQLOperationsFollowUp.updateMedicalEvents(meb, connection, disease,medicalEventsid)) {
						System.out.println("Successful insert MedicalEventsBean");
					} else {
						System.out.println("Failed insert MedicalEventsBean");
					}
				} else {
					System.out.println("Invalid connection MedicalEventsBean");
				}

				PhysicalExamBean peb = BeanFactory.getPhysicalExamBean(0.0, weight, ecog, 0.0, 0.0, 0.0, false, false, "", "", "");
				if (connection != null) {
					if (SQLOperationsFollowUp.updatePhysicalExam(peb, connection, disease,physicalExamId)) {
						System.out.println("Successful insert PhysicalExamBean");
					} else {
						System.out.println("Failed insert PhysicalExamBean");
					}
				} else {
					System.out.println("Invalid connection PhysicalExamBean");
				}

				ClinicalDataBean cdb = BeanFactory.getClinicalDataBean("", "", "", "", "", currentSymptoms, "", "", "", "", "", "", "", "", "");
				if (connection != null) {
					if (SQLOperationsFollowUp.updateClinicalData(cdb, connection, disease,clinicalDataId)) {
						System.out.println("Successful insert ClinicalDataBean");
					} else {
						System.out.println("Failed insert ClinicalDataBean");
					}
				} else {
					System.out.println("Invalid connection ClinicalDataBean");
				}

				HematologyBean hb = BeanFactory.getHematologyBean(hemoglobin, hematocrit, whiteBloodCells, neutrophils, lymphocytes, monocytes,
						eosinophils, basophils, myelocytes, metamyelocytes, blasts, plateletCount);
				if (connection != null) {
					if (SQLOperationsFollowUp.updateHematology(hb, connection, disease,hematologyId)) {
						System.out.println("Successful insert HematologyBean");
					} else {
						System.out.println("Failed insert HematologyBean");
					}
				} else {
					System.out.println("Invalid connection HematologyBean");
				}

				BoneMarrowAspirateBean bmab = BeanFactory.getBoneMarrowAspirateBean(boneMarrowAspirateDatePerformed, boneMarrowAspirateDescription);
				if (connection != null) {
					if (SQLOperationsFollowUp.updateBoneMarrowAspirate(bmab, connection, disease,boneMarrowAspirateId)) {
						System.out.println("Successful insert BoneMarrowAspirateBean");
					} else {
						System.out.println("Failed insert BoneMarrowAspirateBean");
					}
				} else {
					System.out.println("Invalid connection BoneMarrowAspirateBean");
				}

				LaboratoryProfileBean lpb = BeanFactory.getLaboratoryProfileBean(dateOfBloodCollection, "");
				if (connection != null) {
					if (SQLOperationsFollowUp.updateLaboratoryProfile(lpb, connection, disease,laboratoryId)) {
						System.out.println("Successful insert LaboratoryProfileBean");
					} else {
						System.out.println("Failed insert LaboratoryProfileBean");
					}
				} else {
					System.out.println("Invalid connection LaboratoryProfileBean");
				}

				DiseaseStatusBean dsb = BeanFactory.getDiseaseStatusBean(diseaseStatus, "", otherDisease);
				if (connection != null) {
					if (SQLOperationsFollowUp.updateDiseaseStatus(dsb, connection, disease,diseaseStatusId)) {
						System.out.println("Successful insert DiseaseStatusBean");
					} else {
						System.out.println("Failed insert DiseaseStatusBean");
					}
				} else {
					System.out.println("Invalid connection DiseaseStatusBean");
				}

				FollowUpBean fub = BeanFactory.getFollowUpBean(patientID, dateOfEntry, dateOfVisit, notes);
				if (connection != null) {
					if (SQLOperationsFollowUp.updateFollowUp(fub, connection, disease,followupId)) {
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
