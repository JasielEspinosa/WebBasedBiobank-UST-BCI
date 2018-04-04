package utility.database;

public interface SQLCommandsBaseline {

	String key = "il0v3c@nCer4lif3";

	// BASELINE QUERIES

	//PATIENT'S ADDRESS
	String INSERT_ADDRESS = "INSERT INTO AddressTable VALUES (NULL, ?, ?, ?)";
	String GET_ADDRESS = "SELECT * FROM AddressTable WHERE ADDRESSID = ?";
	String UPDATE_ADDRESS = "UPDATE AddressTable SET StreetAddress = ? , City = ? , ZIPCode = ? WHERE AddressID = ?";

	//TISUE SPECIMEN
	String INSERT_TISSUE_SPECIMEN = "INSERT INTO TissueSpecimenTable VALUES (NULL,?)";
	String GET_TISSUESPECIMEN = "SELECT * FROM TissueSpecimenTable WHERE TissueSpecimenID = ?";
	String UPDATE_TISSUE_SPECIMEN = "UPDATE TissueSpecimenTable SET TissueSpecimenName = ? WHERE TissueSpecimenID = ?";

	//GENERAL DATA
	String INSERT_GENERAL_DATA = "INSERT INTO GeneralDataTable VALUES(NULL,HEX(AES_ENCRYPT(?, '" + key + "')),HEX(AES_ENCRYPT(?, '" + key + "')),HEX(AES_ENCRYPT(?, '" + key + "')),?,HEX(AES_ENCRYPT(?, '" + key + "')),HEX(AES_ENCRYPT(?, '" + key + "')),(SELECT MAX(AddressID) FROM AddressTable),(SELECT MAX(TissueSpecimenID) FROM TissueSpecimenTable))";
	String INSERT_GENERAL_DATA_NO_TISSUE = "INSERT INTO GeneralDataTable (GeneralDataID,LastName,FirstName,MiddleName,Gender,DateOfBirth,DateOfEntry,AddressID) " + "VALUES (NULL,HEX(AES_ENCRYPT(?, '" + key + "')),HEX(AES_ENCRYPT(?, '" + key + "')),HEX(AES_ENCRYPT(?, '" + key + "')),?,HEX(AES_ENCRYPT(?, '" + key + "')),HEX(AES_ENCRYPT(?, '" + key + "')),(SELECT MAX(AddressID) FROM AddressTable))";
	String GET_GENERAL_DATA = "SELECT *, AES_DECRYPT(UNHEX(LastName), '" + key + "') as LastNameDec, AES_DECRYPT(UNHEX(FirstName), '" + key + "') as FirstNameDec, AES_DECRYPT(UNHEX(MiddleName), '" + key + "') as MiddleNameDec, CONVERT(AES_DECRYPT(UNHEX(DateOfBirth), '" + key + "'), DATE) as DateOfBirthDec, CONVERT(AES_DECRYPT(UNHEX(DateOfEntry), '" + key + "'), DATE) as DateOfEntryDec FROM GeneralDataTable WHERE GeneralDataID = ?";
	String UPDATE_GENERAL_DATA = "UPDATE GeneralDataTable SET LastName = HEX(AES_ENCRYPT(?, '" + key + "')) , FirstName = HEX(AES_ENCRYPT(?, '" + key + "')), MiddleName = HEX(AES_ENCRYPT(?, '" + key + "')), Gender = ?, DateOfBirth = HEX(AES_ENCRYPT(?, '" + key + "')), DateOfEntry = HEX(AES_ENCRYPT(?, '" + key + "')) WHERE GeneralDataID = ?";

	//PROGNOSTIC RISK SCORING
	String INSERT_PROGNOSTIC_RISK_SCORING = "INSERT INTO PrognosticRiskScoringTable VALUES (NULL,?,?)";
	String GET_PROGNOSTIC_RISK_SCORING = "SELECT * FROM PrognosticRiskScoringTable WHERE PrognosticRiskScoringID = ?";
	String UPDATE_PROGNOSTIC_RISK_SCORING = "UPDATE PrognosticRiskScoringTable SET PrognosticRiskScoringName = ?, OtherPrognosticRiskScoring = ? WHERE PrognosticRiskScoringID = ?";

	//RISK SCORE
	String INSERT_RISK_SCORE = "INSERT INTO RiskScoreTable VALUES (NULL,?,?)";
	String GET_RISK_SCORE = "SELECT * FROM RiskScoreTable WHERE RiskScoreID = ?";
	String UPDATE_RISK_SCORE = "UPDATE RiskScoreTable SET RiskScoreName = ?, OtherRiskScore = ? WHERE RiskScoreID = ?";

	//CLASSIFICATION
	String INSERT_CLASSIFICATION = "INSERT INTO ClassificationTable VALUES (NULL,?)";
	String GET_CLASSIFICATION = "SELECT * FROM ClassificationTable WHERE ClassificationID = ?";
	String UPDATE_CLASSIFCATION = "UPDATE ClassificationTable SET ClassificationName = ? WHERE ClassificationID = ?";

	//ISS STAGING
	String INSERT_ISSSTAGING = "INSERT INTO ISSStagingTable VALUES (NULL,?)";
	String GET_ISSSTAGING = "SELECT * FROM ISSStagingTable WHERE ISSStagingID = ?";
	String UPDATE_ISSSTAGING = "UPDATE ISSStagingTable SET ISSStagingName = ? WHERE ISSStagingID = ? ";

	//SEVERITY
	String INSERT_SEVERITY = "INSERT INTO SeverityTable VALUES (NULL,?)";
	String GET_SEVERITY = "SELECT * FROM SeverityTable WHERE SeverityID = ?";
	String UPDATE_SEVERITY = "UPDATE SeverityTable SET SeverityName = ? WHERE SeverityID = ?";

	//PHYSICAL EXAM
	String INSERT_PHYSICAL_EXAM_AAPHSMDS = "INSERT INTO PhysicalExamTable VALUES (NULL, ?,?,?,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,?);";
	String INSERT_PHYSICAL_EXAM_COAGULATION = "INSERT INTO PhysicalExamTable VALUES (NULL, ?,?,NULL,NULL,NULL,NULL,?,?,NULL,NULL,NULL,?)";
	String INSERT_PHYSICAL_EXAM_LEUKEMIA = "INSERT INTO PhysicalExamTable VALUES (NULL,?,?,?,?,?,?,NULL,NULL,NULL,NULL,NULL,?)";
	String INSERT_PHYSICAL_EXAM_LYMPHOMA = "INSERT INTO PhysicalExamTable VALUES (NULL,?,?,?,?,?,?,NULL,NULL,NULL,NULL,NULL,?)";
	String INSERT_PHYSICAL_EXAM_MYELOPROLIFERATIVE = "INSERT INTO PhysicalExamTable VALUES (NULL,?,?,?,?,?,?,NULL,NULL,?,NULL,NULL,?)";
	String INSERT_PHYSICAL_EXAM_PLASMACELL = "INSERT INTO PhysicalExamTable VALUES (NULL,?,?,?,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,?)";
	String INSERT_PHYSICAL_EXAM_PLATELETCELL = "INSERT INTO PhysicalExamTable VALUES (NULL,?,?,NULL,?,NULL,NULL,NULL,NULL,NULL,?,NULL,?)";

