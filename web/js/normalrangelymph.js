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
		   
		   
	}	
	
	$("input[name=gender]:radio").on('click', function() {

		if ($(this).attr("value") == "1") {
			
			MaleCheckValue();

			hemoglobin.oninput = function() {
				MaleCheckValue();
			};
			hematocrit.oninput = function() {
				MaleCheckValue();
			};
			creatinine.oninput = function() {
				MaleCheckValue();
			};
			uricAcid.oninput = function() {
				MaleCheckValue();
			};

		} else if ($(this).attr("value") == "2") {
			
			FemaleCheckValue();

			hemoglobin.oninput = function() {
				FemaleCheckValue();
			};
			hematocrit.oninput = function() {
				FemaleCheckValue();
			};
			creatinine.oninput = function() {
				FemaleCheckValue();
			};
			uricAcid.oninput = function() {
				FemaleCheckValue();
			};

		}

	});

	whiteBloodCells.oninput = function() {

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

	};

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
	
	na.oninput = function() {

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

	};
	
	k.oninput = function() {

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

	};
	
	bilirubin.oninput = function() {

		if (bilirubin.value != '' && bilirubin.value < 0.2 ) {
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

	};
	
	total.oninput = function() {

		if (total.value != '' && total.value < 0.2 ) {
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

	};
	
	direct.oninput = function() {

		if (direct.value != '' && direct.value < 0 ) {
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

	};
	
	indirect.oninput = function() {

		if (indirect.value != '' && indirect.value < 0 ) {
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
	
	beta2.oninput = function() {

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

	};
	
	hepaB.oninput = function() {

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
	
	esr.oninput = function() {

		if (esr.value != '' && esr.value < 0 ) {
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

	};

};

