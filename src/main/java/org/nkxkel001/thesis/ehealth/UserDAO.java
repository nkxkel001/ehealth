package org.nkxkel001.thesis.ehealth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDAO {

	/**
	 * @param args
	 * 
	 * interfaces with the database connect class. 
	 * convert info from database into user objects 
	 */
	private DatabaseQuery databaseQuery;
	
	public UserDAO(){
		
		this.databaseQuery = new DatabaseQuery();
	} 
	
	public String CreateQueryStatement(){
		
				
		return "hi";
	}
	
	public List <User>  QueryDatabase(String sql , List<String> columns){
		//ArrayList<HashMap <String, String>> results = new ArrayList<HashMap <String, String>>();
		
		ArrayList<HashMap <String, String>> results = databaseQuery.Connect(sql,columns);
		
		List<User> users = CreateUsers(results);
		return users;
	
	}
	
	
	
	
	public User CreateUser(HashMap<String, String>  values){
		String attribute;
		User createdUser = new User();
		for (Map.Entry<String, String> entry : values.entrySet()) {
			attribute = entry.getKey();
			System.out.print(attribute);
			System.out.print("--");
			System.out.println(entry.getValue());
			
			if (attribute.equals("UserID")){
				try{
				int id = Integer.parseInt(entry.getValue());
				createdUser.setId(id);
				}
				catch (NumberFormatException ex){}
     		}
			else if (attribute.equals("UserName")){
				createdUser.setUserName(entry.getValue());
							
			}
			else if (attribute.equals("Name")){
				createdUser.setFirstName(entry.getValue());
							
			}
			else if (attribute.equals("Surname")){
				createdUser.setLastName(entry.getValue());
							
			}
			else if (attribute.equals("EmergencyContact")){
				createdUser.setEmergencyContact(entry.getValue());
							
			}
			else if (attribute.equals("DoctorID")){
				try{
				int id2 = Integer.parseInt(entry.getValue());
				createdUser.setId(id2);
				}
				catch (NumberFormatException ex){}
     		}
			else if (attribute.equals("DateRegistered")){
				createdUser.setDateRegistered(entry.getValue());
							
			}
					
			}
							
		return createdUser;
	
	}
	
	public List <User> CreateUsers(ArrayList<HashMap <String, String>> queryResults){
		ArrayList<User> users = new ArrayList<User>();
		for(HashMap <String,String> map : queryResults){
			
			users.add(CreateUser(map));
		
		}
		
		return users;
			
		
	}
	
	
	
	

}
