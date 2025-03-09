package com.java.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.java.dto.Mapper;
import com.java.dto.StudentDto;
import com.java.entity.Student;
import com.java.exception.ResourceNotFoundException;
import com.java.repo.StudentRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService{
   
   
	private StudentRepo studentRepo;
	
	@Override
	public StudentDto createStudent(StudentDto studentDto) {
	     Student student= Mapper.maptostudent(studentDto);
	    Student savedStudent =studentRepo.save(student);
	    return Mapper.mapToStudentDto(savedStudent);
	}

	@Override
	public StudentDto getStudentById(Long studentId) {
	     Student student = studentRepo.findById(studentId).
	    		  orElseThrow(()-> new ResourceNotFoundException("id is not present"));
		return Mapper.mapToStudentDto(student);
	}

}
