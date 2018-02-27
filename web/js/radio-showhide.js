$(document)
		.ready(
				function() {

					// GENERAL DATA

					// tissueSpecimenCollected
					$.tissueSpecimenCollectedChecked = function() {
						// $("#smokingHistorySpecify").show();
						// $("#smokingHistorySpecify").show("fast");
						$("#specimenType").slideDown(200);
						$("[name='specimenType']").prop('required', true);
					}
					$.tissueSpecimenCollectedUnchecked = function() {
						// $("#smokingHistorySpecify").hide("fast");
						$("#specimenType").slideUp(200);
						$("[name='specimenType']").prop('required', false);
					}
					$("[name='tissueSpecimenCollected']").click(function() {
						if ($(this).val() === "1") {
							$.tissueSpecimenCollectedChecked();
						} else if ($(this).val() === "0") {
							$.tissueSpecimenCollectedUnchecked();
						}
					});
					if ($("[name='tissueSpecimenCollected'][value='1']").is(
							":checked")) {
						$.tissueSpecimenCollectedChecked();
					} else if ($("[name='tissueSpecimenCollected'][value='0']")
							.is(":checked")) {
						$.tissueSpecimenCollectedUnchecked();
					}

					// MEDICAL EVENTS

					// hematologicMalignancy
					$.hematologicMalignancyChecked = function() {
						$("#specifyHematologicMalignancy").slideDown(200);
						$("[name='specifyHematologicMalignancy']").prop(
								'required', true);
					}
					$.hematologicMalignancyUnchecked = function() {
						$("#specifyHematologicMalignancy").slideUp(200);
						$("[name='specifyHematologicMalignancy']").prop(
								'required', false);
					}
					$("[name='hematologicMalignancy']").click(function() {
						if ($(this).val() === "1") {
							$.hematologicMalignancyChecked();
						} else if ($(this).val() === "0") {
							$.hematologicMalignancyUnchecked();
						}
					});
					if ($("[name='hematologicMalignancy'][value='1']").is(
							":checked")) {
						$.hematologicMalignancyChecked();
					} else if ($("[name='hematologicMalignancy'][value='0']")
							.is(":checked")) {
						$.hematologicMalignancyUnchecked();
					}

					// otherDiseaseMedication
					$.otherDiseaseMedicationChecked = function() {
						$("#specifyOtherDiseaseMedication").slideDown(200);
						$("[name='specifyOtherDiseaseMedication']").prop(
								'required', true);
					}
					$.otherDiseaseMedicationUnchecked = function() {
						$("#specifyOtherDiseaseMedication").slideUp(200);
						$("[name='specifyOtherDiseaseMedication']").prop(
								'required', false);
					}
					$("[name='otherDiseaseMedication']").click(function() {
						if ($(this).val() === "1") {
							$.otherDiseaseMedicationChecked();
						} else if ($(this).val() === "0") {
							$.otherDiseaseMedicationUnchecked();
						}
					});
					if ($("[name='otherDiseaseMedication'][value='1']").is(
							":checked")) {
						$.otherDiseaseMedicationChecked();
					} else if ($("[name='otherDiseaseMedication'][value='0']")
							.is(":checked")) {
						$.otherDiseaseMedicationUnchecked();
					}

					// factorConcentrate
					$.factorConcentrateChecked = function() {
						$("#specifyReasonFactorConcentrate").slideDown(200);
						$("[name='specifyReasonFactorConcentrate']").prop(
								'required', true);
						$("#datesOfAdministrationFactorConcentrate").slideDown(
								200);
						$("[name='datesOfAdministrationFactorConcentrate']")
								.prop('required', true);
						$("#doseOfFactorConcentrate").slideDown(200);
						$("[name='doseOfFactorConcentrate']").prop('required',
								true);
					}
					$.factorConcentrateUnchecked = function() {
						$("#specifyReasonFactorConcentrate").slideUp(200);
						$("[name='specifyReasonFactorConcentrate']").prop(
								'required', false);
						$("#datesOfAdministrationFactorConcentrate").slideUp(
								200);
						$("[name='datesOfAdministrationFactorConcentrate']")
								.prop('required', false);
						$("#doseOfFactorConcentrate").slideUp(200);
						$("[name='doseOfFactorConcentrate']").prop('required',
								false);
					}
					$("[name='factorConcentrate']").click(function() {
						if ($(this).val() === "1") {
							$.factorConcentrateChecked();
						} else if ($(this).val() === "0") {
							$.factorConcentrateUnchecked();
						}
					});
					if ($("[name='factorConcentrate'][value='1']").is(
							":checked")) {
						$.factorConcentrateChecked();
					} else if ($("[name='factorConcentrate'][value='0']").is(
							":checked")) {
						$.factorConcentrateUnchecked();
					}

					// procedure
					$.procedureChecked = function() {
						$("#specifyProcedure").slideDown(200);
						$("[name='specifyProcedure']").prop('required', true);
					}
					$.procedureUnchecked = function() {
						$("#specifyProcedure").slideUp(200);
						$("[name='specifyProcedure']").prop('required', false);
					}
					$("[name='procedure']").click(function() {
						if ($(this).val() === "1") {
							$.procedureChecked();
						} else if ($(this).val() === "0") {
							$.procedureUnchecked();
						}
					});
					if ($("[name='procedure'][value='1']").is(":checked")) {
						$.procedureChecked();
					} else if ($("[name='procedure'][value='0']")
							.is(":checked")) {
						$.procedureUnchecked();
					}

					// chemotherapy
					$.chemotherapyChecked = function() {
						$("#specifyChemotherapy").slideDown(200);
						$("[name='specifyChemotherapy']")
								.prop('required', true);
					}
					$.chemotherapyUnchecked = function() {
						$("#specifyChemotherapy").slideUp(200);
						$("[name='specifyChemotherapy']").prop('required',
								false);
					}
					$("[name='chemotherapy']").click(function() {
						if ($(this).val() === "1") {
							$.chemotherapyChecked();
						} else if ($(this).val() === "0") {
							$.chemotherapyUnchecked();
						}
					});
					if ($("[name='chemotherapy'][value='1']").is(":checked")) {
						$.chemotherapyChecked();
					} else if ($("[name='chemotherapy'][value='0']").is(
							":checked")) {
						$.chemotherapyUnchecked();
					}

					// CLINICAL

					// diagnosis
					$.diagnosisOthers = function() {
						$("#diagnosisOthers").slideDown(200);
						$("[name='diagnosisOthers']").prop('required', true);
					}
					$.diagnosisNull = function() {
						$("#diagnosisOthers").slideUp(200);
						$("[name='diagnosisOthers']").prop('required', false);
					}
					$("[name='diagnosis']").click(function() {
						if ($(this).val() === "Others") {
							$.diagnosisOthers();
						} else {
							$.diagnosisNull();
						}
					});
					if ($("[name='diagnosis']").val() === "Others") {
						$.diagnosisOthers();
					} else {
						$.diagnosisNull();
					}

					// treatment
					$.treatmentOthers = function() {
						$("#treatmentSpecify").slideDown(200);
						$("[name='treatmentSpecify']").prop('required', true);
						$("#otherRegimens").slideDown(200);
						$("[name='otherRegimens']").prop('required', true);
					}
					$.treatmentNull = function() {
						$("#treatmentSpecify").slideUp(200);
						$("[name='treatmentSpecify']").prop('required', false);
						$("#otherRegimens").slideUp(200);
						$("[name='otherRegimens']").prop('required', false);
					}
					$("[name='treatment']").click(function() {
						if ($(this).val() === "Others") {
							$.treatmentOthers();
						} else {
							$.treatmentNull();
						}
					});
					if ($("[name='treatment']").val() === "Others") {
						$.treatmentOthers();
					} else {
						$.treatmentNull();
					}

					// regimenProtocolTransplant
					$.regimenProtocolTransplantOthers = function() {
						$("#otherRegimensTransplant").slideDown(200);
						$("[name='otherRegimensTransplant']").prop('required',
								true);
					}
					$.regimenProtocolTransplantNull = function() {
						$("#otherRegimensTransplant").slideUp(200);
						$("[name='otherRegimensTransplant']").prop('required',
								false);
					}
					$("[name='regimenProtocolTransplant']").click(function() {
						if ($(this).val() === "Others") {
							$.regimenProtocolTransplantOthers();
						} else {
							$.regimenProtocolTransplantNull();
						}
					});
					if ($("[name='regimenProtocolTransplant']").val() === "Others") {
						$.regimenProtocolTransplantOthers();
					} else {
						$.regimenProtocolTransplantNull();
					}

					// regimenProtocolNonTransplant
					$.regimenProtocolNonTransplantOthers = function() {
						$("#otherRegimensNonTransplant").slideDown(200);
						$("[name='otherRegimensNonTransplant']").prop(
								'required', true);
					}
					$.regimenProtocolNonTransplantNull = function() {
						$("#otherRegimensNonTransplant").slideUp(200);
						$("[name='otherRegimensNonTransplant']").prop(
								'required', false);
					}
					$("[name='regimenProtocolNonTransplant']").click(
							function() {
								if ($(this).val() === "Others") {
									$.regimenProtocolNonTransplantOthers();
								} else {
									$.regimenProtocolNonTransplantNull();
								}
							});
					if ($("[name='regimenProtocolNonTransplant']").val() === "Others") {
						$.regimenProtocolNonTransplantOthers();
					} else {
						$.regimenProtocolNonTransplantNull();
					}

					// regimenProtocolMaintenanceTherapy
					$.regimenProtocolMaintenanceTherapyOthers = function() {
						$("#otherRegimensMaintenanceTherapy").slideDown(200);
						$("[name='otherRegimensMaintenanceTherapy']").prop(
								'required', true);
					}

					$.regimenProtocolMaintenanceTherapyNull = function() {
						$("#otherRegimensMaintenanceTherapy").slideUp(200);
						$("[name='otherRegimensMaintenanceTherapy']").prop(
								'required', false);
					}

					$("[name='regimenProtocolMaintenanceTherapy']")
							.click(
									function() {
										if ($(this).val() === "Others") {
											$
													.regimenProtocolMaintenanceTherapyOthers();
										} else {
											$
													.regimenProtocolMaintenanceTherapyNull();
										}
									});

					if ($("[name='regimenProtocolMaintenanceTherapy']").val() === "Others") {
						$.regimenProtocolMaintenanceTherapyOthers();
					} else {
						$.regimenProtocolMaintenanceTherapyNull();
					}

					// prognosticRiskScoring
					$.prognosticRiskScoringOthers = function() {
						$("#prognosticRiskScoringOthers").slideDown(200);
						$("[name='prognosticRiskScoringOthers']").prop(
								'required', true);
					}

					$.prognosticRiskScoringNull = function() {
						$("#prognosticRiskScoringOthers").slideUp(200);
						$("[name='prognosticRiskScoringOthers']").prop(
								'required', false);
					}

					$("[name='prognosticRiskScoring']").click(function() {
						if ($(this).val() === "Others") {
							$.prognosticRiskScoringOthers();
						} else {
							$.prognosticRiskScoringNull();
						}
					});

					if ($("[name='prognosticRiskScoring']").val() === "Others") {
						$.prognosticRiskScoringOthers();
					} else {
						$.prognosticRiskScoringNull();
					}

					// riskScore
					$.riskScoreOthers = function() {
						$("#riskScoreOthers").slideDown(200);
						$("[name='riskScoreOthers']").prop('required', true);
					}

					$.riskScoreNull = function() {
						$("#riskScoreOthers").slideUp(200);
						$("[name='riskScoreOthers']").prop('required', false);
					}

					$("[name='riskScore']").click(function() {
						if ($(this).val() === "Others") {
							$.riskScoreOthers();
						} else {
							$.riskScoreNull();
						}
					});

					if ($("[name='riskScore']").val() === "Others") {
						$.riskScoreOthers();
					} else {
						$.riskScoreNull();
					}

					// familyHistoryOfCancer
					$.familyHistoryOfCancerChecked = function() {
						$("#relationshipToPatient").slideDown(200);
						$("[name='relationshipToPatient']").prop('required',
								true);
						$("#specifyCancer").slideDown(200);
						$("[name='specifyCancer']").prop('required', true);
						$("#otherDiseasesInTheFamily").slideDown(200);
						$("[name='otherDiseasesInTheFamily']").prop('required',
								true);
					}
					$.familyHistoryOfCancerUnchecked = function() {
						$("#relationshipToPatient").slideUp(200);
						$("[name='relationshipToPatient']").prop('required',
								false);
						$("#specifyCancer").slideUp(200);
						$("[name='specifyCancer']").prop('required', false);
						$("#otherDiseasesInTheFamily").slideUp(200);
						$("[name='otherDiseasesInTheFamily']").prop('required',
								false);
					}
					$("[name='familyHistoryOfCancer']").click(function() {
						if ($(this).val() === "1") {
							$.familyHistoryOfCancerChecked();
						} else if ($(this).val() === "0") {
							$.familyHistoryOfCancerUnchecked();
						}
					});
					if ($("[name='familyHistoryOfCancer'][value='1']").is(
							":checked")) {
						$.familyHistoryOfCancerChecked();
					} else if ($("[name='familyHistoryOfCancer'][value='0']")
							.is(":checked")) {
						$.familyHistoryOfCancerChecked();
					}

					// familyHistoryOfBleedingDiathesis
					$.familyHistoryOfBleedingDiathesisChecked = function() {
						$("#relationshipToPatient").slideDown(200);
						$("[name='relationshipToPatient']").prop('required',
								true);
						$("#specifyCancer").slideDown(200);
						$("[name='specifyCancer']").prop('required', true);
						$("#otherDiseasesInTheFamily").slideDown(200);
						$("[name='otherDiseasesInTheFamily']").prop('required',
								true);
					}
					$.familyHistoryOfBleedingDiathesisUnchecked = function() {
						$("#relationshipToPatient").slideUp(200);
						$("[name='relationshipToPatient']").prop('required',
								false);
						$("#specifyCancer").slideUp(200);
						$("[name='specifyCancer']").prop('required', false);
						$("#otherDiseasesInTheFamily").slideUp(200);
						$("[name='otherDiseasesInTheFamily']").prop('required',
								false);
					}
					$("[name='familyHistoryOfBleedingDiathesis']")
							.click(
									function() {
										if ($(this).val() === "1") {
											$
													.familyHistoryOfBleedingDiathesisChecked();
										} else if ($(this).val() === "0") {
											$
													.familyHistoryOfBleedingDiathesisUnchecked();
										}
									});
					if ($(
							"[name='familyHistoryOfBleedingDiathesis'][value='1']")
							.is(":checked")) {
						$.familyHistoryOfBleedingDiathesisChecked();
					} else if ($(
							"[name='familyHistoryOfBleedingDiathesis'][value='0']")
							.is(":checked")) {
						$.familyHistoryOfBleedingDiathesisUnchecked();
					}

					// concomitantMedications
					$.concomitantMedicationsChecked = function() {
						$("#concomitantMedications").slideDown(200);
						$("#genericName").slideDown(200);
						$("[name='genericName']").prop('required', true);
						$("#dose").slideDown(200);
						$("[name='dose']").prop('required', true);
						$("#frequency").slideDown(200);
						$("[name='frequency']").prop('required', true);
					}
					$.concomitantMedicationsUnchecked = function() {
						$("#concomitantMedications").slideUp(200);
						$("#genericName").slideUp(200);
						$("[name='genericName']").prop('required', false);
						$("#dose").slideUp(200);
						$("[name='dose']").prop('required', false);
						$("#frequency").slideUp(200);
						$("[name='frequency']").prop('required', false);
					}
					$("[name='concomitantMedications']").click(function() {
						if ($(this).val() === "1") {
							$.concomitantMedicationsChecked();
						} else if ($(this).val() === "0") {
							$.concomitantMedicationsUnchecked();
						}
					});
					if ($("[name='concomitantMedications'][value='1']").is(
							":checked")) {
						$.concomitantMedicationsChecked();
					} else if ($("[name='concomitantMedications'][value='0']")
							.is(":checked")) {
						$.concomitantMedicationsUnchecked();
					}

					// thrombosisHistory
					$.thrombosisHistoryChecked = function() {
						$("#thrombosisHistorySpecify").slideDown(200);
						$("[name='thrombosisHistorySpecify']").prop('required',
								true);
					}
					$.thrombosisHistoryUnchecked = function() {
						$("#thrombosisHistorySpecify").slideUp(200);
						$("[name='thrombosisHistorySpecify']").prop('required',
								false);
					}
					$("[name='thrombosisHistory']").click(function() {
						if ($(this).val() === "1") {
							$.thrombosisHistoryChecked();
						} else if ($(this).val() === "0") {
							$.thrombosisHistoryUnchecked();
						}
					});
					if ($("[name='thrombosisHistory'][value='1']").is(
							":checked")) {
						$.thrombosisHistoryChecked();
					} else if ($("[name='thrombosisHistory'][value='0']").is(
							":checked")) {
						$.thrombosisHistoryUnchecked();
					}

					// smokingHistory
					$.smokingHistoryChecked = function() {
						// $("#smokingHistorySpecify").show();
						// $("#smokingHistorySpecify").show("fast");
						$("#smokingHistorySpecify").slideDown(200);
						$("[name='smokingHistorySpecify']").prop('required',
								true);
					}
					$.smokingHistoryUnchecked = function() {
						// $("#smokingHistorySpecify").hide("fast");
						$("#smokingHistorySpecify").slideUp(200);
						$("[name='smokingHistorySpecify']").prop('required',
								false);
					}
					$("[name='smokingHistory']").click(function() {
						if ($(this).val() === "1") {
							$.smokingHistoryChecked();
						} else if ($(this).val() === "0") {
							$.smokingHistoryUnchecked();
						}
					});
					if ($("[name='smokingHistory'][value='1']").is(":checked")) {
						$.smokingHistoryChecked();
					} else if ($("[name='smokingHistory'][value='0']").is(
							":checked")) {
						$.smokingHistoryUnchecked();
					}

					// alcoholIntakeHistory
					$.alcoholIntakeHistoryChecked = function() {
						$("#alcoholIntakeSpecify").slideDown(200);
						$("[name='alcoholIntakeSpecify']").prop('required',
								true);
					}
					$.alcoholIntakeHistoryUnchecked = function() {
						$("#alcoholIntakeSpecify").slideUp(200);
						$("[name='alcoholIntakeSpecify']").prop('required',
								false);
					}
					$("[name='alcoholIntakeHistory']").click(function() {
						if ($(this).val() === "1") {
							$.alcoholIntakeHistoryChecked();
						} else if ($(this).val() === "0") {
							$.alcoholIntakeHistoryUnchecked();
						}
					});
					if ($("[name='alcoholIntakeHistory'][value='1']").is(
							":checked")) {
						$.alcoholIntakeHistoryChecked();
					} else if ($("[name='alcoholIntakeHistory'][value='0']")
							.is(":checked")) {
						$.alcoholIntakeHistoryUnchecked();
					}

					// chemicalExposureHistory
					$.chemicalExposureHistoryChecked = function() {
						$("#chemicalExposureSpecify").slideDown(200);
						$("[name='chemicalExposureSpecify']").prop('required',
								true);
					}
					$.chemicalExposureHistoryUnchecked = function() {
						$("#chemicalExposureSpecify").slideUp(200);
						$("[name='chemicalExposureSpecify']").prop('required',
								false);
					}
					$("[name='chemicalExposureHistory']").click(function() {
						if ($(this).val() === "1") {
							$.chemicalExposureHistoryChecked();
						} else if ($(this).val() === "0") {
							$.chemicalExposureHistoryUnchecked();
						}
					});
					if ($("[name='chemicalExposureHistory'][value='1']").is(
							":checked")) {
						$.chemicalExposureHistoryChecked();
					} else if ($("[name='chemicalExposureHistory'][value='0']")
							.is(":checked")) {
						$.chemicalExposureHistoryUnchecked();
					}

					// previousInfection
					$.previousInfectionChecked = function() {
						$("#previousInfectionSpecify").slideDown(200);
						$("[name='previousInfectionSpecify']").prop('required',
								true);
					}
					$.previousInfectionUnchecked = function() {
						$("#previousInfectionSpecify").slideUp(200);
						$("[name='previousInfectionSpecify']").prop('required',
								false);
					}
					$("[name='previousInfection']").click(function() {
						if ($(this).val() === "1") {
							$.previousInfectionChecked();
						} else if ($(this).val() === "0") {
							$.previousInfectionUnchecked();
						}
					});
					if ($("[name='previousInfection'][value='1']").is(
							":checked")) {
						$.previousInfectionChecked();
					} else if ($("[name='previousInfection'][value='0']").is(
							":checked")) {
						$.previousInfectionUnchecked();
					}

					// previousHematologicDisorder
					$.previousHematologicDisorderChecked = function() {
						$("#previousHematologicDisorderSpecify").slideDown(200);
						$("[name='previousHematologicDisorderSpecify']").prop(
								'required', true);
					}
					$.previousHematologicDisorderUnchecked = function() {
						$("#previousHematologicDisorderSpecify").slideUp(200);
						$("[name='previousHematologicDisorderSpecify']").prop(
								'required', false);
					}
					$("[name='previousHematologicDisorder']").click(function() {
						if ($(this).val() === "1") {
							$.previousHematologicDisorderChecked();
						} else if ($(this).val() === "0") {
							$.previousHematologicDisorderUnchecked();
						}
					});
					if ($("[name='previousHematologicDisorder'][value='1']")
							.is(":checked")) {
						$.previousHematologicDisorderChecked();
					} else if ($(
							"[name='previousHematologicDisorder'][value='0']")
							.is(":checked")) {
						$.previousHematologicDisorderUnchecked();
					}

					// LABORATORY

					// boneMarrowAspirate
					$.boneMarrowAspirateChecked = function() {
						$("#boneMarrowAspirateDatePerformed").slideDown(200);
						$("[name='boneMarrowAspirateDatePerformed']").prop(
								'required', true);
						$("#boneMarrowAspirateDescription").slideDown(200);
						$("[name='boneMarrowAspirateDescription']").prop(
								'required', true);
						$("#boneMarrowAspirateAttachScannedDocument")
								.slideDown(200);
						// $("[name='boneMarrowAspirateAttachScannedDocument']").prop('required',
						// true);
					}
					$.boneMarrowAspirateUnchecked = function() {
						$("#boneMarrowAspirateDatePerformed").slideUp(200);
						$("[name='boneMarrowAspirateDatePerformed']").prop(
								'required', false);
						$("#boneMarrowAspirateDescription").slideUp(200);
						$("[name='boneMarrowAspirateDescription']").prop(
								'required', false);
						$("#boneMarrowAspirateAttachScannedDocument").slideUp(
								200);
						$("[name='boneMarrowAspirateAttachScannedDocument']")
								.prop('required', false);
					}
					$("[name='boneMarrowAspirate']").click(function() {
						if ($(this).val() === "1") {
							$.boneMarrowAspirateChecked();
						} else if ($(this).val() === "0") {
							$.boneMarrowAspirateUnchecked();
						}
					});
					if ($("[name='boneMarrowAspirate'][value='1']").is(
							":checked")) {
						$.boneMarrowAspirateChecked();
					} else if ($("[name='boneMarrowAspirate'][value='0']").is(
							":checked")) {
						$.boneMarrowAspirateUnchecked();
					}

					// flowCytometry
					$.flowCytometryChecked = function() {
						$("#flowCytometryResult").slideDown(200);
						$("[name='flowCytometryResult']")
								.prop('required', true);
						$("#flowCytometryAttachScannedDocument").slideDown(200);
						// $("[name='flowCytometryAttachScannedDocument']").prop('required',
						// true);
					}
					$.flowCytometryUnchecked = function() {
						$("#flowCytometryResult").slideUp(200);
						$("[name='flowCytometryResult']").prop('required',
								false);
						$("#flowCytometryAttachScannedDocument").slideUp(200);
						$("[name='flowCytometryAttachScannedDocument']").prop(
								'required', false);
					}
					$("[name='flowCytometry']").click(function() {
						if ($(this).val() === "1") {
							$.flowCytometryChecked();
						} else if ($(this).val() === "0") {
							$.flowCytometryUnchecked();
						}
					});
					if ($("[name='flowCytometry'][value='1']").is(":checked")) {
						$.flowCytometryChecked();
					} else if ($("[name='flowCytometry'][value='0']").is(
							":checked")) {
						$.flowCytometryUnchecked();
					}

					// molecularAnalysis
					$.molecularAnalysisChecked = function() {
						$("#molecularAnalysisResult").slideDown(200);
						$("[name='molecularAnalysisResult']").prop('required',
								true);
						$("#molecularAnalysisAttachScannedDocument").slideDown(
								200);
						// $("[name='molecularAnalysisAttachScannedDocument']").prop('required',
						// true);
					}
					$.molecularAnalysisUnchecked = function() {
						$("#molecularAnalysisResult").slideUp(200);
						$("[name='molecularAnalysisResult']").prop('required',
								false);
						$("#molecularAnalysisAttachScannedDocument").slideUp(
								200);
						$("[name='molecularAnalysisAttachScannedDocument']")
								.prop('required', false);
					}
					$("[name='molecularAnalysis']").click(function() {
						if ($(this).val() === "1") {
							$.molecularAnalysisChecked();
						} else if ($(this).val() === "0") {
							$.molecularAnalysisUnchecked();
						}
					});
					if ($("[name='molecularAnalysis'][value='1']").is(
							":checked")) {
						$.molecularAnalysisChecked();
					} else if ($("[name='molecularAnalysis'][value='0']").is(
							":checked")) {
						$.molecularAnalysisUnchecked();
					}

					// cytogeneticAndMolecularAnalysisAAPNH
					$.cytogeneticAndMolecularAnalysisAAPNHChecked = function() {
						$("#cytogeneticAndMolecularAnalysisAAPNHResult")
								.slideDown(200);
						$("[name='cytogeneticAndMolecularAnalysisAAPNHResult']")
								.prop('required', true);
						$(
								"#cytogeneticAndMolecularAnalysisAAPNHAttachScannedDocument")
								.slideDown(200);
						// $("[name='cytogeneticAndMolecularAnalysisAAPNHAttachScannedDocument']").prop('required',
						// true);
					}
					$.cytogeneticAndMolecularAnalysisAAPNHUnchecked = function() {
						$("#cytogeneticAndMolecularAnalysisAAPNHResult")
								.slideUp(200);
						$("[name='cytogeneticAndMolecularAnalysisAAPNHResult']")
								.prop('required', false);
						$(
								"#cytogeneticAndMolecularAnalysisAAPNHAttachScannedDocument")
								.slideUp(200);
						$(
								"[name='cytogeneticAndMolecularAnalysisAAPNHAttachScannedDocument']")
								.prop('required', false);
					}
					$("[name='cytogeneticAndMolecularAnalysisAAPNH']")
							.click(
									function() {
										if ($(this).val() === "1") {
											$
													.cytogeneticAndMolecularAnalysisAAPNHChecked();
										} else if ($(this).val() === "0") {
											$
													.cytogeneticAndMolecularAnalysisAAPNHUnchecked();
										}
									});
					if ($(
							"[name='cytogeneticAndMolecularAnalysisAAPNH'][value='1']")
							.is(":checked")) {
						$.cytogeneticAndMolecularAnalysisAAPNHChecked();
					} else if ($(
							"[name='cytogeneticAndMolecularAnalysisAAPNH'][value='0']")
							.is(":checked")) {
						$.cytogeneticAndMolecularAnalysisAAPNHUnchecked();
					}

					// cytogeneticAndMolecularAnalysisMDS
					$.cytogeneticAndMolecularAnalysisMDSChecked = function() {
						$("#cytogeneticAndMolecularAnalysisMDSResult")
								.slideDown(200);
						$("[name='cytogeneticAndMolecularAnalysisMDSResult']")
								.prop('required', true);
						$(
								"#cytogeneticAndMolecularAnalysisMDSAttachScannedDocument")
								.slideDown(200);
						// $("[name='cytogeneticAndMolecularAnalysisMDSAttachScannedDocument']").prop('required',
						// true);
					}
					$.cytogeneticAndMolecularAnalysisMDSUnchecked = function() {
						$("#cytogeneticAndMolecularAnalysisMDSResult").slideUp(
								200);
						$("[name='cytogeneticAndMolecularAnalysisMDSResult']")
								.prop('required', false);
						$(
								"#cytogeneticAndMolecularAnalysisMDSAttachScannedDocument")
								.slideUp(200);
						$(
								"[name='cytogeneticAndMolecularAnalysisMDSAttachScannedDocument']")
								.prop('required', false);
					}
					$("[name='cytogeneticAndMolecularAnalysisMDS']")
							.click(
									function() {
										if ($(this).val() === "1") {
											$
													.cytogeneticAndMolecularAnalysisMDSChecked();
										} else if ($(this).val() === "0") {
											$
													.cytogeneticAndMolecularAnalysisMDSUnchecked();
										}
									});
					if ($(
							"[name='cytogeneticAndMolecularAnalysisMDS'][value='1']")
							.is(":checked")) {
						$.cytogeneticAndMolecularAnalysisMDSChecked();
					} else if ($(
							"[name='cytogeneticAndMolecularAnalysisMDS'][value='0']")
							.is(":checked")) {
						$.cytogeneticAndMolecularAnalysisMDSUnchecked();
					}

					// molecularAnalysis
					$.molecularAnalysisChecked = function() {
						$("#molecularAnalysisResult").slideDown(200);
						$("[name='molecularAnalysisResult']").prop('required',
								true);
						$("#molecularAnalysisAttachScannedDocument").slideDown(
								200);
						// $("[name='molecularAnalysisAttachScannedDocument']").prop('required',
						// true);
					}
					$.molecularAnalysisUnchecked = function() {
						$("#molecularAnalysisResult").slideUp(200);
						$("[name='molecularAnalysisResult']").prop('required',
								false);
						$("#molecularAnalysisAttachScannedDocument").slideUp(
								200);
						$("[name='molecularAnalysisAttachScannedDocument']")
								.prop('required', false);
					}
					$("[name='molecularAnalysis']").click(function() {
						if ($(this).val() === "1") {
							$.molecularAnalysisChecked();
						} else if ($(this).val() === "0") {
							$.molecularAnalysisUnchecked();
						}
					});
					if ($("[name='molecularAnalysis'][value='1']").is(
							":checked")) {
						$.molecularAnalysisChecked();
					} else if ($("[name='molecularAnalysis'][value='0']").is(
							":checked")) {
						$.molecularAnalysisUnchecked();
					}

					// imagingStudies
					$.imagingStudiesChecked = function() {
						$("#imagingStudiesResult").slideDown(200);
						$("[name='imagingStudiesResult']").prop('required',
								true);
					}
					$.imagingStudiesUnchecked = function() {
						$("#imagingStudiesResult").slideUp(200);
						$("[name='imagingStudiesResult']").prop('required',
								false);
					}
					$("[name='imagingStudies']").click(function() {
						if ($(this).val() === "1") {
							$.imagingStudiesChecked();
						} else if ($(this).val() === "0") {
							$.imagingStudiesUnchecked();
						}
					});
					if ($("[name='imagingStudies'][value='1']").is(":checked")) {
						$.imagingStudiesChecked();
					} else if ($("[name='imagingStudies'][value='0']").is(
							":checked")) {
						$.imagingStudiesUnchecked();
					}

					// cytogeneticAndMolecularAnalysis
					$.cytogeneticAndMolecularAnalysisChecked = function() {
						$("#cytogeneticAndMolecularAnalysisResult").slideDown(
								200);
						$("[name='cytogeneticAndMolecularAnalysisResult']")
								.prop('required', true);
						$(
								"#cytogeneticAndMolecularAnalysisAttachScannedDocument")
								.slideDown(200);
						// $("[name='cytogeneticAndMolecularAnalysisAttachScannedDocument']").prop('required',
						// true);
					}

					$.cytogeneticAndMolecularAnalysisUnchecked = function() {
						$("#cytogeneticAndMolecularAnalysisResult")
								.slideUp(200);
						$("[name='cytogeneticAndMolecularAnalysisResult']")
								.prop('required', false);
						$(
								"#cytogeneticAndMolecularAnalysisAttachScannedDocument")
								.slideUp(200);
						$(
								"[name='cytogeneticAndMolecularAnalysisAttachScannedDocument']")
								.prop('required', false);
					}

					$("[name='cytogeneticAndMolecularAnalysis']")
							.click(
									function() {
										if ($(this).val() === "1") {
											$
													.cytogeneticAndMolecularAnalysisChecked();
										} else if ($(this).val() === "0") {
											$
													.cytogeneticAndMolecularAnalysisUnchecked();
										}
									});

					if ($("[name='cytogeneticAndMolecularAnalysis'][value='1']")
							.is(":checked")) {
						$.cytogeneticAndMolecularAnalysisChecked();
					} else if ($(
							"[name='cytogeneticAndMolecularAnalysis'][value='0']")
							.is(":checked")) {
						$.cytogeneticAndMolecularAnalysisUnchecked();
					}

					// hematopathologyReviewOfSlides
					$.hematopathologyReviewOfSlidesChecked = function() {
						$("#hematopathologyDatePerformed").slideDown(200);
						$("[name='hematopathologyDatePerformed']").prop(
								'required', true);
						$("#hematopathologyDescription").slideDown(200);
						$("[name='hematopathologyDescription']").prop(
								'required', true);
						$("#hematopathologyAttachScannedDocument").slideDown(
								200);
						// $("[name='hematopathologyAttachScannedDocument']").prop('required',
						// true);
					}
					$.hematopathologyReviewOfSlidesUnchecked = function() {
						$("#hematopathologyDatePerformed").slideUp(200);
						$("[name='hematopathologyDatePerformed']").prop(
								'required', false);
						$("#hematopathologyDescription").slideUp(200);
						$("[name='hematopathologyDescription']").prop(
								'required', false);
						$("#hematopathologyAttachScannedDocument").slideUp(200);
						$("[name='hematopathologyAttachScannedDocument']")
								.prop('required', false);
					}
					$("[name='hematopathologyReviewOfSlides']").click(
							function() {
								if ($(this).val() === "1") {
									$.hematopathologyReviewOfSlidesChecked();
								} else if ($(this).val() === "0") {
									$.hematopathologyReviewOfSlidesUnchecked();
								}
							});
					if ($("[name='hematopathologyReviewOfSlides'][value='1']")
							.is(":checked")) {
						$.hematopathologyReviewOfSlidesChecked();
					} else if ($(
							"[name='hematopathologyReviewOfSlides'][value='0']")
							.is(":checked")) {
						$.hematopathologyReviewOfSlidesUnchecked();
					}

					// immunohistochemistryReviewOfSlides
					$.immunohistochemistryReviewOfSlidesChecked = function() {
						$("#immunohistochemistryDatePerformed").slideDown(200);
						$("[name='immunohistochemistryDatePerformed']").prop(
								'required', true);
						$("#immunohistochemistryDescription").slideDown(200);
						$("[name='immunohistochemistryDescription']").prop(
								'required', true);
						$("#immunohistochemistryAttachScannedDocument")
								.slideDown(200);
						// $("[name='immunohistochemistryAttachScannedDocument']").prop('required',
						// true);
					}
					$.immunohistochemistryReviewOfSlidesUnchecked = function() {
						$("#immunohistochemistryDatePerformed").slideUp(200);
						$("[name='immunohistochemistryDatePerformed']").prop(
								'required', false);
						$("#immunohistochemistryDescription").slideUp(200);
						$("[name='immunohistochemistryDescription']").prop(
								'required', false);
						$("#immunohistochemistryAttachScannedDocument")
								.slideUp(200);
						$("[name='immunohistochemistryAttachScannedDocument']")
								.prop('required', false);
					}
					$("[name='immunohistochemistryReviewOfSlides']")
							.click(
									function() {
										if ($(this).val() === "1") {
											$
													.immunohistochemistryReviewOfSlidesChecked();
										} else if ($(this).val() === "0") {
											$
													.immunohistochemistryReviewOfSlidesUnchecked();
										}
									});
					if ($(
							"[name='immunohistochemistryReviewOfSlides'][value='1']")
							.is(":checked")) {
						$.immunohistochemistryReviewOfSlidesChecked();
					} else if ($(
							"[name='immunohistochemistryReviewOfSlides'][value='0']")
							.is(":checked")) {
						$.immunohistochemistryReviewOfSlidesUnchecked();
					}

					// serumFreeLightChainAsssay
					$.serumFreeLightChainAsssayChecked = function() {
						$("#serumFreeLightChainAsssayResult").slideDown(200);
						$("[name='serumFreeLightChainAsssayResult']").prop(
								'required', true);
						$("#serumFreeLightChainAssayAttachScannedDocument")
								.slideDown(200);
						// $("[name='serumFreeLightChainAssayAttachScannedDocument']").prop('required',
						// true);
					}
					$.serumFreeLightChainAsssayUnchecked = function() {
						$("#serumFreeLightChainAsssayResult").slideUp(200);
						$("[name='serumFreeLightChainAsssayResult']").prop(
								'required', false);
						$("#serumFreeLightChainAssayAttachScannedDocument")
								.slideUp(200);
						$(
								"[name='serumFreeLightChainAssayAttachScannedDocument']")
								.prop('required', false);
					}
					$("[name='serumFreeLightChainAsssay']").click(function() {
						if ($(this).val() === "1") {
							$.serumFreeLightChainAsssayChecked();
						} else if ($(this).val() === "0") {
							$.serumFreeLightChainAsssayUnchecked();
						}
					});
					if ($("[name='serumFreeLightChainAsssay'][value='1']").is(
							":checked")) {
						$.serumFreeLightChainAsssayChecked();
					} else if ($(
							"[name='serumFreeLightChainAsssay'][value='0']")
							.is(":checked")) {
						$.serumFreeLightChainAsssayUnchecked();
					}

					// serumProteinElectrophoresis
					$.serumProteinElectrophoresisChecked = function() {
						$("#serumProteinElectrophoresisResult").slideDown(200);
						$("[name='serumProteinElectrophoresisResult']").prop(
								'required', true);
						$("#serumProteinElectrophoresisAttachScannedDocument")
								.slideDown(200);
						// $("[name='serumProteinElectrophoresisAttachScannedDocument']").prop('required',
						// true);
					}
					$.serumProteinElectrophoresisUnchecked = function() {
						$("#serumProteinElectrophoresisResult").slideUp(200);
						$("[name='serumProteinElectrophoresisResult']").prop(
								'required', false);
						$("#serumProteinElectrophoresisAttachScannedDocument")
								.slideUp(200);
						$(
								"[name='serumProteinElectrophoresisAttachScannedDocument']")
								.prop('required', false);
					}
					$("[name='serumProteinElectrophoresis']").click(function() {
						if ($(this).val() === "1") {
							$.serumProteinElectrophoresisChecked();
						} else if ($(this).val() === "0") {
							$.serumProteinElectrophoresisUnchecked();
						}
					});
					if ($("[name='serumProteinElectrophoresis'][value='1']")
							.is(":checked")) {
						$.serumProteinElectrophoresisChecked();
					} else if ($(
							"[name='serumProteinElectrophoresis'][value='0']")
							.is(":checked")) {
						$.serumProteinElectrophoresisUnchecked();
					}

					// serumImmunofixation
					$.serumImmunofixationChecked = function() {
						$("#serumImmunofixationResult").slideDown(200);
						$("[name='serumImmunofixationResult']").prop(
								'required', true);
						$("#serumImmunofixationAttachScannedDocument")
								.slideDown(200);
						// $("[name='serumImmunofixationAttachScannedDocument']").prop('required',
						// true);
					}
					$.serumImmunofixationUnchecked = function() {
						$("#serumImmunofixationResult").slideUp(200);
						$("[name='serumImmunofixationResult']").prop(
								'required', false);
						$("#serumImmunofixationAttachScannedDocument").slideUp(
								200);
						$("[name='serumImmunofixationAttachScannedDocument']")
								.prop('required', false);
					}
					$("[name='serumImmunofixation']").click(function() {
						if ($(this).val() === "1") {
							$.serumImmunofixationChecked();
						} else if ($(this).val() === "0") {
							$.serumImmunofixationUnchecked();
						}
					});
					if ($("[name='serumImmunofixation'][value='1']").is(
							":checked")) {
						$.serumImmunofixationChecked();
					} else if ($("[name='serumImmunofixation'][value='0']").is(
							":checked")) {
						$.serumImmunofixationUnchecked();
					}

					// urineProtein
					$.urineProteinChecked = function() {
						$("#urineProteinResult").slideDown(200);
						$("[name='urineProteinResult']").prop('required', true);
						$("#urineProteinAttachScannedDocument").slideDown(200);
						// $("[name='urineProteinAttachScannedDocument']").prop('required',
						// true);
					}
					$.urineProteinUnchecked = function() {
						$("#urineProteinResult").slideUp(200);
						$("[name='urineProteinResult']")
								.prop('required', false);
						$("#urineProteinAttachScannedDocument").slideUp(200);
						$("[name='urineProteinAttachScannedDocument']").prop(
								'required', false);
					}
					$("[name='urineProtein']").click(function() {
						if ($(this).val() === "1") {
							$.urineProteinChecked();
						} else if ($(this).val() === "0") {
							$.urineProteinUnchecked();
						}
					});
					if ($("[name='urineProtein'][value='1']").is(":checked")) {
						$.urineProteinChecked();
					} else if ($("[name='urineProtein'][value='0']").is(
							":checked")) {
						$.urineProteinUnchecked();
					}

					// upperGIEndoscopy & hPylori
					$.upperGIEndoscopyChecked = function() {
						$("#upperGIEndoscopyDatePerformed").slideDown(200);
						$("[name='upperGIEndoscopyDatePerformed']").prop(
								'required', true);
						$("#upperGIEndoscopyDescription").slideDown(200);
						$("[name='upperGIEndoscopyDescription']").prop(
								'required', true);
						$("#hPylori").slideDown(200);
					}
					$.upperGIEndoscopyUnchecked = function() {
						$("#upperGIEndoscopyDatePerformed").slideUp(200);
						$("[name='upperGIEndoscopyDatePerformed']").prop(
								'required', false);
						$("#upperGIEndoscopyDescription").slideUp(200);
						$("[name='upperGIEndoscopyDescription']").prop(
								'required', false);
						// $("[name='hPylori']").prop('checked', false);
						$("#hPylori").slideUp(200);
						$("#hPyloriAttachScannedDocument").slideUp(200);
						$("[name='hPyloriAttachScannedDocument']").prop(
								'required', false);
					}
					$.hPyloriChecked = function() {
						$("#hPyloriAttachScannedDocument").slideDown(200);
						// $("[name='hPyloriAttachScannedDocument']").prop('required',
						// true);
					}
					$.hPyloriUnchecked = function() {
						$("#hPyloriAttachScannedDocument").slideUp(200);
						$("[name='hPyloriAttachScannedDocument']").prop(
								'required', false);
					}

					$.hPyloriCheckedOverUpperGIEndoscopy = function() {
						if ($("[name='hPylori'][value='1']").is(":checked")) {
							$.hPyloriChecked();
						} else if ($("[name='hPylori'][value='0']").is(
								":checked")) {
							$.hPyloriUnchecked();
						}
					}

					$("[name='upperGIEndoscopy']").click(function() {
						if ($(this).val() === "1") {
							$.upperGIEndoscopyChecked();
							$.hPyloriCheckedOverUpperGIEndoscopy();
						} else if ($(this).val() === "0") {
							$.upperGIEndoscopyUnchecked();
						}
					});
					if ($("[name='upperGIEndoscopy'][value='1']")
							.is(":checked")) {
						$.upperGIEndoscopyChecked();
						$.hPyloriCheckedOverUpperGIEndoscopy();
					} else if ($("[name='upperGIEndoscopy'][value='0']").is(
							":checked")) {
						$.upperGIEndoscopyUnchecked();
					}

					$("[name='hPylori']").click(function() {
						if ($(this).val() === "1") {
							$.hPyloriChecked();
						} else if ($(this).val() === "0") {
							$.hPyloriUnchecked();
						}
					});

					$.hPyloriCheckedOverUpperGIEndoscopy();

					// THERAPY AND RESPONSE

					// bisphosphonates
					$.bisphosphonatesChecked = function() {
						$("#bisphosphonatesSpecify").slideDown(200);
						$("[name='bisphosphonatesSpecify']").prop('required',
								true);
					}
					$.bisphosphonatesUnchecked = function() {
						$("#bisphosphonatesSpecify").slideUp(200);
						$("[name='bisphosphonatesSpecify']").prop('required',
								false);
					}
					$("[name='bisphosphonates']").click(function() {
						if ($(this).val() === "1") {
							$.bisphosphonatesChecked();
						} else if ($(this).val() === "0") {
							$.bisphosphonatesUnchecked();
						}
					});
					if ($("[name='bisphosphonates'][value='1']").is(":checked")) {
						$.bisphosphonatesChecked();
					} else if ($("[name='bisphosphonates'][value='0']").is(
							":checked")) {
						$.bisphosphonatesUnchecked();
					}

					// radiotherapy
					$.radiotherapyChecked = function() {
						$("#radiotherapyDoseAndFrequency").slideDown(200);
						$("[name='radiotherapyDoseAndFrequency']").prop(
								'required', true);
					}
					$.radiotherapyUnchecked = function() {
						$("#radiotherapyDoseAndFrequency").slideUp(200);
						$("[name='radiotherapyDoseAndFrequency']").prop(
								'required', false);
					}
					$("[name='radiotherapy']").click(function() {
						if ($(this).val() === "1") {
							$.radiotherapyChecked();
						} else if ($(this).val() === "0") {
							$.radiotherapyUnchecked();
						}
					});
					if ($("[name='radiotherapy'][value='1']").is(":checked")) {
						$.radiotherapyChecked();
					} else if ($("[name='radiotherapy'][value='0']").is(
							":checked")) {
						$.radiotherapyUnchecked();
					}

					// dialysis
					$.dialysisChecked = function() {
						$("#otherMedications").slideDown(200);
						$("[name='otherMedications']").prop('required', true);
						$("#dateStarted").slideDown(200);
						$("[name='dateStarted']").prop('required', true);
						$("#complications").slideDown(200);
						$("[name='complications']").prop('required', true);
					}
					$.dialysisUnchecked = function() {
						$("#otherMedications").slideUp(200);
						$("[name='otherMedications']").prop('required', false);
						$("#dateStarted").slideUp(200);
						$("[name='dateStarted']").prop('required', false);
						$("#complications").slideUp(200);
						$("[name='complications']").prop('required', false);
					}
					$("[name='dialysis']").click(function() {
						if ($(this).val() === "1") {
							$.dialysisChecked();
						} else if ($(this).val() === "0") {
							$.dialysisUnchecked();
						}
					});
					if ($("[name='dialysis'][value='1']").is(":checked")) {
						$.dialysisChecked();
					} else if ($("[name='dialysis'][value='0']").is(":checked")) {
						$.dialysisUnchecked();
					}

					// diseaseStatus
					$.diseaseStatusOthers = function() {
						$("#diseaseStatusOthers").slideDown(200);
						$("[name='diseaseStatusOthers']")
								.prop('required', true);
						$("#relapseDisease").slideUp(100);
						$("[name='relapseDisease']").prop('required', false);
					}
					$.diseaseStatusRelapse = function() {
						$("#relapseDisease").slideDown(200);
						$("[name='relapseDisease']").prop('required', true);
						$("#diseaseStatusOthers").slideUp(100);
						$("[name='diseaseStatusOthers']").prop('required',
								false);
					}
					$.diseaseStatusNull = function() {
						$("#diseaseStatusOthers").slideUp(200);
						$("[name='diseaseStatusOthers']").prop('required',
								false);
						$("#relapseDisease").slideUp(200);
						$("[name='relapseDisease']").prop('required', false);
					}
					$("[name='diseaseStatus']").click(function() {
						if ($(this).val() === "Others") {
							$.diseaseStatusOthers();
						} else if ($(this).val() === "Relapse") {
							$.diseaseStatusRelapse();
						} else {
							$.diseaseStatusNull();
						}
					});
					if ($("[name='diseaseStatus']").val() === "Others") {
						$.diseaseStatusOthers();
					} else if ($("[name='diseaseStatus']").val() == "Relapse") {
						$.diseaseStatusRelapse();
					} else {
						$.diseaseStatusNull();
					}

					// qualityOfResponse
					$.qualityOfResponseOthers = function() {
						$("#diseaseStatusOthers").slideDown(200);
						$("[name='diseaseStatusOthers']")
								.prop('required', true);
					}
					$.qualityOfResponseNull = function() {
						$("#diseaseStatusOthers").slideUp(200);
						$("[name='diseaseStatusOthers']").prop('required',
								false);
					}
					$("[name='qualityOfResponse']").click(function() {
						if ($(this).val() === "Others") {
							$.qualityOfResponseOthers();
						} else {
							$.qualityOfResponseNull();
						}
					});
					if ($("[name='qualityOfResponse']").val() === "Others") {
						$.qualityOfResponseOthers();
					} else {
						$.qualityOfResponseNull();
					}

				});
