package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Company {
	//@Value("OPPO")
	@Value("${company.name}")
	String companyName;
	@Autowired
	@Qualifier("softwareEngineer")
	Engineer engineer;
	//SoftwareEngineer engineer;
/* @Autowired
	public void setEngineer(SoftwareEngineer engineer) {
		this.engineer = engineer;
		System.out.println("I am setter !!");
	}
	@Autowired
	public Company(SoftwareEngineer engineer) {
		this.engineer = engineer;
		System.out.println("I am Constructor !!");
	}		*/
		public void showInfo() {
			System.out.println("Hello company details !!");
			System.out.println("Company Name ="+companyName);
		}
}
