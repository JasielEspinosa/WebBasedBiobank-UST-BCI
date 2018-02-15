package utility.database;

public interface SQLCommandsBaseline {

	// BASELINE RETRIEVE QUERIES

	//	get patients
	String GET_LIST_PATIENTS_BASELINE_AAPHSMDS = "SELECT * FROM PATIENTTABLE WHERE DISEASEID = 1";
	String GET_LIST_PATIENTS_BASELINE_COAGULATION = "SELECT * FROM PATIENTTABLE WHERE DISEASEID = 2";
	String GET_LIST_PATIENTS_BASELINE_LEUKEMIA = "SELECT * FROM PATIENTTABLE WHERE DISEASEID = 3";
	String GET_LIST_PATIENTS_BASELINE_LYMPHOMA = "SELECT * FROM PATIENTTABLE WHERE DISEASEID = 4";
	String GET_LIST_PATIENTS_BASELINE_MYELOPROLIFERATIVE = "SELECT * FROM PATIENTTABLE WHERE DISEASEID = 5";
	String GET_LIST_PATIENTS_BASELINE_PLASMACELL = "SELECT * FROM PATIENTTABLE WHERE DISEASEID = 6";
	String GET_LIST_PATIENTS_BASELINE_PLATELET = "SELECT * FROM PATIENTTABLE WHERE DISEASEID = 7";

	//	general data
	String GET_PATIENT_BASELINE = "SELECT * FROM PATIENTTABLE WHERE PATIENTID = ?";
	String GET_GENERAL_DATA = "SELECT * FROM GENERALDATATABLE WHERE GENERALDATAID = ?";
	String GET_ADDRESS = "SELECT * FROM ADDRESSTABLE WHERE ADDRESSID = ?";
	String GET_TISSUESPECIMEN = "SELECT * FROM TISSUESPECIMENTABLE WHERE TISSUESPECIMENID = ?";

	//	clinical data
	String GET_CLINICAL_DATA_BASELINE = "SELECT * FROM CLINICALDATATABLE WHERE CLINICALDATAID = ?";
	String GET_CLASSIFICATION = "SELECT * FROM CLASSIFICATIONTABLE WHERE ClassificationID = ?";
	String GET_PHYSICAL_EXAM = "SELECT * FROM PHYSICALEXAMTABLE WHERE PHYSICALEXAMID = ?";
	String GET_FAMILY_CANCER = "SELECT * FROM FAMILYCANCERTABLE WHERE CLINICALDATAID = ?";
	String GET_OTHER_DISEASES = "SELECT * FROM OTHERDISEASESTABLE WHERE CLINICALDATAID = ?";
	String GET_MEDICATIONS = "SELECT * FROM MEDICATIONSTABLE WHERE CLINICALDATAID = ?";

	//	laboratory 
	String GET_LABORATORY_PROFILE = "SELECT * FROM LABORATORYPROFILETABLE WHERE LABORATORYID = ?";
	String GET_HEMATOLOGY = "SELECT * FROM HEMATOLOGYTABLE WHERE HEMATOLOGYID = ?";
	String GET_OTHER_LABORATORIES_AAPNHMDS = "SELECT * FROM OTHERLABORATORIESTABLE WHERE OTHERLABORATORIESID = ?";
	String GET_BONE_MARROW_ASPIRATE = "SELECT * FROM BONEMARROWASPIRATETABLE WHERE BONEMARROWASPIRATEID = ?";
	String GET_FLOWCYTOMETRY = "SELECT * FROM FLOWCYTOMETRYTABLE WHERE FLOWCYTOMETRYID = ?";
	String GET_CYTOGENETIC_AAPNH_AAPNHMDS = "SELECT * FROM cytogeneticmolecularaapnhtable WHERE cytogeneticmolecularaapnhID = ?";
	String GET_CYTOGENETIC_MDS_AAPNHMDS = "SELECT * FROM cytogeneticmolecularmdstable WHERE cytogeneticmolecularmdsid = ?";
	String GET_COAGULATION_TESTING = "SELECT * FROM COAGULATIONTESTINGTABLE WHERE COAGULATIONTESTINGID = ?";
	String GET_BLOOD_CHEMISTRY = "SELECT * FROM BLOODCHEMISTRYTABLE WHERE BLOODCHEMISTRYID = ?";
	String GET_IMAGING_STUDIES = "SELECT * FROM IMAGINGSTUDIESTABLE WHERE IMAGINGSTUDIESID = ?";

	// Therapy and response
	String GET_TREATMENT = "SELECT * FROM treatmenttable WHERE treatmentid = ?";
	String GET_CHEMO_MEDICATIONS = "SELECT * FROM CHEMOMEDICATIONSTABLE where ChemoMedicationID = ?";
	String GET_MODE_OF_TREAMENT = "SELECT * FROM MODEOFTREATMENTTABLE WHERE ModeOfTreatmentID = ?";

	// BASELINE INSERT QUERIES

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
	String INSERT_PHYSICAL_EXAM_PLATELETCELL = "INSERT INTO PhysicalExamTable VALUES (NULL,?,?,NULL,?,NULL,NULL,NULL,NULL,NULL,NULL,?)";

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
	String INSERT_CLINICAL_DATA_PLATELETCELL = "INSERT INTO ClinicalDataTable "
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
	String INSERT_HEMATOLOGY_PLATELETCELL = "INSERT INTO HematologyTable VALUES (NULL,?,?,?,?,?,?,?,?,NULL,NULL,NULL,?)";

