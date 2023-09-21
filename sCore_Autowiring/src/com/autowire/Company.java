package com.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Company {
	@Autowired
	@Qualifier("dept2")	
	Dept dept;
/* HRDept dept; 
	public Company() {}
	//@Autowired
	public Company (@Qualifier("dept2") HRDept dept) {
		this.dept = dept;
		System.err.println("const");
	}	
	@Autowired
	@Qualifier("dept1")
	public void setDept(HRDept dept) {
	//public void setDept(@Qualifier("dept1")HRDept dept) {
		this.dept = dept;
		System.err.println("setter");
	}	*/
	public void companyWork() {
		if(dept==null)
			System.err.println("No Client No Work !!");
			else
				dept.work();
	}
}
