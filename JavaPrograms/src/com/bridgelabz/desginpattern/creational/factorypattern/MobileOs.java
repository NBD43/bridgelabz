package com.bridgelabz.desginpattern.creational.factorypattern;

import com.bridgelabz.utilpackage.Utility;

public class MobileOs {

	public static void main(String[] args) {
		OperatingSystemFactory osf=new OperatingSystemFactory();
		System.out.println("enter os you want:");
		String Str=Utility.getString();
		OperatingSystem os=osf.getInstance(Str);
		os.addOs();

	}

}
