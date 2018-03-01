var responseJson;
var id;
var followupID;
var params = {
	action : '',	
	search : '',
	patientID : '',
	followupID: ''	
};

var editState = false;
var upperActionState = false;

$("#PlasmaCellFollowUp").submit(function(e) {
   e.preventDefault();
	});

$('document').ready(function(){
	alert(localStorage.getItem("id6"))
	params.patientID = localStorage.getItem("id6");
	$("#patientID").val(localStorage.getItem("id6"));

	actionBind();
	unbindEvents();

    $("#searchbox").on('input',function(){
    	loadPatientList();
    });
    
	$("#baselineBtn").click(function() {
		localStorage.setItem("fromFollowUp6","pass");
		windows.location = ("plasmacell-baseline.jsp").redirect();
		
	});
	$("#followUpBtn").click(function() {
			loadFollowUpList();
			unbindEvents();
	});
	$("#patientStatistics").click(function() {
		if(upperActionState == true){
			
		}
	});
	$("#editPatientBtn").click(function() {
		if(upperActionState == true){
			editBind();
			alert('edit triggered')
		}
	});
	$("#archPatientBtn").click(function() {
		if(upperActionState == true){
			$.post('DeleteFollowUpServlet', $.param(params), function (response) {
				alert("Patient followup deleted")
				unbindEvents();
			}).fail(function(){
			});	
		}
	});
	
	loadFollowUpList();
	
	
});

