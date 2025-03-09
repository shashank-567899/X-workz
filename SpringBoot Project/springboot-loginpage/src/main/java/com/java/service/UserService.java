package com.java.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.java.model.User;
import com.java.web.dto.UserRegistrationDto;


public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
	


