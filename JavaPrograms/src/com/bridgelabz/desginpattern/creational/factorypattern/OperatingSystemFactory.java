package com.bridgelabz.desginpattern.creational.factorypattern;

public class OperatingSystemFactory {
	public OperatingSystem getInstance(String str) {
		if(str.equals("open"))
			return new Android();
		else if(str.equals("closed"))
			return new Ios();
		else
			return new Windows();
	}

}