	String GET_PHYSICAL_EXAM = "SELECT * FROM PHYSICALEXAMTABLE WHERE PHYSICALEXAMID = ?";

	String UPDATE_PHYSICAL_EXAM_AAPHSMDS = "UPDATE PhysicalExamTable SET Height = ?, Weight = ?, ECOG = ? , OtherFindings = ? WHERE PhysicalExamID = ?";
	String UPDATE_PHYSICAL_EXAM_COAGULATION = "UPDATE PhysicalExamTable SET Height = ?, Weight = ?, Hemathroses = ?, ContracturesAndMuscleAtrophy = ? , OtherFindings = ? WHERE PhysicalExamID = ?";
	String UPDATE_PHYSICAL_EXAM_LEUKEMIA = "UPDATE PhysicalExamTable SET Height = ?, Weight = ?, ECOG = ?, Splenomegaly = ?, Hepatomegaly = ?, Lymphadenopathies = ? , OtherFindings = ? WHERE PhysicalExamID = ?";
	String UPDATE_PHYSICAL_EXAM_LYMPHOMA = "UPDATE PhysicalExamTable SET Height = ?, Weight = ?, ECOG = ?, Splenomegaly = ?, Hepatomegaly = ?, Lymphadenopathies = ? , OtherFindings = ? WHERE PhysicalExamID = ?";
	String UPDATE_PHYSICAL_EXAM_MYELOPROLIFERATIVE = "UPDATE PhysicalExamTable SET Height = ?, Weight = ?, ECOG = ?, Splenomegaly = ?, Hepatomegaly = ?, Lymphadenopathies = ?, ThrombosisHistory = ?, OtherFindings = ? WHERE PhysicalExamID = ?";
	String UPDATE_PHYSICAL_EXAM_PLASMACELL = "UPDATE PhysicalExamTable SET Height = ?, Weight = ?, ECOG = ?, ThrombosisHistory = ? , OtherFindings = ? WHERE PhysicalExamID = ?";
	String UPDATE_PHYSICAL_EXAM_PLATELETCELL = "UPDATE PhysicalExamTable SET Height = ?, Weight = ?, Splenomegaly = ?, Skin = ?, OtherFindings = ? WHERE PhysicalExamID = ?";

	//CLINICAL DATA
	String INSERT_CLINICAL_DATA_AAPHSMDS = "INSERT INTO ClinicalDataTable " + "(ClinicalDataID,DateOfVisit,Diagnosis,ClassificationID,ChiefComplaint,OtherSymptoms,Comorbidities,SmokingHistory,AlcoholIntakeHistory,ChemicalExposure,PreviousInfection,PreviousHematologicDisorder,PhysicalExamID) " + "VALUES (NULL, HEX(AES_ENCRYPT(?, '" + key + "')), ?, (SELECT MAX(ClassificationID) FROM ClassificationTable), ?, ?, ?, ?, ?, ?, ?, ?,(SELECT MAX(PhysicalExamID) FROM PhysicalExamTable))";
	String INSERT_CLINICAL_DATA_COAGULATION = "INSERT INTO ClinicalDataTable " + "(ClinicalDataID,DateOfVisit,Diagnosis,OtherDiagnosis,SeverityID,ChiefComplaint,OtherSymptoms,Comorbidities,SmokingHistory,AlcoholIntakeHistory,ChemicalExposure,PhysicalExamID,OtherFindings) " + "VALUES (NULL,HEX(AES_ENCRYPT(?, '" + key + "')),?,?,(SELECT MAX(SeverityID) FROM SeverityTable),?,?,?,?,?,?,(SELECT MAX(PhysicalExamID) FROM PhysicalExamTable),?)";
	String INSERT_CLINICAL_DATA_LEUKEMIA = "INSERT INTO ClinicalDataTable " + "(ClinicalDataID,DateOfVisit,Diagnosis,RiskScoreID,ChiefComplaint,ConstitutionalSymptoms,OtherSymptoms,Comorbidities,SmokingHistory,AlcoholIntakeHistory,ChemicalExposure,PreviousInfection,PreviousHematologicDisorder,PhysicalExamID) " + "VALUES (NULL,HEX(AES_ENCRYPT(?, '" + key + "')),?,(SELECT MAX(RiskScoreID) FROM RiskScoreTable),?,?,?,?,?,?,?,?,?,(SELECT MAX(PhysicalExamID) FROM PhysicalExamTable))";
	String INSERT_CLINICAL_DATA_LYMPHOMA = "INSERT INTO ClinicalDataTable " + "(ClinicalDataID,DateOfVisit,Diagnosis,StageOfDisease,ChiefComplaint,ConstitutionalSymptoms,OtherSymptoms,Comorbidities,SmokingHistory,AlcoholIntakeHistory,ChemicalExposure,PhysicalExamID,OtherFindings) " + "VALUES (NULL,HEX(AES_ENCRYPT(?, '" + key + "')),?,?,?,?,?,?,?,?,?,(SELECT MAX(PhysicalExamID) FROM PhysicalExamTable),?)";
	String INSERT_CLINICAL_DATA_MYELOPROLIFERATIVE = "INSERT INTO ClinicalDataTable " + "(ClinicalDataID,DateOfVisit,Diagnosis,OtherDiagnosis,PrognosticRiskScoringID,RiskScoreID,ChiefComplaint,ConstitutionalSymptoms,OtherSymptoms,Comorbidities,SmokingHistory,AlcoholIntakeHistory,ChemicalExposure,PhysicalExamID,OtherFindings) " + "VALUES (NULL,HEX(AES_ENCRYPT(?, '" + key + "')),?,?,(SELECT MAX(PrognosticRiskScoringID) FROM PrognosticRiskScoringTable),(SELECT MAX(RiskScoreID) FROM RiskScoreTable),?,?,?,?,?,?,?,(SELECT MAX(PhysicalExamID) FROM PhysicalExamTable),?)";
	String INSERT_CLINICAL_DATA_PLASMACELL = "INSERT INTO ClinicalDataTable " + "(ClinicalDataID,DateOfVisit,Diagnosis,ISSStagingID,ChiefComplaint,ConstitutionalSymptoms,OtherSymptoms,Comorbidities,SmokingHistory,AlcoholIntakeHistory,ChemicalExposure,PhysicalExamID,OtherFindings) " + "VALUES (NULL,HEX(AES_ENCRYPT(?, '" + key + "')),?,(SELECT MAX(ISSStagingID) FROM ISSStagingTable),?,?,?,?,?,?,?,(SELECT MAX(PhysicalExamID) FROM PhysicalExamTable),?)";
	String INSERT_CLINICAL_DATA_PLATELETCELL = "INSERT INTO ClinicalDataTable " + "(ClinicalDataID,DateOfVisit,Diagnosis,OtherDiagnosis,ChiefComplaint,ConstitutionalSymptoms,OtherSymptoms,Comorbidities,SmokingHistory,AlcoholIntakeHistory,ChemicalExposure,PhysicalExamID,OtherFindings) " + "VALUES (NULL,HEX(AES_ENCRYPT(?, '" + key + "')),?,?,?,?,?,?,?,?,?,(SELECT MAX(PhysicalExamID) FROM PhysicalExamTable),?)";

	String GET_CLINICAL_DATA_BASELINE = "SELECT *, CONVERT(AES_DECRYPT(UNHEX(DateOfVisit), '" + key + "'), DATE) as DateOfVisitDec FROM ClinicalDataTable WHERE ClinicalDataID = ?";

