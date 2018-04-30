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

function setThreeNumberDecimal(num) {
	num.value = parseFloat(num.value).toFixed(3);
};

$("#MyeloFollowUp").submit(function(e) {
	e.preventDefault();
});

$('document').ready(function() {
	//alert(localStorage.getItem("id5"))
	params.patientID = localStorage.getItem("id5");
	$("#patientID").val(localStorage.getItem("id5"));

	actionBind();
	unbindEvents();

	$("#searchbox").on('input', function() {
		loadPatientList();
	});

	$("#baselineBtn").click(function() {
		localStorage.setItem("fromFollowUp5", "pass");
		windows.location = ("myelo-baseline.jsp").redirect();

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
	$.post('LoadMyeloBaselineServlet', $.param(params), function(response) {

		$.loadUneditableFields();
		$("#submitQuery").hide();

		// in order from add servlet
		alert('Data Loaded')

		localStorage.setItem("fromFollowUp5", "pass");
		window.location.replace("myelo-baseline.jsp");

	})
};

// load followup data
function loadFollowUpData(followupID) {

	params.followupID = followupID;
	$("#followupID").val(followupID);

	$.post('LoadMyeloFollowUpServlet', $.param(params), function(response) {

		$.loadUneditableFields();
		$("#submitQuery").hide();
		// in order from followup servlet
		// followup data
		alert('data loaded')
		$("[name='dateOfEntry']").val(response["dateOfEntry"])
		$("[name='dateOfVisit']").val(response["dateOfVisit"])
		$("[name='specialNotes']").val(response["notes"])

		// medical events

		$("[name='specifyHematologicMalignancy']").val(response["specifyHematologicMalignancy"])

		if (response["specifyHematologicMalignancy"] !== "") {
			$("[name='hematologicMalignancy'][value='1']").prop('checked', true);
			$.hematologicMalignancyChecked();
		} else {
			$("[name='hematologicMalignancy'][value='0']").prop('checked', true);
			$.hematologicMalignancyUnchecked();
		}

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
	localStorage.setItem("id5", params.patientID);
	$("#editPatientBtn").show();
	$("#archPatientBtn").show();
	upperActionState = true;
};

// add bind

function actionBind() {
	$('#MyeloFollowUp').submit(function() {
		alert($("#patientID").val());
		var $form = $(this);
		if (editState == false) {
			$.post('AddMyeloFollowUpServlet', $form.serialize(), function(response) {
				alert("Patient added")
				cancelEdit();
			}).fail(function() {
			});
		} else {
			$.post('EditMyeloFollowUpServlet', $form.serialize(), function(response) {
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
