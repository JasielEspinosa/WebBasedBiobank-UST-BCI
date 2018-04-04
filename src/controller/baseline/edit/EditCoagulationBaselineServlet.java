package controller.baseline.edit;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.*;
import utility.database.SQLOperations;
import utility.database.SQLOperationsBaseline;
import utility.database.Security;
import utility.factory.BeanFactory;
import utility.values.DefaultValues;

@WebServlet("/EditCoagulationBaselineServlet")
public class EditCoagulationBaselineServlet extends HttpServlet implements DefaultValues {
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

	public EditCoagulationBaselineServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get form data

		getServletContext().log("EditCoagulationBaselineServlet insert test");

		int disease = 2;

		// GENERAL DATA
		String lastName = request.getParameter("lastName").trim().toUpperCase();
		String firstName = request.getParameter("firstName").trim().toUpperCase();
		String middleInitial = request.getParameter("middleInitial").trim().toUpperCase();
		int gender = Integer.parseInt(request.getParameter("gender"));
		String dateOfBirth = request.getParameter("dateOfBirth");
		String address = request.getParameter("address");
		String dateOfEntry = request.getParameter("dateOfEntry");

		// CLINICAL DATA
		String dateOfVisit = request.getParameter("dateOfVisit");
		String diagnosis = request.getParameter("diagnosis");
		String otherDiagnosis = request.getParameter("diagnosisOthers");
		String severity = request.getParameter("severity");
		String chiefComplaint = request.getParameter("chiefComplaint");
		String otherSymptoms = request.getParameter("otherSymptoms");

		String relationshipToPatient = noValue;
		String cancerName = noValue;
		String otherDiseasesInTheFamily = noValue;
		if (Integer.parseInt(request.getParameter("familyHistoryOfBleedingDiathesis")) == 1) {
			relationshipToPatient = request.getParameter("relationshipToPatient");
			cancerName = request.getParameter("specifyCancer");
			otherDiseasesInTheFamily = request.getParameter("otherDiseasesInTheFamily");
		}

		String comorbidities = request.getParameter("comorbidities");

		String genericName = noValue;
		Double dose = 0.0;
		String frequency = noValue;
		if (Integer.parseInt(request.getParameter("concomitantMedications")) == 1) {
			genericName = request.getParameter("genericName");
			dose = Double.parseDouble(request.getParameter("dose"));
			frequency = request.getParameter("frequency");
		}

		String smokingHistorySpecify = noValue;
		if (Integer.parseInt(request.getParameter("smokingHistory")) == 1) {
			smokingHistorySpecify = request.getParameter("smokingHistorySpecify");
		}

		String alchoholIntakeSpecify = noValue;
		if (Integer.parseInt(request.getParameter("alcoholIntakeHistory")) == 1) {
			alchoholIntakeSpecify = request.getParameter("alcoholIntakeSpecify");
		}

		String chemicalExposureSpecify = noValue;
		if (Integer.parseInt(request.getParameter("chemicalExposureHistory")) == 1) {
			chemicalExposureSpecify = request.getParameter("chemicalExposureSpecify");
		}

		////// Physical Exam
		double height = Double.parseDouble(request.getParameter("height"));
		double weight = Double.parseDouble(request.getParameter("weight"));

		boolean presenceOfHemarthroses;
		if (Integer.parseInt(request.getParameter("presenceOfHemarthroses")) != 0) {
			presenceOfHemarthroses = true;
		} else {
			presenceOfHemarthroses = false;
		}

