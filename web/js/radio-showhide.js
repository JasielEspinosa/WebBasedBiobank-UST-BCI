$(function() {

	// GENERAL DATA

	$("input[name='tissueSpecimenCollected']").click(function() {
		if ($(this).val() === "1") {
			// $("#smokingHistorySpecify").show();
			// $("#smokingHistorySpecify").show("fast");
			$("#specimenType").slideDown(200);
			$("input[name='specimenType']").prop('required', true);
		} else if ($(this).val() === "0") {
			// $("#smokingHistorySpecify").hide("fast");
			$("#specimenType").slideUp(200);
			$("input[name='specimenType']").prop('required', false);
		}
	});

	// MEDICAL EVENTS

	$("input[name='hematologicMalignancy']").click(function() {
		if ($(this).val() === "1") {
			$("#specifyHematologicMalignancy").slideDown(200);
			$("input[name='specifyHematologicMalignancy']").prop('required', true);
		} else if ($(this).val() === "0") {
			$("#specifyHematologicMalignancy").slideUp(200);
			$("input[name='specifyHematologicMalignancy']").prop('required', false);
		}
	});

	$("input[name='otherDiseaseMedication']").click(function() {
		if ($(this).val() === "1") {
			$("#specifyOtherDiseaseMedication").slideDown(200);
			$("input[name='specifyOtherDiseaseMedication']").prop('required', true);
		} else if ($(this).val() === "0") {
			$("#specifyOtherDiseaseMedication").slideUp(200);
			$("input[name='specifyOtherDiseaseMedication']").prop('required', false);
		}
	});

	$("input[name='factorConcentrate']").click(function() {
		if ($(this).val() === "1") {
			$("#specifyReasonFactorConcentrate").slideDown(200);
			$("input[name='specifyReasonFactorConcentrate']").prop('required', true);

			$("#datesOfAdministrationFactorConcentrate").slideDown(200);
			$("input[name='datesOfAdministrationFactorConcentrate']").prop('required', true);

			$("#doseOfFactorConcentrate").slideDown(200);
			$("input[name='doseOfFactorConcentrate']").prop('required', true);

		} else if ($(this).val() === "0") {
			$("#specifyReasonFactorConcentrate").slideUp(200);
			$("input[name='specifyReasonFactorConcentrate']").prop('required', false);

			$("#datesOfAdministrationFactorConcentrate").slideUp(200);
			$("input[name='datesOfAdministrationFactorConcentrate']").prop('required', false);

			$("#doseOfFactorConcentrate").slideUp(200);
			$("input[name='doseOfFactorConcentrate']").prop('required', false);

		}
	});

	$("input[name='procedure']").click(function() {
		if ($(this).val() === "1") {
			$("#specifyProcedure").slideDown(200);
			$("input[name='specifyProcedure']").prop('required', true);
		} else if ($(this).val() === "0") {
			$("#specifyProcedure").slideUp(200);
			$("input[name='specifyProcedure']").prop('required', false);
		}
	});

	$("input[name='chemotherapy']").click(function() {
		if ($(this).val() === "1") {
			$("#specifyChemotherapy").slideDown(200);
			$("input[name='specifyChemotherapy']").prop('required', true);
		} else if ($(this).val() === "0") {
			$("#specifyChemotherapy").slideUp(200);
			$("input[name='specifyChemotherapy']").prop('required', false);
		}
	});

	// CLINICAL

	// DROPDOWN
	$("select[name='diagnosis']").click(function() {
		if ($(this).val() === "Others") {
			$("#diagnosisOthers").slideDown(200);
			$("input[name='diagnosisOthers']").prop('required', true);
		} else {
			$("#diagnosisOthers").slideUp(200);
			$("input[name='diagnosisOthers']").prop('required', false);
		}
	});

	$("select[name='treatment']").click(function() {
		if ($(this).val() === "Others") {
			$("#treatmentSpecify").slideDown(200);
			$("input[name='treatmentSpecify']").prop('required', true);
		} else {
			$("#treatmentSpecify").slideUp(200);
			$("input[name='treatmentSpecify']").prop('required', false);
		}
	});

	$("select[name='treatment']").click(function() {
		if ($(this).val() === "Others") {
			$("#otherRegimens").slideDown(200);
			$("input[name='otherRegimens']").prop('required', true);
		} else {
			$("#otherRegimens").slideUp(200);
			$("input[name='otherRegimens']").prop('required', false);
		}
	});

	$("select[name='regimenProtocolTransplant']").click(function() {
		if ($(this).val() === "Others") {
			$("#otherRegimensTransplant").slideDown(200);
			$("input[name='otherRegimensTransplant']").prop('required', true);
		} else {
			$("#otherRegimensTransplant").slideUp(200);
			$("input[name='otherRegimensTransplant']").prop('required', false);
		}
	});

	$("select[name='regimenProtocolNonTransplant']").click(function() {
		if ($(this).val() === "Others") {
			$("#otherRegimensNonTransplant").slideDown(200);
			$("input[name='otherRegimensNonTransplant']").prop('required', true);
		} else {
			$("#otherRegimensNonTransplant").slideUp(200);
			$("input[name='otherRegimensNonTransplant']").prop('required', false);
		}
	});

	$("select[name='regimenProtocolMaintenanceTherapy']").click(function() {
		if ($(this).val() === "Others") {
			$("#otherRegimensMaintenanceTherapy").slideDown(200);
			$("input[name='otherRegimensMaintenanceTherapy']").prop('required', true);
		} else {
			$("#otherRegimensMaintenanceTherapy").slideUp(200);
			$("input[name='otherRegimensMaintenanceTherapy']").prop('required', false);
		}
	});

	$("select[name='prognosticRiskScoring']").click(function() {
		if ($(this).val() === "Others") {
			$("#prognosticRiskScoringothers").slideDown(200);
			$("input[name='prognosticRiskScoringothers']").prop('required', true);
		} else {
			$("#prognosticRiskScoringothers").slideUp(200);
			$("input[name='prognosticRiskScoringothers']").prop('required', false);
		}
	});

	$("select[name='riskScore']").click(function() {
		if ($(this).val() === "Others") {
			$("#riskScoreOthers").slideDown(200);
			$("input[name='riskScoreOthers']").prop('required', true);
		} else {
			$("#riskScoreOthers").slideUp(200);
			$("input[name='riskScoreOthers']").prop('required', false);
		}
	});

	// END OF DROPDOWN

	$("input[name='familyHistoryOfCancer']").click(function() {
		if ($(this).val() === "1") {
			$("#relationshipToPatient").slideDown(200);
			$("input[name='relationshipToPatient']").prop('required', true);
			$("#specifyCancer").slideDown(200);
			$("input[name='specifyCancer']").prop('required', true);
			$("#otherDiseasesInTheFamily").slideDown(200);
			$("input[name='otherDiseasesInTheFamily']").prop('required', true);
		} else if ($(this).val() === "0") {
			$("#relationshipToPatient").slideUp(200);
			$("input[name='relationshipToPatient']").prop('required', false);
			$("#specifyCancer").slideUp(200);
			$("input[name='specifyCancer']").prop('required', false);
			$("#otherDiseasesInTheFamily").slideUp(200);
			$("input[name='otherDiseasesInTheFamily']").prop('required', false);
		}
	});

	$("input[name='familyHistoryOfBleedingDiathesis']").click(function() {
		if ($(this).val() === "1") {
			$("#relationshipToPatient").slideDown(200);
			$("input[name='relationshipToPatient']").prop('required', true);
			$("#specifyCancer").slideDown(200);
			$("input[name='specifyCancer']").prop('required', true);
			$("#otherDiseasesInTheFamily").slideDown(200);
			$("input[name='otherDiseasesInTheFamily']").prop('required', true);
		} else if ($(this).val() === "0") {
			$("#relationshipToPatient").slideUp(200);
			$("input[name='relationshipToPatient']").prop('required', false);
			$("#specifyCancer").slideUp(200);
			$("input[name='specifyCancer']").prop('required', false);
			$("#otherDiseasesInTheFamily").slideUp(200);
			$("input[name='otherDiseasesInTheFamily']").prop('required', false);
		}
	});

	$("input[name='concomitantMedications']").click(function() {
		if ($(this).val() === "1") {
			$("#concomitantMedications").slideDown(200);
			$("#genericName").slideDown(200);
			$("input[name='genericName']").prop('required', true);
			$("#dose").slideDown(200);
			$("input[name='dose']").prop('required', true);
			$("#frequency").slideDown(200);
			$("input[name='frequency']").prop('required', true);
		} else if ($(this).val() === "0") {
			$("#concomitantMedications").slideUp(200);
			$("#genericName").slideUp(200);
			$("input[name='genericName']").prop('required', false);
			$("#dose").slideUp(200);
			$("input[name='dose']").prop('required', false);
			$("#frequency").slideUp(200);
			$("input[name='frequency']").prop('required', false);
		}
	});

	$("input[name='thrombosisHistory']").click(function() {
		if ($(this).val() === "1") {
			// $("#smokingHistorySpecify").show();
			// $("#smokingHistorySpecify").show("fast");
			$("#thrombosisHistorySpecify").slideDown(200);
			$("input[name='thrombosisHistorySpecify']").prop('required', true);
		} else if ($(this).val() === "0") {
			// $("#smokingHistorySpecify").hide("fast");
			$("#thrombosisHistorySpecify").slideUp(200);
			$("input[name='thrombosisHistorySpecify']").prop('required', false);
		}
	});

	$("input[name='smokingHistory']").click(function() {
		if ($(this).val() === "1") {
			// $("#smokingHistorySpecify").show();
			// $("#smokingHistorySpecify").show("fast");
			$("#smokingHistorySpecify").slideDown(200);
			$("input[name='smokingHistorySpecify']").prop('required', true);
		} else if ($(this).val() === "0") {
			// $("#smokingHistorySpecify").hide("fast");
			$("#smokingHistorySpecify").slideUp(200);
			$("input[name='smokingHistorySpecify']").prop('required', false);
		}
	});

	$("input[name='alcoholIntakeHistory']").click(function() {
		if ($(this).val() === "1") {
			$("#alcoholIntakeSpecify").slideDown(200);
			$("input[name='alcoholIntakeSpecify']").prop('required', true);
		} else if ($(this).val() === "0") {
			$("#alcoholIntakeSpecify").slideUp(200);
			$("input[name='alcoholIntakeSpecify']").prop('required', false);
		}
	});

	$("input[name='chemicalExposureHistory']").click(function() {
		if ($(this).val() === "1") {
			$("#chemicalExposureSpecify").slideDown(200);
			$("input[name='chemicalExposureSpecify']").prop('required', true);
		} else if ($(this).val() === "0") {
			$("#chemicalExposureSpecify").slideUp(200);
			$("input[name='chemicalExposureSpecify']").prop('required', false);
		}
	});

	$("input[name='previousInfection']").click(function() {
		if ($(this).val() === "1") {
			$("#previousInfectionSpecify").slideDown(200);
			$("input[name='previousInfectionSpecify']").prop('required', true);
		} else if ($(this).val() === "0") {
			$("#previousInfectionSpecify").slideUp(200);
			$("input[name='previousInfectionSpecify']").prop('required', false);
		}
	});

	$("input[name='previousHematologicDisorder']").click(function() {
		if ($(this).val() === "1") {
			$("#previousHematologicDisorderSpecify").slideDown(200);
			$("input[name='previousHematologicDisorderSpecify']").prop('required', true);
		} else if ($(this).val() === "0") {
			$("#previousHematologicDisorderSpecify").slideUp(200);
			$("input[name='previousHematologicDisorderSpecify']").prop('required', false);
		}
	});

	// LABORATORY

	$("input[name='boneMarrowAspirate']").click(function() {
		if ($(this).val() === "1") {
			$("#boneMarrowAspirateDatePerformed").slideDown(200);
			$("input[name='boneMarrowAspirateDatePerformed']").prop('required', true);
			$("#boneMarrowAspirateDescription").slideDown(200);
			$("input[name='boneMarrowAspirateDescription']").prop('required', true);
			$("#boneMarrowAspirateAttachScannedDocument").slideDown(200);
			// $("input[name='boneMarrowAspirateAttachScannedDocument']").prop('required', true);
		} else if ($(this).val() === "0") {
			$("#boneMarrowAspirateDatePerformed").slideUp(200);
			$("input[name='boneMarrowAspirateDatePerformed']").prop('required', false);
			$("#boneMarrowAspirateDescription").slideUp(200);
			$("input[name='boneMarrowAspirateDescription']").prop('required', false);
			$("#boneMarrowAspirateAttachScannedDocument").slideUp(200);
			$("input[name='boneMarrowAspirateAttachScannedDocument']").prop('required', false);
		}
	});

	$("input[name='flowCytometry']").click(function() {
		if ($(this).val() === "1") {
			$("#flowCytometryResult").slideDown(200);
			$("input[name='flowCytometryResult']").prop('required', true);
			$("#flowCytometryAttachScannedDocument").slideDown(200);
			// $("input[name='flowCytometryAttachScannedDocument']").prop('required', true);
		} else if ($(this).val() === "0") {
			$("#flowCytometryResult").slideUp(200);
			$("input[name='flowCytometryResult']").prop('required', false);
			$("#flowCytometryAttachScannedDocument").slideUp(200);
			$("input[name='flowCytometryAttachScannedDocument']").prop('required', false);
		}
	});

	$("input[name='molecularAnalysis']").click(function() {
		if ($(this).val() === "1") {
			$("#molecularAnalysisResult").slideDown(200);
			$("input[name='molecularAnalysisResult']").prop('required', true);
			$("#molecularAnalysisAttachScannedDocument").slideDown(200);
			// $("input[name='molecularAnalysisAttachScannedDocument']").prop('required', true);
		} else if ($(this).val() === "0") {
			$("#molecularAnalysisResult").slideUp(200);
			$("input[name='molecularAnalysisResult']").prop('required', false);
			$("#molecularAnalysisAttachScannedDocument").slideUp(200);
			$("input[name='molecularAnalysisAttachScannedDocument']").prop('required', false);
		}
	});

	$("input[name='cytogeneticAndMolecularAnalysisAAPNH']").click(function() {
		if ($(this).val() === "1") {
			$("#cytogeneticAndMolecularAnalysisAAPNHResult").slideDown(200);
			$("input[name='cytogeneticAndMolecularAnalysisAAPNHResult']").prop('required', true);
			$("#cytogeneticAndMolecularAnalysisAAPNHAttachScannedDocument").slideDown(200);
			// $("input[name='cytogeneticAndMolecularAnalysisAAPNHAttachScannedDocument']").prop('required', true);
		} else if ($(this).val() === "0") {
			$("#cytogeneticAndMolecularAnalysisAAPNHResult").slideUp(200);
			$("input[name='cytogeneticAndMolecularAnalysisAAPNHResult']").prop('required', false);
			$("#cytogeneticAndMolecularAnalysisAAPNHAttachScannedDocument").slideUp(200);
			$("input[name='cytogeneticAndMolecularAnalysisAAPNHAttachScannedDocument']").prop('required', false);
		}
	});

	$("input[name='cytogeneticAndMolecularAnalysisMDS']").click(function() {
		if ($(this).val() === "1") {
			$("#cytogeneticAndMolecularAnalysisMDSResult").slideDown(200);
			$("input[name='cytogeneticAndMolecularAnalysisMDSResult']").prop('required', true);
			$("#cytogeneticAndMolecularAnalysisMDSAttachScannedDocument").slideDown(200);
			// $("input[name='cytogeneticAndMolecularAnalysisMDSAttachScannedDocument']").prop('required', true);
		} else if ($(this).val() === "0") {
			$("#cytogeneticAndMolecularAnalysisMDSResult").slideUp(200);
			$("input[name='cytogeneticAndMolecularAnalysisMDSResult']").prop('required', false);
			$("#cytogeneticAndMolecularAnalysisMDSAttachScannedDocument").slideUp(200);
			$("input[name='cytogeneticAndMolecularAnalysisMDSAttachScannedDocument']").prop('required', false);
		}
	});

	$("input[name='molecularAnalysis']").click(function() {
		if ($(this).val() === "1") {
			$("#molecularAnalysisResult").slideDown(200);
			$("input[name='molecularAnalysisResult']").prop('required', true);
			$("#molecularAnalysisAttachScannedDocument").slideDown(200);
			// $("input[name='molecularAnalysisAttachScannedDocument']").prop('required', true);
		} else if ($(this).val() === "0") {
			$("#molecularAnalysisResult").slideUp(200);
			$("input[name='molecularAnalysisResult']").prop('required', false);
			$("#molecularAnalysisAttachScannedDocument").slideUp(200);
			$("input[name='molecularAnalysisAttachScannedDocument']").prop('required', false);
		}
	});

	// THERAPY AND RESPONSE

	$("input[name='transplantCandidate']").click(function() {
		if ($(this).val() === "1") {
			$("#modeOfTreatment").slideDown(200);
			$("input[name='modeOfTreatment']").prop('required', true);
			$("#medications").slideDown(200);
			$("input[name='medications']").prop('required', true);
			$("#dateStarted").slideDown(200);
			$("input[name='dateStarted']").prop('required', true);
		} else if ($(this).val() === "0") {
			$("#modeOfTreatment").slideUp(200);
			$("input[name='modeOfTreatment']").prop('required', false);
			$("#medications").slideUp(200);
			$("input[name='medications']").prop('required', false);
			$("#dateStarted").slideUp(200);
			$("input[name='dateStarted']").prop('required', false);
		}
	});

	// LEUKEMIA

	// LABORATORY

	$("input[name='imagingStudies']").click(function() {
		if ($(this).val() === "1") {
			$("#imagingStudiesResult").slideDown(200);
			$("input[name='imagingStudiesResult']").prop('required', true);
		} else if ($(this).val() === "0") {
			$("#imagingStudiesResult").slideUp(200);
			$("input[name='imagingStudiesResult']").prop('required', false);
		}
	});

	$("input[name='cytogeneticAndMolecularAnalysis']").click(function() {
		if ($(this).val() === "1") {
			$("#cytogeneticAndMolecularAnalysisResult").slideDown(200);
			$("input[name='cytogeneticAndMolecularAnalysisResult']").prop('required', true);
			$("#cytogeneticAndMolecularAnalysisAttachScannedDocument").slideDown(200);
			//$("input[name='cytogeneticAndMolecularAnalysisAttachScannedDocument']").prop('required', true);
		} else if ($(this).val() === "0") {
			$("#cytogeneticAndMolecularAnalysisResult").slideUp(200);
			$("input[name='cytogeneticAndMolecularAnalysisResult']").prop('required', false);
			$("#cytogeneticAndMolecularAnalysisAttachScannedDocument").slideUp(200);
			$("input[name='cytogeneticAndMolecularAnalysisAttachScannedDocument']").prop('required', false);
		}
	});

	// LYMPHOMA

	// LABORATORY

	// HEMAPATHOLOGY

	$("input[name='hematopathologyReviewOfSlides']").click(function() {
		if ($(this).val() === "1") {
			$("#hematopathologyDatePerformed").slideDown(200);
			$("input[name='hematopathologyDatePerformed']").prop('required', true);
			$("#hematopathologyDescription").slideDown(200);
			$("input[name='hematopathologyDescription']").prop('required', true);
			$("#hematopathologyAttachScannedDocument").slideDown(200);
			// $("input[name='hematopathologyAttachScannedDocument']").prop('required', true);
		} else if ($(this).val() === "0") {
			$("#hematopathologyDatePerformed").slideUp(200);
			$("input[name='hematopathologyDatePerformed']").prop('required', false);
			$("#hematopathologyDescription").slideUp(200);
			$("input[name='hematopathologyDescription']").prop('required', false);
			$("#hematopathologyAttachScannedDocument").slideUp(200);
			$("input[name='hematopathologyAttachScannedDocument']").prop('required', false);
		}
	});

	$("input[name='immunohistochemistryReviewOfSlides']").click(function() {
		if ($(this).val() === "1") {
			$("#immunohistochemistryDatePerformed").slideDown(200);
			$("input[name='immunohistochemistryDatePerformed']").prop('required', true);
			$("#immunohistochemistryDescription").slideDown(200);
			$("input[name='immunohistochemistryDescription']").prop('required', true);
			$("#immunohistochemistryAttachScannedDocument").slideDown(200);
			// $("input[name='immunohistochemistryAttachScannedDocument']").prop('required', true);
		} else if ($(this).val() === "0") {
			$("#immunohistochemistryDatePerformed").slideUp(200);
			$("input[name='immunohistochemistryDatePerformed']").prop('required', false);
			$("#immunohistochemistryDescription").slideUp(200);
			$("input[name='immunohistochemistryDescription']").prop('required', false);
			$("#immunohistochemistryAttachScannedDocument").slideUp(200);
			$("input[name='immunohistochemistryAttachScannedDocument']").prop('required', false);
		}
	});

	// PLASMA

	// LABORATORY

	$("input[name='serumFreeLightChainAsssay']").click(function() {
		if ($(this).val() === "1") {
			$("#serumFreeLightChainAsssayResult").slideDown(200);
			$("input[name='serumFreeLightChainAsssayResult']").prop('required', true);
			$("#serumFreeLightChainAssayAttachScannedDocument").slideDown(200);
			// $("input[name='serumFreeLightChainAssayAttachScannedDocument']").prop('required', true);
		} else if ($(this).val() === "0") {
			$("#serumFreeLightChainAsssayResult").slideUp(200);
			$("input[name='serumFreeLightChainAsssayResult']").prop('required', false);
			$("#serumFreeLightChainAssayAttachScannedDocument").slideUp(200);
			$("input[name='serumFreeLightChainAssayAttachScannedDocument']").prop('required', false);
		}
	});

	$("input[name='serumProteinElectrophoresis']").click(function() {
		if ($(this).val() === "1") {
			$("#serumProteinElectrophoresisResult").slideDown(200);
			$("input[name='serumProteinElectrophoresisResult']").prop('required', true);
			$("#serumProteinElectrophoresisAttachScannedDocument").slideDown(200);
			// $("input[name='serumProteinElectrophoresisAttachScannedDocument']").prop('required', true);
		} else if ($(this).val() === "0") {
			$("#serumProteinElectrophoresisResult").slideUp(200);
			$("input[name='serumProteinElectrophoresisResult']").prop('required', false);
			$("#serumProteinElectrophoresisAttachScannedDocument").slideUp(200);
			$("input[name='serumProteinElectrophoresisAttachScannedDocument']").prop('required', false);
		}
	});

	$("input[name='serumImmunofixation']").click(function() {
		if ($(this).val() === "1") {
			$("#serumImmunofixationResult").slideDown(200);
			$("input[name='serumImmunofixationResult']").prop('required', true);
			$("#serumImmunofixationAttachScannedDocument").slideDown(200);
			// $("input[name='serumImmunofixationAttachScannedDocument']").prop('required', true);
		} else if ($(this).val() === "0") {
			$("#serumImmunofixationResult").slideUp(200);
			$("input[name='serumImmunofixationResult']").prop('required', false);
			$("#serumImmunofixationAttachScannedDocument").slideUp(200);
			$("input[name='serumImmunofixationAttachScannedDocument']").prop('required', false);
		}
	});

	$("input[name='urineProtein']").click(function() {
		if ($(this).val() === "1") {
			$("#urineProteinResult").slideDown(200);
			$("input[name='urineProteinResult']").prop('required', true);
			$("#urineProteinAttachScannedDocument").slideDown(200);
			// $("input[name='urineProteinAttachScannedDocument']").prop('required', true);
		} else if ($(this).val() === "0") {
			$("#urineProteinResult").slideUp(200);
			$("input[name='urineProteinResult']").prop('required', false);
			$("#urineProteinAttachScannedDocument").slideUp(200);
			$("input[name='urineProteinAttachScannedDocument']").prop('required', false);
		}
	});

	$("input[name='upperGIEndoscopy']").click(function() {
		if ($(this).val() === "1") {
			$("#upperGIEndoscopyDatePerformed").slideDown(200);
			$("input[name='upperGIEndoscopyDatePerformed']").prop('required', true);
			$("#upperGIEndoscopyDescription").slideDown(200);
			$("input[name='upperGIEndoscopyDescription']").prop('required', true);
			$("#hPylori").slideDown(200);

			$("input[name='hPylori']").click(function() {
				if ($(this).val() === "1") {
					$("#hPyloriAttachScannedDocument").slideDown(200);
					// $("input[name='hPyloriAttachScannedDocument']").prop('required', true);
				} else if ($(this).val() === "0") {
					$("#hPyloriAttachScannedDocument").slideUp(200);
					$("input[name='hPyloriAttachScannedDocument']").prop('required', false);
				}
			});

		} else if ($(this).val() === "0") {
			$("#upperGIEndoscopyDatePerformed").slideUp(200);
			$("input[name='upperGIEndoscopyDatePerformed']").prop('required', false);
			$("#upperGIEndoscopyDescription").slideUp(200);
			$("input[name='upperGIEndoscopyDescription']").prop('required', false);
			$("input[name='hPylori']").prop('checked', false);
			$("#hPylori").slideUp(200);
			$("#hPyloriAttachScannedDocument").slideUp(200);
			$("input[name='hPyloriAttachScannedDocument']").prop('required', false);
		}
	});

	// THERAPY

	$("input[name='bisphosphonates']").click(function() {
		if ($(this).val() === "1") {
			$("#bisphosphonatesSpecify").slideDown(200);
			$("input[name='bisphosphonatesSpecify']").prop('required', true);
		} else if ($(this).val() === "0") {
			$("#bisphosphonatesSpecify").slideUp(200);
			$("input[name='bisphosphonatesSpecify']").prop('required', false);
		}
	});

	$("input[name='radiotherapy']").click(function() {
		if ($(this).val() === "1") {
			$("#radiotherapyDoseAndFrequency").slideDown(200);
			$("input[name='radiotherapyDoseAndFrequency']").prop('required', true);
		} else if ($(this).val() === "0") {
			$("#radiotherapyDoseAndFrequency").slideUp(200);
			$("input[name='radiotherapyDoseAndFrequency']").prop('required', false);
		}
	});

	$("input[name='dialysis']").click(function() {
		if ($(this).val() === "1") {
			$("#otherMedications").slideDown(200);
			$("input[name='otherMedications']").prop('required', true);
			$("#dateStarted").slideDown(200);
			$("input[name='dateStarted']").prop('required', true);
			$("#complications").slideDown(200);
			$("input[name='complications']").prop('required', true);
		} else if ($(this).val() === "0") {
			$("#otherMedications").slideUp(200);
			$("input[name='otherMedications']").prop('required', false);
			$("#dateStarted").slideUp(200);
			$("input[name='dateStarted']").prop('required', false);
			$("#complications").slideUp(200);
			$("input[name='complications']").prop('required', false);
		}
	});

	$("select[name='diseaseStatus']").click(function() {
		if ($(this).val() === "Others") {
			$("#diseaseStatusOthers").slideDown(200);
			$("input[name='diseaseStatusOthers']").prop('required', true);
			$("#relapseDisease").slideUp(100);
			$("input[name='relapseDisease']").prop('required', false);
		} else if ($(this).val() === "Relapse") {
			$("#relapseDisease").slideDown(200);
			$("input[name='relapseDisease']").prop('required', true);
			$("#diseaseStatusOthers").slideUp(100);
			$("input[name='diseaseStatusOthers']").prop('required', false);
		} else {
			$("#diseaseStatusOthers").slideUp(200);
			$("input[name='diseaseStatusOthers']").prop('required', false);
			$("#relapseDisease").slideUp(200);
			$("input[name='relapseDisease']").prop('required', false);
		}
	});

	$("select[name='qualityOfResponse']").click(function() {
		if ($(this).val() === "Others") {
			$("#diseaseStatusOthers").slideDown(200);
			$("input[name='diseaseStatusOthers']").prop('required', true);
		} else {
			$("#diseaseStatusOthers").slideUp(200);
			$("input[name='diseaseStatusOthers']").prop('required', false);
		}
	});

});
