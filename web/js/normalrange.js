function checkGenderVal() {
	if ($("input[name=gender][value='1']").is(':checked')) {
		return 1;
	} else if ($("input[name=gender][value='2']").is(':checked')) {
		return 2;
	}
}

// different values oninput
if (document.getElementById('hemoglobin')) {
	hemoglobin.oninput = function() {
		hemoglobinFunc();
	};
}

if (document.getElementById('hematocrit')) {
	hematocrit.oninput = function() {
		hematocritFunc();
	};
}

if (document.getElementById('creatinine')) {
	creatinine.oninput = function() {
		creatinineFunc();
	};
}

if (document.getElementById('uricAcid')) {
	uricAcid.oninput = function() {
		uricAcidFunc();
	};
}

if (document.getElementById('serumIron')) {
	serumIron.oninput = function() {
		serumIronFunc();
	};
}

if (document.getElementById('serumFerritin')) {
	serumFerritin.oninput = function() {
		serumFerritinFunc();
	};
}

// same values oninput
if (document.getElementById('whiteBloodCells')) {
	whiteBloodCells.oninput = function() {
		whiteBloodCellsFunc();
	}
}

if (document.getElementById('neutrophils')) {
	neutrophils.oninput = function() {
		neutrophilsFunc();
	}
}

if (document.getElementById('lymphocytes')) {
	lymphocytes.oninput = function() {
		lymphocytesFunc();
	};
}

if (document.getElementById('monocytes')) {
	monocytes.oninput = function() {
		monocytesFunc();
	};
}

if (document.getElementById('eosinophils')) {
	eosinophils.oninput = function() {
		eosinophilsFunc();
	};
}

if (document.getElementById('basophils')) {
	basophils.oninput = function() {
		basophilsFunc();
	};
}

if (document.getElementById('myelocytes')) {
	myelocytes.oninput = function() {
		myelocytesFunc();
	};
}

if (document.getElementById('metamyelocytes')) {
	metamyelocytes.oninput = function() {
		metamyelocytesFunc();
	};
}

if (document.getElementById('blasts')) {
	blasts.oninput = function() {
		blastsFunc();
	};
}

if (document.getElementById('factorVIII')) {
	factorVIII.oninput = function() {
		factorVIIIFunc();
	};
}

if (document.getElementById('factorIX')) {
	factorIX.oninput = function() {
		factorIXFunc();
	};
}

if (document.getElementById('inhibitorAssay')) {
	inhibitorAssay.oninput = function() {
		inhibitorAssayFunc();
	};
}

if (document.getElementById('bUnits')) {
	bUnits.oninput = function() {
		bUnitsFunc();
	};
}

if (document.getElementById('na')) {
	na.oninput = function() {
		naFunc();
	};
}

if (document.getElementById('k')) {
	k.oninput = function() {
		kFunc();
	};
}

if (document.getElementById('bilirubin')) {
	bilirubin.oninput = function() {
		bilirubinFunc();
	};
}

if (document.getElementById('total')) {
	total.oninput = function() {
		totalFunc();
	};
}

if (document.getElementById('direct')) {
	direct.oninput = function() {
		directFunc();
	};
}

if (document.getElementById('indirect')) {
	indirect.oninput = function() {
		indirectFunc();
	};
}

if (document.getElementById('plateletCount')) {
	plateletCount.oninput = function() {
		plateletCountFunc();
	};
}

if (document.getElementById('bun')) {
	bun.oninput = function() {
		bunFunc();
	};
}

if (document.getElementById('ionized')) {
	ionized.oninput = function() {
		ionizedCountFunc();
	};
}

if (document.getElementById('totalprotein')) {
	totalprotein.oninput = function() {
		totalproteinCountFunc();
	};
}

if (document.getElementById('albumin')) {
	albumin.oninput = function() {
		albuminCountFunc();
	};
}

if (document.getElementById('globulin')) {
	globulin.oninput = function() {
		globulinCountFunc();
	};
}

if (document.getElementById('reticulocyteCount')) {
	reticulocyteCount.oninput = function() {
		reticulocyteCountFunc();
	};
}

if (document.getElementById('ironBindingCapacity')) {
	ironBindingCapacity.oninput = function() {
		ironBindingCapacityFunc();
	};
}

if (document.getElementById('sgot')) {
	sgot.oninput = function() {
		sgotFunc();
	};
}

if (document.getElementById('sgpt')) {
	sgpt.oninput = function() {
		sgptFunc();
	};
}

if (document.getElementById('beta2')) {
	beta2.oninput = function() {
		beta2Func();
	};
}

if (document.getElementById('hepaB')) {
	hepaB.oninput = function() {
		hepaBFunc();
	};
}

if (document.getElementById('ldh')) {
	ldh.oninput = function() {
		ldhFunc();
	};
}

if (document.getElementById('epo')) {
	epo.oninput = function() {
		epoFunc();
	};
}

if (document.getElementById('esr')) {
	esr.oninput = function() {
		esrBFunc();
	};
}

if (document.getElementById('erythropoeitinLevel')) {
	erythropoeitinLevel.oninput = function() {
		erythropoeitinLevelFunc();
	};
}

if (document.getElementById('serumFolicAcid')) {
	serumFolicAcid.oninput = function() {
		serumFolicAcidFunc();
	};
}

if (document.getElementById('serumB12')) {
	serumB12.oninput = function() {
		serumB12Func();
	};
}

if (document.getElementById('tsh')) {
	tsh.oninput = function() {
		tshFunc();
	};
}

if (document.getElementById('serumB12')) {
	serumB12.oninput = function() {
		serumB12Func();
	};
}

if (document.getElementById('tsh')) {
	tsh.oninput = function() {
		tshFunc();
	};
}

if (document.getElementById('anatiter')) {
	anatiter.oninput = function() {
		anatiterFunc();
	};
}

if (document.getElementById('hepacrna')) {
	hepacrna.oninput = function() {
		hepacrnaFunc();
	};
}

// different values func

