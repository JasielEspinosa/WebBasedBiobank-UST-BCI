package utility.database;

public interface SQLCommands {

	// ACCOUNTS

	String key = "il0v3c@nCer4lif3";

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
	String GET_VISITS = "Select *, CONVERT(AES_DECRYPT(DateOfVisit,'" + key
			+ "'), DATE) as DateOfVisitDec FROM FollowupTable where PatientID = ?";

	// Generate Report
	String GENERATE_REPORT_GET_PATIENTS = "SELECT PT.*, CONVERT(AES_DECRYPT(GD.DateOfEntry,'" + key
			+ "'), DATE) as DateOfEntryDec FROM PatientTable PT JOIN GeneralDataTable GD ON (GD.GeneralDataID = PT.GeneralDataID) "
			+ "AND CONVERT(AES_DECRYPT(GD.DateOfEntry,'" + key
			+ "'), DATE) >= ? AND CONVERT(AES_DECRYPT(GD.DateOfEntry,'" + key + "'), DATE) <= ? "
			+ "WHERE PT.DiseaseID = ? ORDER BY CONVERT(AES_DECRYPT(GD.DateOfEntry,'" + key + "'), DATE) ASC";
	String GENERATE_REPORT_GET_PATIENTS_ALL = "SELECT PT.*, CONVERT(AES_DECRYPT(GD.DateOfEntry,'" + key
			+ "'), DATE) as DateOfEntryDec FROM PatientTable PT JOIN GeneralDataTable GD ON (GD.GeneralDataID = PT.GeneralDataID) AND CONVERT(AES_DECRYPT(GD.DateOfEntry,'"
			+ key + "'), DATE) >= ? AND CONVERT(AES_DECRYPT(GD.DateOfEntry,'" + key
			+ "'), DATE) <= ? ORDER BY PT.DiseaseID ASC, CONVERT(AES_DECRYPT(GD.DateOfEntry,'" + key + "'), DATE) ASC";
	String GENERATE_REPORT_GET_FOLLOWUP = "SELECT PT.*, CONVERT(AES_DECRYPT(GD.DateOfEntry,'" + key
			+ "'), DATE) as DateOfEntryDec, "
			+ "FT.* FROM PatientTable PT JOIN GeneralDataTable GD ON (GD.GeneralDataID = PT.GeneralDataID) "
			+ "AND CONVERT(AES_DECRYPT(GD.DateOfEntry,'" + key
			+ "'), DATE) >= ? AND CONVERT(AES_DECRYPT(GD.DateOfEntry,'" + key + "'), DATE) <= ? "
			+ "LEFT JOIN FollowupTable FT ON (PT.PatientID = FT.PatientID) WHERE PT.PatientID = ? ORDER BY CONVERT(AES_DECRYPT(GD.DateOfEntry,'"
			+ key + "'), DATE) ASC, CONVERT(AES_DECRYPT(FT.DateOfVisit,'" + key + "'), DATE) ASC";

	String GET_DISEASE_NAME = "SELECT * FROM DiseaseTable WHERE DiseaseID = ?";

	// audit
	String AUDIT = "INSERT INTO AuditTable VALUES (NULL,?,?,?,AES_ENCRYPT(?, '" + key + "'),?,?)";

	String GET_AUDIT = "SELECT *, AES_DECRYPT(Date, '" + key
			+ "') as DateDec FROM AuditTable WHERE UserID = ? ORDER BY AES_DECRYPT(Date,'" + key + "') ASC";

	String GET_AUDIT_FROM = "SELECT *, AES_DECRYPT(Date, '" + key
			+ "') as DateDec FROM AuditTable WHERE UserID = ? AND AES_DECRYPT(Date,'" + key
			+ "') >= ? ORDER BY AES_DECRYPT(Date,'" + key + "') ASC";
	String GET_AUDIT_TO = "SELECT *, AES_DECRYPT(Date, '" + key
			+ "') as DateDec FROM AuditTable WHERE UserID = ? AND AES_DECRYPT(Date,'" + key
			+ "') <= ? ORDER BY AES_DECRYPT(Date,'" + key + "') ASC";
	String GET_AUDIT_FROMTO = "SELECT *, AES_DECRYPT(Date, '" + key
			+ "') as DateDec FROM AuditTable WHERE UserID = ? AND AES_DECRYPT(Date,'" + key
			+ "') >= ? AND AES_DECRYPT(Date,'" + key + "') <= ? ORDER BY AES_DECRYPT(Date,'" + key + "') ASC";

	String GET_AUDIT_ALL = "SELECT *, AES_DECRYPT(Date, '" + key + "') as DateDec FROM AuditTable ORDER BY Date ASC";

