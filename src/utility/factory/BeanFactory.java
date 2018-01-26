package utility.factory;

import model.*;

public class BeanFactory {

	public static AddressBean getAddressBean(String streetAddress, String city, String zipCode) {
		AddressBean ab = new AddressBean();
		ab.setStreetAddress(streetAddress);
		ab.setCity(city);
		ab.setZipCode(zipCode);
		return ab;
	}

	public static TissueSpecimenBean getTissueSpecimenBean(String tissueSpecimenName) {
		TissueSpecimenBean tsb = new TissueSpecimenBean();
		tsb.setTissueSpecimenName(tissueSpecimenName);
		return tsb;
	}

	public static GeneralDataBean getGeneralDataBean(
			String lastName,
			String middleName,
			String firstName,
			int gender,
			String dateOfBirth,
			String dateOfEntry) {
		GeneralDataBean gb = new GeneralDataBean();
		gb.setLastName(lastName);
		gb.setMiddleName(middleName);
		gb.setFirstName(firstName);
		gb.setGender(gender);
		gb.setDateOfBirth(dateOfBirth);
		gb.setDateOfEntry(dateOfEntry);
		return gb;
	}

	public static ClassificationBean getClassificationBean(String classificationName) {
		ClassificationBean classbean = new ClassificationBean();
		classbean.setClassificationName(classificationName);
		return classbean;
	}

	public static RiskScoreBean getRiskScoreBean(String riskScoreName) {
		RiskScoreBean rsb = new RiskScoreBean();
		rsb.setRiskScoreName(riskScoreName);
		return rsb;
	}

	public static ISSStagingBean getISSStagingBean(String issStagingName) {
		ISSStagingBean isb = new ISSStagingBean();
		isb.setIssStagingName(issStagingName);
		return isb;
	}

	public static SeverityBean getSeverityBean(String severityName) {
		SeverityBean sb = new SeverityBean();
		sb.setSeverityName(severityName);
		return sb;
	}

	public static PrognosticRiskScoringBean getPrognosticRiskScoringBean(String prognosticRiskScoringName) {
		PrognosticRiskScoringBean prsb = new PrognosticRiskScoringBean();
		prsb.setPrognosticRiskScoringName(prognosticRiskScoringName);
		return prsb;
	}

	public static PhysicalExamBean getPhysicalExamBean(
			double height,
			double weight,
			double ECOG,
			double splenomegaly,
			double hepatomegaly,
			double lymphadenopathies,
			boolean hemathroses,
			boolean contracturesAndMuscleAtrophy,
			String thrombosisHistory,
			String skin,
			String otherFindings) {
		PhysicalExamBean pb = new PhysicalExamBean();
		pb.setHeight(height);
		pb.setWeight(weight);
		pb.setECOG(ECOG);
		pb.setSplenomegaly(splenomegaly);
		pb.setHepatomegaly(hepatomegaly);
		pb.setLymphadenopathies(lymphadenopathies);
		pb.setHemathroses(hemathroses);
		pb.setContracturesAndMuscleAtrophy(contracturesAndMuscleAtrophy);
		pb.setThrombosisHistory(thrombosisHistory);
		pb.setSkin(skin);
		pb.setOtherFindings(otherFindings);
		return pb;
	}

	public static ClinicalDataBean getClinicalDataBean(
			String dateOfVisit,
			String diagnosis,
			String otherDiagnosis,
			String stageOfDisease,
			String chiefComplaint,
			String constitutionalSymptoms,
			String otherSymptoms,
			String comorbidities,
			String smokingHistory,
			String alchoholIntakeHistory,
			String chemicalExposure,
			String previousInfection,
			String previousHematologicDisorder,
			String otherFindings) {
		ClinicalDataBean cb = new ClinicalDataBean();
		cb.setDateOfVisit(dateOfVisit);
		cb.setDiagnosis(diagnosis);
		cb.setOtherDiagnosis(otherDiagnosis);
		cb.setStageOfDisease(stageOfDisease);
		cb.setChiefComplaint(chiefComplaint);
		cb.setConstitutionalSymptoms(constitutionalSymptoms);
		cb.setOtherSymptoms(otherSymptoms);
		cb.setComorbidities(comorbidities);
		cb.setSmokingHistory(smokingHistory);
		cb.setAlchoholIntakeHistory(alchoholIntakeHistory);
		cb.setChemicalExposure(chemicalExposure);
		cb.setPreviousInfection(previousInfection);
		cb.setPreviousHematologicDisorder(previousHematologicDisorder);
		cb.setOtherFindings(otherFindings);
		return cb;
	}