	String INSERT_COAGULATION_TESTING = "INSERT INTO CoagulationTestingTable VALUES (NULL,?,?,?,?)";

	String INSERT_BLOOD_CHEMISTRY_COAGULATION = "INSERT INTO BloodChemistryTable(BloodChemistryID,Creatinine,UricAcid,SGOT,SGPT,LDH,Na,K) VALUES (NULL,?,?,?,?,?,?,?)";
	String INSERT_BLOOD_CHEMISTRY_LEUKEMIA = "INSERT INTO BloodChemistryTable(BloodChemistryID,Creatinine,UricAcid,SGOT,SGPT,LDH,Na,K) VALUES (NULL,?,?,?,?,?,?,?)";
	String INSERT_BLOOD_CHEMISTRY_LYMPHOMA = "INSERT INTO BloodChemistryTable(BloodChemistryID,Creatinine,UricAcid,SGOT,SGPT,LDH,Na,K,BilirubinTotal,BilirubinDirect,BilirubinIndirect,Beta2Microglobulin,HepatitisBTesting,ESR) VALUES (NULL,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	String INSERT_BLOOD_CHEMISTRY_MYELOPROLIFERATIVE = "INSERT INTO BloodChemistryTable(BloodChemistryID,Creatinine,UricAcid,SGOT,SGPT,LDH,EPOLevel) VALUES (NULL,?,?,?,?,?,?)";
	String INSERT_BLOOD_CHEMISTRY_PLASMACELL = "INSERT INTO BloodChemistryTable(BloodChemistryID,BloodUreaNitrogen,Creatinine,UricAcid,LDH,Na,K,Beta2Microglobulin,iCa,TotalProtein,Albumin,Globulin) VALUES (NULL,?,?,?,?,?,?,?,?,?,?,?)";

	String INSERT_BLOOD_CHEMISTRY_PLATELET = "INSERT INTO BloodChemistryTable(BloodChemistryID,Creatinine,UricAcid,SGOT,SGPT,LDH,Na,K,ANATiter,HepatitisCRna) VALUES (NULL,?,?,?,?,?,?,?,?,?)";

	String INSERT_OTHER_LABORATORIES_AAPHSMDS = "INSERT INTO OtherLaboratoriesTable VALUES (NULL,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

	String INSERT_BONE_MARROW_ASPIRATE = "INSERT INTO BoneMarrowAspirateTable VALUES (NULL,?,?)";

	String INSERT_FLOWCYTOMETRY = "INSERT INTO FlowCytometryTable VALUES (NULL,?)";

	String INSERT_CYTOGENETIC_AAPNH_AAPHSMDS = "INSERT INTO CytogeneticMolecularAAPNHTable VALUES (NULL,?)";
	String INSERT_CYTOGENETIC_AAPNH_LEUKEMIA = "INSERT INTO CytogeneticMolecularAAPNHTable VALUES (NULL,?)";
	String INSERT_CYTOGENETIC_MDS_AAPHSMDS = "INSERT INTO CytogeneticMolecularMDSTable VALUES (NULL,?)";
	String INSERT_CYTOGENETIC_MOLECULAR = "INSERT INTO CytogeneticMolecularTable VALUES (NULL,?)";

	String INSERT_IMAGING_STUDIES = "INSERT INTO ImagingStudiesTable VALUES (NULL, ?);";
	String INSERT_UPPERGIENDOSCOPY_PLATELET = "INSERT INTO UpperGIEndoscopyTable VALUES (NULL,?,?,?)";
	String INSERT_HEMATOPATHOLOGY = "INSERT INTO HematopathologyTable VALUES (NULL,?,?)";
	String INSERT_IMMUNOHISTOCHEMISTRY = "INSERT INTO ImmunohistochemistryTable VALUES (NULL,?,?)";

	String INSERT_SERUMFREE = "INSERT INTO SerumFreeTable VALUES (NULL,?)";
	String INSERT_SERUMIMMUNOFIXATION = "INSERT INTO SerumImmunofixationTable VALUES (NULL,?)";
	String INSERT_SERUMPROTEIN = "INSERT INTO SerumProteinTable VALUES (NULL,?)";

	String INSERT_URINEPROTEIN = "INSERT INTO UrineProteinTable VALUES (NULL,?)";

