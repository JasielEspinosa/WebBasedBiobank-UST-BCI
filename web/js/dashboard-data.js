var params = {
	action : '',
	agePass : '0',
	genderPass : '0',
	modeOfTreatmentPass : '0',
	baselinePass : '0',
	followupPass : '0',
	sortFrom: '',
	sortTo: '',
};

$('#leukemiaImg').click(function() {
	loadAll()
	params.action = '3'
		
	$.post('DashboardDataServlet', $.param(params), function(response) {
		for(var i = 0; i < response.chartAge.ageChart.length; i++){
			leukemiaChartAge.data.datasets[0].data[i] = response.chartAge.ageChart[i];
		}
		leukemiaChartAge.update()
		
		leukemiaChartGender.data.datasets[0].data[0] = response.maleChart;
		leukemiaChartGender.data.datasets[0].data[1] = response.femaleChart;
		
		leukemiaChartGender.update()
		
		leukemiaChartModeOfTreatment.data.datasets[0].data[0] = reponse.chartModeOfTreatmentBean.pharmacologic1stLine
		leukemiaChartModeOfTreatment.data.datasets[0].data[1] = reponse.chartModeOfTreatmentBean.pharmacologic2ndLineSalvage
		leukemiaChartModeOfTreatment.data.datasets[0].data[2] = reponse.chartModeOfTreatmentBean.supportivePalliativeOnly
		leukemiaChartModeOfTreatment.data.datasets[0].data[3] = reponse.chartModeOfTreatmentBean.watchAndWait
		leukemiaChartModeOfTreatment.data.datasets[0].data[4] = reponse.chartModeOfTreatmentBean.others
		
		leukemiaChartModeOfTreatment.update()
		
		leukemiaChartBaselineDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.newlyDiagnosed
		leukemiaChartBaselineDiseaseStatus.data.datasets[0].data[1] = reponse.chartStatusBaseline.cr
		leukemiaChartBaselineDiseaseStatus.data.datasets[0].data[2] = reponse.chartStatusBaseline.nCR
		leukemiaChartBaselineDiseaseStatus.data.datasets[0].data[3] = reponse.chartStatusBaseline.pr
		leukemiaChartBaselineDiseaseStatus.data.datasets[0].data[4] = reponse.chartStatusBaseline.pd
		leukemiaChartBaselineDiseaseStatus.data.datasets[0].data[5] = reponse.chartStatusBaseline.sd
		leukemiaChartBaselineDiseaseStatus.data.datasets[0].data[6] = reponse.chartStatusBaseline.completeHematologicResponse
		leukemiaChartBaselineDiseaseStatus.data.datasets[0].data[7] = reponse.chartStatusBaseline.completeCytogeneticResponse
		leukemiaChartBaselineDiseaseStatus.data.datasets[0].data[8] = reponse.chartStatusBaseline.majorMolecularResponse
		leukemiaChartBaselineDiseaseStatus.data.datasets[0].data[9] = reponse.chartStatusBaseline.spleenResponse
		leukemiaChartBaselineDiseaseStatus.data.datasets[0].data[10] = reponse.chartStatusBaseline.symptomResponse
		leukemiaChartBaselineDiseaseStatus.data.datasets[0].data[11] = reponse.chartStatusBaseline.others
		
		leukemiaChartBaselineDiseaseStatus.update()
		
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.relapsed
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[1] = reponse.chartStatusBaseline.refractoryDisease
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[2] = reponse.chartStatusBaseline.cr
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[3] = reponse.chartStatusBaseline.nCR
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[4] = reponse.chartStatusBaseline.pr
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[5] = reponse.chartStatusBaseline.pd
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[6] = reponse.chartStatusBaseline.sd
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[7] = reponse.chartStatusBaseline.completeHematologicResponse
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[8] = reponse.chartStatusBaseline.completeCytogeneticResponse
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[9] = reponse.chartStatusBaseline.majorMolecularResponse
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[10] = reponse.chartStatusBaseline.spleenResponse
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[11] = reponse.chartStatusBaseline.symptomResponse
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[12] = reponse.chartStatusBaseline.dead
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[13] = reponse.chartStatusBaseline.others
		
		leukemiaChartFollowupDiseaseStatus.update()
	}).fail(function() {
	});
});

$('#lymphomaImg').click(function() {
	loadAll()
	params.action = '4'
		
	$.post('DashboardDataServlet', $.param(params), function(response) {
		for(var i = 0; i < response.chartAge.ageChart.length; i++){
			lymphomaChartAge.data.datasets[0].data[i] = response.chartAge.ageChart[i];
		}
		lymphomaChartAge.update()
		
		lymphomaChartGender.data.datasets[0].data[0] = response.maleChart;
		lymphomaChartGender.data.datasets[0].data[1] = response.femaleChart;
		
		lymphomaChartGender.update()
		
		lymphomaChartModeOfTreatment.data.datasets[0].data[0] = reponse.chartModeOfTreatmentBean.pharmacologic1stLine
		lymphomaChartModeOfTreatment.data.datasets[0].data[1] = reponse.chartModeOfTreatmentBean.pharmacologic2ndLineSalvage
		lymphomaChartModeOfTreatment.data.datasets[0].data[2] = reponse.chartModeOfTreatmentBean.supportivePalliativeOnly
		
		lymphomaChartModeOfTreatment.update()
		
		lymphomaChartBaselineDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.newlyDiagnosed
		lymphomaChartBaselineDiseaseStatus.data.datasets[0].data[1] = reponse.chartStatusBaseline.cr
		lymphomaChartBaselineDiseaseStatus.data.datasets[0].data[2] = reponse.chartStatusBaseline.pr
		lymphomaChartBaselineDiseaseStatus.data.datasets[0].data[3] = reponse.chartStatusBaseline.sd
		lymphomaChartBaselineDiseaseStatus.data.datasets[0].data[4] = reponse.chartStatusBaseline.pd
		
		lymphomaChartBaselineDiseaseStatus.update()
		
		lymphomaChartFollowupDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.cr
		lymphomaChartFollowupDiseaseStatus.data.datasets[0].data[1] = reponse.chartStatusBaseline.pr
		lymphomaChartFollowupDiseaseStatus.data.datasets[0].data[2] = reponse.chartStatusBaseline.sd
		lymphomaChartFollowupDiseaseStatus.data.datasets[0].data[3] = reponse.chartStatusBaseline.pd
		lymphomaChartFollowupDiseaseStatus.data.datasets[0].data[4] = reponse.chartStatusBaseline.rr
		lymphomaChartFollowupDiseaseStatus.data.datasets[0].data[5] = reponse.chartStatusBaseline.dead
		lymphomaChartFollowupDiseaseStatus.data.datasets[0].data[6] = reponse.chartStatusBaseline.others
		
		lymphomaChartFollowupDiseaseStatus.update()
	});
});

