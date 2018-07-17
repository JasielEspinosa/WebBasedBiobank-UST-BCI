package utility.database;

public interface SQLCommands {
	
	// ACCOUNTS
	
	String key = "il0v3c@nCer4lif3";
	
	String LOGIN = "Select * from accounttable where Username = ? and Password = ?";
	String OLD_PASSWORD = "Select Password from accounttable where AccountID = ?";
	//String GET_PROFILE = "Select Username, LastName, FirstName, MiddleName, RoleID from accounttable where AccountID = ?";
	String GET_PROFILE = "Select * from accounttable where AccountID = ?";
	String UPDATE_USER = "Update accounttable set Username = ?, Password = ?, LastName = ?, FirstName = ?, MiddleName = ?, RoleID = ? where AccountID = ?";
	String UPDATE_PROFILE = "Update accounttable set Username = ?, Password = ?, LastName = ?, FirstName = ?, MiddleName = ? where AccountID = ?";
	String UPDATE_PROFILE_NOPASS = "Update accounttable set Username = ?, LastName = ?, FirstName = ?, MiddleName = ?" + " where AccountID = ?";
	String INSERT_USER = "INSERT INTO accounttable VALUES (NULL,?,?,?,?,?,?,?)";
	String GET_USERS = "SELECT * FROM accounttable";
	String GET_USERNAMES = "SELECT * FROM accounttable where Username = ?";
	String ARCHIVE_USER = "Update accounttable set Active = 0 where AccountID = ?";
	String UNARCHIVE_USER = "Update accounttable set Active = 1 where AccountID = ?";
	String GET_PATIENT_LIST = "SELECT *, AES_DECRYPT(UNHEX(generaldatatable.LastName), '" + key + "') as LastNameDec, AES_DECRYPT(UNHEX(generaldatatable.FirstName), '" + key + "') as FirstNameDec, AES_DECRYPT(UNHEX(generaldatatable.MiddleName), '" + key + "') as MiddleNameDec FROM patienttable inner join generaldatatable on patienttable.GeneralDataID=generaldatatable.GeneralDataID  where patienttable.PatientID LIKE ? or AES_DECRYPT(UNHEX(generaldatatable.LastName), '" + key + "') LIKE ?  or AES_DECRYPT(UNHEX(generaldatatable.FirstName), '" + key + "') LIKE ? or AES_DECRYPT(UNHEX(generaldatatable.MiddleName), '" + key + "') LIKE ?  and patienttable.DiseaseID LIKE ? and patienttable.Active = 1";
	String GET_ARCHIVED_PATIENT_LIST = "Select *, AES_DECRYPT(UNHEX(generaldatatable.LastName), '" + key + "') as LastNameDec, AES_DECRYPT(UNHEX(generaldatatable.FirstName), '" + key + "') as FirstNameDec, AES_DECRYPT(UNHEX(generaldatatable.MiddleName), '" + key + "') as MiddleNameDec from patienttable inner join generaldatatable on patienttable.GeneralDataID=generaldatatable.GeneralDataID where Active = 0";
	String ARCHIVE_PATIENT = "Update patienttable set Active = 0 where PatientID = ?";
	String UNARCHIVE_PATIENT = "Update patienttable set Active = 1 where PatientID = ?";
	String DELETE_FOLLOWUP = "DELETE FROM followuptable where FollowUpID = ?";
	String GET_VISITS = "Select *, CONVERT(AES_DECRYPT(UNHEX(DateOfVisit),'" + key + "'), DATE) as DateOfVisitDec FROM followuptable where PatientID = ?";
	
