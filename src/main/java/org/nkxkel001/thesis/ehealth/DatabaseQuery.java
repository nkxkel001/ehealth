package org.nkxkel001.thesis.ehealth;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DatabaseQuery {
	private Connection connect;
	
	public DatabaseQuery(){
		
	 this.connect = DatabaseConnect.getConnection();
		

		
	}
	

	/**
	 * @param args
	 */
	 public ArrayList<HashMap <String, String>> Connect(String sqlStatement, List<String> columns) {
		   
		   Statement stmt = null;
		   ArrayList<String> output = new ArrayList<String>();
		   
		   ArrayList<HashMap <String, String>> queryResults = new ArrayList<HashMap <String, String>>();
		   int numberOfColumns = columns.size();
		   
		   try{
		      //STEP 4: Execute a query
		      System.out.println("Creating statement...");
		      stmt = connect.createStatement();
		      String sql;
		      sql = sqlStatement;
		      ResultSet rs = stmt.executeQuery(sql);
		      
		      //get required columns
		   //  Object[] columnsArray = (String[]) columns.toArray();
		      String out = "";

		      //STEP 5: Extract data from result set
		      while(rs.next()){
		         //Retrieve by column name
		    	  HashMap <String,String> resultSet = new HashMap <String,String>();
		    	  for(int i = 1; i<numberOfColumns; i++){
		    		  
		    		  resultSet.put(columns.get(i), rs.getString(columns.get(i)));
		    		  
		    		  System.out.println(rs.getString(columns.get(i))); 
		    		}
		    	  queryResults.add(resultSet);
		    	  
		    	  //output.add(out.substring(1));
		    	  //queryResults.add(resultSet);
		    	  //out = "";
		        		        		         
		      }
		      
		      
		      //STEP 6: Clean-up environment
		      rs.close();
		     // stmt.close();
		     // connect.close();
		      //return proflist;
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            stmt.close();
		      }catch(SQLException se2){
		      }// nothing we can do
		      try{
		         if(connect!=null)
		            connect.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		   System.out.println("Goodbye!");
		   return queryResults;
		}//end main

	   
	  /* public static void main(String[] args) {
		   
		   			   
		   ArrayList<String> querylist = new ArrayList<String>();
			querylist.add("UserTable");
			querylist.add("UserName");
			querylist.add("Name");
			querylist.add("Surname");
			querylist.add("DateRegistered");
			
			DatabaseQuery databaseconnect = new DatabaseQuery();
			databaseconnect.Connect("SELECT UserName, Name, Surname, DateRegistered FROM UserTable", querylist);
	   }*/


}