function hemoglobinFunc() {
	var genderVal = checkGenderVal();
	if (genderVal == 1) {
		if (hemoglobin.value != '' && hemoglobin.value < 138) {
			document.getElementById('hemoglobinStatus').innerHTML = 'Low';
			document.getElementById('hemoglobinStatus').style.color = '#023564';
			hemoglobinStatus.style.visibility = 'visible';
		} else if (hemoglobin.value != '' && hemoglobin.value >= 138 && hemoglobin.value <= 172) {
			document.getElementById('hemoglobinStatus').innerHTML = 'Normal';
			document.getElementById('hemoglobinStatus').style.color = '#008000';
			hemoglobinStatus.style.visibility = 'visible';
		} else if (hemoglobin.value != '' && hemoglobin.value > 172) {
			document.getElementById('hemoglobinStatus').innerHTML = 'High';
			document.getElementById('hemoglobinStatus').style.color = '#F00';
			hemoglobinStatus.style.visibility = 'visible';
		} else {
			document.getElementById('hemoglobinStatus').innerHTML = '';
		}
	}
	if (genderVal == 2) {
		if (hemoglobin.value != '' && hemoglobin.value < 121) {
			document.getElementById('hemoglobinStatus').innerHTML = 'Low';
			document.getElementById('hemoglobinStatus').style.color = '#023564';
			hemoglobinStatus.style.visibility = 'visible';
		} else if (hemoglobin.value != '' && hemoglobin.value >= 121 && hemoglobin.value <= 151) {
			document.getElementById('hemoglobinStatus').innerHTML = 'Normal';
			document.getElementById('hemoglobinStatus').style.color = '#008000';
			hemoglobinStatus.style.visibility = 'visible';
		} else if (hemoglobin.value != '' && hemoglobin.value > 151) {
			document.getElementById('hemoglobinStatus').innerHTML = 'High';
			document.getElementById('hemoglobinStatus').style.color = '#F00';
			hemoglobinStatus.style.visibility = 'visible';
		} else {
			document.getElementById('hemoglobinStatus').innerHTML = '';
		}
	}
}

function hematocritFunc() {
	var genderVal = checkGenderVal();
	if (genderVal == 1) {
		if (hematocrit.value != '' && hematocrit.value < 40) {
			document.getElementById('hematocritStatus').innerHTML = 'Low';
			document.getElementById('hematocritStatus').style.color = '#023564';
			hematocritStatus.style.visibility = 'visible';
		} else if (hematocrit.value != '' && hematocrit.value >= 40 && hematocrit.value <= 54) {
			document.getElementById('hematocritStatus').innerHTML = 'Normal';
			document.getElementById('hematocritStatus').style.color = '#008000';
			hematocritStatus.style.visibility = 'visible';
		} else if (hematocrit.value != '' && hematocrit.value > 54) {
			document.getElementById('hematocritStatus').innerHTML = 'High';
			document.getElementById('hematocritStatus').style.color = '#F00';
			hematocritStatus.style.visibility = 'visible';
		} else {
			document.getElementById('hematocritStatus').innerHTML = '';
		}
	}
	if (genderVal == 2) {
		if (hematocrit.value != '' && hematocrit.value < 36) {
			document.getElementById('hematocritStatus').innerHTML = 'Low';
			document.getElementById('hematocritStatus').style.color = '#023564';
			hematocritStatus.style.visibility = 'visible';
		} else if (hematocrit.value != '' && hematocrit.value >= 36 && hematocrit.value <= 48) {
			document.getElementById('hematocritStatus').innerHTML = 'Normal';
			document.getElementById('hematocritStatus').style.color = '#008000';
			hematocritStatus.style.visibility = 'visible';
		} else if (hematocrit.value != '' && hematocrit.value > 48) {
			document.getElementById('hematocritStatus').innerHTML = 'High';
			document.getElementById('hematocritStatus').style.color = '#F00';
			hematocritStatus.style.visibility = 'visible';
		} else {
			document.getElementById('hematocritStatus').innerHTML = '';
		}
	}
}

function creatinineFunc() {
	var genderVal = checkGenderVal();
	if (genderVal == 1) {
		if (creatinine.value != '' && creatinine.value < 0.6) {
			document.getElementById('creatinineStatus').innerHTML = 'Low';
			document.getElementById('creatinineStatus').style.color = '#023564';
			creatinineStatus.style.visibility = 'visible';
		} else if (creatinine.value != '' && creatinine.value >= 0.6 && creatinine.value <= 1.2) {
			document.getElementById('creatinineStatus').innerHTML = 'Normal';
			document.getElementById('creatinineStatus').style.color = '#008000';
			creatinineStatus.style.visibility = 'visible';
		} else if (creatinine.value != '' && creatinine.value > 1.2) {
			document.getElementById('creatinineStatus').innerHTML = 'High';
			document.getElementById('creatinineStatus').style.color = '#F00';
			creatinineStatus.style.visibility = 'visible';
		} else {
			document.getElementById('creatinineStatus').innerHTML = '';
		}
	}
	if (genderVal == 2) {
		if (creatinine.value != '' && creatinine.value < 0.5) {
			document.getElementById('creatinineStatus').innerHTML = 'Low';
			document.getElementById('creatinineStatus').style.color = '#023564';
			creatinineStatus.style.visibility = 'visible';
		} else if (creatinine.value != '' && creatinine.value >= 0.5 && creatinine.value <= 1.1) {
			document.getElementById('creatinineStatus').innerHTML = 'Normal';
			document.getElementById('creatinineStatus').style.color = '#008000';
			creatinineStatus.style.visibility = 'visible';
		} else if (creatinine.value != '' && creatinine.value > 1.1) {
			document.getElementById('creatinineStatus').innerHTML = 'High';
			document.getElementById('creatinineStatus').style.color = '#F00';
			creatinineStatus.style.visibility = 'visible';
		} else {
			document.getElementById('creatinineStatus').innerHTML = '';
		}
	}
}

function uricAcidFunc() {
	var genderVal = checkGenderVal();
	if (genderVal == 1) {
		if (uricAcid.value != '' && uricAcid.value < 3.4) {
			document.getElementById('uricAcidStatus').innerHTML = 'Low';
			document.getElementById('uricAcidStatus').style.color = '#023564';
			uricAcidStatus.style.visibility = 'visible';
		} else if (uricAcid.value != '' && uricAcid.value >= 3.4 && uricAcid.value <= 7.0) {
			document.getElementById('uricAcidStatus').innerHTML = 'Normal';
			document.getElementById('uricAcidStatus').style.color = '#008000';
			uricAcidStatus.style.visibility = 'visible';
		} else if (uricAcid.value != '' && uricAcid.value > 7.0) {
			document.getElementById('uricAcidStatus').innerHTML = 'High';
			document.getElementById('uricAcidStatus').style.color = '#F00';
			uricAcidStatus.style.visibility = 'visible';
		} else {
			document.getElementById('uricAcidStatus').innerHTML = '';
		}
	}
	if (genderVal == 2) {
		if (uricAcid.value != '' && uricAcid.value < 2.4) {
			document.getElementById('uricAcidStatus').innerHTML = 'Low';
			document.getElementById('uricAcidStatus').style.color = '#023564';
			uricAcidStatus.style.visibility = 'visible';
		} else if (uricAcid.value != '' && uricAcid.value >= 2.4 && uricAcid.value <= 6.0) {
			document.getElementById('uricAcidStatus').innerHTML = 'Normal';
			document.getElementById('uricAcidStatus').style.color = '#008000';
			uricAcidStatus.style.visibility = 'visible';
		} else if (uricAcid.value != '' && uricAcid.value > 6.0) {
			document.getElementById('uricAcidStatus').innerHTML = 'High';
			document.getElementById('uricAcidStatus').style.color = '#F00';
			uricAcidStatus.style.visibility = 'visible';
		} else {
			document.getElementById('uricAcidStatus').innerHTML = '';
		}
	}
}