	String INSERT_LABORATORY_PROFILE_AAPHSMDS = "INSERT INTO LaboratoryProfileTable "
			+ "(LaboratoryID,DateOfBloodCollection,HematologyID,OtherLaboratoriesID,BoneMarrowAspirateID,FlowCytometryID,CytogeneticMolecularAAPNHID, CytogeneticMolecularMDSID) "
			+ "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM HematologyTable),"
			+ "(SELECT MAX(OtherLaboratoriesID) FROM OtherLaboratoriesTable),"
			+ "(SELECT MAX(BoneMarrowAspirateID) FROM BoneMarrowAspirateTable)," + "(SELECT MAX(FlowCytometryID) FROM FlowCytometryTable),"
			+ "(SELECT MAX(CytogeneticMolecularAAPNHID) FROM CytogeneticMolecularAAPNHTable),"
			+ "(SELECT MAX(CytogeneticMolecularMDSID) FROM CytogeneticMolecularMDSTable))";
	String INSERT_LABORATORY_PROFILE_COAGULATION = "INSERT INTO LaboratoryProfileTable "
			+ "(LaboratoryID,DateOfBloodCollection,HematologyID,CoagulationTestingID,BloodChemistryID,ImagingStudiesID) "
			+ "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM HematologyTable),"
			+ "(SELECT MAX(CoagulationTestingID) FROM CoagulationTestingTable),"
			+ "(SELECT MAX(BloodChemistryID) FROM BloodChemistryTable)," + "(SELECT MAX(ImagingStudiesID) FROM ImagingStudiesTable))";
	String INSERT_LABORATORY_PROFILE_LEUKEMIA = "INSERT INTO LaboratoryProfileTable "
			+ "(LaboratoryID,DateOfBloodCollection,HematologyID,BloodChemistryID,BoneMarrowAspirateID,FlowCytometryID,CytogeneticMolecularAAPNHID, ImagingStudiesID) "
			+ "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM HematologyTable)," + "(SELECT MAX(BloodChemistryID) FROM BloodChemistryTable),"
			+ "(SELECT MAX(BoneMarrowAspirateID) FROM BoneMarrowAspirateTable)," + "(SELECT MAX(FlowCytometryID) FROM FlowCytometryTable),"
			+ "(SELECT MAX(CytogeneticMolecularAAPNHID) FROM CytogeneticMolecularAAPNHTable),"
			+ "(SELECT MAX(ImagingStudiesID) FROM ImagingStudiesTable))";
	String INSERT_LABORATORY_PROFILE_LYMPHOMA = "INSERT INTO LaboratoryProfileTable "
			+ "(LaboratoryID,DateOfBloodCollection,HematologyID,BloodChemistryID,BoneMarrowAspirateID,FlowCytometryID,CytogeneticMolecularAAPNHID,ImagingStudiesID, HematopathologyID, ImmunohistochemistryID) "
			+ "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM HematologyTable)," + "(SELECT MAX(BloodChemistryID) FROM BloodChemistryTable),"
			+ "(SELECT MAX(BoneMarrowAspirateID) FROM BoneMarrowAspirateTable)," + "(SELECT MAX(FlowCytometryID) FROM FlowCytometryTable),"
			+ "(SELECT MAX(CytogeneticMolecularAAPNHID) FROM CytogeneticMolecularAAPNHTable),"
			+ "(SELECT MAX(ImagingStudiesID) FROM ImagingStudiesTable)," + "(SELECT MAX(HematopathologyID) FROM HematopathologyTable),"
			+ "(SELECT MAX(ImmunohistochemistryID) FROM ImmunohistochemistryTable))";
	String INSERT_LABORATORY_PROFILE_MYELOPROLIFERATIVE = "INSERT INTO LaboratoryProfileTable "
			+ "(LaboratoryID,DateOfBloodCollection,HematologyID,BloodChemistryID,BoneMarrowAspirateID,MolecularAnalysisID) "
			+ "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM HematologyTable)," + "(SELECT MAX(BloodChemistryID) FROM BloodChemistryTable),"
			+ "(SELECT MAX(BoneMarrowAspirateID) FROM BoneMarrowAspirateTable),"
			+ "(SELECT MAX(CytogeneticMolecularID) FROM CytogeneticMolecularTable))";
	String INSERT_LABORATORY_PROFILE_PLASMACELL = "INSERT INTO LaboratoryProfileTable "
			+ "(LaboratoryID,DateOfBloodCollection,HematologyID,BloodChemistryID,BoneMarrowAspirateID,CytogeneticMolecularID,ImagingStudiesID,SerumFreeID,SerumProteinID,SerumImmunofixationID,UrineProteinID) "
			+ "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM HematologyTable)," + "(SELECT MAX(BloodChemistryID) FROM BloodChemistryTable),"
			+ "(SELECT MAX(BoneMarrowAspirateID) FROM BoneMarrowAspirateTable),"
			+ "(SELECT MAX(CytogeneticMolecularID) FROM CytogeneticMolecularTable),"
			+ "(SELECT MAX(ImagingStudiesID) FROM ImagingStudiesTable)," + "(SELECT MAX(SerumFreeID) FROM SerumFreeTable),"
			+ "(SELECT MAX(SerumProteinID) FROM SerumProteinTable)," + "(SELECT MAX(SerumImmunofixationID) FROM SerumImmunofixationTable),"
			+ "(SELECT MAX(UrineProteinID) FROM UrineProteinTable))";
	String INSERT_LABORATORY_PROFILE_PLATELETCELL = "INSERT INTO LaboratoryProfileTable(LaboratoryID,DateOfBloodCollection,HematologyID,BloodChemistryID,BoneMarrowAspirateID,ImagingStudiesID,UpperGIEndoscopyID,ITP) "
			+ "VALUES (NULL,?,HematologyID,(SELECT MAX(BloodChemistryID) FROM BloodChemistryTable),(SELECT MAX(BoneMarrowAspirateID) FROM BoneMarrowAspirateTable),(SELECT MAX(ImagingStudiesID) FROM ImagingStudiesTable),(SELECT MAX(UpperGIEndoscopyID) FROM UpperGIEndoscopyTable),?) ";

