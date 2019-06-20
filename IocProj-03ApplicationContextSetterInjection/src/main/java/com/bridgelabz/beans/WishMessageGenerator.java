package com.bridgelabz.beans;

import java.util.Date;

public class WishMessageGenerator {
	private Date date;

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
