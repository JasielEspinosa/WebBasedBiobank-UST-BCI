package utility.database;

public interface SQLCommandsFollowUp {

	// FOLLOW UP QUERIES

	String INSERT_MEDICAL_EVENTS = "INSERT INTO MedicalEventsTable VALUES (NULL, ?, ?, NULL, NULL, NULL, ?, NULL, ?) WHERE PatientID = ?";
	String INSERT_MEDICAL_EVENTS_COAGULATION = "INSERT INTO MedicalEventsTable VALUES (NULL, NULL, NULL, ?, ?, ?, ?, ?, NULL) WHERE PatientID = ?";
	String INSERT_MEDICAL_EVENTS_PLATELETCELL = "INSERT INTO MedicalEventsTable VALUES (NULL, ?, NULL, NULL, NULL, NULL, ?, NULL, ?) WHERE PatientID = ?";

	String INSERT_PHYSICAL_EXAM = "INSERT INTO PhysicalExamTable(PhysicalExamID, Weight, ECOG) VALUES (NULL, ?, ?) WHERE PatientID = ?";

	String INSERT_CLINICAL_DATA = "INSERT INTO ClinicalDataTable(ClinicalDataID,CurrentSymptoms, PhysicalExamID) "
			+ "VALUES (NULL, ?, (SELECT MAX(PhysicalExamID) FROM PhysicalExamTable)) WHERE PatientID = ?";

	String INSERT_HEMATOLOGY = "INSERT INTO HematologyTable VALUES (NULL,?,?,?,?,?,?,?,?,?,?,?,?) WHERE PatientID = ?";

	String INSERT_OTHER_LABORATORIES_AAPHSMDS = "INSERT INTO OtherLaboratoriesTable VALUES (NULL,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)  WHERE PatientID = ?";

	String INSERT_BLOOD_CHEMISTRY_LYMPHOMA = "INSERT INTO BloodChemistryTable(LDH, ESR) VALUES (NULL, ?, ?) WHERE PatientID = ?";
	String INSERT_BLOOD_CHEMISTRY_PLASMACELL = "INSERT INTO BloodChemistryTable(Creatinine, iCa, TotalProtein, Albumin,  Globulin) VALUES (NULL, ?, ?, ?, ?, ?) WHERE PatientID = ?";

	String INSERT_BONE_MARROW_ASPIRATE = "INSERT INTO BoneMarrowAspirateTable VALUES (NULL,?,?)  WHERE PatientID = ?";

	String INSERT_FLOWCYTOMETRY = "INSERT INTO FlowCytometryTable VALUES (NULL,?)  WHERE PatientID = ?";

	String INSERT_CYTOGENETIC_MOLECULAR = "INSERT INTO CytogeneticMolecularTable VALUES (NULL,?)  WHERE PatientID = ?";

	String INSERT_IMAGING_STUDIES = "INSERT INTO ImagingStudiesTable VALUES (NULL, ?) WHERE PatientID = ?";
	
	String INSERT_SERUMFREE = "INSERT INTO SerumFreeTable VALUES (NULL,?)";
	String INSERT_SERUMIMMUNOFIXATION = "INSERT INTO SerumImmunofixationTable VALUES (NULL,?)";
	String INSERT_SERUMPROTEIN = "INSERT INTO SerumProteinTable VALUES (NULL,?)";

	String INSERT_URINEPROTEIN = "INSERT INTO UrineProteinTable VALUES (NULL,?)";

	String INSERT_LABORATORY_PROFILE_AAPHSMDS = "INSERT INTO LaboratoryProfileTable"
			+ "(LaboratoryID,DateOfBloodCollection,HematologyID,OtherLaboratoriesID,BoneMarrowAspirateID,FlowCytometryID,CytogeneticMolecularID) "
			+ "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM HematologyTable),"
			+ "(SELECT MAX(OtherLaboratoriesID) FROM OtherLaboratoriesTable),"
			+ "(SELECT MAX(BoneMarrowAspirateID) FROM BoneMarrowAspirateTable),"
			+ "(SELECT MAX(FlowCytometryID) FROM FlowCytometryTable),"
			+ "(SELECT MAX(CytogeneticMolecularID) FROM CytogeneticMolecularTable)) WHERE PatientID = ?";

