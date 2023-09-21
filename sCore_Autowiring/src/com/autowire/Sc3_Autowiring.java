package com.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sc3_Autowiring {
	private static ApplicationContext context;
	
	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("beans.xml");
		Company company = context.getBean("company", Company.class);
		company.companyWork();
	}
}
/* <bean id ="deptObj" class="com.autowire.HRDept"></bean>  
	<bean id ="company" class="com.autowire.Company">
		<constructor-arg name="dept" ref="deptObj"/>
	</bean>	-->Sc3_Autowiring --> { Some work of human resource ?}
//----------------------------------------------------------------------------------
	<bean id ="deptObj" class="com.autowire.HRDept"></bean>  
	<bean id ="company" class="com.autowire.Company" autowire="constructor"/> --> Method_1
//----------------------------------------------------------------------------------
	<bean id ="dept" class="com.autowire.HRDept"></bean> 
 //<bean id ="company" class="com.autowire.Company" autowire="byName"/> --> Method_2
 //<bean id ="company" class="com.autowire.Company" autowire="byType"/> --> Method_3
 //<bean id ="company" class="com.autowire.Company" autowire="default"/> --> Method_4
	<bean id ="company" class="com.autowire.Company"/>  --> Method_5 --> { const \nSome work of human resource ? }
 */