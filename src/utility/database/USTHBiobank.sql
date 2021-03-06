DROP DATABASE usthbiobank;
CREATE DATABASE usthbiobank;
USE usthbiobank;

CREATE TABLE DiseaseTable (
	DiseaseID int NOT NULL,
	DiseaseName varchar(100) NOT NULL,
	PRIMARY KEY (DiseaseID)
);

INSERT INTO diseasetable VALUES(1,"AAPHSMDS");
INSERT INTO diseasetable VALUES(2,"COAGULATION DISEASE");
INSERT INTO diseasetable VALUES(3,"LEUKEMIA");
INSERT INTO diseasetable VALUES(4,"LYPHOMA");
INSERT INTO diseasetable VALUES(5,"MYELOPROLIFERATIVE NEOPLASM");
INSERT INTO diseasetable VALUES(6,"PLASMA CELL DISORDER");
INSERT INTO diseasetable VALUES(7,"PLATELET DISORDER");

CREATE TABLE TokenTable (
	AccountID int NOT NULL,
	Token varchar(500) NOT NULL,
	Expiration TimeStamp NOT NULL
);

CREATE TABLE PatientTable (
	PatientID int NOT NULL AUTO_INCREMENT,
	DiseaseID int NOT NULL,
	GeneralDataID int NOT NULL,
	ClinicalDataID int NOT NULL,
	LaboratoryID int NOT NULL,
	TreatmentID int NOT NULL,
	OtherTreatmentID int,
	Active int NOT NULL,
	DiseaseStatusID int,
	PRIMARY KEY (PatientID)
);

CREATE TABLE GeneralDataTable (
	GeneralDataID int NOT NULL AUTO_INCREMENT,
	LastName varchar(500) NOT NULL,
	FirstName varchar(500) NOT NULL,
	MiddleName varchar(500),
	Gender int NOT NULL,
	DateOfBirth varchar(500) NULL,
	DateOfEntry varchar(500) NOT NULL,
	AddressID int NOT NULL,
	CivilStatus varchar(100),
	TissueSpecimenID int,
	PRIMARY KEY (GeneralDataID)
);

CREATE TABLE AddressTable (
	AddressID int NOT NULL AUTO_INCREMENT,
	StreetAddress varchar(500) NOT NULL,
	City varchar(200) NOT NULL,
	ZIPCode varchar(200) NOT NULL,
	PRIMARY KEY (AddressID)
);

CREATE TABLE TissueSpecimenTable (
	TissueSpecimenID int NOT NULL AUTO_INCREMENT,
	TissueSpecimenName varchar(150),
	PRIMARY KEY (TissueSpecimenID)
);

CREATE TABLE FamilyCancerTable (
	FamilyCancerID int NOT NULL AUTO_INCREMENT,
	ClinicalDataID int NOT NULL,
	RelationshipToPatient blob,
	CancerName blob,
	PRIMARY KEY (FamilyCancerID)
);

CREATE TABLE OtherDiseasesTable (
	OtherDiseasesID int NOT NULL AUTO_INCREMENT,
	ClinicalDataID int NOT NULL,
	OtherDiseases blob,
	PRIMARY KEY (OtherDiseasesID)
);

CREATE TABLE ClinicalDataTable (
	ClinicalDataID int NOT NULL AUTO_INCREMENT,
	DateOfVisit varchar(500),
	Diagnosis blob,
	OtherDiagnosis blob,
	PrognosticRiskScoringID int,
	RiskScoreID int,
	ClassificationID int,
	ISSStagingID int,
	SeverityID int,
	StageOfDisease blob,
	ChiefComplaint blob,
	CurrentSymptoms blob,
	ConstitutionalSymptoms blob,
	OtherSymptoms blob,
	Comorbidities blob,
	SmokingHistory blob,
	AlcoholIntakeHistory blob,
	ChemicalExposure blob,
	PreviousInfection blob,
	PreviousHematologicDisorder blob,
	PhysicalExamID int,
	OtherFindings blob,
	PRIMARY KEY (ClinicalDataID)
);

CREATE TABLE ClassificationTable (
	ClassificationID int NOT NULL AUTO_INCREMENT,
	ClassificationName varchar(100) NOT NULL,
	PRIMARY KEY (ClassificationID)
);

CREATE TABLE MedicationsTable (
	MedicationsID int NOT NULL AUTO_INCREMENT,
	ClinicalDataID int NOT NULL,
	GenericName varchar(300),
	Dose double,
	Frequency varchar(300),
	PRIMARY KEY (MedicationsID)
);

