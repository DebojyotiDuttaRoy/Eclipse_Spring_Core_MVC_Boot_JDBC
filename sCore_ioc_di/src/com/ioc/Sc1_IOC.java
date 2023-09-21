package com.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Keys{
	/*public void run(Bike key) {
		 //new Car().start();
		 key.start();
	 }
	 public void run(Car key) {key.start();}		*/
	public void run(Engine1 key) {
		key.start();
	}
}
public class Sc1_IOC {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Engine1 key = (Engine1)ac.getBean("engine");
		new Keys().run(key);
	}
}
//<bean id="engine" class="com.ioc.Aeroplane"></bean> ----->Sc1_IOC ------>Output { Aeroplane has been started!! }