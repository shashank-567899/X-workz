package com.java.service;

import java.util.List;

import com.java.model.Student;

public interface StudentService  {
	
	List<Student> getAllStudent();
	Student save(Student student);
	Student getStudentId(Long id);
	Student updateStudent(Student student);
	void delete(Long id);
	
	

}
