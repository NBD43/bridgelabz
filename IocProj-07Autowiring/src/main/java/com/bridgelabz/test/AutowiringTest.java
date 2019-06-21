package com.bridgelabz.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.bridgelabz.beans.TravelAgent;

public class AutowiringTest {

	public static void main(String[] args) {
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/bridgelabz/cfgs/applicationContext.xml");
		
		TravelAgent agent=(TravelAgent)ctx.getBean("target");
		System.out.println(agent);

	}

}
