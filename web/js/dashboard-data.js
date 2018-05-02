var params = {
	action : '',
	agePass : '0',
	genderPass : '0',
	modeOfTreatmentPass : '0',
	baselinePass : '0',
	followupPass : '0',
	sortFrom : '',
	sortTo : '',
};

$('#leukemiaImg').click(function() {
	loadAll()
	params.action = '3'

	$.post('DashboardDataServlet', $.param(params), function(response) {
		for (var i = 0; i < response.chartAge.ageChart.length; i++) {
			leukemiaChartAge.data.datasets[0].data[i] = response.chartAge.ageChart[i];
		}
		leukemiaChartAge.update()

		leukemiaChartGender.data.datasets[0].data[0] = response.maleChart;
		leukemiaChartGender.data.datasets[0].data[1] = response.femaleChart;

		leukemiaChartGender.update()

		leukemiaChartModeOfTreatment.data.datasets[0].data[0] = response.chartModeOfTreatmentBean.pharmacologic1stLine
		leukemiaChartModeOfTreatment.data.datasets[1].data[1] = response.chartModeOfTreatmentBean.pharmacologic2ndLineSalvage
		leukemiaChartModeOfTreatment.data.datasets[2].data[2] = response.chartModeOfTreatmentBean.supportivePalliativeOnly
		leukemiaChartModeOfTreatment.data.datasets[3].data[3] = response.chartModeOfTreatmentBean.watchAndWait
		leukemiaChartModeOfTreatment.data.datasets[4].data[4] = response.chartModeOfTreatmentBean.others

		leukemiaChartModeOfTreatment.update()

		leukemiaChartBaselineDiseaseStatus.data.datasets[0].data[0] = response.chartStatusBaseline.newlyDiagnosed
		leukemiaChartBaselineDiseaseStatus.data.datasets[1].data[1] = response.chartStatusBaseline.cr
		leukemiaChartBaselineDiseaseStatus.data.datasets[2].data[2] = response.chartStatusBaseline.nCR
		leukemiaChartBaselineDiseaseStatus.data.datasets[3].data[3] = response.chartStatusBaseline.pr
		leukemiaChartBaselineDiseaseStatus.data.datasets[4].data[4] = response.chartStatusBaseline.pd
		leukemiaChartBaselineDiseaseStatus.data.datasets[5].data[5] = response.chartStatusBaseline.sd
		leukemiaChartBaselineDiseaseStatus.data.datasets[6].data[6] = response.chartStatusBaseline.completeHematologicResponse
		leukemiaChartBaselineDiseaseStatus.data.datasets[7].data[7] = response.chartStatusBaseline.completeCytogeneticResponse
		leukemiaChartBaselineDiseaseStatus.data.datasets[8].data[8] = response.chartStatusBaseline.majorMolecularResponse
		leukemiaChartBaselineDiseaseStatus.data.datasets[9].data[9] = response.chartStatusBaseline.spleenResponse
		leukemiaChartBaselineDiseaseStatus.data.datasets[10].data[10] = response.chartStatusBaseline.symptomResponse
		leukemiaChartBaselineDiseaseStatus.data.datasets[11].data[11] = response.chartStatusBaseline.others

		leukemiaChartBaselineDiseaseStatus.update()

		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[0] = response.chartStatusFollowup.relapsed
		leukemiaChartFollowupDiseaseStatus.data.datasets[1].data[1] = response.chartStatusFollowup.refractoryDisease
		leukemiaChartFollowupDiseaseStatus.data.datasets[2].data[2] = response.chartStatusFollowup.cr
		leukemiaChartFollowupDiseaseStatus.data.datasets[3].data[3] = response.chartStatusFollowup.nCR
		leukemiaChartFollowupDiseaseStatus.data.datasets[4].data[4] = response.chartStatusFollowup.pr
		leukemiaChartFollowupDiseaseStatus.data.datasets[5].data[5] = response.chartStatusFollowup.pd
		leukemiaChartFollowupDiseaseStatus.data.datasets[6].data[6] = response.chartStatusFollowup.sd
		leukemiaChartFollowupDiseaseStatus.data.datasets[7].data[7] = response.chartStatusFollowup.completeHematologicResponse
		leukemiaChartFollowupDiseaseStatus.data.datasets[8].data[8] = response.chartStatusFollowup.completeCytogeneticResponse
		leukemiaChartFollowupDiseaseStatus.data.datasets[9].data[9] = response.chartStatusFollowup.majorMolecularResponse
		leukemiaChartFollowupDiseaseStatus.data.datasets[10].data[10] = response.chartStatusFollowup.spleenResponse
		leukemiaChartFollowupDiseaseStatus.data.datasets[11].data[11] = response.chartStatusFollowup.symptomResponse
		leukemiaChartFollowupDiseaseStatus.data.datasets[12].data[12] = response.chartStatusFollowup.dead
		leukemiaChartFollowupDiseaseStatus.data.datasets[13].data[13] = response.chartStatusFollowup.others

		leukemiaChartFollowupDiseaseStatus.update()
	}).fail(function() {
	});
});

$('#lymphomaImg').click(function() {
	loadAll()
	params.action = '4'

	$.post('DashboardDataServlet', $.param(params), function(response) {
		for (var i = 0; i < response.chartAge.ageChart.length; i++) {
			lymphomaChartAge.data.datasets[0].data[i] = response.chartAge.ageChart[i];
		}
		lymphomaChartAge.update()

		lymphomaChartGender.data.datasets[0].data[0] = response.maleChart;
		lymphomaChartGender.data.datasets[0].data[1] = response.femaleChart;

		lymphomaChartGender.update()

		lymphomaChartModeOfTreatment.data.datasets[0].data[0] = response.chartModeOfTreatmentBean.pharmacologic1stLine
		lymphomaChartModeOfTreatment.data.datasets[1].data[1] = response.chartModeOfTreatmentBean.pharmacologic2ndLineSalvage
		lymphomaChartModeOfTreatment.data.datasets[2].data[2] = response.chartModeOfTreatmentBean.supportivePalliativeOnly

		lymphomaChartModeOfTreatment.update()

		lymphomaChartBaselineDiseaseStatus.data.datasets[0].data[0] = response.chartStatusBaseline.newlyDiagnosed
		lymphomaChartBaselineDiseaseStatus.data.datasets[1].data[1] = response.chartStatusBaseline.cr
		lymphomaChartBaselineDiseaseStatus.data.datasets[2].data[2] = response.chartStatusBaseline.pr
		lymphomaChartBaselineDiseaseStatus.data.datasets[3].data[3] = response.chartStatusBaseline.sd
		lymphomaChartBaselineDiseaseStatus.data.datasets[4].data[4] = response.chartStatusBaseline.pd

		lymphomaChartBaselineDiseaseStatus.update()

		lymphomaChartFollowupDiseaseStatus.data.datasets[0].data[0] = response.chartStatusFollowup.cr
		lymphomaChartFollowupDiseaseStatus.data.datasets[1].data[1] = response.chartStatusFollowup.pr
		lymphomaChartFollowupDiseaseStatus.data.datasets[2].data[2] = response.chartStatusFollowup.sd
		lymphomaChartFollowupDiseaseStatus.data.datasets[3].data[3] = response.chartStatusFollowup.pd
		lymphomaChartFollowupDiseaseStatus.data.datasets[4].data[4] = response.chartStatusFollowup.rr
		lymphomaChartFollowupDiseaseStatus.data.datasets[5].data[5] = response.chartStatusFollowup.dead
		lymphomaChartFollowupDiseaseStatus.data.datasets[6].data[6] = response.chartStatusFollowup.others

		lymphomaChartFollowupDiseaseStatus.update()
	});
});

$('#myeloproliferativeImg').click(function() {
	loadAll()
	params.action = '5'

	$.post('DashboardDataServlet', $.param(params), function(response) {
		for (var i = 0; i < response.chartAge.ageChart.length; i++) {
			myeloChartAge.data.datasets[0].data[i] = response.chartAge.ageChart[i];
		}
		myeloChartAge.update()

		myeloChartGender.data.datasets[0].data[0] = response.maleChart;
		myeloChartGender.data.datasets[0].data[1] = response.femaleChart;

		myeloChartGender.update()

		myeloChartModeOfTreatment.data.datasets[0].data[0] = response.chartModeOfTreatmentBean.pharmacologicTreatment
		myeloChartModeOfTreatment.data.datasets[1].data[1] = response.chartModeOfTreatmentBean.supportivePalliativeOnly
		myeloChartModeOfTreatment.data.datasets[2].data[2] = response.chartModeOfTreatmentBean.watchAndWait
		myeloChartModeOfTreatment.data.datasets[3].data[3] = response.chartModeOfTreatmentBean.others

		myeloChartModeOfTreatment.update()

		myeloChartBaselineDiseaseStatus.data.datasets[0].data[0] = response.chartStatusBaseline.cr
		myeloChartBaselineDiseaseStatus.data.datasets[1].data[1] = response.chartStatusBaseline.pr
		myeloChartBaselineDiseaseStatus.data.datasets[2].data[2] = response.chartStatusBaseline.pd
		myeloChartBaselineDiseaseStatus.data.datasets[3].data[3] = response.chartStatusBaseline.sd
		myeloChartBaselineDiseaseStatus.data.datasets[4].data[4] = response.chartStatusBaseline.hematologicResponse
		myeloChartBaselineDiseaseStatus.data.datasets[5].data[5] = response.chartStatusBaseline.spleenResponse
		myeloChartBaselineDiseaseStatus.data.datasets[6].data[6] = response.chartStatusBaseline.symptomResponse
		myeloChartBaselineDiseaseStatus.data.datasets[7].data[7] = response.chartStatusBaseline.others

		myeloChartBaselineDiseaseStatus.update()

		myeloChartFollowupDiseaseStatus.data.datasets[0].data[0] = response.chartStatusFollowup.cr
		myeloChartFollowupDiseaseStatus.data.datasets[1].data[1] = response.chartStatusFollowup.pr
		myeloChartFollowupDiseaseStatus.data.datasets[2].data[2] = response.chartStatusFollowup.pd
		myeloChartFollowupDiseaseStatus.data.datasets[3].data[3] = response.chartStatusFollowup.sd
		myeloChartFollowupDiseaseStatus.data.datasets[4].data[4] = response.chartStatusFollowup.hematologicResponse
		myeloChartFollowupDiseaseStatus.data.datasets[5].data[5] = response.chartStatusFollowup.spleenResponse
		myeloChartFollowupDiseaseStatus.data.datasets[6].data[6] = response.chartStatusFollowup.symptomResponse
		myeloChartFollowupDiseaseStatus.data.datasets[7].data[7] = response.chartStatusFollowup.dead
		myeloChartFollowupDiseaseStatus.data.datasets[8].data[8] = response.chartStatusFollowup.others

		myeloChartFollowupDiseaseStatus.update()
	});
});

