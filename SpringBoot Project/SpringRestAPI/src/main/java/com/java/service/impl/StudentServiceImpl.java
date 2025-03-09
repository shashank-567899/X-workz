package com.java.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.java.exception.ResourceNotFoundException;
import com.java.model.Student;
import com.java.repository.StudentRepository;
import com.java.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

   private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
    @Override
	public Student saveStudent(Student student) {
	   
		return studentRepository.save(student);
	}
    @Override
	public List<Student> getAllStudent() {
		
		return studentRepository.findAll() ;
	}
    @Override
	public Student getStudentById(long id) {
	   Optional<Student> student =studentRepository.findById(id);
	   if (student.isPresent()) {
		   return student.get();
		}
	   else {
		throw new ResourceNotFoundException("Student","Id", student);
	    }
	}
    @Override
	public Student updateStudent(Student student, long id) {
    	Student existStudent =studentRepository.findById(id).orElseThrow(
    			() -> new ResourceNotFoundException("Student","Id", id));
    	existStudent.setName(student.getName());
    	existStudent.setRollNo(student.getRollNo());
    	
    	studentRepository.save(existStudent);
    	return existStudent;
	}
	@Override
	public void deleteStudent(long id) {
		
		 studentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Student","id", id));
		studentRepository.deleteById(id);
		
	}

}
