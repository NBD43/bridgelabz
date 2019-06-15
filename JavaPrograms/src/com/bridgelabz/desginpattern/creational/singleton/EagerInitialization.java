package com.bridgelabz.desginpattern.creational.singleton;

public class EagerInitialization {
	private static final EagerInitialization instance=new EagerInitialization();
	
	//cannot creatre Instances
	private EagerInitialization() {
		
	}
	
	public static EagerInitialization getInstance() {
		return instance;
		
	}

}