function serumIronFunc() {
	var genderVal = checkGenderVal();
	if (genderVal == 1) {
		if (serumIron.value != '' && serumIron.value < 65) {
			document.getElementById('serumIronStatus').innerHTML = 'Low';
			document.getElementById('serumIronStatus').style.color = '#023564';
			serumIronStatus.style.visibility = 'visible';
		} else if (serumIron.value != '' && serumIron.value >= 65 && serumIron.value <= 176) {
			document.getElementById('serumIronStatus').innerHTML = 'Normal';
			document.getElementById('serumIronStatus').style.color = '#008000';
			serumIronStatus.style.visibility = 'visible';
		} else if (serumIron.value != '' && serumIron.value > 176) {
			document.getElementById('serumIronStatus').innerHTML = 'High';
			document.getElementById('serumIronStatus').style.color = '#F00';
			serumIronStatus.style.visibility = 'visible';
		} else {
			document.getElementById('serumIronStatus').innerHTML = '';
		}
	}
	if (genderVal == 2) {
		if (serumIron.value != '' && serumIron.value < 50) {
			document.getElementById('serumIronStatus').innerHTML = 'Low';
			document.getElementById('serumIronStatus').style.color = '#023564';
			serumIronStatus.style.visibility = 'visible';
		} else if (serumIron.value != '' && serumIron.value >= 50 && serumIron.value <= 170) {
			document.getElementById('serumIronStatus').innerHTML = 'Normal';
			document.getElementById('serumIronStatus').style.color = '#008000';
			serumIronStatus.style.visibility = 'visible';
		} else if (serumIron.value != '' && serumIron.value > 170) {
			document.getElementById('serumIronStatus').innerHTML = 'High';
			document.getElementById('serumIronStatus').style.color = '#F00';
			serumIronStatus.style.visibility = 'visible';
		} else {
			document.getElementById('serumIronStatus').innerHTML = '';
		}
	}
}

function serumFerritinFunc() {
	var genderVal = checkGenderVal();
	if (genderVal == 1) {
		if (serumFerritin.value != '' && serumFerritin.value < 12) {
			document.getElementById('serumFerritinStatus').innerHTML = 'Low';
			document.getElementById('serumFerritinStatus').style.color = '#023564';
			serumFerritinStatus.style.visibility = 'visible';
		} else if (serumFerritin.value != '' && serumFerritin.value >= 12 && serumFerritin.value <= 300) {
			document.getElementById('serumFerritinStatus').innerHTML = 'Normal';
			document.getElementById('serumFerritinStatus').style.color = '#008000';
			serumFerritinStatus.style.visibility = 'visible';
		} else if (serumFerritin.value != '' && serumFerritin.value > 300) {
			document.getElementById('serumFerritinStatus').innerHTML = 'High';
			document.getElementById('serumFerritinStatus').style.color = '#F00';
			serumFerritinStatus.style.visibility = 'visible';
		} else {
			document.getElementById('serumFerritinStatus').innerHTML = '';
		}
	}
	if (genderVal == 2) {
		if (serumFerritin.value != '' && serumFerritin.value < 12) {
			document.getElementById('serumFerritinStatus').innerHTML = 'Low';
			document.getElementById('serumFerritinStatus').style.color = '#023564';
			serumFerritinStatus.style.visibility = 'visible';
		} else if (serumFerritin.value != '' && serumFerritin.value >= 12 && serumFerritin.value <= 150) {
			document.getElementById('serumFerritinStatus').innerHTML = 'Normal';
			document.getElementById('serumFerritinStatus').style.color = '#008000';
			serumFerritinStatus.style.visibility = 'visible';
		} else if (serumFerritin.value != '' && serumFerritin.value > 150) {
			document.getElementById('serumFerritinStatus').innerHTML = 'High';
			document.getElementById('serumFerritinStatus').style.color = '#F00';
			serumFerritinStatus.style.visibility = 'visible';
		} else {
			document.getElementById('serumFerritinStatus').innerHTML = '';
		}
	}
}

// same values func

function whiteBloodCellsFunc() {
	if (whiteBloodCells.value != '' && whiteBloodCells.value < 4.0) {
		document.getElementById('whiteBloodCellsStatus').innerHTML = 'Low';
		document.getElementById('whiteBloodCellsStatus').style.color = '#023564';
		whiteBloodCellsStatus.style.visibility = 'visible';
	} else if (whiteBloodCells.value != '' && whiteBloodCells.value >= 4.0 && whiteBloodCells.value <= 11.0) {
		document.getElementById('whiteBloodCellsStatus').innerHTML = 'Normal';
		document.getElementById('whiteBloodCellsStatus').style.color = '#008000';
		whiteBloodCellsStatus.style.visibility = 'visible';
	} else if (whiteBloodCells.value != '' && whiteBloodCells.value > 11.0) {
		document.getElementById('whiteBloodCellsStatus').innerHTML = 'High';
		document.getElementById('whiteBloodCellsStatus').style.color = '#F00';
		whiteBloodCellsStatus.style.visibility = 'visible';
	} else {
		document.getElementById('whiteBloodCellsStatus').innerHTML = '';
	}
}

function neutrophilsFunc() {
	if (neutrophils.value != '' && neutrophils.value < 45) {
		document.getElementById('neutrophilsStatus').innerHTML = 'Low';
		document.getElementById('neutrophilsStatus').style.color = '#023564';
		neutrophilsStatus.style.visibility = 'visible';
	} else if (neutrophils.value != '' && neutrophils.value >= 45 && neutrophils.value <= 80) {
		document.getElementById('neutrophilsStatus').innerHTML = 'Normal';
		document.getElementById('neutrophilsStatus').style.color = '#008000';
		neutrophilsStatus.style.visibility = 'visible';
	} else if (neutrophils.value != '' && neutrophils.value > 80) {
		document.getElementById('neutrophilsStatus').innerHTML = 'High';
		document.getElementById('neutrophilsStatus').style.color = '#F00';
		neutrophilsStatus.style.visibility = 'visible';
	} else {
		document.getElementById('neutrophilsStatus').innerHTML = '';
	}
}

function lymphocytesFunc() {
	if (lymphocytes.value != '' && lymphocytes.value < 20) {
		document.getElementById('lymphocytesStatus').innerHTML = 'Low';
		document.getElementById('lymphocytesStatus').style.color = '#023564';
		lymphocytesStatus.style.visibility = 'visible';
	} else if (lymphocytes.value != '' && lymphocytes.value >= 20 && lymphocytes.value <= 40) {
		document.getElementById('lymphocytesStatus').innerHTML = 'Normal';
		document.getElementById('lymphocytesStatus').style.color = '#008000';
		lymphocytesStatus.style.visibility = 'visible';
	} else if (lymphocytes.value != '' && lymphocytes.value > 40) {
		document.getElementById('lymphocytesStatus').innerHTML = 'High';
		document.getElementById('lymphocytesStatus').style.color = '#F00';
		lymphocytesStatus.style.visibility = 'visible';
	} else {
		document.getElementById('lymphocytesStatus').innerHTML = '';
	}
}

