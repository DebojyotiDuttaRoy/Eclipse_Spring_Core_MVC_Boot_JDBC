package com.boot1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
/*	import org.springframework.context.annotation.AnnotationConfigApplicationContext;
	import org.springframework.boot.SpringBootConfiguration;
	import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
	import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
@SpringBootConfiguration	*/
@SpringBootApplication
public class sBoot_1 {
	public static void main(String[] args) {
		ApplicationContext con = SpringApplication.run(sBoot_1.class, args);
/*		@SuppressWarnings("resource")
		ApplicationContext con = new AnnotationConfigApplicationContext(Config.class);	*/
		Person person = con.getBean(Person.class);
		person.eat();
	}
}