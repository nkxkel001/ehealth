package org.nkxkel001.thesis.ehealth;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement // help do conversion to XML
public class User {

	
	private int id;
	
	private String firstName;
	private String userName; //email
	private String lastName;
	private String dateRegistered;
	private int doctorID;
	private String emergencyContact;
	
	
	
	public User(){
		
		this.id = 0;
		this.firstName = "";
		this.userName = "";
		this.lastName = "";
		this.dateRegistered = "";
		this.doctorID = 0;
		this.emergencyContact = "";
		
		
	}


	public User(int id, String firstName, String userName, String lastName,
			String dateRegistered, int doctorID, String emergencyContact) {
		
		this.id = id;
		this.firstName = firstName;
		this.userName = userName;
		this.lastName = lastName;
		this.dateRegistered = dateRegistered;
		this.doctorID = doctorID;
		this.emergencyContact = emergencyContact;
	}



	public int getId() {
		return id;
	}



	public String getFirstName() {
		return firstName;
	}



	public String getUserName() {
		return userName;
	}



	public String getLastName() {
		return lastName;
	}



	public String getDateRegistered() {
		return dateRegistered;
	}



	public int getDoctorID() {
		return doctorID;
	}



	public String getEmergencyContact() {
		return emergencyContact;
	}



	public void setId(int id) {
		this.id = id;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public void setDateRegistered(String dateRegistered) {
		this.dateRegistered = dateRegistered;
	}



	public void setDoctorID(int doctorID) {
		this.doctorID = doctorID;
	}



	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}
	
	
	
	
	
	
	
	
}
