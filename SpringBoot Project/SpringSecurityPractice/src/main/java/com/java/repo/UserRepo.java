package com.java.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.entity.User;

public interface UserRepo extends JpaRepository<User, Long>{

}