	String UPDATE_CLINICAL_DATA_AAPHSMDS = "UPDATE ClinicalDataTable SET DateOfVisit = HEX(AES_ENCRYPT(?, '" + key + "')) , Diagnosis = ?, ChiefComplaint = ?, OtherSymptoms = ?, Comorbidities = ?, SmokingHistory = ?, AlcoholIntakeHistory = ?, ChemicalExposure = ?, PreviousInfection= ?, PreviousHematologicDisorder = ? WHERE ClinicalDataID = ? ";
	String UPDATE_CLINICAL_DATA_COAGULATION = "UPDATE ClinicalDataTable SET DateOfVisit = HEX(AES_ENCRYPT(?, '" + key + "')) , Diagnosis = ?, OtherDiagnosis = ?, ChiefComplaint = ?, OtherSymptoms = ?, Comorbidities = ?, SmokingHistory = ?, AlcoholIntakeHistory = ?, ChemicalExposure = ?, OtherFindings = ? WHERE ClinicalDataID = ? ";
	String UPDATE_CLINICAL_DATA_LEUKEMIA = "UPDATE ClinicalDataTable SET DateOfVisit = HEX(AES_ENCRYPT(?, '" + key + "')) , Diagnosis = ?, ChiefComplaint = ?, ConstitutionalSymptoms = ?, OtherSymptoms = ?, Comorbidities = ?, SmokingHistory = ?, AlcoholIntakeHistory = ?, ChemicalExposure = ?, PreviousInfection= ?, PreviousHematologicDisorder = ? WHERE ClinicalDataID = ? ";
	String UPDATE_CLINICAL_DATA_LYMPHOMA = "UPDATE ClinicalDataTable SET DateOfVisit = HEX(AES_ENCRYPT(?, '" + key + "')) , Diagnosis = ?, StageOfDisease = ? ,ChiefComplaint = ?, ConstitutionalSymptoms = ?, OtherSymptoms = ?, Comorbidities = ?, SmokingHistory = ?, AlcoholIntakeHistory = ?, ChemicalExposure = ?, OtherFindings= ? WHERE ClinicalDataID = ? ";
	String UPDATE_CLINICAL_DATA_MYELOPROLIFERATIVE = "UPDATE ClinicalDataTable SET DateOfVisit = HEX(AES_ENCRYPT(?, '" + key + "')) , Diagnosis = ?, OtherDiagnosis = ?, ChiefComplaint = ?, ConstitutionalSymptoms = ?, OtherSymptoms = ?, Comorbidities = ?, SmokingHistory = ?, AlcoholIntakeHistory = ?, ChemicalExposure = ?, OtherFindings= ? WHERE ClinicalDataID = ? ";
	String UPDATE_CLINICAL_DATA_PLASMACELL = "UPDATE ClinicalDataTable SET DateOfVisit = HEX(AES_ENCRYPT(?, '" + key + "')) , Diagnosis = ?, ChiefComplaint = ?, ConstitutionalSymptoms = ?, OtherSymptoms = ?, Comorbidities = ?, SmokingHistory = ?, AlcoholIntakeHistory = ?, ChemicalExposure = ?, OtherFindings= ? WHERE ClinicalDataID = ? ";
	String UPDATE_CLINICAL_DATA_PLATELETCELL = "UPDATE ClinicalDataTable SET DateOfVisit = HEX(AES_ENCRYPT(?, '" + key + "')), Diagnosis = ?, OtherDiagnosis = ?, ChiefComplaint = ?, ConstitutionalSymptoms = ?, OtherSymptoms = ?, Comorbidities = ?, SmokingHistory = ?, AlcoholIntakeHistory = ?, ChemicalExposure = ?, OtherFindings= ? WHERE ClinicalDataID = ? ";

	//FAMILY CANCER
	String INSERT_FAMILY_CANCER = "INSERT INTO FamilyCancerTable VALUES (NULL, (SELECT MAX(ClinicalDataID) FROM ClinicalDataTable),?,?)";
	String GET_FAMILY_CANCER = "SELECT * FROM FamilyCancerTable WHERE CLINICALDATAID = ?";
	String UPDATE_FAMILY_CANCER = "UPDATE FamilyCancerTable SET RelationshipToPatient = ?, CancerName = ? WHERE ClinicalDataID = ?";

	//OTHER DISEASES
	String INSERT_OTHERDISEASES = "INSERT INTO OtherDiseasesTable VALUES (NULL, (SELECT MAX(ClinicalDataID) FROM ClinicalDataTable), ?)";
	String GET_OTHER_DISEASES = "SELECT * FROM OTHERDISEASESTABLE WHERE CLINICALDATAID = ?";
	String UPDATE_OTHERDISEASES = "UPDATE OtherDiseasesTable SET OtherDiseases = ? WHERE ClinicalDataID = ?";

	//MEDICATIONS
	String INSERT_MEDICATIONS = "INSERT INTO MedicationsTable VALUES (NULL, (SELECT MAX(ClinicalDataID) FROM ClinicalDataTable),?,?,?)";
	String GET_MEDICATIONS = "SELECT * FROM MEDICATIONSTABLE WHERE CLINICALDATAID = ?";
	String UPDATE_MEDICATIONS = "UPDATE MedicationsTable SET GenericName = ? , Dose = ? , Frequency = ? WHERE ClinicalDataID = ? ";

	//HEMATOLOGY
	String INSERT_HEMATOLOGY_AAPHSMDS = "INSERT INTO HematologyTable VALUES (NULL,?,?,?,?,?,?,?,?,?,?,?,?);";
	String INSERT_HEMATOLOGY_COAGULATION = "INSERT INTO HematologyTable VALUES (NULL,?,?,?,?,?,?,?,?,NULL,NULL,NULL,?)";
	String INSERT_HEMATOLOGY_LEUKEMIA = "INSERT INTO HematologyTable VALUES (NULL,?,?,?,?,?,?,?,?,?,?,?,?)";
	String INSERT_HEMATOLOGY_LYMPHOMA = "INSERT INTO HematologyTable VALUES (NULL,?,?,?,?,?,?,?,?,?,?,?,?)";
	String INSERT_HEMATOLOGY_MYELOPROLIFERATIVE = "INSERT INTO HematologyTable VALUES (NULL,?,?,?,?,?,?,?,?,?,?,?,?)";
	String INSERT_HEMATOLOGY_PLASMACELL = "INSERT INTO HematologyTable VALUES (NULL,?,?,?,?,?,?,?,?,?,?,?,?)";
	String INSERT_HEMATOLOGY_PLATELETCELL = "INSERT INTO HematologyTable VALUES (NULL,?,?,?,?,?,?,?,?,NULL,NULL,NULL,?)";

	String GET_HEMATOLOGY = "SELECT * FROM HematologyTable WHERE HematologyID = ?";