$('#plasmaCellImg').click(function() {
	loadAll()
	params.action = '6'

	$.post('DashboardDataServlet', $.param(params), function(response) {
		for (var i = 0; i < response.chartAge.ageChart.length; i++) {
			plasmaCellChartAge.data.datasets[0].data[i] = response.chartAge.ageChart[i];
		}
		plasmaCellChartAge.update()

		plasmaCellChartGender.data.datasets[0].data[0] = response.maleChart;
		plasmaCellChartGender.data.datasets[0].data[1] = response.femaleChart;

		plasmaCellChartGender.update()

		plasmaCellChartModeOfTreatment.data.datasets[0].data[0] = response.chartModeOfTreatmentBean.pharmacologicForTransplantCandidate
		plasmaCellChartModeOfTreatment.data.datasets[1].data[1] = response.chartModeOfTreatmentBean.pharmacologicForNonTransplantCandidate
		plasmaCellChartModeOfTreatment.data.datasets[2].data[2] = response.chartModeOfTreatmentBean.maintenance
		plasmaCellChartModeOfTreatment.data.datasets[3].data[3] = response.chartModeOfTreatmentBean.radiotherapy
		plasmaCellChartModeOfTreatment.data.datasets[4].data[4] = response.chartModeOfTreatmentBean.supportive
		plasmaCellChartModeOfTreatment.data.datasets[5].data[5] = response.chartModeOfTreatmentBean.watchAndWait
		plasmaCellChartModeOfTreatment.data.datasets[6].data[6] = response.chartModeOfTreatmentBean.others

		plasmaCellChartModeOfTreatment.update()

		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[0] = response.chartStatusBaseline.cr
		plasmaCellChartBaselineDiseaseStatus.data.datasets[1].data[1] = response.chartStatusBaseline.sCR
		plasmaCellChartBaselineDiseaseStatus.data.datasets[2].data[2] = response.chartStatusBaseline.immunophenotypicCR
		plasmaCellChartBaselineDiseaseStatus.data.datasets[3].data[3] = response.chartStatusBaseline.molecularCR
		plasmaCellChartBaselineDiseaseStatus.data.datasets[4].data[4] = response.chartStatusBaseline.vgpr
		plasmaCellChartBaselineDiseaseStatus.data.datasets[5].data[5] = response.chartStatusBaseline.pr
		plasmaCellChartBaselineDiseaseStatus.data.datasets[6].data[6] = response.chartStatusBaseline.mr
		plasmaCellChartBaselineDiseaseStatus.data.datasets[7].data[7] = response.chartStatusBaseline.sd
		plasmaCellChartBaselineDiseaseStatus.data.datasets[8].data[8] = response.chartStatusBaseline.pd
		plasmaCellChartBaselineDiseaseStatus.data.datasets[9].data[9] = response.chartStatusBaseline.relapsed
		//plasmaCellChartBaselineDiseaseStatus.data.datasets[10].data[10] = response.chartStatusBaseline.clinicalRelapse
		//plasmaCellChartBaselineDiseaseStatus.data.datasets[11].data[11] = response.chartStatusBaseline.relapseFromCR
		plasmaCellChartBaselineDiseaseStatus.data.datasets[10].data[10] = response.chartStatusBaseline.others

		plasmaCellChartBaselineDiseaseStatus.update()

		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[0] = response.chartStatusFollowup.cr
		plasmaCellChartFollowupDiseaseStatus.data.datasets[1].data[1] = response.chartStatusFollowup.sCR
		plasmaCellChartFollowupDiseaseStatus.data.datasets[2].data[2] = response.chartStatusFollowup.immunophenotypicCR
		plasmaCellChartFollowupDiseaseStatus.data.datasets[3].data[3] = response.chartStatusFollowup.molecularCR
		plasmaCellChartFollowupDiseaseStatus.data.datasets[4].data[4] = response.chartStatusFollowup.vgpr
		plasmaCellChartFollowupDiseaseStatus.data.datasets[5].data[5] = response.chartStatusFollowup.pr
		plasmaCellChartFollowupDiseaseStatus.data.datasets[6].data[6] = response.chartStatusFollowup.mr
		plasmaCellChartFollowupDiseaseStatus.data.datasets[7].data[7] = response.chartStatusFollowup.sd
		plasmaCellChartFollowupDiseaseStatus.data.datasets[8].data[8] = response.chartStatusFollowup.pd
		plasmaCellChartFollowupDiseaseStatus.data.datasets[9].data[9] = response.chartStatusFollowup.relapsed
		//plasmaCellChartFollowupDiseaseStatus.data.datasets[10].data[10] = response.chartStatusFollowup.clinicalRelapse
		//plasmaCellChartFollowupDiseaseStatus.data.datasets[11].data[11] = response.chartStatusFollowup.relapseFromCR
		plasmaCellChartFollowupDiseaseStatus.data.datasets[10].data[10] = response.chartStatusFollowup.dead
		plasmaCellChartFollowupDiseaseStatus.data.datasets[11].data[11] = response.chartStatusFollowup.others

		plasmaCellChartFollowupDiseaseStatus.update()
	});
});

$('#aapnhmdsImg').click(function() {
	loadAll()
	params.action = '1'

	$.post('DashboardDataServlet', $.param(params), function(response) {
		for (var i = 0; i < response.chartAge.ageChart.length; i++) {
			aapnhmdsChartAge.data.datasets[0].data[i] = response.chartAge.ageChart[i];
		}
		aapnhmdsChartAge.update()

		aapnhmdsChartGender.data.datasets[0].data[0] = response.maleChart;
		aapnhmdsChartGender.data.datasets[0].data[1] = response.femaleChart;

		aapnhmdsChartGender.update()

		aapnhmdsChartModeOfTreatment.data.datasets[0].data[0] = response.chartModeOfTreatmentBean.hematopoieticStemCellTransplantation
		aapnhmdsChartModeOfTreatment.data.datasets[1].data[1] = response.chartModeOfTreatmentBean.pharmacologicTreatment
		aapnhmdsChartModeOfTreatment.data.datasets[2].data[2] = response.chartModeOfTreatmentBean.supportive
		aapnhmdsChartModeOfTreatment.data.datasets[3].data[3] = response.chartModeOfTreatmentBean.bothPharmacologicAndSupportive
		aapnhmdsChartModeOfTreatment.data.datasets[4].data[4] = response.chartModeOfTreatmentBean.watchAndWait

		aapnhmdsChartModeOfTreatment.update()

		aapnhmdsChartBaselineDiseaseStatus.data.datasets[0].data[0] = response.chartStatusBaseline.hematologicResponse
		aapnhmdsChartBaselineDiseaseStatus.data.datasets[1].data[1] = response.chartStatusBaseline.sd
		aapnhmdsChartBaselineDiseaseStatus.data.datasets[2].data[2] = response.chartStatusBaseline.relapsed
		aapnhmdsChartBaselineDiseaseStatus.data.datasets[3].data[3] = response.chartStatusBaseline.others

		aapnhmdsChartBaselineDiseaseStatus.update()

		aapnhmdsChartFollowupDiseaseStatus.data.datasets[0].data[0] = response.chartStatusFollowup.hematologicResponse
		aapnhmdsChartFollowupDiseaseStatus.data.datasets[1].data[1] = response.chartStatusFollowup.sd
		aapnhmdsChartFollowupDiseaseStatus.data.datasets[2].data[2] = response.chartStatusFollowup.relapsed
		aapnhmdsChartFollowupDiseaseStatus.data.datasets[3].data[3] = response.chartStatusFollowup.dead
		aapnhmdsChartFollowupDiseaseStatus.data.datasets[4].data[4] = response.chartStatusFollowup.others

		aapnhmdsChartFollowupDiseaseStatus.update()
	});
});

$('#plateletDisorderImg').click(function() {
	loadAll()
	params.action = '7'

	$.post('DashboardDataServlet', $.param(params), function(response) {
		for (var i = 0; i < response.chartAge.ageChart.length; i++) {
			plateletChartAge.data.datasets[0].data[i] = response.chartAge.ageChart[i];
		}
		plateletChartAge.update()

		plateletChartGender.data.datasets[0].data[0] = response.maleChart;
		plateletChartGender.data.datasets[0].data[1] = response.femaleChart;

		plateletChartGender.update()

		plateletChartModeOfTreatment.data.datasets[0].data[0] = response.chartModeOfTreatmentBean.pharmacologic1stLine
		plateletChartModeOfTreatment.data.datasets[1].data[1] = response.chartModeOfTreatmentBean.pharmacologic2ndLine
		plateletChartModeOfTreatment.data.datasets[2].data[2] = response.chartModeOfTreatmentBean.supportive
		plateletChartModeOfTreatment.data.datasets[3].data[3] = response.chartModeOfTreatmentBean.bothPharmacologicAndSupportive
		plateletChartModeOfTreatment.data.datasets[4].data[4] = response.chartModeOfTreatmentBean.watchAndWait
		plateletChartModeOfTreatment.data.datasets[5].data[5] = response.chartModeOfTreatmentBean.others

		plateletChartModeOfTreatment.update()

		plateletChartBaselineDiseaseStatus.data.datasets[0].data[0] = response.chartStatusBaseline.newlyDiagnosedITP
		plateletChartBaselineDiseaseStatus.data.datasets[1].data[1] = response.chartStatusBaseline.persistentITP
		plateletChartBaselineDiseaseStatus.data.datasets[2].data[2] = response.chartStatusBaseline.chronicITP
		plateletChartBaselineDiseaseStatus.data.datasets[3].data[3] = response.chartStatusBaseline.severeITP

		plateletChartBaselineDiseaseStatus.update()

		plateletChartFollowupDiseaseStatus.data.datasets[0].data[0] = response.chartStatusFollowup.cr
		plateletChartFollowupDiseaseStatus.data.datasets[1].data[1] = response.chartStatusFollowup.remission
		plateletChartFollowupDiseaseStatus.data.datasets[2].data[2] = response.chartStatusFollowup.timeToResponse
		plateletChartFollowupDiseaseStatus.data.datasets[3].data[3] = response.chartStatusFollowup.nr
		plateletChartFollowupDiseaseStatus.data.datasets[4].data[4] = response.chartStatusFollowup.lossofCR
		plateletChartFollowupDiseaseStatus.data.datasets[5].data[5] = response.chartStatusFollowup.refractoryITP
		plateletChartFollowupDiseaseStatus.data.datasets[6].data[6] = response.chartStatusFollowup.sd
		plateletChartFollowupDiseaseStatus.data.datasets[7].data[7] = response.chartStatusFollowup.dead
		plateletChartFollowupDiseaseStatus.data.datasets[8].data[8] = response.chartStatusFollowup.others

		plateletChartFollowupDiseaseStatus.update()
	});
});

$('#coagulationDiseaseImg').click(function() {
	loadAll()
	params.action = '2'

	$.post('DashboardDataServlet', $.param(params), function(response) {
		for (var i = 0; i < response.chartAge.ageChart.length; i++) {
			coagulationChartAge.data.datasets[0].data[i] = response.chartAge.ageChart[i];
		}
		coagulationChartAge.update()

		coagulationChartGender.data.datasets[0].data[0] = response.maleChart;
		coagulationChartGender.data.datasets[0].data[1] = response.femaleChart;

		coagulationChartGender.update()

		coagulationChartModeOfTreatment.data.datasets[0].data[0] = response.chartModeOfTreatmentBean.factorConcentrates
		coagulationChartModeOfTreatment.data.datasets[1].data[1] = response.chartModeOfTreatmentBean.bloodComponent
		coagulationChartModeOfTreatment.data.datasets[2].data[2] = response.chartModeOfTreatmentBean.others

		coagulationChartModeOfTreatment.update()

		coagulationChartBaselineDiseaseStatus.data.datasets[0].data[0] = response.chartStatusBaseline.sd

		coagulationChartBaselineDiseaseStatus.update()

		coagulationChartFollowupDiseaseStatus.data.datasets[0].data[0] = response.chartStatusFollowup.sd

		coagulationChartFollowupDiseaseStatus.update()
	});
});

