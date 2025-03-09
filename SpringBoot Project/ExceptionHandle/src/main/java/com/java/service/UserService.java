package com.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.Exception.UserNotFoundException;
import com.java.dto.UserRequest;
import com.java.entity.User;
import com.java.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User saveUser(UserRequest userRequest) {
		
		User user=User.bui
		
		return userRepository.save(userRequest);
	}
	
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	public User getUser(int id) throws UserNotFoundException {
		User user=userRepository.findByUserId(id);
		if(user!=null) {
			return user;
		}else {
			throw new UserNotFoundException("User Not found"+ id);
		}
	}

}