	String UPDATE_HEMATOLOGY_AAPHSMDS = "UPDATE HematologyTable SET Hemoglobin = ?, Hematocrit = ? , WhiteBloodCells = ?, Neutrophils = ?, Lymphocytes = ?," + " Monocytes = ?, Eosinophils = ? , Basophils = ? , Myelocytes = ? , Metamyelocytes = ? , Blasts = ? , PlateletCount = ? WHERE HematologyID = ?";
	String UPDATE_HEMATOLOGY_COAGULATION = "UPDATE HematologyTable SET Hemoglobin = ?, Hematocrit = ? , WhiteBloodCells = ?, Neutrophils = ?, Lymphocytes = ?," + " Monocytes = ?, Eosinophils = ? , Basophils = ? , PlateletCount = ? WHERE HematologyID = ?";
	String UPDATE_HEMATOLOGY_LEUKEMIA = "UPDATE HematologyTable SET Hemoglobin = ?, Hematocrit = ? , WhiteBloodCells = ?, Neutrophils = ?, Lymphocytes = ?," + " Monocytes = ?, Eosinophils = ? , Basophils = ? , Myelocytes = ? , Metamyelocytes = ? , Blasts = ? , PlateletCount = ? WHERE HematologyID = ?";
	String UPDATE_HEMATOLOGY_LYMPHOMA = "UPDATE HematologyTable SET Hemoglobin = ?, Hematocrit = ? , WhiteBloodCells = ?, Neutrophils = ?, Lymphocytes = ?," + " Monocytes = ?, Eosinophils = ? , Basophils = ? , Myelocytes = ? , Metamyelocytes = ? , Blasts = ? , PlateletCount = ? WHERE HematologyID = ?";
	String UPDATE_HEMATOLOGY_MYELOPROLIFERATIVE = "UPDATE HematologyTable SET Hemoglobin = ?, Hematocrit = ? , WhiteBloodCells = ?, Neutrophils = ?, Lymphocytes = ?," + " Monocytes = ?, Eosinophils = ? , Basophils = ? , Myelocytes = ? , Metamyelocytes = ? , Blasts = ? , PlateletCount = ? WHERE HematologyID = ?";
	String UPDATE_HEMATOLOGY_PLASMACELL = "UPDATE HematologyTable SET Hemoglobin = ?, Hematocrit = ? , WhiteBloodCells = ?, Neutrophils = ?, Lymphocytes = ?," + " Monocytes = ?, Eosinophils = ? , Basophils = ? , Myelocytes = ? , Metamyelocytes = ? , Blasts = ? , PlateletCount = ? WHERE HematologyID = ?";
	String UPDATE_HEMATOLOGY_PLATELETCELL = "UPDATE HematologyTable SET Hemoglobin = ?, Hematocrit = ? , WhiteBloodCells = ?, Neutrophils = ?, Lymphocytes = ?," + " Monocytes = ?, Eosinophils = ? , Basophils = ? , PlateletCount = ? WHERE HematologyID = ?";

	//COAGULATION
	String INSERT_COAGULATION_TESTING = "INSERT INTO CoagulationTestingTable VALUES (NULL,?,?,?,?)";
	String GET_COAGULATION_TESTING = "SELECT * FROM COAGULATIONTESTINGTABLE WHERE COAGULATIONTESTINGID = ?";
	String UPDATE_COAGULATION_TESTING = "UPDATE CoagulationTestingTable SET FactorVIIILevel = ?, FactorIXLevel = ? , InhibitorAssay = ?, BethesdaUnits = ? WHERE CoagulationTestingID = ?";

	//BLOOD CHEMISTRY
	String INSERT_BLOOD_CHEMISTRY_COAGULATION = "INSERT INTO BloodChemistryTable(BloodChemistryID,Creatinine,UricAcid,SGOT,SGPT,LDH,Na,K) VALUES (NULL,?,?,?,?,?,?,?)";
	String INSERT_BLOOD_CHEMISTRY_LEUKEMIA = "INSERT INTO BloodChemistryTable(BloodChemistryID,Creatinine,UricAcid,SGOT,SGPT,LDH,Na,K) VALUES (NULL,?,?,?,?,?,?,?)";
	String INSERT_BLOOD_CHEMISTRY_LYMPHOMA = "INSERT INTO BloodChemistryTable(BloodChemistryID,Creatinine,UricAcid,SGOT,SGPT,LDH,Na,K,BilirubinTotal,BilirubinDirect,BilirubinIndirect,Beta2Microglobulin,HepatitisBTesting,ESR) VALUES (NULL,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	String INSERT_BLOOD_CHEMISTRY_MYELOPROLIFERATIVE = "INSERT INTO BloodChemistryTable(BloodChemistryID,Creatinine,UricAcid,SGOT,SGPT,LDH,EPOLevel) VALUES (NULL,?,?,?,?,?,?)";
	String INSERT_BLOOD_CHEMISTRY_PLASMACELL = "INSERT INTO BloodChemistryTable(BloodChemistryID,BloodUreaNitrogen,Creatinine,UricAcid,LDH,Na,K,Beta2Microglobulin,iCa,TotalProtein,Albumin,Globulin) VALUES (NULL,?,?,?,?,?,?,?,?,?,?,?)";
	String INSERT_BLOOD_CHEMISTRY_PLATELET = "INSERT INTO BloodChemistryTable(BloodChemistryID,Creatinine,UricAcid,SGOT,SGPT,LDH,Na,K,ANATiter,HepatitisCRna) VALUES (NULL,?,?,?,?,?,?,?,?,?)";

	String GET_BLOOD_CHEMISTRY = "SELECT * FROM BLOODCHEMISTRYTABLE WHERE BLOODCHEMISTRYID = ?";

	String UPDATE_BLOOD_CHEMISTRY_COAGULATION = "UPDATE BloodChemistryTable SET Creatinine = ?, UricAcid = ?, SGOT = ?, SGPT = ?, LDH = ? , Na = ?, K = ? WHERE BloodChemistryID = ? ";
	String UPDATE_BLOOD_CHEMISTRY_LEUKEMIA = "UPDATE BloodChemistryTable SET Creatinine = ?, UricAcid = ?, SGOT = ?, SGPT = ?, LDH = ? , Na = ?, K = ? WHERE BloodChemistryID = ? ";
	String UPDATE_BLOOD_CHEMISTRY_LYMPHOMA = "UPDATE BloodChemistryTable SET Creatinine = ?, UricAcid = ?, SGOT = ?, SGPT = ?, LDH = ? , Na = ?, K = ?," + " BilirubinTotal = ?, BilirubinDirect = ?, BilirubinIndirect = ?, Beta2Microglobulin = ?, HepatitisBTesting = ?, ESR = ? WHERE BloodChemistryID = ? ";
	String UPDATE_BLOOD_CHEMISTRY_MYELOPROLIFERATIVE = "UPDATE BloodChemistryTable SET Creatinine = ?, UricAcid = ?, SGOT = ?, SGPT = ?, LDH = ? , EPOLevel = ? WHERE BloodChemistryID = ? ";
	String UPDATE_BLOOD_CHEMISTRY_PLASMACELL = "UPDATE BloodChemistryTable SET BloodUreaNitrogen = ?, Creatinine = ?, UricAcid = ?, LDH = ? , Na = ?, K = ?," + "  Beta2Microglobulin = ?, iCa = ?, TotalProtein = ? , Albumin = ? , Globulin = ? WHERE BloodChemistryID = ? ";
	String UPDATE_BLOOD_CHEMISTRY_PLATELETCELL = "UPDATE BloodChemistryTable SET Creatinine = ?, UricAcid = ?, SGOT = ?, SGPT = ?, LDH = ? , EPOLevel = ? WHERE BloodChemistryID = ? ";

