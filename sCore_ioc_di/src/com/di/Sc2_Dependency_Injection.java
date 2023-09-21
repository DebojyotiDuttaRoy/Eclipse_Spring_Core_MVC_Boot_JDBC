package com.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sc2_Dependency_Injection {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Bike bike=ac.getBean("bike",Bike.class);
		bike.startEngine();
		/*bike.showColor();
		Bike bike2=ac.getBean("bike",Bike.class);
		bike2.color="RED";
		bike.startEngine();
		bike.showColor();	*/
		Car car=ac.getBean("car",Car.class);
		car.startEngine();
	}
}
/*=========== beans.xml file's different impacts ===========
<bean id="engine" class="com.ioc.Aeroplane"></bean> ----->Sc1_IOC ------>Output { Aeroplane has been started!! }
---------------------------------------------------------------------------------
<bean id="bike" class="com.di.Bike">
 //<property name="color" value="RED"></property> -->Sc2_Dependency_Injection --> {Creation of object \nI am setter !! \nYour color is = RED}
	<constructor-arg name="color" value="RED"></constructor-arg> -->Sc2_Dependency_Injection --> { I am Constructor !! \nYour color is = RED }
</bean>	
---------------------------------------------------------------------------------
<bean id="bike" class="com.di.Bike">
	<constructor-arg name="engine">
		<bean class="com.di.Engine"></bean>
	</constructor-arg>
</bean> -->Sc2_Dependency_Injection --> { I am Constructor !! \nEngine has been started!! }
---------------------------------------------------------------------------------
<bean id="bike" class="com.di.Bike">
	<constructor-arg name="engine">
		<bean class="com.di.Engine"></bean>
	</constructor-arg>
</bean>	
<bean id="car" class="com.di.Car">
	<constructor-arg name="engine">
		<bean class="com.di.Engine"></bean>
	</constructor-arg>
</bean> -->Sc2_Dependency_Injection --> { I am engine!! \nI am engine!! \nEngine has been started!! \nEngine has been started!! }
---------------------------------------------------------------------------------
<bean id="engineobj" class="com.di.Engine"></bean>
<bean id="bike" class="com.di.Bike">
	<constructor-arg name="engine" ref="engineobj"/>
</bean>	
<bean id="car" class="com.di.Car">
	<constructor-arg name="engine" ref="engineobj"/>
</bean> -->Sc2_Dependency_Injection --> { I am engine!! \nEngine has been started!! \nEngine has been started!! }	*/