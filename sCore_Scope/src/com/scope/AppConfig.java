package com.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
//import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	@Bean
	//@Scope(scopeName = "singleton")
	//@Scope(scopeName = "prototype")
	@Lazy
	Employee empBean() {
		return new Employee();
	}
/* @Bean
	Employee employeeBean() {
		return new Employee();
	}		*/
}
	