$('#myeloproliferativeImg').click(function() {
	loadAll()
	params.action = '5'
		
	$.post('DashboardDataServlet', $.param(params), function(response) {
		for(var i = 0; i < response.chartAge.ageChart.length; i++){
			myeloChartAge.data.datasets[0].data[i] = response.chartAge.ageChart[i];
		}
		myeloChartAge.update()
		
		myeloChartGender.data.datasets[0].data[0] = response.maleChart;
		myeloChartGender.data.datasets[0].data[1] = response.femaleChart;
		
		myeloChartGender.update()
		
		myeloChartModeOfTreatment.data.datasets[0].data[0] = reponse.chartStatusBaseline.pharmacologicTreatment
		myeloChartModeOfTreatment.data.datasets[0].data[1] = reponse.chartStatusBaseline.supportivePalliativeOnly
		myeloChartModeOfTreatment.data.datasets[0].data[2] = reponse.chartStatusBaseline.watchAndWait
		myeloChartModeOfTreatment.data.datasets[0].data[3] = reponse.chartStatusBaseline.others
		
		myeloChartModeOfTreatment.update()
		
		myeloChartBaselineDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.cr
		myeloChartBaselineDiseaseStatus.data.datasets[0].data[1] = reponse.chartStatusBaseline.pr
		myeloChartBaselineDiseaseStatus.data.datasets[0].data[2] = reponse.chartStatusBaseline.pd
		myeloChartBaselineDiseaseStatus.data.datasets[0].data[3] = reponse.chartStatusBaseline.sd
		myeloChartBaselineDiseaseStatus.data.datasets[0].data[4] = reponse.chartStatusBaseline.hematologicResponse
		myeloChartBaselineDiseaseStatus.data.datasets[0].data[5] = reponse.chartStatusBaseline.spleenResponse
		myeloChartBaselineDiseaseStatus.data.datasets[0].data[6] = reponse.chartStatusBaseline.symptomResponse
		myeloChartBaselineDiseaseStatus.data.datasets[0].data[7] = reponse.chartStatusBaseline.others
		
		myeloChartBaselineDiseaseStatus.update()
		
		myeloChartFollowupDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.cr
		myeloChartFollowupDiseaseStatus.data.datasets[0].data[1] = reponse.chartStatusBaseline.pr
		myeloChartFollowupDiseaseStatus.data.datasets[0].data[2] = reponse.chartStatusBaseline.pd
		myeloChartFollowupDiseaseStatus.data.datasets[0].data[3] = reponse.chartStatusBaseline.sd
		myeloChartFollowupDiseaseStatus.data.datasets[0].data[4] = reponse.chartStatusBaseline.hematologicResponse
		myeloChartFollowupDiseaseStatus.data.datasets[0].data[5] = reponse.chartStatusBaseline.spleenResponse
		myeloChartFollowupDiseaseStatus.data.datasets[0].data[6] = reponse.chartStatusBaseline.symptomResponse
		myeloChartFollowupDiseaseStatus.data.datasets[0].data[7] = reponse.chartStatusBaseline.dead
		myeloChartFollowupDiseaseStatus.data.datasets[0].data[8] = reponse.chartStatusBaseline.others

		
		myeloChartFollowupDiseaseStatus.update()
});
});

$('#plasmaCellImg').click(function() {
	loadAll()
	params.action = '6'
		
	$.post('DashboardDataServlet', $.param(params), function(response) {
		for(var i = 0; i < response.chartAge.ageChart.length; i++){
			plasmaCellChartAge.data.datasets[0].data[i] = response.chartAge.ageChart[i];
		}
		plasmaCellChartAge.update()
		
		plasmaCellChartGender.data.datasets[0].data[0] = response.maleChart;
		plasmaCellChartGender.data.datasets[0].data[1] = response.femaleChart;
		
		plasmaCellChartGender.update()
		
		plasmaCellChartModeOfTreatment.data.datasets[0].data[0] = reponse.chartStatusBaseline.pharmacologicForTransplantCandidate
		plasmaCellChartModeOfTreatment.data.datasets[0].data[1] = reponse.chartStatusBaseline.pharmacologicForNonTransplantCandidate
		plasmaCellChartModeOfTreatment.data.datasets[0].data[2] = reponse.chartStatusBaseline.maintenance
		plasmaCellChartModeOfTreatment.data.datasets[0].data[3] = reponse.chartStatusBaseline.radiotherapy
		plasmaCellChartModeOfTreatment.data.datasets[0].data[4] = reponse.chartStatusBaseline.supportive
		plasmaCellChartModeOfTreatment.data.datasets[0].data[5] = reponse.chartStatusBaseline.watchAndWait
		plasmaCellChartModeOfTreatment.data.datasets[0].data[6] = reponse.chartStatusBaseline.others

		
		plasmaCellChartModeOfTreatment.update()
		
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.cr
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[1] = reponse.chartStatusBaseline.sCR
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[2] = reponse.chartStatusBaseline.immunophenotypicCR
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[3] = reponse.chartStatusBaseline.molecularCR
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[4] = reponse.chartStatusBaseline.vgpr
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[5] = reponse.chartStatusBaseline.pr
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[6] = reponse.chartStatusBaseline.mr
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[7] = reponse.chartStatusBaseline.sd
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[8] = reponse.chartStatusBaseline.pd
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[9] = reponse.chartStatusBaseline.relapsed
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[10] = reponse.chartStatusBaseline.clinicalRelapse
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[11] = reponse.chartStatusBaseline.relapseFromCR
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[12] = reponse.chartStatusBaseline.others
		
		plasmaCellChartBaselineDiseaseStatus.update()
		
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.cr
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[1] = reponse.chartStatusBaseline.sCR
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[2] = reponse.chartStatusBaseline.immunophenotypicCR
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[3] = reponse.chartStatusBaseline.molecularCR
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[4] = reponse.chartStatusBaseline.vgpr
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[5] = reponse.chartStatusBaseline.pr
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[6] = reponse.chartStatusBaseline.mr
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[7] = reponse.chartStatusBaseline.sd
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[8] = reponse.chartStatusBaseline.pd
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[9] = reponse.chartStatusBaseline.relapsed
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[10] = reponse.chartStatusBaseline.clinicalRelapse
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[11] = reponse.chartStatusBaseline.relapseFromCR
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[12] = reponse.chartStatusBaseline.others
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[12] = reponse.chartStatusBaseline.dead
		
		plasmaCellChartFollowupDiseaseStatus.update()
});
});

$('#aapnhmdsImg').click(function() {
	loadAll()
	params.action = '1'
		
	$.post('DashboardDataServlet', $.param(params), function(response) {
		for(var i = 0; i < response.chartAge.ageChart.length; i++){
			aapnhmdsChartAge.data.datasets[0].data[i] = response.chartAge.ageChart[i];
		}
		aapnhmdsChartAge.update()
		
		aapnhmdsChartGender.data.datasets[0].data[0] = response.maleChart;
		aapnhmdsChartGender.data.datasets[0].data[1] = response.femaleChart;
		
		aapnhmdsChartGender.update()
		
		aapnhmdsChartModeOfTreatment.data.datasets[0].data[0] = reponse.chartStatusBaseline.hematopoieticStemCellTransplantation
		aapnhmdsChartModeOfTreatment.data.datasets[0].data[1] = reponse.chartStatusBaseline.pharmacologicTreatment
		aapnhmdsChartModeOfTreatment.data.datasets[0].data[2] = reponse.chartStatusBaseline.supportive
		aapnhmdsChartModeOfTreatment.data.datasets[0].data[3] = reponse.chartStatusBaseline.bothPharmacologicAndSupportive
		aapnhmdsChartModeOfTreatment.data.datasets[0].data[4] = reponse.chartStatusBaseline.watchAndWait

		
		aapnhmdsChartModeOfTreatment.update()
		
		aapnhmdsChartBaselineDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.hematologicResponse
		aapnhmdsChartBaselineDiseaseStatus.data.datasets[0].data[1] = reponse.chartStatusBaseline.sd
		aapnhmdsChartBaselineDiseaseStatus.data.datasets[0].data[2] = reponse.chartStatusBaseline.relapsed
		aapnhmdsChartBaselineDiseaseStatus.data.datasets[0].data[3] = reponse.chartStatusBaseline.others
		
		aapnhmdsChartBaselineDiseaseStatus.update()
		
		aapnhmdsChartFollowupDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.hematologicResponse
		aapnhmdsChartFollowupDiseaseStatus.data.datasets[0].data[1] = reponse.chartStatusBaseline.sd
		aapnhmdsChartFollowupDiseaseStatus.data.datasets[0].data[2] = reponse.chartStatusBaseline.relapsed
		aapnhmdsChartFollowupDiseaseStatus.data.datasets[0].data[3] = reponse.chartStatusBaseline.dead
		aapnhmdsChartFollowupDiseaseStatus.data.datasets[0].data[4] = reponse.chartStatusBaseline.others
		
		aapnhmdsChartFollowupDiseaseStatus.update()
});
});

