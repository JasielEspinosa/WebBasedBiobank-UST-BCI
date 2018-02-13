package utility.database;

public interface SQLCommandsFollowUp {

	// FOLLOW UP QUERIES

	String INSERT_MEDICAL_EVENTS = "INSERT INTO MedicalEventsTable(MedicalEventsID, HematologicMalignancy, OtherDiseaseMedication, ProcedureIntervention, Chemotherapy) VALUES (NULL, ?, ?, ?, ?)";
	String INSERT_MEDICAL_EVENTS_COAGULATION = "INSERT INTO MedicalEventsTable(MedicalEventsID, FactorConcentrate, FactorConcentrateDates, FactorConcentrateDose, ProcedureIntervention) VALUES (NULL, ?, ?, ?, ?)";
	String INSERT_MEDICAL_EVENTS_PLATELETCELL = "INSERT INTO MedicalEventsTable(MedicalEventsID, OtherDiseaseMedication, ProcedureIntervention, Chemotherapy) VALUES (NULL, ?, ?, ?)";
	String UPDATE_MEDICAL_EVENTS = "UPDATE MedicalEventsTable SET HematologicMalignancy=?, OtherDiseaseMedication=?, ProcedureIntervention=?, Chemotherapy=? WHERE  MedicalEventsID =?";
	String UPDATE_MEDICAL_EVENTS_COAGULATION = "UPDATE MedicalEventsTable SET FactorConcentrate=?, FactorConcentrateDates=?, FactorConcentrateDose=?, ProcedureIntervention=? WHERE  MedicalEventsID=?";
	String UPDATE_MEDICAL_EVENTS_PLATELETCELL = "UPDATE MedicalEventsTable SET OtherDiseaseMedication=?, ProcedureIntervention=?, Chemotherapy=? WHERE  MedicalEventsID=?";

	String INSERT_PHYSICAL_EXAM = "INSERT INTO PhysicalExamTable(PhysicalExamID, Weight, ECOG) VALUES (NULL, ?, ?) ";
	String UPDATE_PHYSICAL_EXAM = "UPDATE PhysicalExamTable SET Weight=?, ECOG=? WHERE PhysicalExamID=?";

	String INSERT_CLINICAL_DATA = "INSERT INTO ClinicalDataTable(ClinicalDataID,CurrentSymptoms, PhysicalExamID) "
			+ "VALUES (NULL, ?, (SELECT MAX(PhysicalExamID) FROM PhysicalExamTable)) ";
	String UPDATE_CLINICAL_DATA = "UPDATE ClinicalDataTable SET CurrentSymptoms=? WHERE ClinicalDataID=?";

	String INSERT_HEMATOLOGY = "INSERT INTO HematologyTable VALUES (NULL,?,?,?,?,?,?,?,?,?,?,?,?) ";
	String UPDATE_HEMATOLOGY = "UPDATE HematologyTable SET Hemoglobin=?, Hematocrit=?, WhiteBloodCells=?, Neutrophils=?, Lymphocytes=?, Monocytes=?, Eosinophils=?, Basophils=?, Myelocytes=?, Metamyelocytes=?, Blasts=?, PlateletCount=? WHERE HematologyID=? ";

	String INSERT_OTHER_LABORATORIES_AAPHSMDS = "INSERT INTO OtherLaboratoriesTable VALUES (NULL,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	String UPDATE_OTHER_LABORATORIES_AAPHSMDS = "UPDATE OtherLaboratoriesTable SET "
			+ "CreatinineOther=?, UricAcid=?, ReticulocyteCount=?, SerumIron=?, IronBindingCapacity=?, SerumFerritin=?, DirectAntiglobulin=?, IndirectAntiglobulin=?, SGOT=?, SGPT=?, LDH=?, ScreenTestHepatitis=?,ScreenTestEBVCytomegalovirusHIV=?, ErythropeitinLevel=?, SerumFolicAcid=?, SerumB12=?, TSH=? WHERE OtherLaboratoriesID=?";

