package com.bridgelabz.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("wish")
public class WishMessageGenerator {
	private Date date;
	@Autowired
	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate()");
		this.date = date;
	}
	
	public WishMessageGenerator(){
		System.out.println("WishMessageGenerator-0 param constructor");
	}
	
	
	//b.methods
	public String generateMessage(String name) {
		int hour=0;
		hour=date.getHours();
		
		if(hour<12) {
			return "GoodMorning"+name;
		}else if(hour<16) {
			return "GoodAfterNoon"+name;
		}else if(hour<20) {
			return "GoodEvening"+name;
			
		}else return "GoodNight"+name;
	}
	
	//custom destroy method
	@PreDestroy
	public void destroy(){
		System.out.println("Bean:custom Destroy()");
		date=null;
		
	}
	//init method
	@PostConstruct
	public void check() {
		System.out.println("Bean:custom-init()");
		if(date==null) {
			throw new IllegalArgumentException("date must be inisalized");
		}
	}

}