function restoreValues() {
	params.agePass = '0'
	params.genderPass = '0'
	params.modeOfTreatmentPass = '0'
	params.baselinePass = '0'
	params.followupPass = '0'
	params.sortFrom = ''
	params.sortTo = ''
};

function loadAll() {
	params.agePass = '1'
	params.genderPass = '1'
	params.modeOfTreatmentPass = '1'
	params.baselinePass = '1'
	params.followupPass = '1'
	params.sortFrom = ''
	params.sortTo = ''
};

// leukemia
// from and to
// age
$("#ageStatisticsFromLeukemia").on('input', function() {
	restoreValues()
	params.agePass = '1'
	params.action = '3'
	params.sortFrom = $("#ageStatisticsFromLeukemia").val()
	params.sortTo = $("#ageStatisticsFromLeukemia").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		for (var i = 0; i < response.chartAge.ageChart.length; i++) {
			leukemiaChartAge.data.datasets[0].data[i] = response.chartAge.ageChart[i];
		}
		leukemiaChartAge.update()
	}).fail(function() {
	});

});
$("#ageStatisticsToLeukemia").on('input', function() {
	restoreValues()
	params.agePass = '1'
	params.action = '3'
	params.sortFrom = $("#ageStatisticsFromLeukemia").val()
	params.sortTo = $("#ageStatisticsFromLeukemia").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		for (var i = 0; i < response.chartAge.ageChart.length; i++) {
			leukemiaChartAge.data.datasets[0].data[i] = response.chartAge.ageChart[i];
		}
		leukemiaChartAge.update()
	}).fail(function() {
	});
});

// gender
$("#genderStatisticsFromLeukemia").on('input', function() {
	restoreValues()
	params.genderPass = '1'
	params.action = '3'
	params.sortFrom = $("#genderStatisticsFromLeukemia").val()
	params.sortTo = $("#genderStatisticsToLeukemia").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		leukemiaChartGender.data.datasets[0].data[0] = response.maleChart;
		leukemiaChartGender.data.datasets[0].data[1] = response.femaleChart;

		leukemiaChartGender.update()
	}).fail(function() {
	});
});
$("#genderStatisticsToLeukemia").on('input', function() {
	restoreValues()
	params.genderPass = '1'
	params.action = '3'
	params.sortFrom = $("#genderStatisticsFromLeukemia").val()
	params.sortTo = $("#genderStatisticsToLeukemia").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		leukemiaChartGender.data.datasets[0].data[0] = response.maleChart;
		leukemiaChartGender.data.datasets[0].data[1] = response.femaleChart;

		leukemiaChartGender.update()
	}).fail(function() {
	});
});

// mode
$("#modeOfTreatmentStatisticsFromLeukemia").on('input', function() {
	restoreValues()
	params.modeOfTreatmentPass = '1'
	params.action = '3'
	params.sortFrom = $("#modeOfTreatmentStatisticsFromLeukemia").val()
	params.sortTo = $("#modeOfTreatmentStatisticsToLeukemia").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		leukemiaChartModeOfTreatment.data.datasets[0].data[0] = response.chartModeOfTreatmentBean.pharmacologic1stLine
		leukemiaChartModeOfTreatment.data.datasets[1].data[1] = response.chartModeOfTreatmentBean.pharmacologic2ndLineSalvage
		leukemiaChartModeOfTreatment.data.datasets[2].data[2] = response.chartModeOfTreatmentBean.supportivePalliativeOnly
		leukemiaChartModeOfTreatment.data.datasets[3].data[3] = response.chartModeOfTreatmentBean.watchAndWait
		leukemiaChartModeOfTreatment.data.datasets[4].data[4] = response.chartModeOfTreatmentBean.others

		leukemiaChartModeOfTreatment.update()
	}).fail(function() {
	});
});
$("#modeOfTreatmentStatisticsToLeukemia").on('input', function() {
	restoreValues()
	params.modeOfTreatmentPass = '1'
	params.action = '3'
	params.sortFrom = $("#modeOfTreatmentStatisticsFromLeukemia").val()
	params.sortTo = $("#modeOfTreatmentStatisticsToLeukemia").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		leukemiaChartModeOfTreatment.data.datasets[0].data[0] = response.chartModeOfTreatmentBean.pharmacologic1stLine
		leukemiaChartModeOfTreatment.data.datasets[1].data[1] = response.chartModeOfTreatmentBean.pharmacologic2ndLineSalvage
		leukemiaChartModeOfTreatment.data.datasets[2].data[2] = response.chartModeOfTreatmentBean.supportivePalliativeOnly
		leukemiaChartModeOfTreatment.data.datasets[3].data[3] = response.chartModeOfTreatmentBean.watchAndWait
		leukemiaChartModeOfTreatment.data.datasets[4].data[4] = response.chartModeOfTreatmentBean.others

		leukemiaChartModeOfTreatment.update()
	}).fail(function() {
	});
});

// baseline
$("#baselineStatisticsFromLeukemia").on('input', function() {
	restoreValues()
	params.baselinePass = '1'
	params.action = '3'
	params.sortFrom = $("#baselineStatisticsFromLeukemia").val()
	params.sortTo = $("#baselineStatisticsToLeukemia").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		leukemiaChartBaselineDiseaseStatus.data.datasets[0].data[0] = response.chartStatusBaseline.newlyDiagnosed
		leukemiaChartBaselineDiseaseStatus.data.datasets[1].data[1] = response.chartStatusBaseline.cr
		leukemiaChartBaselineDiseaseStatus.data.datasets[2].data[2] = response.chartStatusBaseline.nCR
		leukemiaChartBaselineDiseaseStatus.data.datasets[3].data[3] = response.chartStatusBaseline.pr
		leukemiaChartBaselineDiseaseStatus.data.datasets[4].data[4] = response.chartStatusBaseline.pd
		leukemiaChartBaselineDiseaseStatus.data.datasets[5].data[5] = response.chartStatusBaseline.sd
		leukemiaChartBaselineDiseaseStatus.data.datasets[6].data[6] = response.chartStatusBaseline.completeHematologicResponse
		leukemiaChartBaselineDiseaseStatus.data.datasets[7].data[7] = response.chartStatusBaseline.completeCytogeneticResponse
		leukemiaChartBaselineDiseaseStatus.data.datasets[8].data[8] = response.chartStatusBaseline.majorMolecularResponse
		leukemiaChartBaselineDiseaseStatus.data.datasets[9].data[9] = response.chartStatusBaseline.spleenResponse
		leukemiaChartBaselineDiseaseStatus.data.datasets[10].data[10] = response.chartStatusBaseline.symptomResponse
		leukemiaChartBaselineDiseaseStatus.data.datasets[11].data[11] = response.chartStatusBaseline.others

		leukemiaChartBaselineDiseaseStatus.update()
	}).fail(function() {
	});
});
$("#baselineStatisticsToLeukemia").on('input', function() {
	restoreValues()
	params.baselinePass = '1'
	params.action = '3'
	params.sortFrom = $("#baselineStatisticsFromLeukemia").val()
	params.sortTo = $("#baselineStatisticsToLeukemia").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		leukemiaChartBaselineDiseaseStatus.data.datasets[0].data[0] = response.chartStatusBaseline.newlyDiagnosed
		leukemiaChartBaselineDiseaseStatus.data.datasets[1].data[1] = response.chartStatusBaseline.cr
		leukemiaChartBaselineDiseaseStatus.data.datasets[2].data[2] = response.chartStatusBaseline.nCR
		leukemiaChartBaselineDiseaseStatus.data.datasets[3].data[3] = response.chartStatusBaseline.pr
		leukemiaChartBaselineDiseaseStatus.data.datasets[4].data[4] = response.chartStatusBaseline.pd
		leukemiaChartBaselineDiseaseStatus.data.datasets[5].data[5] = response.chartStatusBaseline.sd
		leukemiaChartBaselineDiseaseStatus.data.datasets[6].data[6] = response.chartStatusBaseline.completeHematologicResponse
		leukemiaChartBaselineDiseaseStatus.data.datasets[7].data[7] = response.chartStatusBaseline.completeCytogeneticResponse
		leukemiaChartBaselineDiseaseStatus.data.datasets[8].data[8] = response.chartStatusBaseline.majorMolecularResponse
		leukemiaChartBaselineDiseaseStatus.data.datasets[9].data[9] = response.chartStatusBaseline.spleenResponse
		leukemiaChartBaselineDiseaseStatus.data.datasets[10].data[10] = response.chartStatusBaseline.symptomResponse
		leukemiaChartBaselineDiseaseStatus.data.datasets[11].data[11] = response.chartStatusBaseline.others

		leukemiaChartBaselineDiseaseStatus.update()
	}).fail(function() {
	});
});

// followup
$("#followupStatisticsFromLeukemia").on('input', function() {
	restoreValues()
	params.followupPass = '1'
	params.action = '3'
	params.sortFrom = $("#followupStatisticsFromLeukemia").val()
	params.sortTo = $("#followupStatisticsToLeukemia").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[0] = response.chartStatusFollowup.relapsed
		leukemiaChartFollowupDiseaseStatus.data.datasets[1].data[1] = response.chartStatusFollowup.refractoryDisease
		leukemiaChartFollowupDiseaseStatus.data.datasets[2].data[2] = response.chartStatusFollowup.cr
		leukemiaChartFollowupDiseaseStatus.data.datasets[3].data[3] = response.chartStatusFollowup.nCR
		leukemiaChartFollowupDiseaseStatus.data.datasets[4].data[4] = response.chartStatusFollowup.pr
		leukemiaChartFollowupDiseaseStatus.data.datasets[5].data[5] = response.chartStatusFollowup.pd
		leukemiaChartFollowupDiseaseStatus.data.datasets[6].data[6] = response.chartStatusFollowup.sd
		leukemiaChartFollowupDiseaseStatus.data.datasets[7].data[7] = response.chartStatusFollowup.completeHematologicResponse
		leukemiaChartFollowupDiseaseStatus.data.datasets[8].data[8] = response.chartStatusFollowup.completeCytogeneticResponse
		leukemiaChartFollowupDiseaseStatus.data.datasets[9].data[9] = response.chartStatusFollowup.majorMolecularResponse
		leukemiaChartFollowupDiseaseStatus.data.datasets[10].data[10] = response.chartStatusFollowup.spleenResponse
		leukemiaChartFollowupDiseaseStatus.data.datasets[11].data[11] = response.chartStatusFollowup.symptomResponse
		leukemiaChartFollowupDiseaseStatus.data.datasets[12].data[12] = response.chartStatusFollowup.dead
		leukemiaChartFollowupDiseaseStatus.data.datasets[13].data[13] = response.chartStatusFollowup.others

		leukemiaChartFollowupDiseaseStatus.update()
	}).fail(function() {
	});
});
$("#followupStatisticsToLeukemia").on('input', function() {
	alert("asd")
	restoreValues()
	params.followupPass = '1'
	params.action = '3'
	params.sortFrom = $("#followupStatisticsFromLeukemia").val()
	params.sortTo = $("#followupStatisticsToLeukemia").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[0] = response.chartStatusFollowup.relapsed
		leukemiaChartFollowupDiseaseStatus.data.datasets[1].data[1] = response.chartStatusFollowup.refractoryDisease
		leukemiaChartFollowupDiseaseStatus.data.datasets[2].data[2] = response.chartStatusFollowup.cr
		leukemiaChartFollowupDiseaseStatus.data.datasets[3].data[3] = response.chartStatusFollowup.nCR
		leukemiaChartFollowupDiseaseStatus.data.datasets[4].data[4] = response.chartStatusFollowup.pr
		leukemiaChartFollowupDiseaseStatus.data.datasets[5].data[5] = response.chartStatusFollowup.pd
		leukemiaChartFollowupDiseaseStatus.data.datasets[6].data[6] = response.chartStatusFollowup.sd
		leukemiaChartFollowupDiseaseStatus.data.datasets[7].data[7] = response.chartStatusFollowup.completeHematologicResponse
		leukemiaChartFollowupDiseaseStatus.data.datasets[8].data[8] = response.chartStatusFollowup.completeCytogeneticResponse
		leukemiaChartFollowupDiseaseStatus.data.datasets[9].data[9] = response.chartStatusFollowup.majorMolecularResponse
		leukemiaChartFollowupDiseaseStatus.data.datasets[10].data[10] = response.chartStatusFollowup.spleenResponse
		leukemiaChartFollowupDiseaseStatus.data.datasets[11].data[11] = response.chartStatusFollowup.symptomResponse
		leukemiaChartFollowupDiseaseStatus.data.datasets[12].data[12] = response.chartStatusFollowup.dead
		leukemiaChartFollowupDiseaseStatus.data.datasets[13].data[13] = response.chartStatusFollowup.others

		leukemiaChartFollowupDiseaseStatus.update()
	}).fail(function() {
	});
});

