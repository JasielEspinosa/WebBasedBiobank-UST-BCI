package utility.database;

public interface SQLCommands {

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

	// Retrieves
	String GET_ADDRESS = "SELECT * FROM ADDRESSTABLE WHERE ADDRESSID = ?";

	String GET_LIST_PATIENTS_BASELINE_AAPHSMDS = "SELECT * FROM PATIENTTABLE WHERE DISEASEID = 1";
	String GET_LIST_PATIENTS_BASELINE_COAGULATION = "SELECT * FROM PATIENTTABLE WHERE DISEASEID = 2";
	String GET_LIST_PATIENTS_BASELINE_LEUKEMIA = "SELECT * FROM PATIENTTABLE WHERE DISEASEID = 3";
	String GET_LIST_PATIENTS_BASELINE_LYMPHOMA = "SELECT * FROM PATIENTTABLE WHERE DISEASEID = 4";
	String GET_LIST_PATIENTS_BASELINE_MYELOPROLIFERATIVE = "SELECT * FROM PATIENTTABLE WHERE DISEASEID = 5";
	String GET_LIST_PATIENTS_BASELINE_PLASMACELL = "SELECT * FROM PATIENTTABLE WHERE DISEASEID = 6";
	String GET_LIST_PATIENTS_BASELINE_PLATELET = "SELECT * FROM PATIENTTABLE WHERE DISEASEID = 7";

	String GET_PATIENT_BASELINE = "SELECT * FROM PATIENTTABLE WHERE PATIENTID = ?";
	String GET_GENERAL_DATA = "SELECT * FROM GENERALDATATABLE WHERE GENERALDATAID = ?";
	String GET_CLINICAL_DATA_BASELINE = "SELECT * FROM CLINICALDATATABLE WHERE CLINICALDATAID = ?";
	String GET_PHYSICAL_EXAM = "SELECT * FROM PHYSICALEXAMTABLE WHERE PHYSICALEXAMID = ?";
	String GET_LABORATORY_PROFILE = "SELECT * FROM LABORATORYPROFILETABLE WHERE LABORATORYID = ?";
	String GET_HEMATOLOGY = "SELECT * FROM HEMATOLOGYTABLE WHERE HEMATOLOGYID = ?";

	String GET_OTHER_LABORATORIES_AAPNHMDS = "SELECT * FROM OTHERLABORATORIESTABLE WHERE OTHERLABORATORIESID = ?";

	String GET_BONE_MARROW_ASPIRATE = "SELECT * FROM BONEMARROWASPIRATETABLE WHERE BONEMARROWASPIRATEID = ?";
	String GET_FLOWCYTOMETRY = "SELECT * FROM FLOWCYTOMETRYTABLE WHERE FLOWCYTOMETRYID = ?";

	String GET_CYTOGENETIC_AAPNH_AAPNHMDS = "SELECT * FROM cytogeneticaapnhtable WHERE cytogenicaapnhID = ?";
	String GET_CYTOGENETIC_MDS_AAPNHMDS = "SELECT * FROM cytogeneticmdstable WHERE cytogenicmdsid = ?";

	String GET_TREATMENT = "SELECT * FROM treatmenttable WHERE treatmentid = ?";
	String GET_COAGULATION_TESTING = "SELECT * FROM COAGULATIONTESTINGTABLE WHERE COAGULATIONTESTINGID = ?";
	String GET_BLOOD_CHEMISTRY = "SELECT * FROM BLOODCHEMISTRYTABLE WHERE BLOODCHEMISTRYID = ?";
	String GET_IMAGING_STUDIES = "SELECT * FROM IMAGINGSTUDIESTABLE WHERE IMAGINGSTUDIESID = ?";

	// INSERT QUERIES
	String INSERT_ADDRESS = "INSERT INTO AddressTable VALUES (NULL, ?, ?, ?)";
	String INSERT_TISSUE_SPECIMEN = "INSERT INTO TissueSpecimenTable VALUES (NULL,?)";

