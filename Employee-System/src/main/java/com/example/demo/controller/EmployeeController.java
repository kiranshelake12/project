package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/save")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
    return new ResponseEntity<Employee > (employeeService.createEmployee(employee) , HttpStatus.CREATED);	
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Employee>>getAllEmployee()
	{
	return new ResponseEntity<List<Employee>>(employeeService.getAllEmp(),HttpStatus.OK);
	
	}
	
	@GetMapping ("/id")
	public ResponseEntity<Employee>getEmployeeById(@PathVariable int id ) {
		
	return new ResponseEntity<Employee>	(employeeService.getEmployeeById(id),HttpStatus.OK);
		
	}
	
	@GetMapping ("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable int id ) {
		
		employeeService.deleteEmployee(id);
		
	return new ResponseEntity<String>	("delete sucessfully" , HttpStatus.OK);
		
	}

	
	@PostMapping("/update")
	public ResponseEntity<Employee>updateEmployee(@PathVariable int id,@RequestBody Employee employee )
	{
		return new ResponseEntity<Employee>(employeeService.updateEmployee(id,employee),HttpStatus.OK);
	}

}
