var responseJson;
var id;
var followupID;
var params = {
	action : '',
	search : '',
	patientID : '',
	followupID : ''
};

var editState = false;
var upperActionState = false;

$("#AAPNHMDSFollowUp").submit(function(e) {
	e.preventDefault();
});

$('document').ready(function() {
	alert(localStorage.getItem("id1"))
	params.patientID = localStorage.getItem("id1");
	$("#patientID").val(localStorage.getItem("id1"));

	actionBind();
	unbindEvents();

	$("#searchbox").on('input', function() {
		loadPatientList();
	});

	$("#baselineBtn").click(function() {
		localStorage.setItem("fromFollowUp1", "pass");
		windows.location = ("aapnhmds-baseline.jsp").redirect();

	});
	$("#followUpBtn").click(function() {
		loadFollowUpList();
		unbindEvents();
	});
	$("#patientStatistics").click(function() {
		if (upperActionState == true) {

		}
	});
	$("#editPatientBtn").click(function() {
		if (upperActionState == true) {
			editBind();
			alert('edit triggered')
		}
	});
	$("#archPatientBtn").click(function() {
		if (upperActionState == true) {
			$.post('DeleteFollowUpServlet', $.param(params), function(response) {
				alert("Patient followup deleted")
				unbindEvents();
			}).fail(function() {
			});
		}
	});

	loadFollowUpList();

});

