window.onload = function() {

	function MaleCheckValue(){
		  
		   if ( hemoglobin.value != '' && hemoglobin.value < 138 ) {
			   document.getElementById('hemoglobinStatus').innerHTML='Low';
			   document.getElementById('hemoglobinStatus').style.color='#023564';
			   hemoglobinStatus.style.visibility = 'visible';
		   } else if ( hemoglobin.value != '' && hemoglobin.value >= 138 && hemoglobin.value <= 172 ) {
			   document.getElementById('hemoglobinStatus').innerHTML='Normal';
			   document.getElementById('hemoglobinStatus').style.color='#008000';
			   hemoglobinStatus.style.visibility = 'visible';
		   } else if ( hemoglobin.value != '' && hemoglobin.value > 172 ) {
			   document.getElementById('hemoglobinStatus').innerHTML='High';
			   document.getElementById('hemoglobinStatus').style.color='#F00';
			   hemoglobinStatus.style.visibility = 'visible';
		   } else {
			   document.getElementById('hemoglobinStatus').innerHTML='';
		   } 
		   
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

	function FemaleCheckValue(){
		   
		   if ( hemoglobin.value != '' && hemoglobin.value < 121 ) {
			   document.getElementById('hemoglobinStatus').innerHTML='Low';
			   document.getElementById('hemoglobinStatus').style.color='#023564';
			   hemoglobinStatus.style.visibility = 'visible';
		   } else if ( hemoglobin.value != '' && hemoglobin.value >= 121 && hemoglobin.value <= 151 ) {
			   document.getElementById('hemoglobinStatus').innerHTML='Normal';
			   document.getElementById('hemoglobinStatus').style.color='#008000';
			   hemoglobinStatus.style.visibility = 'visible';
		   } else if ( hemoglobin.value != '' && hemoglobin.value > 151 ) {
			   document.getElementById('hemoglobinStatus').innerHTML='High';
			   document.getElementById('hemoglobinStatus').style.color='#F00';
			   hemoglobinStatus.style.visibility = 'visible';
		   } else {
			   document.getElementById('hemoglobinStatus').innerHTML='';
		   }
		   
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
	
	$("input[name=gender]:radio").on('click', function() {
		if ($(this).attr("value") == "1") {	
			MaleCheckValue();
		} else if ($(this).attr("value") == "2") {
			FemaleCheckValue();
		}
	});
	
	function checkGenderVal(){
		if ($(this).attr("value") == "1") {	
			MaleCheckValue();
		} else if ($(this).attr("value") == "2") {
			FemaleCheckValue();
		}
	}
	
	hemoglobin.oninput = function() {
		checkGenderVal();
	};
	hematocrit.oninput = function() {
		checkGenderVal();
	};
	creatinine.oninput = function() {
		checkGenderVal();
	};
	uricAcid.oninput = function() {
		checkGenderVal();
	};
	serumIron.oninput = function() {
		checkGenderVal();
	};
	serumFerritin.oninput = function() {
		checkGenderVal();
	};

	whiteBloodCells.onchange = function() {
		whiteBloodCellsFunc();
	};
	
	function whiteBloodCellsFunc() {
		if (this.value != '' && this.value < 4.0) {
			document.getElementById('whiteBloodCellsStatus').innerHTML = 'Low';
			document.getElementById('whiteBloodCellsStatus').style.color = '#023564';
			whiteBloodCellsStatus.style.visibility = 'visible';
		} else if (this.value != '' && this.value >= 4.0 && this.value <= 11.0) {
			document.getElementById('whiteBloodCellsStatus').innerHTML = 'Normal';
			document.getElementById('whiteBloodCellsStatus').style.color = '#008000';
			whiteBloodCellsStatus.style.visibility = 'visible';
		} else if (this.value != '' && this.value > 11.0) {
			document.getElementById('whiteBloodCellsStatus').innerHTML = 'High';
			document.getElementById('whiteBloodCellsStatus').style.color = '#F00';
			whiteBloodCellsStatus.style.visibility = 'visible';
		} else {
			document.getElementById('whiteBloodCellsStatus').innerHTML = '';
		}
	}

	neutrophils.oninput = function() {

		if (this.value != '' && this.value < 45) {
			document.getElementById('neutrophilsStatus').innerHTML = 'Low';
			document.getElementById('neutrophilsStatus').style.color = '#023564';
			neutrophilsStatus.style.visibility = 'visible';
		} else if (this.value != '' && this.value >= 45 && this.value <= 80) {
			document.getElementById('neutrophilsStatus').innerHTML = 'Normal';
			document.getElementById('neutrophilsStatus').style.color = '#008000';
			neutrophilsStatus.style.visibility = 'visible';
		} else if (this.value != '' && this.value > 80) {
			document.getElementById('neutrophilsStatus').innerHTML = 'High';
			document.getElementById('neutrophilsStatus').style.color = '#F00';
			neutrophilsStatus.style.visibility = 'visible';
		} else {
			document.getElementById('neutrophilsStatus').innerHTML = '';
		}

	}

	lymphocytes.oninput = function() {

		if (this.value != '' && this.value < 20) {
			document.getElementById('lymphocytesStatus').innerHTML = 'Low';
			document.getElementById('lymphocytesStatus').style.color = '#023564';
			lymphocytesStatus.style.visibility = 'visible';
		} else if (this.value != '' && this.value >= 20 && this.value <= 40) {
			document.getElementById('lymphocytesStatus').innerHTML = 'Normal';
			document.getElementById('lymphocytesStatus').style.color = '#008000';
			lymphocytesStatus.style.visibility = 'visible';
		} else if (this.value != '' && this.value > 40) {
			document.getElementById('lymphocytesStatus').innerHTML = 'High';
			document.getElementById('lymphocytesStatus').style.color = '#F00';
			lymphocytesStatus.style.visibility = 'visible';
		} else {
			document.getElementById('lymphocytesStatus').innerHTML = '';
		}

	};

	monocytes.oninput = function() {

		if (this.value != '' && this.value < 2) {
			document.getElementById('monocytesStatus').innerHTML = 'Low';
			document.getElementById('monocytesStatus').style.color = '#023564';
			monocytesStatus.style.visibility = 'visible';
		} else if (this.value != '' && this.value >= 2 && this.value <= 10) {
			document.getElementById('monocytesStatus').innerHTML = 'Normal';
			document.getElementById('monocytesStatus').style.color = '#008000';
			monocytesStatus.style.visibility = 'visible';
		} else if (this.value != '' && this.value > 10) {
			document.getElementById('monocytesStatus').innerHTML = 'High';
			document.getElementById('monocytesStatus').style.color = '#F00';
			monocytesStatus.style.visibility = 'visible';
		} else {
			document.getElementById('monocytesStatus').innerHTML = '';
		}

	};

	eosinophils.oninput = function() {

		if (this.value != '' && this.value < 1) {
			document.getElementById('eosinophilsStatus').innerHTML = 'Low';
			document.getElementById('eosinophilsStatus').style.color = '#023564';
			eosinophilsStatus.style.visibility = 'visible';
		} else if (this.value != '' && this.value >= 1 && this.value <= 6) {
			document.getElementById('eosinophilsStatus').innerHTML = 'Normal';
			document.getElementById('eosinophilsStatus').style.color = '#008000';
			eosinophilsStatus.style.visibility = 'visible';
		} else if (this.value != '' && this.value > 6) {
			document.getElementById('eosinophilsStatus').innerHTML = 'High';
			document.getElementById('eosinophilsStatus').style.color = '#F00';
			eosinophilsStatus.style.visibility = 'visible';
		} else {
			document.getElementById('eosinophilsStatus').innerHTML = '';
		}

	};

	basophils.oninput = function() {

		if (this.value != '' && this.value < 0) {
			document.getElementById('basophilsStatus').innerHTML = 'Low';
			document.getElementById('basophilsStatus').style.color = '#023564';
			basophilsStatus.style.visibility = 'visible';
		} else if (this.value != '' && this.value >= 0 && this.value <= 2) {
			document.getElementById('basophilsStatus').innerHTML = 'Normal';
			document.getElementById('basophilsStatus').style.color = '#008000';
			basophilsStatus.style.visibility = 'visible';
		} else if (this.value != '' && this.value > 2) {
			document.getElementById('basophilsStatus').innerHTML = 'High';
			document.getElementById('basophilsStatus').style.color = '#F00';
			basophilsStatus.style.visibility = 'visible';
		} else {
			document.getElementById('basophilsStatus').innerHTML = '';
		}

	};

	myelocytes.oninput = function() {

		if (this.value != '' && this.value < 0) {
			document.getElementById('myelocytesStatus').innerHTML = 'Low';
			document.getElementById('myelocytesStatus').style.color = '#023564';
			myelocytesStatus.style.visibility = 'visible';
		} else if (this.value != '' && this.value == 0) {
			document.getElementById('myelocytesStatus').innerHTML = 'Normal';
			document.getElementById('myelocytesStatus').style.color = '#008000';
			myelocytesStatus.style.visibility = 'visible';
		} else if (this.value != '' && this.value > 0) {
			document.getElementById('myelocytesStatus').innerHTML = 'High';
			document.getElementById('myelocytesStatus').style.color = '#F00';
			myelocytesStatus.style.visibility = 'visible';
		} else {
			document.getElementById('myelocytesStatus').innerHTML = '';
		}

	};

	metamyelocytes.oninput = function() {

		if (this.value != '' && this.value < 0) {
			document.getElementById('metamyelocytesStatus').innerHTML = 'Low';
			document.getElementById('metamyelocytesStatus').style.color = '#023564';
			metamyelocytesStatus.style.visibility = 'visible';
		} else if (this.value != '' && this.value == 0) {
			document.getElementById('metamyelocytesStatus').innerHTML = 'Normal';
			document.getElementById('metamyelocytesStatus').style.color = '#008000';
			metamyelocytesStatus.style.visibility = 'visible';
		} else if (this.value != '' && this.value > 0) {
			document.getElementById('metamyelocytesStatus').innerHTML = 'High';
			document.getElementById('metamyelocytesStatus').style.color = '#F00';
			metamyelocytesStatus.style.visibility = 'visible';
		} else {
			document.getElementById('metamyelocytesStatus').innerHTML = '';
		}

	};

	blasts.oninput = function() {

		if (this.value != '' && this.value < 0) {
			document.getElementById('blastsStatus').innerHTML = 'Low';
			document.getElementById('blastsStatus').style.color = '#023564';
			blastsStatus.style.visibility = 'visible';
		} else if (this.value != '' && this.value == 0) {
			document.getElementById('blastsStatus').innerHTML = 'Normal';
			document.getElementById('blastsStatus').style.color = '#008000';
			blastsStatus.style.visibility = 'visible';
		} else if (this.value != '' && this.value > 0) {
			document.getElementById('blastsStatus').innerHTML = 'High';
			document.getElementById('blastsStatus').style.color = '#F00';
			blastsStatus.style.visibility = 'visible';
		} else {
			document.getElementById('blastsStatus').innerHTML = '';
		}

	};

	plateletCount.oninput = function() {

		if (this.value != '' && this.value < 150) {
			document.getElementById('plateletCountStatus').innerHTML = 'Low';
			document.getElementById('plateletCountStatus').style.color = '#023564';
			plateletCountStatus.style.visibility = 'visible';
		} else if (this.value != '' && this.value >= 150 && this.value <= 400) {
			document.getElementById('plateletCountStatus').innerHTML = 'Normal';
			document.getElementById('plateletCountStatus').style.color = '#008000';
			plateletCountStatus.style.visibility = 'visible';
		} else if (this.value != '' && this.value > 400) {
			document.getElementById('plateletCountStatus').innerHTML = 'High';
			document.getElementById('plateletCountStatus').style.color = '#F00';
			plateletCountStatus.style.visibility = 'visible';
		} else {
			document.getElementById('plateletCountStatus').innerHTML = '';
		}

	};
	
	reticulocyteCount.oninput = function() {

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

	};
	
	ironBindingCapacity.oninput = function() {

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

	};
	
	sgot.oninput = function() {

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

	};
	
	sgpt.oninput = function() {

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

	};
	
	ldh.oninput = function() {

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

	};
	
	erythropoeitinLevel.oninput = function() {

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

	};
	
	serumFolicAcid.oninput = function() {

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

	};
	
	serumB12.oninput = function() {

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

	};

	tsh.oninput = function() {

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

	};
	
};


