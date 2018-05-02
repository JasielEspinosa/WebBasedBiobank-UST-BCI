package utility.database;

public interface SQLCommandsFollowUp {
	
	String key = "il0v3c@nCer4lif3";
	
	// FOLLOW UP QUERIES
	
	String INSERT_MEDICAL_EVENTS = "INSERT INTO medicaleventstable(MedicalEventsID, HematologicMalignancy, OtherDiseaseMedication, ProcedureIntervention, Chemotherapy) VALUES (NULL, ?, ?, ?, ?)";
	String INSERT_MEDICAL_EVENTS_COAGULATION = "INSERT INTO medicaleventstable(MedicalEventsID, FactorConcentrate, FactorConcentrateDates, FactorConcentrateDose, ProcedureIntervention) VALUES (NULL, ?, ?, ?, ?)";
	String INSERT_MEDICAL_EVENTS_PLATELETCELL = "INSERT INTO medicaleventstable(MedicalEventsID, OtherDiseaseMedication, ProcedureIntervention, Chemotherapy) VALUES (NULL, ?, ?, ?)";
	String GET_MEDICAL_EVENTS = "Select * from medicaleventstable where MedicalEventsID = ?";
	
	String UPDATE_MEDICAL_EVENTS = "UPDATE medicaleventstable SET HematologicMalignancy=?, OtherDiseaseMedication=?, ProcedureIntervention=?, Chemotherapy=? WHERE  MedicalEventsID =?";
	String UPDATE_MEDICAL_EVENTS_COAGULATION = "UPDATE medicaleventstable SET FactorConcentrate=?, FactorConcentrateDates=?, FactorConcentrateDose=?, ProcedureIntervention=? WHERE  MedicalEventsID=?";
	String UPDATE_MEDICAL_EVENTS_PLATELETCELL = "UPDATE medicaleventstable SET OtherDiseaseMedication=?, ProcedureIntervention=?, Chemotherapy=? WHERE  MedicalEventsID=?";
	
	String INSERT_PHYSICAL_EXAM = "INSERT INTO physicalexamtable(PhysicalExamID, Weight, ECOG, PertinentFindings) VALUES (NULL, ?, ?, ?) ";
	String UPDATE_PHYSICAL_EXAM = "UPDATE physicalexamtable SET Weight=?, ECOG=?, PertinentFindings=? WHERE PhysicalExamID=?";
	String GET_PHYSICAL_EXAM = "Select * from physicalexamtable where PhysicalExamID = ?";
	
	String INSERT_CLINICAL_DATA = "INSERT INTO clinicaldatatable(ClinicalDataID,CurrentSymptoms, PhysicalExamID)  VALUES (NULL, ?, (SELECT MAX(PhysicalExamID) FROM physicalexamtable)) ";
	String UPDATE_CLINICAL_DATA = "UPDATE clinicaldatatable SET CurrentSymptoms=? WHERE ClinicalDataID=?";
	String GET_CLINICAL_DATA = "Select * from clinicaldatatable where ClinicalDataID = ?";
	
	String INSERT_HEMATOLOGY = "INSERT INTO hematologytable VALUES (NULL,?,?,?,?,?,?,?,?,?,?,?,?) ";
	String UPDATE_HEMATOLOGY = "UPDATE hematologytable SET Hemoglobin=?, Hematocrit=?, WhiteBloodCells=?, Neutrophils=?, Lymphocytes=?, Monocytes=?, Eosinophils=?, Basophils=?, Myelocytes=?, Metamyelocytes=?, Blasts=?, PlateletCount=? WHERE HematologyID=? ";
	String GET_HEMATOLOGY = "Select * from hematologytable where HematologyID = ? ";
	
	String INSERT_OTHER_LABORATORIES_AAPHSMDS = "INSERT INTO otherlaboratoriestable(OtherLaboratoriesID,Creatinine,ReticulocyteCount,SerumFerritin,LDH) VALUES (NULL,?,?,?,?)";
	String UPDATE_OTHER_LABORATORIES_AAPHSMDS = "UPDATE otherlaboratoriestable SET Creatinine=?,ReticulocyteCount=?,SerumFerritin=?,LDH=? WHERE OtherLaboratoriesID=?";
	String GET_OTHER_LABORATORIES_AAPHSMDS = "Select * from otherlaboratoriestable where OtherLaboratoriesID = ?";
	
	String INSERT_BLOOD_CHEMISTRY_LYMPHOMA = "INSERT INTO bloodchemistrytable(BloodChemistryID, LDH, ESR) VALUES (NULL, ?, ?) ";
	String UPDATE_BLOOD_CHEMISTRY_LYMPHOMA = "UPDATE bloodchemistrytable SET LDH=?, ESR=? WHERE BloodChemistryID=?";
	String GET_BLOOD_CHEMISTRY = "Select * from bloodchemistrytable where BloodChemistryID = ? ";
	
