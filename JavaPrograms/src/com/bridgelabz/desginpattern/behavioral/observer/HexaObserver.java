package com.bridgelabz.desginpattern.behavioral.observer;

public class HexaObserver extends Observer {
	
	public HexaObserver(Subject subject) {
		 this.subject=subject;
		 this.subject.attach(this);
		
	}

	@Override
	public void update() {
		System.out.println("Binary Search:"+Integer.toHexString(subject.getState()).toUpperCase());
		
	}
}