	public static MedicationsBean getMedicationsBean(String genericName, double dose, String frequency) {
		MedicationsBean mb = new MedicationsBean();
		mb.setGenericName(genericName);
		mb.setDose(dose);
		mb.setFrequency(frequency);
		return mb;
	}

	public static FamilyCancerBean getFamilyCancerBean(String relationshipToPatient, String cancerName) {
		FamilyCancerBean fcb = new FamilyCancerBean();
		fcb.setRelationshipToPatient(relationshipToPatient);
		fcb.setCancerName(cancerName);
		return fcb;
	}

	public static HematologyBean getHematologyBean(
			double hemoglobin,
			double hematocrit,
			double whiteBloodCells,
			double neutrophils,
			double lymphocytes,
			double monocytes,
			double eosinophils,
			double basophils,
			double myelocytes,
			double metamyelocytes,
			double blasts,
			double plateletCount) {
		HematologyBean hb = new HematologyBean();
		hb.setHemoglobin(hemoglobin);
		hb.setHematocrit(hematocrit);
		hb.setWhiteBloodCells(whiteBloodCells);
		hb.setNeutrophils(neutrophils);
		hb.setLymphocytes(lymphocytes);
		hb.setMonocytes(monocytes);
		hb.setEosinophils(eosinophils);
		hb.setBasophils(basophils);
		hb.setMyelocytes(metamyelocytes);
		hb.setMetamyelocytes(metamyelocytes);
		hb.setBlasts(blasts);
		hb.setPlateletCount(plateletCount);
		return hb;
	}

	public static OtherLaboratoriesBean getOtherLaboratoriesBean(
			double creatinineOther,
			double uricAcid,
			double reticulocyteCount,
			double serumIron,
			double ironBindingCapacity,
			double serumFerritin,
			String directAntiglobulin,
			String indirectAntiglobulin,
			double SGOT,
			double SGPT,
			double LDH,
			String screenTestHepatitis,
			String screenTestEBVCytomegalovirusHIV,
			double erythropeitinLevel,
			double serumFolicAcid,
			double serumB12,
			double TSH) {
		OtherLaboratoriesBean ob = new OtherLaboratoriesBean();
		ob.setCreatinineOther(creatinineOther);
		ob.setUricAcid(uricAcid);
		ob.setReticulocyteCount(reticulocyteCount);
		ob.setSerumIron(serumIron);
		ob.setIronBindingCapacity(ironBindingCapacity);
		ob.setSerumFerritin(serumFerritin);
		ob.setDirectAntiglobulin(directAntiglobulin);
		ob.setIndirectAntiglobulin(indirectAntiglobulin);
		ob.setSGOT(SGOT);
		ob.setSGPT(SGPT);
		ob.setLDH(LDH);
		ob.setScreenTestHepatitis(screenTestHepatitis);
		ob.setScreenTestEBVCytomegalovirusHIV(screenTestEBVCytomegalovirusHIV);
		ob.setErythropeitinLevel(erythropeitinLevel);
		ob.setSerumFolicAcid(serumFolicAcid);
		ob.setSerumB12(serumB12);
		ob.setTSH(TSH);
		return ob;
	}

	public static BoneMarrowAspirateBean getBoneMarrowAspirateBean(String datePerformed, String result) {
		BoneMarrowAspirateBean bb = new BoneMarrowAspirateBean();
		bb.setDatePerformed(datePerformed);
		bb.setResult(result);
		return bb;
	}

	public static FlowCytometryBean getFlowCytometryBean(String result) {
		FlowCytometryBean fb = new FlowCytometryBean();
		fb.setResult(result);
		return fb;
	}

	public static CytogeneticAAPNHBean getCytogeneticAAPNHBean(String result) {
		CytogeneticAAPNHBean cb = new CytogeneticAAPNHBean();
		cb.setResult(result);
		return cb;
	}

	public static CytogeneticMDSBean getCytogeneticMDSBean(String result) {
		CytogeneticMDSBean cb = new CytogeneticMDSBean();
		cb.setResult(result);
		return cb;
	}

	public static LaboratoryProfileBean getLaboratoryProfileBean(String dateOfBloodCollection) {
		LaboratoryProfileBean lb = new LaboratoryProfileBean();
		lb.setDateOfBloodCollection(dateOfBloodCollection);
		return lb;
	}

	public static ModeOfTreatmentBean getModeOfTreatmentBean(String modeOfTreatment, String nameOfTreatment) {
		ModeOfTreatmentBean motb = new ModeOfTreatmentBean();
		motb.setModeOfTreatment(modeOfTreatment);
		motb.setNameOfTreatment(nameOfTreatment);
		return motb;
	}

