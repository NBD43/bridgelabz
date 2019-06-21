package com.bridgelabz.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.bridgelabz.beans.WishMessageGenerator;

public class SpringBeanScopeTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx=null;
		Object obj=null;
		Object obj1=null;
		Object obj2=null;
		WishMessageGenerator generator=null;
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/bridgelabz/cfgs/applicationContext.xml");
		
		obj=ctx.getBean("wmg");
		generator=(WishMessageGenerator)obj;
		System.out.println("Message::"+generator.generateWishMessage("Nilesh"));
		System.out.println("Object Refrence::"+obj.hashCode());
		
		obj1=ctx.getBean("wmg");
		generator=(WishMessageGenerator)obj1;
		System.out.println("Message::"+generator.generateWishMessage("Nilesh"));
		System.out.println("Object Refrence::"+obj1.hashCode());
		
		obj2=ctx.getBean("wmg");
		generator=(WishMessageGenerator)obj2;
		System.out.println("Message::"+generator.generateWishMessage("Nilesh"));
		System.out.println("Object Refrence::"+obj2.hashCode());


	}

}
