package com.majecek.gdata;

import com.google.gdata.client.GoogleService;
import com.google.gdata.client.calendar.CalendarService;
import com.google.gdata.util.AuthenticationException;

public class App {
	public static void main(String[] args) {

		String username = "username";
		String password = "password";
		
		try {
			username = args[0];
			password = args[1];
		} catch (Exception e) {
			System.out.println("read README");
		}

		GoogleService myService = new CalendarService("some_apps");

		try {
			myService.setUserCredentials(username.concat("@gmail.com"), password);
			// if success then succes authentication occures
			System.out.println("!!!!!!!!!!!!!!!!success authentication!!!!!!!!!!!!!!");
		} catch (AuthenticationException e) {
			// if not then invalid credentials has been set
			// invalid username or password
			System.out.println("!!!!!!!!!!!!!!invalid authentication!!!!!!!!!!!!!!");
		}
	}
}