	String INSERT_BLOOD_CHEMISTRY_LYMPHOMA = "INSERT INTO BloodChemistryTable(BloodChemistryID, LDH, ESR) VALUES (NULL, ?, ?) ";
	String UPDATE_BLOOD_CHEMISTRY_LYMPHOMA = "UPDATE BloodChemistryTable SET LDH=?, ESR=? WHERE BloodChemistryID=?";

	String INSERT_BLOOD_CHEMISTRY_PLASMACELL = "INSERT INTO BloodChemistryTable(BloodChemistryID, Creatinine, iCa, TotalProtein, Albumin,  Globulin) VALUES (NULL, ?, ?, ?, ?, ?) ";
	String UPDATE_BLOOD_CHEMISTRY_PLASMACELL = "UPDATE BloodChemistryTable SET Creatinine=?, iCa=?, TotalProtein=?, Albumin=?, Globulin=? WHERE BloodChemistryID=?";

	String INSERT_BONE_MARROW_ASPIRATE = "INSERT INTO BoneMarrowAspirateTable VALUES (NULL,?,?)  ";
	String UPDATE_BONE_MARROW_ASPIRATE = "UPDATE BoneMarrowAspirateTable SET DatePerformed=?, Result=? WHERE BoneMarrowAspirateID=?";

	String INSERT_FLOWCYTOMETRY = "INSERT INTO FlowCytometryTable VALUES (NULL,?)  ";
	String UPDATE_FLOWCYTOMETRY = "UPDATE FlowCytometryTable SET Result=? WHERE FlowCytometryID=?";

	String INSERT_CYTOGENETIC_MOLECULAR = "INSERT INTO CytogeneticMolecularTable VALUES (NULL,?)  ";
	String UPDATE_CYTOGENETIC_MOLECULAR = "UPDATE CytogeneticMolecularTable SET Result=? WHERE CytogeneticMolecularID=?";

	String INSERT_IMAGING_STUDIES = "INSERT INTO ImagingStudiesTable VALUES (NULL, ?) ";
	String UPDATE_IMAGING_STUDIES = "UPDATE ImagingStudiesTable SET Result=? WHERE ImagingStudiesID=?";

	String INSERT_SERUMFREE = "INSERT INTO SerumFreeTable VALUES (NULL,?)";
	String UPDATE_SERUMFREE = "UPDATE SerumFreeTable SET Result=? WHERE SerumFreeID=?";

	String INSERT_SERUMIMMUNOFIXATION = "INSERT INTO SerumImmunofixationTable VALUES (NULL,?)";
	String UPDATE_SERUMIMMUNOFIXATION = "UPDATE SerumImmunofixationTable SET Result=? WHERE SerumImmunofixationID=?";

	String INSERT_SERUMPROTEIN = "INSERT INTO SerumProteinTable VALUES (NULL,?)";
	String UPDATE_SERUMPROTEIN = "UPDATE SerumProteinTable SET Result=? WHERE SerumProteinID=?";

	String INSERT_URINEPROTEIN = "INSERT INTO UrineProteinTable VALUES (NULL,?)";
	String UPDATE_URINEPROTEIN = "UPDATE UrineProteinTable SET Result=? WHERE UrineProteinID=?";

	String INSERT_LABORATORY_PROFILE_AAPHSMDS = "INSERT INTO LaboratoryProfileTable"
			+ "(LaboratoryID,DateOfBloodCollection,HematologyID,OtherLaboratoriesID,BoneMarrowAspirateID,FlowCytometryID,CytogeneticMolecularID) "
			+ "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM HematologyTable),"
			+ "(SELECT MAX(OtherLaboratoriesID) FROM OtherLaboratoriesTable),"
			+ "(SELECT MAX(BoneMarrowAspirateID) FROM BoneMarrowAspirateTable)," + "(SELECT MAX(FlowCytometryID) FROM FlowCytometryTable),"
			+ "(SELECT MAX(CytogeneticMolecularID) FROM CytogeneticMolecularTable)) ";

	String INSERT_LABORATORY_PROFILE_LEUKEMIA = "INSERT INTO LaboratoryProfileTable"
			+ "(LaboratoryID,DateOfBloodCollection,HematologyID,BoneMarrowAspirateID,FlowCytometryID,CytogeneticMolecularID) "
			+ "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM HematologyTable),"
			+ "(SELECT MAX(BoneMarrowAspirateID) FROM BoneMarrowAspirateTable)," + "(SELECT MAX(FlowCytometryID) FROM FlowCytometryTable),"
			+ "(SELECT MAX(CytogeneticMolecularID) FROM CytogeneticMolecularTable)) ";