// load patient data
function loadPatientData(id) {

	params.patientID = id;
	$.post('LoadAAPNHMDSBaselineServlet', $.param(params), function(response) {

		// in order from add servlet
		alert('Data Loaded')

		// general data
		$("[name='patientIDNumber']").val(response["patientIDNumber"])
		if ($("[name='patientIDNumber']").val() !== "") {
			$("[name='patientIDNumber']").prop('readonly', true);
		}

		$("[name='lastName']").val(response["lastName"])
		if ($("[name='lastName']").val() !== "") {
			$("[name='lastName']").prop('readonly', true);
		}

		$("[name='firstName']").val(response["firstName"])
		if ($("[name='firstName']").val() !== "") {
			$("[name='firstName']").prop('readonly', true);
		}

		$("[name='middleInitial']").val(response["middleInitial"])
		if ($("[name='middleInitial']").val() !== "") {
			$("[name='middleInitial']").prop('readonly', true);
		}

		if (response["gender"] === "1") {
			$("[name='gender'][value='1']").prop('checked', true);
		} else if (response["gender"] === "2") {
			$("[name='gender'][value='2']").prop('checked', true);
		}

		$("[name='dateOfBirth']").val(response["dateOfBirth"])
		$("[name='address']").val(response["address"])
		$("[name='dateOfEntry']").val(response["dateOfEntry"])

		$("[name='specimenType']").val(response["specimenType"])

		if ($("[name='specimenType']").val() !== "") {
			$("[name='tissueSpecimenCollected'][value='1']").prop('checked', true);
			$.tissueSpecimenCollectedChecked();
		} else {
			$("[name='tissueSpecimenCollected'][value='0']").prop('checked', true);
			$.tissueSpecimenCollectedUnchecked();
		}

		// clinical data

		$("[name='dateOfVisit']").val(response["dateOfVisit"])
		$("[name='diagnosis']").val(response["diagnosis"])
		$("[name='severity']").val(response["severity"])
		$("[name='chiefComplaint']").val(response["chiefComplaint"])
		$("[name='otherSymptoms']").val(response["otherSymptoms"])

		$("[name='relationshipToPatient']").val(response["relationshipToPatient"])
		$("[name='specifyCancer']").val(response["specifyCancer"])
		$("[name='otherDiseasesInTheFamily']").val(response["otherDiseasesInTheFamily"])

		if (response["relationshipToPatient"] !== "" || response["specifyCancer"] !== "" || response["otherDiseasesInTheFamily"] !== "") {
			$("[name='familyHistoryOfCancer'][value='1']").prop('checked', true);
			$.familyHistoryOfCancerChecked();
		} else {
			$("[name='familyHistoryOfCancer'][value='0']").prop('checked', true);
			$.familyHistoryOfCancerUnchecked();
		}

		$("[name='comorbidities']").val(response["comorbidities"])

		$("[name='genericName']").val(response["genericName"])
		$("[name='dose']").val(response["dose"])
		$("[name='frequency']").val(response["frequency"])
		if (response["genericName"] !== "" || response["dose"] !== "" || response["frequency"] !== "") {
			$("[name='concomitantMedications'][value='1']").prop('checked', true);
			$.concomitantMedicationsChecked();
		} else {
			$("[name='concomitantMedications'][value='0']").prop('checked', true);
			$.concomitantMedicationsUnchecked();
		}

		$("[name='smokingHistorySpecify']").val(response["smokingHistorySpecify"])
		if (response["smokingHistorySpecify"] !== "") {
			$("[name='smokingHistory'][value='1']").prop('checked', true);
			$.smokingHistoryChecked();
		} else {
			$("[name='smokingHistory'][value='0']").prop('checked', true);
			$.smokingHistoryUnchecked();
		}

		$("[name='alcoholIntakeSpecify']").val(response["alcoholIntakeSpecify"])
		if (response["alcoholIntakeSpecify"] !== "") {
			$("[name='alcoholIntakeHistory'][value='1']").prop('checked', true);
			$.alcoholIntakeHistoryChecked();
		} else {
			$("[name='alcoholIntakeHistory'][value='0']").prop('checked', true);
			$.alcoholIntakeHistoryUnchecked();
		}

		$("[name='chemicalExposureSpecify']").val(response["chemicalExposureSpecify"])
		if (response["chemicalExposureSpecify"] !== "") {
			$("[name='chemicalExposureHistory'][value='1']").prop('checked', true);
			$.chemicalExposureHistoryChecked();
		} else {
			$("[name='chemicalExposureHistory'][value='0']").prop('checked', true);
			$.chemicalExposureHistoryUnchecked();
		}

		$("[name='previousInfectionSpecify']").val(response["previousInfectionSpecify"])
		if (response["previousInfectionSpecify"] !== "") {
			$("[name='previousInfection'][value='1']").prop('checked', true);
			$.previousInfectionChecked();
		} else {
			$("[name='previousInfection'][value='0']").prop('checked', true);
			$.previousInfectionUnchecked();
		}

		$("[name='previousHematologicDisorderSpecify']").val(response["previousHematologicDisorderSpecify"])
		if (response["previousHematologicDisorderSpecify"] !== "") {
			$("[name='previousHematologicDisorder'][value='1']").prop('checked', true);
			$.previousHematologicDisorderChecked();
		} else {
			$("[name='previousHematologicDisorder'][value='0']").prop('checked', true);
			$.previousHematologicDisorderUnchecked();
		}

		$("[name='height']").val(response["height"])
		$("[name='weight']").val(response["weight"])
		$("[name='ecog']").val(response["ecog"])
		$("[name='otherFindings']").val(response["otherFindings"])

		$("[name='dateOfBloodCollection']").val(response["dateOfBloodCollection"])

		$("[name='hemoglobin']").val(response["hemoglobin"])
		$("[name='hematocrit']").val(response["hematocrit"])
		$("[name='whiteBloodCells']").val(response["whiteBloodCells"])
		$("[name='neutrophils']").val(response["neutrophils"])
		$("[name='lymphocytes']").val(response["lymphocytes"])
		$("[name='monocytes']").val(response["monocytes"])
		$("[name='eosinophils']").val(response["eosinophils"])
		$("[name='basophils']").val(response["basophils"])
		$("[name='myelocytes']").val(response["myelocytes"])
		$("[name='metamyelocytes']").val(response["metamyelocytes"])
		$("[name='blasts']").val(response["blasts"])
		$("[name='plateletCount']").val(response["plateletCount"])

		$("[name='creatinine']").val(response["creatinine"])
		$("[name='uricAcid']").val(response["uricAcid"])
		$("[name='reticulocyteCount']").val(response["reticulocyteCount"])
		$("[name='serumIron']").val(response["serumIron"])
		$("[name='ironBindingCapacity']").val(response["ironBindingCapacity"])
		$("[name='serumFerritin']").val(response["serumFerritin"])
		$("[name='directAntiglobulin']").val(response["directAntiglobulin"])
		$("[name='indirectAntiglobulin']").val(response["indirectAntiglobulin"])
		$("[name='sgot']").val(response["sgot"])
		$("[name='sgpt']").val(response["sgpt"])
		$("[name='ldh']").val(response["ldh"])
		$("[name='screeningTestsForHepatitisVirusesABC']").val(response["screeningTestsForHepatitisVirusesABC"])
		$("[name='screeningTestsForEBVCMVHIV']").val(response["screeningTestsForEBVCMVHIV"])
		$("[name='erythropoeitinLevel']").val(response["erythropoeitinLevel"])
		$("[name='serumFolicAcid']").val(response["serumFolicAcid"])
		$("[name='serumB12']").val(response["serumB12"])
		$("[name='tsh']").val(response["tsh"])

		$("[name='boneMarrowAspirateDatePerformed']").val(response["boneMarrowAspirateDatePerformed"])
		$("[name='boneMarrowAspirateDescription']").val(response["boneMarrowAspirateDescription"])

		if (response["boneMarrowAspirateDatePerformed"] !== "" || response["boneMarrowAspirateDescription"] !== "") {
			$("[name='boneMarrowAspirate'][value='1']").prop('checked', true);
			$.boneMarrowAspirateChecked();
		} else {
			$("[name='boneMarrowAspirate'][value='0']").prop('checked', true);
			$.boneMarrowAspirateUnchecked();
		}

		$("[name='flowCytometryResult']").val(response["flowCytometryResult"])
		if (response["flowCytometryResult"] !== "") {
			$("[name='flowCytometry'][value='1']").prop('checked', true);
			$.flowCytometryChecked();
		} else {
			$("[name='flowCytometry'][value='0']").prop('checked', true);
			$.flowCytometryUnchecked();
		}

		$("[name='cytogeneticAndMolecularAnalysisAAPNHResult']").val(response["cytogeneticAndMolecularAnalysisAAPNHResult"])
		if (response["cytogeneticAndMolecularAnalysisAAPNHResult"] !== "") {
			$("[name='cytogeneticAndMolecularAnalysisAAPNH'][value='1']").prop('checked', true);
			$.cytogeneticAndMolecularAnalysisAAPNHChecked();
		} else {
			$("[name='cytogeneticAndMolecularAnalysisAAPNH'][value='0']").prop('checked', true);
			$.cytogeneticAndMolecularAnalysisAAPNHUnchecked();
		}

		$("[name='cytogeneticAndMolecularAnalysisMDSResult']").val(response["cytogeneticAndMolecularAnalysisMDSResult"])
		if (response["cytogeneticAndMolecularAnalysisMDSResult"] !== "") {
			$("[name='cytogeneticAndMolecularAnalysisMDS'][value='1']").prop('checked', true);
			$.cytogeneticAndMolecularAnalysisMDSChecked();
		} else {
			$("[name='cytogeneticAndMolecularAnalysisMDS'][value='0']").prop('checked', true);
			$.cytogeneticAndMolecularAnalysisMDSUnchecked();
		}

		$("[name='transplantCandidate'][value=" + response["transplantCandidate"] + "]").prop('checked', true);

		if (response["transplantCandidate"] === "True") {
			$("[name='transplantCandidate'][value='1']").prop('checked', true);
		} else if (response["transplantCandidate"] === "False") {
			$("[name='transplantCandidate'][value='2']").prop('checked', true);
		}

		$("[name='modeOfTreatment']").val(response["modeOfTreatment"])

		$("[name='medications']").val(response["medications"])

		$("[name='dateStarted']").val(response["dateStarted"])

		bindEvents();

	})
};

