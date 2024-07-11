package com.example.demo.service;

import java.util.List;

import org.springframework.context.annotation.Bean;


import com.example.demo.Entity.Employee;


public interface EmployeeService {

    @Bean
   public  Employee createEmployee(Employee employee); 
	
	public List<Employee>getAllEmp();
	public Employee getEmployeeById(int id);
	
	public void deleteEmployee(int id);
	
	public Employee updateEmployee(int id, Employee employee );
	
	
	
	
	}

	

