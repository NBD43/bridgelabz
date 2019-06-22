package com.bridgelabz.beans;

import java.util.Date;

public class WishMessageGenerator {
	private Date date;
	
	

	public WishMessageGenerator(Date date) {
		System.out.println("WishMessageGenerator.1-param constructor");
		this.date = date;
	}

	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate()");
		this.date = date;
	}

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.0-param constructor");
	}
	
	
	public String generateWishMessage(String user) {
		int hour=0;
		if(hour<12) {
			return "GoodMorning::"+user;
		}else if(hour<16) {
			return "GoodAfternoon"+user;
		}else if(hour<20) {
			return "GoodEvening"+user;
		}else
		
		return "GoodNight::"+user;
	}
	
	

}
