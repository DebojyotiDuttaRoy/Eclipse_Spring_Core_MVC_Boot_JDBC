package com.InjectLiteral;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sc4_Inject_Literal {
	private static ApplicationContext context;
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp = context.getBean("emp",Employee.class);
		emp.showDetails();
	}
}
/* <bean id ="emp" class="com.Inj_Literal.Employee">
			<property name="empName" value="Ravi"></property>
			<property name="empId" value="123"></property>
			<property name="empOtherSkills" value="Singing"></property>
	</bean> 
//--------------------------------------------------------------------------
 * 	<context:property-placeholder location="classpath:employee-info"/>
	<bean id ="emp" class="com.InjectLiteral.Employee">
			<property name="empName" value="${employee.name}"/>
			<property name="empId" value="${employee.id}"/>
			<property name="empOtherSkills" value="${employee.skills}"/>
	</bean>		*/
