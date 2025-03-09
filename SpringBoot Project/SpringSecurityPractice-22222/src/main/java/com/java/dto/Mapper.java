package com.java.dto;

import com.java.entity.Student;

public class Mapper {
	
	public static StudentDto mapToStudentDto(Student student) {
		return new StudentDto(student.getId()
				,student.getName(),
				student.getPassword());
	}
	
	public static Student maptostudent(StudentDto  studentDto) {
		return new Student(studentDto.getId(),
				studentDto.getName(),
				studentDto.getPassword());
	}
}