	public static ChemotherapyMedicationsBean getChemotherapyMedicationsBean(String medications) {
		ChemotherapyMedicationsBean cmb = new ChemotherapyMedicationsBean();
		cmb.setMedications(medications);
		return cmb;
	}

	public static RegimenBean getRegimenBean(String regimen) {
		RegimenBean rb = new RegimenBean();
		rb.setRegimenName(regimen);
		return rb;
	}

	public static MaintenanceTherapyBean getMaintenanceTherapyBean(String maintenanceTherapyName) {
		MaintenanceTherapyBean mtb = new MaintenanceTherapyBean();
		mtb.setMaintenanceTherapyName(maintenanceTherapyName);
		return mtb;
	}

	public static TreatmentBean getTreatmentBean(
			boolean transplant,
			String dateStarted,
			String otherRegimen,
			int cycleNumber,
			String complications,
			String regimenText) {
		TreatmentBean tb = new TreatmentBean();
		tb.setTransplant(transplant);
		tb.setDateStarted(dateStarted);
		tb.setOtherRegimen(otherRegimen);
		tb.setCycleNumber(cycleNumber);
		tb.setComplications(complications);
		tb.setRegimenText(regimenText);
		return tb;
	}

	public static DiseaseStatusBean getDiseaseStatusBean(String diseaseStatus) {
		DiseaseStatusBean dsb = new DiseaseStatusBean();
		dsb.setDiseaseStatus(diseaseStatus);
		return dsb;
	}

	public static PatientBean getPatientBean(
			int diseaseId,
			int generalDataId,
			int clinicalDataId,
			int laboratoryId,
			int treatmentId,
			int otherTreatmentId,
			int active,
			int diseaseStatusId) {
		PatientBean pb = new PatientBean();
		pb.setDiseaseId(diseaseId);
		pb.setGeneralDataId(generalDataId);
		pb.setClinicalDataId(clinicalDataId);
		pb.setLaboratoryId(laboratoryId);
		pb.setTreatmentId(treatmentId);
		pb.setOtherTreatmentId(otherTreatmentId);
		pb.setActive(active);
		pb.setDiseaseStatusId(diseaseStatusId);
		return pb;
	}

	public static CoagulationTestingBean getCoagulationTestingBean(
			double factorVIIILevel,
			double factorIXLevel,
			double inhibitorAssay,
			double bethesdaUnits) {
		CoagulationTestingBean cb = new CoagulationTestingBean();
		cb.setFactorVIIILevel(factorVIIILevel);
		cb.setFactorIXLevel(factorIXLevel);
		cb.setInhibitorAssay(inhibitorAssay);
		cb.setBethesdaUnits(bethesdaUnits);
		return cb;
	}

	public static BloodChemistryBean getBloodChemistryBean(
			double BUN,
			double creatine,
			double uricAcid,
			double SGOT,
			double SGPT,
			double LDH,
			double EPOLevel,
			double Na,
			double K,
			double bilirubinTotal,
			double bilirubinDirect,
			double bilirubinIndirect,
			double beta2Microglobulin,
			double hepatitsBTesting,
			double ESR,
			double iCa,
			double totalProtein,
			double albumin,
			double globulin,
			double ANATiter,
			double hepatitsCRna) {
		BloodChemistryBean bb = new BloodChemistryBean();
		bb.setBUN(BUN);
		bb.setCreatine(creatine);
		bb.setUricAcid(uricAcid);
		bb.setSGOT(SGOT);
		bb.setSGPT(SGPT);
		bb.setLDH(LDH);
		bb.setEPOLevel(EPOLevel);
		bb.setNa(Na);
		bb.setK(K);
		bb.setBilirubinTotal(bilirubinTotal);
		bb.setBilirubinDirect(bilirubinDirect);
		bb.setBilirubinIndirect(bilirubinIndirect);
		bb.setBeta2Microglobulin(beta2Microglobulin);
		bb.setHepatitsBTesting(hepatitsBTesting);
		bb.setESR(ESR);
		bb.setiCa(iCa);
		bb.setTotalProtein(totalProtein);
		bb.setAlbumin(albumin);
		bb.setGlobulin(globulin);
		bb.setANATiter(ANATiter);
		bb.setHepatitsCRna(hepatitsCRna);
		return bb;
	}

	public static ImagingStudiesBean getImagingStudiesBean(byte[] result) {
		ImagingStudiesBean ib = new ImagingStudiesBean();
		ib.setResult(result);
		return ib;
	}

