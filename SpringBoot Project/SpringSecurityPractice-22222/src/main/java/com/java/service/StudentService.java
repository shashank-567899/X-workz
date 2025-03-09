package com.java.service;

import com.java.dto.StudentDto;

public interface StudentService {
 
	
	StudentDto createStudent(StudentDto studentDto);
	
	StudentDto getStudentById(Long studentId);
}