	/////// All diseases and disorders except Coagulation disease and Platelet
	/////// disorder
	String INSERT_GENERAL_DATA = "INSERT INTO GeneralDataTable VALUES(NULL,?,?,?,?,?,?,(SELECT MAX(AddressID) FROM AddressTable),(SELECT MAX(TissueSpecimenID) FROM TissueSpecimenTable))";
	/////// Coagulation disease and Platelet disorder only
	String INSERT_GENERAL_DATA_NO_TISSUE = "INSERT INTO GeneralDataTable (GeneralDataID,LastName,MiddleName,FirstName,Gender,DateOfBirth,DateOfEntry,AddressID) "
			+ "VALUES (NULL,?,?,?,?,?,?,(SELECT MAX(AddressID) FROM AddressTable))";

	String INSERT_PROGNOSTIC_RISK_SCORING = "INSERT INTO PrognosticRiskScoringTable VALUES (NULL,?)";
	String INSERT_RISK_SCORE = "INSERT INTO RiskScoreTable VALUES (NULL,?)";
	String INSERT_CLASSIFICATION = "INSERT INTO ClassificationTable VALUES (NULL,?)";
	String INSERT_ISSSTAGING = "INSERT INTO ISSStagingTable VALUES (NULL,?)";
	String INSERT_SEVERITY = "INSERT INTO SeverityTable VALUES (NULL,?)";

	String INSERT_PHYSICAL_EXAM_AAPHSMDS = "INSERT INTO PhysicalExamTable VALUES (NULL, ?,?,?,NULL,NULL,NULL,NULL,NULL,NULL,NULL,?);";
	String INSERT_PHYSICAL_EXAM_COAGULATION = "INSERT INTO PhysicalExamTable VALUES (NULL, ?,?,NULL,NULL,NULL,NULL,?,?,NULL,NULL,?)";
	String INSERT_PHYSICAL_EXAM_LEUKEMIA = "INSERT INTO PhysicalExamTable VALUES (NULL,?,?,?,?,?,?,NULL,NULL,NULL,NULL,?)";
	String INSERT_PHYSICAL_EXAM_LYMPHOMA = "INSERT INTO PhysicalExamTable VALUES (NULL,?,?,?,?,?,?,NULL,NULL,NULL,NULL,?)";
	String INSERT_PHYSICAL_EXAM_MYELOPROLIFERATIVE = "INSERT INTO PhysicalExamTable VALUES (NULL,?,?,?,?,?,?,NULL,NULL,?,NULL,?)";
	String INSERT_PHYSICAL_EXAM_PLASMACELL = "INSERT INTO PhysicalExamTable VALUES (NULL,?,?,?,NULL,NULL,NULL,NULL,NULL,?,NULL,?)";
	String INSERT_PHYSICAL_EXAM_PLATELET = "INSERT INTO PhysicalExamTable VALUES (NULL,?,?,NULL,?,NULL,NULL,NULL,NULL,NULL,NULL,?)";

