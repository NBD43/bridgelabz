package com.bridgelabz.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@Component
public class Wish {
	@Autowired
	private Date date;
	
	
	public Wish() {
		//date=new Date();
		System.out.println("Wish.0-param constructor");
	}

	public Wish(Date date) {
		System.out.println("Wish.1-param Constructor");
		this.date = date;
	}

	public void setDate(Date date) {
		this.date = date;
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

}
