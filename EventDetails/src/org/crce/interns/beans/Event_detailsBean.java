package org.crce.interns.beans;

import java.io.Serializable;
import java.sql.Date;

public class Event_detailsBean implements Serializable{
	
	private String event_id;
	private String event_type;
	private int company_id;
	private String approved;
	private Date date;
	private String venue;
	private String times;
	
	/*public Event_detailsBean(int id, String name) {
		super();
        this.id = id;
        this.month = name;
		// TODO Auto-generated constructor stub
	}*/
	public String getEvent_id() {
		return event_id;
	}
	public void setEvent_id(String event_id) {
		this.event_id = event_id;
	}
	public String getEvent_type() {
		return event_type;
	}
	public void setEvent_type(String event_type) {
		this.event_type = event_type;
	}
	public int getCompany_id() {
		return company_id;
	}
	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}
	public String getApproved() {
		return approved;
	}
	public void setApproved(String approved) {
		this.approved = approved;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getTimes() {
		return times;
	}
	public void setTimes(String times) {
		this.times = times;
	}
	
}