// load followup data
function loadFollowUpData(followupID) {

	params.followupID = followupID;
	$("#followupID").val(followupID);

	$.post('LoadAAPNHMDSFollowUpServlet', $.param(params), function(response) {
		// in order from followup servlet
		// followup data
		alert('data loaded')
		$("[name='dateOfEntry']").val(response["dateOfEntry"])
		$("[name='dateOfVisit']").val(response["dateOfVisit"])
		$("[name='specialNotes']").val(response["notes"])

		// medical events

		$("[name='specifyOtherDiseaseMedication']").val(response["specifyOtherDiseaseMedication"])

		if (response["specifyHematologicMalignancy"] !== "") {
			$("[name='hematologicMalignancy'][value='1']").prop('checked', true);
			$.hematologicMalignancyChecked();
		} else {
			$("[name='hematologicMalignancy'][value='0']").prop('checked', true);
			$.hematologicMalignancyUnchecked();
		}

		$("[name='specifyOtherDiseaseMedication']").val(response["otherDiseaseMedication"])
		$("[name='specifyProcedureIntervention']").val(response["procedureIntervention"])
		$("[name='specifyChemotherapyComplication']").val(response["chemotherapyComplication"])

		// physical exam
		$("[name='weight']").val(response["weight"])
		$("[name='ecog']").val(response["ecog"])

		// clinical data
		$("[name='currentSymptoms']").val(response["currentSymptoms"])

		// laboratory profile
		$("[name='dateOfBloodCollection']").val(response["dateOfBloodCollection"])

		// hematology

		$("[name='hemoglobin']").val(response["hemoglobin"])
		$("[name='hematocrit']").val(response["hematocrit"])
		$("[name='whiteBloodCells']").val(response["whiteBloodCells"])
		$("[name='neutrophils']").val(response["neutrophils"])
		$("[name='lymphocytes']").val(response["lymphocytes"])
		$("[name='monocytes']").val(response["monocytes"])
		$("[name='eosinophils']").val(response["eosinophils"])
		$("[name='basophils']").val(response["basophils"])
		$("[name='myelocytes']").val(response["myelocytes"])
		$("[name='metamyelocytes']").val(response["metamyelocytes"])
		$("[name='blasts']").val(response["blasts"])
		$("[name='plateletCount']").val(response["plateletCount"])

		// other laboratories
		$("[name='creatinine']").val(response["creatinine"])
		$("[name='reticulocyteCount']").val(response["reticulocyteCount"])
		$("[name='serumFerritin']").val(response["serumFerritin"])
		$("[name='ldh']").val(response["ldh"])

		// bone marrow
		$("[name='boneMarrowAspirateDatePerformed']").val(response["boneMarrowAspirateDatePerformed"])
		$("[name='boneMarrowAspirateDescription']").val(response["boneMarrowAspirateDescription"])

		if (response["boneMarrowAspirateDatePerformed"] !== "" || response["boneMarrowAspirateDescription"] !== "") {
			$("[name='boneMarrowAspirate'][value='1']").prop('checked', true);
			$.boneMarrowAspirateChecked();
		} else {
			$("[name='boneMarrowAspirate'][value='0']").prop('checked', true);
			$.boneMarrowAspirateUnchecked();
		}

		// flow cytometry
		$("[name='flowCytometryResult']").val(response["flowCytometryResult"])
		if (response["flowCytometryResult"] !== "") {
			$("[name='flowCytometry'][value='1']").prop('checked', true);
			$.flowCytometryChecked();
		} else {
			$("[name='flowCytometry'][value='0']").prop('checked', true);
			$.flowCytometryUnchecked();
		}

		// cytogenic
		$("[name='cytogeneticAndMolecularAnalysisResult']").val(response["cytogeneticAndMolecularAnalysisResult"])

		if (response["cytogeneticAndMolecularAnalysisResult"] !== "") {
			$("[name='cytogeneticAndMolecularAnalysis'][value='1']").prop('checked', true);
			$.cytogeneticAndMolecularAnalysisChecked();
		} else {
			$("[name='cytogeneticAndMolecularAnalysis'][value='0']").prop('checked', true);
			$.cytogeneticAndMolecularAnalysisUnchecked();
		}

		// disease status
		$("[name='diseaseStatus']").val(response["diseaseStatus"])
		$("[name='diseaseStatusOthers']").val(response["diseaseStatusOthers"])

		if (response["diseaseStatus"] === "Others") {
			$.diseaseStatusOthers();
		} else {
			$.diseaseStatusNull();
		}

		bindEvents();

	})
};

