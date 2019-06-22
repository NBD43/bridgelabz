package com.bridgelabz.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.bridgelabz.beans.WishMessageGenerator;

public class SpringBeanScopeTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx=null;
		Object obj=null;
		WishMessageGenerator generator=null;
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/bridgelabz/cfgs/applicationContext.xml");
		
		obj=ctx.getBean("wmg");
		generator=(WishMessageGenerator)obj;
		System.out.println("Message::"+generator.generateWishMessage("Nilesh"));
		System.out.println("Object Refrence::"+obj.hashCode());
		

	}

}