$('#plateletDisorderImg').click(function() {
	loadAll()
	params.action = '7'
		
	$.post('DashboardDataServlet', $.param(params), function(response) {
		for(var i = 0; i < response.chartAge.ageChart.length; i++){
			plateletChartAge.data.datasets[0].data[i] = response.chartAge.ageChart[i];
		}
		plateletChartAge.update()
		
		plateletChartGender.data.datasets[0].data[0] = response.maleChart;
		plateletChartGender.data.datasets[0].data[1] = response.femaleChart;
		
		plateletChartGender.update()
		
		plateletChartModeOfTreatment.data.datasets[0].data[0] = reponse.chartStatusBaseline.pharmacologic1stLine
		plateletChartModeOfTreatment.data.datasets[0].data[1] = reponse.chartStatusBaseline.pharmacologic2ndLine
		plateletChartModeOfTreatment.data.datasets[0].data[2] = reponse.chartStatusBaseline.supportivePalliativeOnly
		plateletChartModeOfTreatment.data.datasets[0].data[3] = reponse.chartStatusBaseline.bothPharmacologicAndSupportive
		plateletChartModeOfTreatment.data.datasets[0].data[4] = reponse.chartStatusBaseline.watchAndWait
		plateletChartModeOfTreatment.data.datasets[0].data[5] = reponse.chartStatusBaseline.others

		
		plateletChartModeOfTreatment.update()
		
		plateletChartBaselineDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.newlyDiagnosedITP
		plateletChartBaselineDiseaseStatus.data.datasets[0].data[1] = reponse.chartStatusBaseline.persistentITP
		plateletChartBaselineDiseaseStatus.data.datasets[0].data[2] = reponse.chartStatusBaseline.chronicITP
		plateletChartBaselineDiseaseStatus.data.datasets[0].data[3] = reponse.chartStatusBaseline.severeITP
		
		plateletChartBaselineDiseaseStatus.update()
		
		plateletChartFollowupDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.cr
		plateletChartFollowupDiseaseStatus.data.datasets[0].data[1] = reponse.chartStatusBaseline.remission
		plateletChartFollowupDiseaseStatus.data.datasets[0].data[2] = reponse.chartStatusBaseline.timeToResponse
		plateletChartFollowupDiseaseStatus.data.datasets[0].data[3] = reponse.chartStatusBaseline.nr
		plateletChartFollowupDiseaseStatus.data.datasets[0].data[4] = reponse.chartStatusBaseline.lossofCR
		plateletChartFollowupDiseaseStatus.data.datasets[0].data[5] = reponse.chartStatusBaseline.refractoryITP
		plateletChartFollowupDiseaseStatus.data.datasets[0].data[6] = reponse.chartStatusBaseline.sd
		plateletChartFollowupDiseaseStatus.data.datasets[0].data[7] = reponse.chartStatusBaseline.dead
		plateletChartFollowupDiseaseStatus.data.datasets[0].data[8] = reponse.chartStatusBaseline.others

		
		plateletChartFollowupDiseaseStatus.update()
});
});

$('#coagulationDiseaseImg').click(function() {
	loadAll()
	params.action = '2'
		
	$.post('DashboardDataServlet', $.param(params), function(response) {
		for(var i = 0; i < response.chartAge.ageChart.length; i++){
			coagulationChartAge.data.datasets[0].data[i] = response.chartAge.ageChart[i];
		}
		coagulationChartAge.update()
		
		coagulationChartGender.data.datasets[0].data[0] = response.maleChart;
		coagulationChartGender.data.datasets[0].data[1] = response.femaleChart;
		
		coagulationChartGender.update()
		
		coagulationChartModeOfTreatment.data.datasets[0].data[0] = reponse.chartStatusBaseline.factorConcentrates
		coagulationChartModeOfTreatment.data.datasets[0].data[1] = reponse.chartStatusBaseline.blooComponent
		coagulationChartModeOfTreatment.data.datasets[0].data[2] = reponse.chartStatusBaseline.others
		
		coagulationChartModeOfTreatment.update()
		
		coagulationChartBaselineDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.sd

		coagulationChartBaselineDiseaseStatus.update()
		
		coagulationChartFollowupDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.sd
		
		coagulationChartFollowupDiseaseStatus.update()
});
});

function restoreValues(){
	params.agePass = '0'
	params.genderPass = '0'
	params.modeOfTreatmentPass = '0'
	params.baselinePass = '0'
	params.followupPass = '0'
	params.sortFrom= ''
	params.sortTo= ''	
};

function loadAll(){
	params.agePass = '1'
	params.genderPass = '1'
	params.modeOfTreatmentPass = '1'
	params.baselinePass = '1'
	params.followupPass = '1'
	params.sortFrom= ''
	params.sortTo= ''	
};



