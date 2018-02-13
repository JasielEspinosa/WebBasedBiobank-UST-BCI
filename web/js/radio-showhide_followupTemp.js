$(function() {

	// GENERAL DATA

	// MEDICAL EVENTS

	// CLINICAL

	// LABORATORY

	$("input[name='molecularAnalysis']").click(function() {
		if ($(this).val() === "1") {
			$("#molecularAnalysisResult").slideDown(200);
			$("input[name='molecularAnalysisResult']").prop('required', true);
			$("#molecularAnalysisAttachScannedDocument").slideDown(200);
			// $("input[name='molecularAnalysisAttachScannedDocument']").prop('required', true);
		} else if ($(this).val() === "0") {
			$("#molecularAnalysisResult").slideUp(200);
			$("input[name='molecularAnalysisResult']").prop('required', false);
			$("#molecularAnalysisAttachScannedDocument").slideUp(200);
			$("input[name='molecularAnalysisAttachScannedDocument']").prop('required', false);
		}
	});

	// THERAPY AND RESPONSE

	$("select[name='diseaseStatus']").click(function() {
		if ($(this).val() === "Others") {
			$("#diseaseStatusOthers").slideDown(200);
			$("input[name='diseaseStatusOthers']").prop('required', true);
			$("#relapseDisease").slideUp(100);
			$("input[name='relapseDisease']").prop('required', false);
		} else if ($(this).val() === "Relapse") {
			$("#relapseDisease").slideDown(200);
			$("input[name='relapseDisease']").prop('required', true);
			$("#diseaseStatusOthers").slideUp(100);
			$("input[name='diseaseStatusOthers']").prop('required', false);
		} else {
			$("#diseaseStatusOthers").slideUp(200);
			$("input[name='diseaseStatusOthers']").prop('required', false);
			$("#relapseDisease").slideUp(200);
			$("input[name='relapseDisease']").prop('required', false);
		}
	});

	$("select[name='qualityOfResponse']").click(function() {
		if ($(this).val() === "Others") {
			$("#diseaseStatusOthers").slideDown(200);
			$("input[name='diseaseStatusOthers']").prop('required', true);
		} else {
			$("#diseaseStatusOthers").slideUp(200);
			$("input[name='diseaseStatusOthers']").prop('required', false);
		}
	});

});
