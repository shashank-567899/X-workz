package com.java.service;

import org.springframework.stereotype.Service;

import com.java.entity.Student;
import com.java.repo.StudentRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService{
	
	private StudentRepo studentRepo;

	@Override
	public Student Save(Student student) {
		
		return studentRepo.save(student);
	}
	
	
	

}
