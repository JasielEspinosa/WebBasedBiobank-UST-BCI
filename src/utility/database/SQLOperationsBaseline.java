package utility.database;

import java.sql.*;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import model.*;

public class SQLOperationsBaseline implements SQLCommandsBaseline {
	private static Connection connection;

	private static Connection getDBConnection() {
		try {
			InitialContext context = new InitialContext();
			DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc/BCI-DS");

			if (dataSource != null) {
				connection = dataSource.getConnection();
			}
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static Connection getConnection() {
		return (connection != null) ? connection : getDBConnection();
	}

	// BASELINE

	public static boolean addAddress(AddressBean ab, Connection connection, int disease) {
		switch (disease) {
			case (1):
			case (2):
			case (3):
			case (4):
			case (5):
			case (6):
			case (7):
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_ADDRESS);
					pstmt.setString(1, ab.getStreetAddress());
					pstmt.setString(2, ab.getCity());
					pstmt.setString(3, ab.getZipCode());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addAddress: " + sqle.getMessage());
					return false;
				}
				break;
		}
		return true;
	}

	public static boolean addTissueSpecimenData(TissueSpecimenBean tsb, Connection connection, int disease) {
		switch (disease) {
			case (1):
			case (2):
			case (3):
			case (4):
			case (5):
			case (6):
			case (7):
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_TISSUE_SPECIMEN);
					pstmt.setString(1, tsb.getTissueSpecimenName());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addGeneralData: " + sqle.getMessage());
					return false;
				}
				break;
		}
		return true;
	}

	public static boolean addGeneralData(GeneralDataBean gdb, Connection connection, int disease) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_GENERAL_DATA);
					pstmt.setString(1, gdb.getLastName());
					pstmt.setString(2, gdb.getMiddleName());
					pstmt.setString(3, gdb.getFirstName());
					pstmt.setInt(4, gdb.getGender());
					pstmt.setString(5, gdb.getDateOfBirth());
					pstmt.setString(6, gdb.getDateOfEntry());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addGeneralData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (2): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_GENERAL_DATA_NO_TISSUE);
					pstmt.setString(1, gdb.getLastName());
					pstmt.setString(2, gdb.getMiddleName());
					pstmt.setString(3, gdb.getFirstName());
					pstmt.setInt(4, gdb.getGender());
					pstmt.setString(5, gdb.getDateOfBirth());
					pstmt.setString(6, gdb.getDateOfEntry());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addGeneralData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_GENERAL_DATA);
					pstmt.setString(1, gdb.getLastName());
					pstmt.setString(2, gdb.getMiddleName());
					pstmt.setString(3, gdb.getFirstName());
					pstmt.setInt(4, gdb.getGender());
					pstmt.setString(5, gdb.getDateOfBirth());
					pstmt.setString(6, gdb.getDateOfEntry());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addGeneralData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_GENERAL_DATA);
					pstmt.setString(1, gdb.getLastName());
					pstmt.setString(2, gdb.getMiddleName());
					pstmt.setString(3, gdb.getFirstName());
					pstmt.setInt(4, gdb.getGender());
					pstmt.setString(5, gdb.getDateOfBirth());
					pstmt.setString(6, gdb.getDateOfEntry());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addGeneralData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (5): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_GENERAL_DATA);
					pstmt.setString(1, gdb.getLastName());
					pstmt.setString(2, gdb.getMiddleName());
					pstmt.setString(3, gdb.getFirstName());
					pstmt.setInt(4, gdb.getGender());
					pstmt.setString(5, gdb.getDateOfBirth());
					pstmt.setString(6, gdb.getDateOfEntry());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addGeneralData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_GENERAL_DATA);
					pstmt.setString(1, gdb.getLastName());
					pstmt.setString(2, gdb.getMiddleName());
					pstmt.setString(3, gdb.getFirstName());
					pstmt.setInt(4, gdb.getGender());
					pstmt.setString(5, gdb.getDateOfBirth());
					pstmt.setString(6, gdb.getDateOfEntry());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addGeneralData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_GENERAL_DATA_NO_TISSUE);
					pstmt.setString(1, gdb.getLastName());
					pstmt.setString(2, gdb.getMiddleName());
					pstmt.setString(3, gdb.getFirstName());
					pstmt.setInt(4, gdb.getGender());
					pstmt.setString(5, gdb.getDateOfBirth());
					pstmt.setString(6, gdb.getDateOfEntry());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addGeneralData: " + sqle.getMessage());
					return false;
				}
				break;
			}
		}
		return true;
	}

	public static boolean addPrognosticRiskScoring(PrognosticRiskScoringBean prsb, Connection connection, int disease) {
		switch (disease) {
			case (1): {
			}
			case (2): {
			}
			case (3): {
			}
			case (4): {
			}
			case (5): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_PROGNOSTIC_RISK_SCORING);
					pstmt.setString(1, prsb.getPrognosticRiskScoringName());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addPrognosticRiskScoring: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (6): {
			}
			case (7): {
			}

		}
		return true;
	}

	public static boolean addRiskScore(RiskScoreBean rsb, Connection connection, int disease) {
		switch (disease) {
			case (1): {
			}
			case (2): {
			}
			case (3): {
			}
			case (4): {
			}
			case (5): {
				try {
					PreparedStatement psmt = connection.prepareStatement(INSERT_RISK_SCORE);
					psmt.setString(1, rsb.getRiskScoreName());
					psmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addFamilyCancer: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (6): {
			}
			case (7): {
			}
		}
		return true;
	}

	public static boolean addClassification(ClassificationBean classbean, Connection connection, int disease) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_CLASSIFICATION);
					pstmt.setString(1, classbean.getClassificationName());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addClassification: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (2): {
			}
			case (3): {
			}
			case (4): {
			}
			case (5): {
			}
			case (6): {
			}
			case (7): {
			}
		}
		return true;
	}

	public static boolean addISSStaging(ISSStagingBean issb, Connection connection, int disease) {
		switch (disease) {
			case (1): {
			}
			case (2): {
			}
			case (3): {
			}
			case (4): {
			}
			case (5): {
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_ISSSTAGING);
					pstmt.setString(1, issb.getIssStagingName());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addPrognosticRiskScoring: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
			}

		}
		return true;
	}

	public static boolean addSeverity(SeverityBean sb, Connection connection, int disease) {
		switch (disease) {
			case (1): {
			}
			case (2): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_SEVERITY);
					pstmt.setString(1, sb.getSeverityName());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addClinicalData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (3): {
			}
			case (4): {
			}
			case (5): {
			}
			case (6): {
			}
			case (7): {
			}
		}
		return true;
	}

	public static boolean addPhysicalExam(PhysicalExamBean peb, Connection connection, int disease) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_PHYSICAL_EXAM_AAPHSMDS);
					pstmt.setDouble(1, peb.getHeight());
					pstmt.setDouble(2, peb.getWeight());
					pstmt.setDouble(3, peb.getECOG());
					pstmt.setString(4, peb.getOtherFindings());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addPhysicalExamData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (2): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_PHYSICAL_EXAM_COAGULATION);
					pstmt.setDouble(1, peb.getHeight());
					pstmt.setDouble(2, peb.getWeight());
					pstmt.setBoolean(3, peb.isHemathroses());
					pstmt.setBoolean(4, peb.isContracturesAndMuscleAtrophy());
					pstmt.setString(5, peb.getOtherFindings());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addPhysicalExamData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_PHYSICAL_EXAM_LEUKEMIA);
					pstmt.setDouble(1, peb.getHeight());
					pstmt.setDouble(2, peb.getWeight());
					pstmt.setDouble(3, peb.getECOG());
					pstmt.setDouble(4, peb.getSplenomegaly());
					pstmt.setDouble(5, peb.getHepatomegaly());
					pstmt.setDouble(6, peb.getLymphadenopathies());
					pstmt.setString(7, peb.getOtherFindings());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addPhysicalExamData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_PHYSICAL_EXAM_LYMPHOMA);
					pstmt.setDouble(1, peb.getHeight());
					pstmt.setDouble(2, peb.getWeight());
					pstmt.setDouble(3, peb.getECOG());
					pstmt.setDouble(4, peb.getSplenomegaly());
					pstmt.setDouble(5, peb.getHepatomegaly());
					pstmt.setDouble(6, peb.getLymphadenopathies());
					pstmt.setString(7, peb.getOtherFindings());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addPhysicalExamData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (5): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_PHYSICAL_EXAM_MYELOPROLIFERATIVE);
					pstmt.setDouble(1, peb.getHeight());
					pstmt.setDouble(2, peb.getWeight());
					pstmt.setDouble(3, peb.getECOG());
					pstmt.setDouble(4, peb.getSplenomegaly());
					pstmt.setDouble(5, peb.getHepatomegaly());
					pstmt.setDouble(6, peb.getLymphadenopathies());
					pstmt.setString(7, peb.getThrombosisHistory());
					pstmt.setString(8, peb.getOtherFindings());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addPhysicalExamData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_PHYSICAL_EXAM_PLASMACELL);
					pstmt.setDouble(1, peb.getHeight());
					pstmt.setDouble(2, peb.getWeight());
					pstmt.setDouble(3, peb.getECOG());
					pstmt.setString(4, peb.getThrombosisHistory());
					pstmt.setString(5, peb.getOtherFindings());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addPhysicalExamData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_PHYSICAL_EXAM_PLATELETCELL);
					pstmt.setDouble(1, peb.getHeight());
					pstmt.setDouble(2, peb.getWeight());
					pstmt.setDouble(3, peb.getSplenomegaly());
					pstmt.setString(4, peb.getOtherFindings());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addPhysicalExamData: " + sqle.getMessage());
					return false;
				}
				break;
			}
		}
		return true;

	}

	public static boolean addClinicalData(ClinicalDataBean cdb, Connection connection, int disease) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_CLINICAL_DATA_AAPHSMDS);
					pstmt.setString(1, cdb.getDateOfVisit());
					pstmt.setString(2, cdb.getDiagnosis());
					pstmt.setString(3, cdb.getChiefComplaint());
					pstmt.setString(4, cdb.getOtherSymptoms());
					pstmt.setString(5, cdb.getComorbidities());
					pstmt.setString(6, cdb.getSmokingHistory());
					pstmt.setString(7, cdb.getAlchoholIntakeHistory());
					pstmt.setString(8, cdb.getChemicalExposure());
					pstmt.setString(9, cdb.getPreviousInfection());
					pstmt.setString(10, cdb.getPreviousHematologicDisorder());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addClinicalData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (2): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_CLINICAL_DATA_COAGULATION);
					pstmt.setString(1, cdb.getDateOfVisit());
					pstmt.setString(2, cdb.getDiagnosis());
					pstmt.setString(3, cdb.getOtherDiagnosis());
					pstmt.setString(4, cdb.getChiefComplaint());
					pstmt.setString(5, cdb.getOtherSymptoms());
					pstmt.setString(6, cdb.getComorbidities());
					pstmt.setString(7, cdb.getSmokingHistory());
					pstmt.setString(8, cdb.getAlchoholIntakeHistory());
					pstmt.setString(9, cdb.getChemicalExposure());
					pstmt.setString(10, cdb.getOtherFindings());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addClinicalData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_CLINICAL_DATA_LEUKEMIA);
					pstmt.setString(1, cdb.getDateOfVisit());
					pstmt.setString(2, cdb.getDiagnosis());
					pstmt.setString(3, cdb.getChiefComplaint());
					pstmt.setString(4, cdb.getConstitutionalSymptoms());
					pstmt.setString(5, cdb.getOtherSymptoms());
					pstmt.setString(6, cdb.getComorbidities());
					pstmt.setString(7, cdb.getSmokingHistory());
					pstmt.setString(8, cdb.getAlchoholIntakeHistory());
					pstmt.setString(9, cdb.getChemicalExposure());
					pstmt.setString(10, cdb.getPreviousInfection());
					pstmt.setString(11, cdb.getPreviousHematologicDisorder());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addClinicalData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_CLINICAL_DATA_LYMPHOMA);
					pstmt.setString(1, cdb.getDateOfVisit());
					pstmt.setString(2, cdb.getDiagnosis());
					pstmt.setString(3, cdb.getStageOfDisease());
					pstmt.setString(4, cdb.getChiefComplaint());
					pstmt.setString(5, cdb.getConstitutionalSymptoms());
					pstmt.setString(6, cdb.getOtherSymptoms());
					pstmt.setString(7, cdb.getComorbidities());
					pstmt.setString(8, cdb.getSmokingHistory());
					pstmt.setString(9, cdb.getAlchoholIntakeHistory());
					pstmt.setString(10, cdb.getChemicalExposure());
					pstmt.setString(11, cdb.getOtherFindings());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addClinicalData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (5): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_CLINICAL_DATA_MYELOPROLIFERATIVE);
					pstmt.setString(1, cdb.getDateOfVisit());
					pstmt.setString(2, cdb.getDiagnosis());
					pstmt.setString(3, cdb.getChiefComplaint());
					pstmt.setString(4, cdb.getConstitutionalSymptoms());
					pstmt.setString(5, cdb.getOtherSymptoms());
					pstmt.setString(6, cdb.getComorbidities());
					pstmt.setString(7, cdb.getSmokingHistory());
					pstmt.setString(8, cdb.getAlchoholIntakeHistory());
					pstmt.setString(9, cdb.getChemicalExposure());
					pstmt.setString(10, cdb.getOtherFindings());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addClinicalData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_CLINICAL_DATA_PLASMACELL);
					pstmt.setString(1, cdb.getDateOfVisit());
					pstmt.setString(2, cdb.getDiagnosis());
					pstmt.setString(3, cdb.getChiefComplaint());
					pstmt.setString(4, cdb.getConstitutionalSymptoms());
					pstmt.setString(5, cdb.getOtherSymptoms());
					pstmt.setString(6, cdb.getComorbidities());
					pstmt.setString(7, cdb.getSmokingHistory());
					pstmt.setString(8, cdb.getAlchoholIntakeHistory());
					pstmt.setString(9, cdb.getChemicalExposure());
					pstmt.setString(10, cdb.getOtherFindings());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addClinicalData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_CLINICAL_DATA_PLATELETCELL);
					pstmt.setString(1, cdb.getDateOfVisit());
					pstmt.setString(2, cdb.getDiagnosis());
					pstmt.setString(3, cdb.getOtherDiagnosis());
					pstmt.setString(4, cdb.getChiefComplaint());
					pstmt.setString(5, cdb.getOtherSymptoms());
					pstmt.setString(6, cdb.getComorbidities());
					pstmt.setString(7, cdb.getSmokingHistory());
					pstmt.setString(8, cdb.getAlchoholIntakeHistory());
					pstmt.setString(9, cdb.getChemicalExposure());
					pstmt.setString(10, cdb.getOtherFindings());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addClinicalData: " + sqle.getMessage());
					return false;
				}
				break;
			}
		}
		return true;
	}

	public static boolean addFamilyCancer(FamilyCancerBean fcb, Connection connection, int disease) {
		switch (disease) {
			case (1):
			case (2):
			case (3):
			case (4):
			case (5):
			case (6):
			case (7):
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_FAMILY_CANCER);
					pstmt.setString(1, fcb.getRelationshipToPatient());
					pstmt.setString(2, fcb.getCancerName());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addFamilyCancer: " + sqle.getMessage());
					return false;
				}
				break;
		}
		return true;
	}

	public static boolean addOtherDiseases(OtherDiseasesBean odb, Connection connection, int disease) {
		switch (disease) {
			case (1):
			case (2):
			case (3):
			case (4):
			case (5):
			case (6):
			case (7):
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_OTHERDISEASES);
					pstmt.setString(1, odb.getOtherDisease());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addOtherDiseases: " + sqle.getMessage());
					return false;
				}
				break;
		}
		return true;
	}

	public static boolean addMedications(MedicationsBean mb, Connection connection, int disease) {
		switch (disease) {
			case (1):
			case (2):
			case (3):
			case (4):
			case (5):
			case (6):
			case (7):
				try {
					PreparedStatement psmt = connection.prepareStatement(INSERT_MEDICATIONS);
					psmt.setString(1, mb.getGenericName());
					psmt.setDouble(2, mb.getDose());
					psmt.setString(3, mb.getFrequency());
					psmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addMedications: " + sqle.getMessage());
					return false;
				}
				break;
		}
		return true;
	}

	public static boolean addHematology(HematologyBean hb, Connection connection, int disease) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_HEMATOLOGY_AAPHSMDS);
					pstmt.setDouble(1, hb.getHemoglobin());
					pstmt.setDouble(2, hb.getHematocrit());
					pstmt.setDouble(3, hb.getWhiteBloodCells());
					pstmt.setDouble(4, hb.getNeutrophils());
					pstmt.setDouble(5, hb.getLymphocytes());
					pstmt.setDouble(6, hb.getMonocytes());
					pstmt.setDouble(7, hb.getEosinophils());
					pstmt.setDouble(8, hb.getBasophils());
					pstmt.setDouble(9, hb.getMyelocytes());
					pstmt.setDouble(10, hb.getMetamyelocytes());
					pstmt.setDouble(11, hb.getBlasts());
					pstmt.setDouble(12, hb.getPlateletCount());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addHematology: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (2): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_HEMATOLOGY_COAGULATION);
					pstmt.setDouble(1, hb.getHemoglobin());
					pstmt.setDouble(2, hb.getHematocrit());
					pstmt.setDouble(3, hb.getWhiteBloodCells());
					pstmt.setDouble(4, hb.getNeutrophils());
					pstmt.setDouble(5, hb.getLymphocytes());
					pstmt.setDouble(6, hb.getMonocytes());
					pstmt.setDouble(7, hb.getEosinophils());
					pstmt.setDouble(8, hb.getBasophils());
					pstmt.setDouble(9, hb.getPlateletCount());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addHematology: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_HEMATOLOGY_LEUKEMIA);
					pstmt.setDouble(1, hb.getHemoglobin());
					pstmt.setDouble(2, hb.getHematocrit());
					pstmt.setDouble(3, hb.getWhiteBloodCells());
					pstmt.setDouble(4, hb.getNeutrophils());
					pstmt.setDouble(5, hb.getLymphocytes());
					pstmt.setDouble(6, hb.getMonocytes());
					pstmt.setDouble(7, hb.getEosinophils());
					pstmt.setDouble(8, hb.getBasophils());
					pstmt.setDouble(9, hb.getMyelocytes());
					pstmt.setDouble(10, hb.getMetamyelocytes());
					pstmt.setDouble(11, hb.getBlasts());
					pstmt.setDouble(12, hb.getPlateletCount());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addHematology: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_HEMATOLOGY_LYMPHOMA);
					pstmt.setDouble(1, hb.getHemoglobin());
					pstmt.setDouble(2, hb.getHematocrit());
					pstmt.setDouble(3, hb.getWhiteBloodCells());
					pstmt.setDouble(4, hb.getNeutrophils());
					pstmt.setDouble(5, hb.getLymphocytes());
					pstmt.setDouble(6, hb.getMonocytes());
					pstmt.setDouble(7, hb.getEosinophils());
					pstmt.setDouble(8, hb.getBasophils());
					pstmt.setDouble(9, hb.getMyelocytes());
					pstmt.setDouble(10, hb.getMetamyelocytes());
					pstmt.setDouble(11, hb.getBlasts());
					pstmt.setDouble(12, hb.getPlateletCount());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addHematology: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (5): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_HEMATOLOGY_MYELOPROLIFERATIVE);
					pstmt.setDouble(1, hb.getHemoglobin());
					pstmt.setDouble(2, hb.getHematocrit());
					pstmt.setDouble(3, hb.getWhiteBloodCells());
					pstmt.setDouble(4, hb.getNeutrophils());
					pstmt.setDouble(5, hb.getLymphocytes());
					pstmt.setDouble(6, hb.getMonocytes());
					pstmt.setDouble(7, hb.getEosinophils());
					pstmt.setDouble(8, hb.getBasophils());
					pstmt.setDouble(9, hb.getMyelocytes());
					pstmt.setDouble(10, hb.getMetamyelocytes());
					pstmt.setDouble(11, hb.getBlasts());
					pstmt.setDouble(12, hb.getPlateletCount());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addHematology: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_HEMATOLOGY_PLASMACELL);
					pstmt.setDouble(1, hb.getHemoglobin());
					pstmt.setDouble(2, hb.getHematocrit());
					pstmt.setDouble(3, hb.getWhiteBloodCells());
					pstmt.setDouble(4, hb.getNeutrophils());
					pstmt.setDouble(5, hb.getLymphocytes());
					pstmt.setDouble(6, hb.getMonocytes());
					pstmt.setDouble(7, hb.getEosinophils());
					pstmt.setDouble(8, hb.getBasophils());
					pstmt.setDouble(9, hb.getMyelocytes());
					pstmt.setDouble(10, hb.getMetamyelocytes());
					pstmt.setDouble(11, hb.getBlasts());
					pstmt.setDouble(12, hb.getPlateletCount());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addHematology: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_HEMATOLOGY_PLATELETCELL);
					pstmt.setDouble(1, hb.getHemoglobin());
					pstmt.setDouble(2, hb.getHematocrit());
					pstmt.setDouble(3, hb.getWhiteBloodCells());
					pstmt.setDouble(4, hb.getNeutrophils());
					pstmt.setDouble(5, hb.getLymphocytes());
					pstmt.setDouble(6, hb.getMonocytes());
					pstmt.setDouble(7, hb.getEosinophils());
					pstmt.setDouble(8, hb.getBasophils());
					pstmt.setDouble(9, hb.getPlateletCount());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addHematology: " + sqle.getMessage());
					return false;
				}
				break;
			}
		}
		return true;
	}

	public static boolean addCoagulationTesting(CoagulationTestingBean ctb, Connection connection, int disease) {
		switch (disease) {
			case (1): {

			}
			case (2): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_COAGULATION_TESTING);
					pstmt.setDouble(1, ctb.getFactorVIIILevel());
					pstmt.setDouble(2, ctb.getFactorIXLevel());
					pstmt.setDouble(3, ctb.getInhibitorAssay());
					pstmt.setDouble(4, ctb.getBethesdaUnits());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addCoagulationTesting: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (3): {
			}
			case (4): {
			}
			case (5): {
			}
			case (6): {
			}
			case (7): {
			}
		}
		return true;
	}

	public static boolean addBloodChemistry(BloodChemistryBean bcb, Connection connection, int disease) {
		switch (disease) {
			case (1): {

			}
			case (2): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_BLOOD_CHEMISTRY_COAGULATION);
					pstmt.setDouble(1, bcb.getCreatine());
					pstmt.setDouble(2, bcb.getUricAcid());
					pstmt.setDouble(3, bcb.getSGOT());
					pstmt.setDouble(4, bcb.getSGPT());
					pstmt.setDouble(5, bcb.getLDH());
					pstmt.setDouble(6, bcb.getNa());
					pstmt.setDouble(7, bcb.getK());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addBloodChemistry: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_BLOOD_CHEMISTRY_LEUKEMIA);
					pstmt.setDouble(1, bcb.getCreatine());
					pstmt.setDouble(2, bcb.getUricAcid());
					pstmt.setDouble(3, bcb.getSGOT());
					pstmt.setDouble(4, bcb.getSGPT());
					pstmt.setDouble(5, bcb.getLDH());
					pstmt.setDouble(6, bcb.getNa());
					pstmt.setDouble(7, bcb.getK());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addBloodChemistry: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_BLOOD_CHEMISTRY_LYMPHOMA);
					pstmt.setDouble(1, bcb.getCreatine());
					pstmt.setDouble(2, bcb.getUricAcid());
					pstmt.setDouble(3, bcb.getSGOT());
					pstmt.setDouble(4, bcb.getSGPT());
					pstmt.setDouble(5, bcb.getLDH());
					pstmt.setDouble(6, bcb.getNa());
					pstmt.setDouble(7, bcb.getK());
					pstmt.setDouble(8, bcb.getBilirubinTotal());
					pstmt.setDouble(9, bcb.getBilirubinDirect());
					pstmt.setDouble(10, bcb.getBilirubinIndirect());
					pstmt.setDouble(11, bcb.getBeta2Microglobulin());
					pstmt.setDouble(12, bcb.getHepatitsBTesting());
					pstmt.setDouble(13, bcb.getESR());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addBloodChemistry: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (5): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_BLOOD_CHEMISTRY_MYELOPROLIFERATIVE);
					pstmt.setDouble(1, bcb.getCreatine());
					pstmt.setDouble(2, bcb.getUricAcid());
					pstmt.setDouble(3, bcb.getSGOT());
					pstmt.setDouble(4, bcb.getSGPT());
					pstmt.setDouble(5, bcb.getLDH());
					pstmt.setDouble(6, bcb.getEPOLevel());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addBloodChemistry: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_BLOOD_CHEMISTRY_PLASMACELL);
					pstmt.setDouble(1, bcb.getBUN());
					pstmt.setDouble(2, bcb.getCreatine());
					pstmt.setDouble(3, bcb.getUricAcid());
					pstmt.setDouble(4, bcb.getLDH());
					pstmt.setDouble(5, bcb.getNa());
					pstmt.setDouble(6, bcb.getK());
					pstmt.setDouble(7, bcb.getBeta2Microglobulin());
					pstmt.setDouble(8, bcb.getiCa());
					pstmt.setDouble(9, bcb.getTotalProtein());
					pstmt.setDouble(10, bcb.getAlbumin());
					pstmt.setDouble(11, bcb.getGlobulin());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addBloodChemistry: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_BLOOD_CHEMISTRY_PLATELET);
					pstmt.setDouble(1, bcb.getCreatine());
					pstmt.setDouble(2, bcb.getUricAcid());
					pstmt.setDouble(3, bcb.getSGOT());
					pstmt.setDouble(4, bcb.getSGPT());
					pstmt.setDouble(5, bcb.getLDH());
					pstmt.setDouble(6, bcb.getEPOLevel());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addBloodChemistry: " + sqle.getMessage());
					return false;
				}
				break;
			}
		}
		return true;
	}

	public static boolean addOtherLaboratories(OtherLaboratoriesBean olb, Connection connection, int disease) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_OTHER_LABORATORIES_AAPHSMDS);
					pstmt.setDouble(1, olb.getCreatinineOther());
					pstmt.setDouble(2, olb.getUricAcid());
					pstmt.setDouble(3, olb.getReticulocyteCount());
					pstmt.setDouble(4, olb.getSerumIron());
					pstmt.setDouble(5, olb.getIronBindingCapacity());
					pstmt.setDouble(6, olb.getSerumFerritin());
					pstmt.setString(7, olb.getDirectAntiglobulin());
					pstmt.setString(8, olb.getIndirectAntiglobulin());
					pstmt.setDouble(9, olb.getSGOT());
					pstmt.setDouble(10, olb.getSGPT());
					pstmt.setDouble(11, olb.getLDH());
					pstmt.setString(12, olb.getScreenTestHepatitis());
					pstmt.setString(13, olb.getScreenTestEBVCytomegalovirusHIV());
					pstmt.setDouble(14, olb.getErythropeitinLevel());
					pstmt.setDouble(15, olb.getSerumFolicAcid());
					pstmt.setDouble(16, olb.getSerumB12());
					pstmt.setDouble(17, olb.getTSH());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addOtherLaboratories: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (2): {
			}
			case (3): {
			}
			case (4): {
			}
			case (5): {
			}
			case (6): {
			}
			case (7): {
			}
		}
		return true;
	}

	public static boolean addBoneMarrowAspirate(BoneMarrowAspirateBean bmab, Connection connection, int disease) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_BONE_MARROW_ASPIRATE);
					pstmt.setString(1, bmab.getDatePerformed());
					pstmt.setString(2, bmab.getResult());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addBoneMarrowAspirate: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (2): {
			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_BONE_MARROW_ASPIRATE);
					pstmt.setString(1, bmab.getDatePerformed());
					pstmt.setString(2, bmab.getResult());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addBoneMarrowAspirate: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_BONE_MARROW_ASPIRATE);
					pstmt.setString(1, bmab.getDatePerformed());
					pstmt.setString(2, bmab.getResult());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addBoneMarrowAspirate: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (5): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_BONE_MARROW_ASPIRATE);
					pstmt.setString(1, bmab.getDatePerformed());
					pstmt.setString(2, bmab.getResult());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addBoneMarrowAspirate: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_BONE_MARROW_ASPIRATE);
					pstmt.setString(1, bmab.getDatePerformed());
					pstmt.setString(2, bmab.getResult());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addBoneMarrowAspirate: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_BONE_MARROW_ASPIRATE);
					pstmt.setString(1, bmab.getDatePerformed());
					pstmt.setString(2, bmab.getResult());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addBoneMarrowAspirate: " + sqle.getMessage());
					return false;
				}
				break;
			}

		}
		return true;
	}

	public static boolean addFlowCytometry(FlowCytometryBean fcb, Connection connection, int disease) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_FLOWCYTOMETRY);
					pstmt.setString(1, fcb.getResult());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addFlowCytometry: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (2): {

			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_FLOWCYTOMETRY);
					pstmt.setString(1, fcb.getResult());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addFlowCytometry: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_FLOWCYTOMETRY);
					pstmt.setString(1, fcb.getResult());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addFlowCytometry: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (5): {
			}
			case (6): {
			}
			case (7): {
			}
		}
		return true;
	}

	public static boolean addCytogeneticMolecular(CytogeneticMolecularBean cmb, Connection connection, int disease) {
		switch (disease) {
			case (1): {
			}
			case (2): {
			}
			case (3): {
			}
			case (4): {
			}
			case (5): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_CYTOGENETIC_MOLECULAR);
					pstmt.setString(1, cmb.getResult());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addCytogeneticMolecular: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_CYTOGENETIC_MOLECULAR);
					pstmt.setString(1, cmb.getResult());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addCytogeneticMolecular: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
			}
		}
		return true;
	}

	public static boolean addCytogeneticMolecularAAPNH(CytogeneticMolecularAAPNHBean cmaapnhb, Connection connection, int disease) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_CYTOGENETIC_AAPNH_AAPHSMDS);
					pstmt.setString(1, cmaapnhb.getResult());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addCytogeneticMolecularAAPNH: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (2): {

			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_CYTOGENETIC_AAPNH_LEUKEMIA);
					pstmt.setString(1, cmaapnhb.getResult());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addCytogeneticMolecularAAPNH: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
			}
			case (5): {
			}
			case (6): {
			}
			case (7): {
			}
		}
		return true;
	}

	public static boolean addCytogeneticMolecularMDS(CytogeneticMolecularMDSBean cmmdsb, Connection connection, int disease) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_CYTOGENETIC_MDS_AAPHSMDS);
					pstmt.setString(1, cmmdsb.getResult());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addCytogeneticMolecularMDS: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (2): {
			}
			case (3): {
			}
			case (4): {
			}
			case (5): {
			}
			case (6): {
			}
			case (7): {
			}
		}
		return true;
	}

	public static boolean addImagingStudies(ImagingStudiesBean isb, Connection connection, int disease) {
		switch (disease) {
			case (1): {

			}
			case (2): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_IMAGING_STUDIES);
					pstmt.setBytes(1, isb.getResult());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addImagingStudies: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_IMAGING_STUDIES);
					pstmt.setBytes(1, isb.getResult());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addImagingStudies: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_IMAGING_STUDIES);
					pstmt.setBytes(1, isb.getResult());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addImagingStudies: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (5): {
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_IMAGING_STUDIES);
					pstmt.setBytes(1, isb.getResult());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addImagingStudies: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_IMAGING_STUDIES);
					pstmt.setBytes(1, isb.getResult());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addImagingStudies: " + sqle.getMessage());
					return false;
				}
				break;
			}
		}
		return true;
	}

	public static boolean addUpperGIEndoscopy(UpperGIEndoscopyBean ugeb, Connection connection, int disease) {
		switch (disease) {
			case (1): {
			}
			case (2): {
			}
			case (3): {
			}
			case (4): {
			}
			case (5): {
			}
			case (6): {
			}
			case (7): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_UPPERGIENDOSCOPY_PLATELET);
					pstmt.setString(1, ugeb.getDatePerformed());
					pstmt.setString(2, ugeb.getDescription());
					pstmt.setBoolean(3, ugeb.isHPylori());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addUpperGIEndoscopy: " + sqle.getMessage());
					return false;
				}
				break;
			}
		}
		return true;
	}

	public static boolean addHematopathology(HematopathologyBean hpb, Connection connection, int disease) {
		switch (disease) {
			case (1): {
			}
			case (2): {
			}
			case (3): {
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_HEMATOPATHOLOGY);
					pstmt.setString(1, hpb.getDatePerformed());
					pstmt.setString(2, hpb.getResult());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addHematopathology: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (5): {
			}
			case (6): {
			}
			case (7): {
			}
		}
		return true;
	}

	public static boolean addImmunohistochemistry(ImmunohistochemistryBean ihcb, Connection connection, int disease) {
		switch (disease) {
			case (1): {
			}
			case (2): {
			}
			case (3): {
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_IMMUNOHISTOCHEMISTRY);
					pstmt.setString(1, ihcb.getDatePerformed());
					pstmt.setString(2, ihcb.getResult());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addImmunohistochemistry: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (5): {
			}
			case (6): {
			}
			case (7): {
			}
		}
		return true;
	}

	public static boolean addSerumFree(SerumFreeBean sfb, Connection connection, int disease) {
		switch (disease) {
			case (1): {
			}
			case (2): {
			}
			case (3): {
			}
			case (4): {
			}
			case (5): {
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_SERUMFREE);
					pstmt.setString(1, sfb.getResult());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addSerumFree: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
			}
		}
		return true;
	}

	public static boolean addSerumImmunofixation(SerumImmunofixationBean sifb, Connection connection, int disease) {
		switch (disease) {
			case (1): {
			}
			case (2): {
			}
			case (3): {
			}
			case (4): {
			}
			case (5): {
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_SERUMIMMUNOFIXATION);
					pstmt.setString(1, sifb.getResult());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addSerumImmunofixation: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
			}
		}
		return true;
	}

	public static boolean addSerumProtein(SerumProteinBean spb, Connection connection, int disease) {
		switch (disease) {
			case (1): {
			}
			case (2): {
			}
			case (3): {
			}
			case (4): {
			}
			case (5): {
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_SERUMPROTEIN);
					pstmt.setString(1, spb.getResult());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addSerumProtein: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
			}
		}
		return true;
	}

	public static boolean addUrineProtein(UrineProteinBean upb, Connection connection, int disease) {
		switch (disease) {
			case (1): {
			}
			case (2): {
			}
			case (3): {
			}
			case (4): {
			}
			case (5): {
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_URINEPROTEIN);
					pstmt.setString(1, upb.getResult());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addUrineProtein: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
			}
		}
		return true;
	}

	public static boolean addLaboratoryProfile(LaboratoryProfileBean lpb, Connection connection, int disease) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_LABORATORY_PROFILE_AAPHSMDS);
					pstmt.setString(1, lpb.getDateOfBloodCollection());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addLaboratoryProfile: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (2): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_LABORATORY_PROFILE_COAGULATION);
					pstmt.setString(1, lpb.getDateOfBloodCollection());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addLaboratoryProfile: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_LABORATORY_PROFILE_LEUKEMIA);
					pstmt.setString(1, lpb.getDateOfBloodCollection());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addLaboratoryProfile: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_LABORATORY_PROFILE_LYMPHOMA);
					pstmt.setString(1, lpb.getDateOfBloodCollection());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addLaboratoryProfile: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (5): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_LABORATORY_PROFILE_MYELOPROLIFERATIVE);
					pstmt.setString(1, lpb.getDateOfBloodCollection());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addLaboratoryProfile: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_LABORATORY_PROFILE_PLASMACELL);
					pstmt.setString(1, lpb.getDateOfBloodCollection());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addLaboratoryProfile: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_LABORATORY_PROFILE_PLATELETCELL);
					pstmt.setString(1, lpb.getDateOfBloodCollection());
					pstmt.setString(2, lpb.getITP());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addLaboratoryProfile: " + sqle.getMessage());
					return false;
				}
				break;
			}
		}
		return true;
	}

	public static boolean addModeOfTreatment(ModeOfTreatmentBean motb, Connection connection, int disease) {
		switch (disease) {
			case (1):
			case (2):
			case (3):
			case (4):
			case (5):
			case (6):
			case (7):
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_MODE_OF_TREATMENT);
					pstmt.setString(1, motb.getModeOfTreatment());
					pstmt.setString(2, motb.getNameOfTreatment());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addModeOfTreatment: " + sqle.getMessage());
					return false;
				}
				break;
		}
		return true;
	}

	public static boolean addChemotherapyMedications(ChemotherapyMedicationsBean cmb, Connection connection, int disease) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_CHEMOTHERAPY_MEDICATIONS);
					pstmt.setString(1, cmb.getMedications());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addChemotherapyMedications: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (2): {

			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_CHEMOTHERAPY_MEDICATIONS);
					pstmt.setString(1, cmb.getMedications());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addChemotherapyMedications: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_CHEMOTHERAPY_MEDICATIONS);
					pstmt.setString(1, cmb.getMedications());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addChemotherapyMedications: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (5): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_CHEMOTHERAPY_MEDICATIONS);
					pstmt.setString(1, cmb.getMedications());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addChemotherapyMedications: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (6): {
			}
			case (7): {
			}
		}
		return true;
	}

	public static boolean addRegimen(RegimenBean rb, Connection connection, int disease) {
		switch (disease) {
			case (1): {
			}
			case (2): {
			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_REGIMEN);
					pstmt.setString(1, rb.getRegimenName());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addRegimen: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_REGIMEN);
					pstmt.setString(1, rb.getRegimenName());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addRegimen: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (5): {
			}
			case (6): {
			}
			case (7): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_REGIMEN);
					pstmt.setString(1, rb.getRegimenName());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addRegimen: " + sqle.getMessage());
					return false;
				}
				break;
			}
		}
		return true;
	}

	public static boolean addRegimenTransplant(RegimenTransplantBean rtb, Connection connection, int disease) {
		switch (disease) {
			case (1): {
			}
			case (2): {
			}
			case (3): {
			}
			case (4): {
			}
			case (5): {
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_REGIMEN_TRANSPLANT);
					pstmt.setString(1, rtb.getRegimenName());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addRegimenTransplant: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
			}
		}
		return true;
	}

	public static boolean addRegimenNonTransplant(RegimenNonTransplantBean rntb, Connection connection, int disease) {
		switch (disease) {
			case (1): {
			}
			case (2): {
			}
			case (3): {
			}
			case (4): {
			}
			case (5): {
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_REGIMEN_NONTRANSPLANT);
					pstmt.setString(1, rntb.getRegimenName());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addRegimenNonTransplant: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
			}
		}
		return true;
	}

	public static boolean addMaintenanceTherapy(MaintenanceTherapyBean mtb, Connection connection, int disease) {
		switch (disease) {
			case (1): {
			}
			case (2): {
			}
			case (3): {
			}
			case (4): {
			}
			case (5): {
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_MAINTENANCE_THERAPY);
					pstmt.setString(1, mtb.getMaintenanceTherapyName());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addMaintenanceTherapy: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
			}
		}
		return true;
	}

	public static boolean addTreatment(TreatmentBean tb, Connection connection, int disease) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_TREATMENT_AAPHSMDS);
					pstmt.setBoolean(1, tb.isTransplant());
					pstmt.setString(2, tb.getDateStarted());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addTreatment: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (2): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_TREATMENT_COAGULATION);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addTreatment: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_TREATMENT_LEUKEMIA);
					pstmt.setString(1, tb.getDateStarted());
					pstmt.setInt(2, tb.getCycleNumber());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addTreatment: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_TREATMENT_LYMPHOMA);
					pstmt.setString(1, tb.getDateStarted());
					pstmt.setInt(2, tb.getCycleNumber());
					pstmt.setString(3, tb.getComplications());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addTreatment: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (5): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_TREATMENT_MYELOPROLIFERATIVE);
					pstmt.setString(1, tb.getDateStarted());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addTreatment: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_TREATMENT_PLASMACELL);
					pstmt.setString(1, tb.getDateStarted());
					pstmt.setString(2, tb.getOtherRegimen());
					pstmt.setString(3, tb.getOtherRegimenTransplant());
					pstmt.setString(4, tb.getOtherRegimenNonTransplant());
					pstmt.setString(5, tb.getOtherRegimenMaintenanceTherapy());
					pstmt.setInt(6, tb.getCycleNumber());
					pstmt.setString(7, tb.getComplications());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addTreatment: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_TREATMENT_PLATELETCELL);
					pstmt.setString(1, tb.getDateStarted());
					pstmt.setString(2, tb.getComplications());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addTreatment: " + sqle.getMessage());
					return false;
				}
				break;
			}
		}
		return true;
	}

	public static boolean addOtherTreatment(OtherTreatmentBean otb, Connection connection, int disease) {
		switch (disease) {
			case (1): {
			}
			case (2): {
			}
			case (3): {
			}
			case (4): {
			}
			case (5): {
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_OTHERTREATMENT);
					pstmt.setString(1, otb.getBisphosphonates());
					pstmt.setString(2, otb.getRadiotherapy());
					pstmt.setString(3, otb.getOtherMedications());
					pstmt.setString(4, otb.getComplications());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addRegimenNonTransplant: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
			}
		}
		return true;
	}

	public static boolean addDiseaseStatus(DiseaseStatusBean dsb, Connection connection, int disease) {
		switch (disease) {
			case (1):
			case (2):
			case (3):
			case (4):
			case (5):
			case (6):
			case (7):
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_DISEASE_STATUS);
					pstmt.setString(1, dsb.getDiseaseStatus());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addDiseaseStatus: " + sqle.getMessage());
					return false;
				}
				break;
		}
		return true;
	}

	public static boolean addPatient(Connection connection, int disease) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_PATIENT_AAPHSMDS);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addPatient: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (2): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_PATIENT_COAGULATION);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addPatient: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_PATIENT_LEUKEMIA);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addPatient: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_PATIENT_LYMPHOMA);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addPatient: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (5): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_PATIENT_MYELOPROLIFERATIVE);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addPatient: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_PATIENT_PLASMACELL);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addPatient: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_PATIENT_PLATELETCELL);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addPatient: " + sqle.getMessage());
					return false;
				}
				break;
			}
		}
		return true;
	}

}
