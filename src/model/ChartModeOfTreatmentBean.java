package model;

public class ChartModeOfTreatmentBean {
	
	
	int hematopoieticStemCellTransplantation = 0;
	int pharmacologicTreatment  = 0;
	int supportive  = 0;
	int bothPharmacologicAndSupportive  = 0;
	int watchAndWait   = 0;
	int factorConcentrates = 0;
	int blooComponent = 0;
	int pharmacologic1stLine = 0;
	int pharmacologic2ndLineSalvage = 0;
	int supportivePalliativeOnly = 0;
	int others  = 0;
	int pharmacologicForTransplantCandidate = 0;
	int pharmacologicForNonTransplantCandidate = 0;
	int maintenance = 0;
	int radiotherapy = 0;
	
	public void setModeOfTreatment(String modeOfTreatment) {
		if(modeOfTreatment.equals("Hematopoietic Stem Cell Transplantation")) {
			hematopoieticStemCellTransplantation++;
		}
		if(modeOfTreatment.equals("Pharmacologic Treatment")) {
			supportive++;
		}
		if(modeOfTreatment.equals("Supportive")) {
			pharmacologicTreatment++;
		}
		if(modeOfTreatment.equals("Both Pharmacologic and Supportive")) {
			pharmacologicTreatment++;
		}
		if(modeOfTreatment.equals("Watch and Wait")) {
			watchAndWait++;
		}
		if(modeOfTreatment.equals("Factor Concentrates")) {
			factorConcentrates++;
		}
		if(modeOfTreatment.equals("Blood Component")) {
			blooComponent++;
		}
		if(modeOfTreatment.equals("Pharmacologic 1st line")) {
			pharmacologic1stLine++;
		}
		if(modeOfTreatment.equals("Pharmacologic 2nd line/Salvage") || modeOfTreatment.equals("Pharmacologic 2nd line/Salvage regimen")) {
			pharmacologic2ndLineSalvage++;
		}
		if(modeOfTreatment.equals("Supportive/Palliative Only") || modeOfTreatment.equals("Supportive/Palliative") ) {
			supportivePalliativeOnly++;
		}
		if(modeOfTreatment.equals("Others")) {
			others++;
		}
		if(modeOfTreatment.equals("Pharmacologic for transplant candidate")) {
			pharmacologicForTransplantCandidate++;
		}
		if(modeOfTreatment.equals("Pharmacologic for non transplant candidate")) {
			pharmacologicForNonTransplantCandidate++;
		}
		if(modeOfTreatment.equals("Radiotherapy")) {
			radiotherapy++;
		}
		if(modeOfTreatment.equals("Maintenance")) {
			maintenance++;
		}
		
		
		
	}

}
