var responseJson;
var id;
var followupId;
var params = {
	action : '',	
	search : '',
	patientId : '',
	followupId: ''	
};

var editState = false;
var upperActionState = false;

$("#AddPlasmaCellFollowup").submit(function(e) {
   e.preventDefault();
	});

$('document').ready(function(){
	alert(localStorage.getItem("id6"))
	params.patientId = localStorage.getItem("id6");
	$("#patientId").val(localStorage.getItem("id6"));

	actionBind();
	unbindEvents();

    $("#searchbox").on('input',function(){
    	loadPatientList();
    });
    
	$("#baselineBtn").click(function() {
		localStorage.setItem("fromFollowup6","pass");
		windows.location = ("plasmacell-baseline.jsp").redirect();
		
	});
	$("#followUpBtn").click(function() {
			loadFollowupList();
			unbindEvents();
	});
	$("#patientStatistics").click(function() {
		if(upperActionState == true){
			
		}
	});
	$("#edtPatientBtn").click(function() {
		if(upperActionState == true){
			editBind();
			alert('edit triggered')
		}
	});
	$("#archPatientBtn").click(function() {
		if(upperActionState == true){
			$.post('DeleteFollowupServlet', $.param(params), function (response) {
				alert("Patient followup deleted")
				unbindEvents();
			}).fail(function(){
			});	
		}
	});
	
	loadFollowupList();
	
	
});

//load patient data
function loadPatientData(id){

	params.patientId = id;
	$.post('LoadPlasmaCellBaselineServlet', $.param(params), function (response) {
		// in order from add servlet
		//general data
		alert('data loaded')
		$("[name='address']").val(response["address"])
		$("[name='specimenType']").val(response["specimenType"])
		$("[name='lastName']").val(response["lastName"])
		$("[name='middleInitial']").val(response["middleInitial"])
		$("[name='firstName']").val(response["firstName"])
		$("[name='gender']").val(response["gender"])
		$("[name='dateOfBirth']").val(response["dateOfBirth"])
		$("[name='dateOfEntry']").val(response["dateOfEntry"])
		
		//clinical data
		$("[name='severity']").val(response["severity"])
		$("[name='height']").val(response["height"])
		$("[name='weight']").val(response["weight"])
		$("[name='ecog']").val(response["ecog"])
		$("[name='otherFindings']").val(response["otherFindings"])
		
		$("[name='dateOfVisit']").val(response["dateOfVisit"])
		$("[name='diagnosis']").val(response["diagnosis"])
		$("[name='chiefComplaint']").val(response["chiefComplaint"])
		$("[name='otherSymptoms']").val(response["otherSymptoms"])
		$("[name='comorbidities']").val(response["comorbidities"])
		$("[name='smokingHistorySpecify']").val(response["smokingHistorySpecify"])
		$("[name='alchoholIntakeSpecify']").val(response["alchoholIntakeSpecify"])
		$("[name='chemicalExposureSpecify']").val(response["chemicalExposureSpecify"])
		$("[name='previousInfectionSpecify']").val(response["previousInfectionSpecify"])
		$("[name='previousHematologicDisorderSpecify']").val(response["previousHematologicDisorderSpecify"])
			
		$("[name='relationshipToPatient']").val(response["relationshipToPatient"])
		$("[name='cancerName']").val(response["cancerName"])
		
		$("[name='otherDiseasesInTheFamily']").val(response["otherDiseasesInTheFamily"])
		
		$("[name='genericName']").val(response["genericName"])
		$("[name='dose']").val(response["dose"])
		$("[name='frequency']").val(response["frequency"])
		
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
		
		$("[name='flowCytometryResult']").val(response["flowCytometryResult"])
		
		$("[name='cytogeneticAndMolecularAnalysisAAPNHResult']").val(response["cytogeneticAndMolecularAnalysisAAPNHResult"])
		
		$("[name='cytogeneticAndMolecularAnalysisMDSResult']").val(response["cytogeneticAndMolecularAnalysisMDSResult"])
		
		$("[name='dateOfBloodCollection']").val(response["dateOfBloodCollection"])
		
		$("[name='medications']").val(response["medications"])
		
		$("[name='modeOfTreatment']").val(response["modeOfTreatment"])
		$("[name='modeOfTreatment']").val(response["modeOfTreatment"])
		
		$("input[name='transplantCandidate'][value=" + response["transplantCandidate"] + "]").prop('checked', true);
		
		$("[name='dateStarted']").val(response["dateStarted"])
		
		bindEvents();
		
	  })
	
};

//load followup data
function loadFollowupData(followupId){
	
	params.followupId = followupId;
	$("#followupId").val(followupId);
	
	$.post('LoadPlasmaCellFollowupServlet', $.param(params), function (response) {
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
function loadFollowupList(){
	$('#visitFill').empty();
	$.post('LoadVisitsServlet', $.param(params), function (responseJson) {
      $.each(responseJson, function(index, patient) {   
      $('#visitFill')
      	.append("<p value='"+patient.followupID +"' onClick=\"loadFollowupData("+patient.followupID +")\"" +
      			">"+ patient.dateOfVisit +"</p>")   
  });
		
	}).fail(function(){
	});	
	
};


//bind functions

//remove button function
function unbindEvents(){
	$("#edtPatientBtn").hide();
	$("#archPatientBtn").hide();
	$("#submitCancel").hide();
	upperActionState = false;
	addBind();
};

function bindEvents(){
	localStorage.setItem("id1",params.patientId);
	$("#edtPatientBtn").show();
	$("#archPatientBtn").show();
	upperActionState = true;
};

//add bind

function actionBind(){
	$('#AddPlasmaCellFollowup').submit(function() {
		alert($("#patientId").val());
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