	String INSERT_LABORATORY_PROFILE_LYMPHOMA = "INSERT INTO LaboratoryProfileTable"
			+ "(LaboratoryID,DateOfBloodCollection,HematologyID,BloodChemistryID,ImagingStudiesID) "
			+ "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM HematologyTable)," + "(SELECT MAX(BloodChemistryID) FROM BloodChemistryTable),"
			+ "(SELECT MAX(ImagingStudiesID) FROM ImagingStudiesTable)) ";

	String INSERT_LABORATORY_PROFILE_MYELOPROLIFERATIVE = "INSERT INTO LaboratoryProfileTable"
			+ "(LaboratoryID,DateOfBloodCollection,HematologyID,BloodChemistryID) "
			+ "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM HematologyTable),"
			+ "(SELECT MAX(BloodChemistryID) FROM BloodChemistryTable)) ";

	String INSERT_LABORATORY_PROFILE_PLASMACELL = "INSERT INTO LaboratoryProfileTable"
			+ "(LaboratoryID, DateOfBloodCollection, HematologyID, BloodChemistryID, BoneMarrowAspirateID, ImagingStudiesID, SerumFreeID, SerumProteinID, SerumImmunofixationID, UrineProteinID) "
			+ "VALUES (NULL, ?, (SELECT MAX(HematologyID) FROM HematologyTable),	"
			+ "(SELECT MAX(BloodChemistryID) FROM BloodChemistryTable), "
			+ "(SELECT MAX(BoneMarrowAspirateID) FROM BoneMarrowAspirateTable), "
			+ "(SELECT MAX(ImagingStudiesID) FROM ImagingStudiesTable),	" + "(SELECT MAX(SerumFreeID) FROM SerumFreeTable),	"
			+ "(SELECT MAX(SerumProteinID) FROM SerumProteinTable), "
			+ "(SELECT MAX(SerumImmunofixationID) FROM SerumImmunofixationTable),	 "
			+ "(SELECT MAX(UrineProteinID) FROM UrineProteinTable)) ";

	String INSERT_LABORATORY_PROFILE_PLATELETCELL = "INSERT INTO LaboratoryProfileTable"
			+ "(LaboratoryID,DateOfBloodCollection,HematologyID,ImagingStudiesID) "
			+ "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM HematologyTable), "
			+ "(SELECT MAX(ImagingStudiesID) FROM ImagingStudiesTable)) ";

	String UPDATE_LABORATORY_PROFILE = "UPDATE LaboratoryProfileTable SET DateOfBloodCollection=? WHERE LaboratoryProfileID=?";

	String INSERT_DISEASE_STATUS = "INSERT INTO DiseaseStatusTable VALUES (NULL,?,NULL,?)  ";
	String UPDATE_DISEASE_STATUS = "UPDATE DiseaseStatusTable SET DiseaseStatus=?, OtherDisease=? WHERE DiseaseStatusID=?";

	String INSERT_DISEASE_STATUS_PLASMACELL = "INSERT INTO DiseaseStatusTable VALUES (NULL,?,?,?)  ";
	String UPDATE_DISEASE_STATUS_PLASMACELL = "UPDATE DiseaseStatusTable SET DiseaseStatus=?, RelapseDisease=?, OtherDisease=? WHERE DiseaseStatusID=?";

	String INSERT_FOLLOWUP_AAPHSMDS = "INSERT INTO FollowUpTable(PatientID, FollowUpID, DateOfEntry, DateOfVisit, MedicalEventsID, ClinicalDataID, LaboratoryID, DiseaseStatusID, Notes) "
			+ "VALUES (?, NULL, ?, ?, (SELECT MAX(MedicalEventsID) FROM MedicalEventsTable), "
			+ "(SELECT MAX(ClinicalDataID) FROM ClinicalDataTable), (SELECT MAX(LaboratoryID) FROM LaboratoryProfileTable), "
			+ "(SELECT MAX(DiseaseStatusID) FROM DiseaseStatusTable), ?) ";