	String INSERT_MODE_OF_TREATMENT = "INSERT INTO ModeOfTreatmentTable VALUES (NULL,?,?)";

	String INSERT_CHEMOTHERAPY_MEDICATIONS = "INSERT INTO ChemoMedicationsTable VALUES (NULL,?);";

	String INSERT_REGIMEN = "INSERT INTO RegimenTable VALUES (NULL,?)";
	String INSERT_REGIMEN_TRANSPLANT = "INSERT INTO RegimenTransplantTable VALUES (NULL,?)";
	String INSERT_REGIMEN_NONTRANSPLANT = "INSERT INTO RegimenNonTransplantTable VALUES (NULL,?)";

	String INSERT_MAINTENANCE_THERAPY = "INSERT INTO MaintenanceTherapyTable VALUES (NULL,?)";

	String INSERT_DISEASE_STATUS = "INSERT INTO DiseaseStatusTable(DiseaseStatusID, DiseaseStatus) VALUES (NULL,?)";

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
	String INSERT_TREATMENT_PLASMACELL = "INSERT INTO TreatmentTable(TreatmentID,ModeOfTreatmentID,MaintenanceTherapyID,RegimenID,RegimenTransplantID,RegimenNonTransplantID,DateStarted,OtherRegimen,OtherRegimenTransplant,OtherRegimenNonTransplant,OtherRegimenMaintenanceTherapy,CycleNumber,Complications) "
			+ "VALUES (NULL, (SELECT MAX(ModeOfTreatmentID) FROM ModeOfTreatmentTable), "
			+ "(SELECT MAX(MaintenanceTherapyID) FROM MaintenanceTherapyTable), " + "(SELECT MAX(RegimenID) FROM RegimenTable), "
			+ "(SELECT MAX(RegimenTransplantID) FROM RegimenTransplantTable),"
			+ "(SELECT MAX(RegimenNonTransplantID) FROM RegimenNonTransplantTable),?,?,?,?,?,?,?)";
	String INSERT_TREATMENT_PLATELETCELL = "INSERT INTO TreatmentTable(TreatmentID,ModeOfTreatmentID,DateStarted,Complications) "
			+ "VALUES (NULL, (SELECT MAX(ModeOfTreatmentID) FROM ModeOfTreatmentTable), ?, ?)";

	String INSERT_OTHERTREATMENT = "INSERT INTO OtherTreatmentTable(OtherTreatmentID, Bisphosphonates, Radiotherapy, OtherMedications, Complications) "
			+ "VALUES (NULL, ?, ?, ?, ?)";

	String INSERT_PATIENT_AAPHSMDS = "INSERT INTO PatientTable VALUES (NULL,1," + "(SELECT MAX(GeneralDataID) FROM GeneralDataTable),"
			+ "(SELECT MAX(ClinicalDataID) FROM ClinicalDataTable)," + "(SELECT MAX(LaboratoryID) FROM LaboratoryProfileTable),"
			+ "(SELECT MAX(TreatmentID) FROM TreatmentTable),NULL,1," + "NULL)";
	String INSERT_PATIENT_COAGULATION = "INSERT INTO PatientTable VALUES (NULL,2," + "(SELECT MAX(GeneralDataID) FROM GeneralDataTable),"
			+ "(SELECT MAX(ClinicalDataID) FROM ClinicalDataTable)," + "(SELECT MAX(LaboratoryID) FROM LaboratoryProfileTable),"
			+ "(SELECT MAX(TreatmentID) FROM TreatmentTable),NULL,1," + "NULL)";
	String INSERT_PATIENT_LEUKEMIA = "INSERT INTO PatientTable VALUES (NULL,3," + "(SELECT MAX(GeneralDataID) FROM GeneralDataTable),"
			+ "(SELECT MAX(ClinicalDataID) FROM ClinicalDataTable)," + "(SELECT MAX(LaboratoryID) FROM LaboratoryProfileTable),"
			+ "(SELECT MAX(TreatmentID) FROM TreatmentTable),NULL,1," + "(SELECT MAX(DiseaseStatusID) FROM DiseaseStatusTable))";
	String INSERT_PATIENT_LYMPHOMA = "INSERT INTO PatientTable VALUES (NULL,4," + "(SELECT MAX(GeneralDataID) FROM GeneralDataTable),"
			+ "(SELECT MAX(ClinicalDataID) FROM ClinicalDataTable)," + "(SELECT MAX(LaboratoryID) FROM LaboratoryProfileTable),"
			+ "(SELECT MAX(TreatmentID) FROM TreatmentTable),NULL,1," + "(SELECT MAX(DiseaseStatusID) FROM DiseaseStatusTable))";
	String INSERT_PATIENT_MYELOPROLIFERATIVE = "INSERT INTO PatientTable VALUES (NULL,5,"
			+ "(SELECT MAX(GeneralDataID) FROM GeneralDataTable)," + "(SELECT MAX(ClinicalDataID) FROM ClinicalDataTable),"
			+ "(SELECT MAX(LaboratoryID) FROM LaboratoryProfileTable)," + "(SELECT MAX(TreatmentID) FROM TreatmentTable),NULL,1," + "NULL)";
	String INSERT_PATIENT_PLASMACELL = "INSERT INTO PatientTable VALUES (NULL,6," + "(SELECT MAX(GeneralDataID) FROM GeneralDataTable),"
			+ "(SELECT MAX(ClinicalDataID) FROM ClinicalDataTable)," + "(SELECT MAX(LaboratoryID) FROM LaboratoryProfileTable),"
			+ "(SELECT MAX(TreatmentID) FROM TreatmentTable),NULL,1," + "NULL)";
	String INSERT_PATIENT_PLATELETCELL = "INSERT INTO PatientTable VALUES (NULL,7," + "(SELECT MAX(GeneralDataID) FROM GeneralDataTable),"
			+ "(SELECT MAX(ClinicalDataID) FROM ClinicalDataTable)," + "(SELECT MAX(LaboratoryID) FROM LaboratoryProfileTable),"
			+ "(SELECT MAX(TreatmentID) FROM TreatmentTable),NULL,1," + "(SELECT MAX(DiseaseStatusID) FROM DiseaseStatusTable))";

