 package com.springboot.first.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	//http://localhost:8080/student
	@GetMapping("/student")
	public Student getStudent()
	{ 
		
		return new Student("siddharth","khot");
	}
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		
		List<Student> students =new ArrayList<>();
		students.add(new Student("siddharth","khot"));
		students.add(new Student("kiran","khot"));
		students.add(new Student("arun","khaddannavar"));
		return students;
	}

}
