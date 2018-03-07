package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AuditBean {
	
	private int userID;
	private String action;
	private String performedOn;
	private String performedBy;
	private String timeStamp;
	
	public AuditBean(String action, String performedOn, String performedBy,int userID) {
		this.action = action;
		this.performedOn = performedOn;
		this.performedBy = performedBy;
		this.timeStamp =  new SimpleDateFormat("yyyy/MM/dd - HH:mm:ss").format(Calendar.getInstance().getTime());
		this.userID = userID;
	}
	
	

	public AuditBean(String action, String performedOn, String performedBy, String timeStamp) {
		super();
		this.action = action;
		this.performedOn = performedOn;
		this.performedBy = performedBy;
		this.timeStamp = timeStamp;
	}



	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getPerformedOn() {
		return performedOn;
	}

	public void setPerformedOn(String performedOn) {
		this.performedOn = performedOn;
	}

	public String getPerformedBy() {
		return performedBy;
	}

	public void setPerformedBy(String performedBy) {
		this.performedBy = performedBy;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}



	public int getUserID() {
		return userID;
	}



	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	
	
}
