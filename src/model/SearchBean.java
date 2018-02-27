package model;

public class SearchBean {

	int patientID;
	private String lastName;
	private String firstName;
	private String middleName;

	public SearchBean(int patientID, String lastName, String firstName, String middleName) {
		this.patientID = patientID;
		this.lastName = lastName;
		this.firstName = firstName;
		this.middleName = middleName;

	}

	public int getPatientID() {
		return patientID;
	}

	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

}
