var responseJson;

var params = {
	action : '',
	search : '',
	patientID : ''
};

var editState = false;
var upperActionState = false;

function setThreeNumberDecimal(num) {
	num.value = parseFloat(num.value).toFixed(3);
};

$("#LymphomaBaseline").submit(function(e) {
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
			localStorage.setItem("gender", checkGenderVal());
			windows.location = ("lymphoma-followup.jsp").redirect();
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

	if (localStorage.getItem("fromFollowUp4") != "") {
		// alert(localStorage.getItem("id4"));
		loadPatientData(localStorage.getItem("id4"));
		localStorage.setItem("fromFollowUp4", "");
	}

});

// load patient data
function loadPatientData(id) {

	params.patientID = id;
	$.post('LoadLymphomaBaselineServlet', $.param(params), function(response) {

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
		
		$("#age").val(_calculateAge($("[name='dateOfBirth']").val()));
		
		$("[name='civilStatus']").val(response["civilStatus"])
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
		$("[name='stageOfDisease']").val(response["stageOfDisease"])
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
		$("[name='na']").val(response["na"])
		$("[name='k']").val(response["k"])
		$("[name='total']").val(response["total"])
		$("[name='direct']").val(response["direct"])
		$("[name='indirect']").val(response["indirect"])
		$("[name='sgot']").val(response["sgot"])
		$("[name='sgpt']").val(response["sgpt"])
		$("[name='beta2Microglobulin']").val(response["beta2Microglobulin"])
		$("[name='hepatitisBTesting']").val(response["hepatitisBTesting"])
		$("[name='ldh']").val(response["ldh"])
		$("[name='esr']").val(response["esr"])

		$("[name='hematopathologyDatePerformed']").val(response["hematopathologyDatePerformed"])
		$("[name='hematopathologyDescription']").val(response["hematopathologyDescription"])
		if (response["hematopathologyDatePerformed"] !== "" || response["hematopathologyDescription"] !== "") {
			$("[name='hematopathologyReviewOfSlides'][value='1']").prop('checked', true);
			$.hematopathologyReviewOfSlidesChecked();
		} else {
			$("[name='hematopathologyReviewOfSlides'][value='0']").prop('checked', true);
			$.hematopathologyReviewOfSlidesUnchecked();
		}

		$("[name='immunohistochemistryDatePerformed']").val(response["immunohistochemistryDatePerformed"])
		$("[name='immunohistochemistryDescription']").val(response["immunohistochemistryDescription"])
		if (response["immunohistochemistryDatePerformed"] !== "" || response["immunohistochemistryDescription"] !== "") {
			$("[name='immunohistochemistryReviewOfSlides'][value='1']").prop('checked', true);
			$.immunohistochemistryReviewOfSlidesChecked();
		} else {
			$("[name='immunohistochemistryReviewOfSlides'][value='0']").prop('checked', true);
			$.immunohistochemistryReviewOfSlidesUnchecked();
		}

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

		$("[name='flowCytometryResult']").val(response["flowCytometryResult"])
		if (response["flowCytometryResult"] !== "") {
			$("[name='flowCytometry'][value='1']").prop('checked', true);
			$.flowCytometryChecked();
		} else {
			$("[name='flowCytometry'][value='0']").prop('checked', true);
			$.flowCytometryUnchecked();
		}

		$("[name='treatment']").val(response["treatment"])
		$("[name='regimenProtocol']").val(response["regimenProtocol"])
		$("[name='chemotherapyMedications']").val(response["chemotherapyMedications"])
		$("[name='cycleNumber']").val(response["cycleNumber"])
		$("[name='dateStarted']").val(response["dateStarted"])
		$("[name='complications']").val(response["complications"])
		$("[name='diseaseStatus']").val(response["diseaseStatus"])

		bindEvents();
		
		localStorage.setItem("gender", "");
		genderCheck()
		
		whiteBloodCellsFunc()
		neutrophilsFunc()
		lymphocytesFunc()
		monocytesFunc()
		eosinophilsFunc()
		basophilsFunc()
		myelocytesFunc()
		metamyelocytesFunc()
		blastsFunc()
		plateletCountFunc()
		naFunc()
		kFunc()
		sgotFunc()
		sgptFunc()
		ldhFunc()
		bilirubinFunc()
		totalFunc()
		directFunc()
		kFunc()
		indirectFunc()
		beta2Func()
		hepaBFunc()
		esrFunc()

	})
};

// load patient list to search box
function loadPatientList() {
	params.action = '4';
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

function _calculateAge(birthday) { // birthday is a date
	var ageDifMs = Date.now() - parseDate(birthday).getTime();
	var ageDate = new Date(ageDifMs); // miliseconds from epoch
	return Math.abs(ageDate.getUTCFullYear() - 1970);
}

function parseDate(input) {
	var parts = input.match(/(\d+)/g);
	// new Date(year, month [, date [, hours[, minutes[, seconds[, ms]]]]])
	return new Date(parts[0], parts[1] - 1, parts[2]); // months are 0-based
}

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
	localStorage.setItem("id4", params.patientID);
	$("#baselineBtn").show();
	$("#followUpBtn").show();
	$("#patientStatistics").show();
	$("#editPatientBtn").show();
	$("#archPatientBtn").show();
	upperActionState = true;
};

// add bind

function actionBind() {
	$('#LymphomaBaseline').submit(function() {
		var $form = $(this);
		if (editState == false) {
			$.post('AddLymphomaBaselineServlet', $form.serialize(), function(response) {
				alert("Patient added")
				cancelEdit();
			}).fail(function() {
			});
		} else {
			$.post('EditLymphomaBaselineServlet', $form.serialize(), function(response) {
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

$("input[name=gender]:radio").on('click', function() {
	genderCheck();
});

function genderCheck(){
	hemoglobinFunc()
	hematocritFunc()
	creatinineFunc()
	uricAcidFunc()
};

