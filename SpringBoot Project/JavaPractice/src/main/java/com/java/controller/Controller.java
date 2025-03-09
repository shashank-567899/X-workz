package com.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.entity.Student;
import com.java.service.StudentService;

@RestController
public class Controller {
	
	@Autowired
	private StudentService studentService;
	
	
	@PostMapping("/student/add")
	public ResponseEntity<Student> addStudent(@RequestBody Student student)
	{
		return new ResponseEntity<Student>(studentService.addStudent(student), HttpStatus.CREATED);
	}
	
	@GetMapping("/student/get")
	public List<Student> gettAllStudent()
	{
		return  studentService.getAllStudent();
	}

}
