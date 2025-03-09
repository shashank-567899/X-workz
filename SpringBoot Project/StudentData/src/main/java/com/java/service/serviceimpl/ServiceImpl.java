package com.java.service.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.java.model.Student;
import com.java.repository.StudentRepository;
import com.java.service.StudentService;

@Service
public class ServiceImpl implements StudentService {
	
	private StudentRepository studentRepository;
	

	public ServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudent() {
	
		return studentRepository.findAll();
	}

	@Override
	public Student save(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentId(Long id) {
		
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {

		return studentRepository.save(student);
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
	}
	

}