// lymphoma
// from and to
// age
$("#ageStatisticsFromLymphoma").on('input', function() {
	restoreValues()
	params.agePass = '1'
	params.action = '4'
	params.sortFrom = $("#ageStatisticsFromLymphoma").val()
	params.sortTo = $("#ageStatisticsFromLymphoma").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		for (var i = 0; i < response.chartAge.ageChart.length; i++) {
			lymphomaChartAge.data.datasets[0].data[i] = response.chartAge.ageChart[i];
		}
		lymphomaChartAge.update()
	}).fail(function() {
	});
});
$("#ageStatisticsToLymphoma").on('input', function() {
	restoreValues()
	params.agePass = '1'
	params.action = '4'
	params.sortFrom = $("#ageStatisticsFromLymphoma").val()
	params.sortTo = $("#ageStatisticsFromLymphoma").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		for (var i = 0; i < response.chartAge.ageChart.length; i++) {
			lymphomaChartAge.data.datasets[0].data[i] = response.chartAge.ageChart[i];
		}
		lymphomaChartAge.update()
	}).fail(function() {
	});
});

// gender
$("#genderStatisticsFromLymphoma").on('input', function() {
	restoreValues()
	params.genderPass = '1'
	params.action = '4'
	params.sortFrom = $("#genderStatisticsFromLymphoma").val()
	params.sortTo = $("#genderStatisticsToLymphoma").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		lymphomaChartGender.data.datasets[0].data[0] = response.maleChart;
		lymphomaChartGender.data.datasets[0].data[1] = response.femaleChart;

		lymphomaChartGender.update()
	}).fail(function() {
	});
});
$("#genderStatisticsToLymphoma").on('input', function() {
	restoreValues()
	params.genderPass = '1'
	params.action = '4'
	params.sortFrom = $("#genderStatisticsFromLymphoma").val()
	params.sortTo = $("#genderStatisticsToLymphoma").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		lymphomaChartGender.data.datasets[0].data[0] = response.maleChart;
		lymphomaChartGender.data.datasets[0].data[1] = response.femaleChart;

		lymphomaChartGender.update()
	}).fail(function() {
	});
});

// mode
$("#modeOfTreatmentStatisticsFromLymphoma").on('input', function() {
	restoreValues()
	params.modeOfTreatmentPass = '1'
	params.action = '4'
	params.sortFrom = $("#modeOfTreatmentStatisticsFromLymphoma").val()
	params.sortTo = $("#modeOfTreatmentStatisticsToLymphoma").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		lymphomaChartModeOfTreatment.data.datasets[0].data[0] = response.chartModeOfTreatmentBean.pharmacologic1stLine
		lymphomaChartModeOfTreatment.data.datasets[1].data[1] = response.chartModeOfTreatmentBean.pharmacologic2ndLineSalvage
		lymphomaChartModeOfTreatment.data.datasets[2].data[2] = response.chartModeOfTreatmentBean.supportivePalliativeOnly

		lymphomaChartModeOfTreatment.update()
	}).fail(function() {
	});
});
$("#modeOfTreatmentStatisticsToLymphoma").on('input', function() {
	restoreValues()
	params.modeOfTreatmentPass = '1'
	params.action = '4'
	params.sortFrom = $("#modeOfTreatmentStatisticsFromLymphoma").val()
	params.sortTo = $("#modeOfTreatmentStatisticsToLymphoma").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		lymphomaChartModeOfTreatment.data.datasets[0].data[0] = response.chartModeOfTreatmentBean.pharmacologic1stLine
		lymphomaChartModeOfTreatment.data.datasets[1].data[1] = response.chartModeOfTreatmentBean.pharmacologic2ndLineSalvage
		lymphomaChartModeOfTreatment.data.datasets[2].data[2] = response.chartModeOfTreatmentBean.supportivePalliativeOnly

		lymphomaChartModeOfTreatment.update()
	}).fail(function() {
	});
});

// baseline
$("#baselineStatisticsFromLymphoma").on('input', function() {
	restoreValues()
	params.baselinePass = '1'
	params.action = '4'
	params.sortFrom = $("#baselineStatisticsFromLymphoma").val()
	params.sortTo = $("#baselineStatisticsToLymphoma").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		lymphomaChartBaselineDiseaseStatus.data.datasets[0].data[0] = response.chartStatusBaseline.newlyDiagnosed
		lymphomaChartBaselineDiseaseStatus.data.datasets[1].data[1] = response.chartStatusBaseline.cr
		lymphomaChartBaselineDiseaseStatus.data.datasets[2].data[2] = response.chartStatusBaseline.pr
		lymphomaChartBaselineDiseaseStatus.data.datasets[3].data[3] = response.chartStatusBaseline.sd
		lymphomaChartBaselineDiseaseStatus.data.datasets[4].data[4] = response.chartStatusBaseline.pd

		lymphomaChartBaselineDiseaseStatus.update()
	}).fail(function() {
	});
});
$("#baselineStatisticsToLymphoma").on('input', function() {
	restoreValues()
	params.baselinePass = '1'
	params.action = '4'
	params.sortFrom = $("#baselineStatisticsFromLymphoma").val()
	params.sortTo = $("#baselineStatisticsToLymphoma").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		lymphomaChartBaselineDiseaseStatus.data.datasets[0].data[0] = response.chartStatusBaseline.newlyDiagnosed
		lymphomaChartBaselineDiseaseStatus.data.datasets[1].data[1] = response.chartStatusBaseline.cr
		lymphomaChartBaselineDiseaseStatus.data.datasets[2].data[2] = response.chartStatusBaseline.pr
		lymphomaChartBaselineDiseaseStatus.data.datasets[3].data[3] = response.chartStatusBaseline.sd
		lymphomaChartBaselineDiseaseStatus.data.datasets[4].data[4] = response.chartStatusBaseline.pd

		lymphomaChartBaselineDiseaseStatus.update()
	}).fail(function() {
	});
});

// followup
$("#followupStatisticsFromLymphoma").on('input', function() {
	restoreValues()
	params.followupPass = '1'
	params.action = '4'
	params.sortFrom = $("#followupStatisticsFromLymphoma").val()
	params.sortTo = $("#followupStatisticsToLymphoma").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		lymphomaChartFollowupDiseaseStatus.data.datasets[0].data[0] = response.chartStatusFollowup.cr
		lymphomaChartFollowupDiseaseStatus.data.datasets[1].data[1] = response.chartStatusFollowup.pr
		lymphomaChartFollowupDiseaseStatus.data.datasets[2].data[2] = response.chartStatusFollowup.sd
		lymphomaChartFollowupDiseaseStatus.data.datasets[3].data[3] = response.chartStatusFollowup.pd
		lymphomaChartFollowupDiseaseStatus.data.datasets[4].data[4] = response.chartStatusFollowup.rr
		lymphomaChartFollowupDiseaseStatus.data.datasets[5].data[5] = response.chartStatusFollowup.dead
		lymphomaChartFollowupDiseaseStatus.data.datasets[6].data[6] = response.chartStatusFollowup.others

		lymphomaChartFollowupDiseaseStatus.update()
	}).fail(function() {
	});
});
$("#followupStatisticsToLymphoma").on('input', function() {
	alert("asd")
	restoreValues()
	params.followupPass = '1'
	params.action = '4'
	params.sortFrom = $("#followupStatisticsFromLymphoma").val()
	params.sortTo = $("#followupStatisticsToLymphoma").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		lymphomaChartFollowupDiseaseStatus.data.datasets[0].data[0] = response.chartStatusFollowup.cr
		lymphomaChartFollowupDiseaseStatus.data.datasets[1].data[1] = response.chartStatusFollowup.pr
		lymphomaChartFollowupDiseaseStatus.data.datasets[2].data[2] = response.chartStatusFollowup.sd
		lymphomaChartFollowupDiseaseStatus.data.datasets[3].data[3] = response.chartStatusFollowup.pd
		lymphomaChartFollowupDiseaseStatus.data.datasets[4].data[4] = response.chartStatusFollowup.rr
		lymphomaChartFollowupDiseaseStatus.data.datasets[5].data[5] = response.chartStatusFollowup.dead
		lymphomaChartFollowupDiseaseStatus.data.datasets[6].data[6] = response.chartStatusFollowup.others

		lymphomaChartFollowupDiseaseStatus.update()
	}).fail(function() {
	});
});

// myelo

// from and to
// age
$("#ageStatisticsFromMyeloproliferative").on('input', function() {
	restoreValues()
	params.agePass = '1'
	params.action = '5'
	params.sortFrom = $("#ageStatisticsFromMyeloproliferative").val()
	params.sortTo = $("#ageStatisticsFromMyeloproliferative").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		for (var i = 0; i < response.chartAge.ageChart.length; i++) {
			myeloChartAge.data.datasets[0].data[i] = response.chartAge.ageChart[i];
		}
		myeloChartAge.update()
	}).fail(function() {
	});

});
$("#ageStatisticsToMyeloproliferative").on('input', function() {
	restoreValues()
	params.agePass = '1'
	params.action = '5'
	params.sortFrom = $("#ageStatisticsFromMyeloproliferative").val()
	params.sortTo = $("#ageStatisticsFromMyeloproliferative").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		for (var i = 0; i < response.chartAge.ageChart.length; i++) {
			myeloChartAge.data.datasets[0].data[i] = response.chartAge.ageChart[i];
		}
		myeloChartAge.update()
	}).fail(function() {
	});
});

