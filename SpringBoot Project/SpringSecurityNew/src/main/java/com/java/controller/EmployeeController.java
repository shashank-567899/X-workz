package com.java.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.model.Employee;
import com.java.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
  
	private EmployeeService employeeService;
	
	
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}


	@PostMapping()
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee)
	{
	  return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);	
	}
	
	@GetMapping("/all")
	public List<Employee> getAllEmployees()
	{
		return employeeService.getAllEmployees();
	}
	@GetMapping("{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id")long id)
	{
		return new ResponseEntity<Employee>(employeeService.getEmployeeById(id), HttpStatus.OK);
	}
	
	@PutMapping("{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id")long id , @RequestBody Employee employee)
    {
    	return new ResponseEntity<Employee>(employeeService.updateEmployee(employee, id), HttpStatus.OK);
    }
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id")long id)
	{
		employeeService.deleteEmployee(id);
		
		return new ResponseEntity<String>("employe deleted",HttpStatus.OK);
	}
}