//leukemia
//from and to
//age
$("#ageStatisticsFromLeukemia").on('input', function() {
	restoreValues()
	params.agePass = '1'
	params.action = '3'
	params.sortFrom = $("#ageStatisticsFromLeukemia").val()
	params.sortTo = $("#ageStatisticsFromLeukemia").val()
	
	$.post('DashboardDataServlet', $.param(params), function(response) {
		for(var i = 0; i < response.chartAge.ageChart.length; i++){
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
		for(var i = 0; i < response.chartAge.ageChart.length; i++){
			leukemiaChartAge.data.datasets[0].data[i] = response.chartAge.ageChart[i];
		}
		leukemiaChartAge.update()
	}).fail(function() {
	});
});

//gender
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

//mode
$("#modeOfTreatmentStatisticsFromLeukemia").on('input', function() {
	restoreValues()
	params.modeOfTreatmentPass = '1'
		params.action = '3'
	params.sortFrom = $("#modeOfTreatmentStatisticsFromLeukemia").val()
	params.sortTo = $("#modeOfTreatmentStatisticsToLeukemia").val()
	
	$.post('DashboardDataServlet', $.param(params), function(response) {
		leukemiaChartModeOfTreatment.data.datasets[0].data[0] = reponse.chartModeOfTreatmentBean.pharmacologic1stLine
		leukemiaChartModeOfTreatment.data.datasets[0].data[1] = reponse.chartModeOfTreatmentBean.pharmacologic2ndLineSalvage
		leukemiaChartModeOfTreatment.data.datasets[0].data[2] = reponse.chartModeOfTreatmentBean.supportivePalliativeOnly
		leukemiaChartModeOfTreatment.data.datasets[0].data[3] = reponse.chartModeOfTreatmentBean.watchAndWait
		leukemiaChartModeOfTreatment.data.datasets[0].data[4] = reponse.chartModeOfTreatmentBean.others
		
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
		leukemiaChartModeOfTreatment.data.datasets[0].data[0] = reponse.chartModeOfTreatmentBean.pharmacologic1stLine
		leukemiaChartModeOfTreatment.data.datasets[0].data[1] = reponse.chartModeOfTreatmentBean.pharmacologic2ndLineSalvage
		leukemiaChartModeOfTreatment.data.datasets[0].data[2] = reponse.chartModeOfTreatmentBean.supportivePalliativeOnly
		leukemiaChartModeOfTreatment.data.datasets[0].data[3] = reponse.chartModeOfTreatmentBean.watchAndWait
		leukemiaChartModeOfTreatment.data.datasets[0].data[4] = reponse.chartModeOfTreatmentBean.others
		
		leukemiaChartModeOfTreatment.update()
	}).fail(function() {
	});
});


//baseline
$("#baselineStatisticsFromLeukemia").on('input', function() {
	restoreValues()
	params.baselinePass = '1'
		params.action = '3'
	params.sortFrom = $("#baselineStatisticsFromLeukemia").val()
	params.sortTo = $("#baselineStatisticsToLeukemia").val()
	
	$.post('DashboardDataServlet', $.param(params), function(response) {
		leukemiaChartBaselineDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.newlyDiagnosed
		leukemiaChartBaselineDiseaseStatus.data.datasets[0].data[1] = reponse.chartStatusBaseline.cr
		leukemiaChartBaselineDiseaseStatus.data.datasets[0].data[2] = reponse.chartStatusBaseline.nCR
		leukemiaChartBaselineDiseaseStatus.data.datasets[0].data[3] = reponse.chartStatusBaseline.pr
		leukemiaChartBaselineDiseaseStatus.data.datasets[0].data[4] = reponse.chartStatusBaseline.pd
		leukemiaChartBaselineDiseaseStatus.data.datasets[0].data[5] = reponse.chartStatusBaseline.sd
		leukemiaChartBaselineDiseaseStatus.data.datasets[0].data[6] = reponse.chartStatusBaseline.completeHematologicResponse
		leukemiaChartBaselineDiseaseStatus.data.datasets[0].data[7] = reponse.chartStatusBaseline.completeCytogeneticResponse
		leukemiaChartBaselineDiseaseStatus.data.datasets[0].data[8] = reponse.chartStatusBaseline.majorMolecularResponse
		leukemiaChartBaselineDiseaseStatus.data.datasets[0].data[9] = reponse.chartStatusBaseline.spleenResponse
		leukemiaChartBaselineDiseaseStatus.data.datasets[0].data[10] = reponse.chartStatusBaseline.symptomResponse
		leukemiaChartBaselineDiseaseStatus.data.datasets[0].data[11] = reponse.chartStatusBaseline.others
		
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
		leukemiaChartBaselineDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.newlyDiagnosed
		leukemiaChartBaselineDiseaseStatus.data.datasets[0].data[1] = reponse.chartStatusBaseline.cr
		leukemiaChartBaselineDiseaseStatus.data.datasets[0].data[2] = reponse.chartStatusBaseline.nCR
		leukemiaChartBaselineDiseaseStatus.data.datasets[0].data[3] = reponse.chartStatusBaseline.pr
		leukemiaChartBaselineDiseaseStatus.data.datasets[0].data[4] = reponse.chartStatusBaseline.pd
		leukemiaChartBaselineDiseaseStatus.data.datasets[0].data[5] = reponse.chartStatusBaseline.sd
		leukemiaChartBaselineDiseaseStatus.data.datasets[0].data[6] = reponse.chartStatusBaseline.completeHematologicResponse
		leukemiaChartBaselineDiseaseStatus.data.datasets[0].data[7] = reponse.chartStatusBaseline.completeCytogeneticResponse
		leukemiaChartBaselineDiseaseStatus.data.datasets[0].data[8] = reponse.chartStatusBaseline.majorMolecularResponse
		leukemiaChartBaselineDiseaseStatus.data.datasets[0].data[9] = reponse.chartStatusBaseline.spleenResponse
		leukemiaChartBaselineDiseaseStatus.data.datasets[0].data[10] = reponse.chartStatusBaseline.symptomResponse
		leukemiaChartBaselineDiseaseStatus.data.datasets[0].data[11] = reponse.chartStatusBaseline.others
		
		leukemiaChartBaselineDiseaseStatus.update()
	}).fail(function() {
	});
});

//followup
$("#followupStatisticsFromLeukemia").on('input', function() {
	restoreValues()
	params.followupPass = '1'
		params.action = '3'
	params.sortFrom = $("#followupStatisticsFromLeukemia").val()
	params.sortTo = $("#followupStatisticsToLeukemia").val()
	
	$.post('DashboardDataServlet', $.param(params), function(response) {
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.relapsed
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[1] = reponse.chartStatusBaseline.refractoryDisease
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[2] = reponse.chartStatusBaseline.cr
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[3] = reponse.chartStatusBaseline.nCR
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[4] = reponse.chartStatusBaseline.pr
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[5] = reponse.chartStatusBaseline.pd
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[6] = reponse.chartStatusBaseline.sd
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[7] = reponse.chartStatusBaseline.completeHematologicResponse
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[8] = reponse.chartStatusBaseline.completeCytogeneticResponse
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[9] = reponse.chartStatusBaseline.majorMolecularResponse
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[10] = reponse.chartStatusBaseline.spleenResponse
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[11] = reponse.chartStatusBaseline.symptomResponse
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[12] = reponse.chartStatusBaseline.dead
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[13] = reponse.chartStatusBaseline.others
		
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
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.relapsed
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[1] = reponse.chartStatusBaseline.refractoryDisease
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[2] = reponse.chartStatusBaseline.cr
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[3] = reponse.chartStatusBaseline.nCR
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[4] = reponse.chartStatusBaseline.pr
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[5] = reponse.chartStatusBaseline.pd
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[6] = reponse.chartStatusBaseline.sd
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[7] = reponse.chartStatusBaseline.completeHematologicResponse
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[8] = reponse.chartStatusBaseline.completeCytogeneticResponse
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[9] = reponse.chartStatusBaseline.majorMolecularResponse
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[10] = reponse.chartStatusBaseline.spleenResponse
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[11] = reponse.chartStatusBaseline.symptomResponse
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[12] = reponse.chartStatusBaseline.dead
		leukemiaChartFollowupDiseaseStatus.data.datasets[0].data[13] = reponse.chartStatusBaseline.others
		
		leukemiaChartFollowupDiseaseStatus.update()
	}).fail(function() {
	});
});

//lymphoma
//from and to
//age
$("#ageStatisticsFromLymphoma").on('input', function() {
	restoreValues()
	params.agePass = '1'
		params.action = '4'
	params.sortFrom = $("#ageStatisticsFromLymphoma").val()
	params.sortTo = $("#ageStatisticsFromLymphoma").val()
	
	
	$.post('DashboardDataServlet', $.param(params), function(response) {
		for(var i = 0; i < response.chartAge.ageChart.length; i++){
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
		for(var i = 0; i < response.chartAge.ageChart.length; i++){
			lymphomaChartAge.data.datasets[0].data[i] = response.chartAge.ageChart[i];
		}
		lymphomaChartAge.update()
	}).fail(function() {
	});
});

//gender
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

//mode
$("#modeOfTreatmentStatisticsFromLymphoma").on('input', function() {
	restoreValues()
	params.modeOfTreatmentPass = '1'
		params.action = '4'
	params.sortFrom = $("#modeOfTreatmentStatisticsFromLymphoma").val()
	params.sortTo = $("#modeOfTreatmentStatisticsToLymphoma").val()
	
	$.post('DashboardDataServlet', $.param(params), function(response) {
		lymphomaChartModeOfTreatment.data.datasets[0].data[0] = reponse.chartModeOfTreatmentBean.pharmacologic1stLine
		lymphomaChartModeOfTreatment.data.datasets[0].data[1] = reponse.chartModeOfTreatmentBean.pharmacologic2ndLineSalvage
		lymphomaChartModeOfTreatment.data.datasets[0].data[2] = reponse.chartModeOfTreatmentBean.supportivePalliativeOnly
		
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
		lymphomaChartModeOfTreatment.data.datasets[0].data[0] = reponse.chartModeOfTreatmentBean.pharmacologic1stLine
		lymphomaChartModeOfTreatment.data.datasets[0].data[1] = reponse.chartModeOfTreatmentBean.pharmacologic2ndLineSalvage
		lymphomaChartModeOfTreatment.data.datasets[0].data[2] = reponse.chartModeOfTreatmentBean.supportivePalliativeOnly
		
		lymphomaChartModeOfTreatment.update()
	}).fail(function() {
	});
});


//baseline
$("#baselineStatisticsFromLymphoma").on('input', function() {
	restoreValues()
	params.baselinePass = '1'
		params.action = '4'
	params.sortFrom = $("#baselineStatisticsFromLymphoma").val()
	params.sortTo = $("#baselineStatisticsToLymphoma").val()
	
	$.post('DashboardDataServlet', $.param(params), function(response) {
		lymphomaChartBaselineDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.newlyDiagnosed
		lymphomaChartBaselineDiseaseStatus.data.datasets[0].data[1] = reponse.chartStatusBaseline.cr
		lymphomaChartBaselineDiseaseStatus.data.datasets[0].data[2] = reponse.chartStatusBaseline.pr
		lymphomaChartBaselineDiseaseStatus.data.datasets[0].data[3] = reponse.chartStatusBaseline.sd
		lymphomaChartBaselineDiseaseStatus.data.datasets[0].data[4] = reponse.chartStatusBaseline.pd
		
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
		lymphomaChartBaselineDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.newlyDiagnosed
		lymphomaChartBaselineDiseaseStatus.data.datasets[0].data[1] = reponse.chartStatusBaseline.cr
		lymphomaChartBaselineDiseaseStatus.data.datasets[0].data[2] = reponse.chartStatusBaseline.pr
		lymphomaChartBaselineDiseaseStatus.data.datasets[0].data[3] = reponse.chartStatusBaseline.sd
		lymphomaChartBaselineDiseaseStatus.data.datasets[0].data[4] = reponse.chartStatusBaseline.pd
		
		lymphomaChartBaselineDiseaseStatus.update()
	}).fail(function() {
	});
});

//followup
$("#followupStatisticsFromLymphoma").on('input', function() {
	restoreValues()
	params.followupPass = '1'
		params.action = '4'
	params.sortFrom = $("#followupStatisticsFromLymphoma").val()
	params.sortTo = $("#followupStatisticsToLymphoma").val()
	
	$.post('DashboardDataServlet', $.param(params), function(response) {
		lymphomaChartFollowupDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.cr
		lymphomaChartFollowupDiseaseStatus.data.datasets[0].data[1] = reponse.chartStatusBaseline.pr
		lymphomaChartFollowupDiseaseStatus.data.datasets[0].data[2] = reponse.chartStatusBaseline.sd
		lymphomaChartFollowupDiseaseStatus.data.datasets[0].data[3] = reponse.chartStatusBaseline.pd
		lymphomaChartFollowupDiseaseStatus.data.datasets[0].data[4] = reponse.chartStatusBaseline.rr
		lymphomaChartFollowupDiseaseStatus.data.datasets[0].data[5] = reponse.chartStatusBaseline.dead
		lymphomaChartFollowupDiseaseStatus.data.datasets[0].data[6] = reponse.chartStatusBaseline.others
		
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
		lymphomaChartFollowupDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.cr
		lymphomaChartFollowupDiseaseStatus.data.datasets[0].data[1] = reponse.chartStatusBaseline.pr
		lymphomaChartFollowupDiseaseStatus.data.datasets[0].data[2] = reponse.chartStatusBaseline.sd
		lymphomaChartFollowupDiseaseStatus.data.datasets[0].data[3] = reponse.chartStatusBaseline.pd
		lymphomaChartFollowupDiseaseStatus.data.datasets[0].data[4] = reponse.chartStatusBaseline.rr
		lymphomaChartFollowupDiseaseStatus.data.datasets[0].data[5] = reponse.chartStatusBaseline.dead
		lymphomaChartFollowupDiseaseStatus.data.datasets[0].data[6] = reponse.chartStatusBaseline.others
		
		lymphomaChartFollowupDiseaseStatus.update()
	}).fail(function() {
	});
});

//myelo

//from and to
//age
$("#ageStatisticsFromMyeloproliferative").on('input', function() {
	restoreValues()
	params.agePass = '1'
		params.action = '5'
	params.sortFrom = $("#ageStatisticsFromMyeloproliferative").val()
	params.sortTo = $("#ageStatisticsFromMyeloproliferative").val()
	
	$.post('DashboardDataServlet', $.param(params), function(response) {
		for(var i = 0; i < response.chartAge.ageChart.length; i++){
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
		for(var i = 0; i < response.chartAge.ageChart.length; i++){
			myeloChartAge.data.datasets[0].data[i] = response.chartAge.ageChart[i];
		}
		myeloChartAge.update()
	}).fail(function() {
	});
});

//gender
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

//mode
$("#modeOfTreatmentStatisticsFromMyeloproliferative").on('input', function() {
	restoreValues()
	params.modeOfTreatmentPass = '1'
		params.action = '5'
	params.sortFrom = $("#modeOfTreatmentStatisticsFromMyeloproliferative").val()
	params.sortTo = $("#modeOfTreatmentStatisticsToMyeloproliferative").val()
	
	$.post('DashboardDataServlet', $.param(params), function(response) {
		myeloChartModeOfTreatment.data.datasets[0].data[0] = reponse.chartStatusBaseline.pharmacologicTreatment
		myeloChartModeOfTreatment.data.datasets[0].data[1] = reponse.chartStatusBaseline.supportivePalliativeOnly
		myeloChartModeOfTreatment.data.datasets[0].data[2] = reponse.chartStatusBaseline.watchAndWait
		myeloChartModeOfTreatment.data.datasets[0].data[3] = reponse.chartStatusBaseline.others
		
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
		myeloChartModeOfTreatment.data.datasets[0].data[0] = reponse.chartStatusBaseline.pharmacologicTreatment
		myeloChartModeOfTreatment.data.datasets[0].data[1] = reponse.chartStatusBaseline.supportivePalliativeOnly
		myeloChartModeOfTreatment.data.datasets[0].data[2] = reponse.chartStatusBaseline.watchAndWait
		myeloChartModeOfTreatment.data.datasets[0].data[3] = reponse.chartStatusBaseline.others
		
		myeloChartModeOfTreatment.update()
	}).fail(function() {
	});
});


//baseline
$("#baselineStatisticsFromMyeloproliferative").on('input', function() {
	restoreValues()
	params.baselinePass = '1'
		params.action = '5'
	params.sortFrom = $("#baselineStatisticsFromMyeloproliferative").val()
	params.sortTo = $("#baselineStatisticsToMyeloproliferative").val()
	
	$.post('DashboardDataServlet', $.param(params), function(response) {
		myeloChartBaselineDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.cr
		myeloChartBaselineDiseaseStatus.data.datasets[0].data[1] = reponse.chartStatusBaseline.pr
		myeloChartBaselineDiseaseStatus.data.datasets[0].data[2] = reponse.chartStatusBaseline.pd
		myeloChartBaselineDiseaseStatus.data.datasets[0].data[3] = reponse.chartStatusBaseline.sd
		myeloChartBaselineDiseaseStatus.data.datasets[0].data[4] = reponse.chartStatusBaseline.hematologicResponse
		myeloChartBaselineDiseaseStatus.data.datasets[0].data[5] = reponse.chartStatusBaseline.spleenResponse
		myeloChartBaselineDiseaseStatus.data.datasets[0].data[6] = reponse.chartStatusBaseline.symptomResponse
		myeloChartBaselineDiseaseStatus.data.datasets[0].data[7] = reponse.chartStatusBaseline.others
		
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
		myeloChartBaselineDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.cr
		myeloChartBaselineDiseaseStatus.data.datasets[0].data[1] = reponse.chartStatusBaseline.pr
		myeloChartBaselineDiseaseStatus.data.datasets[0].data[2] = reponse.chartStatusBaseline.pd
		myeloChartBaselineDiseaseStatus.data.datasets[0].data[3] = reponse.chartStatusBaseline.sd
		myeloChartBaselineDiseaseStatus.data.datasets[0].data[4] = reponse.chartStatusBaseline.hematologicResponse
		myeloChartBaselineDiseaseStatus.data.datasets[0].data[5] = reponse.chartStatusBaseline.spleenResponse
		myeloChartBaselineDiseaseStatus.data.datasets[0].data[6] = reponse.chartStatusBaseline.symptomResponse
		myeloChartBaselineDiseaseStatus.data.datasets[0].data[7] = reponse.chartStatusBaseline.others
		
		myeloChartBaselineDiseaseStatus.update()
	}).fail(function() {
	});
});

//followup
$("#followupStatisticsFromMyeloproliferative").on('input', function() {
	restoreValues()
	params.followupPass = '1'
		params.action = '5'
	params.sortFrom = $("#followupStatisticsFromMyeloproliferative").val()
	params.sortTo = $("#followupStatisticsToMyeloproliferative").val()
	
	$.post('DashboardDataServlet', $.param(params), function(response) {
		myeloChartFollowupDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.cr
		myeloChartFollowupDiseaseStatus.data.datasets[0].data[1] = reponse.chartStatusBaseline.pr
		myeloChartFollowupDiseaseStatus.data.datasets[0].data[2] = reponse.chartStatusBaseline.pd
		myeloChartFollowupDiseaseStatus.data.datasets[0].data[3] = reponse.chartStatusBaseline.sd
		myeloChartFollowupDiseaseStatus.data.datasets[0].data[4] = reponse.chartStatusBaseline.hematologicResponse
		myeloChartFollowupDiseaseStatus.data.datasets[0].data[5] = reponse.chartStatusBaseline.spleenResponse
		myeloChartFollowupDiseaseStatus.data.datasets[0].data[6] = reponse.chartStatusBaseline.symptomResponse
		myeloChartFollowupDiseaseStatus.data.datasets[0].data[7] = reponse.chartStatusBaseline.dead
		myeloChartFollowupDiseaseStatus.data.datasets[0].data[8] = reponse.chartStatusBaseline.others

		
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
		myeloChartFollowupDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.cr
		myeloChartFollowupDiseaseStatus.data.datasets[0].data[1] = reponse.chartStatusBaseline.pr
		myeloChartFollowupDiseaseStatus.data.datasets[0].data[2] = reponse.chartStatusBaseline.pd
		myeloChartFollowupDiseaseStatus.data.datasets[0].data[3] = reponse.chartStatusBaseline.sd
		myeloChartFollowupDiseaseStatus.data.datasets[0].data[4] = reponse.chartStatusBaseline.hematologicResponse
		myeloChartFollowupDiseaseStatus.data.datasets[0].data[5] = reponse.chartStatusBaseline.spleenResponse
		myeloChartFollowupDiseaseStatus.data.datasets[0].data[6] = reponse.chartStatusBaseline.symptomResponse
		myeloChartFollowupDiseaseStatus.data.datasets[0].data[7] = reponse.chartStatusBaseline.dead
		myeloChartFollowupDiseaseStatus.data.datasets[0].data[8] = reponse.chartStatusBaseline.others

		
		myeloChartFollowupDiseaseStatus.update()
	}).fail(function() {
	});
});

//plasmacell
//from and to
//age
$("#ageStatisticsFromPlasmacell").on('input', function() {
	restoreValues()
	params.agePass = '1'
		params.action = '6'
	params.sortFrom = $("#ageStatisticsFromPlasmacell").val()
	params.sortTo = $("#ageStatisticsFromPlasmacell").val()
	
	$.post('DashboardDataServlet', $.param(params), function(response) {
		for(var i = 0; i < response.chartAge.ageChart.length; i++){
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
		for(var i = 0; i < response.chartAge.ageChart.length; i++){
			plasmaCellChartAge.data.datasets[0].data[i] = response.chartAge.ageChart[i];
		}
		plasmaCellChartAge.update()
	}).fail(function() {
	});
});

//gender
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

//mode
$("#modeOfTreatmentStatisticsFromPlasmacell").on('input', function() {
	restoreValues()
	params.modeOfTreatmentPass = '1'
		params.action = '6'
	params.sortFrom = $("#modeOfTreatmentStatisticsFromPlasmacell").val()
	params.sortTo = $("#modeOfTreatmentStatisticsToPlasmacell").val()
	
	$.post('DashboardDataServlet', $.param(params), function(response) {
		plasmaCellChartModeOfTreatment.data.datasets[0].data[0] = reponse.chartStatusBaseline.pharmacologicForTransplantCandidate
		plasmaCellChartModeOfTreatment.data.datasets[0].data[1] = reponse.chartStatusBaseline.pharmacologicForNonTransplantCandidate
		plasmaCellChartModeOfTreatment.data.datasets[0].data[2] = reponse.chartStatusBaseline.maintenance
		plasmaCellChartModeOfTreatment.data.datasets[0].data[3] = reponse.chartStatusBaseline.radiotherapy
		plasmaCellChartModeOfTreatment.data.datasets[0].data[4] = reponse.chartStatusBaseline.supportive
		plasmaCellChartModeOfTreatment.data.datasets[0].data[5] = reponse.chartStatusBaseline.watchAndWait
		plasmaCellChartModeOfTreatment.data.datasets[0].data[6] = reponse.chartStatusBaseline.others

		
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
		plasmaCellChartModeOfTreatment.data.datasets[0].data[0] = reponse.chartStatusBaseline.pharmacologicForTransplantCandidate
		plasmaCellChartModeOfTreatment.data.datasets[0].data[1] = reponse.chartStatusBaseline.pharmacologicForNonTransplantCandidate
		plasmaCellChartModeOfTreatment.data.datasets[0].data[2] = reponse.chartStatusBaseline.maintenance
		plasmaCellChartModeOfTreatment.data.datasets[0].data[3] = reponse.chartStatusBaseline.radiotherapy
		plasmaCellChartModeOfTreatment.data.datasets[0].data[4] = reponse.chartStatusBaseline.supportive
		plasmaCellChartModeOfTreatment.data.datasets[0].data[5] = reponse.chartStatusBaseline.watchAndWait
		plasmaCellChartModeOfTreatment.data.datasets[0].data[6] = reponse.chartStatusBaseline.others

		
		plasmaCellChartModeOfTreatment.update()
	}).fail(function() {
	});
});


//baseline
$("#baselineStatisticsFromPlasmacell").on('input', function() {
	restoreValues()
	params.baselinePass = '1'
		params.action = '6'
	params.sortFrom = $("#baselineStatisticsFromPlasmacell").val()
	params.sortTo = $("#baselineStatisticsToPlasmacell").val()
	
	$.post('DashboardDataServlet', $.param(params), function(response) {
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.cr
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[1] = reponse.chartStatusBaseline.sCR
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[2] = reponse.chartStatusBaseline.immunophenotypicCR
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[3] = reponse.chartStatusBaseline.molecularCR
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[4] = reponse.chartStatusBaseline.vgpr
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[5] = reponse.chartStatusBaseline.pr
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[6] = reponse.chartStatusBaseline.mr
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[7] = reponse.chartStatusBaseline.sd
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[8] = reponse.chartStatusBaseline.pd
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[9] = reponse.chartStatusBaseline.relapsed
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[10] = reponse.chartStatusBaseline.clinicalRelapse
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[11] = reponse.chartStatusBaseline.relapseFromCR
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[12] = reponse.chartStatusBaseline.others
		
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
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.cr
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[1] = reponse.chartStatusBaseline.sCR
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[2] = reponse.chartStatusBaseline.immunophenotypicCR
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[3] = reponse.chartStatusBaseline.molecularCR
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[4] = reponse.chartStatusBaseline.vgpr
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[5] = reponse.chartStatusBaseline.pr
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[6] = reponse.chartStatusBaseline.mr
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[7] = reponse.chartStatusBaseline.sd
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[8] = reponse.chartStatusBaseline.pd
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[9] = reponse.chartStatusBaseline.relapsed
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[10] = reponse.chartStatusBaseline.clinicalRelapse
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[11] = reponse.chartStatusBaseline.relapseFromCR
		plasmaCellChartBaselineDiseaseStatus.data.datasets[0].data[12] = reponse.chartStatusBaseline.others
		
		plasmaCellChartBaselineDiseaseStatus.update()
	}).fail(function() {
	});
});

//followup
$("#followupStatisticsFromPlasmacell").on('input', function() {
	restoreValues()
	params.followupPass = '1'
		params.action = '6'
	params.sortFrom = $("#followupStatisticsFromPlasmacell").val()
	params.sortTo = $("#followupStatisticsToPlasmacell").val()
	
	$.post('DashboardDataServlet', $.param(params), function(response) {
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.cr
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[1] = reponse.chartStatusBaseline.sCR
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[2] = reponse.chartStatusBaseline.immunophenotypicCR
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[3] = reponse.chartStatusBaseline.molecularCR
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[4] = reponse.chartStatusBaseline.vgpr
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[5] = reponse.chartStatusBaseline.pr
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[6] = reponse.chartStatusBaseline.mr
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[7] = reponse.chartStatusBaseline.sd
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[8] = reponse.chartStatusBaseline.pd
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[9] = reponse.chartStatusBaseline.relapsed
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[10] = reponse.chartStatusBaseline.clinicalRelapse
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[11] = reponse.chartStatusBaseline.relapseFromCR
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[12] = reponse.chartStatusBaseline.others
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[12] = reponse.chartStatusBaseline.dead
		
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
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.cr
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[1] = reponse.chartStatusBaseline.sCR
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[2] = reponse.chartStatusBaseline.immunophenotypicCR
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[3] = reponse.chartStatusBaseline.molecularCR
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[4] = reponse.chartStatusBaseline.vgpr
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[5] = reponse.chartStatusBaseline.pr
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[6] = reponse.chartStatusBaseline.mr
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[7] = reponse.chartStatusBaseline.sd
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[8] = reponse.chartStatusBaseline.pd
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[9] = reponse.chartStatusBaseline.relapsed
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[10] = reponse.chartStatusBaseline.clinicalRelapse
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[11] = reponse.chartStatusBaseline.relapseFromCR
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[12] = reponse.chartStatusBaseline.others
		plasmaCellChartFollowupDiseaseStatus.data.datasets[0].data[12] = reponse.chartStatusBaseline.dead
		
		plasmaCellChartFollowupDiseaseStatus.update()
	}).fail(function() {
	});
});

//aap

//from and to
//age
$("#ageStatisticsFromAAPNHMDS").on('input', function() {
	restoreValues()
	params.agePass = '1'
		params.action = '1'
	params.sortFrom = $("#ageStatisticsFromAAPNHMDS").val()
	params.sortTo = $("#ageStatisticsFromAAPNHMDS").val()
	
	$.post('DashboardDataServlet', $.param(params), function(response) {
		for(var i = 0; i < response.chartAge.ageChart.length; i++){
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
		for(var i = 0; i < response.chartAge.ageChart.length; i++){
			aapnhmdsChartAge.data.datasets[0].data[i] = response.chartAge.ageChart[i];
		}
		aapnhmdsChartAge.update()
	}).fail(function() {
	});
});

//gender
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

//mode
$("#modeOfTreatmentStatisticsFromAAPNHMDS").on('input', function() {
	restoreValues()
	params.modeOfTreatmentPass = '1'
		params.action = '1'
	params.sortFrom = $("#modeOfTreatmentStatisticsFromAAPNHMDS").val()
	params.sortTo = $("#modeOfTreatmentStatisticsToAAPNHMDS").val()
	
	$.post('DashboardDataServlet', $.param(params), function(response) {
		aapnhmdsChartModeOfTreatment.data.datasets[0].data[0] = reponse.chartStatusBaseline.hematopoieticStemCellTransplantation
		aapnhmdsChartModeOfTreatment.data.datasets[0].data[1] = reponse.chartStatusBaseline.pharmacologicTreatment
		aapnhmdsChartModeOfTreatment.data.datasets[0].data[2] = reponse.chartStatusBaseline.supportive
		aapnhmdsChartModeOfTreatment.data.datasets[0].data[3] = reponse.chartStatusBaseline.bothPharmacologicAndSupportive
		aapnhmdsChartModeOfTreatment.data.datasets[0].data[4] = reponse.chartStatusBaseline.watchAndWait

		
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
		aapnhmdsChartModeOfTreatment.data.datasets[0].data[0] = reponse.chartStatusBaseline.hematopoieticStemCellTransplantation
		aapnhmdsChartModeOfTreatment.data.datasets[0].data[1] = reponse.chartStatusBaseline.pharmacologicTreatment
		aapnhmdsChartModeOfTreatment.data.datasets[0].data[2] = reponse.chartStatusBaseline.supportive
		aapnhmdsChartModeOfTreatment.data.datasets[0].data[3] = reponse.chartStatusBaseline.bothPharmacologicAndSupportive
		aapnhmdsChartModeOfTreatment.data.datasets[0].data[4] = reponse.chartStatusBaseline.watchAndWait

		
		aapnhmdsChartModeOfTreatment.update()
	}).fail(function() {
	});
});


//baseline
$("#baselineStatisticsFromAAPNHMDS").on('input', function() {
	restoreValues()
	params.baselinePass = '1'
		params.action = '1'
	params.sortFrom = $("#baselineStatisticsFromAAPNHMDS").val()
	params.sortTo = $("#baselineStatisticsToAAPNHMDS").val()
	
	$.post('DashboardDataServlet', $.param(params), function(response) {
		aapnhmdsChartBaselineDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.hematologicResponse
		aapnhmdsChartBaselineDiseaseStatus.data.datasets[0].data[1] = reponse.chartStatusBaseline.sd
		aapnhmdsChartBaselineDiseaseStatus.data.datasets[0].data[2] = reponse.chartStatusBaseline.relapsed
		aapnhmdsChartBaselineDiseaseStatus.data.datasets[0].data[3] = reponse.chartStatusBaseline.others
		
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
		aapnhmdsChartBaselineDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.hematologicResponse
		aapnhmdsChartBaselineDiseaseStatus.data.datasets[0].data[1] = reponse.chartStatusBaseline.sd
		aapnhmdsChartBaselineDiseaseStatus.data.datasets[0].data[2] = reponse.chartStatusBaseline.relapsed
		aapnhmdsChartBaselineDiseaseStatus.data.datasets[0].data[3] = reponse.chartStatusBaseline.others
		
		aapnhmdsChartBaselineDiseaseStatus.update()
	}).fail(function() {
	});
});

//followup
$("#followupStatisticsFromAAPNHMDS").on('input', function() {
	restoreValues()
	params.followupPass = '1'
		params.action = '1'
	params.sortFrom = $("#followupStatisticsFromAAPNHMDS").val()
	params.sortTo = $("#followupStatisticsToAAPNHMDS").val()
	
	$.post('DashboardDataServlet', $.param(params), function(response) {
		aapnhmdsChartFollowupDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.hematologicResponse
		aapnhmdsChartFollowupDiseaseStatus.data.datasets[0].data[1] = reponse.chartStatusBaseline.sd
		aapnhmdsChartFollowupDiseaseStatus.data.datasets[0].data[2] = reponse.chartStatusBaseline.relapsed
		aapnhmdsChartFollowupDiseaseStatus.data.datasets[0].data[3] = reponse.chartStatusBaseline.dead
		aapnhmdsChartFollowupDiseaseStatus.data.datasets[0].data[4] = reponse.chartStatusBaseline.others
		
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
		aapnhmdsChartFollowupDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.hematologicResponse
		aapnhmdsChartFollowupDiseaseStatus.data.datasets[0].data[1] = reponse.chartStatusBaseline.sd
		aapnhmdsChartFollowupDiseaseStatus.data.datasets[0].data[2] = reponse.chartStatusBaseline.relapsed
		aapnhmdsChartFollowupDiseaseStatus.data.datasets[0].data[3] = reponse.chartStatusBaseline.dead
		aapnhmdsChartFollowupDiseaseStatus.data.datasets[0].data[4] = reponse.chartStatusBaseline.others
		
		aapnhmdsChartFollowupDiseaseStatus.update()
	}).fail(function() {
	});
});

//platelet
//from and to
//age
$("#ageStatisticsFromPlateletDisorder").on('input', function() {
	restoreValues()
	params.agePass = '1'
		params.action = '7'
	params.sortFrom = $("#ageStatisticsFromPlateletDisorder").val()
	params.sortTo = $("#ageStatisticsFromPlateletDisorder").val()
	
	$.post('DashboardDataServlet', $.param(params), function(response) {
		for(var i = 0; i < response.chartAge.ageChart.length; i++){
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
		for(var i = 0; i < response.chartAge.ageChart.length; i++){
			plateletChartAge.data.datasets[0].data[i] = response.chartAge.ageChart[i];
		}
		plateletChartAge.update()
	}).fail(function() {
	});
});

//gender
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

//mode
$("#modeOfTreatmentStatisticsFromPlateletDisorder").on('input', function() {
	restoreValues()
	params.modeOfTreatmentPass = '1'
		params.action = '7'
	params.sortFrom = $("#modeOfTreatmentStatisticsFromPlateletDisorder").val()
	params.sortTo = $("#modeOfTreatmentStatisticsToPlateletDisorder").val()
	
	$.post('DashboardDataServlet', $.param(params), function(response) {
		plateletChartModeOfTreatment.data.datasets[0].data[0] = reponse.chartStatusBaseline.pharmacologic1stLine
		plateletChartModeOfTreatment.data.datasets[0].data[1] = reponse.chartStatusBaseline.pharmacologic2ndLine
		plateletChartModeOfTreatment.data.datasets[0].data[2] = reponse.chartStatusBaseline.supportivePalliativeOnly
		plateletChartModeOfTreatment.data.datasets[0].data[3] = reponse.chartStatusBaseline.bothPharmacologicAndSupportive
		plateletChartModeOfTreatment.data.datasets[0].data[4] = reponse.chartStatusBaseline.watchAndWait
		plateletChartModeOfTreatment.data.datasets[0].data[5] = reponse.chartStatusBaseline.others

		
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
		plateletChartModeOfTreatment.data.datasets[0].data[0] = reponse.chartStatusBaseline.pharmacologic1stLine
		plateletChartModeOfTreatment.data.datasets[0].data[1] = reponse.chartStatusBaseline.pharmacologic2ndLine
		plateletChartModeOfTreatment.data.datasets[0].data[2] = reponse.chartStatusBaseline.supportivePalliativeOnly
		plateletChartModeOfTreatment.data.datasets[0].data[3] = reponse.chartStatusBaseline.bothPharmacologicAndSupportive
		plateletChartModeOfTreatment.data.datasets[0].data[4] = reponse.chartStatusBaseline.watchAndWait
		plateletChartModeOfTreatment.data.datasets[0].data[5] = reponse.chartStatusBaseline.others

		
		plateletChartModeOfTreatment.update()
	}).fail(function() {
	});
});


//baseline
$("#baselineStatisticsFromPlateletDisorder").on('input', function() {
	restoreValues()
	params.baselinePass = '1'
		params.action = '7'
	params.sortFrom = $("#baselineStatisticsFromPlateletDisorder").val()
	params.sortTo = $("#baselineStatisticsToPlateletDisorder").val()
	
	$.post('DashboardDataServlet', $.param(params), function(response) {
		plateletChartBaselineDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.newlyDiagnosedITP
		plateletChartBaselineDiseaseStatus.data.datasets[0].data[1] = reponse.chartStatusBaseline.persistentITP
		plateletChartBaselineDiseaseStatus.data.datasets[0].data[2] = reponse.chartStatusBaseline.chronicITP
		plateletChartBaselineDiseaseStatus.data.datasets[0].data[3] = reponse.chartStatusBaseline.severeITP
		
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
		plateletChartBaselineDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.newlyDiagnosedITP
		plateletChartBaselineDiseaseStatus.data.datasets[0].data[1] = reponse.chartStatusBaseline.persistentITP
		plateletChartBaselineDiseaseStatus.data.datasets[0].data[2] = reponse.chartStatusBaseline.chronicITP
		plateletChartBaselineDiseaseStatus.data.datasets[0].data[3] = reponse.chartStatusBaseline.severeITP
		
		plateletChartBaselineDiseaseStatus.update()
	}).fail(function() {
	});
});

//followup
$("#followupStatisticsFromPlateletDisorder").on('input', function() {
	restoreValues()
	params.followupPass = '1'
		params.action = '7'
	params.sortFrom = $("#followupStatisticsFromPlateletDisorder").val()
	params.sortTo = $("#followupStatisticsToPlateletDisorder").val()
	
	$.post('DashboardDataServlet', $.param(params), function(response) {
		plateletChartFollowupDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.cr
		plateletChartFollowupDiseaseStatus.data.datasets[0].data[1] = reponse.chartStatusBaseline.remission
		plateletChartFollowupDiseaseStatus.data.datasets[0].data[2] = reponse.chartStatusBaseline.timeToResponse
		plateletChartFollowupDiseaseStatus.data.datasets[0].data[3] = reponse.chartStatusBaseline.nr
		plateletChartFollowupDiseaseStatus.data.datasets[0].data[4] = reponse.chartStatusBaseline.lossofCR
		plateletChartFollowupDiseaseStatus.data.datasets[0].data[5] = reponse.chartStatusBaseline.refractoryITP
		plateletChartFollowupDiseaseStatus.data.datasets[0].data[6] = reponse.chartStatusBaseline.sd
		plateletChartFollowupDiseaseStatus.data.datasets[0].data[7] = reponse.chartStatusBaseline.dead
		plateletChartFollowupDiseaseStatus.data.datasets[0].data[8] = reponse.chartStatusBaseline.others

		
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
		plateletChartFollowupDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.cr
		plateletChartFollowupDiseaseStatus.data.datasets[0].data[1] = reponse.chartStatusBaseline.remission
		plateletChartFollowupDiseaseStatus.data.datasets[0].data[2] = reponse.chartStatusBaseline.timeToResponse
		plateletChartFollowupDiseaseStatus.data.datasets[0].data[3] = reponse.chartStatusBaseline.nr
		plateletChartFollowupDiseaseStatus.data.datasets[0].data[4] = reponse.chartStatusBaseline.lossofCR
		plateletChartFollowupDiseaseStatus.data.datasets[0].data[5] = reponse.chartStatusBaseline.refractoryITP
		plateletChartFollowupDiseaseStatus.data.datasets[0].data[6] = reponse.chartStatusBaseline.sd
		plateletChartFollowupDiseaseStatus.data.datasets[0].data[7] = reponse.chartStatusBaseline.dead
		plateletChartFollowupDiseaseStatus.data.datasets[0].data[8] = reponse.chartStatusBaseline.others

		
		plateletChartFollowupDiseaseStatus.update()
	}).fail(function() {
	});
});

//coag
//from and to
//age
$("#ageStatisticsFromCoagulation").on('input', function() {
	restoreValues()
	params.agePass = '1'
		params.action = '2'
	params.sortFrom = $("#ageStatisticsFromCoagulation").val()
	params.sortTo = $("#ageStatisticsFromCoagulation").val()
	
	$.post('DashboardDataServlet', $.param(params), function(response) {
		for(var i = 0; i < response.chartAge.ageChart.length; i++){
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
		for(var i = 0; i < response.chartAge.ageChart.length; i++){
			coagulationChartAge.data.datasets[0].data[i] = response.chartAge.ageChart[i];
		}
		coagulationChartAge.update()
	}).fail(function() {
	});
});

//gender
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

//mode
$("#modeOfTreatmentStatisticsFromCoagulation").on('input', function() {
	restoreValues()
	params.modeOfTreatmentPass = '1'
		params.action = '2'
	params.sortFrom = $("#modeOfTreatmentStatisticsFromCoagulation").val()
	params.sortTo = $("#modeOfTreatmentStatisticsToCoagulation").val()
	
	$.post('DashboardDataServlet', $.param(params), function(response) {
		coagulationChartModeOfTreatment.data.datasets[0].data[0] = reponse.chartStatusBaseline.factorConcentrates
		coagulationChartModeOfTreatment.data.datasets[0].data[1] = reponse.chartStatusBaseline.blooComponent
		coagulationChartModeOfTreatment.data.datasets[0].data[2] = reponse.chartStatusBaseline.others
		
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
		coagulationChartModeOfTreatment.data.datasets[0].data[0] = reponse.chartStatusBaseline.factorConcentrates
		coagulationChartModeOfTreatment.data.datasets[0].data[1] = reponse.chartStatusBaseline.blooComponent
		coagulationChartModeOfTreatment.data.datasets[0].data[2] = reponse.chartStatusBaseline.others
		
		coagulationChartModeOfTreatment.update()
	}).fail(function() {
	});
});


//baseline
$("#baselineStatisticsFromCoagulation").on('input', function() {
	restoreValues()
	params.baselinePass = '1'
		params.action = '2'
	params.sortFrom = $("#baselineStatisticsFromCoagulation").val()
	params.sortTo = $("#baselineStatisticsToCoagulation").val()
	
	$.post('DashboardDataServlet', $.param(params), function(response) {
		coagulationChartBaselineDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.sd

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
		coagulationChartBaselineDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.sd

		coagulationChartBaselineDiseaseStatus.update()
	}).fail(function() {
	});
});

//followup
$("#followupStatisticsFromCoagulation").on('input', function() {
	restoreValues()
	params.followupPass = '1'
		params.action = '2'
	params.sortFrom = $("#followupStatisticsFromCoagulation").val()
	params.sortTo = $("#followupStatisticsToCoagulation").val()
	
	$.post('DashboardDataServlet', $.param(params), function(response) {
		coagulationChartFollowupDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.sd
		
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
		coagulationChartFollowupDiseaseStatus.data.datasets[0].data[0] = reponse.chartStatusBaseline.sd
		
		coagulationChartFollowupDiseaseStatus.update()
	}).fail(function() {
	});
});
