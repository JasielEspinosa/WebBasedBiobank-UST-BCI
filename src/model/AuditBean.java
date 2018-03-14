package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AuditBean {

	private int userID;
	private String action;
	private String performedOn;
	private String performedBy;
	private String date;
	private String time;

	public AuditBean(String action, String performedOn, String performedBy, int userID) {
		this.action = action;
		this.performedOn = performedOn;
		this.performedBy = performedBy;
		this.date = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
		this.time = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
		this.userID = userID;
	}

	public AuditBean(String action, String performedOn, String performedBy, String date, String time) {
		super();
		this.action = action;
		this.performedOn = performedOn;
		this.performedBy = performedBy;
		this.date = date;
		this.time = time;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

}
