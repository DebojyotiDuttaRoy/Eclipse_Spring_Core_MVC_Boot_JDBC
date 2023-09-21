package com.annotation;

//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.ComponentScan;


@Configuration
@ComponentScan(basePackages = "com.annotation")
@PropertySource("classpath:company-info")
public class Config {
/* @Bean
	public SoftwareEngineer engineer() {
		return new SoftwareEngineer();
	}
	@Bean
	public Company company() {
		Company company = new Company(engineer());
		//company.setEngineer(engineer());
		return company;
		//return new Company();
	}		*/
}
/*
/*	<?xml version="1.0" encoding="UTF-8"?>
	
	<beans xmlns="http://www.springframework.org/schema/beans"
	    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	    xmlns:context="http://www.springframework.org/schema/context"
	    xsi:schemaLocation="http://www.springframework.org/schema/beans
	        https://www.springframework.org/schema/beans/spring-beans.xsd
	        http://www.springframework.org/schema/context
	        https://www.springframework.org/schema/context/spring-context.xsd">
	    <context:annotation-config/>  
	    
	    //<bean id ="company" class="com.annotation.Company"/>
	    <context:component-scan base-package="com.annotation"/>
	</beans>		*/
