package utility.database;

import java.sql.*;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import model.*;

public class SQLOperationsFollowUp implements SQLCommandsFollowUp {
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

	public static boolean addMedicalEvents(MedicalEventsBean meb, Connection connection, int disease) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_MEDICAL_EVENTS);
					pstmt.setString(1, meb.getHematologicMalignancy());
					pstmt.setString(2, meb.getOtherDiseaseMedication());
					pstmt.setString(3, meb.getProcedureIntervention());
					pstmt.setString(4, meb.getChemotherapy());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addMedicalEvents: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (2): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_MEDICAL_EVENTS_COAGULATION);
					pstmt.setString(1, meb.getFactorConcentrate());
					pstmt.setString(2, meb.getFactorConcentrateDates());
					pstmt.setDouble(3, meb.getFactorConcentrateDose());
					pstmt.setString(4, meb.getProcedureIntervention());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addMedicalEvents: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_MEDICAL_EVENTS);
					pstmt.setString(1, meb.getHematologicMalignancy());
					pstmt.setString(2, meb.getOtherDiseaseMedication());
					pstmt.setString(3, meb.getProcedureIntervention());
					pstmt.setString(4, meb.getChemotherapy());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addMedicalEvents: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_MEDICAL_EVENTS);
					pstmt.setString(1, meb.getHematologicMalignancy());
					pstmt.setString(2, meb.getOtherDiseaseMedication());
					pstmt.setString(3, meb.getProcedureIntervention());
					pstmt.setString(4, meb.getChemotherapy());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addMedicalEvents: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (5): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_MEDICAL_EVENTS);
					pstmt.setString(1, meb.getHematologicMalignancy());
					pstmt.setString(2, meb.getOtherDiseaseMedication());
					pstmt.setString(3, meb.getProcedureIntervention());
					pstmt.setString(4, meb.getChemotherapy());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addMedicalEvents: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_MEDICAL_EVENTS);
					pstmt.setString(1, meb.getHematologicMalignancy());
					pstmt.setString(2, meb.getOtherDiseaseMedication());
					pstmt.setString(3, meb.getProcedureIntervention());
					pstmt.setString(4, meb.getChemotherapy());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addMedicalEvents: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_MEDICAL_EVENTS_PLATELETCELL);
					pstmt.setString(1, meb.getOtherDiseaseMedication());
					pstmt.setString(2, meb.getProcedureIntervention());
					pstmt.setString(3, meb.getChemotherapy());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addMedicalEvents: " + sqle.getMessage());
					return false;
				}
				break;
			}
		}
		return true;
	}

	public static boolean addPhysicalExam(PhysicalExamBean peb, Connection connection, int disease) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_PHYSICAL_EXAM);
					pstmt.setDouble(1, peb.getWeight());
					pstmt.setDouble(2, peb.getECOG());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addPhysicalExam: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (2): {
			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_PHYSICAL_EXAM);
					pstmt.setDouble(1, peb.getWeight());
					pstmt.setDouble(2, peb.getECOG());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addPhysicalExam: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_PHYSICAL_EXAM);
					pstmt.setDouble(1, peb.getWeight());
					pstmt.setDouble(2, peb.getECOG());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addPhysicalExam: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (5): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_PHYSICAL_EXAM);
					pstmt.setDouble(1, peb.getWeight());
					pstmt.setDouble(2, peb.getECOG());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addPhysicalExam: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_PHYSICAL_EXAM);
					pstmt.setDouble(1, peb.getWeight());
					pstmt.setDouble(2, peb.getECOG());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addPhysicalExam: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_PHYSICAL_EXAM);
					pstmt.setDouble(1, peb.getWeight());
					pstmt.setDouble(2, peb.getECOG());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addPhysicalExam: " + sqle.getMessage());
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
					PreparedStatement pstmt = connection.prepareStatement(INSERT_CLINICAL_DATA);
					pstmt.setString(1, cdb.getCurrentSymptoms());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addClinicalData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (2): {
			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_CLINICAL_DATA);
					pstmt.setString(1, cdb.getCurrentSymptoms());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addClinicalData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_CLINICAL_DATA);
					pstmt.setString(1, cdb.getCurrentSymptoms());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addPatient: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (5): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_CLINICAL_DATA);
					pstmt.setString(1, cdb.getCurrentSymptoms());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addPatient: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_CLINICAL_DATA);
					pstmt.setString(1, cdb.getCurrentSymptoms());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addPatient: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_CLINICAL_DATA);
					pstmt.setString(1, cdb.getCurrentSymptoms());
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

	public static boolean addHematology(HematologyBean hb, Connection connection, int disease) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_HEMATOLOGY);
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
			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_HEMATOLOGY);
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
					PreparedStatement pstmt = connection.prepareStatement(INSERT_HEMATOLOGY);
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
					PreparedStatement pstmt = connection.prepareStatement(INSERT_HEMATOLOGY);
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
					PreparedStatement pstmt = connection.prepareStatement(INSERT_HEMATOLOGY);
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
					PreparedStatement pstmt = connection.prepareStatement(INSERT_HEMATOLOGY);
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
		}
		return true;
	}

	public static boolean addOtherLaboratories(OtherLaboratoriesBean olb, Connection connection, int disease) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_OTHER_LABORATORIES_AAPHSMDS);
					pstmt.setDouble(1, olb.getCreatinineOther());
					pstmt.setDouble(2, olb.getReticulocyteCount());
					pstmt.setDouble(3, olb.getSerumFerritin());
					pstmt.setDouble(4, olb.getLDH());
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

	public static boolean addBloodChemistry(BloodChemistryBean bcb, Connection connection, int disease) {
		switch (disease) {
			case (1): {
			}
			case (2): {
			}
			case (3): {
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_BLOOD_CHEMISTRY_LYMPHOMA);
					pstmt.setDouble(1, bcb.getLDH());
					pstmt.setDouble(2, bcb.getESR());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addBloodChemistry: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (5): {
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_BLOOD_CHEMISTRY_PLASMACELL);
					pstmt.setDouble(1, bcb.getCreatine());
					pstmt.setDouble(2, bcb.getiCa());
					pstmt.setDouble(3, bcb.getTotalProtein());
					pstmt.setDouble(4, bcb.getAlbumin());
					pstmt.setDouble(5, bcb.getGlobulin());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addBloodChemistry: " + sqle.getMessage());
					return false;
				}
				break;
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
			}
			case (3): {
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

	public static boolean addDiseaseStatus(DiseaseStatusBean dsb, Connection connection, int disease) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_DISEASE_STATUS);
					pstmt.setString(1, dsb.getDiseaseStatus());
					pstmt.setString(2, dsb.getOtherDisease());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addDiseaseStatus: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (2): {
			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_DISEASE_STATUS);
					pstmt.setString(1, dsb.getDiseaseStatus());
					pstmt.setString(2, dsb.getOtherDisease());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addDiseaseStatus: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_DISEASE_STATUS);
					pstmt.setString(1, dsb.getDiseaseStatus());
					pstmt.setString(2, dsb.getOtherDisease());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addDiseaseStatus: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (5): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_DISEASE_STATUS);
					pstmt.setString(1, dsb.getDiseaseStatus());
					pstmt.setString(2, dsb.getOtherDisease());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addDiseaseStatus: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_DISEASE_STATUS_PLASMACELL);
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
			case (7): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_DISEASE_STATUS);
					pstmt.setString(1, dsb.getDiseaseStatus());
					pstmt.setString(2, dsb.getOtherDisease());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addDiseaseStatus: " + sqle.getMessage());
					return false;
				}
				break;
			}
		}
		return true;
	}

	public static boolean addFollowUp(FollowUpBean fub, Connection connection, int disease) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_FOLLOWUP_AAPHSMDS);
					pstmt.setInt(1, fub.getPatientID());
					pstmt.setString(2, fub.getDateOfEntry());
					pstmt.setString(3, fub.getDateOfVisit());
					pstmt.setString(4, fub.getNotes());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addFollowUp: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (2): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_FOLLOWUP_COAGULATION);
					pstmt.setInt(1, fub.getPatientID());
					pstmt.setString(2, fub.getDateOfEntry());
					pstmt.setString(3, fub.getDateOfVisit());
					pstmt.setString(4, fub.getNotes());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addFollowUp: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_FOLLOWUP_LEUKEMIA);
					pstmt.setInt(1, fub.getPatientID());
					pstmt.setString(2, fub.getDateOfEntry());
					pstmt.setString(3, fub.getDateOfVisit());
					pstmt.setString(4, fub.getNotes());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addFollowUp: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_FOLLOWUP_LYMPHOMA);
					pstmt.setInt(1, fub.getPatientID());
					pstmt.setString(2, fub.getDateOfEntry());
					pstmt.setString(3, fub.getDateOfVisit());
					pstmt.setString(4, fub.getNotes());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addFollowUp: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (5): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_FOLLOWUP_MYELOPROLIFERATIVE);
					pstmt.setInt(1, fub.getPatientID());
					pstmt.setString(2, fub.getDateOfEntry());
					pstmt.setString(3, fub.getDateOfVisit());
					pstmt.setString(4, fub.getNotes());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addFollowUp: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_FOLLOWUP_PLASMACELL);
					pstmt.setInt(1, fub.getPatientID());
					pstmt.setString(2, fub.getDateOfEntry());
					pstmt.setString(3, fub.getDateOfVisit());
					pstmt.setString(4, fub.getNotes());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addFollowUp: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(INSERT_FOLLOWUP_PLATELETCELL);
					pstmt.setInt(1, fub.getPatientID());
					pstmt.setString(2, fub.getDateOfEntry());
					pstmt.setString(3, fub.getDateOfVisit());
					pstmt.setString(4, fub.getNotes());
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- addFollowUp: " + sqle.getMessage());
					return false;
				}
				break;
			}
		}
		return true;
	}

	public static boolean updatePatient(Connection connection, int disease) {
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
			}
		}
		return true;
	}
	
	
	//get statements
	
	public static ResultSet getMedicalEvents(int chemoMedicationId, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_MEDICAL_EVENTS);
			pstmt.setInt(1, chemoMedicationId);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getTreatment: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getPhysicalExam(int patientId, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_PHYSICAL_EXAM);
			pstmt.setInt(1, patientId);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getPhysicalExam: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getClinicalData(int clinicalDataId, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_CLINICAL_DATA);
			pstmt.setInt(1, clinicalDataId);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getClinicalData: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getHematology(int hematologyId, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_HEMATOLOGY);
			pstmt.setInt(1, hematologyId);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getHematology: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getOtherLaboratories(int otherLaboratoriesId, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_OTHER_LABORATORIES_AAPHSMDS);
			pstmt.setInt(1, otherLaboratoriesId);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getOtherLaboratories: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getBloodChemistry(int bloodChemistryId, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_BLOOD_CHEMISTRY);
			pstmt.setInt(1, bloodChemistryId);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getBloodChemistry: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getBoneMarrowAspirate(int boneMarrowAspirateId, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_BONE_MARROW_ASPIRATE);
			pstmt.setInt(1, boneMarrowAspirateId);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getBoneMarrowAspirate: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getFlowCytometry(int flowCytometryId, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_FLOWCYTOMETRY);
			pstmt.setInt(1, flowCytometryId);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getBoneMarrowAspirate: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getCytogeneticMolecular(int cytogeneticMolecularId, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_CYTOGENETIC_MOLECULAR);
			pstmt.setInt(1, cytogeneticMolecularId);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getCytogeneticMolecular: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getImagingStudies(int imagingStudiesId, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_IMAGING_STUDIES);
			pstmt.setInt(1, imagingStudiesId);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getImagingStudies: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getSerumFree(int serumFreeId, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_SERUMFREE);
			pstmt.setInt(1, serumFreeId);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getSerumFree: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getSerumImmunofixation(int serumImmunofixationId, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_SERUMIMMUNOFIXATION);
			pstmt.setInt(1, serumImmunofixationId);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getSerumImmunofixation: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getSerumProtein(int serumProteinId, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_SERUMPROTEIN);
			pstmt.setInt(1, serumProteinId);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getSerumProtein: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getUrineProtein(int urineProteinId, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_URINEPROTEIN);
			pstmt.setInt(1, urineProteinId);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getUrineProtein: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getLaboratoryProfile(int laboratoryProfileId, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_LABORATORY_PROFILE);
			pstmt.setInt(1, laboratoryProfileId);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getLaboratoryProfile: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getDiseaseStatus(int diseaseStatusId, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_DISEASE_STATUS);
			pstmt.setInt(1, diseaseStatusId);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getDiseaseStatus: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getFollowup(int followupId, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_FOLLOWUP);
			pstmt.setInt(1, followupId);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getFollowup: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}	
	
	//update statements
	public static boolean updateMedicalEvents(MedicalEventsBean meb, Connection connection, int disease, int medicalEventsId) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_MEDICAL_EVENTS);
					pstmt.setString(1, meb.getHematologicMalignancy());
					pstmt.setString(2, meb.getOtherDiseaseMedication());
					pstmt.setString(3, meb.getProcedureIntervention());
					pstmt.setString(4, meb.getChemotherapy());
					pstmt.setInt(5, medicalEventsId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateMedicalEvents: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (2): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_MEDICAL_EVENTS_COAGULATION);
					pstmt.setString(1, meb.getFactorConcentrate());
					pstmt.setString(2, meb.getFactorConcentrateDates());
					pstmt.setDouble(3, meb.getFactorConcentrateDose());
					pstmt.setString(4, meb.getProcedureIntervention());
					pstmt.setInt(5, medicalEventsId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateMedicalEvents: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_MEDICAL_EVENTS);
					pstmt.setString(1, meb.getHematologicMalignancy());
					pstmt.setString(2, meb.getOtherDiseaseMedication());
					pstmt.setString(3, meb.getProcedureIntervention());
					pstmt.setString(4, meb.getChemotherapy());
					pstmt.setInt(5, medicalEventsId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateMedicalEvents: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_MEDICAL_EVENTS);
					pstmt.setString(1, meb.getHematologicMalignancy());
					pstmt.setString(2, meb.getOtherDiseaseMedication());
					pstmt.setString(3, meb.getProcedureIntervention());
					pstmt.setString(4, meb.getChemotherapy());
					pstmt.setInt(5, medicalEventsId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateMedicalEvents: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (5): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_MEDICAL_EVENTS);
					pstmt.setString(1, meb.getHematologicMalignancy());
					pstmt.setString(2, meb.getOtherDiseaseMedication());
					pstmt.setString(3, meb.getProcedureIntervention());
					pstmt.setString(4, meb.getChemotherapy());
					pstmt.setInt(5, medicalEventsId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateMedicalEvents: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_MEDICAL_EVENTS);
					pstmt.setString(1, meb.getHematologicMalignancy());
					pstmt.setString(2, meb.getOtherDiseaseMedication());
					pstmt.setString(3, meb.getProcedureIntervention());
					pstmt.setString(4, meb.getChemotherapy());
					pstmt.setInt(5, medicalEventsId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateMedicalEvents: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_MEDICAL_EVENTS_PLATELETCELL);
					pstmt.setString(1, meb.getOtherDiseaseMedication());
					pstmt.setString(2, meb.getProcedureIntervention());
					pstmt.setString(3, meb.getChemotherapy());
					pstmt.setInt(4, medicalEventsId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateMedicalEvents: " + sqle.getMessage());
					return false;
				}
				break;
			}
		}
		return true;
	}

	public static boolean updatePhysicalExam(PhysicalExamBean peb, Connection connection, int disease, int physicalExamId) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_PHYSICAL_EXAM);
					pstmt.setDouble(1, peb.getWeight());
					pstmt.setDouble(2, peb.getECOG());
					pstmt.setInt(3, physicalExamId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updatePhysicalExam: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (2): {
			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_PHYSICAL_EXAM);
					pstmt.setDouble(1, peb.getWeight());
					pstmt.setDouble(2, peb.getECOG());
					pstmt.setInt(3, physicalExamId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updatePhysicalExam: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_PHYSICAL_EXAM);
					pstmt.setDouble(1, peb.getWeight());
					pstmt.setDouble(2, peb.getECOG());
					pstmt.setInt(3, physicalExamId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updatePhysicalExam: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (5): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_PHYSICAL_EXAM);
					pstmt.setDouble(1, peb.getWeight());
					pstmt.setDouble(2, peb.getECOG());
					pstmt.setInt(3, physicalExamId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updatePhysicalExam: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_PHYSICAL_EXAM);
					pstmt.setDouble(1, peb.getWeight());
					pstmt.setDouble(2, peb.getECOG());
					pstmt.setInt(3, physicalExamId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updatePhysicalExam: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_PHYSICAL_EXAM);
					pstmt.setDouble(1, peb.getWeight());
					pstmt.setDouble(2, peb.getECOG());
					pstmt.setInt(3, physicalExamId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updatePhysicalExam: " + sqle.getMessage());
					return false;
				}
				break;
			}
		}
		return true;
	}

	public static boolean updateClinicalData(ClinicalDataBean cdb, Connection connection, int disease, int clinicaldDataId) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_CLINICAL_DATA);
					pstmt.setString(1, cdb.getCurrentSymptoms());
					pstmt.setInt(2, clinicaldDataId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateClinicalData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (2): {
			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_CLINICAL_DATA);
					pstmt.setString(1, cdb.getCurrentSymptoms());
					pstmt.setInt(2, clinicaldDataId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateClinicalData: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_CLINICAL_DATA);
					pstmt.setString(1, cdb.getCurrentSymptoms());
					pstmt.setInt(2, clinicaldDataId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updatePatient: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (5): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_CLINICAL_DATA);
					pstmt.setString(1, cdb.getCurrentSymptoms());
					pstmt.setInt(2, clinicaldDataId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updatePatient: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_CLINICAL_DATA);
					pstmt.setString(1, cdb.getCurrentSymptoms());
					pstmt.setInt(2, clinicaldDataId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updatePatient: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_CLINICAL_DATA);
					pstmt.setString(1, cdb.getCurrentSymptoms());
					pstmt.setInt(2, clinicaldDataId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateClinicalData: " + sqle.getMessage());
					return false;
				}
				break;
			}
		}
		return true;
	}

	public static boolean updateHematology(HematologyBean hb, Connection connection, int disease, int hemtologyId) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_HEMATOLOGY);
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
					pstmt.setInt(13, hemtologyId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateHematology: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (2): {
			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_HEMATOLOGY);
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
					pstmt.setInt(13, hemtologyId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateHematology: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_HEMATOLOGY);
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
					pstmt.setInt(13, hemtologyId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateHematology: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (5): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_HEMATOLOGY);
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
					pstmt.setInt(13, hemtologyId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateHematology: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_HEMATOLOGY);
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
					pstmt.setInt(13, hemtologyId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateHematology: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_HEMATOLOGY);
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
					pstmt.setInt(13, hemtologyId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateHematology: " + sqle.getMessage());
					return false;
				}
				break;
			}
		}
		return true;
	}

	public static boolean updateOtherLaboratories(OtherLaboratoriesBean olb, Connection connection, int disease, int otherLaboratoriesId) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_OTHER_LABORATORIES_AAPHSMDS);
					pstmt.setDouble(1, olb.getCreatinineOther());
					pstmt.setDouble(2, olb.getReticulocyteCount());
					pstmt.setDouble(3, olb.getSerumFerritin());
					pstmt.setDouble(4, olb.getLDH());
					pstmt.setInt(5, otherLaboratoriesId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateOtherLaboratories: " + sqle.getMessage());
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

	public static boolean updateBloodChemistry(BloodChemistryBean bcb, Connection connection, int disease, int bloodChemistryId) {
		switch (disease) {
			case (1): {
			}
			case (2): {
			}
			case (3): {
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_BLOOD_CHEMISTRY_LYMPHOMA);
					pstmt.setDouble(1, bcb.getLDH());
					pstmt.setDouble(2, bcb.getESR());
					pstmt.setInt(3, bloodChemistryId );
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateBloodChemistry: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (5): {
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_BLOOD_CHEMISTRY_PLASMACELL);
					pstmt.setDouble(1, bcb.getCreatine());
					pstmt.setDouble(2, bcb.getiCa());
					pstmt.setDouble(3, bcb.getTotalProtein());
					pstmt.setDouble(4, bcb.getAlbumin());
					pstmt.setDouble(5, bcb.getGlobulin());
					pstmt.setInt(6, bloodChemistryId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateBloodChemistry: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
			}
		}
		return true;
	}

	public static boolean updateBoneMarrowAspirate(BoneMarrowAspirateBean bmab, Connection connection, int disease, int boneMarrowAspirateId) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_BONE_MARROW_ASPIRATE);
					pstmt.setString(1, bmab.getDatePerformed());
					pstmt.setString(2, bmab.getResult());
					pstmt.setInt(3, boneMarrowAspirateId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateBoneMarrowAspirate: " + sqle.getMessage());
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
					pstmt.setInt(3, boneMarrowAspirateId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateBoneMarrowAspirate: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
			}
			case (5): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_BONE_MARROW_ASPIRATE);
					pstmt.setString(1, bmab.getDatePerformed());
					pstmt.setString(2, bmab.getResult());
					pstmt.setInt(3, boneMarrowAspirateId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateBoneMarrowAspirate: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_BONE_MARROW_ASPIRATE);
					pstmt.setString(1, bmab.getDatePerformed());
					pstmt.setString(2, bmab.getResult());
					pstmt.setInt(3, boneMarrowAspirateId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateBoneMarrowAspirate: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
			}
		}
		return true;
	}

	public static boolean updateFlowCytometry(FlowCytometryBean fcb, Connection connection, int disease, int flowCytometryId) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_FLOWCYTOMETRY);
					pstmt.setString(1, fcb.getResult());
					pstmt.setInt(2, flowCytometryId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateFlowCytometry: " + sqle.getMessage());
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
					pstmt.setInt(2, flowCytometryId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateFlowCytometry: " + sqle.getMessage());
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

	public static boolean updateCytogeneticMolecular(CytogeneticMolecularBean cmb, Connection connection, int disease, int cytogenicMolecularId) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_CYTOGENETIC_MOLECULAR);
					pstmt.setString(1, cmb.getResult());
					pstmt.setInt(2, cytogenicMolecularId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateCytogeneticMolecular: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (2): {
			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_CYTOGENETIC_MOLECULAR);
					pstmt.setString(1, cmb.getResult());
					pstmt.setInt(2, cytogenicMolecularId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateCytogeneticMolecular: " + sqle.getMessage());
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

	public static boolean updateImagingStudies(ImagingStudiesBean isb, Connection connection, int disease, int imagingStudiesId) {
		switch (disease) {
			case (1): {
			}
			case (2): {
			}
			case (3): {
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_IMAGING_STUDIES);
					pstmt.setBytes(1, isb.getResult());
					pstmt.setInt(2, imagingStudiesId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateImagingStudies: " + sqle.getMessage());
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
					pstmt.setInt(2, imagingStudiesId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateImagingStudies: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_IMAGING_STUDIES);
					pstmt.setBytes(1, isb.getResult());
					pstmt.setInt(2, imagingStudiesId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateImagingStudies: " + sqle.getMessage());
					return false;
				}
				break;
			}
		}
		return true;
	}

	public static boolean updateSerumFree(SerumFreeBean sfb, Connection connection, int disease, int serumFreeId) {
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
					pstmt.setInt(2, serumFreeId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateSerumFree: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
			}
		}
		return true;
	}

	public static boolean updateSerumImmunofixation(SerumImmunofixationBean sifb, Connection connection, int disease, int serumImmunofixationId) {
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
					pstmt.setInt(2, serumImmunofixationId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateSerumImmunofixation: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
			}
		}
		return true;
	}

	public static boolean updateSerumProtein(SerumProteinBean spb, Connection connection, int disease, int serumProteinId) {
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
					pstmt.setInt(2, serumProteinId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateSerumProtein: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
			}
		}
		return true;
	}

	public static boolean updateUrineProtein(UrineProteinBean upb, Connection connection, int disease, int urineProteinId) {
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
					pstmt.setInt(2, urineProteinId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateUrineProtein: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
			}
		}
		return true;
	}

	public static boolean updateLaboratoryProfile(LaboratoryProfileBean lpb, Connection connection, int disease, int laboratoryProfileId) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_LABORATORY_PROFILE);
					pstmt.setString(1, lpb.getDateOfBloodCollection());
					pstmt.setInt(2, laboratoryProfileId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateLaboratoryProfile: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (2): {
			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_LABORATORY_PROFILE);
					pstmt.setString(1, lpb.getDateOfBloodCollection());
					pstmt.setInt(2, laboratoryProfileId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateLaboratoryProfile: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_LABORATORY_PROFILE);
					pstmt.setString(1, lpb.getDateOfBloodCollection());
					pstmt.setInt(2, laboratoryProfileId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateLaboratoryProfile: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (5): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_LABORATORY_PROFILE);
					pstmt.setString(1, lpb.getDateOfBloodCollection());
					pstmt.setInt(2, laboratoryProfileId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateLaboratoryProfile: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_LABORATORY_PROFILE);
					pstmt.setString(1, lpb.getDateOfBloodCollection());
					pstmt.setInt(2, laboratoryProfileId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateLaboratoryProfile: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_LABORATORY_PROFILE);
					pstmt.setString(1, lpb.getDateOfBloodCollection());
					pstmt.setInt(2, laboratoryProfileId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateLaboratoryProfile: " + sqle.getMessage());
					return false;
				}
				break;
			}
		}
		return true;
	}

	public static boolean updateDiseaseStatus(DiseaseStatusBean dsb, Connection connection, int disease, int diseaseStatusId) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_DISEASE_STATUS);
					pstmt.setString(1, dsb.getDiseaseStatus());
					pstmt.setString(2, dsb.getOtherDisease());
					pstmt.setInt(3, diseaseStatusId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateDiseaseStatus: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (2): {
			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_DISEASE_STATUS);
					pstmt.setString(1, dsb.getDiseaseStatus());
					pstmt.setString(2, dsb.getOtherDisease());
					pstmt.setInt(3, diseaseStatusId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateDiseaseStatus: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_DISEASE_STATUS);
					pstmt.setString(1, dsb.getDiseaseStatus());
					pstmt.setString(2, dsb.getOtherDisease());
					pstmt.setInt(3, diseaseStatusId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateDiseaseStatus: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (5): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_DISEASE_STATUS);
					pstmt.setString(1, dsb.getDiseaseStatus());
					pstmt.setString(2, dsb.getOtherDisease());
					pstmt.setInt(3, diseaseStatusId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateDiseaseStatus: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_DISEASE_STATUS_PLASMACELL);
					pstmt.setString(1, dsb.getDiseaseStatus());
					pstmt.setString(2, dsb.getRelapseDisease());
					pstmt.setString(3, dsb.getOtherDisease());
					pstmt.setInt(4, diseaseStatusId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateDiseaseStatus: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_DISEASE_STATUS);
					pstmt.setString(1, dsb.getDiseaseStatus());
					pstmt.setString(2, dsb.getOtherDisease());
					pstmt.setInt(3, diseaseStatusId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateDiseaseStatus: " + sqle.getMessage());
					return false;
				}
				break;
			}
		}
		return true;
	}

	public static boolean updateFollowUp(FollowUpBean fub, Connection connection, int disease, int followUpId) {
		switch (disease) {
			case (1): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_FOLLOWUP);
					pstmt.setString(1, fub.getDateOfEntry());
					pstmt.setString(2, fub.getDateOfVisit());
					pstmt.setString(3, fub.getNotes());
					pstmt.setInt(4, followUpId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateFollowUp: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (2): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_FOLLOWUP);
					pstmt.setString(1, fub.getDateOfEntry());
					pstmt.setString(2, fub.getDateOfVisit());
					pstmt.setString(3, fub.getNotes());
					pstmt.setInt(4, followUpId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateFollowUp: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (3): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_FOLLOWUP);
					pstmt.setString(1, fub.getDateOfEntry());
					pstmt.setString(2, fub.getDateOfVisit());
					pstmt.setString(3, fub.getNotes());
					pstmt.setInt(4, followUpId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateFollowUp: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (4): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_FOLLOWUP);
					pstmt.setString(1, fub.getDateOfEntry());
					pstmt.setString(2, fub.getDateOfVisit());
					pstmt.setString(3, fub.getNotes());
					pstmt.setInt(4, followUpId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateFollowUp: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (5): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_FOLLOWUP);
					pstmt.setString(1, fub.getDateOfEntry());
					pstmt.setString(2, fub.getDateOfVisit());
					pstmt.setString(3, fub.getNotes());
					pstmt.setInt(4, followUpId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateFollowUp: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (6): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_FOLLOWUP);
					pstmt.setString(1, fub.getDateOfEntry());
					pstmt.setString(2, fub.getDateOfVisit());
					pstmt.setString(3, fub.getNotes());
					pstmt.setInt(4, followUpId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateFollowUp: " + sqle.getMessage());
					return false;
				}
				break;
			}
			case (7): {
				try {
					PreparedStatement pstmt = connection.prepareStatement(UPDATE_FOLLOWUP);
					pstmt.setString(1, fub.getDateOfEntry());
					pstmt.setString(2, fub.getDateOfVisit());
					pstmt.setString(3, fub.getNotes());
					pstmt.setInt(4, followUpId);
					pstmt.executeUpdate();
				} catch (SQLException sqle) {
					System.out.println("SQLException -- updateFollowUp: " + sqle.getMessage());
					return false;
				}
				break;
			}
		}
		return true;
	}

	
}