CREATE TABLE PhysicalExamTable (
	PhysicalExamID int NOT NULL AUTO_INCREMENT,
	Height double,
	Weight double,
	ECOG double,
	Splenomegaly double,
	Hepatomegaly double,
	Lymphadenopathies double,
	Hemarthroses bool,
	ContracturesAndMuscleAtrophy bool,
	ThrombosisHistory blob,
	Skin blob,
	PertinentFindings bool,
	OtherFindings blob,
	PRIMARY KEY (PhysicalExamID)
);

CREATE TABLE RiskScoreTable (
	RiskScoreID int NOT NULL AUTO_INCREMENT,
	RiskScoreName varchar(500) NOT NULL,
	OtherRiskScore varchar(500),
	PRIMARY KEY (RiskScoreID)
);

CREATE TABLE ISSStagingTable (
	ISSStagingID int NOT NULL AUTO_INCREMENT,
	ISSStagingName varchar(100) NOT NULL,
	PRIMARY KEY (ISSStagingID)
);

CREATE TABLE SeverityTable (
	SeverityID int NOT NULL AUTO_INCREMENT,
	SeverityName varchar(100) NOT NULL,
	PRIMARY KEY (SeverityID)
);

CREATE TABLE PrognosticRiskScoringTable (
	PrognosticRiskScoringID int NOT NULL AUTO_INCREMENT,
	PrognosticRiskScoringName varchar(300) NOT NULL,
	OtherPrognosticRiskScoring varchar(300),
	PRIMARY KEY (PrognosticRiskScoringID)
);

CREATE TABLE LaboratoryProfileTable (
	LaboratoryID int NOT NULL AUTO_INCREMENT,
	DateOfBloodCollection DATE NOT NULL,
	HematologyID int,
	CoagulationTestingID int,
	BloodChemistryID int,
	OtherLaboratoriesID int,
	BoneMarrowAspirateID int,
	FlowCytometryID int,
	CytogeneticMolecularID int,
	CytogeneticMolecularAAPNHID int,
	CytogeneticMolecularMDSID int,
	ImagingStudiesID int,
	UpperGIEndoscopyID int,
	MolecularAnalysisID int,
	HematopathologyID int,
	ImmunohistochemistryID int,
	SerumFreeID int,
	SerumProteinID int,
	SerumImmunofixationID int,
	UrineProteinID int,
	ITP varchar(100),
	PRIMARY KEY (LaboratoryID)
);

CREATE TABLE HematologyTable (
	HematologyID int NOT NULL AUTO_INCREMENT,
	Hemoglobin double,
	Hematocrit double,
	WhiteBloodCells double,
	Neutrophils double,
	Lymphocytes double,
	Monocytes double,
	Eosinophils double,
	Basophils double,
	Myelocytes double,
	Metamyelocytes double,
	Blasts double,
	PlateletCount double,
	PRIMARY KEY (HematologyID)
);

CREATE TABLE OtherLaboratoriesTable (
	OtherLaboratoriesID int NOT NULL AUTO_INCREMENT,
	Creatinine double,
	UricAcid double,
	ReticulocyteCount double,
	SerumIron double,
	IronbindingCapacity double,
	SerumFerritin double,
	DirectAntiglobulin varchar(10),
	IndirectAntiglobulin varchar(10),
	SGOT double,
	SGPT double,
	LDH double,
	ScreenTestHepatitis varchar(10),
	ScreenTestEBVCytomegalovirusHIV varchar(10),
	ErythropeitinLevel double,
	SerumFolicAcid double,
	SerumB12 double,
	TSH double,
	PRIMARY KEY (OtherLaboratoriesID)
);

CREATE TABLE BloodChemistryTable (
	BloodChemistryID int NOT NULL AUTO_INCREMENT,
	BloodUreaNitrogen double,
	Creatinine double,
	UricAcid double,
	SGOT double,
	SGPT double,
	LDH double,
	EPOLevel double,
	Na double,
	K double,
	BilirubinTotal double,
	BilirubinDirect double,
	BilirubinIndirect double,
	Beta2Microglobulin double,
	HepatitisBTesting double,
	ESR double,
	iCa double,
	TotalProtein double,
	Albumin double,
	Globulin double,
	ANATiter double,
	HepatitisCRna double,
	PRIMARY KEY (BloodChemistryID)
);

