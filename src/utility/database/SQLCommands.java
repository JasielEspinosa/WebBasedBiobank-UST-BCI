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
	String GENERATE_REPORT_GET_PATIENTS = "Select * from PatientTable where DiseaseStatusID = ? and DateOfEntry >= ? and DateOfEntry <= ?";
	String GENERATE_REPORT_GET_PATIENTS_ALL = "Select * from PatientTable where DateOfEntry >= ? and DateOfEntry <= ? order by DiseaseID asc";
	String GENERATE_REPORT_GET_FOLLOWUP = "Select * from FollowupTable where PatientID = ? and DateOfEntry >= ? and DateOfEntry <= ?";
	
	//audit
	String AUDIT = "INSERT INTO audit VALUES (?,?,?,?)";
	String GET_AUDIT = "Select * from audit";
}
