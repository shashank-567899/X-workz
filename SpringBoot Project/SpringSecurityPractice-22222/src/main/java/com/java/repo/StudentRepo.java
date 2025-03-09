package com.java.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.entity.Student;

public interface StudentRepo extends JpaRepository<Student,Long> {

}
