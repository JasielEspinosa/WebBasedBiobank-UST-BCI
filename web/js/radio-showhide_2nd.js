$(function() {

	// GENERAL DATA

	// MEDICAL EVENTS

	$("input[name='hematologicMalignancy']").click(function() {
		if ($(this).val() === "1") {
			$("#specifyHematologicMalignancy").slideDown(200);
			$("input[name='specifyHematologicMalignancy']").prop('required', true);
		} else if ($(this).val() === "0") {
			$("#specifyHematologicMalignancy").slideUp(200);
			$("input[name='specifyHematologicMalignancy']").prop('required', false);
		}
	});

	$("input[name='otherDiseaseMedication']").click(function() {
		if ($(this).val() === "1") {
			$("#specifyOtherDiseaseMedication").slideDown(200);
			$("input[name='specifyOtherDiseaseMedication']").prop('required', true);
		} else if ($(this).val() === "0") {
			$("#specifyOtherDiseaseMedication").slideUp(200);
			$("input[name='specifyOtherDiseaseMedication']").prop('required', false);
		}
	});

	$("input[name='factorConcentrate']").click(function() {
		if ($(this).val() === "1") {
			$("#specifyReasonFactorConcentrate").slideDown(200);
			$("input[name='specifyReasonFactorConcentrate']").prop('required', true);

			$("#datesOfAdministrationFactorConcentrate").slideDown(200);
			$("input[name='datesOfAdministrationFactorConcentrate']").prop('required', true);

			$("#doseOfFactorConcentrate").slideDown(200);
			$("input[name='doseOfFactorConcentrate']").prop('required', true);

		} else if ($(this).val() === "0") {
			$("#specifyReasonFactorConcentrate").slideUp(200);
			$("input[name='specifyReasonFactorConcentrate']").prop('required', false);

			$("#datesOfAdministrationFactorConcentrate").slideUp(200);
			$("input[name='datesOfAdministrationFactorConcentrate']").prop('required', false);

			$("#doseOfFactorConcentrate").slideUp(200);
			$("input[name='doseOfFactorConcentrate']").prop('required', false);

		}
	});

	$("input[name='procedure']").click(function() {
		if ($(this).val() === "1") {
			$("#specifyProcedure").slideDown(200);
			$("input[name='specifyProcedure']").prop('required', true);
		} else if ($(this).val() === "0") {
			$("#specifyProcedure").slideUp(200);
			$("input[name='specifyProcedure']").prop('required', false);
		}
	});

	$("input[name='chemotherapy']").click(function() {
		if ($(this).val() === "1") {
			$("#specifyChemotherapy").slideDown(200);
			$("input[name='specifyChemotherapy']").prop('required', true);
		} else if ($(this).val() === "0") {
			$("#specifyChemotherapy").slideUp(200);
			$("input[name='specifyChemotherapy']").prop('required', false);
		}
	});

	// CLINICAL

	// LABORATORY

	// THERAPY AND RESPONSE

});