// gender
$("#genderStatisticsFromMyeloproliferative").on('input', function() {
	restoreValues()
	params.genderPass = '1'
	params.action = '5'
	params.sortFrom = $("#genderStatisticsFromMyeloproliferative").val()
	params.sortTo = $("#genderStatisticsToMyeloproliferative").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		myeloChartGender.data.datasets[0].data[0] = response.maleChart;
		myeloChartGender.data.datasets[0].data[1] = response.femaleChart;

		myeloChartGender.update()
	}).fail(function() {
	});
});
$("#genderStatisticsToMyeloproliferative").on('input', function() {
	restoreValues()
	params.genderPass = '1'
	params.action = '5'
	params.sortFrom = $("#genderStatisticsFromMyeloproliferative").val()
	params.sortTo = $("#genderStatisticsToMyeloproliferative").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		myeloChartGender.data.datasets[0].data[0] = response.maleChart;
		myeloChartGender.data.datasets[0].data[1] = response.femaleChart;

		myeloChartGender.update()
	}).fail(function() {
	});
});

// mode
$("#modeOfTreatmentStatisticsFromMyeloproliferative").on('input', function() {
	restoreValues()
	params.modeOfTreatmentPass = '1'
	params.action = '5'
	params.sortFrom = $("#modeOfTreatmentStatisticsFromMyeloproliferative").val()
	params.sortTo = $("#modeOfTreatmentStatisticsToMyeloproliferative").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		myeloChartModeOfTreatment.data.datasets[0].data[0] = response.chartModeOfTreatmentBean.pharmacologicTreatment
		myeloChartModeOfTreatment.data.datasets[1].data[1] = response.chartModeOfTreatmentBean.supportivePalliativeOnly
		myeloChartModeOfTreatment.data.datasets[2].data[2] = response.chartModeOfTreatmentBean.watchAndWait
		myeloChartModeOfTreatment.data.datasets[3].data[3] = response.chartModeOfTreatmentBean.others

		myeloChartModeOfTreatment.update()
	}).fail(function() {
	});
});
$("#modeOfTreatmentStatisticsToMyeloproliferative").on('input', function() {
	restoreValues()
	params.modeOfTreatmentPass = '1'
	params.action = '5'
	params.sortFrom = $("#modeOfTreatmentStatisticsFromMyeloproliferative").val()
	params.sortTo = $("#modeOfTreatmentStatisticsToMyeloproliferative").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		myeloChartModeOfTreatment.data.datasets[0].data[0] = response.chartModeOfTreatmentBean.pharmacologicTreatment
		myeloChartModeOfTreatment.data.datasets[1].data[1] = response.chartModeOfTreatmentBean.supportivePalliativeOnly
		myeloChartModeOfTreatment.data.datasets[2].data[2] = response.chartModeOfTreatmentBean.watchAndWait
		myeloChartModeOfTreatment.data.datasets[3].data[3] = response.chartModeOfTreatmentBean.others

		myeloChartModeOfTreatment.update()
	}).fail(function() {
	});
});

// baseline
$("#baselineStatisticsFromMyeloproliferative").on('input', function() {
	restoreValues()
	params.baselinePass = '1'
	params.action = '5'
	params.sortFrom = $("#baselineStatisticsFromMyeloproliferative").val()
	params.sortTo = $("#baselineStatisticsToMyeloproliferative").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		myeloChartBaselineDiseaseStatus.data.datasets[0].data[0] = response.chartStatusBaseline.cr
		myeloChartBaselineDiseaseStatus.data.datasets[1].data[1] = response.chartStatusBaseline.pr
		myeloChartBaselineDiseaseStatus.data.datasets[2].data[2] = response.chartStatusBaseline.pd
		myeloChartBaselineDiseaseStatus.data.datasets[3].data[3] = response.chartStatusBaseline.sd
		myeloChartBaselineDiseaseStatus.data.datasets[4].data[4] = response.chartStatusBaseline.hematologicResponse
		myeloChartBaselineDiseaseStatus.data.datasets[5].data[5] = response.chartStatusBaseline.spleenResponse
		myeloChartBaselineDiseaseStatus.data.datasets[6].data[6] = response.chartStatusBaseline.symptomResponse
		myeloChartBaselineDiseaseStatus.data.datasets[7].data[7] = response.chartStatusBaseline.others

		myeloChartBaselineDiseaseStatus.update()
	}).fail(function() {
	});
});
$("#baselineStatisticsToMyeloproliferative").on('input', function() {
	restoreValues()
	params.baselinePass = '1'
	params.action = '5'
	params.sortFrom = $("#baselineStatisticsFromMyeloproliferative").val()
	params.sortTo = $("#baselineStatisticsToMyeloproliferative").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		myeloChartBaselineDiseaseStatus.data.datasets[0].data[0] = response.chartStatusBaseline.cr
		myeloChartBaselineDiseaseStatus.data.datasets[1].data[1] = response.chartStatusBaseline.pr
		myeloChartBaselineDiseaseStatus.data.datasets[2].data[2] = response.chartStatusBaseline.pd
		myeloChartBaselineDiseaseStatus.data.datasets[3].data[3] = response.chartStatusBaseline.sd
		myeloChartBaselineDiseaseStatus.data.datasets[4].data[4] = response.chartStatusBaseline.hematologicResponse
		myeloChartBaselineDiseaseStatus.data.datasets[5].data[5] = response.chartStatusBaseline.spleenResponse
		myeloChartBaselineDiseaseStatus.data.datasets[6].data[6] = response.chartStatusBaseline.symptomResponse
		myeloChartBaselineDiseaseStatus.data.datasets[7].data[7] = response.chartStatusBaseline.others

		myeloChartBaselineDiseaseStatus.update()
	}).fail(function() {
	});
});

// followup
$("#followupStatisticsFromMyeloproliferative").on('input', function() {
	restoreValues()
	params.followupPass = '1'
	params.action = '5'
	params.sortFrom = $("#followupStatisticsFromMyeloproliferative").val()
	params.sortTo = $("#followupStatisticsToMyeloproliferative").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		myeloChartFollowupDiseaseStatus.data.datasets[0].data[0] = response.chartStatusFollowup.cr
		myeloChartFollowupDiseaseStatus.data.datasets[1].data[1] = response.chartStatusFollowup.pr
		myeloChartFollowupDiseaseStatus.data.datasets[2].data[2] = response.chartStatusFollowup.pd
		myeloChartFollowupDiseaseStatus.data.datasets[3].data[3] = response.chartStatusFollowup.sd
		myeloChartFollowupDiseaseStatus.data.datasets[4].data[4] = response.chartStatusFollowup.hematologicResponse
		myeloChartFollowupDiseaseStatus.data.datasets[5].data[5] = response.chartStatusFollowup.spleenResponse
		myeloChartFollowupDiseaseStatus.data.datasets[6].data[6] = response.chartStatusFollowup.symptomResponse
		myeloChartFollowupDiseaseStatus.data.datasets[7].data[7] = response.chartStatusFollowup.dead
		myeloChartFollowupDiseaseStatus.data.datasets[8].data[8] = response.chartStatusFollowup.others

		myeloChartFollowupDiseaseStatus.update()
	}).fail(function() {
	});
});
$("#followupStatisticsToMyeloproliferative").on('input', function() {
	alert("asd")
	restoreValues()
	params.followupPass = '1'
	params.action = '5'
	params.sortFrom = $("#followupStatisticsFromMyeloproliferative").val()
	params.sortTo = $("#followupStatisticsToMyeloproliferative").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		myeloChartFollowupDiseaseStatus.data.datasets[0].data[0] = response.chartStatusFollowup.cr
		myeloChartFollowupDiseaseStatus.data.datasets[1].data[1] = response.chartStatusFollowup.pr
		myeloChartFollowupDiseaseStatus.data.datasets[2].data[2] = response.chartStatusFollowup.pd
		myeloChartFollowupDiseaseStatus.data.datasets[3].data[3] = response.chartStatusFollowup.sd
		myeloChartFollowupDiseaseStatus.data.datasets[4].data[4] = response.chartStatusFollowup.hematologicResponse
		myeloChartFollowupDiseaseStatus.data.datasets[5].data[5] = response.chartStatusFollowup.spleenResponse
		myeloChartFollowupDiseaseStatus.data.datasets[6].data[6] = response.chartStatusFollowup.symptomResponse
		myeloChartFollowupDiseaseStatus.data.datasets[7].data[7] = response.chartStatusFollowup.dead
		myeloChartFollowupDiseaseStatus.data.datasets[8].data[8] = response.chartStatusFollowup.others

		myeloChartFollowupDiseaseStatus.update()
	}).fail(function() {
	});
});

// plasmacell
// from and to
// age
$("#ageStatisticsFromPlasmacell").on('input', function() {
	restoreValues()
	params.agePass = '1'
	params.action = '6'
	params.sortFrom = $("#ageStatisticsFromPlasmacell").val()
	params.sortTo = $("#ageStatisticsFromPlasmacell").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		for (var i = 0; i < response.chartAge.ageChart.length; i++) {
			plasmaCellChartAge.data.datasets[0].data[i] = response.chartAge.ageChart[i];
		}
		plasmaCellChartAge.update()
	}).fail(function() {
	});

});
$("#ageStatisticsToPlasmacell").on('input', function() {
	restoreValues()
	params.agePass = '1'
	params.action = '6'
	params.sortFrom = $("#ageStatisticsFromPlasmacell").val()
	params.sortTo = $("#ageStatisticsFromPlasmacell").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		for (var i = 0; i < response.chartAge.ageChart.length; i++) {
			plasmaCellChartAge.data.datasets[0].data[i] = response.chartAge.ageChart[i];
		}
		plasmaCellChartAge.update()
	}).fail(function() {
	});
});

// gender
$("#genderStatisticsFromPlasmacell").on('input', function() {
	restoreValues()
	params.genderPass = '1'
	params.action = '6'
	params.sortFrom = $("#genderStatisticsFromPlasmacell").val()
	params.sortTo = $("#genderStatisticsToPlasmacell").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		plasmaCellChartGender.data.datasets[0].data[0] = response.maleChart;
		plasmaCellChartGender.data.datasets[0].data[1] = response.femaleChart;

		plasmaCellChartGender.update()
	}).fail(function() {
	});
});
$("#genderStatisticsToPlasmacell").on('input', function() {
	restoreValues()
	params.genderPass = '1'
	params.action = '6'
	params.sortFrom = $("#genderStatisticsFromPlasmacell").val()
	params.sortTo = $("#genderStatisticsToPlasmacell").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		plasmaCellChartGender.data.datasets[0].data[0] = response.maleChart;
		plasmaCellChartGender.data.datasets[0].data[1] = response.femaleChart;

		plasmaCellChartGender.update()
	}).fail(function() {
	});
});

