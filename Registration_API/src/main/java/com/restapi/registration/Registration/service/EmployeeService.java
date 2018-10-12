package com.restapi.registration.Registration.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.registration.Registration.model.Employee;
import com.restapi.registration.Registration.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public void createEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
	
	public List<Employee> getAll(){
		return (List<Employee>)employeeRepository.findAll();
	}
}
