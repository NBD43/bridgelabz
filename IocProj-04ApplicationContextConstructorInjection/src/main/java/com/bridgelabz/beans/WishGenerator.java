package com.bridgelabz.beans;

import java.util.Date;

public class WishGenerator {

	private Date date;
	
	public WishGenerator( Date date) {
		
		this.date = date;
	}
	
	//b.method
	public String generateMessage(String name) {
		int hour=0;
		
		hour=date.getHours();
		if(hour<12) {
			return "GM"+name;
			
		}else if(hour<16) {
			return "GA"+name;
			
		}else if(hour<20) {
			return "GE"+name;
		}else return "GN"+name;
	}

}
