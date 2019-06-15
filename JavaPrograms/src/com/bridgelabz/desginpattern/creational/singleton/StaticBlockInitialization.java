package com.bridgelabz.desginpattern.creational.singleton;

public class StaticBlockInitialization {
	private static  StaticBlockInitialization instance;
	static {
		try {
			instance=new StaticBlockInitialization();
			
		}catch(Exception e) {
			System.out.println("instance cannot created");
		}
	}
	
	private StaticBlockInitialization() {
		
	}
	
	public static StaticBlockInitialization getInstance() {
		return instance;
	}

}
