package org.nkxkel001.thesis.ehealth.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.nkxkel001.thesis.ehealth.User;
import org.nkxkel001.thesis.ehealth.services.UserService;


@Path("/users")

public class UserResource {
	
	UserService userService = new UserService();
	
	// GET permission: only admin can retrieve list of all users
	
	@GET
	@Produces (MediaType.APPLICATION_JSON)
	//only admin
	public List<User> getUsers(){
		String name = "blabla";
		List<User> listusers =  userService.getAllUsers();
		
		return listusers;
						
	}
	
	
	//public access ? called with details of new user for sign up from app
	//called from google after authentication
	//return user id to be used in url to post data while logged in
	@POST
	@Consumes (MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public User addUser(User newUser){
		
		
		
		
		
		
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
