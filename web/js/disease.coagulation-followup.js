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

$("#CoagulationDiseaseFollowUp").submit(function(e) {
	e.preventDefault();
});

$('document').ready(function() {
	alert(localStorage.getItem("id2"))
	params.patientID = localStorage.getItem("id2");
	$("#patientID").val(localStorage.getItem("id2"));

	actionBind();
	unbindEvents();

	$("#searchbox").on('input', function() {
		loadPatientList();
	});

	$("#baselineBtn").click(function() {
		localStorage.setItem("fromFollowUp2", "pass");
		windows.location = ("coagulationdisease-baseline.jsp").redirect();

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
	$.post('LoadCoagulationBaselineServlet', $.param(params), function(response) {

		$.loadUneditableFields();
		$("#submitQuery").hide();

		// in order from add servlet
		alert('Data Loaded')

		localStorage.setItem("fromFollowUp2", "pass");
		window.location.replace("coagulationdisease-baseline.jsp");
		
	})
};

// load followup data
function loadFollowUpData(followupID) {

	params.followupID = followupID;
	$("#followupID").val(followupID);

	$.post('LoadCoagulationFollowupServlet', $.param(params), function(response) {

		$.loadUneditableFields();
		$("#submitQuery").hide();
		// in order from followup servlet
		// followup data
		alert('data loaded')
		$("[name='dateOfEntry']").val(response["dateOfEntry"])
		$("[name='dateOfVisit']").val(response["dateOfVisit"])

		// medical events
		$("[name='specifyReasonFactorConcentrate']").val(response["specifyReasonFactorConcentrate"])
		$("[name='datesOfAdministrationFactorConcentrate']").val(response["datesOfAdministrationFactorConcentrate"])
		$("[name='doseOfFactorConcentrate']").val(response["doseOfFactorConcentrate"])

		if (response["specifyReasonFactorConcentrate"] !== "" || response["datesOfAdministrationFactorConcentrate"] !== ""
				|| response["doseOfFactorConcentrate"] === 0) {
			$("[name='factorConcentrate'][value='1']").prop('checked', true);
			$.factorConcentrateChecked();
		} else {
			$("[name='factorConcentrate'][value='0']").prop('checked', true);
			$.factorConcentrateUnchecked();
		}

		$("[name='specifyProcedure']").val(response["specifyProcedure"])

		if ($("[name='specifyProcedure']").val() !== "") {
			$("[name='procedure'][value='1']").prop('checked', true);
			$.procedureChecked();
		} else {
			$("[name='procedure'][value='0']").prop('checked', true);
			$.procedureUnchecked();
		}

		$("[name='specialNotes']").val(response["specialNotes"])

		bindEvents();

	})
};

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
	localStorage.setItem("id2", params.patientID);
	$("#editPatientBtn").show();
	$("#archPatientBtn").show();
	upperActionState = true;
};

// add bind

function actionBind() {
	$('#CoagulationDiseaseFollowUp').submit(function() {
		alert($("#patientID").val());
		var $form = $(this);
		if (editState == false) {
			$.post('AddCoagulationFollowUpServlet', $form.serialize(), function(response) {
				alert("Patient added")
			}).fail(function() {
			});
		} else {
			$.post('EditCoagulationFollowUpServlet', $form.serialize(), function(response) {
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