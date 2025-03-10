package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository employeeRepository; 
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}



	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}



	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}



	@Override
	public Employee getEmployeeById(int id) {
          Optional<Employee> emmployee= employeeRepository.findById(id);
         return emmployee.orElseThrow(()-> new ResourceNotFoundException("Employee","id",id));
	}



	@Override
	public Employee updateEmployee(Employee employee, int id) {
	
		//we need to check whether  employee with given id is exist in db or not
		
   Employee existingEmployee=employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee", "Id", id));
		    existingEmployee.setFirstName(employee.getFirstName());
		    existingEmployee.setLastName(employee.getLastName());
		    existingEmployee.setEmail(employee.getEmail());
		    
		    employeeRepository.save(existingEmployee);
		return existingEmployee;
	}



	@Override
	public void deleteEmployee(int id) {
		
		employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee","id", id));
		employeeRepository.deleteById(id);
	}

}
