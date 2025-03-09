package com.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.entity.Student;
import com.java.repo.StudentRepo;

@Service
public class StudentServiceImpl  implements StudentService {
    
	@Autowired
     private StudentRepo studentRepo;
	
	
	@Override
	public Student addStudent(Student student) {
	
		return  studentRepo.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
	
		return studentRepo.findAll();
	}
	
	
	

}
