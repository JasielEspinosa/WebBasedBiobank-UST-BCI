package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AddressBean;
import model.BoneMarrowAspirateBean;
import model.ChemotherapyMedicationsBean;
import model.ClassificationBean;
import model.ClinicalDataBean;
import model.CytogeneticAAPNHBean;
import model.CytogeneticMDSBean;
import model.FamilyCancerBean;
import model.FlowCytometryBean;
import model.GeneralDataBean;
import model.HematologyBean;
import model.LaboratoryProfileBean;
import model.MedicationsBean;
import model.ModeOfTreatmentBean;
import model.OtherDiseasesBean;
import model.OtherLaboratoriesBean;
import model.PhysicalExamBean;
import model.TissueSpecimenBean;
import model.TreatmentBean;
import utility.database.SQLOperations;
import utility.factory.BeanFactory;

/**
 * Servlet implementation class EditAAPHSMDSBaselineServlet
 */
@WebServlet("/EditAAPHSMDSBaselineServlet")
public class EditAAPHSMDSBaselineServlet extends HttpServlet {
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
	
	
    public EditAAPHSMDSBaselineServlet() {
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
		//get form data
		
		int disease = 1;
		
		// GENERAL DATA
		String lastName = request.getParameter("lastName");
		String firstName = request.getParameter("firstName");
		String middleInitial = request.getParameter("middleInitial");
		int gender = Integer.parseInt(request.getParameter("gender"));
		String dateOfBirth = request.getParameter("dateOfBirth");
		String address = request.getParameter("address");
		String dateOfEntry = request.getParameter("dateOfEntry");
		String specimenType = request.getParameter("specimenType");

/*		System.out.println(patientIDNumber);
		System.out.println(lastName);
		System.out.println(firstName);
		System.out.println(middleInitial);
		System.out.println(gender);
		System.out.println(dateOfBirth);
		System.out.println(address);
		System.out.println(dateOfEntry);
		System.out.println(specimenType);*/

		// CLINICAL DATA
		String dateOfVisit = request.getParameter("dateOfVisit");
		String diagnosis = request.getParameter("diagnosis");
		////// Classification/Risk Statification
		String severity = request.getParameter("severity");
		String chiefComplaint = request.getParameter("chiefComplaint");
		String otherSymptoms = request.getParameter("otherSymptoms");
		String relationshipToPatient = request.getParameter("relationshipToPatient");
		String cancerName = request.getParameter("specifyCancer");
		String otherDiseasesInTheFamily = request.getParameter("otherDiseasesInTheFamily");
		String comorbidities = request.getParameter("comorbidities");
		String genericName = request.getParameter("genericName");
		double dose = Double.parseDouble(request.getParameter("dose"));
		String frequency = request.getParameter("frequency");
		String smokingHistorySpecify = request.getParameter("smokingHistorySpecify");
		String alchoholIntakeSpecify = request.getParameter("alcoholIntakeSpecify");
		String chemicalExposureSpecify = request.getParameter("chemicalExposureSpecify");
		String previousInfectionSpecify = request.getParameter("previousInfectionSpecify");
		String previousHematologicDisorderSpecify = request.getParameter("previousHematologicDisorderSpecify");
		////// Physical Exam
		double height = Double.parseDouble(request.getParameter("height"));
		double weight = Double.parseDouble(request.getParameter("weight"));
		double ecog = Double.parseDouble(request.getParameter("ecog"));
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
		double myelocytes = Double.parseDouble(request.getParameter("myelocytes"));
		double metamyelocytes = Double.parseDouble(request.getParameter("metamyelocytes"));
		double blasts = Double.parseDouble(request.getParameter("blasts"));
		double plateletCount = Double.parseDouble(request.getParameter("plateletCount"));
		////// Other Laboratories
		double creatinine = Double.parseDouble(request.getParameter("creatinine"));
		double uricAcid = Double.parseDouble(request.getParameter("uricAcid"));
		double reticulocyteCount = Double.parseDouble(request.getParameter("reticulocyteCount"));
		double serumIron = Double.parseDouble(request.getParameter("serumIron"));
		double ironBindingCapacity = Double.parseDouble(request.getParameter("ironBindingCapacity"));
		double serumFerritin = Double.parseDouble(request.getParameter("serumFerritin"));
		String directAntiglobulin = request.getParameter("directAntiglobulin");
		String indirectAntiglobulin = request.getParameter("indirectAntiglobulin");
		double sgot = Double.parseDouble(request.getParameter("sgot"));
		double sgpt = Double.parseDouble(request.getParameter("sgpt"));
		double ldh = Double.parseDouble(request.getParameter("ldh"));
		String screeningTestsForHepatitisVirusesABC = request.getParameter("screeningTestsForHepatitisVirusesABC");
		String screeningTestsForEBVCMVHIV = request.getParameter("screeningTestsForEBVCMVHIV");
		double erythropoeitinLevel = Double.parseDouble(request.getParameter("erythropoeitinLevel"));
		double serumFolicAcid = Double.parseDouble(request.getParameter("serumFolicAcid"));
		double serumB12 = Double.parseDouble(request.getParameter("serumB12"));
		double tsh = Double.parseDouble(request.getParameter("tsh"));
		String boneMarrowAspirateDatePerformed = request.getParameter("boneMarrowAspirateDatePerformed");
		String boneMarrowAspirateDescription = request.getParameter("boneMarrowAspirateDescription");
		// Part boneMarrowAspirateAttachScannedDocument = request.getPart("boneMarrowAspirateAttachScannedDocument");
		// int flowCytometry = Integer.parseInt(request.getParameter("flowCytometry"));
		String flowCytometryResult = request.getParameter("flowCytometryResult");
		// Part flowCytometryAttachScannedDocument = request.getPart("flowCytometryAttachScannedDocument");
		// int cytogeneticAndMolecularAnalysisAAPNH = Integer.parseInt(request.getParameter("cytogeneticAndMolecularAnalysisAAPNH"));
		String cytogeneticAndMolecularAnalysisAAPNHResult = request
				.getParameter("cytogeneticAndMolecularAnalysisAAPNHResult");
		// Part cytogeneticAndMolecularAnalysisAAPNHAttachScannedDocument = request.getPart("cytogeneticAndMolecularAnalysisAAPNHAttachScannedDocument");
		// int cytogeneticAndMolecularAnalysisMDS = Integer.parseInt(request.getParameter("cytogeneticAndMolecularAnalysisMDS"));
		String cytogeneticAndMolecularAnalysisMDSResult = request
				.getParameter("cytogeneticAndMolecularAnalysisMDSResult");
		// Part cytogeneticAndMolecularAnalysisMDSAttachScannedDocument = request.getPart("cytogeneticAndMolecularAnalysisMDSAttachScannedDocument");

		// TREATMENT / THERAPHY AND RESPONSE
		boolean transplantCandidate;
		if (Integer.parseInt(request.getParameter("transplantCandidate")) != 0) {
			transplantCandidate = true;
		} else {
			transplantCandidate = false;
		}
		String modeOfTreatment = request.getParameter("modeOfTreament");
		String medications = request.getParameter("medications");
		String dateStarted = request.getParameter("dateStarted");

		// INSERT VALUES
		String addressArray[] = address.split(",");
		
		
		//get all id
		int patientId = Integer.parseInt(request.getParameter("patientId"));
		try {	
			if (connection != null) {	
				ResultSet patientInfo = SQLOperations.getPatient(patientId, connection); 			
				patientInfo.first();

				int generalDataId = patientInfo.getInt("generalDataId");
				int clinicalDataId = patientInfo.getInt("clinicalDataId");
				int laboratoryId = patientInfo.getInt("laboratoryId");
				int treatmentId = patientInfo.getInt("treatmentId");
				
				ResultSet generalData = SQLOperations.getGeneralData(generalDataId, connection);
				generalData.first();
				
				int addressId = generalData.getInt("AddressID");
				int tissueSpecimenId = generalData.getInt("TissueSpecimenID");

				ResultSet clinicalData = SQLOperations.getClinicalData(clinicalDataId, connection);
				clinicalData.first();
				
				int classificationId = clinicalData.getInt("ClassificationID");
				int physicalExamId = clinicalData.getInt("physicalExamId");
				
				ResultSet laboratoryProfile = SQLOperations.getLaboratoryProfile(laboratoryId, connection);
				laboratoryProfile.first();
				
				int hematologyId = laboratoryProfile.getInt("hematologyId");
				int otherLaboratoriesId = laboratoryProfile.getInt("otherLaboratoriesId");
				int boneMarrowAspirateId = laboratoryProfile.getInt("boneMarrowAspirateId");
				int flowCytometryId = laboratoryProfile.getInt("FlowCytometryID");
				int cytogeneticAAPNHId = laboratoryProfile.getInt("cytogenicaapnhID");
				int cytogeneticMDSId = laboratoryProfile.getInt("cytogenicmdsID");
				
				ResultSet treatment = SQLOperations.getTreatment(treatmentId, connection);
				treatment.first();
				
				int chemoMedicationId = treatment.getInt("ChemoMedicationID");
				int modeOfTreatmentId = treatment.getInt("ModeOfTreatmentID");
				
				//start of edit
				AddressBean ab = BeanFactory.getAddressBean(addressArray[0], addressArray[1], addressArray[2]);
				if (connection != null) {
					if (SQLOperations.editAddress(ab, connection, disease, addressId)){
						System.out.println("Successful insert AddressBean");
					} else {
						System.out.println("Failed insert AddressBean");
					}
				} else {
					System.out.println("Invalid connection AddressBean");
				}

				TissueSpecimenBean tsb = BeanFactory.getTissueSpecimenBean(specimenType);
				if (connection != null) {
					if (SQLOperations.editTissueSpecimenData(tsb, connection, disease, tissueSpecimenId)) {
						System.out.println("Successful insert TissueSpecimenBean");
					} else {
						System.out.println("Failed insert TissueSpecimenBean");
					}
				} else {
					System.out.println("Invalid connection TissueSpecimenBean");
				}

				GeneralDataBean gdb = BeanFactory.getGeneralDataBean(lastName, middleInitial, firstName, gender, dateOfBirth,
						dateOfEntry);
				if (connection != null) {
					if (SQLOperations.editGeneralData(gdb, connection, disease, generalDataId)) {
						System.out.println("Successful insert GeneralDataBean");
					} else {
						System.out.println("Failed insert GeneralDataBean");
					}
				} else {
					System.out.println("Invalid connection GeneralDataBean");
				}

				ClassificationBean csb = BeanFactory.getClassificationBean(severity);
				if (connection != null) {
					if (SQLOperations.editClassification(csb, connection, disease, classificationId)) {
						System.out.println("Successful insert ClassificationBean");
					} else {
						System.out.println("Failed insert ClassificationBean");
					}
				} else {
					System.out.println("Invalid connection ClassificationBean");
				}

				PhysicalExamBean peb = BeanFactory.getPhysicalExamBean(height, weight, ecog, 0.0, 0.0, 0.0, false, false, "",
						"", otherFindings);
				if (connection != null) {
					if (SQLOperations.addPhysicalExam(peb, connection, disease)) {
						System.out.println("Successful insert PhysicalExamBean");
					} else {
						System.out.println("Failed insert PhysicalExamBean");
					}
				} else {
					System.out.println("Invalid connection PhysicalExamBean");
				}

				ClinicalDataBean cdb = BeanFactory.getClinicalDataBean(dateOfVisit, diagnosis, null, "", chiefComplaint, null,
						otherSymptoms, comorbidities, smokingHistorySpecify, alchoholIntakeSpecify, chemicalExposureSpecify,
						previousInfectionSpecify, previousHematologicDisorderSpecify, "");
				if (connection != null) {
					if (SQLOperations.addClinicalData(cdb, connection, disease)) {
						System.out.println("Successful insert ClinicalDataBean");
					} else {
						System.out.println("Failed insert ClinicalDataBean");
					}
				} else {
					System.out.println("Invalid connection ClinicalDataBean");
				}

				FamilyCancerBean famcb = BeanFactory.getFamilyCancerBean(relationshipToPatient, cancerName);
				if (connection != null) {
					if (SQLOperations.addFamilyCancer(famcb, connection, disease)) {
						System.out.println("Successful insert FamilyCancerBean");
					} else {
						System.out.println("Failed insert FamilyCancerBean");
					}
				} else {
					System.out.println("Invalid connection FamilyCancerBean");
				}

				OtherDiseasesBean odb = BeanFactory.getOtherDiseasesBean(otherDiseasesInTheFamily);
				if (connection != null) {
					if (SQLOperations.addOtherDiseases(odb, connection, disease)) {
						System.out.println("Successful insert OtherDiseasesBean");
					} else {
						System.out.println("Failed insert OtherDiseasesBean");
					}
				} else {
					System.out.println("Invalid connection OtherDiseasesBean");
				}

				MedicationsBean mb = BeanFactory.getMedicationsBean(genericName, dose, frequency);
				if (connection != null) {
					if (SQLOperations.addMedications(mb, connection, disease)) {
						System.out.println("Successful insert MedicationsBean");
					} else {
						System.out.println("Failed insert MedicationsBean");
					}
				} else {
					System.out.println("Invalid connection MedicationsBean");
				}

				HematologyBean hb = BeanFactory.getHematologyBean(hemoglobin, hematocrit, whiteBloodCells, neutrophils,
						lymphocytes, monocytes, eosinophils, basophils, myelocytes, metamyelocytes, blasts, plateletCount);
				if (connection != null) {
					if (SQLOperations.addHematology(hb, connection, disease)) {
						System.out.println("Successful insert HematologyBean");
					} else {
						System.out.println("Failed insert HematologyBean");
					}
				} else {
					System.out.println("Invalid connection HematologyBean");
				}

				OtherLaboratoriesBean olb = BeanFactory.getOtherLaboratoriesBean(creatinine, uricAcid, reticulocyteCount,
						serumIron, ironBindingCapacity, serumFerritin, directAntiglobulin, indirectAntiglobulin, sgot, sgpt,
						ldh, screeningTestsForHepatitisVirusesABC, screeningTestsForEBVCMVHIV, erythropoeitinLevel,
						serumFolicAcid, serumB12, tsh);
				if (connection != null) {
					if (SQLOperations.addOtherLaboratories(olb, connection, disease)) {
						System.out.println("Successful insert OtherLaboratoriesBean");
					} else {
						System.out.println("Failed insert OtherLaboratoriesBean");
					}
				} else {
					System.out.println("Invalid connection OtherLaboratoriesBean");
				}

				BoneMarrowAspirateBean bmab = BeanFactory.getBoneMarrowAspirateBean(boneMarrowAspirateDatePerformed,
						boneMarrowAspirateDescription);
				if (connection != null) {
					if (SQLOperations.addBoneMarrowAspirate(bmab, connection, disease)) {
						System.out.println("Successful insert BoneMarrowAspirateBean");
					} else {
						System.out.println("Failed insert BoneMarrowAspirateBean");
					}
				} else {
					System.out.println("Invalid connection BoneMarrowAspirateBean");
				}

				FlowCytometryBean fcb = BeanFactory.getFlowCytometryBean(flowCytometryResult);
				if (connection != null) {
					if (SQLOperations.addFlowCytometry(fcb, connection, disease)) {
						System.out.println("Successful insert FlowCytometryBean");
					} else {
						System.out.println("Failed insert FlowCytometryBean");
					}
				} else {
					System.out.println("Invalid connection FlowCytometryBean");
				}

				CytogeneticAAPNHBean caapnhb = BeanFactory.getCytogeneticAAPNHBean(cytogeneticAndMolecularAnalysisAAPNHResult);
				if (connection != null) {
					if (SQLOperations.addCytogeneticAAPNH(caapnhb, connection, disease)) {
						System.out.println("Successful insert CytogeneticAAPNHBean");
					} else {
						System.out.println("Failed insert CytogeneticAAPNHBean");
					}
				} else {
					System.out.println("Invalid connection CytogeneticAAPNHBean");
				}

				CytogeneticMDSBean cmdsb = BeanFactory.getCytogeneticMDSBean(cytogeneticAndMolecularAnalysisMDSResult);
				if (connection != null) {
					if (SQLOperations.addCytogeneticMDS(cmdsb, connection, disease)) {
						System.out.println("Successful insert CytogeneticMDSBean");
					} else {
						System.out.println("Failed insert CytogeneticMDSBean");
					}
				} else {
					System.out.println("Invalid connection CytogeneticMDSBean");
				}

				LaboratoryProfileBean lpb = BeanFactory.getLaboratoryProfileBean(dateOfBloodCollection, "");
				if (connection != null) {
					if (SQLOperations.addLaboratoryProfile(lpb, connection, disease)) {
						System.out.println("Successful insert LaboratoryProfileBean");
					} else {
						System.out.println("Failed insert LaboratoryProfileBean");
					}
				} else {
					System.out.println("Invalid connection LaboratoryProfileBean");
				}

				ChemotherapyMedicationsBean cmb = BeanFactory.getChemotherapyMedicationsBean(medications);
				if (connection != null) {
					if (SQLOperations.addChemotherapyMedications(cmb, connection, disease)) {
						System.out.println("Successful insert ChemotherapyMedicationsBean");
					} else {
						System.out.println("Failed insert ChemotherapyMedicationsBean");
					}
				} else {
					System.out.println("Invalid connection ChemotherapyMedicationsBean");
				}

				ModeOfTreatmentBean motb = BeanFactory.getModeOfTreatmentBean(modeOfTreatment, modeOfTreatment);
				if (connection != null) {
					if (SQLOperations.addModeOfTreatment(motb, connection, disease)) {
						System.out.println("Successful insert ModeOfTreatmentBean");
					} else {
						System.out.println("Failed insert ModeOfTreatmentBean");
					}
				} else {
					System.out.println("Invalid connection ModeOfTreatmentBean");
				}

				TreatmentBean tb = BeanFactory.getTreatmentBean(transplantCandidate, dateStarted, "", "", "", "", 0, "", "");
				if (connection != null) {
					if (SQLOperations.addTreatment(tb, connection, disease)) {
						System.out.println("Successful insert TreatmentBean");
					} else {
						System.out.println("Failed insert TreatmentBean");
					}
				} else {
					System.out.println("Invalid connection TreatmentBean");
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