	String INSERT_BLOOD_CHEMISTRY_PLASMACELL = "INSERT INTO bloodchemistrytable(BloodChemistryID, Creatinine, iCa, TotalProtein, Albumin,  Globulin) VALUES (NULL, ?, ?, ?, ?, ?) ";
	String UPDATE_BLOOD_CHEMISTRY_PLASMACELL = "UPDATE bloodchemistrytable SET Creatinine=?, iCa=?, TotalProtein=?, Albumin=?, Globulin=? WHERE BloodChemistryID=?";
	
	String INSERT_BONE_MARROW_ASPIRATE = "INSERT INTO bonemarrowaspiratetable VALUES (NULL,?,?)  ";
	String UPDATE_BONE_MARROW_ASPIRATE = "UPDATE bonemarrowaspiratetable SET DatePerformed=?, Result=? WHERE BoneMarrowAspirateID=?";
	String GET_BONE_MARROW_ASPIRATE = "Select * from bonemarrowaspiratetable where BoneMarrowAspirateID = ?";
	
	String INSERT_FLOWCYTOMETRY = "INSERT INTO flowcytometrytable VALUES (NULL,?)  ";
	String UPDATE_FLOWCYTOMETRY = "UPDATE flowcytometrytable SET Result=? WHERE FlowCytometryID=?";
	String GET_FLOWCYTOMETRY = "Select * from flowcytometrytable where FlowCytometryID = ?";
	
	String INSERT_CYTOGENETIC_MOLECULAR = "INSERT INTO cytogeneticmoleculartable VALUES (NULL,?)  ";
	String UPDATE_CYTOGENETIC_MOLECULAR = "UPDATE cytogeneticmoleculartable SET Result=? WHERE CytogeneticMolecularID=?";
	String GET_CYTOGENETIC_MOLECULAR = "Select * from cytogeneticmoleculartable where CytogeneticMolecularID = ?";
	
	String INSERT_IMAGING_STUDIES = "INSERT INTO imagingstudiestable VALUES (NULL, ?) ";
	String UPDATE_IMAGING_STUDIES = "UPDATE imagingstudiestable SET Result=? WHERE ImagingStudiesID=?";
	String GET_IMAGING_STUDIES = "Select * from imagingstudiestable where ImagingStudiesID = ?";
	
	String INSERT_SERUMFREE = "INSERT INTO serumfreetable VALUES (NULL,?)";
	String UPDATE_SERUMFREE = "UPDATE serumfreetable SET Result=? WHERE SerumFreeID=?";
	String GET_SERUMFREE = "Select * from serumfreetable where SerumFreeID = ?";
	
	String INSERT_SERUMIMMUNOFIXATION = "INSERT INTO serumimmunofixationtable VALUES (NULL,?)";
	String UPDATE_SERUMIMMUNOFIXATION = "UPDATE serumimmunofixationtable SET Result=? WHERE SerumImmunofixationID=?";
	String GET_SERUMIMMUNOFIXATION = "Select * from serumimmunofixationtable where SerumImmunofixationID = ?";
	
	String INSERT_SERUMPROTEIN = "INSERT INTO serumproteintable VALUES (NULL,?)";
	String UPDATE_SERUMPROTEIN = "UPDATE serumproteintable SET Result=? WHERE SerumProteinID=?";
	String GET_SERUMPROTEIN = "Select * from serumproteintable where SerumProteinID = ?";
	
	String INSERT_URINEPROTEIN = "INSERT INTO urineproteintable VALUES (NULL,?)";
	String UPDATE_URINEPROTEIN = "UPDATE urineproteintable SET Result=? WHERE UrineProteinID=?";
	String GET_URINEPROTEIN = "Select * from urineproteintable where UrineProteinID = ?";
	