	public static UpperGIEndoscopyBean getUpperGIEndoscopyBean(
			String datePerformed,
			String description,
			boolean HOylori) {
		UpperGIEndoscopyBean ub = new UpperGIEndoscopyBean();
		ub.setDatePerformed(datePerformed);
		ub.setDescription(description);
		ub.setHOylori(HOylori);
		return ub;
	}

	public static MolecularAnalysisBean getMolecularAnalysisBean(String results) {
		MolecularAnalysisBean mb = new MolecularAnalysisBean();
		mb.setResults(results);
		return mb;
	}

	public static HematopathologyBean getHematopathologyBean(String datePerformed, String results) {
		HematopathologyBean hb = new HematopathologyBean();
		hb.setDatePerformed(datePerformed);
		hb.setResults(results);
		return hb;
	}

	public static ImmunohistochemistryBean getImmunohistochemistryBean(String datePerformed, String results) {
		ImmunohistochemistryBean ib = new ImmunohistochemistryBean();
		ib.setDatePerformed(datePerformed);
		ib.setResults(results);
		return ib;
	}

	public static SerumFreeBean getSerumFreeBean(String results) {
		SerumFreeBean sb = new SerumFreeBean();
		sb.setResults(results);
		return sb;
	}

	public static SerumProteinBean getSerumProteinBean(String results) {
		SerumProteinBean sb = new SerumProteinBean();
		sb.setResults(results);
		return sb;
	}

	public static SerumImmunofixationBean getSerumImmunofixationBean(String results) {
		SerumImmunofixationBean sb = new SerumImmunofixationBean();
		sb.setResults(results);
		return sb;
	}

	public static UrineProteinBean getUrineProteinBean(String results) {
		UrineProteinBean ub = new UrineProteinBean();
		ub.setResults(results);
		return ub;
	}

	public static OtherTreatmentBean getOtherTreatmentBean(
			String bisphosphonates,
			String radiotherapy,
			boolean dialysis,
			String otherMedications,
			String complications) {
		OtherTreatmentBean ob = new OtherTreatmentBean();
		ob.setBisphosphonates(bisphosphonates);
		ob.setRadiotherapy(radiotherapy);
		ob.setDialysis(dialysis);
		ob.setOtherMedications(otherMedications);
		ob.setComplications(complications);
		return ob;
	}

	public static MedicalEventsBean getMedicalEventsBean(
			String newMedicationForHematologicMalignancy,
			String newConcomitantMedicationForOtherDisease,
			String undergoAnyProcedure,
			String complicationForChemotherapy,
			String selfAdministerFactorConcentrates) {
		MedicalEventsBean mb = new MedicalEventsBean();
		mb.setNewMedicationForHematologicMalignancy(newMedicationForHematologicMalignancy);
		mb.setNewConcomitantMedicationForOtherDisease(newConcomitantMedicationForOtherDisease);
		mb.setUndergoAnyProcedure(undergoAnyProcedure);
		mb.setComplicationForChemotherapy(complicationForChemotherapy);
		mb.setSelfAdministerFactorConcentrates(selfAdministerFactorConcentrates);
		return mb;
	}

	public static QualityOfResponseBean getQualityOfResponseBean(String responseName) {
		QualityOfResponseBean qorb = new QualityOfResponseBean();
		qorb.setResponseName(responseName);
		return qorb;
	}

	public static FollowUpBean getFollowUpBean(
			int patientId,
			String dateOfVisit,
			int medicalEventsId,
			int clinicalDataId,
			int laboratoryId,
			int qualityofResponseId,
			int diseaseStatusId,
			String specialNotes) {
		FollowUpBean fb = new FollowUpBean();
		fb.setPatientId(patientId);
		fb.setDateOfVisit(dateOfVisit);
		fb.setMedicalEventsId(medicalEventsId);
		fb.setClinicalDataId(clinicalDataId);
		fb.setLaboratoryId(laboratoryId);
		fb.setQualityofResponseId(qualityofResponseId);
		fb.setDiseaseStatusId(diseaseStatusId);
		fb.setSpecialNotes(specialNotes);
		return fb;
	}

	public static AccountBean getAccountBean(
			String username,
			String password,
			String lastName,
			String middleName,
			String firstName,
			int roleId) {
		AccountBean ab = new AccountBean();
		ab.setUsername(username);
		ab.setPassword(password);
		ab.setLastName(lastName);
		ab.setMiddleName(middleName);
		ab.setFirstName(firstName);
		ab.setRoleId(roleId);
		return ab;
	}

}
