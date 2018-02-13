package utility.database;

public interface SQLCommandsBaseline {

	// BASELINE QUERIES

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
			+ "(SELECT MAX(BoneMarrowAspirateID) FROM BoneMarrowAspirateTable),"
			+ "(SELECT MAX(FlowCytometryID) FROM FlowCytometryTable),"
			+ "(SELECT MAX(CytogeneticMolecularAAPNHID) FROM CytogeneticMolecularAAPNHTable),"
			+ "(SELECT MAX(CytogeneticMolecularMDSID) FROM CytogeneticMolecularMDSTable))";
	String INSERT_LABORATORY_PROFILE_COAGULATION = "INSERT INTO LaboratoryProfileTable "
			+ "(LaboratoryID,DateOfBloodCollection,HematologyID,CoagulationTestingID,BloodChemistryID,ImagingStudiesID) "
			+ "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM HematologyTable),"
			+ "(SELECT MAX(CoagulationTestingID) FROM CoagulationTestingTable),"
			+ "(SELECT MAX(BloodChemistryID) FROM BloodChemistryTable),"
			+ "(SELECT MAX(ImagingStudiesID) FROM ImagingStudiesTable))";
	String INSERT_LABORATORY_PROFILE_LEUKEMIA = "INSERT INTO LaboratoryProfileTable "
			+ "(LaboratoryID,DateOfBloodCollection,HematologyID,BloodChemistryID,BoneMarrowAspirateID,FlowCytometryID,CytogeneticMolecularAAPNHID, ImagingStudiesID) "
			+ "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM HematologyTable),"
			+ "(SELECT MAX(BloodChemistryID) FROM BloodChemistryTable),"
			+ "(SELECT MAX(BoneMarrowAspirateID) FROM BoneMarrowAspirateTable),"
			+ "(SELECT MAX(FlowCytometryID) FROM FlowCytometryTable),"
			+ "(SELECT MAX(CytogeneticMolecularAAPNHID) FROM CytogeneticMolecularAAPNHTable),"
			+ "(SELECT MAX(ImagingStudiesID) FROM ImagingStudiesTable))";
	String INSERT_LABORATORY_PROFILE_LYMPHOMA = "INSERT INTO LaboratoryProfileTable "
			+ "(LaboratoryID,DateOfBloodCollection,HematologyID,BloodChemistryID,BoneMarrowAspirateID,FlowCytometryID,CytogeneticMolecularAAPNHID,ImagingStudiesID, HematopathologyID, ImmunohistochemistryID) "
			+ "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM HematologyTable),"
			+ "(SELECT MAX(BloodChemistryID) FROM BloodChemistryTable),"
			+ "(SELECT MAX(BoneMarrowAspirateID) FROM BoneMarrowAspirateTable),"
			+ "(SELECT MAX(FlowCytometryID) FROM FlowCytometryTable),"
			+ "(SELECT MAX(CytogeneticMolecularAAPNHID) FROM CytogeneticMolecularAAPNHTable),"
			+ "(SELECT MAX(ImagingStudiesID) FROM ImagingStudiesTable),"
			+ "(SELECT MAX(HematopathologyID) FROM HematopathologyTable),"
			+ "(SELECT MAX(ImmunohistochemistryID) FROM ImmunohistochemistryTable))";
	String INSERT_LABORATORY_PROFILE_MYELOPROLIFERATIVE = "INSERT INTO LaboratoryProfileTable "
			+ "(LaboratoryID,DateOfBloodCollection,HematologyID,BloodChemistryID,BoneMarrowAspirateID,MolecularAnalysisID) "
			+ "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM HematologyTable),"
			+ "(SELECT MAX(BloodChemistryID) FROM BloodChemistryTable),"
			+ "(SELECT MAX(BoneMarrowAspirateID) FROM BoneMarrowAspirateTable),"
			+ "(SELECT MAX(CytogeneticMolecularID) FROM CytogeneticMolecularTable))";
	String INSERT_LABORATORY_PROFILE_PLASMACELL = "INSERT INTO LaboratoryProfileTable "
			+ "(LaboratoryID,DateOfBloodCollection,HematologyID,BloodChemistryID,BoneMarrowAspirateID,CytogeneticMolecularID,ImagingStudiesID,SerumFreeID,SerumProteinID,SerumImmunofixationID,UrineProteinID) "
			+ "VALUES (NULL,?,(SELECT MAX(HematologyID) FROM HematologyTable),"
			+ "(SELECT MAX(BloodChemistryID) FROM BloodChemistryTable),"
			+ "(SELECT MAX(BoneMarrowAspirateID) FROM BoneMarrowAspirateTable),"
			+ "(SELECT MAX(CytogeneticMolecularID) FROM CytogeneticMolecularTable),"
			+ "(SELECT MAX(ImagingStudiesID) FROM ImagingStudiesTable),"
			+ "(SELECT MAX(SerumFreeID) FROM SerumFreeTable)," + "(SELECT MAX(SerumProteinID) FROM SerumProteinTable),"
			+ "(SELECT MAX(SerumImmunofixationID) FROM SerumImmunofixationTable),"
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
			+ "(SELECT MAX(MaintenanceTherapyID) FROM MaintenanceTherapyTable), "
			+ "(SELECT MAX(RegimenID) FROM RegimenTable), "
			+ "(SELECT MAX(RegimenTransplantID) FROM RegimenTransplantTable),"
			+ "(SELECT MAX(RegimenNonTransplantID) FROM RegimenNonTransplantTable),?,?,?,?,?,?,?)";
	String INSERT_TREATMENT_PLATELETCELL = "INSERT INTO TreatmentTable(TreatmentID,ModeOfTreatmentID,DateStarted,Complications) "
			+ "VALUES (NULL, (SELECT MAX(ModeOfTreatmentID) FROM ModeOfTreatmentTable), ?, ?)";

	String INSERT_OTHERTREATMENT = "INSERT INTO OtherTreatmentTable(OtherTreatmentID, Bisphosphonates, Radiotherapy, OtherMedications, Complications) "
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
	String INSERT_PATIENT_PLATELETCELL = "INSERT INTO PatientTable VALUES (NULL,7,"
			+ "(SELECT MAX(GeneralDataID) FROM GeneralDataTable),"
			+ "(SELECT MAX(ClinicalDataID) FROM ClinicalDataTable),"
			+ "(SELECT MAX(LaboratoryID) FROM LaboratoryProfileTable),"
			+ "(SELECT MAX(TreatmentID) FROM TreatmentTable),NULL,1,"
			+ "(SELECT MAX(DiseaseStatusID) FROM DiseaseStatusTable))";

}
