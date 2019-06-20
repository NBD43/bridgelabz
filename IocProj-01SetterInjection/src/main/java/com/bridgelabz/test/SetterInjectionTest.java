package com.bridgelabz.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.bridgelabz.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		
		Resource res=null;
		BeanFactory factory=null;
		Object obj=null;
		WishMessageGenerator generator=null;
		
		//locate the spring bean configration file
		res= new FileSystemResource("src/main/java/com/bridgelabz/cfgs/applicationContext.xml");
		
		//create Ioc container
		factory=new XmlBeanFactory(res);
		
		//get Target Bean
		obj= factory.getBean("wmg");
		
		//get type caste
		generator=(WishMessageGenerator)obj;
		
		//generate business logic
		System.out.println("Message:::"+generator.generateMessage("Nilesh"));
		
		
		

	}

}
