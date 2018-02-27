var responseJson;

var params = {
	action : '',	
	search : '',
	patientId : ''
};

var editState = false;
var upperActionState = false;

$("#AddAAPHSMDSBaseline").submit(function(e) {
   e.preventDefault();
	});

$('document').ready(function(){
	
	actionBind();
	unbindEvents();
    $("#searchbox").on('input',function(){
    	loadPatientList();
    });
    
	$("#baselineBtn").click(function() {
		if(upperActionState == true){
			loadPatientData(params.patientId);
		}		
	});
	$("#followUpBtn").click(function() {
		if(upperActionState == true){
			windows.location = ("aaphsmds-followup.jsp").redirect();
		}
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
			$.post('ArchivePatientServlet', $.param(params), function (response) {
				alert("Patient Archived")
			}).fail(function(){
			});	
		}
	});
     
   if(localStorage.getItem("fromFollowup1") != ""){
    	alert(localStorage.getItem("id1"));
    	loadPatientData(localStorage.getItem("id1"));
    	localStorage.setItem("fromFollowup1","");
    }
	
});

//load patient data
function loadPatientData(id){

	params.patientId = id;
	$.post('LoadAAPHSMDSBaselineServlet', $.param(params), function (response) {
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

//load patient list to search box
function loadPatientList(){
	params.action = '1';
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

//bind functions

//remove button function
function unbindEvents(){
	$("#baselineBtn").hide();
	$("#followUpBtn").hide();
	$("#patientStatistics").hide();
	$("#edtPatientBtn").hide();
	$("#archPatientBtn").hide();
	$("#submitCancel").hide();
	upperActionState = false;
	addBind();
};

function bindEvents(){
	localStorage.setItem("id1",params.patientId);
	$("#baselineBtn").show();
	$("#followUpBtn").show();
	$("#patientStatistics").show();
	$("#edtPatientBtn").show();
	$("#archPatientBtn").show();
	upperActionState = true;
};

//add bind

function actionBind(){
	$('#AddAAPHSMDSBaseline').submit(function() {
		var $form = $(this);
		if(editState == false){
			$.post('AddAAPHSMDSBaselineServlet', $form.serialize(), function (response) {
					alert("Patient added")
			}).fail(function(){
				});	
		}else{
			$.post('EditAAPHSMDSBaselineServlet', $form.serialize(), function (response) {
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


