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

}