	// BASELINE UPDATE QUERIES

	String UPDATE_ADDRESS = "Update AddressTable set StreetAddress = ? , City = ? , ZIPCode = ? where AddressID = ?";
	String UPDATE_TISSUE_SPECIMEN = "Update TissueSpecimenTable set TissueSpecimenName = ? where TissueSpecimenID = ?";

	String UPDATE_GENERAL_DATA = "Update GeneralDataTable set LastName = ? , MiddleName = ?, FirstName = ?, Gender = ?, DateOfBirth = ?,"
			+ " DateOfEntry = ? where GeneralDataID = ?";

	String UPDATE_PROGNOSTIC_RISK_SCORING = "Update PrognosticRiskScoringTable set PrognosticRiskScoringName = ? where PrognosticRiskScoringID = ?";
	String UPDATE_RISK_SCORE = "Update RiskScoreTable set RiskScoreName = ? where RiskScoreID = ?";
	String UPDATE_CLASSIFCATION = "Update ClassificationTable set ClassificationName = ? where ClassificationID = ?";
	String UPDATE_ISSSTAGING = "Update ISSStagingTable set ISSStagingName = ? where ISSStagingID = ? ";
	String UPDATE_SEVERITY = "Update SeverityTable set SeverityName = ? where SeverityID = ?";

	String UPDATE_PHYSICAL_EXAM_AAPHSMDS = "Update PhysicalExamTable set Height = ?, Weight = ?, ECOG = ? , OtherFindings = ? where PhysicalExamID = ?";
	String UPDATE_PHYSICAL_EXAM_COAGULATION = "Update PhysicalExamTable set Height = ?, Weight = ?, Hemathroses = ?, ContracturesAndMuscleAtropht = ? , OtherFindings = ? where PhysicalExamID = ?";
	String UPDATE_PHYSICAL_EXAM_LEUKEMIA = "Update PhysicalExamTable set Height = ?, Weight = ?, ECOG = ?, Splenomegaly = ?, Hepatomegaly = ?, Lymphadenopathies = ? , OtherFindings = ? where PhysicalExamID = ?";
	String UPDATE_PHYSICAL_EXAM_LYMPHOMA = "Update PhysicalExamTable set Height = ?, Weight = ?, ECOG = ?, Splenomegaly = ?, Hepatomegaly = ?, Lymphadenopathies = ? , OtherFindings = ? where PhysicalExamID = ?";
	String UPDATE_PHYSICAL_EXAM_MYELOPROLIFERATIVE = "Update PhysicalExamTable set Height = ?, Weight = ?, ECOG = ?, Splenomegaly = ?, Hepatomegaly = ?, Lymphadenopathies = ?, ThrombosisHistory = ?, OtherFindings = ? where PhysicalExamID = ?";
	String UPDATE_PHYSICAL_EXAM_PLASMACELL = "Update PhysicalExamTable set Height = ?, Weight = ?, ECOG = ?, ThrombosisHistory = ? , OtherFindings = ? where PhysicalExamID = ?";
	String UPDATE_PHYSICAL_EXAM_PLATELETCELL = "Update PhysicalExamTable set Height = ?, Weight = ?, Splenomegaly = ?, OtherFindings = ? where PhysicalExamID = ?";

