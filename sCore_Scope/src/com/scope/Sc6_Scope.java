package com.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Sc6_Scope {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AbstractApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);
  		System.out.println("Hi");
  		con.getBean("empBean",Employee.class);
/*		if(con.getBean("empBean",Employee.class) == con.getBean("employeeBean",Employee.class))
			System.out.println("true");
		else
			System.out.println("false");
		Employee e1 = con.getBean("empBean",Employee.class);
		e1.st="Hello";
		System.out.println(e1.st);
		Employee e2 = con.getBean("empBean",Employee.class);
		System.out.println(e2.st);		*/
	}
}
