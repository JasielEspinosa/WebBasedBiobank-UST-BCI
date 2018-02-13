package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utility.database.SQLOperationsBaseline;

@WebServlet("/GetAAPNHMDSPatientServlet")
public class GetAAPNHMDSPatientServlet extends HttpServlet {
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

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//
		
		int patientId = Integer.parseInt(request.getParameter("patientId"));
		try {	
			if (connection != null) {
				ResultSet aaphsmdsPatientsList = SQLOperationsBaseline.getAAPHSMDSBaselinePatients(connection); 			
				ResultSet patientInfo = SQLOperationsBaseline.getPatient(patientId, connection); 			
				
				patientInfo.first();
				int generalDataId = patientInfo.getInt("generalDataId");
				int clinicalDataId = patientInfo.getInt("clinicalDataId");
				int laboratoryId = patientInfo.getInt("laboratoryId");
				int treatmentId = patientInfo.getInt("treatmentId");
				
				ResultSet generalData = SQLOperationsBaseline.getGeneralData(generalDataId, connection);
				generalData.first();
				int addressId = generalData.getInt("addressId");
				
				ResultSet address = SQLOperationsBaseline.getAddress(addressId, connection);
				
				ResultSet clinicalData = SQLOperationsBaseline.getClinicalData(clinicalDataId, connection);
				clinicalData.first();
				int physicalExamId = clinicalData.getInt("physicalExamId");
				
				ResultSet physicalExam = SQLOperationsBaseline.getPhysicalExam(physicalExamId, connection);
				
				ResultSet laboratoryProfile = SQLOperationsBaseline.getLaboratoryProfile(laboratoryId, connection);
				laboratoryProfile.first();
				int hematologyId = laboratoryProfile.getInt("hematologyId");
				int otherLaboratoriesId = laboratoryProfile.getInt("otherLaboratoriesId");
				int boneMarrowAspirateId = laboratoryProfile.getInt("boneMarrowAspirateId");
				int flowCytometryId = laboratoryProfile.getInt("flowCytometry");
				int cytogeneticAAPNHId = laboratoryProfile.getInt("cytogenicaapnhID");
				int cytogeneticMDSId = laboratoryProfile.getInt("cytogenicmdsID");
				
				ResultSet hematology = SQLOperationsBaseline.getHematology(hematologyId, connection);
				ResultSet otherLaboratories = SQLOperationsBaseline.getOtherLaboratoriesAAPNHMDS(otherLaboratoriesId, connection);
				ResultSet boneMarrowAspirate = SQLOperationsBaseline.getBoneMarrowAspirate(boneMarrowAspirateId, connection);
				ResultSet flowCytometry = SQLOperationsBaseline.getFlowCytometry(flowCytometryId, connection);
				ResultSet cytogeneticAAPNH = SQLOperationsBaseline.getCytogeneticAAPNH(cytogeneticAAPNHId, connection);
				ResultSet cytogeneticMDS = SQLOperationsBaseline.getCytogeneticMDSAAPNH(cytogeneticMDSId, connection);
				
				ResultSet treatment = SQLOperationsBaseline.getTreatment(treatmentId, connection);
				
				request.setAttribute("aaphsmdsPatientsList", aaphsmdsPatientsList);
				request.setAttribute("patientInfo", patientInfo);
				request.setAttribute("generalData", generalData);
				request.setAttribute("address", address);
				request.setAttribute("clinicalData", clinicalData);
				request.setAttribute("physicalExam", physicalExam);
				request.setAttribute("laboratoryProfile", laboratoryProfile);
				request.setAttribute("hematology", hematology);
				request.setAttribute("otherLaboratories", otherLaboratories);
				request.setAttribute("boneMarrowAspirate", boneMarrowAspirate);
				request.setAttribute("flowCytometry", flowCytometry);
				request.setAttribute("cytogeneticAAPNH", cytogeneticAAPNH);
				request.setAttribute("cytogeneticMDS", cytogeneticMDS);
				request.setAttribute("treatment", treatment);
				
				getServletContext().getRequestDispatcher("/aaphsmds-baseline-patient-info.jsp")
					.forward(request, response);
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