function monocytesFunc() {
	if (monocytes.value != '' && monocytes.value < 2) {
		document.getElementById('monocytesStatus').innerHTML = 'Low';
		document.getElementById('monocytesStatus').style.color = '#023564';
		monocytesStatus.style.visibility = 'visible';
	} else if (monocytes.value != '' && monocytes.value >= 2 && monocytes.value <= 10) {
		document.getElementById('monocytesStatus').innerHTML = 'Normal';
		document.getElementById('monocytesStatus').style.color = '#008000';
		monocytesStatus.style.visibility = 'visible';
	} else if (monocytes.value != '' && monocytes.value > 10) {
		document.getElementById('monocytesStatus').innerHTML = 'High';
		document.getElementById('monocytesStatus').style.color = '#F00';
		monocytesStatus.style.visibility = 'visible';
	} else {
		document.getElementById('monocytesStatus').innerHTML = '';
	}
}

function eosinophilsFunc() {
	if (eosinophils.value != '' && eosinophils.value < 1) {
		document.getElementById('eosinophilsStatus').innerHTML = 'Low';
		document.getElementById('eosinophilsStatus').style.color = '#023564';
		eosinophilsStatus.style.visibility = 'visible';
	} else if (eosinophils.value != '' && eosinophils.value >= 1 && eosinophils.value <= 6) {
		document.getElementById('eosinophilsStatus').innerHTML = 'Normal';
		document.getElementById('eosinophilsStatus').style.color = '#008000';
		eosinophilsStatus.style.visibility = 'visible';
	} else if (eosinophils.value != '' && eosinophils.value > 6) {
		document.getElementById('eosinophilsStatus').innerHTML = 'High';
		document.getElementById('eosinophilsStatus').style.color = '#F00';
		eosinophilsStatus.style.visibility = 'visible';
	} else {
		document.getElementById('eosinophilsStatus').innerHTML = '';
	}
}

function basophilsFunc() {
	if (basophils.value != '' && basophils.value < 0) {
		document.getElementById('basophilsStatus').innerHTML = 'Low';
		document.getElementById('basophilsStatus').style.color = '#023564';
		basophilsStatus.style.visibility = 'visible';
	} else if (basophils.value != '' && basophils.value >= 0 && basophils.value <= 2) {
		document.getElementById('basophilsStatus').innerHTML = 'Normal';
		document.getElementById('basophilsStatus').style.color = '#008000';
		basophilsStatus.style.visibility = 'visible';
	} else if (basophils.value != '' && basophils.value > 2) {
		document.getElementById('basophilsStatus').innerHTML = 'High';
		document.getElementById('basophilsStatus').style.color = '#F00';
		basophilsStatus.style.visibility = 'visible';
	} else {
		document.getElementById('basophilsStatus').innerHTML = '';
	}
}

function myelocytesFunc() {
	if (myelocytes.value != '' && myelocytes.value < 0) {
		document.getElementById('myelocytesStatus').innerHTML = 'Low';
		document.getElementById('myelocytesStatus').style.color = '#023564';
		myelocytesStatus.style.visibility = 'visible';
	} else if (myelocytes.value != '' && myelocytes.value == 0) {
		document.getElementById('myelocytesStatus').innerHTML = 'Normal';
		document.getElementById('myelocytesStatus').style.color = '#008000';
		myelocytesStatus.style.visibility = 'visible';
	} else if (myelocytes.value != '' && myelocytes.value > 0) {
		document.getElementById('myelocytesStatus').innerHTML = 'High';
		document.getElementById('myelocytesStatus').style.color = '#F00';
		myelocytesStatus.style.visibility = 'visible';
	} else {
		document.getElementById('myelocytesStatus').innerHTML = '';
	}
}

function metamyelocytesFunc() {
	if (metamyelocytes.value != '' && metamyelocytes.value < 0) {
		document.getElementById('metamyelocytesStatus').innerHTML = 'Low';
		document.getElementById('metamyelocytesStatus').style.color = '#023564';
		metamyelocytesStatus.style.visibility = 'visible';
	} else if (metamyelocytes.value != '' && metamyelocytes.value == 0) {
		document.getElementById('metamyelocytesStatus').innerHTML = 'Normal';
		document.getElementById('metamyelocytesStatus').style.color = '#008000';
		metamyelocytesStatus.style.visibility = 'visible';
	} else if (metamyelocytes.value != '' && metamyelocytes.value > 0) {
		document.getElementById('metamyelocytesStatus').innerHTML = 'High';
		document.getElementById('metamyelocytesStatus').style.color = '#F00';
		metamyelocytesStatus.style.visibility = 'visible';
	} else {
		document.getElementById('metamyelocytesStatus').innerHTML = '';
	}
}

function blastsFunc() {
	if (blasts.value != '' && blasts.value < 0) {
		document.getElementById('blastsStatus').innerHTML = 'Low';
		document.getElementById('blastsStatus').style.color = '#023564';
		blastsStatus.style.visibility = 'visible';
	} else if (blasts.value != '' && blasts.value == 0) {
		document.getElementById('blastsStatus').innerHTML = 'Normal';
		document.getElementById('blastsStatus').style.color = '#008000';
		blastsStatus.style.visibility = 'visible';
	} else if (blasts.value != '' && blasts.value > 0) {
		document.getElementById('blastsStatus').innerHTML = 'High';
		document.getElementById('blastsStatus').style.color = '#F00';
		blastsStatus.style.visibility = 'visible';
	} else {
		document.getElementById('blastsStatus').innerHTML = '';
	}
}

function plateletCountFunc() {
	if (plateletCount.value != '' && plateletCount.value < 150) {
		document.getElementById('plateletCountStatus').innerHTML = 'Low';
		document.getElementById('plateletCountStatus').style.color = '#023564';
		plateletCountStatus.style.visibility = 'visible';
	} else if (plateletCount.value != '' && plateletCount.value >= 150 && plateletCount.value <= 400) {
		document.getElementById('plateletCountStatus').innerHTML = 'Normal';
		document.getElementById('plateletCountStatus').style.color = '#008000';
		plateletCountStatus.style.visibility = 'visible';
	} else if (plateletCount.value != '' && plateletCount.value > 400) {
		document.getElementById('plateletCountStatus').innerHTML = 'High';
		document.getElementById('plateletCountStatus').style.color = '#F00';
		plateletCountStatus.style.visibility = 'visible';
	} else {
		document.getElementById('plateletCountStatus').innerHTML = '';
	}
}

