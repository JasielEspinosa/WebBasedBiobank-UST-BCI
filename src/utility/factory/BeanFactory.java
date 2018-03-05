package utility.factory;

import model.*;

public class BeanFactory {

	public static AccountBean getAccountBean(String username, String password, String lastName, String middleName, String firstName,
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

	public static GeneralDataBean getGeneralDataBean(String lastName, String firstName, String middleName, int gender, String dateOfBirth,
			String dateOfEntry) {
		GeneralDataBean gb = new GeneralDataBean();
		gb.setLastName(lastName);
		gb.setFirstName(firstName);
		gb.setMiddleName(middleName);
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

	public static PrognosticRiskScoringBean getPrognosticRiskScoringBean(String prognosticRiskScoringName,
			String prognosticRiskScoringOthers) {
		PrognosticRiskScoringBean prsb = new PrognosticRiskScoringBean();
		prsb.setPrognosticRiskScoringName(prognosticRiskScoringName);
		prsb.setPrognosticRiskScoringOthers(prognosticRiskScoringOthers);
		return prsb;
	}

	public static RiskScoreBean getRiskScoreBean(String riskScoreName, String riskScoreOthers) {
		RiskScoreBean rsb = new RiskScoreBean();
		rsb.setRiskScoreName(riskScoreName);
		rsb.setRiskScoreOthers(riskScoreOthers);
		return rsb;
	}

	public static PhysicalExamBean getPhysicalExamBean(double height, double weight, double ecog, double splenomegaly, double hepatomegaly,
			double lymphadenopathies, boolean hemarthroses, boolean contracturesAndMuscleAtrophy, String thrombosisHistory, String skin,
			boolean pertinentFindings, String otherFindings) {
		PhysicalExamBean pb = new PhysicalExamBean();
		pb.setHeight(height);
		pb.setWeight(weight);
		pb.setECOG(ecog);
		pb.setSplenomegaly(splenomegaly);
		pb.setHepatomegaly(hepatomegaly);
		pb.setLymphadenopathies(lymphadenopathies);
		pb.setHemarthroses(hemarthroses);
		pb.setContracturesAndMuscleAtrophy(contracturesAndMuscleAtrophy);
		pb.setThrombosisHistory(thrombosisHistory);
		pb.setSkin(skin);
		pb.setPertinentFindings(pertinentFindings);
		pb.setOtherFindings(otherFindings);
		return pb;
	}

	public static ClinicalDataBean getClinicalDataBean(String dateOfVisit, String diagnosis, String otherDiagnosis, String stageOfDisease,
			String chiefComplaint, String currentSymptoms, String constitutionalSymptoms, String otherSymptoms, String comorbidities,
			String smokingHistory, String alchoholIntakeHistory, String chemicalExposure, String previousInfection,
			String previousHematologicDisorder, String otherFindings) {
		ClinicalDataBean cb = new ClinicalDataBean();
		cb.setDateOfVisit(dateOfVisit);
		cb.setDiagnosis(diagnosis);
		cb.setOtherDiagnosis(otherDiagnosis);
		cb.setStageOfDisease(stageOfDisease);
		cb.setChiefComplaint(chiefComplaint);
		cb.setCurrentSymptoms(currentSymptoms);
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

	public static OtherDiseasesBean getOtherDiseasesBean(String otherDisease) {
		OtherDiseasesBean odb = new OtherDiseasesBean();
		odb.setOtherDisease(otherDisease);
		return odb;
	}

	public static HematologyBean getHematologyBean(double hemoglobin, double hematocrit, double whiteBloodCells, double neutrophils,
			double lymphocytes, double monocytes, double eosinophils, double basophils, double myelocytes, double metamyelocytes,
			double blasts, double plateletCount) {
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

	public static OtherLaboratoriesBean getOtherLaboratoriesBean(double creatinineOther, double uricAcid, double reticulocyteCount,
			double serumIron, double ironBindingCapacity, double serumFerritin, String directAntiglobulin, String indirectAntiglobulin,
			double SGOT, double SGPT, double LDH, String screenTestHepatitis, String screenTestEBVCytomegalovirusHIV,
			double erythropeitinLevel, double serumFolicAcid, double serumB12, double TSH) {
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

	public static CytogeneticMolecularBean getCytogeneticMolecularBean(String result) {
		CytogeneticMolecularBean cmb = new CytogeneticMolecularBean();
		cmb.setResult(result);
		return cmb;
	}

	public static CytogeneticMolecularAAPNHBean getCytogeneticMolecularAAPNHBean(String result) {
		CytogeneticMolecularAAPNHBean cb = new CytogeneticMolecularAAPNHBean();
		cb.setResult(result);
		return cb;
	}

	public static CytogeneticMolecularMDSBean getCytogeneticMolecularMDSBean(String result) {
		CytogeneticMolecularMDSBean cb = new CytogeneticMolecularMDSBean();
		cb.setResult(result);
		return cb;
	}

	public static LaboratoryProfileBean getLaboratoryProfileBean(String dateOfBloodCollection, String ITP) {
		LaboratoryProfileBean lb = new LaboratoryProfileBean();
		lb.setDateOfBloodCollection(dateOfBloodCollection);
		lb.setITP(ITP);
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

	public static RegimenBean getRegimenBean(String regimen, String otherRegimen) {
		RegimenBean rb = new RegimenBean();
		rb.setRegimenName(regimen);
		rb.setOtherRegimen(otherRegimen);
		return rb;
	}

	public static RegimenTransplantBean getRegimenTransplantBean(String regimenTransplant, String otherRegimen) {
		RegimenTransplantBean rtb = new RegimenTransplantBean();
		rtb.setRegimenName(regimenTransplant);
		rtb.setOtherRegimen(otherRegimen);
		return rtb;
	}

	public static RegimenNonTransplantBean getRegimenNonTransplantBean(String regimenNonTransplant, String otherRegimen) {
		RegimenNonTransplantBean rntb = new RegimenNonTransplantBean();
		rntb.setRegimenName(regimenNonTransplant);
		rntb.setOtherRegimen(otherRegimen);
		return rntb;
	}

	public static MaintenanceTherapyBean getMaintenanceTherapyBean(String maintenanceTherapyName, String otherMaintenanceTherapy) {
		MaintenanceTherapyBean mtb = new MaintenanceTherapyBean();
		mtb.setMaintenanceTherapyName(maintenanceTherapyName);
		mtb.setOtherMaintenanceTherapy(otherMaintenanceTherapy);
		return mtb;
	}

	public static TreatmentBean getTreatmentBean(boolean transplant, String dateStarted, int cycleNumber, String complications,
			String regimenText) {
		TreatmentBean tb = new TreatmentBean();
		tb.setTransplant(transplant);
		tb.setDateStarted(dateStarted);
		tb.setCycleNumber(cycleNumber);
		tb.setComplications(complications);
		tb.setRegimenText(regimenText);
		return tb;
	}

	public static DiseaseStatusBean getDiseaseStatusBean(String diseaseStatus, String relapseDisease, String otherDisease) {
		DiseaseStatusBean dsb = new DiseaseStatusBean();
		dsb.setDiseaseStatus(diseaseStatus);
		dsb.setRelapseDisease(relapseDisease);
		dsb.setOtherDisease(otherDisease);
		return dsb;
	}

	public static PatientBean getPatientBean(int diseaseId, int generalDataId, int clinicalDataId, int laboratoryId, int treatmentId,
			int otherTreatmentId, int active, int diseaseStatusId) {
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

	public static CoagulationTestingBean getCoagulationTestingBean(double factorVIIILevel, double factorIXLevel, double inhibitorAssay,
			double bethesdaUnits) {
		CoagulationTestingBean cb = new CoagulationTestingBean();
		cb.setFactorVIIILevel(factorVIIILevel);
		cb.setFactorIXLevel(factorIXLevel);
		cb.setInhibitorAssay(inhibitorAssay);
		cb.setBethesdaUnits(bethesdaUnits);
		return cb;
	}

	public static BloodChemistryBean getBloodChemistryBean(double bun, double creatinine, double uricAcid, double sgot, double sgpt,
			double ldh, double epoLevel, double na, double k, double bilirubinTotal, double bilirubinDirect, double bilirubinIndirect,
			double beta2Microglobulin, double hepatitisBTesting, double esr, double iCa, double totalProtein, double albumin,
			double globulin, double anaTiter, double hepatitsCRna) {
		BloodChemistryBean bb = new BloodChemistryBean();
		bb.setBUN(bun);
		bb.setCreatine(creatinine);
		bb.setUricAcid(uricAcid);
		bb.setSGOT(sgot);
		bb.setSGPT(sgpt);
		bb.setLDH(ldh);
		bb.setEPOLevel(epoLevel);
		bb.setNa(na);
		bb.setK(k);
		bb.setBilirubinTotal(bilirubinTotal);
		bb.setBilirubinDirect(bilirubinDirect);
		bb.setBilirubinIndirect(bilirubinIndirect);
		bb.setBeta2Microglobulin(beta2Microglobulin);
		bb.setHepatitsBTesting(hepatitisBTesting);
		bb.setESR(esr);
		bb.setiCa(iCa);
		bb.setTotalProtein(totalProtein);
		bb.setAlbumin(albumin);
		bb.setGlobulin(globulin);
		bb.setANATiter(anaTiter);
		bb.setHepatitsCRna(hepatitsCRna);
		return bb;
	}

	public static ImagingStudiesBean getImagingStudiesBean(byte[] result) {
		ImagingStudiesBean ib = new ImagingStudiesBean();
		ib.setResult(result);
		return ib;
	}

	public static UpperGIEndoscopyBean getUpperGIEndoscopyBean(String datePerformed, String description, boolean HPylori) {
		UpperGIEndoscopyBean ub = new UpperGIEndoscopyBean();
		ub.setDatePerformed(datePerformed);
		ub.setDescription(description);
		ub.setHOylori(HPylori);
		return ub;
	}

	public static HematopathologyBean getHematopathologyBean(String datePerformed, String result) {
		HematopathologyBean hb = new HematopathologyBean();
		hb.setDatePerformed(datePerformed);
		hb.setResult(result);
		return hb;
	}

	public static ImmunohistochemistryBean getImmunohistochemistryBean(String datePerformed, String result) {
		ImmunohistochemistryBean ib = new ImmunohistochemistryBean();
		ib.setDatePerformed(datePerformed);
		ib.setResult(result);
		return ib;
	}

	public static SerumFreeBean getSerumFreeBean(String result) {
		SerumFreeBean sb = new SerumFreeBean();
		sb.setResult(result);
		return sb;
	}

	public static SerumProteinBean getSerumProteinBean(String result) {
		SerumProteinBean sb = new SerumProteinBean();
		sb.setResult(result);
		return sb;
	}

	public static SerumImmunofixationBean getSerumImmunofixationBean(String result) {
		SerumImmunofixationBean sb = new SerumImmunofixationBean();
		sb.setResult(result);
		return sb;
	}

	public static UrineProteinBean getUrineProteinBean(String result) {
		UrineProteinBean ub = new UrineProteinBean();
		ub.setResult(result);
		return ub;
	}

	public static OtherTreatmentBean getOtherTreatmentBean(String bisphosphonates, String radiotherapy, boolean dialysis,
			String otherMedications, String complications) {
		OtherTreatmentBean ob = new OtherTreatmentBean();
		ob.setBisphosphonates(bisphosphonates);
		ob.setRadiotherapy(radiotherapy);
		ob.setDialysis(dialysis);
		ob.setOtherMedications(otherMedications);
		ob.setComplications(complications);
		return ob;
	}

	public static MedicalEventsBean getMedicalEventsBean(String hematologicMalignancy, String otherDiseaseMedication,
			String factorConcentrate, String factorConcentrateDates, double factorConcentrateDose, String procedureIntervention,
			String chemotherapy) {
		MedicalEventsBean mb = new MedicalEventsBean();
		mb.setHematologicMalignancy(hematologicMalignancy);
		mb.setOtherDiseaseMedication(otherDiseaseMedication);
		mb.setFactorConcentrate(factorConcentrate);
		mb.setFactorConcentrateDates(factorConcentrateDates);
		mb.setFactorConcentrateDose(factorConcentrateDose);
		mb.setProcedureIntervention(procedureIntervention);
		mb.setChemotherapy(chemotherapy);
		return mb;
	}

	public static FollowUpBean getFollowUpBean(int patientID, String dateOfEntry, String dateOfVisit, String notes) {
		FollowUpBean fb = new FollowUpBean();
		fb.setPatientID(patientID);
		fb.setDateOfEntry(dateOfEntry);
		fb.setDateOfVisit(dateOfVisit);
		fb.setNotes(notes);
		return fb;
	}

}
