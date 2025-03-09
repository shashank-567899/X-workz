package com.java.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.java.entity.User;

@Service
public interface UserService {
	
	
    User addUser(User user);
    List<User> getUser(User user);
    User getUserById(Long id);
	

}
