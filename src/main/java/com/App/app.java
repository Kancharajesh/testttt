package com.App;

import java.util.ResourceBundle;

public class app {

	
	
	public int userLogin(String in_user, String in_pwd)
	{
		ResourceBundle rb= ResourceBundle.getBundle("config");
		String username =rb.getString("Username");
		String password =rb.getString("Password");
		
		if(in_user.equals(username) && in_pwd.equals(password))
			return 1;
			else 
				return 0;			
		
	}
	
}
