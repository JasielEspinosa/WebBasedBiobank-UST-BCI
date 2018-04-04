var responseJson;

var params = {
	action : '',
	search : '',
	patientID : ''
};

var editState = false;
var upperActionState = false;

$("#PlateletBaseline").submit(function(e) {
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
			windows.location = ("plasmacell-followup.jsp").redirect();
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

	if (localStorage.getItem("fromFollowUp7") != "") {
		//alert(localStorage.getItem("id7"));
		loadPatientData(localStorage.getItem("id7"));
		localStorage.setItem("fromFollowUp7", "");
	}

});

// load patient data
function loadPatientData(id) {

	params.patientID = id;
	$.post('LoadPlateletBaselineServlet', $.param(params), function(response) {
		
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
		if (response["genericName"] !== "" || response["dose"] !== ""  || response["frequency"] !== "") {
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
/*		$("[name='treatmentSpecify']").val(response["treatmentSpecify"])

		if (response["treatment"] === "Others") {
			$.treatmentOthers();
		} else {
			$.treatmentNull();
		}*/

		$("[name='regimenProtocol']").val(response["regimenProtocol"])
		$("[name='dateStarted']").val(response["dateStarted"])
		$("[name='complications']").val(response["complications"])
		$("[name='diseaseStatus']").val(response["diseaseStatus"])

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
	localStorage.setItem("id7", params.patientID);
	$("#baselineBtn").show();
	$("#followUpBtn").show();
	$("#patientStatistics").show();
	$("#editPatientBtn").show();
	$("#archPatientBtn").show();
	upperActionState = true;
};

// add bind

function actionBind() {
	$('#PlateletBaseline').submit(function() {
		var $form = $(this);
		if (editState == false) {
			$.post('AddPlateletBaselineServlet', $form.serialize(), function(response) {
				alert("Patient added")
				cancelEdit();
			}).fail(function() {
			});
		} else {
			$.post('EditPlateletBaselineServlet', $form.serialize(), function(response) {
				alert("Patient edited")
				cancelEdit();
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