// load patient list to search box
function loadPatientList() {
	params.action = '1';
	params.search = $("#searchbox").val();
	$('#searchboxfill').empty();
	$.post(
			'LoadPatientsServlet',
			$.param(params),
			function(responseJson) {
				$.each(responseJson, function(index, patient) {
					$('#searchboxfill').append(
							"<p value='" + patient.patientID + "' onClick=\"loadPatientData(" + patient.patientID + ")\"" + ">"
									+ patient.firstName + " " + patient.middleName + " " + patient.lastName + "</p>")
				});

			}).fail(function() {
	});

};

// load followup list
function loadFollowUpList() {
	$('#visitFill').empty();
	$.post(
			'LoadVisitsServlet',
			$.param(params),
			function(responseJson) {
				$.each(responseJson, function(index, patient) {
					$('#visitFill').append(
							"<p value='" + patient.followupID + "' onClick=\"loadFollowUpData(" + patient.followupID + ")\"" + ">"
									+ patient.dateOfVisit + "</p>")
				});

			}).fail(function() {
	});

};

// bind functions

// remove button function
function unbindEvents() {
	$("#editPatientBtn").hide();
	$("#archPatientBtn").hide();
	$("#submitCancel").hide();
	upperActionState = false;
	addBind();
};

function bindEvents() {
	localStorage.setItem("id1", params.patientID);
	$("#editPatientBtn").show();
	$("#archPatientBtn").show();
	upperActionState = true;
};

// add bind

function actionBind() {
	$('#AAPNHMDSFollowUp').submit(function() {
		alert($("#patientID").val());
		var $form = $(this);
		if (editState == false) {
			$.post('AddAAPNHMDSFollowUpServlet', $form.serialize(), function(response) {
				alert("Patient added")
			}).fail(function() {
			});
		} else {
			$.post('EditAAPNHMDSFollowUpServlet', $form.serialize(), function(response) {
				alert("Patient edited")
			}).fail(function() {
			});
		}
	});
};

function addBind() {
	editState = false;
};

// edit bind
function editBind() {
	$("#submitCancel").show();
	editState = true;
};

function cancelEdit() {
	// make fields uneditable (incomplete)
	addBind();
	$("#submitCancel").hide();
};

