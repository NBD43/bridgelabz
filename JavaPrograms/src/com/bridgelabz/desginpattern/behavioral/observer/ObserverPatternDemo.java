package com.bridgelabz.desginpattern.behavioral.observer;

public class ObserverPatternDemo {
	public static void main(String[]args) {
		Subject subject=new Subject();
		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);
		
		System.out.println("first state of change:15");
		subject.setState(15);
		System.out.println("second state change:10");
		subject.setState(10);
		
	}

}