CREATE TABLE BoneMarrowAspirateTable (
	BoneMarrowAspirateID int NOT NULL AUTO_INCREMENT,
	DatePerformed blob,
	Result blob,
	PRIMARY KEY (BoneMarrowAspirateID)
);

CREATE TABLE FlowCytometryTable (
	FlowCytometryID int NOT NULL AUTO_INCREMENT,
	Result blob,
	PRIMARY KEY (FlowCytometryID)
);

CREATE TABLE CytogeneticMolecularTable (
	CytogeneticMolecularID int NOT NULL AUTO_INCREMENT,
	Result blob,
	PRIMARY KEY (CytogeneticMolecularID)
);

CREATE TABLE CytogeneticMolecularAAPNHTable (
	CytogeneticMolecularAAPNHID int NOT NULL AUTO_INCREMENT,
	Result blob,
	PRIMARY KEY (CytogeneticMolecularAAPNHID)
);

CREATE TABLE CytogeneticMolecularMDSTable  (
	CytogeneticMolecularMDSID int NOT NULL AUTO_INCREMENT,
	Result blob,
	PRIMARY KEY (CytogeneticMolecularMDSID)
);

CREATE TABLE ImagingStudiesTable (
	ImagingStudiesID int NOT NULL AUTO_INCREMENT,
	Result blob,
	PRIMARY KEY (ImagingStudiesID)
);

CREATE TABLE UpperGIEndoscopyTable (
	UpperGIEndoscopyID int NOT NULL AUTO_INCREMENT,
	DatePerformed blob,
	Description blob,
	HPylori bool,
	PRIMARY KEY (UpperGIEndoscopyID)
);

CREATE TABLE HematopathologyTable (
	HematopathologyID int NOT NULL AUTO_INCREMENT,
	DatePerformed blob,
	Result blob,
	PRIMARY KEY (HematopathologyID)
);

CREATE TABLE ImmunohistochemistryTable (
	ImmunohistochemistryID int NOT NULL AUTO_INCREMENT,
	DatePerformed blob,
	Result blob,
	PRIMARY KEY (ImmunohistochemistryID)
);

CREATE TABLE CoagulationTestingTable (
	CoagulationTestingID int NOT NULL AUTO_INCREMENT,
	FactorVIIILevel double NOT NULL,
	FactorIXLevel double NOT NULL,
	InhibitorAssay double NOT NULL,
	BethesdaUnits  double NOT NULL,
	PRIMARY KEY (CoagulationTestingID)
);

CREATE TABLE SerumFreeTable (
	SerumFreeID int NOT NULL AUTO_INCREMENT,
	Result blob,
	PRIMARY KEY (SerumFreeID)
);

CREATE TABLE SerumProteinTable (
	SerumProteinID int NOT NULL AUTO_INCREMENT,
	Result blob,
	PRIMARY KEY (SerumProteinID)
);

CREATE TABLE SerumImmunofixationTable (
	SerumImmunofixationID int NOT NULL AUTO_INCREMENT,
	Result blob,
	PRIMARY KEY (SerumImmunofixationID)
);

CREATE TABLE UrineProteinTable  (
	UrineProteinID int NOT NULL AUTO_INCREMENT,
	Result blob,
	PRIMARY KEY (UrineProteinID)
);

CREATE TABLE TreatmentTable (
	TreatmentID int NOT NULL AUTO_INCREMENT,
	Transplant bool,
	ModeOfTreatmentID int,
	ChemoMedicationID int,
	MaintenanceTherapyID int,
	RegimenID int,
	RegimenTransplantID int,
	RegimenNonTransplantID int,
	RegimenText blob,
	CycleNumber int,
	DateStarted DATE,
	Complications blob,
	PRIMARY KEY (TreatmentID)
);

CREATE TABLE ModeOfTreatmentTable (
	ModeOfTreatmentID int NOT NULL AUTO_INCREMENT,
	ModeOfTreatment varchar(100),
	NameOfTreatment varchar(100),
	PRIMARY KEY (ModeOfTreatmentID)
);

CREATE TABLE ChemoMedicationsTable (
	ChemoMedicationID int NOT NULL AUTO_INCREMENT,
	MedicationName blob NOT NULL,
	PRIMARY KEY (ChemoMedicationID)
);

CREATE TABLE RegimenTable (
	RegimenID int NOT NULL AUTO_INCREMENT,
	RegimenName blob,
	OtherRegimen blob,
	PRIMARY KEY (RegimenID)
);

