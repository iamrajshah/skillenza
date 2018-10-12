package com.restapi.registration.Registration.repository;

import org.springframework.data.repository.CrudRepository;

import com.restapi.registration.Registration.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
