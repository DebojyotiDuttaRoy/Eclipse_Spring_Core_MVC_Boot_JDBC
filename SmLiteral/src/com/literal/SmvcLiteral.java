package com.literal;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SmvcLiteral {

	public static void main(String[] args) {
			AbstractApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
			Temp temp=context.getBean("tempObj",Temp.class);
			System.out.println(temp.pre+" and "+temp.post);
			context.close();
	}

}