CREATE TABLE RegimenTransplantTable (
	RegimenTransplantID int NOT NULL AUTO_INCREMENT,
	RegimenName blob,
	OtherRegimen blob,
	PRIMARY KEY (RegimenTransplantID)
);

CREATE TABLE RegimenNonTransplantTable (
	RegimenNonTransplantID int NOT NULL AUTO_INCREMENT,
	RegimenName blob,
	OtherRegimen blob,
	PRIMARY KEY (RegimenNonTransplantID)
);

CREATE TABLE MaintenanceTherapyTable (
	MaintenanceTherapyID int NOT NULL AUTO_INCREMENT,
	MaintenanceTherapyName blob,
	OtherMaintenanceTherapy blob,
	PRIMARY KEY (MaintenanceTherapyID)
);

CREATE TABLE FollowUpTable (
	FollowUpID int NOT NULL AUTO_INCREMENT,
	PatientID int,
	DateOfEntry varchar(500) NOT NULL,
	DateOfVisit varchar(500) NOT NULL,
	MedicalEventsID int,
	ClinicalDataID int,
	LaboratoryID int,
	DiseaseStatusID int,
	Notes blob NOT NULL,
	PRIMARY KEY (FollowUpID)
);

CREATE TABLE OtherTreatmentTable (
	OtherTreatmentID int NOT NULL AUTO_INCREMENT,
	Bisphosphonates blob,
	Radiotherapy blob,
	Dialysis bool,
	OtherMedications blob,
	Complications blob,
	PRIMARY KEY (OtherTreatmentID)
);

CREATE TABLE DiseaseStatusTable (
	DiseaseStatusID int NOT NULL AUTO_INCREMENT,
	DiseaseStatus blob NOT NULL,
	RelapseDisease blob,
	OtherDisease  blob,
	PRIMARY KEY (DiseaseStatusID)
);

CREATE TABLE MedicalEventsTable (
	MedicalEventsID int NOT NULL AUTO_INCREMENT,
	HematologicMalignancy blob,
	OtherDiseaseMedication blob,
	FactorConcentrate blob,
	FactorConcentrateDates blob,
	FactorConcentrateDose double,
	ProcedureIntervention blob,
	Chemotherapy blob,
	PRIMARY KEY (MedicalEventsID)
);

CREATE TABLE AccountTable (
	AccountID int NOT NULL AUTO_INCREMENT,
	Username varchar(750) NOT NULL,
	Password varchar(750) NOT NULL,
	LastName varchar(500) NOT NULL,
	FirstName varchar(500) NOT NULL,
	MiddleName varchar(500),
	RoleID int NOT NULL,
    Active int NOT NULL,
	PRIMARY KEY (AccountID)
);

CREATE TABLE RoleTable (
	RoleID int NOT NULL,
	RoleName varchar(500) NOT NULL,
	PRIMARY KEY (RoleID)
);

CREATE TABLE AuditTable (
	AuditID int NOT NULL AUTO_INCREMENT,
	Action varchar(300) DEFAULT NULL,
	PerformedOn varchar(300) DEFAULT NULL,
	PerformedBy varchar(300) DEFAULT NULL,
	Date varchar(100) DEFAULT NULL,
	Time varchar(100) DEFAULT NULL,
	UserID int NOT NULL,
	PRIMARY KEY (AuditID)
);

ALTER TABLE PatientTable ADD CONSTRAINT PatientTable_fk0 FOREIGN KEY (DiseaseID) REFERENCES DiseaseTable(DiseaseID);

ALTER TABLE PatientTable ADD CONSTRAINT PatientTable_fk1 FOREIGN KEY (GeneralDataID) REFERENCES GeneralDataTable(GeneralDataID);

ALTER TABLE PatientTable ADD CONSTRAINT PatientTable_fk2 FOREIGN KEY (ClinicalDataID) REFERENCES ClinicalDataTable(ClinicalDataID);

ALTER TABLE PatientTable ADD CONSTRAINT PatientTable_fk3 FOREIGN KEY (LaboratoryID) REFERENCES LaboratoryProfileTable(LaboratoryID);

ALTER TABLE PatientTable ADD CONSTRAINT PatientTable_fk4 FOREIGN KEY (TreatmentID) REFERENCES TreatmentTable(TreatmentID);

ALTER TABLE PatientTable ADD CONSTRAINT PatientTable_fk5 FOREIGN KEY (OtherTreatmentID) REFERENCES OtherTreatmentTable(OtherTreatmentID);

ALTER TABLE PatientTable ADD CONSTRAINT PatientTable_fk6 FOREIGN KEY (DiseaseStatusID) REFERENCES DiseaseStatusTable(DiseaseStatusID);

