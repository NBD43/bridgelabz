package com.bridgelabz.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.bridgelabz.Bridgelabz.CustomerService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx= new FileSystemXmlApplicationContext("src/main/java/com/bridgelabz/resource/applicationContext.xml");
		CustomerService cust=(CustomerService) ctx.getBean("customerServiceProxy");
		System.out.println("************************************");
		cust.printName();
		System.out.println("************************************");
		cust.printUrl();
		System.out.println("************************************");
		
		try {
			cust.printThrowException();
		}catch(Exception e) {}
	}

}
