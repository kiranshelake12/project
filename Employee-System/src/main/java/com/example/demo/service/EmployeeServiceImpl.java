package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employee;
import com.example.demo.repository.EmployeeRepository;


@Service
public class  EmployeeServiceImpl  implements EmployeeService {

	@Autowired
	private EmployeeRepository employeerepository;

	@Override
	public Employee createEmployee(Employee employee) {
		
		return employeerepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmp() {
		
		return employeerepository.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {
		
		return employeerepository.findById(id).get();
	}

	@Override
	public void deleteEmployee(int id) {
		
		Employee employee=employeerepository.findById(id).get();
		if (employee !=null) {
			employeerepository.delete(employee);
			
		}
	}

	@Override
public Employee updateEmployee(int id, Employee employee) {
		
		Employee oldemployee=employeerepository.findById(id).get();
		if (oldemployee !=null) {
			
			employee.setId(id);
			return employeerepository.save(employee);
			
		}
		return null;
	}
	
	
	

	
	
}
