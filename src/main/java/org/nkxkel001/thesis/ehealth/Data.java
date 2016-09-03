package org.nkxkel001.thesis.ehealth;

import java.util.Arrays;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement // help do conversion to XML
public class Data {

	/**
	 * @param args
	 */
	
	private int id;
	private String dateMonitored;
	private int [] values;
	private String healthStatus;
	private String username;
	private String device;
	private String dateUploaded;
	
	
	public Data(){}
	
	public Data( String dateMonitored, int[] values,String username, String device) {
		this.dateMonitored = new Date().toString();
		this.values = values;
		this.username = username;
		this.device = device;
		}
	
	
	
	public Data(int id, String dateMonitored, int[] values,
			String healthStatus, String username, String device,
			String dateUploaded) {
		this.id = id;
		this.dateMonitored = dateMonitored;
		this.values = values;
		this.healthStatus = healthStatus;
		this.username = username;
		this.device = device;
		this.dateUploaded = dateUploaded;
	}
	
	




	public int getId() {
		return id;
	}




	public String getDateMonitored() {
		return dateMonitored;
	}




	public int[] getValues() {
		return values;
	}
	
	public String getStringValues(){
		return Arrays.toString(values);
		
	}
	
	

	public String getHealthStatus() {
		return healthStatus;
	}




	public String getUsername() {
		return username;
	}




	public String getDevice() {
		return device;
	}




	public String getDateUploaded() {
		return dateUploaded;
	}




	public void setId(int id) {
		this.id = id;
	}




	public void setDateMonitored(String dateMonitored) {
		this.dateMonitored = dateMonitored;
	}




	public void setValues(int[] values) {
		this.values = values;
	}
	
	public void setValues(String values){
		String strip = values.substring(1, values.indexOf("]"));
		String[] vals = strip.split(","); 
	    int[] ints = new int[vals.length];
	    for (int i=0; i < vals.length; i++) {
	    	try{
	        ints[i] = Integer.parseInt(vals[i]);
	    	}
	    	catch(NumberFormatException ex){
	    		
	    	}
	    }
	  
	    this.values = ints;
		
	}




	public void setHealthStatus(String healthStatus) {
		this.healthStatus = healthStatus;
	}




	public void setUsername(String username) {
		this.username = username;
	}




	public void setDevice(String device) {
		this.device = device;
	}




	public void setDateUploaded(String dateUploaded) {
		this.dateUploaded = dateUploaded;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