	//OTHER LABORATORIES
	String INSERT_OTHER_LABORATORIES_AAPHSMDS = "INSERT INTO OtherLaboratoriesTable VALUES (NULL,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	String GET_OTHER_LABORATORIES_AAPNHMDS = "SELECT * FROM OtherLaboratoriesTable WHERE OtherLaboratoriesID = ?";
	String UPDATE_OTHER_LABORATORIES_AAPHSMDS = "UPDATE OtherLaboratoriesTable SET Creatinine = ?, UricAcid = ? , ReticulocyteCount = ?, SerumIron = ? , IronBindingCapacity = ?, " + "SerumFerritin = ?, DirectAntiglobulin = ?, IndirectAntiglobulin = ?, SGOT = ?, SGPT = ?, LDH = ?, ScreenTestHepatitis = ?, ScreenTestEBVCytomegalovirusHIV = ?, ErythropeitinLevel = ?," + " SerumFolicAcid = ?, SerumFolicAcid = ?, TSH = ? WHERE OtherLaboratoriesID = ? ";

	//BONE MARROW ASPIRATE
	String INSERT_BONE_MARROW_ASPIRATE = "INSERT INTO BoneMarrowAspirateTable VALUES (NULL,?,?)";
	String GET_BONE_MARROW_ASPIRATE = "SELECT * FROM BoneMarrowAspirateTable WHERE BoneMarrowAspirateID = ?";
	String UPDATE_BONE_MARROW_ASPIRATE = "UPDATE BoneMarrowAspirateTable SET DatePerformed = ?, Result = ? WHERE BoneMarrowAspirateID = ?";

	//FLOW CYTOMETRY
	String INSERT_FLOWCYTOMETRY = "INSERT INTO FlowCytometryTable VALUES (NULL,?)";
	String GET_FLOWCYTOMETRY = "SELECT * FROM FLOWCYTOMETRYTABLE WHERE FLOWCYTOMETRYID = ?";
	String UPDATE_FLOWCYTOMETRY = "UPDATE FlowCytometryTable SET Result = ? WHERE FlowCytometryID = ?";

	//CYTOGENETIC MOLECULARS
	String INSERT_CYTOGENETIC_MOLECULAR_AAPNH_AAPHSMDS = "INSERT INTO CytogeneticMolecularAAPNHTable VALUES (NULL,?)";
	String GET_CYTOGENETIC_MOLECULAR_AAPNH_AAPNHMDS = "SELECT * FROM CytogeneticMolecularAAPNHTable WHERE CytogeneticMolecularAAPNHID = ?";
	String UPDATE_CYTOGENETIC_MOLECULAR_AAPNH_AAPHSMDS = "UPDATE CytogeneticMolecularAAPNHTable SET Result = ? WHERE CytogeneticMolecularAAPNHID = ?";

	String INSERT_CYTOGENETIC_MOLECULAR_MDS_AAPHSMDS = "INSERT INTO CytogeneticMolecularMDSTable VALUES (NULL,?)";
	String GET_CYTOGENETIC_MOLECULAR_MDS_AAPNHMDS = "SELECT * FROM CytogeneticMolecularMDSTable WHERE CytogeneticMolecularMDSID = ?";
	String UPDATE_CYTOGENETIC_MOLECULAR_MDS_AAPHSMDS = "UPDATE CytogeneticMolecularMDSTable SET Result = ? WHERE CytogeneticMolecularMDSID = ?";

	String INSERT_CYTOGENETIC_MOLECULAR_AAPNH_LEUKEMIA = "INSERT INTO CytogeneticMolecularAAPNHTable VALUES (NULL,?)";
	String UPDATE_CYTOGENETIC_MOLECULAR_AAPNH_LEUKEMIA = "UPDATE CytogeneticMolecularAAPNHTable SET Result = ? WHERE CytogeneticMolecularAAPNHID = ?";

	String INSERT_CYTOGENETIC_MOLECULAR = "INSERT INTO CytogeneticMolecularTable VALUES (NULL,?)";
	String GET_CYTOGENETIC_MOLECULAR = "SELECT * FROM CytogeneticMolecularTable WHERE CytogeneticMolecularID = ?";
	String UPDATE_CYTOGENETIC_MOLECULAR = "UPDATE CytogeneticMolecularTable SET Result = ? WHERE CytogeneticMolecularID = ?";

	//IMAGING_STUDIES
	String INSERT_IMAGING_STUDIES = "INSERT INTO ImagingStudiesTable VALUES (NULL, ?);";
	String GET_IMAGING_STUDIES = "SELECT * FROM ImagingStudiesTable WHERE ImagingStudiesID = ?";
	String UPDATE_IMAGING_STUDIES = "UPDATE ImagingStudiesTable SET Result = ? WHERE ImagingStudiesID = ? ";

	//UPPERGIENDOSCOPY
	String INSERT_UPPERGIENDOSCOPY = "INSERT INTO UpperGIEndoscopyTable VALUES (NULL,?,?,?)";
	String GET_UPPERGIENDOSCOPY = "SELECT * FROM UpperGIEndoscopyTable WHERE UpperGIEndoscopyID = ?";
	String UPDATE_UPPERGIENDOSCOPY = "UPDATE UpperGIEndoscopyTable SET DatePerformed = ?, Description = ? , HPylori = ? WHERE UpperGIEndoscopyID = ? ";

	//HEMATOPATHOLOGY
	String INSERT_HEMATOPATHOLOGY = "INSERT INTO HematopathologyTable VALUES (NULL,?,?)";
	String GET_HEMATOPATHOLOGY = "SELECT * FROM HematopathologyTable WHERE HematopathologyID = ?";
	String UPDATE_HEMATOPATHOLOGY = "UPDATE HematopathologyTable SET DatePerformed = ?, Result = ? WHERE HematopathologyID = ?";

	//IMMUNOHISTOCHEMISTRY
	String INSERT_IMMUNOHISTOCHEMISTRY = "INSERT INTO ImmunohistochemistryTable VALUES (NULL,?,?)";
	String GET_IMMUNOHISTOCHEMISTRY = "SELECT * FROM ImmunohistochemistryTable WHERE ImmunohistochemistryID = ?";
	String UPDATE_IMMUNOHISTOCHEMISTRY = "UPDATE ImmunohistochemistryTable SET DatePerformed = ?, Result = ? WHERE ImmunohistochemistryID = ?";

	//SERUM
	String INSERT_SERUMFREE = "INSERT INTO SerumFreeTable VALUES (NULL,?)";
	String GET_SERUMFREE = "SELECT * FROM SerumFreeTable WHERE SerumFreeID = ?";
	String UPDATE_SERUMFREE = "UPDATE SerumFreeTable SET Result = ? WHERE SerumFreeID = ?";

	String INSERT_SERUMPROTEIN = "INSERT INTO SerumProteinTable VALUES (NULL,?)";
	String GET_SERUMPROTEIN = "SELECT * FROM SerumProteinTable WHERE SerumProteinID = ?";
	String UPDATE_SERUMPROTEIN = "UPDATE SerumProteinTable SET Result = ? WHERE SerumProteinID = ?";

	String INSERT_SERUMIMMUNOFIXATION = "INSERT INTO SerumImmunofixationTable VALUES (NULL,?)";
	String GET_SERUMIMMUNOFIXATION = "SELECT * FROM SerumImmunofixationTable WHERE SerumImmunofixationID = ?";
	String UPDATE_SERUMIMMUNOFIXATION = "UPDATE SerumImmunofixationTable SET Result = ? WHERE SerumImmunofixationID = ?";

