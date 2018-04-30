$(document).ready(function() {

	$.loadUneditableFields = function() {

		// general data

		$("[name='patientIDNumberDisplay']").prop('readonly', true);
		$("[name='patientIDNumber']").prop('readonly', true);
		$("[name='lastName']").prop('readonly', true);
		$("[name='firstName']").prop('readonly', true);
		$("[name='middleInitial']").prop('readonly', true);
		$("[name='gender']").prop('readonly', true);
		$("[name='dateOfBirth']").prop('readonly', true);
		$("[name='address']").prop('readonly', true);
		$("[name='civilStatus']").prop('readonly', true);
		$("[name='dateOfEntry']").prop('readonly', true);
		$("[name='specimenType']").prop('disabled', true);
		$("[name='tissueSpecimenCollected']").prop('readonly', true);

		// medical events

		$("[name='specifyHematologicMalignancy']").prop('readonly', true);
		$("[name='hematologicMalignancy']").prop('readonly', true);
		$("[name='specifyOtherDiseaseMedication']").prop('readonly', true);
		$("[name='otherDiseaseMedication']").prop('readonly', true);
		$("[name='specifyProcedure']").prop('readonly', true);
		$("[name='procedure']").prop('readonly', true);
		$("[name='specifyChemotherapy']").prop('readonly', true);
		$("[name='chemotherapy']").prop('readonly', true);

		// clinical data

		$("[name='dateOfVisit']").prop('readonly', true);
		$("[name='dateOfInitialDiagnosis']").prop('readonly', true);
		$("[name='diagnosis']").prop('disabled', true);
		$("[name='diagnosisOthers']").prop('readonly', true);
		$("[name='prognosticRiskScoring']").prop('disabled', true);
		$("[name='prognosticRiskScoringothers']").prop('readonly', true);
		$("[name='issStaging']").prop('disabled', true);
		$("[name='stageOfDisease']").prop('readonly', true);
		$("[name='severity']").prop('disabled', true);
		$("[name='riskScore']").prop('disabled', true);
		$("[name='riskScoreOthers']").prop('readonly', true);
		$("[name='chiefComplaint']").prop('readonly', true);
		$("[name='constitutionalSymptoms']").prop('disabled', true);
		$("[name='otherSymptoms']").prop('readonly', true);
		$("[name='relationshipToPatient']").prop('readonly', true);
		$("[name='specifyCancer']").prop('readonly', true);
		$("[name='otherDiseasesInTheFamily']").prop('readonly', true);
		$("[name='familyHistoryOfCancer']").prop('readonly', true);
		$("[name='familyHistoryOfBleedingDiathesis']").prop('readonly', true);
		$("[name='comorbidities']").prop('readonly', true);
		$("[name='genericName']").prop('readonly', true);
		$("[name='dose']").prop('readonly', true);
		$("[name='frequency']").prop('readonly', true);
		$("[name='concomitantMedications']").prop('readonly', true);
		$("[name='comorbidities']").prop('readonly', true);
		$("[name='thrombosisHistorySpecify']").prop('readonly', true);
		$("[name='thrombosisHistory']").prop('readonly', true);
		$("[name='smokingHistorySpecify']").prop('readonly', true);
		$("[name='smokingHistory']").prop('readonly', true);
		$("[name='alcoholIntakeSpecify']").prop('readonly', true);
		$("[name='alcoholIntakeHistory']").prop('readonly', true);
		$("[name='chemicalExposureSpecify']").prop('readonly', true);
		$("[name='chemicalExposureHistory']").prop('readonly', true);
		$("[name='previousInfectionSpecify']").prop('readonly', true);
		$("[name='previousInfection']").prop('readonly', true);
		$("[name='previousHematologicDisorderSpecify']").prop('readonly', true);
		$("[name='previousHematologicDisorder']").prop('readonly', true);
		$("[name='height']").prop('readonly', true);
		$("[name='weight']").prop('readonly', true);
		$("[name='ecog']").prop('readonly', true);
		$("[name='presenceOfHemarthroses']").prop('readonly', true);
		$("[name='presenceOfContracturesAndMuscleAtrophy']").prop('readonly', true);
		$("[name='presenceOfSplenomegaly']").prop('readonly', true);
		$("[name='presenceOfHepatomegaly']").prop('readonly', true);
		$("[name='presenceOfLymphadenopathies']").prop('readonly', true);
		$("[name='otherFindings']").prop('readonly', true);

		// physical

		$("[name='pertinentFindings']").prop('readonly', true);
		$("[name='currentSymptoms']").prop('readonly', true);

		$("[name='dateOfBloodCollection']").prop('readonly', true);
		$("[name='hemoglobin']").prop('readonly', true);
		$("[name='hematocrit']").prop('readonly', true);
		$("[name='whiteBloodCells']").prop('readonly', true);
		$("[name='neutrophils']").prop('readonly', true);
		$("[name='lymphocytes']").prop('readonly', true);
		$("[name='monocytes']").prop('readonly', true);
		$("[name='eosinophils']").prop('readonly', true);
		$("[name='basophils']").prop('readonly', true);
		$("[name='myelocytes']").prop('readonly', true);
		$("[name='metamyelocytes']").prop('readonly', true);
		$("[name='blasts']").prop('readonly', true);
		$("[name='plateletCount']").prop('readonly', true);
		$("[name='factorVIIILevel']").prop('readonly', true);
		$("[name='factorIXLevel']").prop('readonly', true);
		$("[name='inhibitorAssay']").prop('readonly', true);
		$("[name='bethesdaUnits']").prop('readonly', true);
		$("[name='creatinine']").prop('readonly', true);
		$("[name='uricAcid']").prop('readonly', true);
		$("[name='bun']").prop('readonly', true);
		$("[name='iCa']").prop('readonly', true);
		$("[name='reticulocyteCount']").prop('readonly', true);
		$("[name='serumIron']").prop('readonly', true);
		$("[name='ironBindingCapacity']").prop('readonly', true);
		$("[name='serumFerritin']").prop('readonly', true);
		$("[name='directAntiglobulin']").prop('readonly', true);
		$("[name='indirectAntiglobulin']").prop('readonly', true);
		$("[name='sgot']").prop('readonly', true);
		$("[name='sgpt']").prop('readonly', true);
		$("[name='na']").prop('readonly', true);
		$("[name='k']").prop('readonly', true);
		$("[name='ldh']").prop('readonly', true);
		$("[name='esr']").prop('readonly', true);
		$("[name='totalProtein']").prop('readonly', true);
		$("[name='total']").prop('readonly', true);
		$("[name='direct']").prop('readonly', true);
		$("[name='indirect']").prop('readonly', true);
		$("[name='epoLevel']").prop('readonly', true);
		$("[name='albumin']").prop('readonly', true);
		$("[name='globulin']").prop('readonly', true);
		$("[name='beta2Microglobulin']").prop('readonly', true);
		$("[name='hepatitisBTesting']").prop('readonly', true);
		$("[name='screeningTestsForHepatitisVirusesABC']").prop('readonly', true);
		$("[name='screeningTestsForEBVCMVHIV']").prop('readonly', true);
		$("[name='erythropoeitinLevel']").prop('readonly', true);
		$("[name='serumFolicAcid']").prop('readonly', true);
		$("[name='serumB12']").prop('readonly', true);
		$("[name='tsh']").prop('readonly', true);
		$("[name='anaTiter']").prop('readonly', true);
		$("[name='hepatitisCRNA']").prop('readonly', true);
		$("[name='imagingStudiesResult']").prop('readonly', true);
		$("[name='imagingStudies']").prop('readonly', true);
		$("[name='boneMarrowAspirateDatePerformed']").prop('readonly', true);
		$("[name='boneMarrowAspirateDescription']").prop('readonly', true);
		$("[name='boneMarrowAspirate']").prop('readonly', true);
		$("[name='flowCytometryResult']").prop('readonly', true);
		$("[name='flowCytometry']").prop('readonly', true);
		$("[name='cytogeneticAndMolecularAnalysisAAPNHResult']").prop('readonly', true);
		$("[name='cytogeneticAndMolecularAnalysisAAPNH']").prop('readonly', true);
		$("[name='cytogeneticAndMolecularAnalysisMDSResult']").prop('readonly', true);
		$("[name='cytogeneticAndMolecularAnalysisMDS']").prop('readonly', true);
		$("[name='cytogeneticAndMolecularAnalysisResult']").prop('readonly', true);
		$("[name='cytogeneticAndMolecularAnalysis']").prop('readonly', true);
		$("[name='molecularAnalysisResult']").prop('readonly', true);
		$("[name='molecularAnalysis']").prop('readonly', true);
		$("[name='hematopathologyDatePerformed']").prop('readonly', true);
		$("[name='hematopathologyDescription']").prop('readonly', true);
		$("[name='hematopathologyReviewOfSlides']").prop('readonly', true);
		$("[name='immunohistochemistryDatePerformed']").prop('readonly', true);
		$("[name='immunohistochemistryDescription']").prop('readonly', true);
		$("[name='immunohistochemistryReviewOfSlides']").prop('readonly', true);

		$("[name='serumFreeLightChainAsssayResult']").prop('readonly', true);
		$("[name='serumFreeLightChainAsssay']").prop('readonly', true);
		$("[name='serumProteinElectrophoresisResult']").prop('readonly', true);
		$("[name='serumProteinElectrophoresis']").prop('readonly', true);
		$("[name='serumProteinElectrophoresisResult']").prop('readonly', true);
		$("[name='serumProteinElectrophoresis]").prop('readonly', true);
		$("[name='serumImmunofixationResult']").prop('readonly', true);
		$("[name='serumImmunofixation']").prop('readonly', true);
		$("[name='urineProteinResult']").prop('readonly', true);
		$("[name='urineProtein']").prop('readonly', true);

		$("[name='upperGIEndoscopyDatePerformed']").prop('readonly', true);
		$("[name='upperGIEndoscopyDescription']").prop('readonly', true);
		$("[name='upperGIEndoscopyDatePerformed']").prop('readonly', true);
		$("[name='hPylori']").prop('readonly', true);
		$("[name='formOfITP']").prop('readonly', true);

		// Treatment

		$("[name='chemotherapyMedications']").prop('readonly', true);
		$("[name='transplantCandidate']").prop('readonly', true);
		$("[name='modeOfTreatment']").prop('disabled', true);
		$("[name='treatment']").prop('disabled', true);
		$("[name='treatmentSpecify']").prop('readonly', true);
		$("[name='regimenProtocol']").prop('readonly', true);
		$("[name='otherRegimens']").prop('readonly', true);
		$("[name='regimenProtocolTransplant']").prop('disabled', true);
		$("[name='otherRegimensTransplant']").prop('readonly', true);
		$("[name='regimenProtocolNonTransplant']").prop('disabled', true);
		$("[name='otherRegimensNonTransplant']").prop('readonly', true);
		$("[name='regimenProtocolMaintenanceTherapy']").prop('disabled', true);
		$("[name='otherRegimensMaintenanceTherapy']").prop('readonly', true);
		$("[name='bisphosphonatesSpecify']").prop('readonly', true);
		$("[name='bisphosphonates']").prop('readonly', true);
		$("[name='radiotherapyDoseAndFrequency']").prop('readonly', true);
		$("[name='radiotherapy']").prop('readonly', true);
		$("[name='dialysis']").prop('readonly', true);
		$("[name='medications']").prop('readonly', true);
		$("[name='otherMedications']").prop('readonly', true);

		$("[name='cycleNumber']").prop('readonly', true);
		$("[name='dateStarted']").prop('readonly', true);
		$("[name='complications']").prop('readonly', true);
		$("[name='diseaseStatus']").prop('disabled', true);
		$("[name='diseaseStatusOthers']").prop('readonly', true);
		$("[name='relapseDisease']").prop('disabled', true);

		$("[name='specialNotes']").prop('readonly', true);

		$("[name='specifyReasonFactorConcentrate']").prop('readonly', true);
		$("[name='datesOfAdministrationFactorConcentrate']").prop('readonly', true);
		$("[name='doseOfFactorConcentrate']").prop('readonly', true);

	}

	$.loadEditableFields = function() {

		// general data

		$("[name='lastName']").prop('readonly', false);
		$("[name='firstName']").prop('readonly', false);
		$("[name='middleInitial']").prop('readonly', false);
		$("[name='gender']").prop('readonly', false);
		$("[name='dateOfBirth']").prop('readonly', false);
		$("[name='address']").prop('readonly', false);
		$("[name='civilStatus']").prop('readonly', false);
		$("[name='dateOfEntry']").prop('readonly', false);
		$("[name='specimenType']").prop('disabled', false);
		$("[name='tissueSpecimenCollected']").prop('readonly', false);

		// medical events

		$("[name='specifyHematologicMalignancy']").prop('readonly', false);
		$("[name='hematologicMalignancy']").prop('readonly', false);
		$("[name='specifyOtherDiseaseMedication']").prop('readonly', false);
		$("[name='otherDiseaseMedication']").prop('readonly', false);
		$("[name='specifyProcedure']").prop('readonly', false);
		$("[name='procedure']").prop('readonly', false);
		$("[name='specifyChemotherapy']").prop('readonly', false);
		$("[name='chemotherapy']").prop('readonly', false);

		// clinical data

		$("[name='dateOfVisit']").prop('readonly', false);
		$("[name='dateOfInitialDiagnosis']").prop('readonly', false);
		$("[name='diagnosis']").prop('disabled', false);
		$("[name='diagnosisOthers']").prop('readonly', false);
		$("[name='prognosticRiskScoring']").prop('disabled', false);
		$("[name='prognosticRiskScoringothers']").prop('readonly', false);
		$("[name='issStaging']").prop('disabled', false);
		$("[name='stageOfDisease']").prop('readonly', false);
		$("[name='severity']").prop('disabled', false);
		$("[name='riskScore']").prop('disabled', false);
		$("[name='riskScoreOthers']").prop('readonly', false);
		$("[name='chiefComplaint']").prop('readonly', false);
		$("[name='constitutionalSymptoms']").prop('disabled', false);
		$("[name='otherSymptoms']").prop('readonly', false);
		$("[name='relationshipToPatient']").prop('readonly', false);
		$("[name='specifyCancer']").prop('readonly', false);
		$("[name='otherDiseasesInTheFamily']").prop('readonly', false);
		$("[name='familyHistoryOfCancer']").prop('readonly', false);
		$("[name='familyHistoryOfBleedingDiathesis']").prop('readonly', false);
		$("[name='comorbidities']").prop('readonly', false);
		$("[name='genericName']").prop('readonly', false);
		$("[name='dose']").prop('readonly', false);
		$("[name='frequency']").prop('readonly', false);
		$("[name='concomitantMedications']").prop('readonly', false);
		$("[name='comorbidities']").prop('readonly', false);
		$("[name='thrombosisHistorySpecify']").prop('readonly', false);
		$("[name='thrombosisHistory']").prop('readonly', false);
		$("[name='smokingHistorySpecify']").prop('readonly', false);
		$("[name='smokingHistory']").prop('readonly', false);
		$("[name='alcoholIntakeSpecify']").prop('readonly', false);
		$("[name='alcoholIntakeHistory']").prop('readonly', false);
		$("[name='chemicalExposureSpecify']").prop('readonly', false);
		$("[name='chemicalExposureHistory']").prop('readonly', false);
		$("[name='previousInfectionSpecify']").prop('readonly', false);
		$("[name='previousInfection']").prop('readonly', false);
		$("[name='previousHematologicDisorderSpecify']").prop('readonly', false);
		$("[name='previousHematologicDisorder']").prop('readonly', false);
		$("[name='height']").prop('readonly', false);
		$("[name='weight']").prop('readonly', false);
		$("[name='ecog']").prop('readonly', false);
		$("[name='presenceOfHemarthroses']").prop('readonly', false);
		$("[name='presenceOfContracturesAndMuscleAtrophy']").prop('readonly', false);
		$("[name='presenceOfSplenomegaly']").prop('readonly', false);
		$("[name='presenceOfHepatomegaly']").prop('readonly', false);
		$("[name='presenceOfLymphadenopathies']").prop('readonly', false);
		$("[name='otherFindings']").prop('readonly', false);

		// physical

		$("[name='pertinentFindings']").prop('readonly', false);
		$("[name='currentSymptoms']").prop('readonly', false);

		$("[name='dateOfBloodCollection']").prop('readonly', false);
		$("[name='hemoglobin']").prop('readonly', false);
		$("[name='hematocrit']").prop('readonly', false);
		$("[name='whiteBloodCells']").prop('readonly', false);
		$("[name='neutrophils']").prop('readonly', false);
		$("[name='lymphocytes']").prop('readonly', false);
		$("[name='monocytes']").prop('readonly', false);
		$("[name='eosinophils']").prop('readonly', false);
		$("[name='basophils']").prop('readonly', false);
		$("[name='myelocytes']").prop('readonly', false);
		$("[name='metamyelocytes']").prop('readonly', false);
		$("[name='blasts']").prop('readonly', false);
		$("[name='plateletCount']").prop('readonly', false);
		$("[name='factorVIIILevel']").prop('readonly', false);
		$("[name='factorIXLevel']").prop('readonly', false);
		$("[name='inhibitorAssay']").prop('readonly', false);
		$("[name='bethesdaUnits']").prop('readonly', false);
		$("[name='creatinine']").prop('readonly', false);
		$("[name='uricAcid']").prop('readonly', false);
		$("[name='bun']").prop('readonly', false);
		$("[name='iCa']").prop('readonly', false);
		$("[name='reticulocyteCount']").prop('readonly', false);
		$("[name='serumIron']").prop('readonly', false);
		$("[name='ironBindingCapacity']").prop('readonly', false);
		$("[name='serumFerritin']").prop('readonly', false);
		$("[name='directAntiglobulin']").prop('readonly', false);
		$("[name='indirectAntiglobulin']").prop('readonly', false);
		$("[name='sgot']").prop('readonly', false);
		$("[name='sgpt']").prop('readonly', false);
		$("[name='na']").prop('readonly', false);
		$("[name='k']").prop('readonly', false);
		$("[name='ldh']").prop('readonly', false);
		$("[name='esr']").prop('readonly', false);
		$("[name='totalProtein']").prop('readonly', false);
		$("[name='total']").prop('readonly', false);
		$("[name='direct']").prop('readonly', false);
		$("[name='indirect']").prop('readonly', false);
		$("[name='epoLevel']").prop('readonly', false);
		$("[name='albumin']").prop('readonly', false);
		$("[name='globulin']").prop('readonly', false);
		$("[name='beta2Microglobulin']").prop('readonly', false);
		$("[name='hepatitisBTesting']").prop('readonly', false);
		$("[name='screeningTestsForHepatitisVirusesABC']").prop('readonly', false);
		$("[name='screeningTestsForEBVCMVHIV']").prop('readonly', false);
		$("[name='erythropoeitinLevel']").prop('readonly', false);
		$("[name='serumFolicAcid']").prop('readonly', false);
		$("[name='serumB12']").prop('readonly', false);
		$("[name='tsh']").prop('readonly', false);
		$("[name='anaTiter']").prop('readonly', false);
		$("[name='hepatitisCRNA']").prop('readonly', false);
		$("[name='imagingStudiesResult']").prop('readonly', false);
		$("[name='imagingStudies']").prop('readonly', false);
		$("[name='boneMarrowAspirateDatePerformed']").prop('readonly', false);
		$("[name='boneMarrowAspirateDescription']").prop('readonly', false);
		$("[name='boneMarrowAspirate']").prop('readonly', false);
		$("[name='flowCytometryResult']").prop('readonly', false);
		$("[name='flowCytometry']").prop('readonly', false);
		$("[name='cytogeneticAndMolecularAnalysisAAPNHResult']").prop('readonly', false);
		$("[name='cytogeneticAndMolecularAnalysisAAPNH']").prop('readonly', false);
		$("[name='cytogeneticAndMolecularAnalysisMDSResult']").prop('readonly', false);
		$("[name='cytogeneticAndMolecularAnalysisMDS']").prop('readonly', false);
		$("[name='cytogeneticAndMolecularAnalysisResult']").prop('readonly', false);
		$("[name='cytogeneticAndMolecularAnalysis']").prop('readonly', false);
		$("[name='molecularAnalysisResult']").prop('readonly', false);
		$("[name='molecularAnalysis']").prop('readonly', false);
		$("[name='hematopathologyDatePerformed']").prop('readonly', false);
		$("[name='hematopathologyDescription']").prop('readonly', false);
		$("[name='hematopathologyReviewOfSlides']").prop('readonly', false);
		$("[name='immunohistochemistryDatePerformed']").prop('readonly', false);
		$("[name='immunohistochemistryDescription']").prop('readonly', false);
		$("[name='immunohistochemistryReviewOfSlides']").prop('readonly', false);

		$("[name='serumFreeLightChainAsssayResult']").prop('readonly', false);
		$("[name='serumFreeLightChainAsssay']").prop('readonly', false);
		$("[name='serumProteinElectrophoresisResult']").prop('readonly', false);
		$("[name='serumProteinElectrophoresis']").prop('readonly', false);
		$("[name='serumProteinElectrophoresisResult']").prop('readonly', false);
		$("[name='serumProteinElectrophoresis]").prop('readonly', false);
		$("[name='serumImmunofixationResult']").prop('readonly', false);
		$("[name='serumImmunofixation']").prop('readonly', false);
		$("[name='urineProteinResult']").prop('readonly', false);
		$("[name='urineProtein']").prop('readonly', false);

		$("[name='upperGIEndoscopyDatePerformed']").prop('readonly', false);
		$("[name='upperGIEndoscopyDescription']").prop('readonly', false);
		$("[name='upperGIEndoscopyDatePerformed']").prop('readonly', false);
		$("[name='hPylori']").prop('readonly', false);
		$("[name='formOfITP']").prop('readonly', false);

		// Treatment

		$("[name='chemotherapyMedications']").prop('readonly', false);
		$("[name='transplantCandidate']").prop('readonly', false);
		$("[name='modeOfTreatment']").prop('disabled', false);
		$("[name='treatment']").prop('disabled', false);
		$("[name='treatmentSpecify']").prop('readonly', false);
		$("[name='regimenProtocol']").prop('readonly', false);
		$("[name='otherRegimens']").prop('readonly', false);
		$("[name='regimenProtocolTransplant']").prop('disabled', false);
		$("[name='otherRegimensTransplant']").prop('readonly', false);
		$("[name='regimenProtocolNonTransplant']").prop('disabled', false);
		$("[name='otherRegimensNonTransplant']").prop('readonly', false);
		$("[name='regimenProtocolMaintenanceTherapy']").prop('disabled', false);
		$("[name='otherRegimensMaintenanceTherapy']").prop('readonly', false);
		$("[name='bisphosphonatesSpecify']").prop('readonly', false);
		$("[name='bisphosphonates']").prop('readonly', false);
		$("[name='radiotherapyDoseAndFrequency']").prop('readonly', false);
		$("[name='radiotherapy']").prop('readonly', false);
		$("[name='dialysis']").prop('readonly', false);
		$("[name='medications']").prop('readonly', false);
		$("[name='otherMedications']").prop('readonly', false);

		$("[name='cycleNumber']").prop('readonly', false);
		$("[name='dateStarted']").prop('readonly', false);
		$("[name='complications']").prop('readonly', false);
		$("[name='diseaseStatus']").prop('disabled', false);
		$("[name='diseaseStatusOthers']").prop('readonly', false);
		$("[name='relapseDisease']").prop('disabled', false);

		$("[name='specialNotes']").prop('readonly', false);

		$("[name='specifyReasonFactorConcentrate']").prop('readonly', false);
		$("[name='datesOfAdministrationFactorConcentrate']").prop('readonly', false);
		$("[name='doseOfFactorConcentrate']").prop('readonly', false);

	}

});
