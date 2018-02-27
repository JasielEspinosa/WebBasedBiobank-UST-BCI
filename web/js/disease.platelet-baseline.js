var responseJson;

var params = {
	action : '',
	search : '',
	patientID : ''
};

var editState = false;

$("#PlateletBaseline").submit(function(e) {
	e.preventDefault();
});

$('document').ready(function() {

	actionBind();
	unbindEvents();
	$("#searchbox").on('input', function() {
		loadPatientList();
	});
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

// load patient list to search box
function loadPatientList() {
	params.action = '6';
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
	$("#baselineBtn").hide().click(function() {
	});
	$("#followUpBtn").hide().click(function() {
	});
	$("#patientStatistics").hide().click(function() {
	});
	$("#editPatientBtn").hide().click(function() {
	});
	$("#archPatientBtn").hide().click(function() {
	});
	$("#submitCancel").hide();
	$('#PlateletBaseline').unbind("onsubmit");
	// $('#PlateletBaseline').removeAttr('onsubmit');
	addBind();
};

function bindEvents() {
	$("#baselineBtn").show().click(function() {
	});
	$("#followUpBtn").show().click(function() {
	});
	$("#patientStatistics").show().click(function() {
	});
	$("#editPatientBtn").show().click(function() {
		// $('#PlateletBaseline').removeAttr('onsubmit');
		editBind();
		alert('edit triggered')
	});
	$("#archPatientBtn").show().click(function() {
		$.post('ArchivePatientServlet', $.param(params), function(response) {
			alert("Patient Archived")
		}).fail(function() {
		});
	});
};

// add bind

function actionBind() {
	$('#PlateletBaseline').submit(function() {
		var $form = $(this);
		if (editState == false) {
			$.post('AddPlateletBaselineServlet', $form.serialize(), function(response) {
				alert("Patient added")
			}).fail(function() {
			});
		} else {
			$.post('EditPlateletBaselineServlet', $form.serialize(), function(response) {
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

