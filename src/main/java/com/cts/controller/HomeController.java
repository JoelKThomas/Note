package com.cts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//convert this class as servlet/controller

@Controller
public class HomeController {
	
	//define the mapping.
	
	//http://localhost:8080/noteapp/
	
	@GetMapping("/home")
	public String home()
	{
		System.out.println("Navigating to Home Page");
		 return "home";
	}
	
	
	//http://localhost:8080/noteapp/login
	
	@GetMapping("/login")
	public String login()
	{
		System.out.println("Navigating to Login Page");
		 return "login";
	}	
	
	//http://localhost:8080/noteapp/register
	
	@GetMapping("/register")
	public String register()
	{
		System.out.println("Navigating to Register Page");
		 return "register";
	}
}