ALTER TABLE GeneralDataTable ADD CONSTRAINT GeneralDataTable_fk0 FOREIGN KEY (AddressID) REFERENCES AddressTable(AddressID);

ALTER TABLE GeneralDataTable ADD CONSTRAINT GeneralDataTable_fk1 FOREIGN KEY (TissueSpecimenID) REFERENCES TissueSpecimenTable(TissueSpecimenID);

ALTER TABLE ClinicalDataTable ADD CONSTRAINT ClinicalDataTable_fk0 FOREIGN KEY (PrognosticRiskScoringID) REFERENCES PrognosticRiskScoringTable(PrognosticRiskScoringID);

ALTER TABLE ClinicalDataTable ADD CONSTRAINT ClinicalDataTable_fk1 FOREIGN KEY (RiskScoreID) REFERENCES RiskScoreTable(RiskScoreID);

ALTER TABLE ClinicalDataTable ADD CONSTRAINT ClinicalDataTable_fk2 FOREIGN KEY (ClassificationID) REFERENCES ClassificationTable(ClassificationID);

ALTER TABLE ClinicalDataTable ADD CONSTRAINT ClinicalDataTable_fk3 FOREIGN KEY (ISSStagingID) REFERENCES ISSStagingTable(ISSStagingID);

ALTER TABLE ClinicalDataTable ADD CONSTRAINT ClinicalDataTable_fk4 FOREIGN KEY (SeverityID) REFERENCES SeverityTable(SeverityID);

ALTER TABLE ClinicalDataTable ADD CONSTRAINT ClinicalDataTable_fk5 FOREIGN KEY (PhysicalExamID) REFERENCES PhysicalExamTable(PhysicalExamID);

ALTER TABLE MedicationsTable ADD CONSTRAINT MedicationsTable_fk0 FOREIGN KEY (ClinicalDataID) REFERENCES ClinicalDataTable(ClinicalDataID);

ALTER TABLE FamilyCancerTable ADD CONSTRAINT FamilyCancerTable_fk0 FOREIGN KEY (ClinicalDataID) REFERENCES ClinicalDataTable(ClinicalDataID);

ALTER TABLE OtherDiseasesTable ADD CONSTRAINT OtherDiseasesTable_fk0 FOREIGN KEY (ClinicalDataID) REFERENCES ClinicalDataTable(ClinicalDataID);

ALTER TABLE LaboratoryProfileTable ADD CONSTRAINT LaboratoryProfileTable_fk0 FOREIGN KEY (HematologyID) REFERENCES HematologyTable(HematologyID);

ALTER TABLE LaboratoryProfileTable ADD CONSTRAINT LaboratoryProfileTable_fk1 FOREIGN KEY (BloodChemistryID) REFERENCES BloodChemistryTable(BloodChemistryID);

ALTER TABLE LaboratoryProfileTable ADD CONSTRAINT LaboratoryProfileTable_fk2 FOREIGN KEY (OtherLaboratoriesID) REFERENCES OtherLaboratoriesTable(OtherLaboratoriesID);

ALTER TABLE LaboratoryProfileTable ADD CONSTRAINT LaboratoryProfileTable_fk3 FOREIGN KEY (BoneMarrowAspirateID) REFERENCES BoneMarrowAspirateTable(BoneMarrowAspirateID);

ALTER TABLE LaboratoryProfileTable ADD CONSTRAINT LaboratoryProfileTable_fk4 FOREIGN KEY (FlowCytometryID) REFERENCES FlowCytometryTable(FlowCytometryID);

ALTER TABLE LaboratoryProfileTable ADD CONSTRAINT LaboratoryProfileTable_fk5 FOREIGN KEY (CytogeneticMolecularID) REFERENCES CytogeneticMolecularTable(CytogeneticMolecularID);

ALTER TABLE LaboratoryProfileTable ADD CONSTRAINT LaboratoryProfileTable_fk6 FOREIGN KEY (CytogeneticMolecularAAPNHID) REFERENCES CytogeneticMolecularAAPNHTable(CytogeneticMolecularAAPNHID);

ALTER TABLE LaboratoryProfileTable ADD CONSTRAINT LaboratoryProfileTable_fk7 FOREIGN KEY (CytogeneticMolecularMDSID) REFERENCES CytogeneticMolecularMDSTable(CytogeneticMolecularMDSID);