	String INSERT_CLINICAL_DATA_AAPHSMDS = "INSERT INTO ClinicalDataTable "
			+ "(ClinicalDataID,DateOfVisit,Diagnosis,ClassificationID,ChiefComplaint,OtherSymptoms,Combordities,SmokingHistory,AlcoholIntakeHistory,ChemicalExposure,PreviousInfection,PreviousHematologicDisorder,PhysicalExamID) "
			+ "VALUES (NULL, ?, ?, (SELECT MAX(ClassificationID) FROM ClassificationTable), ?, ?, ?, ?, ?, ?, ?, ?,(SELECT MAX(PhysicalExamID) FROM PhysicalExamTable))";
	String INSERT_CLINICAL_DATA_COAGULATION = "INSERT INTO ClinicalDataTable "
			+ "(ClinicalDataID,DateOfVisit,Diagnosis,OtherDiagnosis,SeverityID,ChiefComplaint,OtherSymptoms,Combordities,SmokingHistory,AlcoholIntakeHistory,ChemicalExposure,PhysicalExamID,OtherFindings) "
			+ "VALUES (NULL,?,?,?,(SELECT MAX(SeverityID) FROM SeverityTable),?,?,?,?,?,?,(SELECT MAX(PhysicalExamID) FROM PhysicalExamTable),?)";
	String INSERT_CLINICAL_DATA_LEUKEMIA = "INSERT INTO ClinicalDataTable "
			+ "(ClinicalDataID,DateOfVisit,Diagnosis,RiskScoreID,ChiefComplaint,ConstitutionalSymptoms,OtherSymptoms,Combordities,SmokingHistory,AlcoholIntakeHistory,ChemicalExposure,PreviousInfection,PreviousHematologicDisorder,PhysicalExamID) "
			+ "VALUES (NULL,?,?,(SELECT MAX(RiskScoreID) FROM RiskScoreTable),?,?,?,?,?,?,?,?,?,(SELECT MAX(PhysicalExamID) FROM PhysicalExamTable))";
	String INSERT_CLINICAL_DATA_LYMPHOMA = "INSERT INTO ClinicalDataTable "
			+ "(ClinicalDataID,DateOfVisit,Diagnosis,StageOfDisease,ChiefComplaint,ConstitutionalSymptoms,OtherSymptoms,Combordities,SmokingHistory,AlcoholIntakeHistory,ChemicalExposure,PhysicalExamID,OtherFindings) "
			+ "VALUES (NULL,?,?,?,?,?,?,?,?,?,?,(SELECT MAX(PhysicalExamID) FROM PhysicalExamTable),?)";
	String INSERT_CLINICAL_DATA_MYELOPROLIFERATIVE = "INSERT INTO ClinicalDataTable "
			+ "(ClinicalDataID,DateOfVisit,Diagnosis,PrognosticRiskScoringID,RiskScoreID,ChiefComplaint,ConstitutionalSymptoms,OtherSymptoms,Combordities,SmokingHistory,AlcoholIntakeHistory,ChemicalExposure,PhysicalExamID,OtherFindings) "
			+ "VALUES (NULL,?,?,(SELECT MAX(PrognosticRiskScoringID) FROM PrognosticRiskScoringTable),(SELECT MAX(RiskScoreID) FROM RiskScoreTable),?,?,?,?,?,?,?,(SELECT MAX(PhysicalExamID) FROM PhysicalExamTable),?)";
	String INSERT_CLINICAL_DATA_PLASMACELL = "INSERT INTO ClinicalDataTable "
			+ "(ClinicalDataID,DateOfVisit,Diagnosis,ISSStagingID,ChiefComplaint,ConstitutionalSymptoms,OtherSymptoms,Combordities,SmokingHistory,AlcoholIntakeHistory,ChemicalExposure,PhysicalExamID,OtherFindings) "
			+ "VALUES (NULL,?,?,(SELECT MAX(ISSStagingID) FROM ISSStagingTable),?,?,?,?,?,?,?,(SELECT MAX(PhysicalExamID) FROM PhysicalExamTable),?)";
	String INSERT_CLINICAL_DATA_PLATELET = "INSERT INTO ClinicalDataTable "
			+ "(ClinicalDataID,DateOfVisit,Diagnosis,OtherDiagnosis,ChiefComplaint,OtherSymptoms,Combordities,SmokingHistory,AlcoholIntakeHistory,ChemicalExposure,PhysicalExamID,OtherFindings) "
			+ "VALUES (NULL,?,?,?,?,?,?,?,?,?,(SELECT MAX(PhysicalExamID) FROM PhysicalExamTable),?)";

	String INSERT_FAMILY_CANCER = "INSERT INTO FamilyCancerTable VALUES (NULL, (SELECT MAX(ClinicalDataID) FROM ClinicalDataTable),?,?)";
	String INSERT_OTHERDISEASES = "INSERT INTO OtherDiseasesTable VALUES (NULL, (SELECT MAX(ClinicalDataID) FROM ClinicalDataTable), ?)";
	String INSERT_MEDICATIONS = "INSERT INTO MedicationsTable VALUES (NULL, (SELECT MAX(ClinicalDataID) FROM ClinicalDataTable),?,?,?)";