	String GET_AUDIT_ALL_FROM = "SELECT *, AES_DECRYPT(Date, '" + key
			+ "') as DateDec FROM AuditTable WHERE AES_DECRYPT(Date,'" + key + "') >= ? ORDER BY AES_DECRYPT(Date,'"
			+ key + "') ASC";
	String GET_AUDIT_ALL_TO = "SELECT *, AES_DECRYPT(Date, '" + key
			+ "') as DateDec FROM AuditTable WHERE AES_DECRYPT(Date,'" + key + "') <= ? ORDER BY AES_DECRYPT(Date,'"
			+ key + "') ASC";
	String GET_AUDIT_ALL_FROMTO = "SELECT *, AES_DECRYPT(Date, '" + key
			+ "') as DateDec FROM AuditTable WHERE AES_DECRYPT(Date,'" + key + "') >= ? AND AES_DECRYPT(Date,'" + key
			+ "') <= ? ORDER BY AES_DECRYPT(Date,'" + key + "') ASC";

	// charts
	String CHART_GET_PATIENTS = "Select *, AES_DECRYPT(DateOfEntry,'" + key
			+ "') as DateOfEntryDec from PatientTable inner join generaldatatable "
			+ "on patienttable.GeneralDataID=generaldatatable.GeneralDataID where PatientTable.DiseaseID = ? and AES_DECRYPT(GeneralDataTable.DateOfEntry,'"
			+ key + "') >= ? and AES_DECRYPT(GeneralDataTable.DateOfEntry,'" + key + "') <= ?";
	String CHART_GET_PATIENTS_ALL = "Select *, AES_DECRYPT(DateOfEntry,'" + key
			+ "') as DateOfEntryDec from PatientTable inner join generaldatatable "
			+ "on patienttable.GeneralDataID=generaldatatable.GeneralDataID where PatientTable.DiseaseID = ?";
	String CHART_GET_PATIENTS_FROM = "Select *, AES_DECRYPT(DateOfEntry,'" + key
			+ "') as DateOfEntryDec from PatientTable inner join generaldatatable "
			+ "on patienttable.GeneralDataID=generaldatatable.GeneralDataID where PatientTable.DiseaseID = ? and AES_DECRYPT(GeneralDataTable.DateOfEntry,'"
			+ key + "') >= ?";
	String CHART_GET_PATIENTS_TO = "Select *, AES_DECRYPT(DateOfEntry,'" + key
			+ "') as DateOfEntryDec from PatientTable inner join generaldatatable "
			+ "on patienttable.GeneralDataID=generaldatatable.GeneralDataID where PatientTable.DiseaseID = ? and AES_DECRYPT(GeneralDataTable.DateOfEntry,'"
			+ key + "') <= ?";

	String CHART_GET_FOLLOWUP = "Select *, AES_DECRYPT(DateOfEntry,'" + key
			+ "') as DateOfEntryDec from FollowupTable inner join PatientTable on FollowupTable.PatientID=PatientTable.PatientID where "
			+ "PatientTable.DiseaseID = ? and AES_DECRYPT(FollowupTable.DateOfEntry,'" + key
			+ "') >= ? and AES_DECRYPT(FollowupTable.DateOfEntry,'" + key + "') <= ?";
	String CHART_GET_FOLLOWUP_ALL = "Select *, AES_DECRYPT(DateOfEntry,'" + key
			+ "') as DateOfEntryDec from FollowupTable inner join PatientTable on FollowupTable.PatientID=PatientTable.PatientID where "
			+ "PatientTable.DiseaseID = ?";
	String CHART_GET_FOLLOWUP_FROM = "Select *, AES_DECRYPT(DateOfEntry,'" + key
			+ "') as DateOfEntryDec from FollowupTable inner join PatientTable on FollowupTable.PatientID=PatientTable.PatientID where "
			+ "PatientTable.DiseaseID = ? and AES_DECRYPT(FollowupTable.DateOfEntry,'" + key + "') >= ?";
	String CHART_GET_FOLLOWUP_TO = "Select *, AES_DECRYPT(DateOfEntry,'" + key
			+ "') as DateOfEntryDec from FollowupTable inner join PatientTable on FollowupTable.PatientID=PatientTable.PatientID where "
			+ "PatientTable.DiseaseID = ? and AES_DECRYPT(FollowupTable.DateOfEntry,'" + key + "') <= ?";

	//String CHART_GET_GENERAL_DATA = "SELECT * FROM GeneralDataTable WHERE GeneralDataID = ?";


	String CHART_GET_GENERAL_DATA = "SELECT *, AES_DECRYPT(DateOfBirth,'" + key + "') as DateOfBirthDec FROM GeneralDataTable WHERE GeneralDataID = ?";

	
	