	//URINE PROTEIN
	String INSERT_URINEPROTEIN = "INSERT INTO UrineProteinTable VALUES (NULL,?)";
	String GET_URINEPROTEIN = "SELECT * FROM UrineProteinTable WHERE UrineProteinID = ?";
	String UPDATE_URINEPROTEIN = "UPDATE UrineProteinTable SET Result = ? WHERE UrineProteinID = ?";

	//LABORATORY PROFILE
	String INSERT_LABORATORY_PROFILE_AAPHSMDS = "INSERT INTO LaboratoryProfileTable " + "(LaboratoryID,DateOfBloodCollection,HematologyID,OtherLaboratoriesID,BoneMarrowAspirateID,FlowCytometryID,CytogeneticMolecularAAPNHID, CytogeneticMolecularMDSID) " + "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM HematologyTable)," + "(SELECT MAX(OtherLaboratoriesID) FROM OtherLaboratoriesTable)," + "(SELECT MAX(BoneMarrowAspirateID) FROM BoneMarrowAspirateTable),(SELECT MAX(FlowCytometryID) FROM FlowCytometryTable)," + "(SELECT MAX(CytogeneticMolecularAAPNHID) FROM CytogeneticMolecularAAPNHTable)," + "(SELECT MAX(CytogeneticMolecularMDSID) FROM CytogeneticMolecularMDSTable))";
	String INSERT_LABORATORY_PROFILE_COAGULATION = "INSERT INTO LaboratoryProfileTable " + "(LaboratoryID,DateOfBloodCollection,HematologyID,CoagulationTestingID,BloodChemistryID,ImagingStudiesID) " + "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM HematologyTable)," + "(SELECT MAX(CoagulationTestingID) FROM CoagulationTestingTable)," + "(SELECT MAX(BloodChemistryID) FROM BloodChemistryTable),(SELECT MAX(ImagingStudiesID) FROM ImagingStudiesTable))";
	String INSERT_LABORATORY_PROFILE_LEUKEMIA = "INSERT INTO LaboratoryProfileTable " + "(LaboratoryID,DateOfBloodCollection,HematologyID,BloodChemistryID,BoneMarrowAspirateID,FlowCytometryID,CytogeneticMolecularID, ImagingStudiesID) " + "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM HematologyTable),(SELECT MAX(BloodChemistryID) FROM BloodChemistryTable)," + "(SELECT MAX(BoneMarrowAspirateID) FROM BoneMarrowAspirateTable),(SELECT MAX(FlowCytometryID) FROM FlowCytometryTable)," + "(SELECT MAX(CytogeneticMolecularID) FROM CytogeneticMolecularTable)," + "(SELECT MAX(ImagingStudiesID) FROM ImagingStudiesTable))";
	String INSERT_LABORATORY_PROFILE_LYMPHOMA = "INSERT INTO LaboratoryProfileTable " + "(LaboratoryID,DateOfBloodCollection,HematologyID,BloodChemistryID,BoneMarrowAspirateID,FlowCytometryID,CytogeneticMolecularAAPNHID,ImagingStudiesID, HematopathologyID, ImmunohistochemistryID) " + "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM HematologyTable),(SELECT MAX(BloodChemistryID) FROM BloodChemistryTable)," + "(SELECT MAX(BoneMarrowAspirateID) FROM BoneMarrowAspirateTable),(SELECT MAX(FlowCytometryID) FROM FlowCytometryTable)," + "(SELECT MAX(CytogeneticMolecularAAPNHID) FROM CytogeneticMolecularAAPNHTable)," + "(SELECT MAX(ImagingStudiesID) FROM ImagingStudiesTable),(SELECT MAX(HematopathologyID) FROM HematopathologyTable)," + "(SELECT MAX(ImmunohistochemistryID) FROM ImmunohistochemistryTable))";
	String INSERT_LABORATORY_PROFILE_MYELOPROLIFERATIVE = "INSERT INTO LaboratoryProfileTable " + "(LaboratoryID,DateOfBloodCollection,HematologyID,BloodChemistryID,BoneMarrowAspirateID,CytogeneticMolecularID) " + "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM HematologyTable),(SELECT MAX(BloodChemistryID) FROM BloodChemistryTable)," + "(SELECT MAX(BoneMarrowAspirateID) FROM BoneMarrowAspirateTable)," + "(SELECT MAX(CytogeneticMolecularID) FROM CytogeneticMolecularTable))";
	String INSERT_LABORATORY_PROFILE_PLASMACELL = "INSERT INTO LaboratoryProfileTable " + "(LaboratoryID,DateOfBloodCollection,HematologyID,BloodChemistryID,BoneMarrowAspirateID,CytogeneticMolecularID,ImagingStudiesID,SerumFreeID,SerumProteinID,SerumImmunofixationID,UrineProteinID) " + "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM HematologyTable),(SELECT MAX(BloodChemistryID) FROM BloodChemistryTable)," + "(SELECT MAX(BoneMarrowAspirateID) FROM BoneMarrowAspirateTable)," + "(SELECT MAX(CytogeneticMolecularID) FROM CytogeneticMolecularTable)," + "(SELECT MAX(ImagingStudiesID) FROM ImagingStudiesTable),(SELECT MAX(SerumFreeID) FROM SerumFreeTable)," + "(SELECT MAX(SerumProteinID) FROM SerumProteinTable),(SELECT MAX(SerumImmunofixationID) FROM SerumImmunofixationTable)," + "(SELECT MAX(UrineProteinID) FROM UrineProteinTable))";
	String INSERT_LABORATORY_PROFILE_PLATELETCELL = "INSERT INTO LaboratoryProfileTable(LaboratoryID,DateOfBloodCollection,HematologyID,BloodChemistryID,BoneMarrowAspirateID,ImagingStudiesID,UpperGIEndoscopyID,ITP) " + "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM HematologyTable),(SELECT MAX(BloodChemistryID) FROM BloodChemistryTable),(SELECT MAX(BoneMarrowAspirateID) FROM BoneMarrowAspirateTable),(SELECT MAX(ImagingStudiesID) FROM ImagingStudiesTable),(SELECT MAX(UpperGIEndoscopyID) FROM UpperGIEndoscopyTable),?) ";

	String GET_LABORATORY_PROFILE = "SELECT * FROM LaboratoryProfileTable WHERE LaboratoryID = ?";

	String UPDATE_LABORATORY_PROFILE_AAPHSMDS = "UPDATE LaboratoryProfileTable SET DateOfBloodCollection = ? WHERE LaboratoryID = ?";
	String UPDATE_LABORATORY_PROFILE_COAGULATION = "UPDATE LaboratoryProfileTable SET DateOfBloodCollection = ? WHERE LaboratoryID = ?";
	String UPDATE_LABORATORY_PROFILE_LEUKEMIA = "UPDATE LaboratoryProfileTable SET DateOfBloodCollection = ? WHERE LaboratoryID = ?";
	String UPDATE_LABORATORY_PROFILE_LYMPHOMA = "UPDATE LaboratoryProfileTable SET DateOfBloodCollection = ? WHERE LaboratoryID = ?";
	String UPDATE_LABORATORY_PROFILE_MYELOPROLIFERATIVE = "UPDATE LaboratoryProfileTable SET DateOfBloodCollection = ? WHERE LaboratoryID = ?";
	String UPDATE_LABORATORY_PROFILE_PLASMACELL = "UPDATE LaboratoryProfileTable SET DateOfBloodCollection = ? WHERE LaboratoryID = ?";
	String UPDATE_LABORATORY_PROFILE_PLATELETCELL = "UPDATE LaboratoryProfileTable SET DateOfBloodCollection = ?, ITP = ? WHERE LaboratoryID = ?";

