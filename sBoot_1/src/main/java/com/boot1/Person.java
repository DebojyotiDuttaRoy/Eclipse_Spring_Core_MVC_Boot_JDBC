package com.boot1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Autowired
	Food food;
	public void sepak() {
		System.out.println("I am able to speak ! !");
	}
	public void eat() {
		food.recipies();
	}
}
