package utility.database;

import java.sql.*;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import model.*;

public class SQLOperations implements SQLCommands {
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

	public static ResultSet login(AccountBean ab, Connection connection) {
		ResultSet loginSet = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(LOGIN);
			pstmt.setString(1, ab.getUsername());
			pstmt.setString(2, ab.getPassword());
			loginSet = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- login: " + sqle.getMessage());
		}
		return loginSet;
	}

	public static ResultSet getProfile(int accountID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_PROFILE);
			pstmt.setInt(1, accountID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- get Old Password: " + sqle.getMessage());
		}
		return rs;
	}

	public static ResultSet getOldPassword(int accountID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(OLD_PASSWORD);
			pstmt.setInt(1, accountID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- get Old Password: " + sqle.getMessage());
		}
		return rs;
	}

	public static boolean updateProfile(AccountBean ab, int accountID, Connection connection) {
		try {
			PreparedStatement pstmt = connection.prepareStatement(UPDATE_PROFILE);
			pstmt.setString(1, ab.getUsername());
			pstmt.setString(2, ab.getPassword());
			pstmt.setString(3, ab.getLastName());
			pstmt.setString(4, ab.getFirstName());
			pstmt.setString(5, ab.getMiddleName());
			pstmt.setInt(6, accountID);
			pstmt.executeUpdate();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- updateProfile: " + sqle.getMessage());
			return false;
		}

		return true;
	}

	public static boolean addUser(AccountBean ab, Connection connection) {
		try {
			PreparedStatement pstmt = connection.prepareStatement(INSERT_USER);
			System.out.println(ab.getFirstName());
			pstmt.setString(1, ab.getUsername());
			pstmt.setString(2, ab.getPassword());
			pstmt.setString(3, ab.getLastName());
			pstmt.setString(4, ab.getFirstName());
			pstmt.setString(5, ab.getMiddleName());
			pstmt.setInt(6, ab.getRoleId());
			pstmt.setInt(7, 1);
			pstmt.executeUpdate();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- updateProfile: " + sqle.getMessage());
			return false;
		}

		return true;
	}

	public static boolean deleteUser(int accountID, Connection connection) {
		try {
			PreparedStatement pstmt = connection.prepareStatement(DELETE_USER);
			pstmt.setInt(1, accountID);
			pstmt.executeUpdate();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- deleteUser: " + sqle.getMessage());
			return false;
		}

		return true;
	}

	public static boolean updateProfileNoPass(AccountBean ab, int accountID, Connection connection) {
		try {
			PreparedStatement pstmt = connection.prepareStatement(UPDATE_PROFILE_NOPASS);
			pstmt.setString(1, ab.getUsername());
			pstmt.setString(2, ab.getLastName());
			pstmt.setString(3, ab.getFirstName());
			pstmt.setString(4, ab.getMiddleName());
			pstmt.setInt(5, accountID);
			pstmt.executeUpdate();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- updateProfileNoPass: " + sqle.getMessage());
			return false;
		}

		return true;
	}

	public static ResultSet getUsers(Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_USERS);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- get Old Password: " + sqle.getMessage());
		}
		return rs;
	}

	// Get Result Sets

	public static ResultSet getPatientList(String action, String search, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_PATIENT_LIST);
			pstmt.setString(1, search);
			pstmt.setString(2, search);
			pstmt.setString(3, search);
			pstmt.setString(4, search);
			pstmt.setString(5, action);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- get Patient List: " + sqle.getMessage());
		}
		return rs;
	}

	public static ResultSet getArchivedPatientList(Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_ARCHIVED_PATIENT_LIST);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- get  Archived Patient List: " + sqle.getMessage());
		}
		return rs;
	}

	public static boolean archivePatient(int patientID, Connection connection) {
		try {
			PreparedStatement pstmt = connection.prepareStatement(ARCHIVE_PATIENT);
			pstmt.setInt(1, patientID);
			pstmt.executeUpdate();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- archivePatient: " + sqle.getMessage());
			return false;
		}

		return true;
	}

	public static boolean unarchivePatient(int patientID, Connection connection) {
		try {
			PreparedStatement pstmt = connection.prepareStatement(UNARCHIVE_PATIENT);
			pstmt.setInt(1, patientID);
			pstmt.executeUpdate();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- uarchivePatient: " + sqle.getMessage());
			return false;
		}

		return true;
	}

	public static boolean deleteFollowup(int followupId, Connection connection) {
		try {
			PreparedStatement pstmt = connection.prepareStatement(DELETE_FOLLOWUP);
			pstmt.setInt(1, followupId);
			pstmt.executeUpdate();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- deleteFollowup: " + sqle.getMessage());
			return false;
		}

		return true;
	}

	public static ResultSet getVisits(int patientId, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_VISITS);
			pstmt.setInt(1, patientId);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- get Patient List: " + sqle.getMessage());
		}
		return rs;
	}

	public static ResultSet getDiseaseName(int diseaseID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_DISEASE_NAME);
			pstmt.setInt(1, diseaseID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- get Disease Name: " + sqle.getMessage());
		}
		return rs;
	}

	//Generate Report
	public static ResultSet grGetPatients(int diseaseID, String fromDateGenerateReport, String toDateGenerateReport,
			Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GENERATE_REPORT_GET_PATIENTS);
			pstmt.setString(1, fromDateGenerateReport);
			pstmt.setString(2, toDateGenerateReport);
			pstmt.setInt(3, diseaseID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- get Patient List: " + sqle.getMessage());
		}
		return rs;
	}

	public static ResultSet grGetPatientsAll(String fromDateGenerateReport, String toDateGenerateReport, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GENERATE_REPORT_GET_PATIENTS_ALL);
			pstmt.setString(1, fromDateGenerateReport);
			pstmt.setString(2, toDateGenerateReport);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- get Patient List All: " + sqle.getMessage());
		}
		return rs;
	}

	public static ResultSet grGetFollowup(int patientID, String fromDateGenerateReport, String toDateGenerateReport,
			Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GENERATE_REPORT_GET_FOLLOWUP);
			pstmt.setString(1, fromDateGenerateReport);
			pstmt.setString(2, toDateGenerateReport);
			pstmt.setInt(3, patientID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- get Patient Follow Up: " + sqle.getMessage());
		}
		return rs;
	}

	public static boolean addAudit(AuditBean ab, Connection connection) {
		try {
			PreparedStatement pstmt = connection.prepareStatement(AUDIT);
			pstmt.setString(1, ab.getAction());
			pstmt.setString(2, ab.getPerformedOn());
			pstmt.setString(3, ab.getPerformedBy());
			pstmt.setString(4, ab.getDate());
			pstmt.setString(5, ab.getTime());
			pstmt.setInt(6, ab.getUserID());
			pstmt.executeUpdate();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- addAudit: " + sqle.getMessage());
			return false;
		}

		return true;
	}

	public static ResultSet getAudit(int userID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_AUDIT);
			pstmt.setInt(1, userID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- getAudit: " + sqle.getMessage());
		}
		return rs;
	}

	public static ResultSet getAuditFrom(int userID, String fromDateGenerateReport, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_AUDIT_FROM);
			pstmt.setInt(1, userID);
			pstmt.setString(2, fromDateGenerateReport);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- getAuditFrom: " + sqle.getMessage());
		}
		return rs;
	}

	public static ResultSet getAuditTo(int userID, String toDateGenerateReport, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_AUDIT_TO);
			pstmt.setInt(1, userID);
			pstmt.setString(2, toDateGenerateReport);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- getAuditTo: " + sqle.getMessage());
		}
		return rs;
	}

	public static ResultSet getAuditFromTo(int userID, String fromDateGenerateReport, String toDateGenerateReport, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_AUDIT_FROMTO);
			pstmt.setInt(1, userID);
			pstmt.setString(2, fromDateGenerateReport);
			pstmt.setString(3, toDateGenerateReport);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- getAuditFrom: " + sqle.getMessage());
		}
		return rs;
	}

	public static ResultSet getAuditAll(Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_AUDIT_ALL);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- getAuditAll: " + sqle.getMessage());
		}
		return rs;
	}

	public static ResultSet getAuditAllFrom(String fromDateGenerateReport, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_AUDIT_ALL_FROM);
			pstmt.setString(1, fromDateGenerateReport);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- getAuditAll: " + sqle.getMessage());
		}
		return rs;
	}

	public static ResultSet getAuditAllTo(String toDateGenerateReport, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_AUDIT_ALL_TO);
			pstmt.setString(1, toDateGenerateReport);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- getAuditAll: " + sqle.getMessage());
		}
		return rs;
	}

	public static ResultSet getAuditAllFromTo(String fromDateGenerateReport, String toDateGenerateReport, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_AUDIT_ALL_FROMTO);
			pstmt.setString(1, fromDateGenerateReport);
			pstmt.setString(2, toDateGenerateReport);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- getAuditAll: " + sqle.getMessage());
		}
		return rs;
	}
	
	public static ResultSet getChartPatients(int diseaseID,Connection connection,String sortFrom, String sortTo) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(CHART_GET_PATIENTS);
			pstmt.setInt(1, diseaseID);
			pstmt.setString(2, sortFrom);
			pstmt.setString(3, sortTo);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- getAudit: " + sqle.getMessage());
		}
		return rs;
	}
	
	public static ResultSet getChartPatientsAll(int diseaseID,Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(CHART_GET_PATIENTS_ALL);
			pstmt.setInt(1, diseaseID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- getAudit: " + sqle.getMessage());
		}
		return rs;
	}
	
	public static ResultSet getChartPatientsFrom(int diseaseID,Connection connection,String sortFrom) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(CHART_GET_PATIENTS_FROM);
			pstmt.setInt(1, diseaseID);
			pstmt.setString(2, sortFrom);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- getAudit: " + sqle.getMessage());
		}
		return rs;
	}
	
	public static ResultSet getChartPatientsTo(int diseaseID,Connection connection,String sortTo) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(CHART_GET_PATIENTS_TO);
			pstmt.setInt(1, diseaseID);
			pstmt.setString(2, sortTo);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- getAudit: " + sqle.getMessage());
		}
		return rs;
	}
	
	public static ResultSet getChartGeneralData(int generalDataID, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(CHART_GET_GENERAL_DATA);
			pstmt.setInt(1, generalDataID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException - getGeneralData: " + sqle.getMessage());
			return rs;
		}
		return rs;
	}
	
	public static ResultSet getChartFollowup(int action, Connection connection,String sortFrom, String sortTo) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(CHART_GET_FOLLOWUP);
			pstmt.setInt(1, action);
			pstmt.setString(2, sortFrom);
			pstmt.setString(3, sortTo);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- get Patient List: " + sqle.getMessage());
		}
		return rs;
	}
	
	public static ResultSet getChartFollowupAll(int action, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(CHART_GET_FOLLOWUP_ALL);
			pstmt.setInt(1, action);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- get Patient List: " + sqle.getMessage());
		}
		return rs;
	}
	
	public static ResultSet getChartFollowupFrom(int action, Connection connection,String sortFrom) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(CHART_GET_FOLLOWUP_FROM);
			pstmt.setInt(1, action);
			pstmt.setString(2, sortFrom);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- get Patient List: " + sqle.getMessage());
		}
		return rs;
	}
	
	public static ResultSet getChartFollowupTo(int action, Connection connection,String sortTo) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(CHART_GET_FOLLOWUP);
			pstmt.setInt(1, action);
			pstmt.setString(2, sortTo);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- get Patient List: " + sqle.getMessage());
		}
		return rs;
	}
	
	public static ResultSet getAccountID(String username, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_FORGOTPASS_EMAIL);
			pstmt.setString(1, username);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- get Old Account ID: " + sqle.getMessage());
		}
		return rs;
	}
	
	public static ResultSet getToken(String token, Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(GET_TOKEN);
			pstmt.setString(1, token);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- get Old Password: " + sqle.getMessage());
		}
		return rs;
	}
	
	public static boolean updatePassword(int accountID,String password, Connection connection) {
		try {
			PreparedStatement pstmt = connection.prepareStatement(UPDATE_PASSWORD);
			pstmt.setString(1, password);
			pstmt.setInt(2, accountID);
			pstmt.executeUpdate();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- updatepass: " + sqle.getMessage());
			return false;
		}

		return true;
	}
	
	public static boolean insertToken(int accountID,String token,String expiration, Connection connection) {
		try {
			PreparedStatement pstmt = connection.prepareStatement(INSERT_TOKEN);
			pstmt.setInt(1, accountID);
			pstmt.setString(2, token);
			pstmt.setString(3, expiration);
			pstmt.executeUpdate();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- insertToken: " + sqle.getMessage());
			return false;
		}

		return true;
	}
	public static ResultSet getStatus(int patientID,Connection connection,String sortFrom, String sortTo) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(PATIENT_STATS);
			pstmt.setInt(1, patientID);
			pstmt.setString(2, sortFrom);
			pstmt.setString(3, sortTo);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- getAudit: " + sqle.getMessage());
		}
		return rs;
	}
	
	public static ResultSet getStatusAll(int patientID,Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(PATIENT_STATS_ALL);
			pstmt.setInt(1, patientID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- getAudit: " + sqle.getMessage());
		}
		return rs;
	}
	
	public static ResultSet getStatusFrom(int patientID,Connection connection,String sortFrom) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(PATIENT_STATS_FROM);
			pstmt.setInt(1, patientID);
			pstmt.setString(2, sortFrom);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- getAudit: " + sqle.getMessage());
		}
		return rs;
	}
	
	public static ResultSet getStatusTo(int patientID,Connection connection,String sortTo) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(PATIENT_STATS_TO);
			pstmt.setInt(1, patientID);
			pstmt.setString(2, sortTo);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- getAudit: " + sqle.getMessage());
		}
		return rs;
	}
	
	public static ResultSet getFollowupStatus(int patientID,Connection connection,String sortFrom, String sortTo) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(PATIENT_STATS_FOLLOWUP);
			pstmt.setInt(1, patientID);
			pstmt.setString(2, sortFrom);
			pstmt.setString(3, sortTo);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- getAudit: " + sqle.getMessage());
		}
		return rs;
	}
	
	public static ResultSet getFollowupStatusAll(int patientID,Connection connection) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(PATIENT_STATS_FOLLOWUP_ALL);
			pstmt.setInt(1, patientID);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- getAudit: " + sqle.getMessage());
		}
		return rs;
	}
	
	public static ResultSet getFollowupStatusFrom(int patientID,Connection connection,String sortFrom) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(PATIENT_STATS_FOLLOWUP_FROM);
			pstmt.setInt(1, patientID);
			pstmt.setString(2, sortFrom);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- getAudit: " + sqle.getMessage());
		}
		return rs;
	}
	
	public static ResultSet getFollowupStatusTo(int patientID,Connection connection,String sortTo) {
		ResultSet rs = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(PATIENT_STATS_FOLLOWUP_TO);
			pstmt.setInt(1, patientID);
			pstmt.setString(2, sortTo);
			rs = pstmt.executeQuery();
		} catch (SQLException sqle) {
			System.out.println("SQLException -- getAudit: " + sqle.getMessage());
		}
		return rs;
	}
	
}