		boolean presenceOfContracturesAndMuscleAtrophy;
		if (Integer.parseInt(request.getParameter("presenceOfContracturesAndMuscleAtrophy")) != 0) {
			presenceOfContracturesAndMuscleAtrophy = true;
		} else {
			presenceOfContracturesAndMuscleAtrophy = false;
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
		double plateletCount = Double.parseDouble(request.getParameter("plateletCount"));
		////// Coagulation Testing
		double factorVIIILevel = Double.parseDouble(request.getParameter("factorVIIILevel"));
		double factorIXLevel = Double.parseDouble(request.getParameter("factorIXLevel"));
		double inhibitorAssay = Double.parseDouble(request.getParameter("inhibitorAssay"));
		double bethesdaUnits = Double.parseDouble(request.getParameter("bethesdaUnits"));
		////// Blood Chemistry
		double creatinine = Double.parseDouble(request.getParameter("creatinine"));
		double uricAcid = Double.parseDouble(request.getParameter("uricAcid"));
		double na = Double.parseDouble(request.getParameter("na"));
		double k = Double.parseDouble(request.getParameter("k"));
		double sgot = Double.parseDouble(request.getParameter("sgot"));
		double sgpt = Double.parseDouble(request.getParameter("sgpt"));
		double ldh = Double.parseDouble(request.getParameter("ldh"));

		String imagingStudiesResult = noValue;
		if (Integer.parseInt(request.getParameter("imagingStudies")) == 1) {
			imagingStudiesResult = request.getParameter("imagingStudiesResult");
		}

		// TREATMENT / THERAPHY AND RESPONSE

		String treatment = request.getParameter("treatment");
		String treatmentSpecify = noValue;
		System.out.println(treatment);
		if (treatment.equalsIgnoreCase("Others")) {
			treatmentSpecify = request.getParameter("treatmentSpecify");
		}

		if (treatment.contains("&#40;") || treatment.contains("&#41;")) {
			treatment = treatment.replaceAll("&#40;", "(");
			treatment = treatment.replaceAll("&#41;", ")");
		}

		if (treatmentSpecify.contains("&#40;") || treatmentSpecify.contains("&#41;")) {
			treatmentSpecify = treatment.replaceAll("&#40;", "(");
			treatmentSpecify = treatment.replaceAll("&#41;", ")");
		}

		// INSERT VALUES
		String addressArray[] = address.split(",");

		/////TO EDIT
		//get all id
		int patientId = Integer.parseInt(request.getParameter("patientIDNumber"));
		try {
			if (connection != null) {
				ResultSet patientInfoRS = SQLOperationsBaseline.getPatient(patientId, connection);
				patientInfoRS.first();

				int generalDataID = patientInfoRS.getInt("GeneralDataId");
				int clinicalDataID = patientInfoRS.getInt("ClinicalDataId");
				int laboratoryId = patientInfoRS.getInt("LaboratoryId");
				int treatmentID = patientInfoRS.getInt("TreatmentId");

				ResultSet generalDataRS = SQLOperationsBaseline.getGeneralData(generalDataID, connection);
				generalDataRS.first();

				int addressID = generalDataRS.getInt("AddressID");
				int tissueSpecimenID = generalDataRS.getInt("TissueSpecimenID");

				ResultSet clinicalDataRS = SQLOperationsBaseline.getClinicalData(clinicalDataID, connection);
				clinicalDataRS.first();

				int physicalExamID = clinicalDataRS.getInt("PhysicalExamId");
				int severityID = clinicalDataRS.getInt("SeverityID");

				ResultSet laboratoryProfile = SQLOperationsBaseline.getLaboratoryProfile(laboratoryId, connection);
				laboratoryProfile.first();

				int hematologyID = laboratoryProfile.getInt("HematologyId");
				int coagulationTestingID = laboratoryProfile.getInt("CoagulationTestingID");
				int bloodChemistryID = laboratoryProfile.getInt("BloodChemistryID");
				int imagingStudiesID = laboratoryProfile.getInt("ImagingStudiesID");
				int diseaseStatusID = laboratoryProfile.getInt("DiseaseStatusID");

				ResultSet treatmentRS = SQLOperationsBaseline.getTreatment(treatmentID, connection);
				treatmentRS.first();

				int modeOfTreatmentID = treatmentRS.getInt("ModeOfTreatmentID");

				//start of edit
				AddressBean ab = BeanFactory.getAddressBean(Security.encrypt(addressArray[0]).trim(),
						Security.encrypt(addressArray[1]).trim(), Security.encrypt(addressArray[2]).trim());
				if (connection != null) {
					if (SQLOperationsBaseline.editAddress(ab, connection, disease, addressID)) {
						System.out.println("Successful insert AddressBean");
					} else {
						System.out.println("Failed insert AddressBean");
					}
				} else {
					System.out.println("Invalid connection AddressBean");
				}

				TissueSpecimenBean tsb = BeanFactory.getTissueSpecimenBean("");
				if (connection != null) {
					if (SQLOperationsBaseline.editTissueSpecimenData(tsb, connection, disease, tissueSpecimenID)) {
						System.out.println("Successful insert TissueSpecimenBean");
					} else {
						System.out.println("Failed insert TissueSpecimenBean");
					}
				} else {
					System.out.println("Invalid connection TissueSpecimenBean");
				}

				GeneralDataBean gdb = BeanFactory.getGeneralDataBean(lastName, firstName, middleInitial, gender, dateOfBirth, dateOfEntry);
				if (connection != null) {
					if (SQLOperationsBaseline.editGeneralData(gdb, connection, disease, generalDataID)) {
						System.out.println("Successful insert GeneralDataBean");
					} else {
						System.out.println("Failed insert GeneralDataBean");
					}
				} else {
					System.out.println("Invalid connection GeneralDataBean");
				}

				PhysicalExamBean peb = BeanFactory.getPhysicalExamBean(height, weight, 0.0, 0.0, 0.0, 0.0, presenceOfHemarthroses,
						presenceOfContracturesAndMuscleAtrophy, "", "", false, otherFindings);
				if (connection != null) {
					if (SQLOperationsBaseline.editPhysicalExam(peb, connection, disease, physicalExamID)) {
						System.out.println("Successful insert PhysicalExamBean");
					} else {
						System.out.println("Failed insert PhysicalExamBean");
					}
				} else {
					System.out.println("Invalid connection PhysicalExamBean");
				}

				SeverityBean sb = BeanFactory.getSeverityBean(severity);
				if (connection != null) {
					if (SQLOperationsBaseline.editSeverity(sb, connection, disease, severityID)) {
						System.out.println("Successful insert SeverityBean");
					} else {
						System.out.println("Failed insert SeverityBean");
					}
				} else {
					System.out.println("Invalid connection SeverityBean");
				}

				ClinicalDataBean cdb = BeanFactory.getClinicalDataBean(dateOfVisit, diagnosis, otherDiagnosis, "", chiefComplaint, "", "",
						otherSymptoms, comorbidities, smokingHistorySpecify, alchoholIntakeSpecify, chemicalExposureSpecify, "", "",
						otherFindings);
				if (connection != null) {
					if (SQLOperationsBaseline.editClinicalData(cdb, connection, disease, clinicalDataID)) {
						System.out.println("Successful insert ClinicalDataBean");
					} else {
						System.out.println("Failed insert ClinicalDataBean");
					}
				} else {
					System.out.println("Invalid connection ClinicalDataBean");
				}

				FamilyCancerBean famcb = BeanFactory.getFamilyCancerBean(relationshipToPatient, cancerName);
				if (connection != null) {
					if (SQLOperationsBaseline.editFamilyCancer(famcb, connection, disease, clinicalDataID)) {
						System.out.println("Successful insert FamilyCancerBean");
					} else {
						System.out.println("Failed insert FamilyCancerBean");
					}
				} else {
					System.out.println("Invalid connection FamilyCancerBean");
				}

				OtherDiseasesBean odb = BeanFactory.getOtherDiseasesBean(otherDiseasesInTheFamily);
				if (connection != null) {
					if (SQLOperationsBaseline.editOtherDiseases(odb, connection, disease, clinicalDataID)) {
						System.out.println("Successful insert OtherDiseasesBean");
					} else {
						System.out.println("Failed insert OtherDiseasesBean");
					}
				} else {
					System.out.println("Invalid connection OtherDiseasesBean");
				}

				MedicationsBean mb = BeanFactory.getMedicationsBean(genericName, dose, frequency);
				if (connection != null) {
					if (SQLOperationsBaseline.editMedications(mb, connection, disease, clinicalDataID)) {
						System.out.println("Successful insert MedicationsBean");
					} else {
						System.out.println("Failed insert MedicationsBean");
					}
				} else {
					System.out.println("Invalid connection MedicationsBean");
				}

				HematologyBean hb = BeanFactory.getHematologyBean(hemoglobin, hematocrit, whiteBloodCells, neutrophils, lymphocytes,
						monocytes, eosinophils, basophils, 0, 0, 0, plateletCount);
				if (connection != null) {
					if (SQLOperationsBaseline.editHematology(hb, connection, disease, hematologyID)) {
						System.out.println("Successful insert HematologyBean");
					} else {
						System.out.println("Failed insert HematologyBean");
					}
				} else {
					System.out.println("Invalid connection HematologyBean");
				}

				CoagulationTestingBean ctb = BeanFactory.getCoagulationTestingBean(factorVIIILevel, factorIXLevel, inhibitorAssay,
						bethesdaUnits);
				if (connection != null) {
					if (SQLOperationsBaseline.editCoagulationTesting(ctb, connection, disease, coagulationTestingID)) {
						System.out.println("Successful insert CoagulationTestingBean");
					} else {
						System.out.println("Failed insert CoagulationTestingBean");
					}
				} else {
					System.out.println("Invalid connection CoagulationTestingBean");
				}

				BloodChemistryBean bcb = BeanFactory.getBloodChemistryBean(0, creatinine, uricAcid, sgot, sgpt, ldh, 0, na, k, 0, 0, 0, 0,
						0, 0, 0, 0, 0, 0, 0, 0);
				if (connection != null) {
					if (SQLOperationsBaseline.editBloodChemistry(bcb, connection, disease, bloodChemistryID)) {
						System.out.println("Successful insert BloodChemistryBean");
					} else {
						System.out.println("Failed insert BloodChemistryBean");
					}
				} else {
					System.out.println("Invalid connection BloodChemistryBean");
				}

				ImagingStudiesBean isb = BeanFactory.getImagingStudiesBean(imagingStudiesResult.getBytes());
				if (connection != null) {
					if (SQLOperationsBaseline.editImagingStudies(isb, connection, disease, imagingStudiesID)) {
						System.out.println("Successful insert ImagingStudiesBean");
					} else {
						System.out.println("Failed insert ImagingStudiesBean");
					}
				} else {
					System.out.println("Invalid connection ImagingStudiesBean");
				}

				LaboratoryProfileBean lpb = BeanFactory.getLaboratoryProfileBean(dateOfBloodCollection, "");
				if (connection != null) {
					if (SQLOperationsBaseline.editLaboratoryProfile(lpb, connection, disease, laboratoryId)) {
						System.out.println("Successful insert LaboratoryProfileBean");
					} else {
						System.out.println("Failed insert LaboratoryProfileBean");
					}
				} else {
					System.out.println("Invalid connection LaboratoryProfileBean");
				}

				ModeOfTreatmentBean motb = BeanFactory.getModeOfTreatmentBean(treatment, treatmentSpecify);
				if (connection != null) {
					if (SQLOperationsBaseline.editModeOfTreatment(motb, connection, disease, modeOfTreatmentID)) {
						System.out.println("Successful insert ModeOfTreatmentBean");
					} else {
						System.out.println("Failed insert ModeOfTreatmentBean");
					}
				} else {
					System.out.println("Invalid connection ModeOfTreatmentBean");
				}

				TreatmentBean tb = BeanFactory.getTreatmentBean(true, "", 0, "", "");
				if (connection != null) {
					if (SQLOperationsBaseline.editTreatment(tb, connection, disease, treatmentID)) {
						System.out.println("Successful insert TreatmentBean");
					} else {
						System.out.println("Failed insert TreatmentBean");
					}
				} else {
					System.out.println("Invalid connection TreatmentBean");
				}

				DiseaseStatusBean dsb = BeanFactory.getDiseaseStatusBean("", "", "");
				if (connection != null) {
					if (SQLOperationsBaseline.editDiseaseStatus(dsb, connection, disease, diseaseStatusID)) {
						System.out.println("Successful insert DiseaseStatusBean");
					} else {
						System.out.println("Failed insert DiseaseStatusBean");
					}
				} else {
					System.out.println("Invalid connection DiseaseStatusBean");
				}

				HttpSession session = request.getSession(true);

				AuditBean auditBean = new AuditBean("Edit patient in Coagulation Disease Baseline",
						request.getParameter("lastName").trim().toUpperCase() + ", " + request.getParameter("firstName").trim()
								.toUpperCase() + " " + request.getParameter("middleInitial").trim().toUpperCase(),
						(String) session.getAttribute("name"), Integer.parseInt((String) session.getAttribute("accountID")));
				SQLOperations.addAudit(auditBean, connection);

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
