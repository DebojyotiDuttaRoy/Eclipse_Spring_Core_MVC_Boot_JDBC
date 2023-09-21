package com.ioc;

public class Car implements Engine1 {
	@Override
	public void start() {
		System.out.println("Car has been started!!");
	}
}