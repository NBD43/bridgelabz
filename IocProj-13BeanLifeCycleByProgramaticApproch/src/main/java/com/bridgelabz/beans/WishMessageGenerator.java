package com.bridgelabz.beans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class WishMessageGenerator implements InitializingBean,DisposableBean {
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
	
	//custom destroy method
	@Override
	public void destroy() throws Exception {
		System.out.println("Bean:custom Destroy()");
		date=null;
		
	}
	//init method
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean:custom-init()");
		if(date==null) {
			throw new IllegalArgumentException("date must be inisalized");
		}
	}

}
