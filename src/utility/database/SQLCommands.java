package utility.database;

public interface SQLCommands {

	// ACCOUNTS

	String LOGIN = "Select * from AccountTable where Username = ? and Password = ?";
	String OLD_PASSWORD = "Select Password from AccountTable where AccountID = ?";
	String GET_PROFILE = "Select Username, LastName, FirstName, MiddleName from AccountTable where AccountID = ?";
	String UPDATE_PROFILE = "Update AccountTable set Username = ?, Password = ?, LastName = ?, FirstName = ?, MiddleName = ?"
			+ " where AccountID = ?";
	String UPDATE_PROFILE_NOPASS = "Update AccountTable set Username = ?, LastName = ?, FirstName = ?, MiddleName = ?"
			+ " where AccountID = ?";
	String INSERT_USER = "INSERT INTO AccountTable VALUES (NULL,?,?,?,?,?,?,?)";
	String GET_USERS = "SELECT * FROM AccountTable";
	String DELETE_USER = "DELETE FROM AccountTable where AccountID = ?";
	String GET_PATIENT_LIST = "SELECT * FROM PatientTable inner join generaldatatable on patienttable.GeneralDataID=generaldatatable.GeneralDataID"
			+ " where PatientTable.PatientID = ? or GeneralDataTable."
			+ "LastName = ? or GeneralDataTable.FirstName = ? or GeneralDataTable.MiddleName = ? and PatientTable.DiseaseID = ?";
	String ARCHIVE_PATIENT = "Update PatientTable set Active = 0 where PatientID = ?";

}