function bunFunc() {
	if (bun.value != '' && bun.value < 7) {
		document.getElementById('bunStatus').innerHTML = 'Low';
		document.getElementById('bunStatus').style.color = '#023564';
		bunStatus.style.visibility = 'visible';
	} else if (bun.value != '' && bun.value >= 7 && bun.value <= 20) {
		document.getElementById('bunStatus').innerHTML = 'Normal';
		document.getElementById('bunStatus').style.color = '#008000';
		bunStatus.style.visibility = 'visible';
	} else if (bun.value != '' && bun.value > 20) {
		document.getElementById('bunStatus').innerHTML = 'High';
		document.getElementById('bunStatus').style.color = '#F00';
		bunStatus.style.visibility = 'visible';
	} else {
		document.getElementById('bunStatus').innerHTML = '';
	}
}

function ionizedFunc() {
	if (ionized.value != '' && ionized.value < 4.64) {
		document.getElementById('ionizedStatus').innerHTML = 'Low';
		document.getElementById('ionizedStatus').style.color = '#023564';
		ionizedStatus.style.visibility = 'visible';
	} else if (ionized.value != '' && ionized.value >= 4.64 && ionized.value <= 5.28) {
		document.getElementById('ionizedStatus').innerHTML = 'Normal';
		document.getElementById('ionizedStatus').style.color = '#008000';
		ionizedStatus.style.visibility = 'visible';
	} else if (ionized.value != '' && ionized.value > 5.28) {
		document.getElementById('ionizedStatus').innerHTML = 'High';
		document.getElementById('ionizedStatus').style.color = '#F00';
		ionizedStatus.style.visibility = 'visible';
	} else {
		document.getElementById('ionizedStatus').innerHTML = '';
	}
}

function totalproteinFunc() {
	if (totalprotein.value != '' && totalprotein.value < 6) {
		document.getElementById('totalproteinStatus').innerHTML = 'Low';
		document.getElementById('totalproteinStatus').style.color = '#023564';
		totalproteinStatus.style.visibility = 'visible';
	} else if (totalprotein.value != '' && totalprotein.value >= 6 && totalprotein.value <= 8.3) {
		document.getElementById('totalproteinStatus').innerHTML = 'Normal';
		document.getElementById('totalproteinStatus').style.color = '#008000';
		totalproteinStatus.style.visibility = 'visible';
	} else if (totalprotein.value != '' && totalprotein.value > 8.3) {
		document.getElementById('totalproteinStatus').innerHTML = 'High';
		document.getElementById('totalproteinStatus').style.color = '#F00';
		totalproteinStatus.style.visibility = 'visible';
	} else {
		document.getElementById('totalproteinStatus').innerHTML = '';
	}
}

function albuminFunc() {
	if (albumin.value != '' && albumin.value < 3.5) {
		document.getElementById('albuminStatus').innerHTML = 'Low';
		document.getElementById('albuminStatus').style.color = '#023564';
		albuminStatus.style.visibility = 'visible';
	} else if (albumin.value != '' && albumin.value >= 3.5 && albumin.value <= 5.5) {
		document.getElementById('albuminStatus').innerHTML = 'Normal';
		document.getElementById('albuminStatus').style.color = '#008000';
		albuminStatus.style.visibility = 'visible';
	} else if (albumin.value != '' && albumin.value > 5.5) {
		document.getElementById('albuminStatus').innerHTML = 'High';
		document.getElementById('albuminStatus').style.color = '#F00';
		albuminStatus.style.visibility = 'visible';
	} else {
		document.getElementById('albuminStatus').innerHTML = '';
	}
}

function globulinFunc() {
	if (globulin.value != '' && globulin.value < 2.0) {
		document.getElementById('globulinStatus').innerHTML = 'Low';
		document.getElementById('globulinStatus').style.color = '#023564';
		globulinStatus.style.visibility = 'visible';
	} else if (globulin.value != '' && globulin.value >= 2.0 && globulin.value <= 3.5) {
		document.getElementById('globulinStatus').innerHTML = 'Normal';
		document.getElementById('globulinStatus').style.color = '#008000';
		globulinStatus.style.visibility = 'visible';
	} else if (globulin.value != '' && globulin.value > 3.5) {
		document.getElementById('globulinStatus').innerHTML = 'High';
		document.getElementById('globulinStatus').style.color = '#F00';
		globulinStatus.style.visibility = 'visible';
	} else {
		document.getElementById('globulinStatus').innerHTML = '';
	}
}

function factorVIIIFunc() {
	alert('a')
	if (factorVIII.value != '' && factorVIII.value < 50) {
		document.getElementById('factorVIIIStatus').innerHTML = 'Low';
		document.getElementById('factorVIIIStatus').style.color = '#023564';
		factorVIIIStatus.style.visibility = 'visible';
	} else if (factorVIII.value != '' && factorVIII.value >= 50 && factorVIII.value <= 100) {
		document.getElementById('factorVIIIStatus').innerHTML = 'Normal';
		document.getElementById('factorVIIIStatus').style.color = '#008000';
		factorVIIIStatus.style.visibility = 'visible';
	} else if (factorVIII.value != '' && factorVIII.value > 100) {
		document.getElementById('factorVIIIStatus').innerHTML = 'High';
		document.getElementById('factorVIIIStatus').style.color = '#F00';
		factorVIIIStatus.style.visibility = 'visible';
	} else {
		document.getElementById('factorVIIIStatus').innerHTML = '';
	}

}

function factorIXFuncFunc() {
	if (factorIX.value != '' && factorIX.value < 50) {
		document.getElementById('factorIXStatus').innerHTML = 'Low';
		document.getElementById('factorIXStatus').style.color = '#023564';
		factorIXStatus.style.visibility = 'visible';
	} else if (factorIX.value != '' && factorIX.value >= 50 && factorIX.value <= 100) {
		document.getElementById('factorIXStatus').innerHTML = 'Normal';
		document.getElementById('factorIXStatus').style.color = '#008000';
		factorIXStatus.style.visibility = 'visible';
	} else if (factorIX.value != '' && factorIX.value > 100) {
		document.getElementById('factorIXStatus').innerHTML = 'High';
		document.getElementById('factorIXStatus').style.color = '#F00';
		factorIXStatus.style.visibility = 'visible';
	} else {
		document.getElementById('factorIXStatus').innerHTML = '';
	}
}