	String INSERT_FOLLOWUP_COAGULATION = "INSERT INTO FollowUpTable(PatientID, FollowUpID, DateOfEntry, DateOfVisit, MedicalEventsID, Notes) "
			+ "VALUES (?, NULL, ?, ?, (SELECT MAX(MedicalEventsID) FROM MedicalEventsTable), ?) ";

	String INSERT_FOLLOWUP_LEUKEMIA = "INSERT INTO FollowUpTable(PatientID, FollowUpID, DateOfEntry, DateOfVisit, MedicalEventsID, ClinicalDataID, LaboratoryID, DiseaseStatusID, Notes) "
			+ "VALUES (?, NULL, ?, ?, (SELECT MAX(MedicalEventsID) FROM MedicalEventsTable), "
			+ "(SELECT MAX(ClinicalDataID) FROM ClinicalDataTable), (SELECT MAX(LaboratoryID) FROM LaboratoryProfileTable), "
			+ "(SELECT MAX(DiseaseStatusID) FROM DiseaseStatusTable), ?) ";

	String INSERT_FOLLOWUP_LYMPHOMA = "INSERT INTO FollowUpTable(PatientID, FollowUpID, DateOfEntry, DateOfVisit, MedicalEventsID, ClinicalDataID, LaboratoryID, DiseaseStatusID, Notes) "
			+ "VALUES (?, NULL, ?, ?, (SELECT MAX(MedicalEventsID) FROM MedicalEventsTable), "
			+ "(SELECT MAX(ClinicalDataID) FROM ClinicalDataTable), (SELECT MAX(LaboratoryID) FROM LaboratoryProfileTable), "
			+ "(SELECT MAX(DiseaseStatusID) FROM DiseaseStatusTable), ?) ";

	String INSERT_FOLLOWUP_MYELOPROLIFERATIVE = "INSERT INTO FollowUpTable(PatientID, FollowUpID, DateOfEntry, DateOfVisit, MedicalEventsID, ClinicalDataID, LaboratoryID, DiseaseStatusID, Notes) "
			+ "VALUES (?, NULL, ?, ?, (SELECT MAX(MedicalEventsID) FROM MedicalEventsTable), "
			+ "(SELECT MAX(ClinicalDataID) FROM ClinicalDataTable), (SELECT MAX(LaboratoryID) FROM LaboratoryProfileTable), "
			+ "(SELECT MAX(DiseaseStatusID) FROM DiseaseStatusTable), ?) ";

	String INSERT_FOLLOWUP_PLASMACELL = "INSERT INTO FollowUpTable(PatientID, FollowUpID, DateOfEntry, DateOfVisit, MedicalEventsID, ClinicalDataID, LaboratoryID, DiseaseStatusID, Notes) "
			+ "VALUES (?, NULL, ?, ?, (SELECT MAX(MedicalEventsID) FROM MedicalEventsTable), "
			+ "(SELECT MAX(ClinicalDataID) FROM ClinicalDataTable), (SELECT MAX(LaboratoryID) FROM LaboratoryProfileTable), "
			+ "(SELECT MAX(DiseaseStatusID) FROM DiseaseStatusTable), ?) ";

	String INSERT_FOLLOWUP_PLATELETCELL = "INSERT INTO FollowUpTable(PatientID, FollowUpID, DateOfEntry, DateOfVisit, MedicalEventsID, ClinicalDataID, LaboratoryID, DiseaseStatusID, Notes) "
			+ "VALUES (?, NULL, ?, ?, (SELECT MAX(MedicalEventsID) FROM MedicalEventsTable), "
			+ "(SELECT MAX(ClinicalDataID) FROM ClinicalDataTable), (SELECT MAX(LaboratoryID) FROM LaboratoryProfileTable), "
			+ "(SELECT MAX(DiseaseStatusID) FROM DiseaseStatusTable), ?) ";

	String UPDATE_FOLLOWUP_PLATELETCELL = "UPDATE FollowUpTable SET DateOfEntry=?, DateOfVisit=?, Notes=? WHERE FollowUpID=?";

}
