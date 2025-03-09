package com.java.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.java.entity.User;
import com.java.repo.UserRepo;

public class UserServiceImpl implements UserService{
     
	
	@Autowired
	private UserRepo userRepo;
	
	@Override
	public User addUser(User user) {
	
		return  userRepo.save(user);
	}

	@Override
	public List<User> getUser(User user) {
		
		return userRepo.findAll();
	}

	@Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		Optional<User> optional=userRepo.findById(id);
		return optional.get();
	}

}