function inhibitorAssayFunc() {
	if (inhibitorAssay.value != '' && inhibitorAssay.value < 50) {
		document.getElementById('inhibitorAssayStatus').innerHTML = 'Low';
		document.getElementById('inhibitorAssayStatus').style.color = '#023564';
		inhibitorAssayStatus.style.visibility = 'visible';
	} else if (inhibitorAssay.value != '' && inhibitorAssay.value >= 50 && inhibitorAssay.value <= 150) {
		document.getElementById('inhibitorAssayStatus').innerHTML = 'Normal';
		document.getElementById('inhibitorAssayStatus').style.color = '#008000';
		inhibitorAssayStatus.style.visibility = 'visible';
	} else if (inhibitorAssay.value != '' && inhibitorAssay.value > 150) {
		document.getElementById('inhibitorAssayStatus').innerHTML = 'High';
		document.getElementById('inhibitorAssayStatus').style.color = '#F00';
		inhibitorAssayStatus.style.visibility = 'visible';
	} else {
		document.getElementById('inhibitorAssayStatus').innerHTML = '';
	}
}

function bUnitsFunc() {
	if (bUnits.value != '' && bUnits.value < 5) {
		document.getElementById('bUnitsStatus').innerHTML = 'Normal';
		document.getElementById('bUnitsStatus').style.color = '#023564';
		bUnitsStatus.style.visibility = 'visible';
	} else if (bUnits.value != '' && bUnits.value == 5) {
		document.getElementById('bUnitsStatus').innerHTML = 'Low';
		document.getElementById('bUnitsStatus').style.color = '#008000';
		bUnitsStatus.style.visibility = 'visible';
	} else if (bUnits.value != '' && bUnits.value > 5) {
		document.getElementById('bUnitsStatus').innerHTML = 'High';
		document.getElementById('bUnitsStatus').style.color = '#F00';
		bUnitsStatus.style.visibility = 'visible';
	} else {
		document.getElementById('bUnitsStatus').innerHTML = '';
	}
}

function naFunc() {
	if (na.value != '' && na.value < 135) {
		document.getElementById('naStatus').innerHTML = 'Low';
		document.getElementById('naStatus').style.color = '#023564';
		naStatus.style.visibility = 'visible';
	} else if (na.value != '' && na.value >= 135 && na.value <= 145) {
		document.getElementById('naStatus').innerHTML = 'Normal';
		document.getElementById('naStatus').style.color = '#008000';
		naStatus.style.visibility = 'visible';
	} else if (na.value != '' && na.value > 145) {
		document.getElementById('naStatus').innerHTML = 'High';
		document.getElementById('naStatus').style.color = '#F00';
		naStatus.style.visibility = 'visible';
	} else {
		document.getElementById('naStatus').innerHTML = '';
	}
}

function kFunc() {
	if (k.value != '' && k.value < 13.65) {
		document.getElementById('kStatus').innerHTML = 'Low';
		document.getElementById('kStatus').style.color = '#023564';
		kStatus.style.visibility = 'visible';
	} else if (k.value != '' && k.value >= 13.65 && k.value <= 21.45) {
		document.getElementById('kStatus').innerHTML = 'Normal';
		document.getElementById('kStatus').style.color = '#008000';
		kStatus.style.visibility = 'visible';
	} else if (k.value != '' && k.value > 21.45) {
		document.getElementById('kStatus').innerHTML = 'High';
		document.getElementById('kStatus').style.color = '#F00';
		kStatus.style.visibility = 'visible';
	} else {
		document.getElementById('kStatus').innerHTML = '';
	}
}

function bilirubinFunc() {
	if (bilirubin.value != '' && bilirubin.value < 0.2) {
		document.getElementById('bilirubinStatus').innerHTML = 'Low';
		document.getElementById('bilirubinStatus').style.color = '#023564';
		bilirubinStatus.style.visibility = 'visible';
	} else if (bilirubin.value != '' && bilirubin.value >= 0.2 && bilirubin.value <= 1.2) {
		document.getElementById('bilirubinStatus').innerHTML = 'Normal';
		document.getElementById('bilirubinStatus').style.color = '#008000';
		bilirubinStatus.style.visibility = 'visible';
	} else if (bilirubin.value != '' && bilirubin.value > 1.2) {
		document.getElementById('bilirubinStatus').innerHTML = 'High';
		document.getElementById('bilirubinStatus').style.color = '#F00';
		bilirubinStatus.style.visibility = 'visible';
	} else {
		document.getElementById('bilirubinStatus').innerHTML = '';
	}
}

function totalFunc() {
	if (total.value != '' && total.value < 0.2) {
		document.getElementById('totalStatus').innerHTML = 'Low';
		document.getElementById('totalStatus').style.color = '#023564';
		totalStatus.style.visibility = 'visible';
	} else if (total.value != '' && total.value >= 0.2 && total.value <= 1.2) {
		document.getElementById('totalStatus').innerHTML = 'Normal';
		document.getElementById('totalStatus').style.color = '#008000';
		totalStatus.style.visibility = 'visible';
	} else if (total.value != '' && total.value > 1.2) {
		document.getElementById('totalStatus').innerHTML = 'High';
		document.getElementById('totalStatus').style.color = '#F00';
		totalStatus.style.visibility = 'visible';
	} else {
		document.getElementById('totalStatus').innerHTML = '';
	}
}

function directFunc() {
	if (direct.value != '' && direct.value < 0) {
		document.getElementById('directStatus').innerHTML = 'Low';
		document.getElementById('directStatus').style.color = '#023564';
		directStatus.style.visibility = 'visible';
	} else if (direct.value != '' && direct.value >= 0 && direct.value <= 0.4) {
		document.getElementById('directStatus').innerHTML = 'Normal';
		document.getElementById('directStatus').style.color = '#008000';
		directStatus.style.visibility = 'visible';
	} else if (direct.value != '' && direct.value > 0.4) {
		document.getElementById('directStatus').innerHTML = 'High';
		document.getElementById('directStatus').style.color = '#F00';
		directStatus.style.visibility = 'visible';
	} else {
		document.getElementById('directStatus').innerHTML = '';
	}
}

function indirectFunc() {
	if (indirect.value != '' && indirect.value < 0) {
		document.getElementById('indirectStatus').innerHTML = 'Low';
		document.getElementById('indirectStatus').style.color = '#023564';
		indirectStatus.style.visibility = 'visible';
	} else if (indirect.value != '' && indirect.value >= 0 && indirect.value <= 0.4) {
		document.getElementById('indirectStatus').innerHTML = 'Normal';
		document.getElementById('indirectStatus').style.color = '#008000';
		indirectStatus.style.visibility = 'visible';
	} else if (indirect.value != '' && indirect.value > 0.4) {
		document.getElementById('indirectStatus').innerHTML = 'High';
		document.getElementById('indirectStatus').style.color = '#F00';
		indirectStatus.style.visibility = 'visible';
	} else {
		document.getElementById('indirectStatus').innerHTML = '';
	}
}

