package org.nkxkel001.thesis.ehealth.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.nkxkel001.thesis.ehealth.DatabaseConnect;
import org.nkxkel001.thesis.ehealth.DatabaseQuery;
import org.nkxkel001.thesis.ehealth.User;
import org.nkxkel001.thesis.ehealth.UserDAO;

public class UserService {
	
	
	private UserDAO userdao;
	public UserService (){
		
		userdao = new UserDAO();
		
	}
	
	
	public List<User> getAllUsers(){
		//Retrieve all users from database
		//name, surname , username and date registered
		//create map to build sql statement
		
		//HashMap hm = new HashMap(); //contains elements for sql statement. first key is table then rest column_name :value
		ArrayList<String> querylist = new ArrayList<String>();
		querylist.add("UserTable");
		querylist.add("UserName");
		querylist.add("Name");
		querylist.add("Surname");
		querylist.add("DateRegistered");
		
		//return null;
		//return databaseQuery.Connect("SELECT UserName, Name, Surname, DateRegistered FROM UserTable", querylist);
		List <User> list = new ArrayList<>();
		list = userdao.QueryDatabase("SELECT UserName, Name, Surname, DateRegistered FROM UserTable", querylist);
		return list;				
	
	}
	
	public User createUser(User newuser){
		//authenticate user
		//check if user already exists
		//allow login maybe or start receiving data
		
		return null;
	}
	
	
	public boolean userExists(User user){
		String sql ="SELECT products.id FROM products WHERE products.id = ?";
		
		
		
		return true;
	}
	
	
	
	
	
}