	String INSERT_HEMATOLOGY_AAPHSMDS = "INSERT INTO HematologyTable VALUES (NULL,?,?,?,?,?,?,?,?,?,?,?,?);";
	String INSERT_HEMATOLOGY_COAGULATION = "INSERT INTO HematologyTable VALUES (NULL,?,?,?,?,?,?,?,?,NULL,NULL,NULL,?)";
	String INSERT_HEMATOLOGY_LEUKEMIA = "INSERT INTO HematologyTable VALUES (NULL,?,?,?,?,?,?,?,?,?,?,?,?)";
	String INSERT_HEMATOLOGY_LYMPHOMA = "INSERT INTO HematologyTable VALUES (NULL,?,?,?,?,?,?,?,?,?,?,?,?)";
	String INSERT_HEMATOLOGY_MYELOPROLIFERATIVE = "INSERT INTO HematologyTable VALUES (NULL,?,?,?,?,?,?,?,?,?,?,?,?)";
	String INSERT_HEMATOLOGY_PLASMACELL = "INSERT INTO HematologyTable VALUES (NULL,?,?,?,?,?,?,?,?,?,?,?,?)";

	String INSERT_OTHER_LABORATORIES_AAPHSMDS = "INSERT INTO OtherLaboratoriesTable VALUES (NULL,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	String INSERT_BONE_MARROW_ASPIRATE_AAPHSMDS = "INSERT INTO BoneMarrowAspirateTable VALUES (NULL,?,?)";

	String INSERT_FLOWCYTOMETRY_AAPHSMDS = "INSERT INTO FlowCytometryTable VALUES (NULL,?)";
	String INSERT_FLOWCYTOMETRY_LEUKEMIA = "INSERT INTO FlowCytometryTable VALUES (NULL,?)";

	String INSERT_CYTOGENETIC_AAPNH_AAPHSMDS = "INSERT INTO CytogeneticAAPNHTable VALUES (NULL,?)";
	String INSERT_CYTOGENETIC_AAPNH_LEUKEMIA = "INSERT INTO CytogeneticAAPNHTable VALUES (NULL,?)";
	String INSERT_CYTOGENETIC_MDS_AAPHSMDS = "INSERT INTO CytogeneticMDSTable VALUES (NULL,?)";
	String INSERT_CYTOGENETIC_PLASMACELL = "INSERT INTO CytogeneticPlasmaCellTable VALUES (NULL,?)";

	String INSERT_COAGULATION_TESTING_COAGULATION = "INSERT INTO CoagulationTestingTable VALUES (NULL,?,?,?,?)";

	String INSERT_BLOOD_CHEMISTRY_COAGULATION = "INSERT INTO BloodChemistryTable(BloodChemistryID,Creatinine,UricAcid,SGOT,SGPT,LDH,Na,K) VALUES (NULL,?,?,?,?,?,?,?)";
	String INSERT_BLOOD_CHEMISTRY_LEUKEMIA = "INSERT INTO BloodChemistryTable(BloodChemistryID,Creatinine,UricAcid,SGOT,SGPT,LDH,Na,K) VALUES (NULL,?,?,?,?,?,?,?)";
	String INSERT_BLOOD_CHEMISTRY_LYMPHOMA = "INSERT INTO BloodChemistryTable(BloodChemistryID,Creatinine,UricAcid,SGOT,SGPT,LDH,Na,K,BilirubinTotal,BilirubinDirect,BilirubinIndirect,Beta2Microglobulin,HepatitisBTesting,ESR) VALUES (NULL,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	String INSERT_BLOOD_CHEMISTRY_MYELOPROLIFERATIVE = "INSERT INTO BloodChemistryTable(BloodChemistryID,Creatinine,UricAcid,SGOT,SGPT,LDH,EPOLevel) VALUES (NULL,?,?,?,?,?,?)";
	String INSERT_BLOOD_CHEMISTRY_PLASMACELL = "INSERT INTO BloodChemistryTable(BloodChemistryID,BloodUreaNitrogen,Creatinine,UricAcid,LDH,Na,K,Beta2Microglobulin,iCa,TotalProtein,Albumin,Globulin) VALUES (NULL,?,?,?,?,?,?,?,?,?,?,?)";
	String INSERT_BLOOD_CHEMISTRY_PLATELET = "INSERT INTO BloodChemistryTable(BloodChemistryID,Creatinine,UricAcid,SGOT,SGPT,LDH,Na,K,ANATiter,HepatitisCRna) VALUES (NULL,?,?,?,?,?,?,?,?,?)";

