package com.restapi.registration.Registration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.registration.Registration.model.Employee;
import com.restapi.registration.Registration.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class RegistrationController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value="/registration", method=RequestMethod.POST)
	public String hello(@RequestBody Employee employee) {
		System.out.println(employee);
		employeeService.createEmployee(employee);
		return "hello world!!!";
	}
	
	@RequestMapping(value="/getAll", method=RequestMethod.GET)
	public List<Employee> getAll() {
		
		return employeeService.getAll();
		
	}
	
	
}
