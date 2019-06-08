package com.cts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.model.User;
import com.cts.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/validate/")
	public ModelAndView validateCredentials(@RequestParam("id") String id,
									@RequestParam("password") String password) 
	{
		ModelAndView mv;
		
		boolean isValid = userService.get(id, password);
		
		//if the credentials are correct 
		//navigate to home page and display "welcome to" + id
		if(isValid)
		{
			mv = new ModelAndView("home");
			mv.addObject("msg", "Welcome to my app:"+ id);
			return mv;
		}
		
		//else
		//navigate to login page and show error message
		mv = new ModelAndView("login");
		mv.addObject("msg", "Invalid Login, Please Try Again!");
		return mv;
		
	}
	
	

}