	String INSERT_IMAGING_STUDIES = "INSERT INTO ImagingStudiesTable VALUES (NULL, ?);";

	String INSERT_BONE_MARROW_ASPIRATE = "INSERT INTO BoneMarrowAspirateTable VALUES (NULL,?,?)";
	String INSERT_UPPERGIENDOSCOPY_PLATELET = "INSERT INTO UpperGIEndoscopyTable VALUES (NULL,?,?,?)";
	String INSERT_MOLECULAR_ANALYSIS_MYELOPROLIFERATIVE = "INSERT INTO MolecularAnalysisTable VALUES (NULL,?)";
	String INSERT_HEMATOPATHOLOGY_LYMPHOMA = "INSERT INTO HematopathologyTable VALUES (NULL,?,?)";
	String INSERT_IMMUNOHISTOCHEMISTRY_LYMPHOMA = "INSERT INTO ImmunohistochemistryTable VALUES (NULL,?,?)";

	String INSERT_SERUMFREE_PLASMACELL = "INSERT INTO SerumFreeTable VALUES (NULL,?)";
	String INSERT_SERUMIMMUNOFIXATION_PLASMACELL = "INSERT INTO SerumImmunofixationTable VALUES (NULL,?)";
	String INSERT_SERUMPROTEIN_PLASMACELL = "INSERT INTO SerumProteinTable VALUES (NULL,?)";

	String INSERT_URINEPROTEIN_PLASMACELL = "INSERT INTO UrineProteinTable VALUES (NULL,?)";

