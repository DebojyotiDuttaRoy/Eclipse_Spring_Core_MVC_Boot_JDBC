package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sc5_Annotation {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		//ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Company company = context.getBean("company",Company.class);
		company.showInfo();
		company.engineer.development();
	}
}
/*	OP 12 Annotations of Spring Boot Framework
1. @SpringBootApplication
@EnableAutoConfiguration + @ComponentScan + @Configuration
2. @Configration
3. @Bean
4. @Autowired
5. @Component
  @Controller (Component,MVC Contoller)
  @Service
  @Respository
6. @ComponentScan
7. @Qualifier
8. @Lazy
9. ResponseBody 
10. RequestBody
11. @RestController
12. @PathVariable
@RequestParam("email") String email		*/