ALTER TABLE LaboratoryProfileTable ADD CONSTRAINT LaboratoryProfileTable_fk8 FOREIGN KEY (ImagingStudiesID) REFERENCES ImagingStudiesTable(ImagingStudiesID);

ALTER TABLE LaboratoryProfileTable ADD CONSTRAINT LaboratoryProfileTable_fk9 FOREIGN KEY (UpperGIEndoscopyID) REFERENCES UpperGIEndoscopyTable(UpperGIEndoscopyID);

ALTER TABLE LaboratoryProfileTable ADD CONSTRAINT LaboratoryProfileTable_fk10 FOREIGN KEY (HematopathologyID) REFERENCES HematopathologyTable(HematopathologyID);

ALTER TABLE LaboratoryProfileTable ADD CONSTRAINT LaboratoryProfileTable_fk11 FOREIGN KEY (ImmunohistochemistryID) REFERENCES ImmunohistochemistryTable(ImmunohistochemistryID);

ALTER TABLE LaboratoryProfileTable ADD CONSTRAINT LaboratoryProfileTable_fk12 FOREIGN KEY (SerumFreeID) REFERENCES SerumFreeTable(SerumFreeID);

ALTER TABLE LaboratoryProfileTable ADD CONSTRAINT LaboratoryProfileTable_fk13 FOREIGN KEY (SerumProteinID) REFERENCES SerumProteinTable(SerumProteinID);

ALTER TABLE LaboratoryProfileTable ADD CONSTRAINT LaboratoryProfileTable_fk14 FOREIGN KEY (SerumImmunofixationID) REFERENCES SerumImmunofixationTable(SerumImmunofixationID);

ALTER TABLE TreatmentTable ADD CONSTRAINT TreatmentTable_fk0 FOREIGN KEY (ModeOfTreatmentID) REFERENCES ModeOfTreatmentTable(ModeOfTreatmentID);

ALTER TABLE TreatmentTable ADD CONSTRAINT TreatmentTable_fk1 FOREIGN KEY (ChemoMedicationID) REFERENCES ChemoMedicationsTable(ChemoMedicationID);

ALTER TABLE TreatmentTable ADD CONSTRAINT TreatmentTable_fk2 FOREIGN KEY (RegimenID) REFERENCES RegimenTable(RegimenID);

ALTER TABLE TreatmentTable ADD CONSTRAINT TreatmentTable_fk3 FOREIGN KEY (RegimenTransplantID) REFERENCES RegimenTransplantTable(RegimenTransplantID);

ALTER TABLE TreatmentTable ADD CONSTRAINT TreatmentTable_fk4 FOREIGN KEY (RegimenNonTransplantID) REFERENCES RegimenNonTransplantTable(RegimenNonTransplantID);

ALTER TABLE TreatmentTable ADD CONSTRAINT TreatmentTable_fk5 FOREIGN KEY (MaintenanceTherapyID) REFERENCES MaintenanceTherapyTable(MaintenanceTherapyID);

ALTER TABLE FollowUpTable ADD CONSTRAINT FollowUpTable_fk0 FOREIGN KEY (PatientID) REFERENCES PatientTable(PatientID);

ALTER TABLE FollowUpTable ADD CONSTRAINT FollowUpTable_fk1 FOREIGN KEY (MedicalEventsID) REFERENCES MedicalEventsTable(MedicalEventsID);

ALTER TABLE FollowUpTable ADD CONSTRAINT FollowUpTable_fk2 FOREIGN KEY (ClinicalDataID) REFERENCES ClinicalDataTable(ClinicalDataID);

ALTER TABLE FollowUpTable ADD CONSTRAINT FollowUpTable_fk3 FOREIGN KEY (LaboratoryID) REFERENCES LaboratoryProfileTable(LaboratoryID);

ALTER TABLE FollowUpTable ADD CONSTRAINT FollowUpTable_fk4 FOREIGN KEY (DiseaseStatusID) REFERENCES DiseaseStatusTable(DiseaseStatusID);

ALTER TABLE AccountTable ADD CONSTRAINT AccountTable_fk0 FOREIGN KEY (RoleID) REFERENCES RoleTable(RoleID);

INSERT INTO roletable (`RoleID`, `RoleName`) VALUES ('1', 'Admin');
INSERT INTO roletable (`RoleID`, `RoleName`) VALUES ('2', 'Encoder');

INSERT INTO AccountTable VALUES (1,'1','1611','TEST','ADMIN','A.',1,1),(2,'2','1611','TEST','ENCODER','B.',2,1);