// mode
$("#modeOfTreatmentStatisticsFromPlasmacell").on('input', function() {
	restoreValues()
	params.modeOfTreatmentPass = '1'
	params.action = '6'
	params.sortFrom = $("#modeOfTreatmentStatisticsFromPlasmacell").val()
	params.sortTo = $("#modeOfTreatmentStatisticsToPlasmacell").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		plasmaCellChartModeOfTreatment.data.datasets[0].data[0] = response.chartModeOfTreatmentBean.pharmacologicForTransplantCandidate
		plasmaCellChartModeOfTreatment.data.datasets[1].data[1] = response.chartModeOfTreatmentBean.pharmacologicForNonTransplantCandidate
		plasmaCellChartModeOfTreatment.data.datasets[2].data[2] = response.chartModeOfTreatmentBean.maintenance
		plasmaCellChartModeOfTreatment.data.datasets[3].data[3] = response.chartModeOfTreatmentBean.radiotherapy
		plasmaCellChartModeOfTreatment.data.datasets[4].data[4] = response.chartModeOfTreatmentBean.supportive
		plasmaCellChartModeOfTreatment.data.datasets[5].data[5] = response.chartModeOfTreatmentBean.watchAndWait
		plasmaCellChartModeOfTreatment.data.datasets[6].data[6] = response.chartModeOfTreatmentBean.others

		plasmaCellChartModeOfTreatment.update()
	}).fail(function() {
	});
});
$("#modeOfTreatmentStatisticsToPlasmacell").on('input', function() {
	restoreValues()
	params.modeOfTreatmentPass = '1'
	params.action = '6'
	params.sortFrom = $("#modeOfTreatmentStatisticsFromPlasmacell").val()
	params.sortTo = $("#modeOfTreatmentStatisticsToPlasmacell").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		plasmaCellChartModeOfTreatment.data.datasets[0].data[0] = response.chartModeOfTreatmentBean.pharmacologicForTransplantCandidate
		plasmaCellChartModeOfTreatment.data.datasets[1].data[1] = response.chartModeOfTreatmentBean.pharmacologicForNonTransplantCandidate
		plasmaCellChartModeOfTreatment.data.datasets[2].data[2] = response.chartModeOfTreatmentBean.maintenance
		plasmaCellChartModeOfTreatment.data.datasets[3].data[3] = response.chartModeOfTreatmentBean.radiotherapy
		plasmaCellChartModeOfTreatment.data.datasets[4].data[4] = response.chartModeOfTreatmentBean.supportive
		plasmaCellChartModeOfTreatment.data.datasets[5].data[5] = response.chartModeOfTreatmentBean.watchAndWait
		plasmaCellChartModeOfTreatment.data.datasets[6].data[6] = response.chartModeOfTreatmentBean.others

		plasmaCellChartModeOfTreatment.update()
	}).fail(function() {
	});
});

// baseline
$("#baselineStatisticsFromPlasmacell").on('input', function() {
	restoreValues()
	params.baselinePass = '1'
	params.action = '6'
	params.sortFrom = $("#baselineStatisticsFromPlasmacell").val()
	params.sortTo = $("#baselineStatisticsToPlasmacell").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[0] = response.chartStatusBaseline.cr
		plasmaCellChartBaselineDiseaseStatus.data.datasets[1].data[1] = response.chartStatusBaseline.sCR
		plasmaCellChartBaselineDiseaseStatus.data.datasets[2].data[2] = response.chartStatusBaseline.immunophenotypicCR
		plasmaCellChartBaselineDiseaseStatus.data.datasets[3].data[3] = response.chartStatusBaseline.molecularCR
		plasmaCellChartBaselineDiseaseStatus.data.datasets[4].data[4] = response.chartStatusBaseline.vgpr
		plasmaCellChartBaselineDiseaseStatus.data.datasets[5].data[5] = response.chartStatusBaseline.pr
		plasmaCellChartBaselineDiseaseStatus.data.datasets[6].data[6] = response.chartStatusBaseline.mr
		plasmaCellChartBaselineDiseaseStatus.data.datasets[7].data[7] = response.chartStatusBaseline.sd
		plasmaCellChartBaselineDiseaseStatus.data.datasets[8].data[8] = response.chartStatusBaseline.pd
		plasmaCellChartBaselineDiseaseStatus.data.datasets[9].data[9] = response.chartStatusBaseline.relapsed
		//plasmaCellChartBaselineDiseaseStatus.data.datasets[10].data[10] = response.chartStatusBaseline.clinicalRelapse
		//plasmaCellChartBaselineDiseaseStatus.data.datasets[11].data[11] = response.chartStatusBaseline.relapseFromCR
		plasmaCellChartBaselineDiseaseStatus.data.datasets[10].data[10] = response.chartStatusBaseline.others

		plasmaCellChartBaselineDiseaseStatus.update()
	}).fail(function() {
	});
});
$("#baselineStatisticsToPlasmacell").on('input', function() {
	restoreValues()
	params.baselinePass = '1'
	params.action = '6'
	params.sortFrom = $("#baselineStatisticsFromPlasmacell").val()
	params.sortTo = $("#baselineStatisticsToPlasmacell").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[0] = response.chartStatusBaseline.cr
		plasmaCellChartBaselineDiseaseStatus.data.datasets[1].data[1] = response.chartStatusBaseline.sCR
		plasmaCellChartBaselineDiseaseStatus.data.datasets[2].data[2] = response.chartStatusBaseline.immunophenotypicCR
		plasmaCellChartBaselineDiseaseStatus.data.datasets[3].data[3] = response.chartStatusBaseline.molecularCR
		plasmaCellChartBaselineDiseaseStatus.data.datasets[4].data[4] = response.chartStatusBaseline.vgpr
		plasmaCellChartBaselineDiseaseStatus.data.datasets[5].data[5] = response.chartStatusBaseline.pr
		plasmaCellChartBaselineDiseaseStatus.data.datasets[6].data[6] = response.chartStatusBaseline.mr
		plasmaCellChartBaselineDiseaseStatus.data.datasets[7].data[7] = response.chartStatusBaseline.sd
		plasmaCellChartBaselineDiseaseStatus.data.datasets[8].data[8] = response.chartStatusBaseline.pd
		plasmaCellChartBaselineDiseaseStatus.data.datasets[9].data[9] = response.chartStatusBaseline.relapsed
		//plasmaCellChartBaselineDiseaseStatus.data.datasets[10].data[10] = response.chartStatusBaseline.clinicalRelapse
		//plasmaCellChartBaselineDiseaseStatus.data.datasets[11].data[11] = response.chartStatusBaseline.relapseFromCR
		plasmaCellChartBaselineDiseaseStatus.data.datasets[10].data[10] = response.chartStatusBaseline.others

		plasmaCellChartBaselineDiseaseStatus.update()
	}).fail(function() {
	});
});

// followup
$("#followupStatisticsFromPlasmacell").on('input', function() {
	restoreValues()
	params.followupPass = '1'
	params.action = '6'
	params.sortFrom = $("#followupStatisticsFromPlasmacell").val()
	params.sortTo = $("#followupStatisticsToPlasmacell").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[0] = response.chartStatusFollowup.cr
		plasmaCellChartFollowupDiseaseStatus.data.datasets[1].data[1] = response.chartStatusFollowup.sCR
		plasmaCellChartFollowupDiseaseStatus.data.datasets[2].data[2] = response.chartStatusFollowup.immunophenotypicCR
		plasmaCellChartFollowupDiseaseStatus.data.datasets[3].data[3] = response.chartStatusFollowup.molecularCR
		plasmaCellChartFollowupDiseaseStatus.data.datasets[4].data[4] = response.chartStatusFollowup.vgpr
		plasmaCellChartFollowupDiseaseStatus.data.datasets[5].data[5] = response.chartStatusFollowup.pr
		plasmaCellChartFollowupDiseaseStatus.data.datasets[6].data[6] = response.chartStatusFollowup.mr
		plasmaCellChartFollowupDiseaseStatus.data.datasets[7].data[7] = response.chartStatusFollowup.sd
		plasmaCellChartFollowupDiseaseStatus.data.datasets[8].data[8] = response.chartStatusFollowup.pd
		plasmaCellChartFollowupDiseaseStatus.data.datasets[9].data[9] = response.chartStatusFollowup.relapsed
		//plasmaCellChartFollowupDiseaseStatus.data.datasets[10].data[10] = response.chartStatusFollowup.clinicalRelapse
		//plasmaCellChartFollowupDiseaseStatus.data.datasets[11].data[11] = response.chartStatusFollowup.relapseFromCR
		plasmaCellChartFollowupDiseaseStatus.data.datasets[10].data[10] = response.chartStatusFollowup.others
		plasmaCellChartFollowupDiseaseStatus.data.datasets[11].data[11] = response.chartStatusFollowup.dead

		plasmaCellChartFollowupDiseaseStatus.update()
	}).fail(function() {
	});
});
$("#followupStatisticsToPlasmacell").on('input', function() {
	alert("asd")
	restoreValues()
	params.followupPass = '1'
	params.action = '6'
	params.sortFrom = $("#followupStatisticsFromPlasmacell").val()
	params.sortTo = $("#followupStatisticsToPlasmacell").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[0] = response.chartStatusFollowup.cr
		plasmaCellChartFollowupDiseaseStatus.data.datasets[1].data[1] = response.chartStatusFollowup.sCR
		plasmaCellChartFollowupDiseaseStatus.data.datasets[2].data[2] = response.chartStatusFollowup.immunophenotypicCR
		plasmaCellChartFollowupDiseaseStatus.data.datasets[3].data[3] = response.chartStatusFollowup.molecularCR
		plasmaCellChartFollowupDiseaseStatus.data.datasets[4].data[4] = response.chartStatusFollowup.vgpr
		plasmaCellChartFollowupDiseaseStatus.data.datasets[5].data[5] = response.chartStatusFollowup.pr
		plasmaCellChartFollowupDiseaseStatus.data.datasets[6].data[6] = response.chartStatusFollowup.mr
		plasmaCellChartFollowupDiseaseStatus.data.datasets[7].data[7] = response.chartStatusFollowup.sd
		plasmaCellChartFollowupDiseaseStatus.data.datasets[8].data[8] = response.chartStatusFollowup.pd
		plasmaCellChartFollowupDiseaseStatus.data.datasets[9].data[9] = response.chartStatusFollowup.relapsed
		//plasmaCellChartFollowupDiseaseStatus.data.datasets[10].data[10] = response.chartStatusFollowup.clinicalRelapse
		//plasmaCellChartFollowupDiseaseStatus.data.datasets[11].data[11] = response.chartStatusFollowup.relapseFromCR
		plasmaCellChartFollowupDiseaseStatus.data.datasets[10].data[10] = response.chartStatusFollowup.others
		plasmaCellChartFollowupDiseaseStatus.data.datasets[11].data[11] = response.chartStatusFollowup.dead

		plasmaCellChartFollowupDiseaseStatus.update()
	}).fail(function() {
	});
});

// aap

// from and to
// age
$("#ageStatisticsFromAAPNHMDS").on('input', function() {
	restoreValues()
	params.agePass = '1'
	params.action = '1'
	params.sortFrom = $("#ageStatisticsFromAAPNHMDS").val()
	params.sortTo = $("#ageStatisticsFromAAPNHMDS").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		for (var i = 0; i < response.chartAge.ageChart.length; i++) {
			aapnhmdsChartAge.data.datasets[0].data[i] = response.chartAge.ageChart[i];
		}
		aapnhmdsChartAge.update()
	}).fail(function() {
	});

});
$("#ageStatisticsToAAPNHMDS").on('input', function() {
	restoreValues()
	params.agePass = '1'
	params.action = '1'
	params.sortFrom = $("#ageStatisticsFromAAPNHMDS").val()
	params.sortTo = $("#ageStatisticsFromAAPNHMDS").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		for (var i = 0; i < response.chartAge.ageChart.length; i++) {
			aapnhmdsChartAge.data.datasets[0].data[i] = response.chartAge.ageChart[i];
		}
		aapnhmdsChartAge.update()
	}).fail(function() {
	});
});

