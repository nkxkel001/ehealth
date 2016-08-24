package org.nkxkel001.thesis.ehealth;

import java.util.List;

import org.nkxkel001.thesis.ehealth.services.UserService;

public class test {

	/**
	 * @param args
	 */
	static UserService userService = new UserService();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<User> listusers =  userService.getAllUsers();
			for( User a: listusers){
			
			System.out.println(a.getFirstName());
			
				}

	}

}
