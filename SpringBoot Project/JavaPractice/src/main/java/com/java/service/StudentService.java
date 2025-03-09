package com.java.service;

import java.util.List;

import com.java.entity.Student;

public interface StudentService {
	
	Student addStudent(Student student);
	
	List<Student> getAllStudent();
	
	

}
