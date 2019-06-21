package com.bridgelabz.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.bridgelabz.beans.Vehicle;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/bridgelabz/cfgs/applicationContext.xml");
		Vehicle obj=(Vehicle)ctx.getBean("car");
		obj.drive();

	}

}