// load patient data
function loadPatientData(id) {

	params.patientID = id;
	$.post('LoadPlasmaCellBaselineServlet', $.param(params), function(response) {

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

		$("[name='dateOfInitialDiagnosis']").val(response["dateOfInitialDiagnosis"])
		$("[name='diagnosis']").val(response["diagnosis"])
		$("[name='issStaging']").val(response["issStaging"])
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

		$("[name='bun']").val(response["bun"])
		$("[name='creatinine']").val(response["creatinine"])
		$("[name='uricAcid']").val(response["uricAcid"])
		$("[name='iCa']").val(response["iCa"])
		$("[name='na']").val(response["na"])
		$("[name='k']").val(response["k"])
		$("[name='totalProtein']").val(response["totalProtein"])
		$("[name='albumin']").val(response["albumin"])
		$("[name='globulin']").val(response["globulin"])
		$("[name='b2Microglobulin']").val(response["b2Microglobulin"])
		$("[name='ldh']").val(response["ldh"])

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

		$("[name='serumFreeLightChainAsssayResult']").val(response["serumFreeLightChainAsssayResult"])

		if (response["serumFreeLightChainAsssayResult"] !== "") {
			$("[name='serumFreeLightChainAsssay'][value='1']").prop('checked', true);
			$.serumFreeLightChainAsssayChecked();
		} else {
			$("[name='serumFreeLightChainAsssay'][value='0']").prop('checked', true);
			$.serumFreeLightChainAsssayUnchecked();
		}

		$("[name='serumProteinElectrophoresisResult']").val(response["serumProteinElectrophoresisResult"])

		if (response["serumProteinElectrophoresisResult"] !== "") {
			$("[name='serumProteinElectrophoresis'][value='1']").prop('checked', true);
			$.serumProteinElectrophoresisChecked();
		} else {
			$("[name='serumProteinElectrophoresis'][value='0']").prop('checked', true);
			$.serumProteinElectrophoresisUnchecked();
		}

		$("[name='serumProteinElectrophoresisResult']").val(response["serumProteinElectrophoresisResult"])

		if (response["serumProteinElectrophoresisResult"] !== "") {
			$("[name='serumProteinElectrophoresis'][value='1']").prop('checked', true);
			$.serumProteinElectrophoresisChecked();
		} else {
			$("[name='serumProteinElectrophoresis'][value='0']").prop('checked', true);
			$.serumProteinElectrophoresisUnchecked();
		}

		$("[name='serumImmunofixationResult']").val(response["serumImmunofixationResult"])

		if (response["serumImmunofixationResult"] !== "") {
			$("[name='serumImmunofixation'][value='1']").prop('checked', true);
			$.serumImmunofixationChecked();
		} else {
			$("[name='serumImmunofixation'][value='0']").prop('checked', true);
			$.serumImmunofixationUnchecked();
		}

		$("[name='urineProteinResult']").val(response["urineProteinResult"])

		if (response["urineProteinResult"] !== "") {
			$("[name='urineProtein'][value='1']").prop('checked', true);
			$.urineProteinChecked();
		} else {
			$("[name='urineProtein'][value='0']").prop('checked', true);
			$.urineProteinUnchecked();
		}

		$("[name='cytogeneticAndMolecularAnalysisResult']").val(response["cytogeneticAndMolecularAnalysisResult"])

		if (response["cytogeneticAndMolecularAnalysisResult"] !== "") {
			$("[name='cytogeneticAndMolecularAnalysis'][value='1']").prop('checked', true);
			$.cytogeneticAndMolecularAnalysisChecked();
		} else {
			$("[name='cytogeneticAndMolecularAnalysis'][value='0']").prop('checked', true);
			$.cytogeneticAndMolecularAnalysisUnchecked();
		}

		$("[name='transplantCandidate'][value=" + response["transplantCandidate"] + "]").prop('checked', true);

		if (response["transplantCandidate"] === "True") {
			$("[name='transplantCandidate'][value='1']").prop('checked', true);
		} else if (response["transplantCandidate"] === "False") {
			$("[name='transplantCandidate'][value='2']").prop('checked', true);
		}

		$("[name='treatment']").val(response["treatment"])
		$("[name='otherRegimens']").val(response["otherRegimens"])

		if (response["treatment"] === "Others") {
			$.treatmentOthers();
		} else {
			$.treatmentNull();
		}

		$("[name='regimenProtocolTransplant']").val(response["regimenProtocolTransplant"])
		$("[name='otherRegimensTransplant']").val(response["otherRegimensTransplant"])

		if (response["regimenProtocolTransplant"] === "Others") {
			$.regimenProtocolTransplantOthers();
		} else {
			$.regimenProtocolTransplantNull();
		}

		$("[name='regimenProtocolNonTransplant']").val(response["regimenProtocolNonTransplant"])
		$("[name='otherRegimensNonTransplant']").val(response["otherRegimensNonTransplant"])

		if (response["regimenProtocolNonTransplant"] === "Others") {
			$.regimenProtocolNonTransplantOthers();
		} else {
			$.regimenProtocolNonTransplantNull();
		}

		$("[name='regimenProtocolMaintenanceTherapy']").val(response["regimenProtocolMaintenanceTherapy"])
		$("[name='otherRegimensMaintenanceTherapy']").val(response["otherRegimensMaintenanceTherapy"])

		if (response["regimenProtocolMaintenanceTherapy"] === "Others") {
			$.regimenProtocolMaintenanceTherapyOthers();
		} else {
			$.regimenProtocolMaintenanceTherapyNull();
		}

		$("[name='cycleNumber']").val(response["cycleNumber"])

		$("[name='bisphosphonatesSpecify']").val(response["bisphosphonatesSpecify"])

		if (response["bisphosphonatesSpecify"] !== "") {
			$("[name='bisphosphonates'][value='1']").prop('checked', true);
			$.bisphosphonatesChecked();
		} else {
			$("[name='bisphosphonates'][value='0']").prop('checked', true);
			$.bisphosphonatesUnchecked();
		}

		$("[name='radiotherapyDoseAndFrequency']").val(response["radiotherapyDoseAndFrequency"])

		if (response["radiotherapyDoseAndFrequency"] !== "") {
			$("[name='radiotherapy'][value='1']").prop('checked', true);
			$.radiotherapyChecked();
		} else {
			$("[name='radiotherapy'][value='0']").prop('checked', true);
			$.radiotherapyUnchecked();
		}

		$("[name='otherMedications']").val(response["otherMedications"])

		if (response["otherMedications"] !== "") {
			$("[name='dialysis'][value='1']").prop('checked', true);
			$.dialysisChecked();
		} else {
			$("[name='dialysis'][value='0']").prop('checked', true);
			$.dialysisUnchecked();
		}

		$("[name='dateStarted']").val(response["dateStarted"])
		$("[name='complications']").val(response["complications"])

		bindEvents();

	})
};

