package com.java.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.java.exception.ResourceNotFoundException;
import com.java.model.Employee;
import com.java.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    
	private EmployeeRepo employeeRepo;
	
	
	


	public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
		super();
		this.employeeRepo = employeeRepo;
	}





	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepo.save(employee);
	}

    @Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}





	@Override
	public Employee getEmployeeById(long id) {
		return employeeRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("no id is there"));
	}





	@Override
	public Employee updateEmployee(Employee employee, long id) {
		//we need to check whether employee given id is present or not
		
		Employee existingEmployee =employeeRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("employe is not here"));
		existingEmployee.setId(employee.getId());
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setEmail(employee.getEmail());
		employeeRepo.save(existingEmployee);
		return existingEmployee;
	}





	@Override
	public void deleteEmployee(long id) {
		//check whether exist in a db or not
		employeeRepo.findById(id).orElseThrow(()-> new  ResourceNotFoundException("not id found"));
		
		employeeRepo.deleteById(id);
		
	}

}