// gender
$("#genderStatisticsFromAAPNHMDS").on('input', function() {
	restoreValues()
	params.genderPass = '1'
	params.action = '1'
	params.sortFrom = $("#genderStatisticsFromAAPNHMDS").val()
	params.sortTo = $("#genderStatisticsToAAPNHMDS").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		aapnhmdsChartGender.data.datasets[0].data[0] = response.maleChart;
		aapnhmdsChartGender.data.datasets[0].data[1] = response.femaleChart;

		aapnhmdsChartGender.update()
	}).fail(function() {
	});
});
$("#genderStatisticsToAAPNHMDS").on('input', function() {
	restoreValues()
	params.genderPass = '1'
	params.action = '1'
	params.sortFrom = $("#genderStatisticsFromAAPNHMDS").val()
	params.sortTo = $("#genderStatisticsToAAPNHMDS").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		aapnhmdsChartGender.data.datasets[0].data[0] = response.maleChart;
		aapnhmdsChartGender.data.datasets[0].data[1] = response.femaleChart;

		aapnhmdsChartGender.update()
	}).fail(function() {
	});
});

// mode
$("#modeOfTreatmentStatisticsFromAAPNHMDS").on('input', function() {
	restoreValues()
	params.modeOfTreatmentPass = '1'
	params.action = '1'
	params.sortFrom = $("#modeOfTreatmentStatisticsFromAAPNHMDS").val()
	params.sortTo = $("#modeOfTreatmentStatisticsToAAPNHMDS").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		aapnhmdsChartModeOfTreatment.data.datasets[0].data[0] = response.chartModeOfTreatmentBean.hematopoieticStemCellTransplantation
		aapnhmdsChartModeOfTreatment.data.datasets[1].data[1] = response.chartModeOfTreatmentBean.pharmacologicTreatment
		aapnhmdsChartModeOfTreatment.data.datasets[2].data[2] = response.chartModeOfTreatmentBean.supportive
		aapnhmdsChartModeOfTreatment.data.datasets[3].data[3] = response.chartModeOfTreatmentBean.bothPharmacologicAndSupportive
		aapnhmdsChartModeOfTreatment.data.datasets[4].data[4] = response.chartModeOfTreatmentBean.watchAndWait

		aapnhmdsChartModeOfTreatment.update()
	}).fail(function() {
	});
});
$("#modeOfTreatmentStatisticsToAAPNHMDS").on('input', function() {
	restoreValues()
	params.modeOfTreatmentPass = '1'
	params.action = '1'
	params.sortFrom = $("#modeOfTreatmentStatisticsFromAAPNHMDS").val()
	params.sortTo = $("#modeOfTreatmentStatisticsToAAPNHMDS").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		aapnhmdsChartModeOfTreatment.data.datasets[0].data[0] = response.chartModeOfTreatmentBean.hematopoieticStemCellTransplantation
		aapnhmdsChartModeOfTreatment.data.datasets[1].data[1] = response.chartModeOfTreatmentBean.pharmacologicTreatment
		aapnhmdsChartModeOfTreatment.data.datasets[2].data[2] = response.chartModeOfTreatmentBean.supportive
		aapnhmdsChartModeOfTreatment.data.datasets[3].data[3] = response.chartModeOfTreatmentBean.bothPharmacologicAndSupportive
		aapnhmdsChartModeOfTreatment.data.datasets[4].data[4] = response.chartModeOfTreatmentBean.watchAndWait

		aapnhmdsChartModeOfTreatment.update()
	}).fail(function() {
	});
});

// baseline
$("#baselineStatisticsFromAAPNHMDS").on('input', function() {
	restoreValues()
	params.baselinePass = '1'
	params.action = '1'
	params.sortFrom = $("#baselineStatisticsFromAAPNHMDS").val()
	params.sortTo = $("#baselineStatisticsToAAPNHMDS").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		aapnhmdsChartBaselineDiseaseStatus.data.datasets[0].data[0] = response.chartStatusBaseline.hematologicResponse
		aapnhmdsChartBaselineDiseaseStatus.data.datasets[1].data[1] = response.chartStatusBaseline.sd
		aapnhmdsChartBaselineDiseaseStatus.data.datasets[2].data[2] = response.chartStatusBaseline.relapsed
		aapnhmdsChartBaselineDiseaseStatus.data.datasets[3].data[3] = response.chartStatusBaseline.others

		aapnhmdsChartBaselineDiseaseStatus.update()
	}).fail(function() {
	});
});
$("#baselineStatisticsToAAPNHMDS").on('input', function() {
	restoreValues()
	params.baselinePass = '1'
	params.action = '1'
	params.sortFrom = $("#baselineStatisticsFromAAPNHMDS").val()
	params.sortTo = $("#baselineStatisticsToAAPNHMDS").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		aapnhmdsChartBaselineDiseaseStatus.data.datasets[0].data[0] = response.chartStatusBaseline.hematologicResponse
		aapnhmdsChartBaselineDiseaseStatus.data.datasets[1].data[1] = response.chartStatusBaseline.sd
		aapnhmdsChartBaselineDiseaseStatus.data.datasets[2].data[2] = response.chartStatusBaseline.relapsed
		aapnhmdsChartBaselineDiseaseStatus.data.datasets[3].data[3] = response.chartStatusBaseline.others

		aapnhmdsChartBaselineDiseaseStatus.update()
	}).fail(function() {
	});
});

// followup
$("#followupStatisticsFromAAPNHMDS").on('input', function() {
	restoreValues()
	params.followupPass = '1'
	params.action = '1'
	params.sortFrom = $("#followupStatisticsFromAAPNHMDS").val()
	params.sortTo = $("#followupStatisticsToAAPNHMDS").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		aapnhmdsChartFollowupDiseaseStatus.data.datasets[0].data[0] = response.chartStatusFollowup.hematologicResponse
		aapnhmdsChartFollowupDiseaseStatus.data.datasets[1].data[1] = response.chartStatusFollowup.sd
		aapnhmdsChartFollowupDiseaseStatus.data.datasets[2].data[2] = response.chartStatusFollowup.relapsed
		aapnhmdsChartFollowupDiseaseStatus.data.datasets[3].data[3] = response.chartStatusFollowup.dead
		aapnhmdsChartFollowupDiseaseStatus.data.datasets[4].data[4] = response.chartStatusFollowup.others

		aapnhmdsChartFollowupDiseaseStatus.update()
	}).fail(function() {
	});
});
$("#followupStatisticsToAAPNHMDS").on('input', function() {
	alert("asd")
	restoreValues()
	params.followupPass = '1'
	params.action = '1'
	params.sortFrom = $("#followupStatisticsFromAAPNHMDS").val()
	params.sortTo = $("#followupStatisticsToAAPNHMDS").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		aapnhmdsChartFollowupDiseaseStatus.data.datasets[0].data[0] = response.chartStatusFollowup.hematologicResponse
		aapnhmdsChartFollowupDiseaseStatus.data.datasets[1].data[1] = response.chartStatusFollowup.sd
		aapnhmdsChartFollowupDiseaseStatus.data.datasets[2].data[2] = response.chartStatusFollowup.relapsed
		aapnhmdsChartFollowupDiseaseStatus.data.datasets[3].data[3] = response.chartStatusFollowup.dead
		aapnhmdsChartFollowupDiseaseStatus.data.datasets[4].data[4] = response.chartStatusFollowup.others

		aapnhmdsChartFollowupDiseaseStatus.update()
	}).fail(function() {
	});
});

// platelet
// from and to
// age
$("#ageStatisticsFromPlateletDisorder").on('input', function() {
	restoreValues()
	params.agePass = '1'
	params.action = '7'
	params.sortFrom = $("#ageStatisticsFromPlateletDisorder").val()
	params.sortTo = $("#ageStatisticsFromPlateletDisorder").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		for (var i = 0; i < response.chartAge.ageChart.length; i++) {
			plateletChartAge.data.datasets[0].data[i] = response.chartAge.ageChart[i];
		}
		plateletChartAge.update()
	}).fail(function() {
	});

});
$("#ageStatisticsToPlateletDisorder").on('input', function() {
	restoreValues()
	params.agePass = '1'
	params.action = '7'
	params.sortFrom = $("#ageStatisticsFromPlateletDisorder").val()
	params.sortTo = $("#ageStatisticsFromPlateletDisorder").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		for (var i = 0; i < response.chartAge.ageChart.length; i++) {
			plateletChartAge.data.datasets[0].data[i] = response.chartAge.ageChart[i];
		}
		plateletChartAge.update()
	}).fail(function() {
	});
});

// gender
$("#genderStatisticsFromPlateletDisorder").on('input', function() {
	restoreValues()
	params.genderPass = '1'
	params.action = '7'
	params.sortFrom = $("#genderStatisticsFromPlateletDisorder").val()
	params.sortTo = $("#genderStatisticsToPlateletDisorder").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		plateletChartGender.data.datasets[0].data[0] = response.maleChart;
		plateletChartGender.data.datasets[0].data[1] = response.femaleChart;

		plateletChartGender.update()
	}).fail(function() {
	});
});
$("#genderStatisticsToPlateletDisorder").on('input', function() {
	restoreValues()
	params.genderPass = '1'
	params.action = '7'
	params.sortFrom = $("#genderStatisticsFromPlateletDisorder").val()
	params.sortTo = $("#genderStatisticsToPlateletDisorder").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		plateletChartGender.data.datasets[0].data[0] = response.maleChart;
		plateletChartGender.data.datasets[0].data[1] = response.femaleChart;

		plateletChartGender.update()
	}).fail(function() {
	});
});

// mode
$("#modeOfTreatmentStatisticsFromPlateletDisorder").on('input', function() {
	restoreValues()
	params.modeOfTreatmentPass = '1'
	params.action = '7'
	params.sortFrom = $("#modeOfTreatmentStatisticsFromPlateletDisorder").val()
	params.sortTo = $("#modeOfTreatmentStatisticsToPlateletDisorder").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		plateletChartModeOfTreatment.data.datasets[0].data[0] = response.chartModeOfTreatmentBean.pharmacologic1stLine
		plateletChartModeOfTreatment.data.datasets[1].data[1] = response.chartModeOfTreatmentBean.pharmacologic2ndLine
		plateletChartModeOfTreatment.data.datasets[2].data[2] = response.chartModeOfTreatmentBean.supportivePalliativeOnly
		plateletChartModeOfTreatment.data.datasets[3].data[3] = response.chartModeOfTreatmentBean.bothPharmacologicAndSupportive
		plateletChartModeOfTreatment.data.datasets[4].data[4] = response.chartModeOfTreatmentBean.watchAndWait
		plateletChartModeOfTreatment.data.datasets[5].data[5] = response.chartModeOfTreatmentBean.others

		plateletChartModeOfTreatment.update()
	}).fail(function() {
	});
});
$("#modeOfTreatmentStatisticsToPlateletDisorder").on('input', function() {
	restoreValues()
	params.modeOfTreatmentPass = '1'
	params.action = '7'
	params.sortFrom = $("#modeOfTreatmentStatisticsFromPlateletDisorder").val()
	params.sortTo = $("#modeOfTreatmentStatisticsToPlateletDisorder").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		plateletChartModeOfTreatment.data.datasets[0].data[0] = response.chartModeOfTreatmentBean.pharmacologic1stLine
		plateletChartModeOfTreatment.data.datasets[1].data[1] = response.chartModeOfTreatmentBean.pharmacologic2ndLine
		plateletChartModeOfTreatment.data.datasets[2].data[2] = response.chartModeOfTreatmentBean.supportivePalliativeOnly
		plateletChartModeOfTreatment.data.datasets[3].data[3] = response.chartModeOfTreatmentBean.bothPharmacologicAndSupportive
		plateletChartModeOfTreatment.data.datasets[4].data[4] = response.chartModeOfTreatmentBean.watchAndWait
		plateletChartModeOfTreatment.data.datasets[5].data[5] = response.chartModeOfTreatmentBean.others

		plateletChartModeOfTreatment.update()
	}).fail(function() {
	});
});

