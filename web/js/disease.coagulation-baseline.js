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

$("#CoagulationBaseline").submit(function(e) {
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
			windows.location = ("coagulationdisease-followup.jsp").redirect();
		}
	});
	$("#patientStatistics").click(function() {
		if (upperActionState == true) {

		}
	});
	$("#editPatientBtn").click(function() {
		if (upperActionState == true) {
			editBind();
			alert('Patient ready to edit')
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

	if (localStorage.getItem("fromFollowUp2") != "") {
		// alert(localStorage.getItem("id2"));
		loadPatientData(localStorage.getItem("id2"));
		localStorage.setItem("fromFollowUp2", "");
	}

});

// load patient data
function loadPatientData(id) {

	params.patientID = id;
	$.post('LoadCoagulationBaselineServlet', $.param(params), function(response) {

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

		// clinical data

		$("[name='dateOfVisit']").val(response["dateOfVisit"])
		$("[name='diagnosis']").val(response["diagnosis"])
		$("[name='diagnosisOthers']").val(response["diagnosisOthers"])

		if (response["diagnosis"] === "Others") {
			$.diagnosisOthers();
		} else {
			$.diagnosisNull();
		}

		$("[name='severity']").val(response["severity"])
		$("[name='chiefComplaint']").val(response["chiefComplaint"])
		$("[name='otherSymptoms']").val(response["otherSymptoms"])

		$("[name='relationshipToPatient']").val(response["relationshipToPatient"])
		$("[name='specifyCancer']").val(response["specifyCancer"])
		$("[name='otherDiseasesInTheFamily']").val(response["otherDiseasesInTheFamily"])

		if (response["relationshipToPatient"] !== "" || response["specifyCancer"] !== "" || response["otherDiseasesInTheFamily"] !== "") {
			$("[name='familyHistoryOfBleedingDiathesis'][value='1']").prop('checked', true);
			$.familyHistoryOfBleedingDiathesisChecked();
		} else {
			$("[name='familyHistoryOfBleedingDiathesis'][value='0']").prop('checked', true);
			$.familyHistoryOfBleedingDiathesisUnchecked();
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

		if (response["presenceOfHemarthroses"] === "1") {
			$("[name='presenceOfHemarthroses'][value='1']").prop('checked', true);
		} else if (response["presenceOfHemarthroses"] === "0") {
			$("[name='presenceOfHemarthroses'][value='0']").prop('checked', true);
		}

		if (response["presenceOfContracturesAndMuscleAtrophy"] === "1") {
			$("[name='presenceOfContracturesAndMuscleAtrophy'][value='1']").prop('checked', true);
		} else if (response["presenceOfContracturesAndMuscleAtrophy"] === "0") {
			$("[name='presenceOfContracturesAndMuscleAtrophy'][value='0']").prop('checked', true);
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
		$("[name='plateletCount']").val(response["plateletCount"])

		$("[name='factorVIIILevel']").val(response["factorVIIILevel"])
		$("[name='factorIXLevel']").val(response["factorIXLevel"])
		$("[name='inhibitorAssay']").val(response["inhibitorAssay"])
		$("[name='bethesdaUnits']").val(response["bethesdaUnits"])

		$("[name='creatinine']").val(response["creatinine"])
		$("[name='uricAcid']").val(response["uricAcid"])
		$("[name='na']").val(response["na"])
		$("[name='k']").val(response["k"])
		$("[name='sgot']").val(response["sgot"])
		$("[name='sgpt']").val(response["sgpt"])
		$("[name='ldh']").val(response["ldh"])

		$("[name='imagingStudiesResult']").val(response["imagingStudiesResult"])
		if (response["imagingStudiesResult"] !== "") {
			$("[name='imagingStudies'][value='1']").prop('checked', true);
			$.imagingStudiesChecked();
		} else {
			$("[name='imagingStudies'][value='0']").prop('checked', true);
			$.imagingStudiesUnchecked();
		}

		$("[name='transplantCandidate'][value=" + response["transplantCandidate"] + "]").prop('checked', true);

		$("[name='treatment']").val(response["modeOfTreatment"])
		$("[name='treatmentSpecify']").val(response["nameOfTreatment"])

		if (response["modeOfTreatment"] === "Others") {
			$.treatmentOthers();
		} else {
			$.treatmentNull();
		}

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
		factorVIIIFunc()
		factorIXFunc()
		inhibitorAssayFunc()
		bUnitsFunc()
		naFunc()
		kFunc()
		sgotFunc()

	})
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

// load patient list to search box
function loadPatientList() {
	params.action = '2';
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
	localStorage.setItem("id2", params.patientID);
	$("#baselineBtn").show();
	$("#followUpBtn").show();
	$("#patientStatistics").show();
	$("#editPatientBtn").show();
	$("#archPatientBtn").show();
	upperActionState = true;
};

// add bind

function actionBind() {
	$('#CoagulationBaseline').submit(function() {
		var $form = $(this);
		if (editState == false) {
			$.post('AddCoagulationBaselineServlet', $form.serialize(), function(response) {
				alert("Patient added")
				cancelEdit();
			}).fail(function() {
			});
		} else {
			$.post('EditCoagulationBaselineServlet', $form.serialize(), function(response) {
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