	String INSERT_LABORATORY_PROFILE_LEUKEMIA = "INSERT INTO LaboratoryProfileTable"
			+ "(LaboratoryID,DateOfBloodCollection,HematologyID,BoneMarrowAspirateID,FlowCytometryID,CytogeneticMolecularID) "
			+ "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM HematologyTable),"
			+ "(SELECT MAX(BoneMarrowAspirateID) FROM BoneMarrowAspirateTable),"
			+ "(SELECT MAX(FlowCytometryID) FROM FlowCytometryTable),"
			+ "(SELECT MAX(CytogeneticMolecularID) FROM CytogeneticMolecularTable)) WHERE PatientID = ?";

	String INSERT_LABORATORY_PROFILE_LYMPHOMA = "INSERT INTO LaboratoryProfileTable"
			+ "(LaboratoryID,DateOfBloodCollection,HematologyID,BloodChemistryID,ImagingStudiesID) "
			+ "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM HematologyTable),"
			+ "(SELECT MAX(BloodChemistryID) FROM BloodChemistryTable),"
			+ "(SELECT MAX(ImagingStudiesID) FROM ImagingStudiesTable)) WHERE PatientID = ?";

	String INSERT_LABORATORY_PROFILE_MYELOPROLIFERATIVE = "INSERT INTO LaboratoryProfileTable"
			+ "(LaboratoryID,DateOfBloodCollection,HematologyID,BloodChemistryID) "
			+ "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM HematologyTable),"
			+ "(SELECT MAX(BloodChemistryID) FROM BloodChemistryTable)) WHERE PatientID = ?";

	String INSERT_LABORATORY_PROFILE_PLASMACELL = "INSERT INTO LaboratoryProfileTable"
			+ "(LaboratoryID, DateOfBloodCollection, HematologyID, BloodChemistryID, BoneMarrowAspirateID, ImagingStudiesID, SerumFreeID, SerumProteinID, SerumImmunofixationID, UrineProteinID) "
			+ "VALUES (NULL, ?, (SELECT MAX(HematologyID) FROM HematologyTable),	"
			+ "(SELECT MAX(BloodChemistryID) FROM BloodChemistryTable), "
			+ "(SELECT MAX(BoneMarrowAspirateID) FROM BoneMarrowAspirateTable), "
			+ "(SELECT MAX(ImagingStudiesID) FROM ImagingStudiesTable),	"
			+ "(SELECT MAX(SerumFreeID) FROM SerumFreeTable),	"
			+ "(SELECT MAX(SerumProteinID) FROM SerumProteinTable), "
			+ "(SELECT MAX(SerumImmunofixationID) FROM SerumImmunofixationTable),	 "
			+ "(SELECT MAX(UrineProteinID) FROM UrineProteinTable)) WHERE PatientID = ?";

	String INSERT_LABORATORY_PROFILE_PLATELETCELL = "INSERT INTO LaboratoryProfileTable"
			+ "(LaboratoryID,DateOfBloodCollection,HematologyID,ImagingStudiesID) "
			+ "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM HematologyTable), "
			+ "(SELECT MAX(ImagingStudiesID) FROM ImagingStudiesTable)) WHERE PatientID = ?";

	String INSERT_DISEASE_STATUS = "INSERT INTO DiseaseStatusTable VALUES (NULL,?,NULL,?)  WHERE PatientID = ?";
	String INSERT_DISEASE_STATUS_PLASMACELL = "INSERT INTO DiseaseStatusTable VALUES (NULL,?,?,?)  WHERE PatientID = ?";

	String INSERT_FOLLOWUP_AAPHSMDS = "INSERT INTO FollowUpTable(FollowUpID, DateOfEntry, DateOfVisit, MedicalEventsID, ClinicalDataID, LaboratoryID, DiseaseStatusID, Notes) "
			+ "VALUES (NULL, ?, ?, (SELECT MAX(MedicalEventsID) FROM MedicalEventsTable), "
			+ "(SELECT MAX(ClinicalDataID) FROM ClinicalDataTable)" + "(SELECT MAX(LaboratoryID) FROM LaboratoryTable)"
			+ "(SELECT MAX(DiseaseStatusID) FROM DiseaseStatusTable), ?) WHERE PatientID = ?";

