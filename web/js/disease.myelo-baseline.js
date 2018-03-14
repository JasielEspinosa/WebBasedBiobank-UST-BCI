var responseJson;

var params = {
	action : '',
	search : '',
	patientID : ''
};

var editState = false;
var upperActionState = false;

$("#MyeloBaseline").submit(function(e) {
	e.preventDefault();
});

$('document').ready(function() {

	actionBind();
	unbindEvents();
	$("#searchbox").on('input', function() {
		loadPatientList();
	});

	$("#baselineBtn").click(function() {
		if (upperActionState == true) {
			loadPatientData(params.patientID);
		}
	});
	$("#followUpBtn").click(function() {
		if (upperActionState == true) {
			windows.location = ("myelo-followup.jsp").redirect();
		}
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
			$.post('ArchivePatientServlet', $.param(params), function(response) {
				alert("Patient Archived")
			}).fail(function() {
			});
		}
	});

	if (localStorage.getItem("fromFollowUp5") != "") {
		alert(localStorage.getItem("id5"));
		loadPatientData(localStorage.getItem("id5"));
		localStorage.setItem("fromFollowUp5", "");
	}

});

// load patient data
function loadPatientData(id) {

	params.patientID = id;
	$.post('LoadMyeloBaselineServlet', $.param(params), function(response) {
		
		$.loadUneditableFields();
		$("#submitQuery").hide();
		
		// barcode
		setBarcode(response["patientIDNumber"])

		// in order from add servlet
		alert('Data Loaded')

		// general data
		$("[name='patientIDNumberDisplay']").val(response["patientIDNumber"])
		$("[name='patientIDNumber']").val(response["patientIDNumber"])
		if ($("[name='patientIDNumber']").val() !== "") {
			$("[name='patientIDNumberDisplay']").prop('readonly', true);
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

		$("[name='dateOfInitialDiagnosis']").val(response["dateOfInitialDiagnosis"])

		$("[name='diagnosis']").val(response["diagnosis"])
		$("[name='diagnosisOthers']").val(response["diagnosisOthers"])

		if (response["diagnosis"] === "Others") {
			$.diagnosisOthers();
		} else {
			$.diagnosisNull();
		}

		$("[name='prognosticRiskScoring']").val(response["prognosticRiskScoring"])
		$("[name='prognosticRiskScoringOthers']").val(response["prognosticRiskScoringOthers"])

		if (response["prognosticRiskScoring"] === "Others") {
			$.prognosticRiskScoringOthers();
		} else {
			$.prognosticRiskScoringNull();
		}

		$("[name='riskScore']").val(response["riskScore"])
		$("[name='riskScoreOthers']").val(response["riskScoreOthers"])

		if (response["riskScore"] === "Others") {
			$.riskScoreOthers();
		} else {
			$.riskScoreNull();
		}

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
		$("[name='thrombosisHistorySpecify']").val(response["thrombosisHistorySpecify"])
		if (response["thrombosisHistorySpecify"] !== "") {
			$("[name='thrombosisHistory'][value='1']").prop('checked', true);
			$.thrombosisHistoryChecked();
		} else {
			$("[name='thrombosisHistory'][value='0']").prop('checked', true);
			$.thrombosisHistoryUnchecked();
		}

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

		$("[name='height']").val(response["height"])
		$("[name='weight']").val(response["weight"])
		$("[name='ecog']").val(response["ecog"])

		if (response["presenceOfSplenomegaly"] === "1") {
			$("[name='presenceOfSplenomegaly'][value='1']").prop('checked', true);
			$.chemicalExposureHistoryChecked();
		} else if (response["presenceOfSplenomegaly"] === "0") {
			$("[name='presenceOfSplenomegaly'][value='0']").prop('checked', true);
			$.chemicalExposureHistoryUnchecked();
		}

		if (response["presenceOfHepatomegaly"] === "1") {
			$("[name='presenceOfHepatomegaly'][value='1']").prop('checked', true);
			$.chemicalExposureHistoryChecked();
		} else if (response["presenceOfHepatomegaly"] === "0") {
			$("[name='presenceOfHepatomegaly'][value='0']").prop('checked', true);
			$.chemicalExposureHistoryUnchecked();
		}

		if (response["presenceOfLymphadenopathies"] === "1") {
			$("[name='presenceOfLymphadenopathies'][value='1']").prop('checked', true);
			$.chemicalExposureHistoryChecked();
		} else if (response["presenceOfLymphadenopathies"] === "0") {
			$("[name='presenceOfLymphadenopathies'][value='0']").prop('checked', true);
			$.chemicalExposureHistoryUnchecked();
		}

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
		$("[name='sgot']").val(response["sgot"])
		$("[name='sgpt']").val(response["sgpt"])
		$("[name='ldh']").val(response["ldh"])
		$("[name='epoLevel']").val(response["epoLevel"])

		$("[name='boneMarrowAspirateDatePerformed']").val(response["boneMarrowAspirateDatePerformed"])
		$("[name='boneMarrowAspirateDescription']").val(response["boneMarrowAspirateDescription"])

		if (response["boneMarrowAspirateDatePerformed"] !== "" || response["boneMarrowAspirateDescription"] !== "") {
			$("[name='boneMarrowAspirate'][value='1']").prop('checked', true);
			$.boneMarrowAspirateChecked();
		} else {
			$("[name='boneMarrowAspirate'][value='0']").prop('checked', true);
			$.boneMarrowAspirateUnchecked();
		}

		$("[name='molecularAnalysisResult']").val(response["molecularAnalysisResult"])

		if (response["molecularAnalysisResult"] !== "") {
			$("[name='molecularAnalysis'][value='1']").prop('checked', true);
			$.molecularAnalysisChecked();
		} else {
			$("[name='molecularAnalysis'][value='0']").prop('checked', true);
			$.molecularAnalysisUnchecked();
		}

		$("[name='treatment']").val(response["treatment"])
		$("[name='medications']").val(response["medications"])
		$("[name='dateStarted']").val(response["dateStarted"])

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
	params.action = '5';
	params.search = $("#searchbox").val();
	$('#searchboxfill').empty();
	$.post(
			'LoadPatientsServlet',
			$.param(params),
			function(responseJson) {
				$.each(responseJson, function(index, patient) {
					$('#searchboxfill').append(
							"<p value='" + patient.patientID + "' onClick=\"loadPatientData(" + patient.patientID + ")\"" + ">"
									+ patient.lastName + ", " + patient.firstName + " " + patient.middleName + "</p>")
				});
			}).fail(function() {
	});
};

// bind functions

// remove button function
function unbindEvents() {
	$("#baselineBtn").hide();
	$("#followUpBtn").hide();
	$("#patientStatistics").hide();
	$("#editPatientBtn").hide();
	$("#archPatientBtn").hide();
	$("#submitCancel").hide();
	upperActionState = false;
	addBind();
};

function bindEvents() {
	localStorage.setItem("id5", params.patientID);
	$("#baselineBtn").show();
	$("#followUpBtn").show();
	$("#patientStatistics").show();
	$("#editPatientBtn").show();
	$("#archPatientBtn").show();
	upperActionState = true;
};

// add bind

function actionBind() {
	$('#MyeloBaseline').submit(function() {
		var $form = $(this);
		if (editState == false) {
			$.post('AddMyeloBaselineServlet', $form.serialize(), function(response) {
				alert("Patient added")
			}).fail(function() {
			});
		} else {
			$.post('EditMyeloBaselineServlet', $form.serialize(), function(response) {
				alert("Patient edited")
			}).fail(function() {
			});
		}
	});
};

function addBind() {
	editState = false;
};

function editBind() {
	$.loadEditableFields();
	$("#submitQuery").show();
	$("#submitCancel").show();
	editState = true;
};

function cancelEdit() {
	addBind();
	$.loadUneditableFields();
	$("#submitQuery").hide();
	$("#submitCancel").hide();
};
