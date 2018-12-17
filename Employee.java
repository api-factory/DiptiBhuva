package com.example;

public class Employee {

	private Integer empId;
	private String empFirstName;
	private String empLastName;
	
	public Employee(Integer empId, String empFirstName, String empLastName) {
		super();
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
	}

	public Integer getEmpId() {
		return empId;
	}
	
	public String getEmpFirstName() {
		return empFirstName;
	}	

	public String getEmpLastName() {
		return empLastName;
	}

	
}
