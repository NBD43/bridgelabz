package com.bridgelabz.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.bridgelabz.beans.WishGenerator;

public class ConsructorInjectionTest {

	public static void main(String[] args) {

		ApplicationContext ctx=null;
		
		Object obj=null;
		WishGenerator generator=null;
		
		//locate the spring bean configration file
		//create Ioc container
		ctx= new FileSystemXmlApplicationContext("src/main/java/com/bridgelabz/cfgs/applicationContext.xml");
		
		//get Target Bean
		obj= ctx.getBean("wmg");
		
		//get type caste
		generator=(WishGenerator)obj;
		
		//generate business logic
		System.out.println("Message:::"+generator.generateMessage("Nilesh"));
		

	}

}
