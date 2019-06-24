package com.bridgelabz.test;


import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.bridgelabz.beans.WishMessageGenerator;

public class SetterInjectionACTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx=null;
		
		Object obj=null;
		WishMessageGenerator generator=null;
		
		//locate the spring bean configration file
		//create Ioc container
		ctx= new FileSystemXmlApplicationContext("src/main/java/com/bridgelabz/cfgs/applicationContext.xml");
		
		//get Target Bean
		obj= ctx.getBean("wmg");
		
		//get type caste
		generator=(WishMessageGenerator)obj;
		
		//generate business logic
		System.out.println("Message:::"+generator.generateMessage("Nilesh"));
		((FileSystemXmlApplicationContext)ctx).close();
		
		
		

	

	}

}
