package com.bridgelabz.beans;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

	@Override
	public void drive() {
		System.out.println("I am Driving the Car");

	}

}