// baseline
$("#baselineStatisticsFromPlateletDisorder").on('input', function() {
	restoreValues()
	params.baselinePass = '1'
	params.action = '7'
	params.sortFrom = $("#baselineStatisticsFromPlateletDisorder").val()
	params.sortTo = $("#baselineStatisticsToPlateletDisorder").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		plateletChartBaselineDiseaseStatus.data.datasets[0].data[0] = response.chartStatusBaseline.newlyDiagnosedITP
		plateletChartBaselineDiseaseStatus.data.datasets[1].data[1] = response.chartStatusBaseline.persistentITP
		plateletChartBaselineDiseaseStatus.data.datasets[2].data[2] = response.chartStatusBaseline.chronicITP
		plateletChartBaselineDiseaseStatus.data.datasets[3].data[3] = response.chartStatusBaseline.severeITP

		plateletChartBaselineDiseaseStatus.update()
	}).fail(function() {
	});
});
$("#baselineStatisticsToPlateletDisorder").on('input', function() {
	restoreValues()
	params.baselinePass = '1'
	params.action = '7'
	params.sortFrom = $("#baselineStatisticsFromPlateletDisorder").val()
	params.sortTo = $("#baselineStatisticsToPlateletDisorder").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		plateletChartBaselineDiseaseStatus.data.datasets[0].data[0] = response.chartStatusBaseline.newlyDiagnosedITP
		plateletChartBaselineDiseaseStatus.data.datasets[1].data[1] = response.chartStatusBaseline.persistentITP
		plateletChartBaselineDiseaseStatus.data.datasets[2].data[2] = response.chartStatusBaseline.chronicITP
		plateletChartBaselineDiseaseStatus.data.datasets[3].data[3] = response.chartStatusBaseline.severeITP

		plateletChartBaselineDiseaseStatus.update()
	}).fail(function() {
	});
});

// followup
$("#followupStatisticsFromPlateletDisorder").on('input', function() {
	restoreValues()
	params.followupPass = '1'
	params.action = '7'
	params.sortFrom = $("#followupStatisticsFromPlateletDisorder").val()
	params.sortTo = $("#followupStatisticsToPlateletDisorder").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		plateletChartFollowupDiseaseStatus.data.datasets[0].data[0] = response.chartStatusFollowup.cr
		plateletChartFollowupDiseaseStatus.data.datasets[1].data[1] = response.chartStatusFollowup.remission
		plateletChartFollowupDiseaseStatus.data.datasets[2].data[2] = response.chartStatusFollowup.timeToResponse
		plateletChartFollowupDiseaseStatus.data.datasets[3].data[3] = response.chartStatusFollowup.nr
		plateletChartFollowupDiseaseStatus.data.datasets[4].data[4] = response.chartStatusFollowup.lossofCR
		plateletChartFollowupDiseaseStatus.data.datasets[5].data[5] = response.chartStatusFollowup.refractoryITP
		plateletChartFollowupDiseaseStatus.data.datasets[6].data[6] = response.chartStatusFollowup.sd
		plateletChartFollowupDiseaseStatus.data.datasets[7].data[7] = response.chartStatusFollowup.dead
		plateletChartFollowupDiseaseStatus.data.datasets[8].data[8] = response.chartStatusFollowup.others

		plateletChartFollowupDiseaseStatus.update()
	}).fail(function() {
	});
});
$("#followupStatisticsToPlateletDisorder").on('input', function() {
	alert("asd")
	restoreValues()
	params.followupPass = '1'
	params.action = '7'
	params.sortFrom = $("#followupStatisticsFromPlateletDisorder").val()
	params.sortTo = $("#followupStatisticsToPlateletDisorder").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		plateletChartFollowupDiseaseStatus.data.datasets[0].data[0] = response.chartStatusFollowup.cr
		plateletChartFollowupDiseaseStatus.data.datasets[1].data[1] = response.chartStatusFollowup.remission
		plateletChartFollowupDiseaseStatus.data.datasets[2].data[2] = response.chartStatusFollowup.timeToResponse
		plateletChartFollowupDiseaseStatus.data.datasets[3].data[3] = response.chartStatusFollowup.nr
		plateletChartFollowupDiseaseStatus.data.datasets[4].data[4] = response.chartStatusFollowup.lossofCR
		plateletChartFollowupDiseaseStatus.data.datasets[5].data[5] = response.chartStatusFollowup.refractoryITP
		plateletChartFollowupDiseaseStatus.data.datasets[6].data[6] = response.chartStatusFollowup.sd
		plateletChartFollowupDiseaseStatus.data.datasets[7].data[7] = response.chartStatusFollowup.dead
		plateletChartFollowupDiseaseStatus.data.datasets[8].data[8] = response.chartStatusFollowup.others

		plateletChartFollowupDiseaseStatus.update()
	}).fail(function() {
	});
});

// coag
// from and to
// age
$("#ageStatisticsFromCoagulation").on('input', function() {
	restoreValues()
	params.agePass = '1'
	params.action = '2'
	params.sortFrom = $("#ageStatisticsFromCoagulation").val()
	params.sortTo = $("#ageStatisticsFromCoagulation").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		for (var i = 0; i < response.chartAge.ageChart.length; i++) {
			coagulationChartAge.data.datasets[0].data[i] = response.chartAge.ageChart[i];
		}
		coagulationChartAge.update()
	}).fail(function() {
	});

});
$("#ageStatisticsToCoagulation").on('input', function() {
	restoreValues()
	params.agePass = '1'
	params.action = '2'
	params.sortFrom = $("#ageStatisticsFromCoagulation").val()
	params.sortTo = $("#ageStatisticsFromCoagulation").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		for (var i = 0; i < response.chartAge.ageChart.length; i++) {
			coagulationChartAge.data.datasets[0].data[i] = response.chartAge.ageChart[i];
		}
		coagulationChartAge.update()
	}).fail(function() {
	});
});

// gender
$("#genderStatisticsFromCoagulation").on('input', function() {
	restoreValues()
	params.genderPass = '1'
	params.action = '2'
	params.sortFrom = $("#genderStatisticsFromCoagulation").val()
	params.sortTo = $("#genderStatisticsToCoagulation").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		coagulationChartGender.data.datasets[0].data[0] = response.maleChart;
		coagulationChartGender.data.datasets[0].data[1] = response.femaleChart;

		coagulationChartGender.update()
	}).fail(function() {
	});
});
$("#genderStatisticsToCoagulation").on('input', function() {
	restoreValues()
	params.genderPass = '1'
	params.action = '2'
	params.sortFrom = $("#genderStatisticsFromCoagulation").val()
	params.sortTo = $("#genderStatisticsToCoagulation").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		coagulationChartGender.data.datasets[0].data[0] = response.maleChart;
		coagulationChartGender.data.datasets[0].data[1] = response.femaleChart;

		coagulationChartGender.update()
	}).fail(function() {
	});
});

// mode
$("#modeOfTreatmentStatisticsFromCoagulation").on('input', function() {
	restoreValues()
	params.modeOfTreatmentPass = '1'
	params.action = '2'
	params.sortFrom = $("#modeOfTreatmentStatisticsFromCoagulation").val()
	params.sortTo = $("#modeOfTreatmentStatisticsToCoagulation").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		coagulationChartModeOfTreatment.data.datasets[0].data[0] = response.chartModeOfTreatmentBean.factorConcentrates
		coagulationChartModeOfTreatment.data.datasets[1].data[1] = response.chartModeOfTreatmentBean.bloodComponent
		coagulationChartModeOfTreatment.data.datasets[2].data[2] = response.chartModeOfTreatmentBean.others

		coagulationChartModeOfTreatment.update()
	}).fail(function() {
	});
});
$("#modeOfTreatmentStatisticsToCoagulation").on('input', function() {
	restoreValues()
	params.modeOfTreatmentPass = '1'
	params.action = '2'
	params.sortFrom = $("#modeOfTreatmentStatisticsFromCoagulation").val()
	params.sortTo = $("#modeOfTreatmentStatisticsToCoagulation").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		coagulationChartModeOfTreatment.data.datasets[0].data[0] = response.chartModeOfTreatmentBean.factorConcentrates
		coagulationChartModeOfTreatment.data.datasets[1].data[1] = response.chartModeOfTreatmentBean.bloodComponent
		coagulationChartModeOfTreatment.data.datasets[2].data[2] = response.chartModeOfTreatmentBean.others

		coagulationChartModeOfTreatment.update()
	}).fail(function() {
	});
});

// baseline
$("#baselineStatisticsFromCoagulation").on('input', function() {
	restoreValues()
	params.baselinePass = '1'
	params.action = '2'
	params.sortFrom = $("#baselineStatisticsFromCoagulation").val()
	params.sortTo = $("#baselineStatisticsToCoagulation").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		coagulationChartBaselineDiseaseStatus.data.datasets[0].data[0] = response.chartStatusBaseline.sd

		coagulationChartBaselineDiseaseStatus.update()
	}).fail(function() {
	});
});
$("#baselineStatisticsToCoagulation").on('input', function() {
	restoreValues()
	params.baselinePass = '1'
	params.action = '2'
	params.sortFrom = $("#baselineStatisticsFromCoagulation").val()
	params.sortTo = $("#baselineStatisticsToCoagulation").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		coagulationChartBaselineDiseaseStatus.data.datasets[0].data[0] = response.chartStatusBaseline.sd

		coagulationChartBaselineDiseaseStatus.update()
	}).fail(function() {
	});
});

// followup
$("#followupStatisticsFromCoagulation").on('input', function() {
	restoreValues()
	params.followupPass = '1'
	params.action = '2'
	params.sortFrom = $("#followupStatisticsFromCoagulation").val()
	params.sortTo = $("#followupStatisticsToCoagulation").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		coagulationChartFollowupDiseaseStatus.data.datasets[0].data[0] = response.chartStatusFollowup.sd

		coagulationChartFollowupDiseaseStatus.update()
	}).fail(function() {
	});
});
$("#followupStatisticsToCoagulation").on('input', function() {
	alert("asd")
	restoreValues()
	params.followupPass = '1'
	params.action = '2'
	params.sortFrom = $("#followupStatisticsFromCoagulation").val()
	params.sortTo = $("#followupStatisticsToCoagulation").val()

	$.post('DashboardDataServlet', $.param(params), function(response) {
		coagulationChartFollowupDiseaseStatus.data.datasets[0].data[0] = response.chartStatusFollowup.sd

		coagulationChartFollowupDiseaseStatus.update()
	}).fail(function() {
	});
});