//load followup data
function loadFollowUpData(followupID){
	
	params.followupID = followupID;
	$("#followupID").val(followupID);
	
	$.post('LoadPlasmaCellFollowUpServlet', $.param(params), function (response) {
		// in order from followup servlet
		//followup data
		alert('data loaded')
		$("[name='dateOfEntry']").val(response["dateOfEntry"])
		$("[name='dateOfVisit']").val(response["dateOfVisit"])
		$("[name='specialNotes']").val(response["notes"])
		
		//medical events
		$("[name='specifyHematologicMalignancy']").val(response["hematologicMalignancy"])
		$("[name='specifyOtherDiseaseMedication']").val(response["otherDiseaseMedication"])
		$("[name='specifyProcedureIntervention']").val(response["procedureIntervention"])
		$("[name='specifyChemotherapyComplication']").val(response["chemotherapyComplication"])

		//physical exam	
		$("[name='weight']").val(response["weight"])
		$("[name='ecog']").val(response["ecog"])
		
		//clinical data
		$("[name='currentSymptoms']").val(response["currentSymptoms"])
		
		// laboratory profile
		$("[name='dateOfBloodCollection']").val(response["dateOfBloodCollection"])
		
		//hematology
		
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
		
		//blood chemistry
		$("[name='creatinine']").val(response["creatinine"])
		$("[name='totalProtein']").val(response["totalProtein"])
		$("[name='albumin']").val(response["albumin"])
		$("[name='globulin']").val(response["globulin"])
		
		//bone marrow
		$("[name='boneMarrowAspirateDatePerformed']").val(response["boneMarrowAspirateDatePerformed"])
		$("[name='boneMarrowAspirateDescription']").val(response["boneMarrowAspirateDescription"])
		
		//imaging studies
		$("[name='imagingStudiesResult']").val(response["imagingStudiesResult"])
		
		//serums
		$("[name='serumFree']").val(response["serumFree"])
		$("[name='serumProteinElectrophoresisResult']").val(response["serumProteinElectrophoresisResult"])
		$("[name='serumImmunofixationResult']").val(response["serumImmunofixationResult"])
		
		//urine protein
		$("[name='urineProteinResult']").val(response["urineProteinResult"])

		
		//disease status
		$("[name='diseaseStatus']").val(response["diseaseStatus"])
		$("[name='relapseDisease']").val(response["relapseDisease"])		
		$("[name='otherDisease']").val(response["otherDisease"])
		
		bindEvents();
		
	  })
};



//load patient list to search box
function loadPatientList(){
	params.action = '6';
	params.search = $("#searchbox").val();
	$('#searchboxfill').empty();
	$.post('LoadPatientsServlet', $.param(params), function (responseJson) {
      $.each(responseJson, function(index, patient) {   
      $('#searchboxfill')
      	.append("<p value='"+patient.patientID +"' onClick=\"loadPatientData("+patient.patientID +")\"" +
      			">"+ patient.firstName + " " + patient.middleName+ " " + patient.lastName +"</p>")   
  });
		
	}).fail(function(){
	});	
	
};

//load followup list
function loadFollowUpList(){
	$('#visitFill').empty();
	$.post('LoadVisitsServlet', $.param(params), function (responseJson) {
      $.each(responseJson, function(index, patient) {   
      $('#visitFill')
      	.append("<p value='"+patient.followupID +"' onClick=\"loadFollowUpData("+patient.followupID +")\"" +
      			">"+ patient.dateOfVisit +"</p>")   
  });
		
	}).fail(function(){
	});	
	
};


//bind functions

//remove button function
function unbindEvents(){
	$("#editPatientBtn").hide();
	$("#archPatientBtn").hide();
	$("#submitCancel").hide();
	upperActionState = false;
	addBind();
};

function bindEvents(){
	localStorage.setItem("id6",params.patientID);
	$("#editPatientBtn").show();
	$("#archPatientBtn").show();
	upperActionState = true;
};

//add bind

function actionBind(){
	$('#PlasmaCellFollowUp').submit(function() {
		alert($("#patientID").val());
		var $form = $(this);
		if(editState == false){
			$.post('AddPlasmaCellFollowUpServlet', $form.serialize(), function (response) {
					alert("Patient added")
			}).fail(function(){
				});	
		}else{
			$.post('EditPlasmaCellFollowUpServlet', $form.serialize(), function (response) {
				alert("Patient edited")
			}).fail(function(){
				});			
		}
	});
};

function addBind(){
	editState = false;
};

//edit bind
function editBind(){
	$("#submitCancel").show();	
	editState = true;
};

function cancelEdit(){
	//make fields uneditable (incomplete)
	addBind();
	$("#submitCancel").hide();
};


