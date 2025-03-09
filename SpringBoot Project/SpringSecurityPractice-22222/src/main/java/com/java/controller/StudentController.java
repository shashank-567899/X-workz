package com.java.controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.dto.StudentDto;
import com.java.service.StudentService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/student")
@AllArgsConstructor
public class StudentController {


  private StudentService studentService;
  
  @PostMapping
  public ResponseEntity<StudentDto> save(@RequestBody StudentDto studentDto)
  {
	 StudentDto savedStudent= studentService.createStudent(studentDto);
	 return new ResponseEntity<>(savedStudent, HttpStatus.OK);
  }
  
  @GetMapping("/{id}")
  public ResponseEntity<StudentDto> getStudentById(@PathVariable("id") Long id)
  {
	 StudentDto studentDto=studentService.getStudentById(id);
	 return ResponseEntity.ok(studentDto);
  }

}
