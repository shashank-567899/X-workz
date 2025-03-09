package com.java.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.java.entity.User;
import com.java.service.UserService;

public class Controller {
	
	@Autowired
	private UserService userService;
	
	
	
	public String add(User user)
	{
	    userService.addUser(user);
	    return "Student Added";
	}

}
