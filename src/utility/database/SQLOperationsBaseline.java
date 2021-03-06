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
	
	// BASELINE ADD
	
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
					pstmt.setString(2, gdb.getFirstName());
					pstmt.setString(3, gdb.getMiddleName());
					pstmt.setInt(4, gdb.getGender());
					pstmt.setString(5, gdb.getDateOfBirth());
					pstmt.setString(6, gdb.getDateOfEntry());
					pstmt.setString(7, gdb.getCivilStatus());
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
					pstmt.setString(2, gdb.getFirstName());
					pstmt.setString(3, gdb.getMiddleName());
					pstmt.setInt(4, gdb.getGender());
					pstmt.setString(5, gdb.getDateOfBirth());
					pstmt.setString(6, gdb.getDateOfEntry());
					pstmt.setString(7, gdb.getCivilStatus());
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
					pstmt.setString(2, gdb.getFirstName());
					pstmt.setString(3, gdb.getMiddleName());
					pstmt.setInt(4, gdb.getGender());
					pstmt.setString(5, gdb.getDateOfBirth());
					pstmt.setString(6, gdb.getDateOfEntry());
					pstmt.setString(7, gdb.getCivilStatus());
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
					pstmt.setString(2, gdb.getFirstName());
					pstmt.setString(3, gdb.getMiddleName());
					pstmt.setInt(4, gdb.getGender());
					pstmt.setString(5, gdb.getDateOfBirth());
					pstmt.setString(6, gdb.getDateOfEntry());
					pstmt.setString(7, gdb.getCivilStatus());
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
					pstmt.setString(2, gdb.getFirstName());
					pstmt.setString(3, gdb.getMiddleName());
					pstmt.setInt(4, gdb.getGender());
					pstmt.setString(5, gdb.getDateOfBirth());
					pstmt.setString(6, gdb.getDateOfEntry());
					pstmt.setString(7, gdb.getCivilStatus());
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
					pstmt.setString(2, gdb.getFirstName());
					pstmt.setString(3, gdb.getMiddleName());
					pstmt.setInt(4, gdb.getGender());
					pstmt.setString(5, gdb.getDateOfBirth());
					pstmt.setString(6, gdb.getDateOfEntry());
					pstmt.setString(7, gdb.getCivilStatus());
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
					pstmt.setString(2, gdb.getFirstName());
					pstmt.setString(3, gdb.getMiddleName());
					pstmt.setInt(4, gdb.getGender());
					pstmt.setString(5, gdb.getDateOfBirth());
					pstmt.setString(6, gdb.getDateOfEntry());
					pstmt.setString(7, gdb.getCivilStatus());
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
					pstmt.setString(2, prsb.getPrognosticRiskScoringOthers());
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
				try {
					PreparedStatement psmt = connection.prepareStatement(INSERT_RISK_SCORE);
					psmt.setString(1, rsb.getRiskScoreName());
					psmt.setString(2, rsb.getRiskScoreOthers());
					psmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addRiskScore: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
			}
			case (5): {
				try {
					PreparedStatement psmt = connection.prepareStatement(INSERT_RISK_SCORE);
					psmt.setString(1, rsb.getRiskScoreName());
					psmt.setString(2, rsb.getRiskScoreOthers());
					psmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addRiskScore: " + sqle.getMessage());
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
					System.out.println("SQLException -- addISSStaging: " + sqle.getMessage());
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
					System.out.println("SQLException -- addSeverity: " + sqle.getMessage());
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
					pstmt.setBoolean(3, peb.isHemarthroses());
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
					pstmt.setString(4, peb.getOtherFindings());
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
					pstmt.setString(4, peb.getSkin());
					pstmt.setString(5, peb.getOtherFindings());
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
					pstmt.setString(3, cdb.getOtherDiagnosis());
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
					pstmt.setDouble(6, bcb.getNa());
					pstmt.setDouble(7, bcb.getK());
					pstmt.setDouble(8, bcb.getANATiter());
					pstmt.setDouble(9, bcb.getHepatitsCRna());
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
					PreparedStatement pstmt = connection.prepareStatement(INSERT_CYTOGENETIC_MOLECULAR_AAPNH_AAPHSMDS);
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
					PreparedStatement pstmt = connection.prepareStatement(INSERT_CYTOGENETIC_MOLECULAR_AAPNH_LEUKEMIA);
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
					PreparedStatement pstmt = connection.prepareStatement(INSERT_CYTOGENETIC_MOLECULAR_MDS_AAPHSMDS);
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
					PreparedStatement pstmt = connection.prepareStatement(INSERT_UPPERGIENDOSCOPY);
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
					pstmt.setString(2, rb.getOtherRegimen());
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
					pstmt.setString(2, rb.getOtherRegimen());
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
					pstmt.setString(2, rb.getOtherRegimen());
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
					pstmt.setString(2, rtb.getOtherRegimen());
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
					pstmt.setString(2, rntb.getOtherRegimen());
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
					pstmt.setString(2, mtb.getOtherMaintenanceTherapy());
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
					pstmt.setBoolean(1, tb.isTransplant());
					pstmt.setString(2, tb.getDateStarted());
					pstmt.setInt(3, tb.getCycleNumber());
					pstmt.setString(4, tb.getComplications());
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
					pstmt.setString(2, dsb.getRelapseDisease());
					pstmt.setString(3, dsb.getOtherDisease());
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
	
	//RETRIEVES
	public static ResultSet getAAPHSMDSBaselinePatients(Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_LIST_PATIENTS_BASELINE_AAPHSMDS);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getAAPHSMDSBaselinePatients: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getCoagulationBaselinePatients(Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_LIST_PATIENTS_BASELINE_COAGULATION);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getCoagulationBaselinePatients: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getLeukemiaBaselinePatients(Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_LIST_PATIENTS_BASELINE_LEUKEMIA);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getLeukemiaBaselinePatients: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getPatient(int patientID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_PATIENT_BASELINE);
			pstmt.setInt(1, patientID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getPatient: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getGeneralData(int generalDataID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_GENERAL_DATA);
			pstmt.setInt(1, generalDataID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getGeneralData: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getAddress(int addressID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_ADDRESS);
			pstmt.setInt(1, addressID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getAddress: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getTissueSpecimen(int tissueSpecimenID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_TISSUESPECIMEN);
			pstmt.setInt(1, tissueSpecimenID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getTissueSpecimen: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getClinicalData(int clinicalDataID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_CLINICAL_DATA_BASELINE);
			pstmt.setInt(1, clinicalDataID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getClinicalData: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getPrognosticRiskScoring(int prognosticRiskScoringID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_PROGNOSTIC_RISK_SCORING);
			pstmt.setInt(1, prognosticRiskScoringID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getPrognosticRiskScoring: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getRiskScore(int riskScoreID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_RISK_SCORE);
			pstmt.setInt(1, riskScoreID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getRiskScore: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getClassification(int classificationID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_CLASSIFICATION);
			pstmt.setInt(1, classificationID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getClassification: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getISSStaging(int issStagingID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_ISSSTAGING);
			pstmt.setInt(1, issStagingID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getISSStaging: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getSeverity(int severityID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_SEVERITY);
			pstmt.setInt(1, severityID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getClassification: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getPhysicalExam(int physicalExamID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_PHYSICAL_EXAM);
			pstmt.setInt(1, physicalExamID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getPhysicalExamAAPNHMDS: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getFamilyCancer(int clinicalDataID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_FAMILY_CANCER);
			pstmt.setInt(1, clinicalDataID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getFamilyCancer: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getOtherDiseases(int clinicalDataID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_OTHER_DISEASES);
			pstmt.setInt(1, clinicalDataID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getOtherDiseases: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getMedications(int clinicalDataID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_MEDICATIONS);
			pstmt.setInt(1, clinicalDataID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getOtherDiseases: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getLaboratoryProfile(int laboratoryID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_LABORATORY_PROFILE);
			pstmt.setInt(1, laboratoryID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getLaboratoryProfile: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getHematology(int hematologyID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_HEMATOLOGY);
			pstmt.setInt(1, hematologyID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getHematology: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getOtherLaboratoriesAAPNHMDS(int otherLaboratoriesID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_OTHER_LABORATORIES_AAPNHMDS);
			pstmt.setInt(1, otherLaboratoriesID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getOtherLaboratoriesAAPNHMDS: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getBoneMarrowAspirate(int boneMarrowAspirateID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_BONE_MARROW_ASPIRATE);
			pstmt.setInt(1, boneMarrowAspirateID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getBoneMarrowAspirate: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getFlowCytometry(int flowCytometryID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_FLOWCYTOMETRY);
			pstmt.setInt(1, flowCytometryID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getFlowCytometry: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getSerumFree(int serumFreeID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_SERUMFREE);
			pstmt.setInt(1, serumFreeID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getSerumFree: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getSerumProtein(int serumProteinID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_SERUMPROTEIN);
			pstmt.setInt(1, serumProteinID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getSerumProtein: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getSerumImmunofixation(int serumImmunofixationID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_SERUMIMMUNOFIXATION);
			pstmt.setInt(1, serumImmunofixationID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getSerumImmunofixation: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getUrineProtein(int urineProteinID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_URINEPROTEIN);
			pstmt.setInt(1, urineProteinID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getUrineProtein: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getCytogeneticMolecular(int cytogeneticMolecularID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_CYTOGENETIC_MOLECULAR);
			pstmt.setInt(1, cytogeneticMolecularID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getCytogeneticMolecular: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getCytogeneticMolecularAAPNH(int cytogeneticMolecularAAPNHID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_CYTOGENETIC_MOLECULAR_AAPNH_AAPNHMDS);
			pstmt.setInt(1, cytogeneticMolecularAAPNHID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getCytogeneticMolecularAAPNH: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getCytogeneticMolecularMDSAAPNH(int cytogeneticMolecularMDSID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_CYTOGENETIC_MOLECULAR_MDS_AAPNHMDS);
			pstmt.setInt(1, cytogeneticMolecularMDSID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getCytogeneticMolecularMDSAAPNH: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getCoagulationTesting(int coagulationTestingID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_COAGULATION_TESTING);
			pstmt.setInt(1, coagulationTestingID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getCoagulationTesting: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getBloodChemistry(int bloodChemistryID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_BLOOD_CHEMISTRY);
			pstmt.setInt(1, bloodChemistryID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getBloodChemistry: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getImagingStudies(int imagingStudiesID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_IMAGING_STUDIES);
			pstmt.setInt(1, imagingStudiesID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getImagingStudies: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getHematopathology(int hematopathologyID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_HEMATOPATHOLOGY);
			pstmt.setInt(1, hematopathologyID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getHematopathology: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getImmunohistochemistry(int immunohistochemistryID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_IMMUNOHISTOCHEMISTRY);
			pstmt.setInt(1, immunohistochemistryID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getImmunohistochemistry: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getUpperGIEndoscopy(int upperGIEndoscopyID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_UPPERGIENDOSCOPY);
			pstmt.setInt(1, upperGIEndoscopyID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getUpperGIEndoscopy: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getTreatment(int treatmentID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_TREATMENT);
			pstmt.setInt(1, treatmentID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getTreatment: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getChemoMedication(int chemoMedicationID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_CHEMOTHERAPY_MEDICATIONS);
			pstmt.setInt(1, chemoMedicationID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getTreatment: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getModeOfTreatment(int modeOfTreatmentID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_MODE_OF_TREAMENT);
			pstmt.setInt(1, modeOfTreatmentID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getTreatment: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getRegimen(int regimenID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_REGIMEN);
			pstmt.setInt(1, regimenID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getRegimen: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getRegimenTransplant(int regimenTransplantID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_REGIMEN_TRANSPLANT);
			pstmt.setInt(1, regimenTransplantID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getRegimenTransplant: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getRegimenNonTransplant(int regimenNonTransplantID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_REGIMEN_NONTRANSPLANT);
			pstmt.setInt(1, regimenNonTransplantID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getRegimenNonTransplant: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getMaintenanceTherapy(int maintenanceTherapyID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_MAINTENANCE_THERAPY);
			pstmt.setInt(1, maintenanceTherapyID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getMaintenanceTherapy: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getOtherTreatment(int otherTreatmentID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_OTHERTREATMENT);
			pstmt.setInt(1, otherTreatmentID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getOtherTreatment: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getDiseaseStatus(int diseaseStatusID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_DISEASE_STATUS);
			pstmt.setInt(1, diseaseStatusID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getDiseaseStatus: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	//BASELINE EDIT
	public static boolean editAddress(AddressBean ab, Connection connection, int disease, int id) {
		switch (disease) {
			case (1):
			case (2):
			case (3):
			case (4):
			case (5):
			case (6):
			case (7):
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_ADDRESS);
					pstmt.setString(1, ab.getStreetAddress());
					pstmt.setString(2, ab.getCity());
					pstmt.setString(3, ab.getZipCode());
					pstmt.setInt(4, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editAddress: " + sqle.getMessage());
					return false;
				}
				break;
		}
		return true;
	}
	
	public static boolean editTissueSpecimenData(TissueSpecimenBean tsb, Connection connection, int disease, int id) {
		switch (disease) {
			case (1):
			case (2):
			case (3):
			case (4):
			case (5):
			case (6):
			case (7):
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_TISSUE_SPECIMEN);
					pstmt.setString(1, tsb.getTissueSpecimenName());
					pstmt.setInt(2, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editTissueSpecimenData: " + sqle.getMessage());
					return false;
				}
				break;
		}
		return true;
	}
	
	public static boolean editGeneralData(GeneralDataBean gdb, Connection connection, int disease, int id) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_GENERAL_DATA);
					pstmt.setString(1, gdb.getLastName());
					pstmt.setString(2, gdb.getFirstName());
					pstmt.setString(3, gdb.getMiddleName());
					pstmt.setInt(4, gdb.getGender());
					pstmt.setString(5, gdb.getDateOfBirth());
					pstmt.setString(6, gdb.getDateOfEntry());
					pstmt.setString(7, gdb.getCivilStatus());
					pstmt.setInt(8, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editGeneralData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (2): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_GENERAL_DATA);
					pstmt.setString(1, gdb.getLastName());
					pstmt.setString(2, gdb.getFirstName());
					pstmt.setString(3, gdb.getMiddleName());
					pstmt.setInt(4, gdb.getGender());
					pstmt.setString(5, gdb.getDateOfBirth());
					pstmt.setString(6, gdb.getDateOfEntry());
					pstmt.setString(7, gdb.getCivilStatus());
					pstmt.setInt(8, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editGeneralData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_GENERAL_DATA);
					pstmt.setString(1, gdb.getLastName());
					pstmt.setString(2, gdb.getFirstName());
					pstmt.setString(3, gdb.getMiddleName());
					pstmt.setInt(4, gdb.getGender());
					pstmt.setString(5, gdb.getDateOfBirth());
					pstmt.setString(6, gdb.getDateOfEntry());
					pstmt.setString(7, gdb.getCivilStatus());
					pstmt.setInt(8, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editGeneralData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_GENERAL_DATA);
					pstmt.setString(1, gdb.getLastName());
					pstmt.setString(2, gdb.getFirstName());
					pstmt.setString(3, gdb.getMiddleName());
					pstmt.setInt(4, gdb.getGender());
					pstmt.setString(5, gdb.getDateOfBirth());
					pstmt.setString(6, gdb.getDateOfEntry());
					pstmt.setString(7, gdb.getCivilStatus());
					pstmt.setInt(8, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editGeneralData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (5): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_GENERAL_DATA);
					pstmt.setString(1, gdb.getLastName());
					pstmt.setString(2, gdb.getFirstName());
					pstmt.setString(3, gdb.getMiddleName());
					pstmt.setInt(4, gdb.getGender());
					pstmt.setString(5, gdb.getDateOfBirth());
					pstmt.setString(6, gdb.getDateOfEntry());
					pstmt.setString(7, gdb.getCivilStatus());
					pstmt.setInt(8, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editGeneralData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_GENERAL_DATA);
					pstmt.setString(1, gdb.getLastName());
					pstmt.setString(2, gdb.getFirstName());
					pstmt.setString(3, gdb.getMiddleName());
					pstmt.setInt(4, gdb.getGender());
					pstmt.setString(5, gdb.getDateOfBirth());
					pstmt.setString(6, gdb.getDateOfEntry());
					pstmt.setString(7, gdb.getCivilStatus());
					pstmt.setInt(8, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editGeneralData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_GENERAL_DATA);
					pstmt.setString(1, gdb.getLastName());
					pstmt.setString(2, gdb.getFirstName());
					pstmt.setString(3, gdb.getMiddleName());
					pstmt.setInt(4, gdb.getGender());
					pstmt.setString(5, gdb.getDateOfBirth());
					pstmt.setString(6, gdb.getDateOfEntry());
					pstmt.setString(7, gdb.getCivilStatus());
					pstmt.setInt(8, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editGeneralData: " + sqle.getMessage());
					return false;
				}
				break;
			}
		}
		return true;
	}
	
	public static boolean editPrognosticRiskScoring(PrognosticRiskScoringBean prsb, Connection connection, int disease, int id) {
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
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_PROGNOSTIC_RISK_SCORING);
					pstmt.setString(1, prsb.getPrognosticRiskScoringName());
					pstmt.setString(2, prsb.getPrognosticRiskScoringOthers());
					pstmt.setInt(3, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editPrognosticRiskScoring: " + sqle.getMessage());
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
	
	public static boolean editRiskScore(RiskScoreBean rsb, Connection connection, int disease, int id) {
		switch (disease) {
			case (1): {
			}
			case (2): {
			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_RISK_SCORE);
					pstmt.setString(1, rsb.getRiskScoreName());
					pstmt.setInt(2, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editRiskScore: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
			}
			case (5): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_RISK_SCORE);
					pstmt.setString(1, rsb.getRiskScoreName());
					pstmt.setString(2, rsb.getRiskScoreOthers());
					pstmt.setInt(3, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editRiskScore: " + sqle.getMessage());
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
	
	public static boolean editClassification(ClassificationBean classbean, Connection connection, int disease, int id) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_CLASSIFCATION);
					pstmt.setString(1, classbean.getClassificationName());
					pstmt.setInt(2, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editClassification: " + sqle.getMessage());
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
	
	public static boolean editISSStaging(ISSStagingBean issb, Connection connection, int disease, int id) {
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
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_ISSSTAGING);
					pstmt.setString(1, issb.getIssStagingName());
					pstmt.setInt(2, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editISSStaging: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
			}
			
		}
		return true;
	}
	
	public static boolean editSeverity(SeverityBean sb, Connection connection, int disease, int id) {
		switch (disease) {
			case (1): {
			}
			case (2): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_SEVERITY);
					pstmt.setString(1, sb.getSeverityName());
					pstmt.setInt(2, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editSeverity: " + sqle.getMessage());
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
	
	public static boolean editPhysicalExam(PhysicalExamBean peb, Connection connection, int disease, int id) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_PHYSICAL_EXAM_AAPHSMDS);
					pstmt.setDouble(1, peb.getHeight());
					pstmt.setDouble(2, peb.getWeight());
					pstmt.setDouble(3, peb.getECOG());
					pstmt.setString(4, peb.getOtherFindings());
					pstmt.setInt(5, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editPhysicalExamData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (2): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_PHYSICAL_EXAM_COAGULATION);
					pstmt.setDouble(1, peb.getHeight());
					pstmt.setDouble(2, peb.getWeight());
					pstmt.setBoolean(3, peb.isHemarthroses());
					pstmt.setBoolean(4, peb.isContracturesAndMuscleAtrophy());
					pstmt.setString(5, peb.getOtherFindings());
					pstmt.setInt(6, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editPhysicalExamData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_PHYSICAL_EXAM_LEUKEMIA);
					pstmt.setDouble(1, peb.getHeight());
					pstmt.setDouble(2, peb.getWeight());
					pstmt.setDouble(3, peb.getECOG());
					pstmt.setDouble(4, peb.getSplenomegaly());
					pstmt.setDouble(5, peb.getHepatomegaly());
					pstmt.setDouble(6, peb.getLymphadenopathies());
					pstmt.setString(7, peb.getOtherFindings());
					pstmt.setInt(8, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editPhysicalExamData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_PHYSICAL_EXAM_LYMPHOMA);
					pstmt.setDouble(1, peb.getHeight());
					pstmt.setDouble(2, peb.getWeight());
					pstmt.setDouble(3, peb.getECOG());
					pstmt.setDouble(4, peb.getSplenomegaly());
					pstmt.setDouble(5, peb.getHepatomegaly());
					pstmt.setDouble(6, peb.getLymphadenopathies());
					pstmt.setString(7, peb.getOtherFindings());
					pstmt.setInt(8, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editPhysicalExamData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (5): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_PHYSICAL_EXAM_MYELOPROLIFERATIVE);
					pstmt.setDouble(1, peb.getHeight());
					pstmt.setDouble(2, peb.getWeight());
					pstmt.setDouble(3, peb.getECOG());
					pstmt.setDouble(4, peb.getSplenomegaly());
					pstmt.setDouble(5, peb.getHepatomegaly());
					pstmt.setDouble(6, peb.getLymphadenopathies());
					pstmt.setString(7, peb.getThrombosisHistory());
					pstmt.setString(8, peb.getOtherFindings());
					pstmt.setInt(9, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editPhysicalExamData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_PHYSICAL_EXAM_PLASMACELL);
					pstmt.setDouble(1, peb.getHeight());
					pstmt.setDouble(2, peb.getWeight());
					pstmt.setDouble(3, peb.getECOG());
					pstmt.setString(4, peb.getThrombosisHistory());
					pstmt.setString(5, peb.getOtherFindings());
					pstmt.setInt(6, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editPhysicalExamData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_PHYSICAL_EXAM_PLATELETCELL);
					pstmt.setDouble(1, peb.getHeight());
					pstmt.setDouble(2, peb.getWeight());
					pstmt.setDouble(3, peb.getSplenomegaly());
					pstmt.setString(4, peb.getSkin());
					pstmt.setString(5, peb.getOtherFindings());
					pstmt.setInt(6, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editPhysicalExamData: " + sqle.getMessage());
					return false;
				}
				break;
			}
		}
		return true;
		
	}
	
	public static boolean editClinicalData(ClinicalDataBean cdb, Connection connection, int disease, int id) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_CLINICAL_DATA_AAPHSMDS);
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
					pstmt.setInt(11, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editClinicalData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (2): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_CLINICAL_DATA_COAGULATION);
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
					pstmt.setInt(11, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editClinicalData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_CLINICAL_DATA_LEUKEMIA);
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
					pstmt.setInt(12, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editClinicalData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_CLINICAL_DATA_LYMPHOMA);
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
					pstmt.setInt(12, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editClinicalData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (5): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_CLINICAL_DATA_MYELOPROLIFERATIVE);
					pstmt.setString(1, cdb.getDateOfVisit());
					pstmt.setString(2, cdb.getDiagnosis());
					pstmt.setString(3, cdb.getOtherDiagnosis());
					pstmt.setString(4, cdb.getChiefComplaint());
					pstmt.setString(5, cdb.getConstitutionalSymptoms());
					pstmt.setString(6, cdb.getOtherSymptoms());
					pstmt.setString(7, cdb.getComorbidities());
					pstmt.setString(8, cdb.getSmokingHistory());
					pstmt.setString(9, cdb.getAlchoholIntakeHistory());
					pstmt.setString(10, cdb.getChemicalExposure());
					pstmt.setString(11, cdb.getOtherFindings());
					pstmt.setInt(12, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editClinicalData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_CLINICAL_DATA_PLASMACELL);
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
					pstmt.setInt(11, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editClinicalData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_CLINICAL_DATA_PLATELETCELL);
					pstmt.setString(1, cdb.getDateOfVisit());
					pstmt.setString(2, cdb.getDiagnosis());
					pstmt.setString(3, cdb.getOtherDiagnosis());
					pstmt.setString(4, cdb.getChiefComplaint());
					pstmt.setString(5, cdb.getConstitutionalSymptoms());
					pstmt.setString(6, cdb.getOtherSymptoms());
					pstmt.setString(7, cdb.getComorbidities());
					pstmt.setString(8, cdb.getSmokingHistory());
					pstmt.setString(9, cdb.getAlchoholIntakeHistory());
					pstmt.setString(10, cdb.getChemicalExposure());
					pstmt.setString(11, cdb.getOtherFindings());
					pstmt.setInt(12, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editClinicalData: " + sqle.getMessage());
					return false;
				}
				break;
			}
		}
		return true;
	}
	
	public static boolean editFamilyCancer(FamilyCancerBean fcb, Connection connection, int disease, int id) {
		switch (disease) {
			case (1):
			case (2):
			case (3):
			case (4):
			case (5):
			case (6):
			case (7):
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_FAMILY_CANCER);
					pstmt.setString(1, fcb.getRelationshipToPatient());
					pstmt.setString(2, fcb.getCancerName());
					pstmt.setInt(3, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editFamilyCancer: " + sqle.getMessage());
					return false;
				}
				break;
		}
		return true;
	}
	
	public static boolean editOtherDiseases(OtherDiseasesBean odb, Connection connection, int disease, int id) {
		switch (disease) {
			case (1):
			case (2):
			case (3):
			case (4):
			case (5):
			case (6):
			case (7):
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_OTHERDISEASES);
					pstmt.setString(1, odb.getOtherDisease());
					pstmt.setInt(2, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editOtherDiseases: " + sqle.getMessage());
					return false;
				}
				break;
		}
		return true;
	}
	
	public static boolean editMedications(MedicationsBean mb, Connection connection, int disease, int id) {
		switch (disease) {
			case (1):
			case (2):
			case (3):
			case (4):
			case (5):
			case (6):
			case (7):
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_MEDICATIONS);
					pstmt.setString(1, mb.getGenericName());
					pstmt.setDouble(2, mb.getDose());
					pstmt.setString(3, mb.getFrequency());
					pstmt.setInt(4, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editMedications: " + sqle.getMessage());
					return false;
				}
				break;
		}
		return true;
	}
	
	public static boolean editHematology(HematologyBean hb, Connection connection, int disease, int id) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_HEMATOLOGY_AAPHSMDS);
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
					pstmt.setInt(13, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editHematology: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (2): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_HEMATOLOGY_COAGULATION);
					pstmt.setDouble(1, hb.getHemoglobin());
					pstmt.setDouble(2, hb.getHematocrit());
					pstmt.setDouble(3, hb.getWhiteBloodCells());
					pstmt.setDouble(4, hb.getNeutrophils());
					pstmt.setDouble(5, hb.getLymphocytes());
					pstmt.setDouble(6, hb.getMonocytes());
					pstmt.setDouble(7, hb.getEosinophils());
					pstmt.setDouble(8, hb.getBasophils());
					pstmt.setDouble(9, hb.getPlateletCount());
					pstmt.setInt(10, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editHematology: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_HEMATOLOGY_LEUKEMIA);
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
					pstmt.setInt(13, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editHematology: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_HEMATOLOGY_LYMPHOMA);
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
					pstmt.setInt(13, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editHematology: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (5): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_HEMATOLOGY_MYELOPROLIFERATIVE);
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
					pstmt.setInt(13, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editHematology: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_HEMATOLOGY_PLASMACELL);
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
					pstmt.setInt(13, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editHematology: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_HEMATOLOGY_PLATELETCELL);
					pstmt.setDouble(1, hb.getHemoglobin());
					pstmt.setDouble(2, hb.getHematocrit());
					pstmt.setDouble(3, hb.getWhiteBloodCells());
					pstmt.setDouble(4, hb.getNeutrophils());
					pstmt.setDouble(5, hb.getLymphocytes());
					pstmt.setDouble(6, hb.getMonocytes());
					pstmt.setDouble(7, hb.getEosinophils());
					pstmt.setDouble(8, hb.getBasophils());
					pstmt.setDouble(9, hb.getPlateletCount());
					pstmt.setInt(10, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editHematology: " + sqle.getMessage());
					return false;
				}
				break;
			}
		}
		return true;
	}
	
	public static boolean editCoagulationTesting(CoagulationTestingBean ctb, Connection connection, int disease, int id) {
		switch (disease) {
			case (1): {
				
			}
			case (2): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_COAGULATION_TESTING);
					pstmt.setDouble(1, ctb.getFactorVIIILevel());
					pstmt.setDouble(2, ctb.getFactorIXLevel());
					pstmt.setDouble(3, ctb.getInhibitorAssay());
					pstmt.setDouble(4, ctb.getBethesdaUnits());
					pstmt.setInt(5, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editCoagulationTesting: " + sqle.getMessage());
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
	
	public static boolean editBloodChemistry(BloodChemistryBean bcb, Connection connection, int disease, int id) {
		switch (disease) {
			case (1): {
				
			}
			case (2): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_BLOOD_CHEMISTRY_COAGULATION);
					pstmt.setDouble(1, bcb.getCreatine());
					pstmt.setDouble(2, bcb.getUricAcid());
					pstmt.setDouble(3, bcb.getSGOT());
					pstmt.setDouble(4, bcb.getSGPT());
					pstmt.setDouble(5, bcb.getLDH());
					pstmt.setDouble(6, bcb.getNa());
					pstmt.setDouble(7, bcb.getK());
					pstmt.setInt(8, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editBloodChemistry: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_BLOOD_CHEMISTRY_LEUKEMIA);
					pstmt.setDouble(1, bcb.getCreatine());
					pstmt.setDouble(2, bcb.getUricAcid());
					pstmt.setDouble(3, bcb.getSGOT());
					pstmt.setDouble(4, bcb.getSGPT());
					pstmt.setDouble(5, bcb.getLDH());
					pstmt.setDouble(6, bcb.getNa());
					pstmt.setDouble(7, bcb.getK());
					pstmt.setInt(8, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editBloodChemistry: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_BLOOD_CHEMISTRY_LYMPHOMA);
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
					pstmt.setInt(14, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editBloodChemistry: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (5): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_BLOOD_CHEMISTRY_MYELOPROLIFERATIVE);
					pstmt.setDouble(1, bcb.getCreatine());
					pstmt.setDouble(2, bcb.getUricAcid());
					pstmt.setDouble(3, bcb.getSGOT());
					pstmt.setDouble(4, bcb.getSGPT());
					pstmt.setDouble(5, bcb.getLDH());
					pstmt.setDouble(6, bcb.getEPOLevel());
					pstmt.setInt(7, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editBloodChemistry: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_BLOOD_CHEMISTRY_PLASMACELL);
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
					pstmt.setInt(12, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editBloodChemistry: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_BLOOD_CHEMISTRY_PLATELETCELL);
					pstmt.setDouble(1, bcb.getCreatine());
					pstmt.setDouble(2, bcb.getUricAcid());
					pstmt.setDouble(3, bcb.getSGOT());
					pstmt.setDouble(4, bcb.getSGPT());
					pstmt.setDouble(5, bcb.getLDH());
					pstmt.setDouble(6, bcb.getEPOLevel());
					pstmt.setInt(7, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editBloodChemistry: " + sqle.getMessage());
					return false;
				}
				break;
			}
		}
		return true;
	}
	
	public static boolean editOtherLaboratories(OtherLaboratoriesBean olb, Connection connection, int disease, int id) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_OTHER_LABORATORIES_AAPHSMDS);
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
					pstmt.setInt(18, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editOtherLaboratories: " + sqle.getMessage());
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
	
	public static boolean editBoneMarrowAspirate(BoneMarrowAspirateBean bmab, Connection connection, int disease, int id) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_BONE_MARROW_ASPIRATE);
					pstmt.setString(1, bmab.getDatePerformed());
					pstmt.setString(2, bmab.getResult());
					pstmt.setInt(3, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editBoneMarrowAspirate: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (2): {
			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_BONE_MARROW_ASPIRATE);
					pstmt.setString(1, bmab.getDatePerformed());
					pstmt.setString(2, bmab.getResult());
					pstmt.setInt(3, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editBoneMarrowAspirate: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_BONE_MARROW_ASPIRATE);
					pstmt.setString(1, bmab.getDatePerformed());
					pstmt.setString(2, bmab.getResult());
					pstmt.setInt(3, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editBoneMarrowAspirate: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (5): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_BONE_MARROW_ASPIRATE);
					pstmt.setString(1, bmab.getDatePerformed());
					pstmt.setString(2, bmab.getResult());
					pstmt.setInt(3, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editBoneMarrowAspirate: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_BONE_MARROW_ASPIRATE);
					pstmt.setString(1, bmab.getDatePerformed());
					pstmt.setString(2, bmab.getResult());
					pstmt.setInt(3, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editBoneMarrowAspirate: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_BONE_MARROW_ASPIRATE);
					pstmt.setString(1, bmab.getDatePerformed());
					pstmt.setString(2, bmab.getResult());
					pstmt.setInt(3, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editBoneMarrowAspirate: " + sqle.getMessage());
					return false;
				}
				break;
			}
			
		}
		return true;
	}
	
	public static boolean editFlowCytometry(FlowCytometryBean fcb, Connection connection, int disease, int id) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_FLOWCYTOMETRY);
					pstmt.setString(1, fcb.getResult());
					pstmt.setInt(2, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editFlowCytometry: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (2): {
				
			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_FLOWCYTOMETRY);
					pstmt.setString(1, fcb.getResult());
					pstmt.setInt(2, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editFlowCytometry: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_FLOWCYTOMETRY);
					pstmt.setString(1, fcb.getResult());
					pstmt.setInt(2, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editFlowCytometry: " + sqle.getMessage());
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
	
	public static boolean editCytogeneticMolecular(CytogeneticMolecularBean cmb, Connection connection, int disease, int id) {
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
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_CYTOGENETIC_MOLECULAR);
					pstmt.setString(1, cmb.getResult());
					pstmt.setInt(2, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editCytogeneticMolecular: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_CYTOGENETIC_MOLECULAR);
					pstmt.setString(1, cmb.getResult());
					pstmt.setInt(2, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editCytogeneticMolecular: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
			}
		}
		return true;
	}
	
	public static boolean editCytogeneticMolecularAAPNH(CytogeneticMolecularAAPNHBean cmaapnhb, Connection connection, int disease,
			int id) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_CYTOGENETIC_MOLECULAR_AAPNH_AAPHSMDS);
					pstmt.setString(1, cmaapnhb.getResult());
					pstmt.setInt(2, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editCytogeneticMolecularAAPNH: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (2): {
				
			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_CYTOGENETIC_MOLECULAR_AAPNH_LEUKEMIA);
					pstmt.setString(1, cmaapnhb.getResult());
					pstmt.setInt(2, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editCytogeneticMolecularAAPNH: " + sqle.getMessage());
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
	
	public static boolean editCytogeneticMolecularMDS(CytogeneticMolecularMDSBean cmmdsb, Connection connection, int disease, int id) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_CYTOGENETIC_MOLECULAR_MDS_AAPHSMDS);
					pstmt.setString(1, cmmdsb.getResult());
					pstmt.setInt(2, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editCytogeneticMolecularMDS: " + sqle.getMessage());
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
	
	public static boolean editImagingStudies(ImagingStudiesBean isb, Connection connection, int disease, int id) {
		switch (disease) {
			case (1): {
				
			}
			case (2): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_IMAGING_STUDIES);
					pstmt.setBytes(1, isb.getResult());
					pstmt.setInt(2, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editImagingStudies: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_IMAGING_STUDIES);
					pstmt.setBytes(1, isb.getResult());
					pstmt.setInt(2, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editImagingStudies: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_IMAGING_STUDIES);
					pstmt.setBytes(1, isb.getResult());
					pstmt.setInt(2, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editImagingStudies: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (5): {
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_IMAGING_STUDIES);
					pstmt.setBytes(1, isb.getResult());
					pstmt.setInt(2, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editImagingStudies: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_IMAGING_STUDIES);
					pstmt.setBytes(1, isb.getResult());
					pstmt.setInt(2, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editImagingStudies: " + sqle.getMessage());
					return false;
				}
				break;
			}
		}
		return true;
	}
	
	public static boolean editUpperGIEndoscopy(UpperGIEndoscopyBean ugeb, Connection connection, int disease, int id) {
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
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_UPPERGIENDOSCOPY);
					pstmt.setString(1, ugeb.getDatePerformed());
					pstmt.setString(2, ugeb.getDescription());
					pstmt.setBoolean(3, ugeb.isHPylori());
					pstmt.setInt(4, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editUpperGIEndoscopy: " + sqle.getMessage());
					return false;
				}
				break;
			}
		}
		return true;
	}
	
	public static boolean editHematopathology(HematopathologyBean hpb, Connection connection, int disease, int id) {
		switch (disease) {
			case (1): {
			}
			case (2): {
			}
			case (3): {
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_HEMATOPATHOLOGY);
					pstmt.setString(1, hpb.getDatePerformed());
					pstmt.setString(2, hpb.getResult());
					pstmt.setInt(3, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editHematopathology: " + sqle.getMessage());
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
	
	public static boolean editImmunohistochemistry(ImmunohistochemistryBean ihcb, Connection connection, int disease, int id) {
		switch (disease) {
			case (1): {
			}
			case (2): {
			}
			case (3): {
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_IMMUNOHISTOCHEMISTRY);
					pstmt.setString(1, ihcb.getDatePerformed());
					pstmt.setString(2, ihcb.getResult());
					pstmt.setInt(3, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editImmunohistochemistry: " + sqle.getMessage());
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
	
	public static boolean editSerumFree(SerumFreeBean sfb, Connection connection, int disease, int id) {
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
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_SERUMFREE);
					pstmt.setString(1, sfb.getResult());
					pstmt.setInt(2, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editSerumFree: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
			}
		}
		return true;
	}
	
	public static boolean editSerumImmunofixation(SerumImmunofixationBean sifb, Connection connection, int disease, int id) {
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
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_SERUMIMMUNOFIXATION);
					pstmt.setString(1, sifb.getResult());
					pstmt.setInt(2, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editSerumImmunofixation: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
			}
		}
		return true;
	}
	
	public static boolean editSerumProtein(SerumProteinBean spb, Connection connection, int disease, int id) {
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
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_SERUMPROTEIN);
					pstmt.setString(1, spb.getResult());
					pstmt.setInt(2, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editSerumProtein: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
			}
		}
		return true;
	}
	
	public static boolean editUrineProtein(UrineProteinBean upb, Connection connection, int disease, int id) {
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
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_URINEPROTEIN);
					pstmt.setString(1, upb.getResult());
					pstmt.setInt(2, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editUrineProtein: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
			}
		}
		return true;
	}
	
	public static boolean editLaboratoryProfile(LaboratoryProfileBean lpb, Connection connection, int disease, int id) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_LABORATORY_PROFILE_AAPHSMDS);
					pstmt.setString(1, lpb.getDateOfBloodCollection());
					pstmt.setInt(2, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editLaboratoryProfile: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (2): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_LABORATORY_PROFILE_COAGULATION);
					pstmt.setString(1, lpb.getDateOfBloodCollection());
					pstmt.setInt(2, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editLaboratoryProfile: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_LABORATORY_PROFILE_LEUKEMIA);
					pstmt.setString(1, lpb.getDateOfBloodCollection());
					pstmt.setInt(2, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editLaboratoryProfile: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_LABORATORY_PROFILE_LYMPHOMA);
					pstmt.setString(1, lpb.getDateOfBloodCollection());
					pstmt.setInt(2, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editLaboratoryProfile: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (5): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_LABORATORY_PROFILE_MYELOPROLIFERATIVE);
					pstmt.setString(1, lpb.getDateOfBloodCollection());
					pstmt.setInt(2, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editLaboratoryProfile: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_LABORATORY_PROFILE_PLASMACELL);
					pstmt.setString(1, lpb.getDateOfBloodCollection());
					pstmt.setInt(2, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editLaboratoryProfile: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_LABORATORY_PROFILE_PLATELETCELL);
					pstmt.setString(1, lpb.getDateOfBloodCollection());
					pstmt.setString(2, lpb.getITP());
					pstmt.setInt(3, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editLaboratoryProfile: " + sqle.getMessage());
					return false;
				}
				break;
			}
		}
		return true;
	}
	
	public static boolean editModeOfTreatment(ModeOfTreatmentBean motb, Connection connection, int disease, int id) {
		switch (disease) {
			case (1):
			case (2):
			case (3):
			case (4):
			case (5):
			case (6):
			case (7):
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_MODE_OF_TREATMENT);
					pstmt.setString(1, motb.getModeOfTreatment());
					pstmt.setString(2, motb.getNameOfTreatment());
					pstmt.setInt(3, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editModeOfTreatment: " + sqle.getMessage());
					return false;
				}
				break;
		}
		return true;
	}
	
	public static boolean editChemotherapyMedications(ChemotherapyMedicationsBean cmb, Connection connection, int disease, int id) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_CHEMOTHERAPY_MEDICATIONS);
					pstmt.setString(1, cmb.getMedications());
					pstmt.setInt(2, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editChemotherapyMedications: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (2): {
				
			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_CHEMOTHERAPY_MEDICATIONS);
					pstmt.setString(1, cmb.getMedications());
					pstmt.setInt(2, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editChemotherapyMedications: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_CHEMOTHERAPY_MEDICATIONS);
					pstmt.setString(1, cmb.getMedications());
					pstmt.setInt(2, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editChemotherapyMedications: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (5): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_CHEMOTHERAPY_MEDICATIONS);
					pstmt.setString(1, cmb.getMedications());
					pstmt.setInt(2, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editChemotherapyMedications: " + sqle.getMessage());
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
	
	public static boolean editRegimen(RegimenBean rb, Connection connection, int disease, int id) {
		switch (disease) {
			case (1): {
			}
			case (2): {
			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_REGIMEN);
					pstmt.setString(1, rb.getRegimenName());
					pstmt.setString(2, rb.getOtherRegimen());
					pstmt.setInt(3, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editRegimen: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_REGIMEN);
					pstmt.setString(1, rb.getRegimenName());
					pstmt.setString(2, rb.getOtherRegimen());
					pstmt.setInt(3, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editRegimen: " + sqle.getMessage());
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
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_REGIMEN);
					pstmt.setString(1, rb.getRegimenName());
					pstmt.setString(2, rb.getOtherRegimen());
					pstmt.setInt(3, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editRegimen: " + sqle.getMessage());
					return false;
				}
				break;
			}
		}
		return true;
	}
	
	public static boolean editRegimenTransplant(RegimenTransplantBean rtb, Connection connection, int disease, int id) {
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
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_REGIMEN_TRANSPLANT);
					pstmt.setString(1, rtb.getRegimenName());
					pstmt.setString(2, rtb.getOtherRegimen());
					pstmt.setInt(3, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editRegimenTransplant: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
			}
		}
		return true;
	}
	
	public static boolean editRegimenNonTransplant(RegimenNonTransplantBean rntb, Connection connection, int disease, int id) {
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
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_REGIMEN_NONTRANSPLANT);
					pstmt.setString(1, rntb.getRegimenName());
					pstmt.setString(2, rntb.getOtherRegimen());
					pstmt.setInt(3, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editRegimenNonTransplant: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
			}
		}
		return true;
	}
	
	public static boolean editMaintenanceTherapy(MaintenanceTherapyBean mtb, Connection connection, int disease, int id) {
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
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_MAINTENANCE_THERAPY);
					pstmt.setString(1, mtb.getMaintenanceTherapyName());
					pstmt.setString(2, mtb.getOtherMaintenanceTherapy());
					pstmt.setInt(3, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editMaintenanceTherapy: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
			}
		}
		return true;
	}
	
	public static boolean editTreatment(TreatmentBean tb, Connection connection, int disease, int id) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_TREATMENT_AAPHSMDS);
					pstmt.setBoolean(1, tb.isTransplant());
					pstmt.setString(2, tb.getDateStarted());
					pstmt.setInt(3, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editTreatment: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (2): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_TREATMENT_COAGULATION);
					pstmt.setInt(1, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editTreatment: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_TREATMENT_LEUKEMIA);
					pstmt.setString(1, tb.getDateStarted());
					pstmt.setInt(2, tb.getCycleNumber());
					pstmt.setInt(3, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editTreatment: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_TREATMENT_LYMPHOMA);
					pstmt.setString(1, tb.getDateStarted());
					pstmt.setInt(2, tb.getCycleNumber());
					pstmt.setString(3, tb.getComplications());
					pstmt.setInt(4, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editTreatment: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (5): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_TREATMENT_MYELOPROLIFERATIVE);
					pstmt.setString(1, tb.getDateStarted());
					pstmt.setInt(2, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editTreatment: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_TREATMENT_PLASMACELL);
					pstmt.setString(1, tb.getDateStarted());
					pstmt.setInt(2, tb.getCycleNumber());
					pstmt.setString(3, tb.getComplications());
					pstmt.setInt(4, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editTreatment: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_TREATMENT_PLATELETCELL);
					pstmt.setString(1, tb.getDateStarted());
					pstmt.setString(2, tb.getComplications());
					pstmt.setInt(3, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editTreatment: " + sqle.getMessage());
					return false;
				}
				break;
			}
		}
		return true;
	}
	
	public static boolean editOtherTreatment(OtherTreatmentBean otb, Connection connection, int disease, int id) {
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
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_OTHERTREATMENT);
					pstmt.setString(1, otb.getBisphosphonates());
					pstmt.setString(2, otb.getRadiotherapy());
					pstmt.setString(3, otb.getOtherMedications());
					pstmt.setString(4, otb.getComplications());
					pstmt.setInt(5, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editRegimenNonTransplant: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
			}
		}
		return true;
	}
	
	public static boolean editDiseaseStatus(DiseaseStatusBean dsb, Connection connection, int disease, int id) {
		switch (disease) {
			case (1):
			case (2):
			case (3):
			case (4):
			case (5):
			case (6):
			case (7):
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_DISEASE_STATUS);
					pstmt.setString(1, dsb.getDiseaseStatus());
					pstmt.setString(2, dsb.getRelapseDisease());
					pstmt.setString(3, dsb.getOtherDisease());
					pstmt.setInt(4, id);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- editDiseaseStatus: " + sqle.getMessage());
					return false;
				}
				break;
		}
		return true;
	}
	
}