	String INSERT_LABORATORY_PROFILE_LEUKEMIA = "INSERT INTO LaboratoryProfileTable "
			+ "(LaboratoryID,DateOfBloodCollection,HematologyID,BloodChemistryID,BoneMarrowAspirateID,FlowCytometryID,CytogenicAAPNHID, ImagingStudiesID) "
			+ "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM HematologyTable),"
			+ "(SELECT MAX(BloodChemistryID) FROM BloodChemistryTable),"
			+ "(SELECT MAX(BoneMarrowAspirateID) FROM BoneMarrowAspirateTable),"
			+ "(SELECT MAX(FlowCytometryID) FROM FlowCytometryTable),"
			+ "(SELECT MAX(CytogenicAAPNHID) FROM CytogeneticAAPNHTable),"
			+ "(SELECT MAX(ImagingStudiesID) FROM ImagingStudiesTable))";
	String INSERT_LABORATORY_PROFILE_AAPHSMDS = "INSERT INTO LaboratoryProfileTable "
			+ "(LaboratoryID,DateOfBloodCollection,HematologyID,OtherLaboratoriesID,BoneMarrowAspirateID,FlowCytometryID,CytogenicAAPNHID, CytogenicMDSID) "
			+ "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM HematologyTable),"
			+ "(SELECT MAX(OtherLaboratoriesID) FROM OtherLaboratoriesTable),"
			+ "(SELECT MAX(BoneMarrowAspirateID) FROM BoneMarrowAspirateTable),"
			+ "(SELECT MAX(FlowCytometryID) FROM FlowCytometryTable),"
			+ "(SELECT MAX(CytogenicAAPNHID) FROM CytogeneticAAPNHTable),"
			+ "(SELECT MAX(CytogenicMDSID) FROM CytogeneticMDSTable))";
	String INSERT_LABORATORY_PROFILE_COAGULATION = "INSERT INTO LaboratoryProfileTable "
			+ "(LaboratoryID,DateOfBloodCollection,HematologyID,CoagulationTestingID,BloodChemistryID,ImagingStudiesID) "
			+ "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM HematologyTable),"
			+ "(SELECT MAX(CoagulationTestingID) FROM CoagulationTestingTable),"
			+ "(SELECT MAX(BloodChemistryID) FROM BloodChemistryTable),"
			+ "(SELECT MAX(ImagingStudiesID) FROM ImagingStudiesTable))";
	String INSERT_LABORATORY_PROFILE_LYMPHOMA = "INSERT INTO LaboratoryProfileTable "
			+ "(LaboratoryID,DateOfBloodCollection,HematologyID,BloodChemistryID,BoneMarrowAspirateID,FlowCytometryID,CytogenicAAPNHID,ImagingStudiesID, HematopathologyID, ImmunohistochemistryID) "
			+ "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM HematologyTable),"
			+ "(SELECT MAX(BloodChemistryID) FROM BloodChemistryTable),"
			+ "(SELECT MAX(BoneMarrowAspirateID) FROM BoneMarrowAspirateTable),"
			+ "(SELECT MAX(FlowCytometryID) FROM FlowCytometryTable),"
			+ "(SELECT MAX(CytogenicAAPNHID) FROM CytogeneticAAPNHTable),"
			+ "(SELECT MAX(ImagingStudiesID) FROM ImagingStudiesTable),"
			+ "(SELECT MAX(HematopathologyID) FROM HematopathologyTable),"
			+ "(SELECT MAX(ImmunohistochemistryID) FROM ImmunohistochemistryTable))";
	String INSERT_LABORATORY_PROFILE_MYELOPROLIFERATIVE = "INSERT INTO LaboratoryProfileTable "
			+ "(LaboratoryID,DateOfBloodCollection,HematologyID,BloodChemistryID,BoneMarrowAspirateID,MolecularAnalysisID) "
			+ "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM HematologyTable),"
			+ "(SELECT MAX(BloodChemistryID) FROM BloodChemistryTable),"
			+ "(SELECT MAX(BoneMarrowAspirateID) FROM BoneMarrowAspirateTable),"
			+ "(SELECT MAX(MolecularAnalysisID) FROM MolecularAnalysisTable))";
	String INSERT_LABORATORY_PROFILE_PLASMACELL = "INSERT INTO LaboratoryProfileTable "
			+ "(LaboratoryID,DateOfBloodCollection,HematologyID,BloodChemistryID,BoneMarrowAspirateID,CytogenicPlasmaCellID,MolecularAnalysisID,SerumFreeID,SerumProteinID,SerumImmunofixationID,UrineProteinID) "
			+ "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM HematologyTable),"
			+ "(SELECT MAX(BloodChemistryID) FROM BloodChemistryTable),"
			+ "(SELECT MAX(BoneMarrowAspirateID) FROM BoneMarrowAspirateTable),"
			+ "(SELECT MAX(CytogeneticPlasmaCellID) FROM CytogeneticPlasmaCellTable),"
			+ "(SELECT MAX(MolecularAnalysisID) FROM MolecularAnalysisTable),"
			+ "(SELECT MAX(SerumFreeID) FROM SerumFreeTable)," + "(SELECT MAX(SerumProteinID) FROM SerumProteinTable),"
			+ "(SELECT MAX(SerumImmunofixationID) FROM SerumImmunofixationTable),"
			+ "(SELECT MAX(UrineProteinID) FROM UrineProteinTable))";

	// String INSERT_LABORATORY_PROFILE_PLATELET = "INSERT INTO
	// LaboratoryProfileTable ";

	String INSERT_MODE_OF_TREATMENT = "INSERT INTO ModeOfTreatmentTable VALUES (NULL,?,?)";

	String INSERT_CHEMOTHERAPY_MEDICATIONS = "INSERT INTO ChemoMedicationsTable VALUES (NULL, ?);";