	//MODE OF TREATMENT
	String INSERT_MODE_OF_TREATMENT = "INSERT INTO ModeOfTreatmentTable VALUES (NULL,?,?)";
	String GET_MODE_OF_TREAMENT = "SELECT * FROM ModeOfTreatmentTable WHERE ModeOfTreatmentID = ?";
	String UPDATE_MODE_OF_TREATMENT = "UPDATE ModeOfTreatmentTable SET ModeOfTreatment = ? , NameOfTreatment = ? WHERE ModeOfTreatmentID  =  ?";

	//CHEMOTHERAPY
	String INSERT_CHEMOTHERAPY_MEDICATIONS = "INSERT INTO ChemoMedicationsTable VALUES (NULL,?);";
	String GET_CHEMOTHERAPY_MEDICATIONS = "SELECT * FROM ChemoMedicationsTable WHERE ChemoMedicationID = ?";
	String UPDATE_CHEMOTHERAPY_MEDICATIONS = "UPDATE ChemoMedicationsTable SET MedicationName = ? WHERE ChemoMedicationID = ?";

	//REGIMEN
	String INSERT_REGIMEN = "INSERT INTO RegimenTable VALUES (NULL,?,?)";
	String GET_REGIMEN = "SELECT * FROM RegimenTable WHERE RegimenID = ?";
	String UPDATE_REGIMEN = "UPDATE RegimenTable SET RegimenName = ?, OtherRegimen = ? WHERE RegimenID = ?";

	//REGIMEN FOR TRANSPLANT
	String INSERT_REGIMEN_TRANSPLANT = "INSERT INTO RegimenTransplantTable VALUES (NULL,?,?)";
	String GET_REGIMEN_TRANSPLANT = "SELECT * FROM RegimenTransplantTable WHERE RegimenTransplantID = ?";
	String UPDATE_REGIMEN_TRANSPLANT = "UPDATE RegimenTransplantTable SET RegimenName = ?, OtherRegimen = ? WHERE RegimenTransplantID = ?";

	//REGIMEN FOR NON-TRANSPLANT
	String INSERT_REGIMEN_NONTRANSPLANT = "INSERT INTO RegimenNonTransplantTable VALUES (NULL,?,?)";
	String GET_REGIMEN_NONTRANSPLANT = "SELECT * FROM RegimenNonTransplantTable WHERE RegimenNonTransplantID = ?";
	String UPDATE_REGIMEN_NONTRANSPLANT = "UPDATE RegimenNonTransplantTable SET RegimenName = ?, OtherRegimen = ? WHERE RegimenNonTransplantID = ?";

	//MAINTENANCE THERAPY
	String INSERT_MAINTENANCE_THERAPY = "INSERT INTO MaintenanceTherapyTable VALUES (NULL,?,?)";
	String GET_MAINTENANCE_THERAPY = "SELECT * FROM MaintenanceTherapyTable WHERE MaintenanceTherapyID = ?";
	String UPDATE_MAINTENANCE_THERAPY = "UPDATE MaintenanceTherapyTable SET MaintenanceTherapyName = ?, OtherMaintenanceTherapy = ? WHERE MaintenanceTherapyID = ?";

	//DISEASE STATUS
	String INSERT_DISEASE_STATUS = "INSERT INTO DiseaseStatusTable VALUES (NULL,?,?,?)";
	String GET_DISEASE_STATUS = "SELECT * FROM DiseaseStatusTable WHERE DiseaseStatusID = ?";
	String UPDATE_DISEASE_STATUS = "UPDATE DiseaseStatusTable SET DiseaseStatus = ?, RelapseDisease = ?, OtherDisease = ? WHERE DiseaseStatusID = ?";

	//TREATMENT
	String INSERT_TREATMENT_AAPHSMDS = "INSERT INTO TreatmentTable (TreatmentID,Transplant,ModeOfTreatmentID,ChemoMedicationID,DateStarted) " + "VALUES (NULL,?,(SELECT MAX(ModeOfTreatmentID) FROM ModeOfTreatmentTable),(SELECT MAX(ChemoMedicationID) FROM ChemoMedicationsTable),?)";
	String INSERT_TREATMENT_COAGULATION = "INSERT INTO TreatmentTable (TreatmentID, ModeOfTreatmentID) " + "VALUES (NULL, (SELECT MAX(ModeOfTreatmentID) FROM ModeOfTreatmentTable))";
	String INSERT_TREATMENT_LEUKEMIA = "INSERT INTO TreatmentTable(TreatmentID,ModeOfTreatmentID,ChemoMedicationID,DateStarted,RegimenID,CycleNumber) " + "VALUES (NULL, (SELECT MAX(ModeOfTreatmentID) FROM ModeOfTreatmentTable), (SELECT MAX(ChemoMedicationID) FROM ChemoMedicationsTable), ?, (SELECT MAX(RegimenID) FROM RegimenTable), ?)";
	String INSERT_TREATMENT_LYMPHOMA = "INSERT INTO TreatmentTable(TreatmentID,ModeOfTreatmentID,ChemoMedicationID,DateStarted,RegimenID,CycleNumber,Complications) " + "VALUES (NULL, (SELECT MAX(ModeOfTreatmentID) FROM ModeOfTreatmentTable), (SELECT MAX(ChemoMedicationID) FROM ChemoMedicationsTable), ?, (SELECT MAX(RegimenID) FROM RegimenTable), ?, ?)";
	String INSERT_TREATMENT_MYELOPROLIFERATIVE = "INSERT INTO TreatmentTable(TreatmentID,ModeOfTreatmentID,ChemoMedicationID,DateStarted) " + "VALUES (NULL, (SELECT MAX(ModeOfTreatmentID) FROM ModeOfTreatmentTable), (SELECT MAX(ChemoMedicationID) FROM ChemoMedicationsTable), ?)";
	String INSERT_TREATMENT_PLASMACELL = "INSERT INTO TreatmentTable(TreatmentID,Transplant,ModeOfTreatmentID,MaintenanceTherapyID,RegimenID,RegimenTransplantID,RegimenNonTransplantID,DateStarted,CycleNumber,Complications) " + "VALUES (NULL, ?, (SELECT MAX(ModeOfTreatmentID) FROM ModeOfTreatmentTable), " + "(SELECT MAX(MaintenanceTherapyID) FROM MaintenanceTherapyTable), (SELECT MAX(RegimenID) FROM RegimenTable), " + "(SELECT MAX(RegimenTransplantID) FROM RegimenTransplantTable)," + "(SELECT MAX(RegimenNonTransplantID) FROM RegimenNonTransplantTable),?,?,?)";
	String INSERT_TREATMENT_PLATELETCELL = "INSERT INTO TreatmentTable(TreatmentID,ModeOfTreatmentID,RegimenID,DateStarted,Complications) " + "VALUES (NULL, (SELECT MAX(ModeOfTreatmentID) FROM ModeOfTreatmentTable), (SELECT MAX(RegimenID) FROM RegimenTable), ?, ?)";

