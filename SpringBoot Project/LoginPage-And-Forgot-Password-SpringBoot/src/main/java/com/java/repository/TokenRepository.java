package com.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.model.PasswordResetToken;

public interface TokenRepository extends JpaRepository<PasswordResetToken, Integer> {

	
	PasswordResetToken findByToken(String token);

}