	String UPDATE_CLINICAL_DATA_AAPHSMDS = "Update ClinicalDataTable set DateOfVisit = ? , Diagnosis = ?, ChiefComplaint = ?, OtherSymptoms = ?, Combordities = ?, SmokingHistory = ?, AlcoholIntakeHistory = ?, ChemicalExposure = ?, PreviousInfection= ?, PreviousHematologicDisorder = ? where ClinicalDataID = ? ";
	String UPDATE_CLINICAL_DATA_COAGULATION = "Update ClinicalDataTable set DateOfVisit = ? , Diagnosis = ?, OtherDiagnosis = ?, ChiefComplaint = ?, OtherSymptoms = ?, Combordities = ?, SmokingHistory = ?, AlcoholIntakeHistory = ?, ChemicalExposure = ?, OtherFindings = ? where ClinicalDataID = ? ";
	String UPDATE_CLINICAL_DATA_LEUKEMIA = "Update ClinicalDataTable set DateOfVisit = ? , Diagnosis = ?, ChiefComplaint = ?, ConstitutionalSymptoms = ?, OtherSymptoms = ?, Combordities = ?, SmokingHistory = ?, AlcoholIntakeHistory = ?, ChemicalExposure = ?, PreviousInfection= ?, PreviousHematologicDisorder = ? where ClinicalDataID = ? ";
	String UPDATE_CLINICAL_DATA_LYMPHOMA = "Update ClinicalDataTable set DateOfVisit = ? , Diagnosis = ?, StageOfDisease = ? ,ChiefComplaint = ?, ConstitutionalSymptoms = ?, OtherSymptoms = ?, Combordities = ?, SmokingHistory = ?, AlcoholIntakeHistory = ?, ChemicalExposure = ?, OtherFindings= ? where ClinicalDataID = ? ";
	String UPDATE_CLINICAL_DATA_MYELOPROLIFERATIVE = "Update ClinicalDataTable set DateOfVisit = ? , Diagnosis = ?,ChiefComplaint = ?, ConstitutionalSymptoms = ?, OtherSymptoms = ?, Combordities = ?, SmokingHistory = ?, AlcoholIntakeHistory = ?, ChemicalExposure = ?, OtherFindings= ? where ClinicalDataID = ? ";
	String UPDATE_CLINICAL_DATA_PLASMACELL = "Update ClinicalDataTable set DateOfVisit = ? , Diagnosis = ?,ChiefComplaint = ?, ConstitutionalSymptoms = ?, OtherSymptoms = ?, Combordities = ?, SmokingHistory = ?, AlcoholIntakeHistory = ?, ChemicalExposure = ?, OtherFindings= ? where ClinicalDataID = ? ";
	String UPDATE_CLINICAL_DATA_PLATELETCELL = "Update ClinicalDataTable set DateOfVisit = ? , Diagnosis = ?, OtherDiagnosis = ?,ChiefComplaint = ?, OtherSymptoms = ?, Combordities = ?, SmokingHistory = ?, AlcoholIntakeHistory = ?, ChemicalExposure = ?, OtherFindings= ? where ClinicalDataID = ? ";

	String UPDATE_FAMILY_CANCER = "UPDATE FamilyCancerTable set RelationshipToPatient = ?, CancerName = ? where ClinicalDataID = ?";
	String UPDATE_OTHERDISEASES = "Update OtherDiseasesTable set OtherDiseases = ? where ClinicalDataID = ?";
	String UPDATE_MEDICATIONS = "Update MedicationsTable set GenericName = ? , Dose = ? , Frequency = ? where ClinicalDataID = ? ";

	String UPDATE_HEMATOLOGY_AAPHSMDS = "Update HematologyTable set Hemoglobin = ?, Hematocrit = ? , WhiteBloodCells = ?, Neutrophils = ?, Lymphocytes = ?,"
			+ " Monocytes = ?, Eosinophils = ? , Basophils = ? , Myelocytes = ? , Metamyelocytes = ? , Blasts = ? , PlateletCount = ? where HematologyID = ?";
	String UPDATE_HEMATOLOGY_COAGULATION = "Update HematologyTable set Hemoglobin = ?, Hematocrit = ? , WhiteBloodCells = ?, Neutrophils = ?, Lymphocytes = ?,"
			+ " Monocytes = ?, Eosinophils = ? , Basophils = ? , PlateletCount = ? where HematologyID = ?";
	String UPDATE_HEMATOLOGY_LEUKEMIA = "Update HematologyTable set Hemoglobin = ?, Hematocrit = ? , WhiteBloodCells = ?, Neutrophils = ?, Lymphocytes = ?,"
			+ " Monocytes = ?, Eosinophils = ? , Basophils = ? , Myelocytes = ? , Metamyelocytes = ? , Blasts = ? , PlateletCount = ? where HematologyID = ?";
	String UPDATE_HEMATOLOGY_LYMPHOMA = "Update HematologyTable set Hemoglobin = ?, Hematocrit = ? , WhiteBloodCells = ?, Neutrophils = ?, Lymphocytes = ?,"
			+ " Monocytes = ?, Eosinophils = ? , Basophils = ? , Myelocytes = ? , Metamyelocytes = ? , Blasts = ? , PlateletCount = ? where HematologyID = ?";
	String UPDATE_HEMATOLOGY_MYELOPROLIFERATIVE = "Update HematologyTable set Hemoglobin = ?, Hematocrit = ? , WhiteBloodCells = ?, Neutrophils = ?, Lymphocytes = ?,"
			+ " Monocytes = ?, Eosinophils = ? , Basophils = ? , Myelocytes = ? , Metamyelocytes = ? , Blasts = ? , PlateletCount = ? where HematologyID = ?";
	String UPDATE_HEMATOLOGY_PLASMACELL = "Update HematologyTable set Hemoglobin = ?, Hematocrit = ? , WhiteBloodCells = ?, Neutrophils = ?, Lymphocytes = ?,"
			+ " Monocytes = ?, Eosinophils = ? , Basophils = ? , Myelocytes = ? , Metamyelocytes = ? , Blasts = ? , PlateletCount = ? where HematologyID = ?";
	String UPDATE_HEMATOLOGY_PLATELETCELL = "Update HematologyTable set Hemoglobin = ?, Hematocrit = ? , WhiteBloodCells = ?, Neutrophils = ?, Lymphocytes = ?,"
			+ " Monocytes = ?, Eosinophils = ? , Basophils = ? , PlateletCount = ? where HematologyID = ?";