	String GET_TREATMENT = "SELECT * FROM TreatmentTable WHERE TreatmentID = ?";

	String UPDATE_TREATMENT_AAPHSMDS = "UPDATE TreatmentTable SET Transplant = ?, DateStarted = ? WHERE TreatmentID = ?";
	String UPDATE_TREATMENT_COAGULATION = "";
	String UPDATE_TREATMENT_LEUKEMIA = "UPDATE TreatmentTable SET DateStarted = ?, CycleNumber = ? WHERE TreatmentID = ?";
	String UPDATE_TREATMENT_LYMPHOMA = "UPDATE TreatmentTable SET DateStarted = ?, CycleNumber = ?, Complications = ? WHERE TreatmentID = ?";
	String UPDATE_TREATMENT_MYELOPROLIFERATIVE = "UPDATE TreatmentTable SET DateStarted = ? WHERE TreatmentID = ?";
	String UPDATE_TREATMENT_PLASMACELL = "UPDATE TreatmentTable SET DateStarted = ?, CycleNumber = ?, Complications = ?  WHERE TreatmentID = ?";
	String UPDATE_TREATMENT_PLATELETCELL = "UPDATE TreatmentTable SET DateStarted = ?, Complications = ? WHERE TreatmentID = ?";

	//OTHER TREATMENT
	String INSERT_OTHERTREATMENT = "INSERT INTO OtherTreatmentTable(OtherTreatmentID, Bisphosphonates, Radiotherapy, OtherMedications, Complications) " + "VALUES (NULL, ?, ?, ?, ?)";
	String GET_OTHERTREATMENT = "SELECT * FROM OtherTreatmentTable WHERE OtherTreatmentID = ?";
	String UPDATE_OTHERTREATMENT = "UPDATE OtherTreatmentTable SET Bisphosphonates = ?, Radiotherapy = ?, OtherMedications = ?, Complications = ? WHERE OtherTreatmentID = ?";

	//PATIENT
	String INSERT_PATIENT_AAPHSMDS = "INSERT INTO PatientTable VALUES (NULL,1,(SELECT MAX(GeneralDataID) FROM GeneralDataTable)," + "(SELECT MAX(ClinicalDataID) FROM ClinicalDataTable),(SELECT MAX(LaboratoryID) FROM LaboratoryProfileTable)," + "(SELECT MAX(TreatmentID) FROM TreatmentTable),NULL,1,(SELECT MAX(DiseaseStatusID) FROM DiseaseStatusTable))";
	String INSERT_PATIENT_COAGULATION = "INSERT INTO PatientTable VALUES (NULL,2,(SELECT MAX(GeneralDataID) FROM GeneralDataTable)," + "(SELECT MAX(ClinicalDataID) FROM ClinicalDataTable),(SELECT MAX(LaboratoryID) FROM LaboratoryProfileTable)," + "(SELECT MAX(TreatmentID) FROM TreatmentTable),NULL,1,NULL)";
	String INSERT_PATIENT_LEUKEMIA = "INSERT INTO PatientTable VALUES (NULL,3,(SELECT MAX(GeneralDataID) FROM GeneralDataTable)," + "(SELECT MAX(ClinicalDataID) FROM ClinicalDataTable),(SELECT MAX(LaboratoryID) FROM LaboratoryProfileTable)," + "(SELECT MAX(TreatmentID) FROM TreatmentTable),NULL,1,(SELECT MAX(DiseaseStatusID) FROM DiseaseStatusTable))";
	String INSERT_PATIENT_LYMPHOMA = "INSERT INTO PatientTable VALUES (NULL,4,(SELECT MAX(GeneralDataID) FROM GeneralDataTable)," + "(SELECT MAX(ClinicalDataID) FROM ClinicalDataTable),(SELECT MAX(LaboratoryID) FROM LaboratoryProfileTable)," + "(SELECT MAX(TreatmentID) FROM TreatmentTable),NULL,1,(SELECT MAX(DiseaseStatusID) FROM DiseaseStatusTable))";
	String INSERT_PATIENT_MYELOPROLIFERATIVE = "INSERT INTO PatientTable VALUES (NULL,5," + "(SELECT MAX(GeneralDataID) FROM GeneralDataTable),(SELECT MAX(ClinicalDataID) FROM ClinicalDataTable)," + "(SELECT MAX(LaboratoryID) FROM LaboratoryProfileTable),(SELECT MAX(TreatmentID) FROM TreatmentTable),NULL,1,NULL)";
	String INSERT_PATIENT_PLASMACELL = "INSERT INTO PatientTable VALUES (NULL,6,(SELECT MAX(GeneralDataID) FROM GeneralDataTable)," + "(SELECT MAX(ClinicalDataID) FROM ClinicalDataTable),(SELECT MAX(LaboratoryID) FROM LaboratoryProfileTable)," + "(SELECT MAX(TreatmentID) FROM TreatmentTable),(SELECT MAX(OtherTreatmentID) FROM OtherTreatmentTable),1,(SELECT MAX(DiseaseStatusID) FROM DiseaseStatusTable))";
	String INSERT_PATIENT_PLATELETCELL = "INSERT INTO PatientTable VALUES (NULL,7,(SELECT MAX(GeneralDataID) FROM GeneralDataTable)," + "(SELECT MAX(ClinicalDataID) FROM ClinicalDataTable),(SELECT MAX(LaboratoryID) FROM LaboratoryProfileTable)," + "(SELECT MAX(TreatmentID) FROM TreatmentTable),NULL,1,(SELECT MAX(DiseaseStatusID) FROM DiseaseStatusTable))";

	String GET_PATIENT_BASELINE = "SELECT * FROM PatientTable WHERE PATIENTID = ?";

	String GET_LIST_PATIENTS_BASELINE_AAPHSMDS = "SELECT * FROM PatientTable WHERE DiseaseID = 1";
	String GET_LIST_PATIENTS_BASELINE_COAGULATION = "SELECT * FROM PatientTable WHERE DiseaseID = 2";
	String GET_LIST_PATIENTS_BASELINE_LEUKEMIA = "SELECT * FROM PatientTable WHERE DiseaseID = 3";
	String GET_LIST_PATIENTS_BASELINE_LYMPHOMA = "SELECT * FROM PatientTable WHERE DiseaseID = 4";
	String GET_LIST_PATIENTS_BASELINE_MYELOPROLIFERATIVE = "SELECT * FROM PatientTable WHERE DiseaseID = 5";
	String GET_LIST_PATIENTS_BASELINE_PLASMACELL = "SELECT * FROM PatientTable WHERE DiseaseID = 6";
	String GET_LIST_PATIENTS_BASELINE_PLATELET = "SELECT * FROM PatientTable WHERE DiseaseID = 7";

	String UPDATE_PATIENT_AAPHSMDS = "";
	String UPDATE_PATIENT_COAGULATION = "";
	String UPDATE_PATIENT_LEUKEMIA = "";
	String UPDATE_PATIENT_LYMPHOMA = "";
	String UPDATE_PATIENT_MYELOPROLIFERATIVE = "";
	String UPDATE_PATIENT_PLASMACELL = "";
	String UPDATE_PATIENT_PLATELETCELL = "";

}