	// Generate Report
	String GENERATE_REPORT_GET_PATIENTS = "SELECT PT.*, CONVERT(AES_DECRYPT(UNHEX(GD.DateOfEntry),'" + key + "'), DATE) as DateOfEntryDec FROM patienttable PT JOIN generaldatatable GD ON (GD.GeneralDataID = PT.GeneralDataID) " + "AND CONVERT(AES_DECRYPT(UNHEX(GD.DateOfEntry),'" + key + "'), DATE) >= ? AND CONVERT(AES_DECRYPT(UNHEX(GD.DateOfEntry),'" + key + "'), DATE) <= ? " + "WHERE PT.DiseaseID = ? ORDER BY CONVERT(AES_DECRYPT(UNHEX(GD.DateOfEntry),'" + key + "'), DATE) ASC";
	String GENERATE_REPORT_GET_PATIENTS_ALL = "SELECT PT.*, CONVERT(AES_DECRYPT(UNHEX(GD.DateOfEntry),'" + key + "'), DATE) as DateOfEntryDec FROM patienttable PT JOIN generaldatatable GD ON (GD.GeneralDataID = PT.GeneralDataID) AND CONVERT(AES_DECRYPT(UNHEX(GD.DateOfEntry),'" + key + "'), DATE) >= ? AND CONVERT(AES_DECRYPT(UNHEX(GD.DateOfEntry),'" + key + "'), DATE) <= ? ORDER BY PT.DiseaseID ASC, CONVERT(AES_DECRYPT(UNHEX(GD.DateOfEntry),'" + key + "'), DATE) ASC";
	String GENERATE_REPORT_GET_FOLLOWUP = "SELECT PT.*, CONVERT(AES_DECRYPT(UNHEX(GD.DateOfEntry),'" + key + "'), DATE) as DateOfEntryDec, " + "FT.* FROM patienttable PT JOIN generaldatatable GD ON (GD.GeneralDataID = PT.GeneralDataID) " + "AND CONVERT(AES_DECRYPT(UNHEX(GD.DateOfEntry),'" + key + "'), DATE) >= ? AND CONVERT(AES_DECRYPT(UNHEX(GD.DateOfEntry),'" + key + "'), DATE) <= ? " + "LEFT JOIN followuptable FT ON (PT.PatientID = FT.PatientID) WHERE PT.PatientID = ? ORDER BY CONVERT(AES_DECRYPT(UNHEX(GD.DateOfEntry),'" + key + "'), DATE) ASC, CONVERT(AES_DECRYPT(FT.DateOfVisit,'" + key + "'), DATE) ASC";
	
	String GET_DISEASE_NAME = "SELECT * FROM diseasetable WHERE DiseaseID = ?";
	
	// audit
	String AUDIT = "INSERT INTO audittable VALUES (NULL,?,?,?,HEX(AES_ENCRYPT(?, '" + key + "')),?,?)";
	
	String GET_AUDIT = "SELECT *, AES_DECRYPT(UNHEX(Date), '" + key + "') as DateDec FROM audittable WHERE UserID = ? ORDER BY AES_DECRYPT(UNHEX(Date),'" + key + "') ASC";
	
	String GET_AUDIT_FROM = "SELECT *, AES_DECRYPT(UNHEX(Date), '" + key + "') as DateDec FROM audittable WHERE UserID = ? AND AES_DECRYPT(UNHEX(Date),'" + key + "') >= ? ORDER BY AES_DECRYPT(UNHEX(Date),'" + key + "') ASC";
	String GET_AUDIT_TO = "SELECT *, AES_DECRYPT(UNHEX(Date), '" + key + "') as DateDec FROM audittable WHERE UserID = ? AND AES_DECRYPT(UNHEX(Date),'" + key + "') <= ? ORDER BY AES_DECRYPT(UNHEX(Date),'" + key + "') ASC";
	String GET_AUDIT_FROMTO = "SELECT *, AES_DECRYPT(UNHEX(Date), '" + key + "') as DateDec FROM audittable WHERE UserID = ? AND AES_DECRYPT(UNHEX(Date),'" + key + "') >= ? AND AES_DECRYPT(UNHEX(Date),'" + key + "') <= ? ORDER BY AES_DECRYPT(UNHEX(Date),'" + key + "') ASC";
	
	String GET_AUDIT_ALL = "SELECT *, AES_DECRYPT(UNHEX(Date), '" + key + "') as DateDec FROM audittable ORDER BY Date ASC";
	
	String GET_AUDIT_ALL_FROM = "SELECT *, AES_DECRYPT(UNHEX(Date), '" + key + "') as DateDec FROM audittable WHERE AES_DECRYPT(UNHEX(Date),'" + key + "') >= ? ORDER BY AES_DECRYPT(UNHEX(Date),'" + key + "') ASC";
	String GET_AUDIT_ALL_TO = "SELECT *, AES_DECRYPT(UNHEX(Date), '" + key + "') as DateDec FROM audittable WHERE AES_DECRYPT(UNHEX(Date),'" + key + "') <= ? ORDER BY AES_DECRYPT(UNHEX(Date),'" + key + "') ASC";
	String GET_AUDIT_ALL_FROMTO = "SELECT *, AES_DECRYPT(UNHEX(Date), '" + key + "') as DateDec FROM audittable WHERE AES_DECRYPT(UNHEX(Date),'" + key + "') >= ? AND AES_DECRYPT(UNHEX(Date),'" + key + "') <= ? ORDER BY AES_DECRYPT(UNHEX(Date),'" + key + "') ASC";
	
