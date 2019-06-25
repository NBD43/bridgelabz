package com.bridgelabz.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.beans.Operation;
public class Test{
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Operation e = (Operation) context.getBean("opBean");
		e.msg();
		e.display();
	}
}
