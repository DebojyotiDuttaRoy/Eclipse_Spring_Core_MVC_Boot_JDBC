package com.di;

public class Bike {
	Engine engine;
	public Bike(Engine engine) {
		this.engine = engine;
		//System.out.println("I am Bike Constructor !!");	
	}
	public void startEngine() {
		if(engine==null)
			System.out.println("Unable to start your engine");
		else
		engine.start();
	}	
/* String color;
	public Bike() {
		System.out.println("Creation of object");
	}
//	public void setColor(String color) {
//		this.color = color;
//		System.out.println("I am setter !!");	
//	}
	public Bike(String color) {
		this.color = color;
		System.out.println("I am Constructor !!");	
	}
	public void showColor() {
		System.out.println("Your color is = "+color);
	}	*/
}
