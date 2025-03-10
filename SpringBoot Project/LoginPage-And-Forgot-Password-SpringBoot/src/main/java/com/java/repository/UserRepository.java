package com.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
   
	User findByEmail(String email);
}