	String INSERT_REGIMEN = "INSERT INTO RegimenTable VALUES (NULL,?)";
	String INSERT_REGIMEN_TRANSPLANT = "INSERT INTO RegimenTransplantTable VALUES (NULL,?)";
	String INSERT_REGIMEN_NONTRANSPLANT = "INSERT INTO RegimenNonTransplantTable VALUES (NULL,?)";

	String INSERT_MAINTENANCE_THERAPY = "INSERT INTO MaintenanceTherapyTable VALUES (NULL,?)";

	String INSERT_DISEASE_STATUS = "INSERT INTO DiseaseStatusTable VALUES (NULL,?)";

	String INSERT_TREATMENT_AAPHSMDS = "INSERT INTO TreatmentTable (TreatmentID,Transplant,ModeOfTreatmentID,ChemoMedicationID,DateStarted) "
			+ "VALUES (NULL,?,(SELECT MAX(ModeOfTreatmentID) FROM ModeOfTreatmentTable),(SELECT MAX(ChemoMedicationID) FROM ChemoMedicationsTable),?)";
	String INSERT_TREATMENT_COAGULATION = "INSERT INTO TreatmentTable (TreatmentID, ModeOfTreatmentID) "
			+ "VALUES (NULL, (SELECT MAX(ModeOfTreatmentID) FROM ModeOfTreatmentTable))";
	String INSERT_TREATMENT_LEUKEMIA = "INSERT INTO TreatmentTable(TreatmentID,ModeOfTreatmentID,ChemoMedicationID,DateStarted,RegimenID,CycleNumber) "
			+ "VALUES (NULL, (SELECT MAX(ModeOfTreatmentID) FROM ModeOfTreatmentTable), (SELECT MAX(ChemoMedicationID) FROM ChemoMedicationsTable), ?, (SELECT MAX(RegimenID) FROM RegimenTable), ?)";
	String INSERT_TREATMENT_LYMPHOMA = "INSERT INTO TreatmentTable(TreatmentID,ModeOfTreatmentID,ChemoMedicationID,DateStarted,RegimenID,CycleNumber,Complications) "
			+ "VALUES (NULL, (SELECT MAX(ModeOfTreatmentID) FROM ModeOfTreatmentTable), (SELECT MAX(ChemoMedicationID) FROM ChemoMedicationsTable), ?, (SELECT MAX(RegimenID) FROM RegimenTable), ?, ?)";
	String INSERT_TREATMENT_MYELOPROLIFERATIVE = "INSERT INTO TreatmentTable(TreatmentID,ModeOfTreatmentID,ChemoMedicationID,DateStarted) "
			+ "VALUES (NULL, (SELECT MAX(ModeOfTreatmentID) FROM ModeOfTreatmentTable), (SELECT MAX(ChemoMedicationID) FROM ChemoMedicationsTable), ?)";
	String INSERT_TREATMENT_PLASMACELL = "INSERT INTO TreatmentTable(TreatmentID,ModeOfTreatmentID,RegimenID,RegimentTransplantID,RegimentNonTransplantID,OtherRegimen,OtherRegimenTransplant,OtherRegimenNonTransplant,OtherRegimenMaintenanceTherapy,CycleNumber) "
			+ "VALUES (NULL, (SELECT MAX(ModeOfTreatmentID) FROM ModeOfTreatmentTable), "
			+ "(SELECT MAX(RegimenID) FROM RegimenTable), "
			+ "(SELECT MAX(RegimentTransplantID) FROM RegimentTransplantTable),"
			+ "(SELECT MAX(RegimentNonTransplantID) FROM RegimentNonTransplantTable),?,?,?,?,?)";
	String INSERT_TREATMENT_PLATELET = "INSERT INTO TreatmentTable(TreatmentID,ModeOfTreatmentID,DateStarted,Complications) "
			+ "VALUES (NULL, (SELECT MAX(ModeOfTreatmentID) FROM ModeOfTreatmentTable), ?, ?)";

