package model;

public class ArchivedPatientBean {
	
	private int patientID;
	private String patientName;
	
	public ArchivedPatientBean(int patientID, String patientName) {
		this.patientID = patientID;
		this.patientName = patientName;
	}

	public int getPatientID() {
		return patientID;
	}

	public String getPatientName() {
		return patientName;
	}
}