	String UPDATE_COAGULATION_TESTING = "UPDATE CoagulationTestingTable set FactorVIIILevel = ?, FactorIXLevel = ? , InhibitorAssay = ?, BethesdaUnits = ? where CoagulationTestingID = ?";

	String UPDATE_BLOOD_CHEMISTRY_COAGULATION = "Upddate BloodChemistryTable set Creatine = ?, UricAcid = ?, SGOT = ?, SGPT = ?, LDH = ? , Na = ?, K = ? where BloodChemistryID = ? ";
	String UPDATE_BLOOD_CHEMISTRY_LEUKEMIA = "Upddate BloodChemistryTable set Creatine = ?, UricAcid = ?, SGOT = ?, SGPT = ?, LDH = ? , Na = ?, K = ? where BloodChemistryID = ? ";
	String UPDATE_BLOOD_CHEMISTRY_LYMPHOMA = "Upddate BloodChemistryTable set Creatine = ?, UricAcid = ?, SGOT = ?, SGPT = ?, LDH = ? , Na = ?, K = ?,"
			+ " BilirubinTotal = ?, BilirubinDirect = ?, BilirubinIndirect = ?, Beta2Microglobulin = ?, HepatitsBTesting = ?, ESR = ? where BloodChemistryID = ? ";
	String UPDATE_BLOOD_CHEMISTRY_MYELOPROLIFERATIVE = "Upddate BloodChemistryTable set Creatine = ?, UricAcid = ?, SGOT = ?, SGPT = ?, LDH = ? , EPOLevel = ? where BloodChemistryID = ? ";
	String UPDATE_BLOOD_CHEMISTRY_PLASMACELL = "Upddate BloodChemistryTable set BloodUreaNitrogen = ? , Creatine = ?, UricAcid = ?, LDH = ? , Na = ?, K = ?,"
			+ "  Beta2Microglobulin = ?, iCa = ?, TotalProtein = ? , Albumin = ? , Globulin = ? where BloodChemistryID = ? ";
	String UPDATE_BLOOD_CHEMISTRY_PLATELETCELL = "Upddate BloodChemistryTable set Creatine = ?, UricAcid = ?, SGOT = ?, SGPT = ?, LDH = ? , EPOLevel = ? where BloodChemistryID = ? ";

	String UPDATE_OTHER_LABORATORIES_AAPHSMDS = "Update OtherLaboratoriesTable set Creatinine = ?, UricAcid = ? , ReticulocyteCount = ?, SerumIron = ? , IronBindingCapacity = ?, "
			+ "SerumFerritin = ?, DirectAntiglobulin = ?, IndirectAntiglobulin = ?, SGOT = ?, SGPT = ?, LDH = ?, ScreenTestHepatitis = ?, ScreenTestEBVCytomegalovirusHIV = ?, ErythropeitinLevel = ?,"
			+ " SerumFolicAcid = ?, SerumFolicAcid = ?, TSH = ? where OtherLaboratoriesID = ? ";

	String UPDATE_BONE_MARROW_ASPIRATE = "Update BoneMarrowAspirateTable set DatePerformed = ?, Result = ? where BoneMarrowAspirateID = ?";

	String UPDATE_FLOWCYTOMETRY = "Update FlowCytometryTable set Result = ? where FlowCytometryID = ?";

	String UPDATE_CYTOGENETIC_AAPNH_AAPHSMDS = "Update cytogeneticmolecularaapnhtable set Result = ? where CytogeneticMolecularAAPNHID = ?";
	String UPDATE_CYTOGENETIC_AAPNH_LEUKEMIA = "Update cytogeneticmolecularaapnhtable set Result = ? where CytogeneticMolecularAAPNHID = ?";
	String UPDATE_CYTOGENETIC_MDS_AAPHSMDS = "Update cytogeneticmolecularaapnhtable set Result = ? where CytogeneticMolecularMDSID = ?";
	String UPDATE_CYTOGENETIC_MOLECULAR = "Update CytogeneticMolecularTable set Result = ? where CytogeneticMolecularID = ?";

	String UPDATE_IMAGING_STUDIES = "UPDATE ImagingStudiesTable set Result = ? where ImagingStudiesID = ? ";
	String UPDATE_UPPERGIENDOSCOPY_PLATELET = "UPDATE uppergiendoscopytable set DatePerformed = ?, Description = ? , HPylori = ? where UpperGIEndoscopyID = ? ";
	String UPDATE_HEMATOPATHOLOGY = "UPDATE hematopathologytable set DatePerformed = ?, Result = ? where HematopathologyID = ?";
	String UPDATE_IMMUNOHISTOCHEMISTRY = "UPDATE immunohistochemistrytable set DatePerformed = ?, Result = ? where ImmunohistochemistryID = ?";

