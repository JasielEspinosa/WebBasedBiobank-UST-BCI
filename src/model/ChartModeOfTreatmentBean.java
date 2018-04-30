package model;

public class ChartModeOfTreatmentBean {
	
	int hematopoieticStemCellTransplantation = 0;
	int pharmacologicTreatment = 0;
	int supportive = 0;
	int bothPharmacologicAndSupportive = 0;
	int watchAndWait = 0;
	int factorConcentrates = 0;
	int bloodComponent = 0;
	int pharmacologic1stLine = 0;
	int pharmacologic2ndLine = 0;
	int pharmacologic2ndLineSalvage = 0;
	int supportivePalliativeOnly = 0;
	int others = 0;
	int pharmacologicForTransplantCandidate = 0;
	int pharmacologicForNonTransplantCandidate = 0;
	int maintenance = 0;
	int radiotherapy = 0;
	
	public void setModeOfTreatment(String modeOfTreatment) {
		if (modeOfTreatment.equalsIgnoreCase("Hematopoietic Stem Cell Transplantation")) {
			hematopoieticStemCellTransplantation++;
		}
		if (modeOfTreatment.equalsIgnoreCase("Pharmacologic Treatment") || modeOfTreatment.equalsIgnoreCase("Pharmacologic")) {
			pharmacologicTreatment++;
		}
		if (modeOfTreatment.equalsIgnoreCase("Supportive")) {
			supportive++;
		}
		if (modeOfTreatment.equalsIgnoreCase("Both Pharmacologic and Supportive")) {
			bothPharmacologicAndSupportive++;
		}
		if (modeOfTreatment.equalsIgnoreCase("Watch and Wait")) {
			watchAndWait++;
		}
		if (modeOfTreatment.equalsIgnoreCase("Factor Concentrates")) {
			factorConcentrates++;
		}
		if (modeOfTreatment.equalsIgnoreCase("Blood Component")) {
			bloodComponent++;
		}
		if (modeOfTreatment.equalsIgnoreCase("Pharmacologic 1st line")) {
			pharmacologic1stLine++;
		}
		if (modeOfTreatment.equalsIgnoreCase("Pharmacologic 2nd line")) {
			pharmacologic2ndLine++;
		}
		if (modeOfTreatment.equalsIgnoreCase("Pharmacologic 2nd line/Salvage") || modeOfTreatment
				.equalsIgnoreCase("Pharmacologic 2nd line/Salvage regimen")) {
			pharmacologic2ndLineSalvage++;
		}
		if (modeOfTreatment.equalsIgnoreCase("Supportive/Palliative Only") || modeOfTreatment.equalsIgnoreCase("Supportive/Palliative")) {
			supportivePalliativeOnly++;
		}
		if (modeOfTreatment.equalsIgnoreCase("Others")) {
			others++;
		}
		if (modeOfTreatment.equalsIgnoreCase("Pharmacologic for transplant candidate")) {
			pharmacologicForTransplantCandidate++;
		}
		if (modeOfTreatment.equalsIgnoreCase("Pharmacologic for non transplant candidate")) {
			pharmacologicForNonTransplantCandidate++;
		}
		if (modeOfTreatment.equalsIgnoreCase("Radiotherapy")) {
			radiotherapy++;
		}
		if (modeOfTreatment.equalsIgnoreCase("Maintenance")) {
			maintenance++;
		}
		
	}
	
	public int getHematopoieticStemCellTransplantation() {
		return hematopoieticStemCellTransplantation;
	}
	
	public void setHematopoieticStemCellTransplantation(int hematopoieticStemCellTransplantation) {
		this.hematopoieticStemCellTransplantation = hematopoieticStemCellTransplantation;
	}
	
	public int getPharmacologicTreatment() {
		return pharmacologicTreatment;
	}
	
	public void setPharmacologicTreatment(int pharmacologicTreatment) {
		this.pharmacologicTreatment = pharmacologicTreatment;
	}
	
	public int getSupportive() {
		return supportive;
	}
	
	public void setSupportive(int supportive) {
		this.supportive = supportive;
	}
	
	public int getBothPharmacologicAndSupportive() {
		return bothPharmacologicAndSupportive;
	}
	
	public void setBothPharmacologicAndSupportive(int bothPharmacologicAndSupportive) {
		this.bothPharmacologicAndSupportive = bothPharmacologicAndSupportive;
	}
	
	public int getWatchAndWait() {
		return watchAndWait;
	}
	
	public void setWatchAndWait(int watchAndWait) {
		this.watchAndWait = watchAndWait;
	}
	
	public int getFactorConcentrates() {
		return factorConcentrates;
	}
	
	public void setFactorConcentrates(int factorConcentrates) {
		this.factorConcentrates = factorConcentrates;
	}
	
	public int getBloodComponent() {
		return bloodComponent;
	}
	
	public void setBlooComponent(int blooComponent) {
		this.bloodComponent = blooComponent;
	}
	
	public int getPharmacologic1stLine() {
		return pharmacologic1stLine;
	}
	
	public void setPharmacologic1stLine(int pharmacologic1stLine) {
		this.pharmacologic1stLine = pharmacologic1stLine;
	}
	
	public int getPharmacologic2ndLine() {
		return pharmacologic2ndLine;
	}
	
	public void setPharmacologic2ndLine(int pharmacologic2ndLine) {
		this.pharmacologic2ndLine = pharmacologic2ndLine;
	}
	
	public int getPharmacologic2ndLineSalvage() {
		return pharmacologic2ndLineSalvage;
	}
	
	public void setPharmacologic2ndLineSalvage(int pharmacologic2ndLineSalvage) {
		this.pharmacologic2ndLineSalvage = pharmacologic2ndLineSalvage;
	}
	
	public int getSupportivePalliativeOnly() {
		return supportivePalliativeOnly;
	}
	
	public void setSupportivePalliativeOnly(int supportivePalliativeOnly) {
		this.supportivePalliativeOnly = supportivePalliativeOnly;
	}
	
	public int getOthers() {
		return others;
	}
	
	public void setOthers(int others) {
		this.others = others;
	}
	
	public int getPharmacologicForTransplantCandidate() {
		return pharmacologicForTransplantCandidate;
	}
	
	public void setPharmacologicForTransplantCandidate(int pharmacologicForTransplantCandidate) {
		this.pharmacologicForTransplantCandidate = pharmacologicForTransplantCandidate;
	}
	
	public int getPharmacologicForNonTransplantCandidate() {
		return pharmacologicForNonTransplantCandidate;
	}
	
	public void setPharmacologicForNonTransplantCandidate(int pharmacologicForNonTransplantCandidate) {
		this.pharmacologicForNonTransplantCandidate = pharmacologicForNonTransplantCandidate;
	}
	
	public int getMaintenance() {
		return maintenance;
	}
	
	public void setMaintenance(int maintenance) {
		this.maintenance = maintenance;
	}
	
	public int getRadiotherapy() {
		return radiotherapy;
	}
	
	public void setRadiotherapy(int radiotherapy) {
		this.radiotherapy = radiotherapy;
	}
	
}
