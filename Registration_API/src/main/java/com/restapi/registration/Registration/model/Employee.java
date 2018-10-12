package com.restapi.registration.Registration.model;


import javax.persistence.*;

@Entity
@Table(name="employeeDetails")
public class Employee {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int EmployeeId;
	
	@Column(name="firstName",nullable=false)
	private String FirstName;
	
	@Column(name="lastName",nullable=false)
	private String LastName;
	@Column(name="Department",nullable=false)
	private String Department;
	@Column(name="gender",nullable=false)
	private String Gender;
	@Column(name="dateOfBirth",nullable=true)
	private String DateOfBirth;
	
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	
	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", FirstName=" + FirstName + ", LastName=" + LastName
				+ ", Department=" + Department + ", Gender=" + Gender + ", DateOfBirth=" + DateOfBirth + "]";
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public Employee(String firstName, String lastName, String department, String gender, String dateOfBirth) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Department = department;
		Gender = gender;
		DateOfBirth = dateOfBirth;
	}
	public Employee() {
		super();
	}
	
	
}