function beta2Func() {
	if (beta2.value != '' && beta2.value < 0) {
		document.getElementById('beta2Status').innerHTML = 'Low';
		document.getElementById('beta2Status').style.color = '#023564';
		beta2Status.style.visibility = 'visible';
	} else if (beta2.value != '' && beta2.value >= 0 && beta2.value <= 0.3) {
		document.getElementById('beta2Status').innerHTML = 'Normal';
		document.getElementById('beta2Status').style.color = '#008000';
		beta2Status.style.visibility = 'visible';
	} else if (beta2.value != '' && beta2.value > 0.3) {
		document.getElementById('beta2Status').innerHTML = 'High';
		document.getElementById('beta2Status').style.color = '#F00';
		beta2Status.style.visibility = 'visible';
	} else {
		document.getElementById('beta2Status').innerHTML = '';
	}
}

function hepaBFunc() {
	if (hepaB.value != '' && hepaB.value < 1) {
		document.getElementById('hepaBStatus').innerHTML = 'Low';
		document.getElementById('hepaBStatus').style.color = '#023564';
		hepaBStatus.style.visibility = 'visible';
	} else if (hepaB.value != '' && hepaB.value >= 1 && hepaB.value <= 5) {
		document.getElementById('hepaBStatus').innerHTML = 'Normal';
		document.getElementById('hepaBStatus').style.color = '#008000';
		hepaBStatus.style.visibility = 'visible';
	} else if (hepaB.value != '' && hepaB.value > 5) {
		document.getElementById('hepaBStatus').innerHTML = 'High';
		document.getElementById('hepaBStatus').style.color = '#F00';
		hepaBStatus.style.visibility = 'visible';
	} else {
		document.getElementById('hepaBStatus').innerHTML = '';
	}
}

function reticulocyteCountFunc() {
	if (reticulocyteCount.value != '' && reticulocyteCount.value < 0.5) {
		document.getElementById('reticulocyteCountStatus').innerHTML = 'Low';
		document.getElementById('reticulocyteCountStatus').style.color = '#023564';
		reticulocyteCountStatus.style.visibility = 'visible';
	} else if (reticulocyteCount.value != '' && reticulocyteCount.value >= 0.5 && reticulocyteCount.value <= 1.5) {
		document.getElementById('reticulocyteCountStatus').innerHTML = 'Normal';
		document.getElementById('reticulocyteCountStatus').style.color = '#008000';
		reticulocyteCountStatus.style.visibility = 'visible';
	} else if (reticulocyteCount.value != '' && reticulocyteCount.value > 1.5) {
		document.getElementById('reticulocyteCountStatus').innerHTML = 'High';
		document.getElementById('reticulocyteCountStatus').style.color = '#F00';
		reticulocyteCountStatus.style.visibility = 'visible';
	} else {
		document.getElementById('reticulocyteCountStatus').innerHTML = '';
	}
}

function ironBindingCapacityFunc() {
	if (ironBindingCapacity.value != '' && ironBindingCapacity.value < 240) {
		document.getElementById('ironBindingCapacityStatus').innerHTML = 'Low';
		document.getElementById('ironBindingCapacityStatus').style.color = '#023564';
		ironBindingCapacityStatus.style.visibility = 'visible';
	} else if (ironBindingCapacity.value != '' && ironBindingCapacity.value >= 240 && ironBindingCapacity.value <= 450) {
		document.getElementById('ironBindingCapacityStatus').innerHTML = 'Normal';
		document.getElementById('ironBindingCapacityStatus').style.color = '#008000';
		ironBindingCapacityStatus.style.visibility = 'visible';
	} else if (ironBindingCapacity.value != '' && ironBindingCapacity.value > 450) {
		document.getElementById('ironBindingCapacityStatus').innerHTML = 'High';
		document.getElementById('ironBindingCapacityStatus').style.color = '#F00';
		ironBindingCapacityStatus.style.visibility = 'visible';
	} else {
		document.getElementById('ironBindingCapacityStatus').innerHTML = '';
	}
}

function sgotFunc() {
	if (sgot.value != '' && sgot.value < 5) {
		document.getElementById('sgotStatus').innerHTML = 'Low';
		document.getElementById('sgotStatus').style.color = '#023564';
		sgotStatus.style.visibility = 'visible';
	} else if (sgot.value != '' && sgot.value >= 5 && sgot.value <= 40) {
		document.getElementById('sgotStatus').innerHTML = 'Normal';
		document.getElementById('sgotStatus').style.color = '#008000';
		sgotStatus.style.visibility = 'visible';
	} else if (sgot.value != '' && sgot.value > 40) {
		document.getElementById('sgotStatus').innerHTML = 'High';
		document.getElementById('sgotStatus').style.color = '#F00';
		sgotStatus.style.visibility = 'visible';
	} else {
		document.getElementById('sgotStatus').innerHTML = '';
	}
}

function sgptFunc() {
	if (sgpt.value != '' && sgpt.value < 7) {
		document.getElementById('sgptStatus').innerHTML = 'Low';
		document.getElementById('sgptStatus').style.color = '#023564';
		sgptStatus.style.visibility = 'visible';
	} else if (sgpt.value != '' && sgpt.value >= 7 && sgpt.value <= 56) {
		document.getElementById('sgptStatus').innerHTML = 'Normal';
		document.getElementById('sgptStatus').style.color = '#008000';
		sgptStatus.style.visibility = 'visible';
	} else if (sgpt.value != '' && sgpt.value > 56) {
		document.getElementById('sgptStatus').innerHTML = 'High';
		document.getElementById('sgptStatus').style.color = '#F00';
		sgptStatus.style.visibility = 'visible';
	} else {
		document.getElementById('sgptStatus').innerHTML = '';
	}
}

function ldhFunc() {
	if (ldh.value != '' && ldh.value < 100) {
		document.getElementById('ldhStatus').innerHTML = 'Low';
		document.getElementById('ldhStatus').style.color = '#023564';
		ldhStatus.style.visibility = 'visible';
	} else if (ldh.value != '' && ldh.value >= 100 && ldh.value <= 190) {
		document.getElementById('ldhStatus').innerHTML = 'Normal';
		document.getElementById('ldhStatus').style.color = '#008000';
		ldhStatus.style.visibility = 'visible';
	} else if (ldh.value != '' && ldh.value > 190) {
		document.getElementById('ldhStatus').innerHTML = 'High';
		document.getElementById('ldhStatus').style.color = '#F00';
		ldhStatus.style.visibility = 'visible';
	} else {
		document.getElementById('ldhStatus').innerHTML = '';
	}
}

function epoFunc() {
	if (epo.value != '' && epo.value < 3.7) {
		document.getElementById('epoStatus').innerHTML = 'Low';
		document.getElementById('epoStatus').style.color = '#023564';
		epoStatus.style.visibility = 'visible';
	} else if (epo.value != '' && epo.value >= 3.7 && epo.value <= 36) {
		document.getElementById('epoStatus').innerHTML = 'Normal';
		document.getElementById('epoStatus').style.color = '#008000';
		epoStatus.style.visibility = 'visible';
	} else if (epo.value != '' && epo.value > 36) {
		document.getElementById('epoStatus').innerHTML = 'High';
		document.getElementById('epoStatus').style.color = '#F00';
		epoStatus.style.visibility = 'visible';
	} else {
		document.getElementById('epoStatus').innerHTML = '';
	}
}