	String INSERT_FOLLOWUP_COAGULATION = "INSERT INTO FollowUpTable(FollowUpID, DateOfEntry, DateOfVisit, MedicalEventsID, Notes) "
			+ "VALUES (NULL, ?, ?, (SELECT MAX(MedicalEventsID) FROM MedicalEventsTable), ?) WHERE PatientID = ?";

	String INSERT_FOLLOWUP_LEUKEMIA = "INSERT INTO FollowUpTable(FollowUpID, DateOfEntry, DateOfVisit, MedicalEventsID, ClinicalDataID, LaboratoryID, DiseaseStatusID, Notes) "
			+ "VALUES (NULL, ?, ?, (SELECT MAX(MedicalEventsID) FROM MedicalEventsTable), "
			+ "(SELECT MAX(ClinicalDataID) FROM ClinicalDataTable)" + "(SELECT MAX(LaboratoryID) FROM LaboratoryTable)"
			+ "(SELECT MAX(DiseaseStatusID) FROM DiseaseStatusTable), ?) WHERE PatientID = ?";

	String INSERT_FOLLOWUP_LYMPHOMA = "INSERT INTO FollowUpTable(FollowUpID, DateOfEntry, DateOfVisit, MedicalEventsID, ClinicalDataID, LaboratoryID, DiseaseStatusID, Notes) "
			+ "VALUES (NULL, ?, ?, (SELECT MAX(MedicalEventsID) FROM MedicalEventsTable), "
			+ "(SELECT MAX(ClinicalDataID) FROM ClinicalDataTable)" + "(SELECT MAX(LaboratoryID) FROM LaboratoryTable)"
			+ "(SELECT MAX(DiseaseStatusID) FROM DiseaseStatusTable), ?) WHERE PatientID = ?";

	String INSERT_FOLLOWUP_MYELOPROLIFERATIVE = "INSERT INTO FollowUpTable(FollowUpID, DateOfEntry, DateOfVisit, MedicalEventsID, ClinicalDataID, LaboratoryID, DiseaseStatusID, Notes) "
			+ "VALUES (NULL, ?, ?, (SELECT MAX(MedicalEventsID) FROM MedicalEventsTable), "
			+ "(SELECT MAX(ClinicalDataID) FROM ClinicalDataTable)" + "(SELECT MAX(LaboratoryID) FROM LaboratoryTable)"
			+ "(SELECT MAX(DiseaseStatusID) FROM DiseaseStatusTable), ?) WHERE PatientID = ?";

	String INSERT_FOLLOWUP_PLASMACELL = "INSERT INTO FollowUpTable(FollowUpID, DateOfEntry, DateOfVisit, MedicalEventsID, ClinicalDataID, LaboratoryID, DiseaseStatusID, Notes) "
			+ "VALUES (NULL, ?, ?, (SELECT MAX(MedicalEventsID) FROM MedicalEventsTable), "
			+ "(SELECT MAX(ClinicalDataID) FROM ClinicalDataTable)" + "(SELECT MAX(LaboratoryID) FROM LaboratoryTable)"
			+ "(SELECT MAX(DiseaseStatusID) FROM DiseaseStatusTable), ?) WHERE PatientID = ?";

	String INSERT_FOLLOWUP_PLATELETCELL = "INSERT INTO FollowUpTable(FollowUpID, DateOfEntry, DateOfVisit, MedicalEventsID, ClinicalDataID, LaboratoryID, DiseaseStatusID, Notes) "
			+ "VALUES (NULL, ?, ?, (SELECT MAX(MedicalEventsID) FROM MedicalEventsTable), "
			+ "(SELECT MAX(ClinicalDataID) FROM ClinicalDataTable)" + "(SELECT MAX(LaboratoryID) FROM LaboratoryTable)"
			+ "(SELECT MAX(DiseaseStatusID) FROM DiseaseStatusTable), ?) WHERE PatientID = ?";

}
