package com.java.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.service.StudentService;

import ch.qos.logback.core.model.Model;

@RestController
public class StudentController {
	
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@GetMapping("/students/all")
	public String listStudent(org.springframework.ui.Model )
	{
	  
	
	}
	

}
