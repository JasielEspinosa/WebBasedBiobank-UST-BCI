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

$("#PlateletFollowUp").submit(function(e) {
	e.preventDefault();
});

$('document').ready(function() {
	alert(localStorage.getItem("id7"))
	params.patientID = localStorage.getItem("id7");
	$("#patientID").val(localStorage.getItem("id7"));

	actionBind();
	unbindEvents();

	$("#searchbox").on('input', function() {
		loadPatientList();
	});

	$("#baselineBtn").click(function() {
		localStorage.setItem("fromFollowUp7", "pass");
		windows.location = ("plateletdisorder-baseline.jsp").redirect();

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
	$.post('LoadPlateletBaselineServlet', $.param(params), function(response) {

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

		// clinical data

		$("[name='dateOfVisit']").val(response["dateOfVisit"])

		$("[name='diagnosis']").val(response["diagnosis"])
		$("[name='diagnosisOthers']").val(response["diagnosisOthers"])

		if (response["diagnosis"] === "Others") {
			$.diagnosisOthers();
		} else {
			$.diagnosisNull();
		}

		$("[name='chiefComplaint']").val(response["chiefComplaint"])
		$("[name='constitutionalSymptoms']").val(response["constitutionalSymptoms"])
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

		$("[name='height']").val(response["height"])
		$("[name='weight']").val(response["weight"])

		if (response["presenceOfSplenomegaly"] === "1") {
			$("[name='presenceOfSplenomegaly'][value='1']").prop('checked', true);
		} else if (response["presenceOfSplenomegaly"] === "2") {
			$("[name='presenceOfSplenomegaly'][value='2']").prop('checked', true);
		}

		$("[name='skin']").val(response["skin"])
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
		$("[name='plateletCount']").val(response["plateletCount"])

		$("[name='creatinine']").val(response["creatinine"])
		$("[name='uricAcid']").val(response["uricAcid"])
		$("[name='na']").val(response["na"])
		$("[name='k']").val(response["k"])
		$("[name='sgot']").val(response["sgot"])
		$("[name='sgpt']").val(response["sgpt"])
		$("[name='ldh']").val(response["ldh"])
		$("[name='anaTiter']").val(response["anaTiter"])
		$("[name='hepatitisCRNA']").val(response["hepatitisCRNA"])

		$("[name='imagingStudiesResult']").val(response["imagingStudiesResult"])
		if (response["imagingStudiesResult"] !== "") {
			$("[name='imagingStudies'][value='1']").prop('checked', true);
			$.imagingStudiesChecked();
		} else {
			$("[name='imagingStudies'][value='0']").prop('checked', true);
			$.imagingStudiesUnchecked();
		}

		$("[name='boneMarrowAspirateDatePerformed']").val(response["boneMarrowAspirateDatePerformed"])
		$("[name='boneMarrowAspirateDescription']").val(response["boneMarrowAspirateDescription"])

		if (response["boneMarrowAspirateDatePerformed"] !== "" || response["boneMarrowAspirateDescription"] !== "") {
			$("[name='boneMarrowAspirate'][value='1']").prop('checked', true);
			$.boneMarrowAspirateChecked();
		} else {
			$("[name='boneMarrowAspirate'][value='0']").prop('checked', true);
			$.boneMarrowAspirateUnchecked();
		}

		$("[name='upperGIEndoscopyDatePerformed']").val(response["upperGIEndoscopyDatePerformed"])
		$("[name='upperGIEndoscopyDescription']").val(response["upperGIEndoscopyDescription"])

		if (response["upperGIEndoscopyDatePerformed"] !== "" || response["upperGIEndoscopyDescription"] !== "") {
			$("[name='upperGIEndoscopy'][value='1']").prop('checked', true);
			$.upperGIEndoscopyChecked();
		} else {
			$("[name='upperGIEndoscopy'][value='0']").prop('checked', true);
			$.upperGIEndoscopyUnchecked();
		}

		if (response["hPylori"] === "1") {
			$("[name='hPylori'][value='1']").prop('checked', true);
			$.hPyloriChecked();
		} else if (response["hPylori"] === "0") {
			$("[name='hPylori'][value='0']").prop('checked', true);
			$.hPyloriUnchecked();
		}

		$("[name='formOfITP']").val(response["formOfITP"])

		$("[name='treatment']").val(response["treatment"])
		$("[name='treatmentSpecify']").val(response["treatmentSpecify"])

		if (response["treatment"] === "Others") {
			$.treatmentOthers();
		} else {
			$.treatmentNull();
		}

		$("[name='regimenProtocol']").val(response["regimenProtocol"])
		$("[name='dateStarted']").val(response["dateStarted"])
		$("[name='complications']").val(response["complications"])
		$("[name='phaseOfTheDisease']").val(response["phaseOfTheDisease"])

		bindEvents();

	})
};

// load followup data
function loadFollowUpData(followupID) {

	params.followupID = followupID;
	$("#followupID").val(followupID);

	$.post('LoadPlateletFollowUpServlet', $.param(params), function(response) {
		// in order from followup servlet
		// followup data
		alert('data loaded')
		$("[name='dateOfEntry']").val(response["dateOfEntry"])
		$("[name='dateOfVisit']").val(response["dateOfVisit"])
		$("[name='specialNotes']").val(response["notes"])

		// medical events
		$("[name='specifyOtherDiseaseMedication']").val(response["specifyOtherDiseaseMedication"])
		if (response["specifyOtherDiseaseMedication"] !== "") {
			$("[name='otherDiseaseMedication'][value='1']").prop('checked', true);
			$.otherDiseaseMedicationChecked();
		} else {
			$("[name='hematologicMalignancy'][value='0']").prop('checked', true);
			$.otherDiseaseMedicationUnchecked();
		}

		$("[name='specifyProcedure']").val(response["specifyProcedure"])
		if (response["specifyProcedure"] !== "") {
			$("[name='procedure'][value='1']").prop('checked', true);
			$.procedureChecked();
		} else {
			$("[name='procedure'][value='0']").prop('checked', true);
			$.procedureUnchecked();
		}

		$("[name='specifyChemotherapy']").val(response["specifyChemotherapy"])
		if (response["specifyChemotherapy"] !== "") {
			$("[name='chemotherapy'][value='1']").prop('checked', true);
			$.chemotherapyChecked();
		} else {
			$("[name='chemotherapy'][value='0']").prop('checked', true);
			$.chemotherapyUnchecked();
		}
		// physical exam
		$("[name='weight']").val(response["weight"])
		$("[name='ecog']").val(response["ecog"])

		$("[name='pertinentFindings'][value=" + response["pertinentFindings"] + "]").prop('checked', true);

		if (response["pertinentFindings"] === "1") {
			$("[name='pertinentFindings'][value='1']").prop('checked', true);
		} else if (response["pertinentFindings"] === "0") {
			$("[name='pertinentFindings'][value='0']").prop('checked', true);
		}

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

		// imaging studies
		$("[name='imagingStudiesResult']").val(response["imagingStudiesResult"])
		if (response["imagingStudiesResult"] !== "") {
			$("[name='imagingStudies'][value='1']").prop('checked', true);
			$.imagingStudiesChecked();
		} else {
			$("[name='imagingStudies'][value='0']").prop('checked', true);
			$.imagingStudiesUnchecked();
		}

		// disease status
		$("[name='qualityOfResponse']").val(response["qualityOfResponse"])
		$("[name='diseaseStatusOthers']").val(response["diseaseStatusOthers"])

		if (response["qualityOfResponse"] === "Others") {
			$.diseaseStatusOthers();
		} else {
			$.diseaseStatusNull();
		}

		bindEvents();

	})
};

// load patient list to search box
function loadPatientList() {
	params.action = '7';
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
	localStorage.setItem("id7", params.patientID);
	$("#editPatientBtn").show();
	$("#archPatientBtn").show();
	upperActionState = true;
};

// add bind

function actionBind() {
	$('#PlateletFollowUp').submit(function() {
		alert($("#patientID").val());
		var $form = $(this);
		if (editState == false) {
			$.post('AddPlateletFollowUpServlet', $form.serialize(), function(response) {
				alert("Patient added")
			}).fail(function() {
			});
		} else {
			$.post('EditPlateletFollowUpServlet', $form.serialize(), function(response) {
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

