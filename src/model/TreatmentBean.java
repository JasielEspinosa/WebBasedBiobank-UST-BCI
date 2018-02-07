package model;

public class TreatmentBean {

	private boolean transplant;
	private String regimenText;
	private String otherRegimen;
	private String otherRegimenTransplant;
	private String otherRegimenNonTransplant;
	private String otherRegimenMaintenanceTherapy;
	private int cycleNumber;
	private String dateStarted;
	private String complications;

	public boolean isTransplant() {
		return transplant;
	}

	public void setTransplant(boolean transplant) {
		this.transplant = transplant;
	}

	public String getRegimenText() {
		return regimenText;
	}

	public void setRegimenText(String regimenText) {
		this.regimenText = regimenText;
	}

	public String getOtherRegimen() {
		return otherRegimen;
	}

	public void setOtherRegimen(String otherRegimen) {
		this.otherRegimen = otherRegimen;
	}

	public String getOtherRegimenTransplant() {
		return otherRegimenTransplant;
	}

	public void setOtherRegimenTransplant(String otherRegimenTransplant) {
		this.otherRegimenTransplant = otherRegimenTransplant;
	}

	public String getOtherRegimenNonTransplant() {
		return otherRegimenNonTransplant;
	}

	public void setOtherRegimenNonTransplant(String otherRegimenNonTransplant) {
		this.otherRegimenNonTransplant = otherRegimenNonTransplant;
	}

	public String getOtherRegimenMaintenanceTherapy() {
		return otherRegimenMaintenanceTherapy;
	}

	public void setOtherRegimenMaintenanceTherapy(String otherRegimenMaintenanceTherapy) {
		this.otherRegimenMaintenanceTherapy = otherRegimenMaintenanceTherapy;
	}

	public int getCycleNumber() {
		return cycleNumber;
	}

	public void setCycleNumber(int cycleNumber) {
		this.cycleNumber = cycleNumber;
	}

	public String getDateStarted() {
		return dateStarted;
	}

	public void setDateStarted(String dateStarted) {
		this.dateStarted = dateStarted;
	}

	public String getComplications() {
		return complications;
	}

	public void setComplications(String complications) {
		this.complications = complications;
	}

}