	String INSERT_LABORATORY_PROFILE_AAPHSMDS = "INSERT INTO LaboratoryProfileTable (LaboratoryID,DateOfBloodCollection,HematologyID,OtherLaboratoriesID,BoneMarrowAspirateID,FlowCytometryID,CytogeneticMolecularID)  VALUES (NULL,?,(SELECT MAX(HematologyID) FROM hematologytable), (SELECT MAX(OtherLaboratoriesID) FROM otherlaboratoriestable), (SELECT MAX(BoneMarrowAspirateID) FROM bonemarrowaspiratetable),(SELECT MAX(FlowCytometryID) FROM flowcytometrytable), (SELECT MAX(CytogeneticMolecularID) FROM cytogeneticmoleculartable)) ";
	String INSERT_LABORATORY_PROFILE_LEUKEMIA = "INSERT INTO LaboratoryProfileTable (LaboratoryID,DateOfBloodCollection,HematologyID,BoneMarrowAspirateID,FlowCytometryID,CytogeneticMolecularID)  VALUES (NULL,?,(SELECT MAX(HematologyID) FROM hematologytable), (SELECT MAX(BoneMarrowAspirateID) FROM bonemarrowaspiratetable),(SELECT MAX(FlowCytometryID) FROM flowcytometrytable), (SELECT MAX(CytogeneticMolecularID) FROM cytogeneticmoleculartable)) ";
	String INSERT_LABORATORY_PROFILE_LYMPHOMA = "INSERT INTO LaboratoryProfileTable (LaboratoryID,DateOfBloodCollection,HematologyID,BloodChemistryID,ImagingStudiesID)  VALUES (NULL,?,(SELECT MAX(HematologyID) FROM hematologytable),(SELECT MAX(BloodChemistryID) FROM bloodchemistrytable), (SELECT MAX(ImagingStudiesID) FROM imagingstudiestable)) ";
	String INSERT_LABORATORY_PROFILE_MYELOPROLIFERATIVE = "INSERT INTO LaboratoryProfileTable (LaboratoryID,DateOfBloodCollection,HematologyID,BoneMarrowAspirateID)  VALUES (NULL,?,(SELECT MAX(HematologyID) FROM hematologytable), (SELECT MAX(BoneMarrowAspirateID) FROM bonemarrowaspiratetable)) ";
	String INSERT_LABORATORY_PROFILE_PLASMACELL = "INSERT INTO LaboratoryProfileTable (LaboratoryID, DateOfBloodCollection, HematologyID, BloodChemistryID, BoneMarrowAspirateID, ImagingStudiesID, SerumFreeID, SerumProteinID, SerumImmunofixationID, UrineProteinID)  VALUES (NULL, ?, (SELECT MAX(HematologyID) FROM hematologytable),	 (SELECT MAX(BloodChemistryID) FROM bloodchemistrytable),  (SELECT MAX(BoneMarrowAspirateID) FROM bonemarrowaspiratetable),  (SELECT MAX(ImagingStudiesID) FROM imagingstudiestable),	(SELECT MAX(SerumFreeID) FROM serumfreetable),	 (SELECT MAX(SerumProteinID) FROM serumproteintable),  (SELECT MAX(SerumImmunofixationID) FROM serumimmunofixationtable),	  (SELECT MAX(UrineProteinID) FROM urineproteintable)) ";
	String INSERT_LABORATORY_PROFILE_PLATELETCELL = "INSERT INTO LaboratoryProfileTable (LaboratoryID,DateOfBloodCollection,HematologyID,ImagingStudiesID)  VALUES (NULL,?,(SELECT MAX(HematologyID) FROM hematologytable),  (SELECT MAX(ImagingStudiesID) FROM imagingstudiestable)) ";
	
	String UPDATE_LABORATORY_PROFILE = "UPDATE LaboratoryProfileTable SET DateOfBloodCollection=? WHERE LaboratoryID=?";
	String GET_LABORATORY_PROFILE = "Select * from LaboratoryProfileTable where LaboratoryID = ?";
	
	String INSERT_DISEASE_STATUS = "INSERT INTO diseasestatustable VALUES (NULL,?,NULL,?)  ";
	String UPDATE_DISEASE_STATUS = "UPDATE diseasestatustable SET DiseaseStatus=?, OtherDisease=? WHERE DiseaseStatusID=?";
	
	String INSERT_DISEASE_STATUS_PLASMACELL = "INSERT INTO diseasestatustable VALUES (NULL,?,?,?)  ";
	String UPDATE_DISEASE_STATUS_PLASMACELL = "UPDATE diseasestatustable SET DiseaseStatus=?, RelapseDisease=?, OtherDisease=? WHERE DiseaseStatusID=?";
	
	String GET_DISEASE_STATUS = "Select * from diseasestatustable where DiseaseStatusID = ?";
	
