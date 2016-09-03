package org.nkxkel001.thesis.ehealth.services;

import java.util.List;

import org.nkxkel001.thesis.ehealth.Data;
import org.nkxkel001.thesis.ehealth.DataDAO;
import org.nkxkel001.thesis.ehealth.HealthCheck;

public class DataService {

	private DataDAO datadao;
	private HealthCheck healthcheck;
	
	public DataService (){
		
		datadao = new DataDAO();
		healthcheck = new HealthCheck ();
		
	}
	
	public List<Data> getAllData() {
		// TODO Auto-generated method stub
		
		
		return null;
	}

	public String addData(Data newData) {
		// TODO Auto-generated method stub
		//check data first and set health status then upload
		//return data status
		
		
		
		return null;
	}

}