	// forgot pass
	String GET_FORGOTPASS_EMAIL = "Select AccountID from AccountTable where UserName = ?";
	String GET_TOKEN = "Select *,DATE_FORMAT(`expiration`, '%Y-%m-%d %H:%i:%S') AS `expirationNoMili` from TokenTable where Token = ?";
	String UPDATE_PASSWORD = "Update AccountTable set Password = ? where AccountID = ?";
	String INSERT_TOKEN = "Insert into TokenTable values(?,?,?)";

	String PATIENT_STATS = "Select *, AES_DECRYPT(DateOfEntry,'" + key
			+ "') as DateOfEntryDec from PatientTable inner join generaldatatable "
			+ "on patienttable.GeneralDataID=generaldatatable.GeneralDataID where PatientTable.PatientID = ? and AES_DECRYPT(GeneralDataTable.DateOfEntry,'"
			+ key + "') >= ? and AES_DECRYPT(GeneralDataTable.DateOfEntry,'" + key + "') <= ? "
			+ "order by AES_DECRYPT(GeneralDataTable.DateOfEntry,'" + key + "') asc";
	String PATIENT_STATS_ALL = "Select *, AES_DECRYPT(DateOfEntry,'" + key
			+ "') as DateOfEntryDec from PatientTable inner join generaldatatable "
			+ "on patienttable.GeneralDataID=generaldatatable.GeneralDataID where PatientTable.PatientID = ? "
			+ "order by AES_DECRYPT(GeneralDataTable.DateOfEntry,'" + key + "') asc";
	String PATIENT_STATS_FROM = "Select *, AES_DECRYPT(DateOfEntry,'" + key
			+ "') as DateOfEntryDec from PatientTable inner join generaldatatable "
			+ "on patienttable.GeneralDataID=generaldatatable.GeneralDataID where PatientTable.PatientID = ? and AES_DECRYPT(GeneralDataTable.DateOfEntry,'"
			+ key + "') >= ? " + "order by AES_DECRYPT(GeneralDataTable.DateOfEntry,'" + key
			+ "') asc";
	String PATIENT_STATS_TO = "Select *, AES_DECRYPT(DateOfEntry,'" + key
			+ "') as DateOfEntryDec from PatientTable inner join generaldatatable "
			+ "on patienttable.GeneralDataID=generaldatatable.GeneralDataID where PatientTable.PatientID = ? and AES_DECRYPT(GeneralDataTable.DateOfEntry,'"
			+ key + "') <= ? " + "order by AES_DECRYPT(GeneralDataTable.DateOfEntry,'" + key
			+ "') asc";

	String PATIENT_STATS_FOLLOWUP = "Select *, AES_DECRYPT(DateOfEntry,'" + key
			+ "') as DateOfEntryDec from FollowupTable inner join PatientTable on FollowupTable.PatientID=PatientTable.PatientID where "
			+ "PatientTable.PatientID = ? and AES_DECRYPT(FollowupTable.DateOfEntry,'" + key
			+ "') >= ? and AES_DECRYPT(FollowupTable.DateOfEntry,'" + key
			+ "') <= ? order by AES_DECRYPT(FollowupTable.DateOfEntry,'" + key + "') asc";
	String PATIENT_STATS_FOLLOWUP_ALL = "Select *, AES_DECRYPT(DateOfEntry,'" + key
			+ "') as DateOfEntryDec from FollowupTable inner join PatientTable on FollowupTable.PatientID=PatientTable.PatientID where "
			+ "PatientTable.PatientID = ? order by AES_DECRYPT(FollowupTable.DateOfEntry,'" + key
			+ "') asc";
	String PATIENT_STATS_FOLLOWUP_FROM = "Select *, AES_DECRYPT(DateOfEntry,'" + key
			+ "') as DateOfEntryDec from FollowupTable inner join PatientTable on FollowupTable.PatientID=PatientTable.PatientID where "
			+ "PatientTable.PatientID = ? and AES_DECRYPT(FollowupTable.DateOfEntry,'" + key
			+ "') >= ? order by AES_DECRYPT(FollowupTable.DateOfEntry,'" + key + "') asc";
	String PATIENT_STATS_FOLLOWUP_TO = "Select *, AES_DECRYPT(DateOfEntry,'" + key
			+ "') as DateOfEntryDec from FollowupTable inner join PatientTable on FollowupTable.PatientID=PatientTable.PatientID where "
			+ "PatientTable.PatientID = ? and AES_DECRYPT(FollowupTable.DateOfEntry,'" + key
			+ "') <= ? order by AES_DECRYPT(FollowupTable.DateOfEntry,'" + key + "') asc";
}
