package com.bridgelabz.desginpattern.creational.singleton;

public class ThreadSafeSingleton {
	private static ThreadSafeSingleton instance;
	
	private ThreadSafeSingleton() {
		
	}
	
	public static synchronized ThreadSafeSingleton getInstance1() {
		if(instance==null) {
			instance=new ThreadSafeSingleton();
		}
		return instance;
	}
	// Double checked locked
	public static  ThreadSafeSingleton getInstance() {
		if(instance==null) {
			synchronized (ThreadSafeSingleton.class) {
				if(instance==null) {
					instance=new ThreadSafeSingleton();
				}
				
			}
		}
		return instance;
	}

}
