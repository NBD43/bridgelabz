package com.bridgelabz.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.bridgelabz.beans.WishGenerator;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		
		Resource res=null;
		BeanFactory factory=null;
		Object obj=null;
		WishGenerator generator=null;
		//locate the file
		res= new FileSystemResource("src/main/java/com/bridgelabz/cfgs/applicationContext.xml");
		//create ioc container
		factory= new XmlBeanFactory(res);
		//get target beans
		obj=factory.getBean("wmg");
		//type casting
		generator=(WishGenerator)obj;
		//b.method
		System.out.println("Message:::"+generator.generateMessage("Nilesh"));
		
		
	

	}

}
