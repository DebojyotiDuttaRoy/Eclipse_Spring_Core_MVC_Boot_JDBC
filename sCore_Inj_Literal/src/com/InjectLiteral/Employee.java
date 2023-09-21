package com.InjectLiteral;

import org.springframework.beans.factory.annotation.Value;
//import org.springframework.beans.factory.annotation.Value;

public class Employee {
	@Value("${employee.name}")
	private String empName;	
	@Value("${employee.id}")
	private int empId;	
	@Value("${employee.skills}")
	private String empOtherSkills;	
/* @Value("${employee.name}")
	//@Value("Abhi")
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Value("${employee.id}")
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Value("${employee.skills}")
	public void setEmpOtherSkills(String empOtherSkills) {
		this.empOtherSkills = empOtherSkills;
	}		*/
	public void showDetails() {
		System.out.println("Employee Name is = "+empName);
		System.out.println("Employee ID is = "+empId);
		System.out.println("Employee Other Skills are = "+empOtherSkills);
	}
}
