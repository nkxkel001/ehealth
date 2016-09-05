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
		UserService userService = new UserService();
		//healthcheck = new HealthCheck ();
		
	}
	
	public List<Data> getAllData() {
		// TODO Auto-generated method stub
		
		
		return null;
	}

	public String addData(Data newData) {
		// TODO Auto-generated method stub
		//check data first and set health status then upload
		//return data status
		String res="";
		healthcheck = new HealthCheck (newData);
		String status = healthcheck.CheckStatus();
		newData.setHealthStatus(status);
		//sendAlert(newData)
		//save data
		int id = datadao.InsertData(newData);
		
		
		
		return res;
	}

}
