package model;

public class TreatmentBean {

	private boolean transplant;
	private String regimenText;
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