	// charts
	String CHART_GET_PATIENTS = "Select *, AES_DECRYPT(UNHEX(DateOfEntry),'" + key + "') as DateOfEntryDec from patienttable inner join generaldatatable " + "on patienttable.GeneralDataID=generaldatatable.GeneralDataID where patienttable.DiseaseID = ? and AES_DECRYPT(UNHEX(generaldatatable.DateOfEntry),'" + key + "') >= ? and AES_DECRYPT(UNHEX(generaldatatable.DateOfEntry),'" + key + "') <= ?";
	String CHART_GET_PATIENTS_ALL = "Select *, AES_DECRYPT(UNHEX(DateOfEntry),'" + key + "') as DateOfEntryDec from patienttable inner join generaldatatable " + "on patienttable.GeneralDataID=generaldatatable.GeneralDataID where patienttable.DiseaseID = ?";
	String CHART_GET_PATIENTS_FROM = "Select *, AES_DECRYPT(UNHEX(DateOfEntry),'" + key + "') as DateOfEntryDec from patienttable inner join generaldatatable " + "on patienttable.GeneralDataID=generaldatatable.GeneralDataID where patienttable.DiseaseID = ? and AES_DECRYPT(UNHEX(generaldatatable.DateOfEntry),'" + key + "') >= ?";
	String CHART_GET_PATIENTS_TO = "Select *, AES_DECRYPT(UNHEX(DateOfEntry),'" + key + "') as DateOfEntryDec from patienttable inner join generaldatatable " + "on patienttable.GeneralDataID=generaldatatable.GeneralDataID where patienttable.DiseaseID = ? and AES_DECRYPT(UNHEX(generaldatatable.DateOfEntry),'" + key + "') <= ?";
	
	String CHART_GET_FOLLOWUP = "Select *, AES_DECRYPT(UNHEX(DateOfEntry),'" + key + "') as DateOfEntryDec from followuptable inner join patienttable on followuptable.PatientID=patienttable.PatientID where " + "patienttable.DiseaseID = ? and AES_DECRYPT(followuptable.DateOfEntry,'" + key + "') >= ? and AES_DECRYPT(followuptable.DateOfEntry,'" + key + "') <= ?";
	String CHART_GET_FOLLOWUP_ALL = "Select *, AES_DECRYPT(UNHEX(DateOfEntry),'" + key + "') as DateOfEntryDec from followuptable inner join patienttable on followuptable.PatientID=patienttable.PatientID where " + "patienttable.DiseaseID = ?";
	String CHART_GET_FOLLOWUP_FROM = "Select *, AES_DECRYPT(UNHEX(DateOfEntry),'" + key + "') as DateOfEntryDec from followuptable inner join patienttable on followuptable.PatientID=patienttable.PatientID where " + "patienttable.DiseaseID = ? and AES_DECRYPT(followuptable.DateOfEntry,'" + key + "') >= ?";
	String CHART_GET_FOLLOWUP_TO = "Select *, AES_DECRYPT(UNHEX(DateOfEntry),'" + key + "') as DateOfEntryDec from followuptable inner join patienttable on followuptable.PatientID=patienttable.PatientID where " + "patienttable.DiseaseID = ? and AES_DECRYPT(followuptable.DateOfEntry,'" + key + "') <= ?";
	
	//String CHART_GET_GENERAL_DATA = "SELECT * FROM generaldatatable WHERE GeneralDataID = ?";
	
	String CHART_GET_GENERAL_DATA = "SELECT *, AES_DECRYPT(UNHEX(DateOfBirth), '" + key + "') as DateOfBirthDec FROM generaldatatable WHERE GeneralDataID = ?";
	
