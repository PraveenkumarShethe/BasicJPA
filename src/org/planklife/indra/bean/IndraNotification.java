package org.planklife.indra.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class IndraNotification 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int notificationID;
	private String eventtype;
	private String timeStrap;
	private String reading;
	private String deviceID;
	public IndraNotification() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public IndraNotification(int notificationID,String eventtype,String timeStrap,String reading,String deviceID) {
		// TODO Auto-generated constructor stub
		super();
		this.notificationID = notificationID;
		this.eventtype = eventtype ; 
		this.timeStrap = timeStrap ;
		this.reading = reading ;
		this.deviceID =deviceID ;
	} 
	
	public int getNotificationID() {
		return notificationID;
	}
	public void setNotificationID(int notificationID) {
		this.notificationID = notificationID;
	}
	public String getEventtype() {
		return eventtype;
	}
	public void setEventtype(String eventtype) {
		this.eventtype = eventtype;
	}
	public String getTimeStrap() {
		return timeStrap;
	}
	public void setTimeStrap(String timeStrap) {
		this.timeStrap = timeStrap;
	}
	public String getReading() {
		return reading;
	}
	public void setReading(String reading) {
		this.reading = reading;
	}
	public String getDeviceID() {
		return deviceID;
	}
	public void setDeviceID(String deviceID) {
		this.deviceID = deviceID;
	}	

}