	String UPDATE_SERUMFREE = "Update serumfreetable set Result = ? where SerumFreeID = ?";
	String UPDATE_SERUMIMMUNOFIXATION = "Update serumimmunofixationtable set Result = ? where SerumImmunofixationID = ?";
	String UPDATE_SERUMPROTEIN = "Update SerumProteinTable set Result = ? where SerumProteinID = ?";

	String UPDATE_URINEPROTEIN = "Update UrineProteinTable set Result = ? where UrineProteinID = ?";

	String UPDATE_LABORATORY_PROFILE_AAPHSMDS = "UPDATE LABORATORYPROFILETABLE SET DateOfBloodCollection = ? where LaboratoryID = ?";
	String UPDATE_LABORATORY_PROFILE_COAGULATION = "UPDATE LABORATORYPROFILETABLE SET DateOfBloodCollection = ? where LaboratoryID = ?";
	String UPDATE_LABORATORY_PROFILE_LEUKEMIA = "UPDATE LABORATORYPROFILETABLE SET DateOfBloodCollection = ? where LaboratoryID = ?";
	String UPDATE_LABORATORY_PROFILE_LYMPHOMA = "UPDATE LABORATORYPROFILETABLE SET DateOfBloodCollection = ? where LaboratoryID = ?";
	String UPDATE_LABORATORY_PROFILE_MYELOPROLIFERATIVE = "UPDATE LABORATORYPROFILETABLE SET DateOfBloodCollection = ? where LaboratoryID = ?";
	String UPDATE_LABORATORY_PROFILE_PLASMACELL = "UPDATE LABORATORYPROFILETABLE SET DateOfBloodCollection = ? where LaboratoryID = ?";
	String UPDATE_LABORATORY_PROFILE_PLATELETCELL = "UPDATE LABORATORYPROFILETABLE SET DateOfBloodCollection = ?, ITP = ? where LaboratoryID = ?";

	String UPDATE_MODE_OF_TREATMENT = "Update ModeOfTreatmentTable set ModeOfTreatment = ? , NameOfTreatment = ? where ModeOfTreatmentID  =  ?";

	String UPDATE_CHEMOTHERAPY_MEDICATIONS = "Update ChemoMedicationsTable set Medications = ? where ChemoMedicationID = ?";

	String UPDATE_REGIMEN = "Update RegimenTable set RegimenName = ?, RegimenName = ?, RegimenName = ? where RegimenID = ?";
	String UPDATE_REGIMEN_TRANSPLANT = "Update RegimenTransplantTable set RegimenName = ? where RegimenTransplantID = ?";
	String UPDATE_REGIMEN_NONTRANSPLANT = "Update RegimenNonTransplantTable set RegimenName = ? where RegimenNonTransplantID = ?";

	String UPDATE_MAINTENANCE_THERAPY = "Update MaintenanceTherapyTable set MaintenanceTherapyName = ? where MaintenanceTheraphyID = ?";

	String UPDATE_TREATMENT_AAPHSMDS = "Update TreatmentTable set Transplant = ?, DateStarted = ? where TreatmentID = ?";
	String UPDATE_TREATMENT_COAGULATION = "";
	String UPDATE_TREATMENT_LEUKEMIA = "Update TreatmentTable set DateStarted = ?, CycleNumber = ? where TreatmentID = ?";
	String UPDATE_TREATMENT_LYMPHOMA = "Update TreatmentTable set DateStarted = ?, CycleNumber = ?, Complications = ? where TreatmentID = ?";
	String UPDATE_TREATMENT_MYELOPROLIFERATIVE = "Update TreatmentTable set DateStarted = ? where TreatmentID = ?";
	String UPDATE_TREATMENT_PLASMACELL = "Update TreatmentTable set DateStarted = ?, OtherRegimen = ?, OtherRegimenTransplant = ?, OtherRegimenNonTransplant = ? , OtherRegimenMaintenanceTherapy = ?, CycleNumber = ?, Complications = ?  where TreatmentID = ?";
	String UPDATE_TREATMENT_PLATELETCELL = "Update TreatmentTable set DateStarted = ?, Complications = ?where TreatmentID = ?";

	String UPDATE_OTHERTREATMENT = "Update OtherTreatmentTable set Bisphosphonates = ?, Radiotherapy = ?, OtherMedications = ?, Complications = ? where OtherTreatmentID = ?";
	String UPDATE_DISEASE_STATUS = "Update DiseaseStatusTable set DiseaseStatus = ? where DiseaseStatusID = ?";
	String UPDATE_PATIENT_AAPHSMDS = "";
	String UPDATE_PATIENT_COAGULATION = "";
	String UPDATE_PATIENT_LEUKEMIA = "";
	String UPDATE_PATIENT_LYMPHOMA = "";
	String UPDATE_PATIENT_MYELOPROLIFERATIVE = "";
	String UPDATE_PATIENT_PLASMACELL = "";
	String UPDATE_PATIENT_PLATELETCELL = "";

}