	// forgot pass
	String GET_FORGOTPASS_EMAIL = "Select AccountID from accounttable where UserName = ?";
	String GET_TOKEN = "Select *,DATE_FORMAT(`expiration`, '%Y-%m-%d %H:%i:%S') AS `expirationNoMili` from tokentable where Token = ?";
	String UPDATE_PASSWORD = "Update accounttable set Password = ? where AccountID = ?";
	String INSERT_TOKEN = "Insert into tokentable values(?,?,?)";
	
	String PATIENT_STATS = "Select *, AES_DECRYPT(UNHEX(DateOfEntry),'" + key + "') as DateOfEntryDec from patienttable inner join generaldatatable " + "on patienttable.GeneralDataID=generaldatatable.GeneralDataID where patienttable.PatientID = ? and AES_DECRYPT(UNHEX(generaldatatable.DateOfEntry),'" + key + "') >= ? and AES_DECRYPT(UNHEX(generaldatatable.DateOfEntry),'" + key + "') <= ? " + "order by AES_DECRYPT(UNHEX(generaldatatable.DateOfEntry),'" + key + "') asc";
	String PATIENT_STATS_ALL = "Select *, AES_DECRYPT(UNHEX(DateOfEntry),'" + key + "') as DateOfEntryDec from patienttable inner join generaldatatable " + "on patienttable.GeneralDataID=generaldatatable.GeneralDataID where patienttable.PatientID = ? " + "order by AES_DECRYPT(UNHEX(generaldatatable.DateOfEntry),'" + key + "') asc";
	String PATIENT_STATS_FROM = "Select *, AES_DECRYPT(UNHEX(DateOfEntry),'" + key + "') as DateOfEntryDec from patienttable inner join generaldatatable " + "on patienttable.GeneralDataID=generaldatatable.GeneralDataID where patienttable.PatientID = ? and AES_DECRYPT(UNHEX(generaldatatable.DateOfEntry),'" + key + "') >= ? " + "order by AES_DECRYPT(UNHEX(generaldatatable.DateOfEntry),'" + key + "') asc";
	String PATIENT_STATS_TO = "Select *, AES_DECRYPT(UNHEX(DateOfEntry),'" + key + "') as DateOfEntryDec from patienttable inner join generaldatatable " + "on patienttable.GeneralDataID=generaldatatable.GeneralDataID where patienttable.PatientID = ? and AES_DECRYPT(UNHEX(generaldatatable.DateOfEntry),'" + key + "') <= ? " + "order by AES_DECRYPT(UNHEX(generaldatatable.DateOfEntry),'" + key + "') asc";
	
	String PATIENT_STATS_FOLLOWUP = "Select *, AES_DECRYPT(UNHEX(DateOfEntry),'" + key + "') as DateOfEntryDec from followuptable inner join patienttable on followuptable.PatientID=patienttable.PatientID where " + "patienttable.PatientID = ? and AES_DECRYPT(followuptable.DateOfEntry,'" + key + "') >= ? and AES_DECRYPT(followuptable.DateOfEntry,'" + key + "') <= ? order by AES_DECRYPT(followuptable.DateOfEntry,'" + key + "') asc";
	String PATIENT_STATS_FOLLOWUP_ALL = "Select *, AES_DECRYPT(UNHEX(DateOfEntry),'" + key + "') as DateOfEntryDec from followuptable inner join patienttable on followuptable.PatientID=patienttable.PatientID where " + "patienttable.PatientID = ? order by AES_DECRYPT(followuptable.DateOfEntry,'" + key + "') asc";
	String PATIENT_STATS_FOLLOWUP_FROM = "Select *, AES_DECRYPT(UNHEX(DateOfEntry),'" + key + "') as DateOfEntryDec from followuptable inner join patienttable on followuptable.PatientID=patienttable.PatientID where " + "patienttable.PatientID = ? and AES_DECRYPT(followuptable.DateOfEntry,'" + key + "') >= ? order by AES_DECRYPT(followuptable.DateOfEntry,'" + key + "') asc";
	String PATIENT_STATS_FOLLOWUP_TO = "Select *, AES_DECRYPT(UNHEX(DateOfEntry),'" + key + "') as DateOfEntryDec from followuptable inner join patienttable on followuptable.PatientID=patienttable.PatientID where " + "patienttable.PatientID = ? and AES_DECRYPT(followuptable.DateOfEntry,'" + key + "') <= ? order by AES_DECRYPT(followuptable.DateOfEntry,'" + key + "') asc";
}