function esrFunc() {
	if (esr.value != '' && esr.value < 0) {
		document.getElementById('esrStatus').innerHTML = 'Low';
		document.getElementById('esrStatus').style.color = '#023564';
		esrStatus.style.visibility = 'visible';
	} else if (esr.value != '' && esr.value >= 0 && esr.value <= 22) {
		document.getElementById('esrStatus').innerHTML = 'Normal';
		document.getElementById('esrStatus').style.color = '#008000';
		esrStatus.style.visibility = 'visible';
	} else if (esr.value != '' && esr.value > 22) {
		document.getElementById('esrStatus').innerHTML = 'High';
		document.getElementById('esrStatus').style.color = '#F00';
		esrStatus.style.visibility = 'visible';
	} else {
		document.getElementById('esrStatus').innerHTML = '';
	}
}

function erythropoeitinLevelFunc() {
	if (erythropoeitinLevel.value != '' && erythropoeitinLevel.value < 4.1) {
		document.getElementById('erythropoeitinLevelStatus').innerHTML = 'Low';
		document.getElementById('erythropoeitinLevelStatus').style.color = '#023564';
		erythropoeitinLevelStatus.style.visibility = 'visible';
	} else if (erythropoeitinLevel.value != '' && erythropoeitinLevel.value >= 4.1 && erythropoeitinLevel.value <= 19.5) {
		document.getElementById('erythropoeitinLevelStatus').innerHTML = 'Normal';
		document.getElementById('erythropoeitinLevelStatus').style.color = '#008000';
		erythropoeitinLevelStatus.style.visibility = 'visible';
	} else if (erythropoeitinLevel.value != '' && erythropoeitinLevel.value > 19.5) {
		document.getElementById('erythropoeitinLevelStatus').innerHTML = 'High';
		document.getElementById('erythropoeitinLevelStatus').style.color = '#F00';
		erythropoeitinLevelStatus.style.visibility = 'visible';
	} else {
		document.getElementById('erythropoeitinLevelStatus').innerHTML = '';
	}
}

function serumFolicAcidFunc() {
	if (serumFolicAcid.value != '' && serumFolicAcid.value < 2) {
		document.getElementById('serumFolicAcidStatus').innerHTML = 'Low';
		document.getElementById('serumFolicAcidStatus').style.color = '#023564';
		serumFolicAcidStatus.style.visibility = 'visible';
	} else if (serumFolicAcid.value != '' && serumFolicAcid.value >= 2 && serumFolicAcid.value <= 20) {
		document.getElementById('serumFolicAcidStatus').innerHTML = 'Normal';
		document.getElementById('serumFolicAcidStatus').style.color = '#008000';
		serumFolicAcidStatus.style.visibility = 'visible';
	} else if (serumFolicAcid.value != '' && serumFolicAcid.value > 20) {
		document.getElementById('serumFolicAcidStatus').innerHTML = 'High';
		document.getElementById('serumFolicAcidStatus').style.color = '#F00';
		serumFolicAcidStatus.style.visibility = 'visible';
	} else {
		document.getElementById('serumFolicAcidStatus').innerHTML = '';
	}
}

function serumB12Func() {
	if (serumB12.value != '' && serumB12.value < 200) {
		document.getElementById('serumB12Status').innerHTML = 'Low';
		document.getElementById('serumB12Status').style.color = '#023564';
		serumB12Status.style.visibility = 'visible';
	} else if (serumB12.value != '' && serumB12.value >= 200 && serumB12.value <= 900) {
		document.getElementById('serumB12Status').innerHTML = 'Normal';
		document.getElementById('serumB12Status').style.color = '#008000';
		serumB12Status.style.visibility = 'visible';
	} else if (serumB12.value != '' && serumB12.value > 900) {
		document.getElementById('serumB12Status').innerHTML = 'High';
		document.getElementById('serumB12Status').style.color = '#F00';
		serumB12Status.style.visibility = 'visible';
	} else {
		document.getElementById('serumB12Status').innerHTML = '';
	}
}

function tshFunc() {
	if (tsh.value != '' && tsh.value < 0.4) {
		document.getElementById('tshStatus').innerHTML = 'Low';
		document.getElementById('tshStatus').style.color = '#023564';
		tshStatus.style.visibility = 'visible';
	} else if (tsh.value != '' && tsh.value >= 0.4 && tsh.value <= 4.0) {
		document.getElementById('tshStatus').innerHTML = 'Normal';
		document.getElementById('tshStatus').style.color = '#008000';
		tshStatus.style.visibility = 'visible';
	} else if (tsh.value != '' && tsh.value > 4.0) {
		document.getElementById('tshStatus').innerHTML = 'High';
		document.getElementById('tshStatus').style.color = '#F00';
		tshStatus.style.visibility = 'visible';
	} else {
		document.getElementById('tshStatus').innerHTML = '';
	}
}

function anatiterFunc() {
	if (anatiter.value != '' && anatiter.value < 40) {
		document.getElementById('anatiterStatus').innerHTML = 'Low';
		document.getElementById('anatiterStatus').style.color = '#023564';
		anatiterStatus.style.visibility = 'visible';
	} else if (anatiter.value != '' && anatiter.value >= 40 && anatiter.value <= 60) {
		document.getElementById('anatiterStatus').innerHTML = 'Normal';
		document.getElementById('anatiterStatus').style.color = '#008000';
		anatiterStatus.style.visibility = 'visible';
	} else if (anatiter.value != '' && anatiter.value > 60) {
		document.getElementById('anatiterStatus').innerHTML = 'High';
		document.getElementById('anatiterStatus').style.color = '#F00';
		anatiterStatus.style.visibility = 'visible';
	} else {
		document.getElementById('anatiterStatus').innerHTML = '';
	}
}

function hepacrnaFunc() {
	if (hepacrna.value != '' && hepacrna.value < 800000) {
		document.getElementById('hepacrnaStatus').innerHTML = 'Low';
		document.getElementById('hepacrnaStatus').style.color = '#023564';
		hepacrnaStatus.style.visibility = 'visible';
	} else if (hepacrna.value != '' && hepacrna.value == 800000) {
		document.getElementById('hepacrnaStatus').innerHTML = 'Normal';
		document.getElementById('hepacrnaStatus').style.color = '#008000';
		hepacrnaStatus.style.visibility = 'visible';
	} else if (hepacrna.value != '' && hepacrna.value > 800000) {
		document.getElementById('hepacrnaStatus').innerHTML = 'High';
		document.getElementById('hepacrnaStatus').style.color = '#F00';
		hepacrnaStatus.style.visibility = 'visible';
	} else {
		document.getElementById('hepacrnaStatus').innerHTML = '';
	}
}
