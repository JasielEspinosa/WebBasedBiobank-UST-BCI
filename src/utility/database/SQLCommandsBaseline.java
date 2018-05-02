package utility.database;

public interface SQLCommandsBaseline {
	String key = "il0v3c@nCer4lif3";
	// BASELINE QUERIES
	//PATIENT'S ADDRESS
	String INSERT_ADDRESS = "INSERT INTO addresstable VALUES (NULL, ?, ?, ?)";
	String GET_ADDRESS = "SELECT * FROM addresstable WHERE ADDRESSID = ?";
	String UPDATE_ADDRESS = "UPDATE addresstable SET StreetAddress = ? , City = ? , ZIPCode = ? WHERE AddressID = ?";
	//TISUE SPECIMEN
	String INSERT_TISSUE_SPECIMEN = "INSERT INTO tissuespecimentable VALUES (NULL,?)";
	String GET_TISSUESPECIMEN = "SELECT * FROM tissuespecimentable WHERE TissueSpecimenID = ?";
	String UPDATE_TISSUE_SPECIMEN = "UPDATE tissuespecimentable SET TissueSpecimenName = ? WHERE TissueSpecimenID = ?";
	//GENERAL DATA
	String INSERT_GENERAL_DATA = "INSERT INTO generaldatatable VALUES(NULL,HEX(AES_ENCRYPT(?, '" + key + "')),HEX(AES_ENCRYPT(?, '" + key + "')),HEX(AES_ENCRYPT(?, '" + key + "')),?,HEX(AES_ENCRYPT(?, '" + key + "')),HEX(AES_ENCRYPT(?, '" + key + "')),(SELECT MAX(AddressID) FROM addresstable),?,(SELECT MAX(TissueSpecimenID) FROM tissuespecimentable))";
	String INSERT_GENERAL_DATA_NO_TISSUE = "INSERT INTO generaldatatable (GeneralDataID,LastName,FirstName,MiddleName,Gender,DateOfBirth,DateOfEntry,AddressID,CivilStatus) " + "VALUES (NULL,HEX(AES_ENCRYPT(?, '" + key + "')),HEX(AES_ENCRYPT(?, '" + key + "')),HEX(AES_ENCRYPT(?, '" + key + "')),?,HEX(AES_ENCRYPT(?, '" + key + "')),HEX(AES_ENCRYPT(?, '" + key + "')),(SELECT MAX(AddressID) FROM addresstable),?)";
	String GET_GENERAL_DATA = "SELECT *, AES_DECRYPT(UNHEX(LastName), '" + key + "') as LastNameDec, AES_DECRYPT(UNHEX(FirstName), '" + key + "') as FirstNameDec, AES_DECRYPT(UNHEX(MiddleName), '" + key + "') as MiddleNameDec, CONVERT(AES_DECRYPT(UNHEX(DateOfBirth), '" + key + "'), DATE) as DateOfBirthDec, CONVERT(AES_DECRYPT(UNHEX(DateOfEntry), '" + key + "'), DATE) as DateOfEntryDec FROM generaldatatable WHERE GeneralDataID = ?";
	String UPDATE_GENERAL_DATA = "UPDATE generaldatatable SET LastName = HEX(AES_ENCRYPT(?, '" + key + "')) , FirstName = HEX(AES_ENCRYPT(?, '" + key + "')), MiddleName = HEX(AES_ENCRYPT(?, '" + key + "')), Gender = ?, DateOfBirth = HEX(AES_ENCRYPT(?, '" + key + "')), DateOfEntry = HEX(AES_ENCRYPT(?, '" + key + "')) WHERE GeneralDataID = ?";
	//PROGNOSTIC RISK SCORING
	String INSERT_PROGNOSTIC_RISK_SCORING = "INSERT INTO prognosticriskscoringtable VALUES (NULL,?,?)";
	String GET_PROGNOSTIC_RISK_SCORING = "SELECT * FROM prognosticriskscoringtable WHERE PrognosticRiskScoringID = ?";
	String UPDATE_PROGNOSTIC_RISK_SCORING = "UPDATE prognosticriskscoringtable SET PrognosticRiskScoringName = ?, OtherPrognosticRiskScoring = ? WHERE PrognosticRiskScoringID = ?";
	//RISK SCORE
	String INSERT_RISK_SCORE = "INSERT INTO riskscoretable VALUES (NULL,?,?)";
	String GET_RISK_SCORE = "SELECT * FROM riskscoretable WHERE RiskScoreID = ?";
	String UPDATE_RISK_SCORE = "UPDATE riskscoretable SET RiskScoreName = ?, OtherRiskScore = ? WHERE RiskScoreID = ?";
	//CLASSIFICATION
	String INSERT_CLASSIFICATION = "INSERT INTO classificationtable VALUES (NULL,?)";
	String GET_CLASSIFICATION = "SELECT * FROM classificationtable WHERE ClassificationID = ?";
	String UPDATE_CLASSIFCATION = "UPDATE classificationtable SET ClassificationName = ? WHERE ClassificationID = ?";
	//ISS STAGING
	String INSERT_ISSSTAGING = "INSERT INTO issstagingtable VALUES (NULL,?)";
	String GET_ISSSTAGING = "SELECT * FROM issstagingtable WHERE ISSStagingID = ?";
	String UPDATE_ISSSTAGING = "UPDATE issstagingtable SET ISSStagingName = ? WHERE ISSStagingID = ? ";
	//SEVERITY
	String INSERT_SEVERITY = "INSERT INTO severitytable VALUES (NULL,?)";
	String GET_SEVERITY = "SELECT * FROM severitytable WHERE SeverityID = ?";
	String UPDATE_SEVERITY = "UPDATE severitytable SET SeverityName = ? WHERE SeverityID = ?";
	//PHYSICAL EXAM
	String INSERT_PHYSICAL_EXAM_AAPHSMDS = "INSERT INTO physicalexamtable VALUES (NULL, ?,?,?,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,?);";
	String INSERT_PHYSICAL_EXAM_COAGULATION = "INSERT INTO physicalexamtable VALUES (NULL, ?,?,NULL,NULL,NULL,NULL,?,?,NULL,NULL,NULL,?)";
	String INSERT_PHYSICAL_EXAM_LEUKEMIA = "INSERT INTO physicalexamtable VALUES (NULL,?,?,?,?,?,?,NULL,NULL,NULL,NULL,NULL,?)";
	String INSERT_PHYSICAL_EXAM_LYMPHOMA = "INSERT INTO physicalexamtable VALUES (NULL,?,?,?,?,?,?,NULL,NULL,NULL,NULL,NULL,?)";
	String INSERT_PHYSICAL_EXAM_MYELOPROLIFERATIVE = "INSERT INTO physicalexamtable VALUES (NULL,?,?,?,?,?,?,NULL,NULL,?,NULL,NULL,?)";
	String INSERT_PHYSICAL_EXAM_PLASMACELL = "INSERT INTO physicalexamtable VALUES (NULL,?,?,?,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,?)";
	String INSERT_PHYSICAL_EXAM_PLATELETCELL = "INSERT INTO physicalexamtable VALUES (NULL,?,?,NULL,?,NULL,NULL,NULL,NULL,NULL,?,NULL,?)";
	String GET_PHYSICAL_EXAM = "SELECT * FROM physicalexamtable WHERE PHYSICALEXAMID = ?";
	String UPDATE_PHYSICAL_EXAM_AAPHSMDS = "UPDATE physicalexamtable SET Height = ?, Weight = ?, ECOG = ? , OtherFindings = ? WHERE PhysicalExamID = ?";
	String UPDATE_PHYSICAL_EXAM_COAGULATION = "UPDATE physicalexamtable SET Height = ?, Weight = ?, Hemathroses = ?, ContracturesAndMuscleAtrophy = ? , OtherFindings = ? WHERE PhysicalExamID = ?";
	String UPDATE_PHYSICAL_EXAM_LEUKEMIA = "UPDATE physicalexamtable SET Height = ?, Weight = ?, ECOG = ?, Splenomegaly = ?, Hepatomegaly = ?, Lymphadenopathies = ? , OtherFindings = ? WHERE PhysicalExamID = ?";
	String UPDATE_PHYSICAL_EXAM_LYMPHOMA = "UPDATE physicalexamtable SET Height = ?, Weight = ?, ECOG = ?, Splenomegaly = ?, Hepatomegaly = ?, Lymphadenopathies = ? , OtherFindings = ? WHERE PhysicalExamID = ?";
	String UPDATE_PHYSICAL_EXAM_MYELOPROLIFERATIVE = "UPDATE physicalexamtable SET Height = ?, Weight = ?, ECOG = ?, Splenomegaly = ?, Hepatomegaly = ?, Lymphadenopathies = ?, ThrombosisHistory = ?, OtherFindings = ? WHERE PhysicalExamID = ?";
	String UPDATE_PHYSICAL_EXAM_PLASMACELL = "UPDATE physicalexamtable SET Height = ?, Weight = ?, ECOG = ?, ThrombosisHistory = ? , OtherFindings = ? WHERE PhysicalExamID = ?";
	String UPDATE_PHYSICAL_EXAM_PLATELETCELL = "UPDATE physicalexamtable SET Height = ?, Weight = ?, Splenomegaly = ?, Skin = ?, OtherFindings = ? WHERE PhysicalExamID = ?";
	//CLINICAL DATA
	String INSERT_CLINICAL_DATA_AAPHSMDS = "INSERT INTO clinicaldatatable " + "(ClinicalDataID,DateOfVisit,Diagnosis,ClassificationID,ChiefComplaint,OtherSymptoms,Comorbidities,SmokingHistory,AlcoholIntakeHistory,ChemicalExposure,PreviousInfection,PreviousHematologicDisorder,PhysicalExamID) " + "VALUES (NULL, HEX(AES_ENCRYPT(?, '" + key + "')), ?, (SELECT MAX(ClassificationID) FROM classificationtable), ?, ?, ?, ?, ?, ?, ?, ?,(SELECT MAX(PhysicalExamID) FROM physicalexamtable))";
	String INSERT_CLINICAL_DATA_COAGULATION = "INSERT INTO clinicaldatatable " + "(ClinicalDataID,DateOfVisit,Diagnosis,OtherDiagnosis,SeverityID,ChiefComplaint,OtherSymptoms,Comorbidities,SmokingHistory,AlcoholIntakeHistory,ChemicalExposure,PhysicalExamID,OtherFindings) " + "VALUES (NULL,HEX(AES_ENCRYPT(?, '" + key + "')),?,?,(SELECT MAX(SeverityID) FROM severitytable),?,?,?,?,?,?,(SELECT MAX(PhysicalExamID) FROM physicalexamtable),?)";
	String INSERT_CLINICAL_DATA_LEUKEMIA = "INSERT INTO clinicaldatatable " + "(ClinicalDataID,DateOfVisit,Diagnosis,RiskScoreID,ChiefComplaint,ConstitutionalSymptoms,OtherSymptoms,Comorbidities,SmokingHistory,AlcoholIntakeHistory,ChemicalExposure,PreviousInfection,PreviousHematologicDisorder,PhysicalExamID) " + "VALUES (NULL,HEX(AES_ENCRYPT(?, '" + key + "')),?,(SELECT MAX(RiskScoreID) FROM riskscoretable),?,?,?,?,?,?,?,?,?,(SELECT MAX(PhysicalExamID) FROM physicalexamtable))";
	String INSERT_CLINICAL_DATA_LYMPHOMA = "INSERT INTO clinicaldatatable " + "(ClinicalDataID,DateOfVisit,Diagnosis,StageOfDisease,ChiefComplaint,ConstitutionalSymptoms,OtherSymptoms,Comorbidities,SmokingHistory,AlcoholIntakeHistory,ChemicalExposure,PhysicalExamID,OtherFindings) " + "VALUES (NULL,HEX(AES_ENCRYPT(?, '" + key + "')),?,?,?,?,?,?,?,?,?,(SELECT MAX(PhysicalExamID) FROM physicalexamtable),?)";
	String INSERT_CLINICAL_DATA_MYELOPROLIFERATIVE = "INSERT INTO clinicaldatatable " + "(ClinicalDataID,DateOfVisit,Diagnosis,OtherDiagnosis,PrognosticRiskScoringID,RiskScoreID,ChiefComplaint,ConstitutionalSymptoms,OtherSymptoms,Comorbidities,SmokingHistory,AlcoholIntakeHistory,ChemicalExposure,PhysicalExamID,OtherFindings) " + "VALUES (NULL,HEX(AES_ENCRYPT(?, '" + key + "')),?,?,(SELECT MAX(PrognosticRiskScoringID) FROM prognosticriskscoringtable),(SELECT MAX(RiskScoreID) FROM riskscoretable),?,?,?,?,?,?,?,(SELECT MAX(PhysicalExamID) FROM physicalexamtable),?)";
	String INSERT_CLINICAL_DATA_PLASMACELL = "INSERT INTO clinicaldatatable " + "(ClinicalDataID,DateOfVisit,Diagnosis,ISSStagingID,ChiefComplaint,ConstitutionalSymptoms,OtherSymptoms,Comorbidities,SmokingHistory,AlcoholIntakeHistory,ChemicalExposure,PhysicalExamID,OtherFindings) " + "VALUES (NULL,HEX(AES_ENCRYPT(?, '" + key + "')),?,(SELECT MAX(ISSStagingID) FROM issstagingtable),?,?,?,?,?,?,?,(SELECT MAX(PhysicalExamID) FROM physicalexamtable),?)";
	String INSERT_CLINICAL_DATA_PLATELETCELL = "INSERT INTO clinicaldatatable " + "(ClinicalDataID,DateOfVisit,Diagnosis,OtherDiagnosis,ChiefComplaint,ConstitutionalSymptoms,OtherSymptoms,Comorbidities,SmokingHistory,AlcoholIntakeHistory,ChemicalExposure,PhysicalExamID,OtherFindings) " + "VALUES (NULL,HEX(AES_ENCRYPT(?, '" + key + "')),?,?,?,?,?,?,?,?,?,(SELECT MAX(PhysicalExamID) FROM physicalexamtable),?)";
	String GET_CLINICAL_DATA_BASELINE = "SELECT *, CONVERT(AES_DECRYPT(UNHEX(DateOfVisit), '" + key + "'), DATE) as DateOfVisitDec FROM clinicaldatatable WHERE ClinicalDataID = ?";
	String UPDATE_CLINICAL_DATA_AAPHSMDS = "UPDATE clinicaldatatable SET DateOfVisit = HEX(AES_ENCRYPT(?, '" + key + "')) , Diagnosis = ?, ChiefComplaint = ?, OtherSymptoms = ?, Comorbidities = ?, SmokingHistory = ?, AlcoholIntakeHistory = ?, ChemicalExposure = ?, PreviousInfection= ?, PreviousHematologicDisorder = ? WHERE ClinicalDataID = ? ";
	String UPDATE_CLINICAL_DATA_COAGULATION = "UPDATE clinicaldatatable SET DateOfVisit = HEX(AES_ENCRYPT(?, '" + key + "')) , Diagnosis = ?, OtherDiagnosis = ?, ChiefComplaint = ?, OtherSymptoms = ?, Comorbidities = ?, SmokingHistory = ?, AlcoholIntakeHistory = ?, ChemicalExposure = ?, OtherFindings = ? WHERE ClinicalDataID = ? ";
	String UPDATE_CLINICAL_DATA_LEUKEMIA = "UPDATE clinicaldatatable SET DateOfVisit = HEX(AES_ENCRYPT(?, '" + key + "')) , Diagnosis = ?, ChiefComplaint = ?, ConstitutionalSymptoms = ?, OtherSymptoms = ?, Comorbidities = ?, SmokingHistory = ?, AlcoholIntakeHistory = ?, ChemicalExposure = ?, PreviousInfection= ?, PreviousHematologicDisorder = ? WHERE ClinicalDataID = ? ";
	String UPDATE_CLINICAL_DATA_LYMPHOMA = "UPDATE clinicaldatatable SET DateOfVisit = HEX(AES_ENCRYPT(?, '" + key + "')) , Diagnosis = ?, StageOfDisease = ? ,ChiefComplaint = ?, ConstitutionalSymptoms = ?, OtherSymptoms = ?, Comorbidities = ?, SmokingHistory = ?, AlcoholIntakeHistory = ?, ChemicalExposure = ?, OtherFindings= ? WHERE ClinicalDataID = ? ";
	String UPDATE_CLINICAL_DATA_MYELOPROLIFERATIVE = "UPDATE clinicaldatatable SET DateOfVisit = HEX(AES_ENCRYPT(?, '" + key + "')) , Diagnosis = ?, OtherDiagnosis = ?, ChiefComplaint = ?, ConstitutionalSymptoms = ?, OtherSymptoms = ?, Comorbidities = ?, SmokingHistory = ?, AlcoholIntakeHistory = ?, ChemicalExposure = ?, OtherFindings= ? WHERE ClinicalDataID = ? ";
	String UPDATE_CLINICAL_DATA_PLASMACELL = "UPDATE clinicaldatatable SET DateOfVisit = HEX(AES_ENCRYPT(?, '" + key + "')) , Diagnosis = ?, ChiefComplaint = ?, ConstitutionalSymptoms = ?, OtherSymptoms = ?, Comorbidities = ?, SmokingHistory = ?, AlcoholIntakeHistory = ?, ChemicalExposure = ?, OtherFindings= ? WHERE ClinicalDataID = ? ";
	String UPDATE_CLINICAL_DATA_PLATELETCELL = "UPDATE clinicaldatatable SET DateOfVisit = HEX(AES_ENCRYPT(?, '" + key + "')), Diagnosis = ?, OtherDiagnosis = ?, ChiefComplaint = ?, ConstitutionalSymptoms = ?, OtherSymptoms = ?, Comorbidities = ?, SmokingHistory = ?, AlcoholIntakeHistory = ?, ChemicalExposure = ?, OtherFindings= ? WHERE ClinicalDataID = ? ";
	//FAMILY CANCER
	String INSERT_FAMILY_CANCER = "INSERT INTO familycancertable VALUES (NULL, (SELECT MAX(ClinicalDataID) FROM clinicaldatatable),?,?)";
	String GET_FAMILY_CANCER = "SELECT * FROM familycancertable WHERE CLINICALDATAID = ?";
	String UPDATE_FAMILY_CANCER = "UPDATE familycancertable SET RelationshipToPatient = ?, CancerName = ? WHERE ClinicalDataID = ?";
	//OTHER DISEASES
	String INSERT_OTHERDISEASES = "INSERT INTO otherdiseasestable VALUES (NULL, (SELECT MAX(ClinicalDataID) FROM clinicaldatatable), ?)";
	String GET_OTHER_DISEASES = "SELECT * FROM otherdiseasestable WHERE CLINICALDATAID = ?";
	String UPDATE_OTHERDISEASES = "UPDATE otherdiseasestable SET OtherDiseases = ? WHERE ClinicalDataID = ?";
	//MEDICATIONS
	String INSERT_MEDICATIONS = "INSERT INTO medicationstable VALUES (NULL, (SELECT MAX(ClinicalDataID) FROM clinicaldatatable),?,?,?)";
	String GET_MEDICATIONS = "SELECT * FROM medicationstable WHERE CLINICALDATAID = ?";
	String UPDATE_MEDICATIONS = "UPDATE medicationstable SET GenericName = ? , Dose = ? , Frequency = ? WHERE ClinicalDataID = ? ";
	//HEMATOLOGY
	String INSERT_HEMATOLOGY_AAPHSMDS = "INSERT INTO hematologytable VALUES (NULL,?,?,?,?,?,?,?,?,?,?,?,?);";
	String INSERT_HEMATOLOGY_COAGULATION = "INSERT INTO hematologytable VALUES (NULL,?,?,?,?,?,?,?,?,NULL,NULL,NULL,?)";
	String INSERT_HEMATOLOGY_LEUKEMIA = "INSERT INTO hematologytable VALUES (NULL,?,?,?,?,?,?,?,?,?,?,?,?)";
	String INSERT_HEMATOLOGY_LYMPHOMA = "INSERT INTO hematologytable VALUES (NULL,?,?,?,?,?,?,?,?,?,?,?,?)";
	String INSERT_HEMATOLOGY_MYELOPROLIFERATIVE = "INSERT INTO hematologytable VALUES (NULL,?,?,?,?,?,?,?,?,?,?,?,?)";
	String INSERT_HEMATOLOGY_PLASMACELL = "INSERT INTO hematologytable VALUES (NULL,?,?,?,?,?,?,?,?,?,?,?,?)";
	String INSERT_HEMATOLOGY_PLATELETCELL = "INSERT INTO hematologytable VALUES (NULL,?,?,?,?,?,?,?,?,NULL,NULL,NULL,?)";
	String GET_HEMATOLOGY = "SELECT * FROM hematologytable WHERE HematologyID = ?";
	String UPDATE_HEMATOLOGY_AAPHSMDS = "UPDATE hematologytable SET Hemoglobin = ?, Hematocrit = ? , WhiteBloodCells = ?, Neutrophils = ?, Lymphocytes = ?," + " Monocytes = ?, Eosinophils = ? , Basophils = ? , Myelocytes = ? , Metamyelocytes = ? , Blasts = ? , PlateletCount = ? WHERE HematologyID = ?";
	String UPDATE_HEMATOLOGY_COAGULATION = "UPDATE hematologytable SET Hemoglobin = ?, Hematocrit = ? , WhiteBloodCells = ?, Neutrophils = ?, Lymphocytes = ?," + " Monocytes = ?, Eosinophils = ? , Basophils = ? , PlateletCount = ? WHERE HematologyID = ?";
	String UPDATE_HEMATOLOGY_LEUKEMIA = "UPDATE hematologytable SET Hemoglobin = ?, Hematocrit = ? , WhiteBloodCells = ?, Neutrophils = ?, Lymphocytes = ?," + " Monocytes = ?, Eosinophils = ? , Basophils = ? , Myelocytes = ? , Metamyelocytes = ? , Blasts = ? , PlateletCount = ? WHERE HematologyID = ?";
	String UPDATE_HEMATOLOGY_LYMPHOMA = "UPDATE hematologytable SET Hemoglobin = ?, Hematocrit = ? , WhiteBloodCells = ?, Neutrophils = ?, Lymphocytes = ?," + " Monocytes = ?, Eosinophils = ? , Basophils = ? , Myelocytes = ? , Metamyelocytes = ? , Blasts = ? , PlateletCount = ? WHERE HematologyID = ?";
	String UPDATE_HEMATOLOGY_MYELOPROLIFERATIVE = "UPDATE hematologytable SET Hemoglobin = ?, Hematocrit = ? , WhiteBloodCells = ?, Neutrophils = ?, Lymphocytes = ?," + " Monocytes = ?, Eosinophils = ? , Basophils = ? , Myelocytes = ? , Metamyelocytes = ? , Blasts = ? , PlateletCount = ? WHERE HematologyID = ?";
	String UPDATE_HEMATOLOGY_PLASMACELL = "UPDATE hematologytable SET Hemoglobin = ?, Hematocrit = ? , WhiteBloodCells = ?, Neutrophils = ?, Lymphocytes = ?," + " Monocytes = ?, Eosinophils = ? , Basophils = ? , Myelocytes = ? , Metamyelocytes = ? , Blasts = ? , PlateletCount = ? WHERE HematologyID = ?";
	String UPDATE_HEMATOLOGY_PLATELETCELL = "UPDATE hematologytable SET Hemoglobin = ?, Hematocrit = ? , WhiteBloodCells = ?, Neutrophils = ?, Lymphocytes = ?," + " Monocytes = ?, Eosinophils = ? , Basophils = ? , PlateletCount = ? WHERE HematologyID = ?";
	//COAGULATION
	String INSERT_COAGULATION_TESTING = "INSERT INTO coagulationtestingtable VALUES (NULL,?,?,?,?)";
	String GET_COAGULATION_TESTING = "SELECT * FROM coagulationtestingtable WHERE COAGULATIONTESTINGID = ?";
	String UPDATE_COAGULATION_TESTING = "UPDATE coagulationtestingtable SET FactorVIIILevel = ?, FactorIXLevel = ? , InhibitorAssay = ?, BethesdaUnits = ? WHERE CoagulationTestingID = ?";
	//BLOOD CHEMISTRY
	String INSERT_BLOOD_CHEMISTRY_COAGULATION = "INSERT INTO bloodchemistrytable(BloodChemistryID,Creatinine,UricAcid,SGOT,SGPT,LDH,Na,K) VALUES (NULL,?,?,?,?,?,?,?)";
	String INSERT_BLOOD_CHEMISTRY_LEUKEMIA = "INSERT INTO bloodchemistrytable(BloodChemistryID,Creatinine,UricAcid,SGOT,SGPT,LDH,Na,K) VALUES (NULL,?,?,?,?,?,?,?)";
	String INSERT_BLOOD_CHEMISTRY_LYMPHOMA = "INSERT INTO bloodchemistrytable(BloodChemistryID,Creatinine,UricAcid,SGOT,SGPT,LDH,Na,K,BilirubinTotal,BilirubinDirect,BilirubinIndirect,Beta2Microglobulin,HepatitisBTesting,ESR) VALUES (NULL,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	String INSERT_BLOOD_CHEMISTRY_MYELOPROLIFERATIVE = "INSERT INTO bloodchemistrytable(BloodChemistryID,Creatinine,UricAcid,SGOT,SGPT,LDH,EPOLevel) VALUES (NULL,?,?,?,?,?,?)";
	String INSERT_BLOOD_CHEMISTRY_PLASMACELL = "INSERT INTO bloodchemistrytable(BloodChemistryID,BloodUreaNitrogen,Creatinine,UricAcid,LDH,Na,K,Beta2Microglobulin,iCa,TotalProtein,Albumin,Globulin) VALUES (NULL,?,?,?,?,?,?,?,?,?,?,?)";
	String INSERT_BLOOD_CHEMISTRY_PLATELET = "INSERT INTO bloodchemistrytable(BloodChemistryID,Creatinine,UricAcid,SGOT,SGPT,LDH,Na,K,ANATiter,HepatitisCRna) VALUES (NULL,?,?,?,?,?,?,?,?,?)";
	String GET_BLOOD_CHEMISTRY = "SELECT * FROM bloodchemistrytable WHERE BLOODCHEMISTRYID = ?";
	String UPDATE_BLOOD_CHEMISTRY_COAGULATION = "UPDATE bloodchemistrytable SET Creatinine = ?, UricAcid = ?, SGOT = ?, SGPT = ?, LDH = ? , Na = ?, K = ? WHERE BloodChemistryID = ? ";
	String UPDATE_BLOOD_CHEMISTRY_LEUKEMIA = "UPDATE bloodchemistrytable SET Creatinine = ?, UricAcid = ?, SGOT = ?, SGPT = ?, LDH = ? , Na = ?, K = ? WHERE BloodChemistryID = ? ";
	String UPDATE_BLOOD_CHEMISTRY_LYMPHOMA = "UPDATE bloodchemistrytable SET Creatinine = ?, UricAcid = ?, SGOT = ?, SGPT = ?, LDH = ? , Na = ?, K = ?," + " BilirubinTotal = ?, BilirubinDirect = ?, BilirubinIndirect = ?, Beta2Microglobulin = ?, HepatitisBTesting = ?, ESR = ? WHERE BloodChemistryID = ? ";
	String UPDATE_BLOOD_CHEMISTRY_MYELOPROLIFERATIVE = "UPDATE bloodchemistrytable SET Creatinine = ?, UricAcid = ?, SGOT = ?, SGPT = ?, LDH = ? , EPOLevel = ? WHERE BloodChemistryID = ? ";
	String UPDATE_BLOOD_CHEMISTRY_PLASMACELL = "UPDATE bloodchemistrytable SET BloodUreaNitrogen = ?, Creatinine = ?, UricAcid = ?, LDH = ? , Na = ?, K = ?," + "  Beta2Microglobulin = ?, iCa = ?, TotalProtein = ? , Albumin = ? , Globulin = ? WHERE BloodChemistryID = ? ";
	String UPDATE_BLOOD_CHEMISTRY_PLATELETCELL = "UPDATE bloodchemistrytable SET Creatinine = ?, UricAcid = ?, SGOT = ?, SGPT = ?, LDH = ? , EPOLevel = ? WHERE BloodChemistryID = ? ";
	//OTHER LABORATORIES
	String INSERT_OTHER_LABORATORIES_AAPHSMDS = "INSERT INTO otherlaboratoriestable VALUES (NULL,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	String GET_OTHER_LABORATORIES_AAPNHMDS = "SELECT * FROM otherlaboratoriestable WHERE OtherLaboratoriesID = ?";
	String UPDATE_OTHER_LABORATORIES_AAPHSMDS = "UPDATE otherlaboratoriestable SET Creatinine = ?, UricAcid = ? , ReticulocyteCount = ?, SerumIron = ? , IronBindingCapacity = ?, " + "SerumFerritin = ?, DirectAntiglobulin = ?, IndirectAntiglobulin = ?, SGOT = ?, SGPT = ?, LDH = ?, ScreenTestHepatitis = ?, ScreenTestEBVCytomegalovirusHIV = ?, ErythropeitinLevel = ?," + " SerumFolicAcid = ?, SerumFolicAcid = ?, TSH = ? WHERE OtherLaboratoriesID = ? ";
	//BONE MARROW ASPIRATE
	String INSERT_BONE_MARROW_ASPIRATE = "INSERT INTO bonemarrowaspiratetable VALUES (NULL,?,?)";
	String GET_BONE_MARROW_ASPIRATE = "SELECT * FROM bonemarrowaspiratetable WHERE BoneMarrowAspirateID = ?";
	String UPDATE_BONE_MARROW_ASPIRATE = "UPDATE bonemarrowaspiratetable SET DatePerformed = ?, Result = ? WHERE BoneMarrowAspirateID = ?";
	//FLOW CYTOMETRY
	String INSERT_FLOWCYTOMETRY = "INSERT INTO flowcytometrytable VALUES (NULL,?)";
	String GET_FLOWCYTOMETRY = "SELECT * FROM flowcytometrytable WHERE FLOWCYTOMETRYID = ?";
	String UPDATE_FLOWCYTOMETRY = "UPDATE flowcytometrytable SET Result = ? WHERE FlowCytometryID = ?";
	//CYTOGENETIC MOLECULARS
	String INSERT_CYTOGENETIC_MOLECULAR_AAPNH_AAPHSMDS = "INSERT INTO cytogeneticmolecularaapnhtable VALUES (NULL,?)";
	String GET_CYTOGENETIC_MOLECULAR_AAPNH_AAPNHMDS = "SELECT * FROM cytogeneticmolecularaapnhtable WHERE CytogeneticMolecularAAPNHID = ?";
	String UPDATE_CYTOGENETIC_MOLECULAR_AAPNH_AAPHSMDS = "UPDATE cytogeneticmolecularaapnhtable SET Result = ? WHERE CytogeneticMolecularAAPNHID = ?";
	String INSERT_CYTOGENETIC_MOLECULAR_MDS_AAPHSMDS = "INSERT INTO cytogeneticmolecularmdstable VALUES (NULL,?)";
	String GET_CYTOGENETIC_MOLECULAR_MDS_AAPNHMDS = "SELECT * FROM cytogeneticmolecularmdstable WHERE CytogeneticMolecularMDSID = ?";
	String UPDATE_CYTOGENETIC_MOLECULAR_MDS_AAPHSMDS = "UPDATE cytogeneticmolecularmdstable SET Result = ? WHERE CytogeneticMolecularMDSID = ?";
	String INSERT_CYTOGENETIC_MOLECULAR_AAPNH_LEUKEMIA = "INSERT INTO cytogeneticmolecularaapnhtable VALUES (NULL,?)";
	String UPDATE_CYTOGENETIC_MOLECULAR_AAPNH_LEUKEMIA = "UPDATE cytogeneticmolecularaapnhtable SET Result = ? WHERE CytogeneticMolecularAAPNHID = ?";
	String INSERT_CYTOGENETIC_MOLECULAR = "INSERT INTO cytogeneticmoleculartable VALUES (NULL,?)";
	String GET_CYTOGENETIC_MOLECULAR = "SELECT * FROM cytogeneticmoleculartable WHERE CytogeneticMolecularID = ?";
	String UPDATE_CYTOGENETIC_MOLECULAR = "UPDATE cytogeneticmoleculartable SET Result = ? WHERE CytogeneticMolecularID = ?";
	//IMAGING_STUDIES
	String INSERT_IMAGING_STUDIES = "INSERT INTO imagingstudiestable VALUES (NULL, ?);";
	String GET_IMAGING_STUDIES = "SELECT * FROM imagingstudiestable WHERE ImagingStudiesID = ?";
	String UPDATE_IMAGING_STUDIES = "UPDATE imagingstudiestable SET Result = ? WHERE ImagingStudiesID = ? ";
	//UPPERGIENDOSCOPY
	String INSERT_UPPERGIENDOSCOPY = "INSERT INTO uppergiendoscopytable VALUES (NULL,?,?,?)";
	String GET_UPPERGIENDOSCOPY = "SELECT * FROM uppergiendoscopytable WHERE UpperGIEndoscopyID = ?";
	String UPDATE_UPPERGIENDOSCOPY = "UPDATE uppergiendoscopytable SET DatePerformed = ?, Description = ? , HPylori = ? WHERE UpperGIEndoscopyID = ? ";
	//HEMATOPATHOLOGY
	String INSERT_HEMATOPATHOLOGY = "INSERT INTO hematopathologytable VALUES (NULL,?,?)";
	String GET_HEMATOPATHOLOGY = "SELECT * FROM hematopathologytable WHERE HematopathologyID = ?";
	String UPDATE_HEMATOPATHOLOGY = "UPDATE hematopathologytable SET DatePerformed = ?, Result = ? WHERE HematopathologyID = ?";
	//IMMUNOHISTOCHEMISTRY
	String INSERT_IMMUNOHISTOCHEMISTRY = "INSERT INTO immunohistochemistrytable VALUES (NULL,?,?)";
	String GET_IMMUNOHISTOCHEMISTRY = "SELECT * FROM immunohistochemistrytable WHERE ImmunohistochemistryID = ?";
	String UPDATE_IMMUNOHISTOCHEMISTRY = "UPDATE immunohistochemistrytable SET DatePerformed = ?, Result = ? WHERE ImmunohistochemistryID = ?";
	//SERUM
	String INSERT_SERUMFREE = "INSERT INTO serumfreetable VALUES (NULL,?)";
	String GET_SERUMFREE = "SELECT * FROM serumfreetable WHERE SerumFreeID = ?";
	String UPDATE_SERUMFREE = "UPDATE serumfreetable SET Result = ? WHERE SerumFreeID = ?";
	String INSERT_SERUMPROTEIN = "INSERT INTO serumproteintable VALUES (NULL,?)";
	String GET_SERUMPROTEIN = "SELECT * FROM serumproteintable WHERE SerumProteinID = ?";
	String UPDATE_SERUMPROTEIN = "UPDATE serumproteintable SET Result = ? WHERE SerumProteinID = ?";
	String INSERT_SERUMIMMUNOFIXATION = "INSERT INTO serumimmunofixationtable VALUES (NULL,?)";
	String GET_SERUMIMMUNOFIXATION = "SELECT * FROM serumimmunofixationtable WHERE SerumImmunofixationID = ?";
	String UPDATE_SERUMIMMUNOFIXATION = "UPDATE serumimmunofixationtable SET Result = ? WHERE SerumImmunofixationID = ?";
	//URINE PROTEIN
	String INSERT_URINEPROTEIN = "INSERT INTO urineproteintable VALUES (NULL,?)";
	String GET_URINEPROTEIN = "SELECT * FROM urineproteintable WHERE UrineProteinID = ?";
	String UPDATE_URINEPROTEIN = "UPDATE urineproteintable SET Result = ? WHERE UrineProteinID = ?";
	//LABORATORY PROFILE
	String INSERT_LABORATORY_PROFILE_AAPHSMDS = "INSERT INTO laboratoryprofiletable " + "(LaboratoryID,DateOfBloodCollection,HematologyID,OtherLaboratoriesID,BoneMarrowAspirateID,FlowCytometryID,CytogeneticMolecularAAPNHID, CytogeneticMolecularMDSID) " + "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM hematologytable)," + "(SELECT MAX(OtherLaboratoriesID) FROM otherlaboratoriestable)," + "(SELECT MAX(BoneMarrowAspirateID) FROM bonemarrowaspiratetable),(SELECT MAX(FlowCytometryID) FROM flowcytometrytable)," + "(SELECT MAX(CytogeneticMolecularAAPNHID) FROM cytogeneticmolecularaapnhtable)," + "(SELECT MAX(CytogeneticMolecularMDSID) FROM cytogeneticmolecularmdstable))";
	String INSERT_LABORATORY_PROFILE_COAGULATION = "INSERT INTO laboratoryprofiletable " + "(LaboratoryID,DateOfBloodCollection,HematologyID,CoagulationTestingID,BloodChemistryID,ImagingStudiesID) " + "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM hematologytable)," + "(SELECT MAX(CoagulationTestingID) FROM coagulationtestingtable)," + "(SELECT MAX(BloodChemistryID) FROM bloodchemistrytable),(SELECT MAX(ImagingStudiesID) FROM imagingstudiestable))";
	String INSERT_LABORATORY_PROFILE_LEUKEMIA = "INSERT INTO laboratoryprofiletable " + "(LaboratoryID,DateOfBloodCollection,HematologyID,BloodChemistryID,BoneMarrowAspirateID,FlowCytometryID,CytogeneticMolecularID, ImagingStudiesID) " + "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM hematologytable),(SELECT MAX(BloodChemistryID) FROM bloodchemistrytable)," + "(SELECT MAX(BoneMarrowAspirateID) FROM bonemarrowaspiratetable),(SELECT MAX(FlowCytometryID) FROM flowcytometrytable)," + "(SELECT MAX(CytogeneticMolecularID) FROM cytogeneticmoleculartable)," + "(SELECT MAX(ImagingStudiesID) FROM imagingstudiestable))";
	String INSERT_LABORATORY_PROFILE_LYMPHOMA = "INSERT INTO laboratoryprofiletable " + "(LaboratoryID,DateOfBloodCollection,HematologyID,BloodChemistryID,BoneMarrowAspirateID,FlowCytometryID,CytogeneticMolecularAAPNHID,ImagingStudiesID, HematopathologyID, ImmunohistochemistryID) " + "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM hematologytable),(SELECT MAX(BloodChemistryID) FROM bloodchemistrytable)," + "(SELECT MAX(BoneMarrowAspirateID) FROM bonemarrowaspiratetable),(SELECT MAX(FlowCytometryID) FROM flowcytometrytable)," + "(SELECT MAX(CytogeneticMolecularAAPNHID) FROM cytogeneticmolecularaapnhtable)," + "(SELECT MAX(ImagingStudiesID) FROM imagingstudiestable),(SELECT MAX(HematopathologyID) FROM hematopathologytable)," + "(SELECT MAX(ImmunohistochemistryID) FROM immunohistochemistrytable))";
	String INSERT_LABORATORY_PROFILE_MYELOPROLIFERATIVE = "INSERT INTO laboratoryprofiletable " + "(LaboratoryID,DateOfBloodCollection,HematologyID,BloodChemistryID,BoneMarrowAspirateID,CytogeneticMolecularID) " + "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM hematologytable),(SELECT MAX(BloodChemistryID) FROM bloodchemistrytable)," + "(SELECT MAX(BoneMarrowAspirateID) FROM bonemarrowaspiratetable)," + "(SELECT MAX(CytogeneticMolecularID) FROM cytogeneticmoleculartable))";
	String INSERT_LABORATORY_PROFILE_PLASMACELL = "INSERT INTO laboratoryprofiletable " + "(LaboratoryID,DateOfBloodCollection,HematologyID,BloodChemistryID,BoneMarrowAspirateID,CytogeneticMolecularID,ImagingStudiesID,SerumFreeID,SerumProteinID,SerumImmunofixationID,UrineProteinID) " + "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM hematologytable),(SELECT MAX(BloodChemistryID) FROM bloodchemistrytable)," + "(SELECT MAX(BoneMarrowAspirateID) FROM bonemarrowaspiratetable)," + "(SELECT MAX(CytogeneticMolecularID) FROM cytogeneticmoleculartable)," + "(SELECT MAX(ImagingStudiesID) FROM imagingstudiestable),(SELECT MAX(SerumFreeID) FROM serumfreetable)," + "(SELECT MAX(SerumProteinID) FROM serumproteintable),(SELECT MAX(SerumImmunofixationID) FROM serumimmunofixationtable)," + "(SELECT MAX(UrineProteinID) FROM urineproteintable))";
	String INSERT_LABORATORY_PROFILE_PLATELETCELL = "INSERT INTO laboratoryprofiletable(LaboratoryID,DateOfBloodCollection,HematologyID,BloodChemistryID,BoneMarrowAspirateID,ImagingStudiesID,UpperGIEndoscopyID,ITP) " + "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM hematologytable),(SELECT MAX(BloodChemistryID) FROM bloodchemistrytable),(SELECT MAX(BoneMarrowAspirateID) FROM bonemarrowaspiratetable),(SELECT MAX(ImagingStudiesID) FROM imagingstudiestable),(SELECT MAX(UpperGIEndoscopyID) FROM uppergiendoscopytable),?) ";
	String GET_LABORATORY_PROFILE = "SELECT * FROM laboratoryprofiletable WHERE LaboratoryID = ?";
	String UPDATE_LABORATORY_PROFILE_AAPHSMDS = "UPDATE laboratoryprofiletable SET DateOfBloodCollection = ? WHERE LaboratoryID = ?";
	String UPDATE_LABORATORY_PROFILE_COAGULATION = "UPDATE laboratoryprofiletable SET DateOfBloodCollection = ? WHERE LaboratoryID = ?";
	String UPDATE_LABORATORY_PROFILE_LEUKEMIA = "UPDATE laboratoryprofiletable SET DateOfBloodCollection = ? WHERE LaboratoryID = ?";
	String UPDATE_LABORATORY_PROFILE_LYMPHOMA = "UPDATE laboratoryprofiletable SET DateOfBloodCollection = ? WHERE LaboratoryID = ?";
	String UPDATE_LABORATORY_PROFILE_MYELOPROLIFERATIVE = "UPDATE laboratoryprofiletable SET DateOfBloodCollection = ? WHERE LaboratoryID = ?";
	String UPDATE_LABORATORY_PROFILE_PLASMACELL = "UPDATE laboratoryprofiletable SET DateOfBloodCollection = ? WHERE LaboratoryID = ?";
	String UPDATE_LABORATORY_PROFILE_PLATELETCELL = "UPDATE laboratoryprofiletable SET DateOfBloodCollection = ?, ITP = ? WHERE LaboratoryID = ?";
	//MODE OF TREATMENT
	String INSERT_MODE_OF_TREATMENT = "INSERT INTO modeoftreatmenttable VALUES (NULL,?,?)";
	String GET_MODE_OF_TREAMENT = "SELECT * FROM modeoftreatmenttable WHERE ModeOfTreatmentID = ?";
	String UPDATE_MODE_OF_TREATMENT = "UPDATE modeoftreatmenttable SET ModeOfTreatment = ? , NameOfTreatment = ? WHERE ModeOfTreatmentID  =  ?";
	//CHEMOTHERAPY
	String INSERT_CHEMOTHERAPY_MEDICATIONS = "INSERT INTO chemomedicationstable VALUES (NULL,?);";
	String GET_CHEMOTHERAPY_MEDICATIONS = "SELECT * FROM chemomedicationstable WHERE ChemoMedicationID = ?";
	String UPDATE_CHEMOTHERAPY_MEDICATIONS = "UPDATE chemomedicationstable SET MedicationName = ? WHERE ChemoMedicationID = ?";
	//REGIMEN
	String INSERT_REGIMEN = "INSERT INTO regimentable VALUES (NULL,?,?)";
	String GET_REGIMEN = "SELECT * FROM regimentable WHERE RegimenID = ?";
	String UPDATE_REGIMEN = "UPDATE regimentable SET RegimenName = ?, OtherRegimen = ? WHERE RegimenID = ?";
	//REGIMEN FOR TRANSPLANT
	String INSERT_REGIMEN_TRANSPLANT = "INSERT INTO regimentransplanttable VALUES (NULL,?,?)";
	String GET_REGIMEN_TRANSPLANT = "SELECT * FROM regimentransplanttable WHERE RegimenTransplantID = ?";
	String UPDATE_REGIMEN_TRANSPLANT = "UPDATE regimentransplanttable SET RegimenName = ?, OtherRegimen = ? WHERE RegimenTransplantID = ?";
	//REGIMEN FOR NON-TRANSPLANT
	String INSERT_REGIMEN_NONTRANSPLANT = "INSERT INTO regimennontransplanttable VALUES (NULL,?,?)";
	String GET_REGIMEN_NONTRANSPLANT = "SELECT * FROM regimennontransplanttable WHERE RegimenNonTransplantID = ?";
	String UPDATE_REGIMEN_NONTRANSPLANT = "UPDATE regimennontransplanttable SET RegimenName = ?, OtherRegimen = ? WHERE RegimenNonTransplantID = ?";
	//MAINTENANCE THERAPY
	String INSERT_MAINTENANCE_THERAPY = "INSERT INTO maintenancetherapytable VALUES (NULL,?,?)";
	String GET_MAINTENANCE_THERAPY = "SELECT * FROM maintenancetherapytable WHERE MaintenanceTherapyID = ?";
	String UPDATE_MAINTENANCE_THERAPY = "UPDATE maintenancetherapytable SET MaintenanceTherapyName = ?, OtherMaintenanceTherapy = ? WHERE MaintenanceTherapyID = ?";
	//DISEASE STATUS
	String INSERT_DISEASE_STATUS = "INSERT INTO diseasestatustable VALUES (NULL,?,?,?)";
	String GET_DISEASE_STATUS = "SELECT * FROM diseasestatustable WHERE DiseaseStatusID = ?";
	String UPDATE_DISEASE_STATUS = "UPDATE diseasestatustable SET DiseaseStatus = ?, RelapseDisease = ?, OtherDisease = ? WHERE DiseaseStatusID = ?";
	//TREATMENT
	String INSERT_TREATMENT_AAPHSMDS = "INSERT INTO treatmenttable (TreatmentID,Transplant,ModeOfTreatmentID,ChemoMedicationID,DateStarted) " + "VALUES (NULL,?,(SELECT MAX(ModeOfTreatmentID) FROM modeoftreatmenttable),(SELECT MAX(ChemoMedicationID) FROM chemomedicationstable),?)";
	String INSERT_TREATMENT_COAGULATION = "INSERT INTO treatmenttable (TreatmentID, ModeOfTreatmentID) " + "VALUES (NULL, (SELECT MAX(ModeOfTreatmentID) FROM modeoftreatmenttable))";
	String INSERT_TREATMENT_LEUKEMIA = "INSERT INTO treatmenttable(TreatmentID,ModeOfTreatmentID,ChemoMedicationID,DateStarted,RegimenID,CycleNumber) " + "VALUES (NULL, (SELECT MAX(ModeOfTreatmentID) FROM modeoftreatmenttable), (SELECT MAX(ChemoMedicationID) FROM chemomedicationstable), ?, (SELECT MAX(RegimenID) FROM regimentable), ?)";
	String INSERT_TREATMENT_LYMPHOMA = "INSERT INTO treatmenttable(TreatmentID,ModeOfTreatmentID,ChemoMedicationID,DateStarted,RegimenID,CycleNumber,Complications) " + "VALUES (NULL, (SELECT MAX(ModeOfTreatmentID) FROM modeoftreatmenttable), (SELECT MAX(ChemoMedicationID) FROM chemomedicationstable), ?, (SELECT MAX(RegimenID) FROM regimentable), ?, ?)";
	String INSERT_TREATMENT_MYELOPROLIFERATIVE = "INSERT INTO treatmenttable(TreatmentID,ModeOfTreatmentID,ChemoMedicationID,DateStarted) " + "VALUES (NULL, (SELECT MAX(ModeOfTreatmentID) FROM modeoftreatmenttable), (SELECT MAX(ChemoMedicationID) FROM chemomedicationstable), ?)";
	String INSERT_TREATMENT_PLASMACELL = "INSERT INTO treatmenttable(TreatmentID,Transplant,ModeOfTreatmentID,MaintenanceTherapyID,RegimenID,RegimenTransplantID,RegimenNonTransplantID,DateStarted,CycleNumber,Complications) " + "VALUES (NULL, ?, (SELECT MAX(ModeOfTreatmentID) FROM modeoftreatmenttable), " + "(SELECT MAX(MaintenanceTherapyID) FROM maintenancetherapytable), (SELECT MAX(RegimenID) FROM regimentable), " + "(SELECT MAX(RegimenTransplantID) FROM regimentransplanttable)," + "(SELECT MAX(RegimenNonTransplantID) FROM regimennontransplanttable),?,?,?)";
	String INSERT_TREATMENT_PLATELETCELL = "INSERT INTO treatmenttable(TreatmentID,ModeOfTreatmentID,RegimenID,DateStarted,Complications) " + "VALUES (NULL, (SELECT MAX(ModeOfTreatmentID) FROM modeoftreatmenttable), (SELECT MAX(RegimenID) FROM regimentable), ?, ?)";
	String GET_TREATMENT = "SELECT * FROM treatmenttable WHERE TreatmentID = ?";
	String UPDATE_TREATMENT_AAPHSMDS = "UPDATE treatmenttable SET Transplant = ?, DateStarted = ? WHERE TreatmentID = ?";
	String UPDATE_TREATMENT_COAGULATION = "";
	String UPDATE_TREATMENT_LEUKEMIA = "UPDATE treatmenttable SET DateStarted = ?, CycleNumber = ? WHERE TreatmentID = ?";
	String UPDATE_TREATMENT_LYMPHOMA = "UPDATE treatmenttable SET DateStarted = ?, CycleNumber = ?, Complications = ? WHERE TreatmentID = ?";
	String UPDATE_TREATMENT_MYELOPROLIFERATIVE = "UPDATE treatmenttable SET DateStarted = ? WHERE TreatmentID = ?";
	String UPDATE_TREATMENT_PLASMACELL = "UPDATE treatmenttable SET DateStarted = ?, CycleNumber = ?, Complications = ?  WHERE TreatmentID = ?";
	String UPDATE_TREATMENT_PLATELETCELL = "UPDATE treatmenttable SET DateStarted = ?, Complications = ? WHERE TreatmentID = ?";
	//OTHER TREATMENT
	String INSERT_OTHERTREATMENT = "INSERT INTO othertreatmenttable(OtherTreatmentID, Bisphosphonates, Radiotherapy, OtherMedications, Complications) " + "VALUES (NULL, ?, ?, ?, ?)";
	String GET_OTHERTREATMENT = "SELECT * FROM othertreatmenttable WHERE OtherTreatmentID = ?";
	String UPDATE_OTHERTREATMENT = "UPDATE othertreatmenttable SET Bisphosphonates = ?, Radiotherapy = ?, OtherMedications = ?, Complications = ? WHERE OtherTreatmentID = ?";
	//PATIENT
	String INSERT_PATIENT_AAPHSMDS = "INSERT INTO patienttable VALUES (NULL,1,(SELECT MAX(GeneralDataID) FROM generaldatatable)," + "(SELECT MAX(ClinicalDataID) FROM clinicaldatatable),(SELECT MAX(LaboratoryID) FROM laboratoryprofiletable)," + "(SELECT MAX(TreatmentID) FROM treatmenttable),NULL,1,(SELECT MAX(DiseaseStatusID) FROM diseasestatustable))";
	String INSERT_PATIENT_COAGULATION = "INSERT INTO patienttable VALUES (NULL,2,(SELECT MAX(GeneralDataID) FROM generaldatatable)," + "(SELECT MAX(ClinicalDataID) FROM clinicaldatatable),(SELECT MAX(LaboratoryID) FROM laboratoryprofiletable)," + "(SELECT MAX(TreatmentID) FROM treatmenttable),NULL,1,(SELECT MAX(DiseaseStatusID) FROM diseasestatustable))";
	String INSERT_PATIENT_LEUKEMIA = "INSERT INTO patienttable VALUES (NULL,3,(SELECT MAX(GeneralDataID) FROM generaldatatable)," + "(SELECT MAX(ClinicalDataID) FROM clinicaldatatable),(SELECT MAX(LaboratoryID) FROM laboratoryprofiletable)," + "(SELECT MAX(TreatmentID) FROM treatmenttable),NULL,1,(SELECT MAX(DiseaseStatusID) FROM diseasestatustable))";
	String INSERT_PATIENT_LYMPHOMA = "INSERT INTO patienttable VALUES (NULL,4,(SELECT MAX(GeneralDataID) FROM generaldatatable)," + "(SELECT MAX(ClinicalDataID) FROM clinicaldatatable),(SELECT MAX(LaboratoryID) FROM laboratoryprofiletable)," + "(SELECT MAX(TreatmentID) FROM treatmenttable),NULL,1,(SELECT MAX(DiseaseStatusID) FROM diseasestatustable))";
	String INSERT_PATIENT_MYELOPROLIFERATIVE = "INSERT INTO patienttable VALUES (NULL,5," + "(SELECT MAX(GeneralDataID) FROM generaldatatable),(SELECT MAX(ClinicalDataID) FROM clinicaldatatable)," + "(SELECT MAX(LaboratoryID) FROM laboratoryprofiletable),(SELECT MAX(TreatmentID) FROM treatmenttable),NULL,1,(SELECT MAX(DiseaseStatusID) FROM diseasestatustable))";
	String INSERT_PATIENT_PLASMACELL = "INSERT INTO patienttable VALUES (NULL,6,(SELECT MAX(GeneralDataID) FROM generaldatatable)," + "(SELECT MAX(ClinicalDataID) FROM clinicaldatatable),(SELECT MAX(LaboratoryID) FROM laboratoryprofiletable)," + "(SELECT MAX(TreatmentID) FROM treatmenttable),(SELECT MAX(OtherTreatmentID) FROM othertreatmenttable),1,(SELECT MAX(DiseaseStatusID) FROM diseasestatustable))";
	String INSERT_PATIENT_PLATELETCELL = "INSERT INTO patienttable VALUES (NULL,7,(SELECT MAX(GeneralDataID) FROM generaldatatable)," + "(SELECT MAX(ClinicalDataID) FROM clinicaldatatable),(SELECT MAX(LaboratoryID) FROM laboratoryprofiletable)," + "(SELECT MAX(TreatmentID) FROM treatmenttable),NULL,1,(SELECT MAX(DiseaseStatusID) FROM diseasestatustable))";
	String GET_PATIENT_BASELINE = "SELECT * FROM patienttable WHERE PATIENTID = ?";
	String GET_LIST_PATIENTS_BASELINE_AAPHSMDS = "SELECT * FROM patienttable WHERE DiseaseID = 1";
	String GET_LIST_PATIENTS_BASELINE_COAGULATION = "SELECT * FROM patienttable WHERE DiseaseID = 2";
	String GET_LIST_PATIENTS_BASELINE_LEUKEMIA = "SELECT * FROM patienttable WHERE DiseaseID = 3";
	String GET_LIST_PATIENTS_BASELINE_LYMPHOMA = "SELECT * FROM patienttable WHERE DiseaseID = 4";
	String GET_LIST_PATIENTS_BASELINE_MYELOPROLIFERATIVE = "SELECT * FROM patienttable WHERE DiseaseID = 5";
	String GET_LIST_PATIENTS_BASELINE_PLASMACELL = "SELECT * FROM patienttable WHERE DiseaseID = 6";
	String GET_LIST_PATIENTS_BASELINE_PLATELET = "SELECT * FROM patienttable WHERE DiseaseID = 7";
	String UPDATE_PATIENT_AAPHSMDS = "";
	String UPDATE_PATIENT_COAGULATION = "";
	String UPDATE_PATIENT_LEUKEMIA = "";
	String UPDATE_PATIENT_LYMPHOMA = "";
	String UPDATE_PATIENT_MYELOPROLIFERATIVE = "";
	String UPDATE_PATIENT_PLASMACELL = "";
	String UPDATE_PATIENT_PLATELETCELL = "";
}