	String INSERT_FOLLOWUP_AAPHSMDS = "INSERT INTO followuptable(PatientID, FollowUpID, DateOfEntry, DateOfVisit, MedicalEventsID, ClinicalDataID, LaboratoryID, DiseaseStatusID, Notes)  VALUES (?, NULL, HEX(AES_ENCRYPT(?, '" + key + "')), HEX(AES_ENCRYPT(?, '" + key + "')), (SELECT MAX(MedicalEventsID) FROM medicaleventstable),  (SELECT MAX(ClinicalDataID) FROM clinicaldatatable), (SELECT MAX(LaboratoryID) FROM LaboratoryProfileTable),  (SELECT MAX(DiseaseStatusID) FROM diseasestatustable), ?) ";
	String INSERT_FOLLOWUP_COAGULATION = "INSERT INTO followuptable(PatientID, FollowUpID, DateOfEntry, DateOfVisit, MedicalEventsID, DiseaseStatusID, Notes)  VALUES (?, NULL, HEX(AES_ENCRYPT(?, '" + key + "')), HEX(AES_ENCRYPT(?, '" + key + "')), (SELECT MAX(MedicalEventsID) FROM medicaleventstable), (SELECT MAX(DiseaseStatusID) FROM diseasestatustable), ?) ";
	String INSERT_FOLLOWUP_LEUKEMIA = "INSERT INTO followuptable(PatientID, FollowUpID, DateOfEntry, DateOfVisit, MedicalEventsID, ClinicalDataID, LaboratoryID, DiseaseStatusID, Notes)  VALUES (?, NULL, HEX(AES_ENCRYPT(?, '" + key + "')), HEX(AES_ENCRYPT(?, '" + key + "')), (SELECT MAX(MedicalEventsID) FROM medicaleventstable),  (SELECT MAX(ClinicalDataID) FROM clinicaldatatable), (SELECT MAX(LaboratoryID) FROM LaboratoryProfileTable),  (SELECT MAX(DiseaseStatusID) FROM diseasestatustable), ?) ";
	String INSERT_FOLLOWUP_LYMPHOMA = "INSERT INTO followuptable(PatientID, FollowUpID, DateOfEntry, DateOfVisit, MedicalEventsID, ClinicalDataID, LaboratoryID, DiseaseStatusID, Notes)  VALUES (?, NULL, HEX(AES_ENCRYPT(?, '" + key + "')), HEX(AES_ENCRYPT(?, '" + key + "')), (SELECT MAX(MedicalEventsID) FROM medicaleventstable),  (SELECT MAX(ClinicalDataID) FROM clinicaldatatable), (SELECT MAX(LaboratoryID) FROM LaboratoryProfileTable),  (SELECT MAX(DiseaseStatusID) FROM diseasestatustable), ?) ";
	String INSERT_FOLLOWUP_MYELOPROLIFERATIVE = "INSERT INTO followuptable(PatientID, FollowUpID, DateOfEntry, DateOfVisit, MedicalEventsID, ClinicalDataID, LaboratoryID, DiseaseStatusID, Notes)  VALUES (?, NULL, HEX(AES_ENCRYPT(?, '" + key + "')), HEX(AES_ENCRYPT(?, '" + key + "')), (SELECT MAX(MedicalEventsID) FROM medicaleventstable),  (SELECT MAX(ClinicalDataID) FROM clinicaldatatable), (SELECT MAX(LaboratoryID) FROM LaboratoryProfileTable),  (SELECT MAX(DiseaseStatusID) FROM diseasestatustable), ?) ";
	String INSERT_FOLLOWUP_PLASMACELL = "INSERT INTO followuptable(PatientID, FollowUpID, DateOfEntry, DateOfVisit, MedicalEventsID, ClinicalDataID, LaboratoryID, DiseaseStatusID, Notes)  VALUES (?, NULL, HEX(AES_ENCRYPT(?, '" + key + "')), HEX(AES_ENCRYPT(?, '" + key + "')), (SELECT MAX(MedicalEventsID) FROM medicaleventstable),  (SELECT MAX(ClinicalDataID) FROM clinicaldatatable), (SELECT MAX(LaboratoryID) FROM LaboratoryProfileTable),  (SELECT MAX(DiseaseStatusID) FROM diseasestatustable), ?) ";
	String INSERT_FOLLOWUP_PLATELETCELL = "INSERT INTO followuptable(PatientID, FollowUpID, DateOfEntry, DateOfVisit, MedicalEventsID, ClinicalDataID, LaboratoryID, DiseaseStatusID, Notes)  VALUES (?, NULL, HEX(AES_ENCRYPT(?, '" + key + "')), HEX(AES_ENCRYPT(?, '" + key + "')), (SELECT MAX(MedicalEventsID) FROM medicaleventstable),  (SELECT MAX(ClinicalDataID) FROM clinicaldatatable), (SELECT MAX(LaboratoryID) FROM LaboratoryProfileTable),  (SELECT MAX(DiseaseStatusID) FROM diseasestatustable), ?) ";
	
	String UPDATE_FOLLOWUP = "UPDATE followuptable SET DateOfEntry=HEX(AES_ENCRYPT(?, '" + key + "')), DateOfVisit=HEX(AES_ENCRYPT(?, '" + key + "')), Notes=? WHERE FollowUpID=?";
	
	String GET_FOLLOWUP = "Select *, CONVERT(AES_DECRYPT(UNHEX(DateOfEntry), '" + key + "'), DATE) as DateOfEntryDec, CONVERT(AES_DECRYPT(UNHEX(DateOfVisit), '" + key + "'), DATE) as DateOfVisitDec FROM followuptable WHERE FollowUpID = ?";
	
}