	String INSERT_OTHERTREATMENT_PLASMACELL = "INSERT INTO TreatmentTable(OtherTreatmentID, Bisphosphonates, Radiotherapy, OtherMedications, Complications) "
			+ "VALUES (NULL, ?, ?, ?, ?)";

	String INSERT_PATIENT_AAPHSMDS = "INSERT INTO PatientTable VALUES (NULL,1,"
			+ "(SELECT MAX(GeneralDataID) FROM GeneralDataTable),"
			+ "(SELECT MAX(ClinicalDataID) FROM ClinicalDataTable),"
			+ "(SELECT MAX(LaboratoryID) FROM LaboratoryProfileTable),"
			+ "(SELECT MAX(TreatmentID) FROM TreatmentTable),NULL,1," + "NULL)";
	String INSERT_PATIENT_COAGULATION = "INSERT INTO PatientTable VALUES (NULL,2,"
			+ "(SELECT MAX(GeneralDataID) FROM GeneralDataTable),"
			+ "(SELECT MAX(ClinicalDataID) FROM ClinicalDataTable),"
			+ "(SELECT MAX(LaboratoryID) FROM LaboratoryProfileTable),"
			+ "(SELECT MAX(TreatmentID) FROM TreatmentTable),NULL,1," + "NULL)";
	String INSERT_PATIENT_LEUKEMIA = "INSERT INTO PatientTable VALUES (NULL,3,"
			+ "(SELECT MAX(GeneralDataID) FROM GeneralDataTable),"
			+ "(SELECT MAX(ClinicalDataID) FROM ClinicalDataTable),"
			+ "(SELECT MAX(LaboratoryID) FROM LaboratoryProfileTable),"
			+ "(SELECT MAX(TreatmentID) FROM TreatmentTable),NULL,1,"
			+ "(SELECT MAX(DiseaseStatusID) FROM DiseaseStatusTable))";
	String INSERT_PATIENT_LYMPHOMA = "INSERT INTO PatientTable VALUES (NULL,4,"
			+ "(SELECT MAX(GeneralDataID) FROM GeneralDataTable),"
			+ "(SELECT MAX(ClinicalDataID) FROM ClinicalDataTable),"
			+ "(SELECT MAX(LaboratoryID) FROM LaboratoryProfileTable),"
			+ "(SELECT MAX(TreatmentID) FROM TreatmentTable),NULL,1,"
			+ "(SELECT MAX(DiseaseStatusID) FROM DiseaseStatusTable))";
	String INSERT_PATIENT_MYELOPROLIFERATIVE = "INSERT INTO PatientTable VALUES (NULL,5,"
			+ "(SELECT MAX(GeneralDataID) FROM GeneralDataTable),"
			+ "(SELECT MAX(ClinicalDataID) FROM ClinicalDataTable),"
			+ "(SELECT MAX(LaboratoryID) FROM LaboratoryProfileTable),"
			+ "(SELECT MAX(TreatmentID) FROM TreatmentTable),NULL,1," + "NULL)";
	String INSERT_PATIENT_PLASMACELL = "INSERT INTO PatientTable VALUES (NULL,6,"
			+ "(SELECT MAX(GeneralDataID) FROM GeneralDataTable),"
			+ "(SELECT MAX(ClinicalDataID) FROM ClinicalDataTable),"
			+ "(SELECT MAX(LaboratoryID) FROM LaboratoryProfileTable),"
			+ "(SELECT MAX(TreatmentID) FROM TreatmentTable),NULL,1," + "NULL)";
	String INSERT_PATIENT_PLATELET = "INSERT INTO PatientTable VALUES (NULL,7,"
			+ "(SELECT MAX(GeneralDataID) FROM GeneralDataTable),"
			+ "(SELECT MAX(ClinicalDataID) FROM ClinicalDataTable),"
			+ "(SELECT MAX(LaboratoryID) FROM LaboratoryProfileTable),"
			+ "(SELECT MAX(TreatmentID) FROM TreatmentTable),NULL,1,"
			+ "(SELECT MAX(DiseaseStatusID) FROM DiseaseStatusTable))";

}

