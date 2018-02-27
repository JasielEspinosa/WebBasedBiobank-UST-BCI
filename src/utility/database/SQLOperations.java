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

}
