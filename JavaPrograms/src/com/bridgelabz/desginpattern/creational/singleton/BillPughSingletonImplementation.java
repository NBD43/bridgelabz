package com.bridgelabz.desginpattern.creational.singleton;

public class BillPughSingletonImplementation {
	
	
	private BillPughSingletonImplementation() {
		
	}
	
	private static class Singletonhelper{
		private static final BillPughSingletonImplementation Instance=new BillPughSingletonImplementation();
	}
	
	public static BillPughSingletonImplementation getInstance() {
		
		return Singletonhelper.Instance;
	}
	
	

}
