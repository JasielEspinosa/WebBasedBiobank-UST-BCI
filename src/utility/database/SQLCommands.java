package utility.database;

public interface SQLCommands {

	// ACCOUNTS

	String LOGIN = "Select * from AccountTable where Username = ? and Password = ?";
	String OLD_PASSWORD = "Select Password from AccountTable where AccountID = ?";
	String GET_PROFILE = "Select Username, LastName, FirstName, MiddleName, RoleID from AccountTable where AccountID = ?";
	String UPDATE_PROFILE = "Update AccountTable set Username = ?, Password = ?, LastName = ?, FirstName = ?, MiddleName = ?"
			+ " where AccountID = ?";
	String UPDATE_PROFILE_NOPASS = "Update AccountTable set Username = ?, LastName = ?, FirstName = ?, MiddleName = ?"
			+ " where AccountID = ?";
	String INSERT_USER = "INSERT INTO AccountTable VALUES (NULL,?,?,?,?,?,?,?)";
	String GET_USERS = "SELECT * FROM AccountTable";
	String DELETE_USER = "DELETE FROM AccountTable where AccountID = ?";
	String GET_PATIENT_LIST = "SELECT * FROM PatientTable inner join generaldatatable on patienttable.GeneralDataID=generaldatatable.GeneralDataID"
			+ " where PatientTable.PatientID = ? or GeneralDataTable."
			+ "LastName = ? or GeneralDataTable.FirstName = ? or GeneralDataTable.MiddleName = ? and PatientTable.DiseaseID = ? and PatientTable.Active = 1";
	String GET_ARCHIVED_PATIENT_LIST = "Select * from PatientTable where Active = 0";
	String ARCHIVE_PATIENT = "Update PatientTable set Active = 0 where PatientID = ?";
	String UNARCHIVE_PATIENT = "Update PatientTable set Active = 1 where PatientID = ?";
	String DELETE_FOLLOWUP = "DELETE FROM FollowupTable where FollowUpID = ?";
	String GET_VISITS = "Select * from FollowupTable where PatientID = ?";
	
	//Generate Report
	String GENERATE_REPORT_GET_PATIENTS = "SELECT PT.*, GD.DateOfEntry FROM PatientTable PT "
			+ "JOIN GeneralDataTable GD ON (GD.GeneralDataID = PT.GeneralDataID) AND (GD.DateOfEntry >= ? AND GD.DateOfEntry <= ?) "
			+ "WHERE PT.DiseaseID = ? ORDER BY GD.DateOfEntry ASC, PT.PatientID ASC";
	String GENERATE_REPORT_GET_PATIENTS_ALL = "SELECT PT.*, GD.DateOfEntry FROM PatientTable PT "
			+ "JOIN GeneralDataTable GD ON (GD.GeneralDataID = PT.GeneralDataID) AND (GD.DateOfEntry >= ? AND GD.DateOfEntry <= ?) "
			+ "ORDER BY PT.DiseaseID ASC, GD.DateOfEntry ASC, PT.PatientID ASC";
	String GENERATE_REPORT_GET_FOLLOWUP = "SELECT PT.*, GD.DateOfEntry, FT.* FROM PatientTable PT "
			+ "JOIN GeneralDataTable GD ON (GD.GeneralDataID = PT.GeneralDataID) AND (GD.DateOfEntry >= ? AND GD.DateOfEntry <= ?) "
			+ "LEFT JOIN FollowupTable FT ON (PT.PatientID = FT.PatientID) "
			+ "WHERE PT.PatientID = ? ORDER BY GD.DateOfEntry ASC, FT.DateOfVisit ASC, PT.PatientID ASC";

	String GET_DISEASE_NAME = "SELECT * FROM DiseaseTable WHERE DiseaseID = ?";

	//audit
	String AUDIT = "INSERT INTO AuditTable VALUES (NULL,?,?,?,?,?,?)";

	String GET_AUDIT = "SELECT * FROM AuditTable WHERE UserID = ? ORDER BY Date ASC";

	String GET_AUDIT_FROM = "SELECT * FROM AuditTable WHERE UserID = ? AND Date >= ? ORDER BY Date ASC";
	String GET_AUDIT_TO = "SELECT * FROM AuditTable WHERE UserID = ? AND Date <= ? ORDER BY Date ASC";
	String GET_AUDIT_FROMTO = "SELECT * FROM AuditTable WHERE UserID = ? AND Date >= ? AND Date <= ? ORDER BY Date ASC";

	String GET_AUDIT_ALL = "SELECT * FROM AuditTable ORDER BY Date ASC";

	String GET_AUDIT_ALL_FROM = "SELECT * FROM AuditTable WHERE Date >= ? ORDER BY Date ASC";
	String GET_AUDIT_ALL_TO = "SELECT * FROM AuditTable WHERE Date <= ? ORDER BY Date ASC";
	String GET_AUDIT_ALL_FROMTO = "SELECT * FROM AuditTable WHERE Date >= ? AND Date <= ? ORDER BY Date ASC";

	
	//charts
	String CHART_GET_PATIENTS = "Select * from PatientTable where DiseaseID = ?";
	String CHART_GET_FOLLOWUP = "Select * from FollowupTable where PatientID = ?";
}
