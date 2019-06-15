/******************************************************************************
 * 
 *  
 *  Purpose: To check year 4-digit year is leap year or not
 *
 *  @author  Nilesh dahiphale
 *  @version 1.0
 *  @since   14-05-2019
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograming;

import com.bridgelabz.utilpackage.Utility;

public class LeapYear {
	
	/**
	  * Function to check year is leap year or not 
	  * @param year to store year   
	  */
	public void getcheckyear(int year) {
		boolean b;// to store 
		/*
		 * nested if is taken to avoid exception cases
		 */
		
		if(year%4==0){
			
			if(year%100==0){
				if(year%400==0){
					b=true;	
				}else b=false;	
			}else b=true;
		}else b=false;
		
		if(b==true){
			System.out.println("The Year  is a leap year");
		}else {
			System.out.println("The Year  is not a leap year");
		}
	}
	
	 /*
	  * The main function is written to test factors class
	  */
	public static void main(String[] args) {
		
		LeapYear ly=new LeapYear();
		int year;
		
		System.out.println("enter the year in 4 digits:\n");
		year=Utility.getInteger();
		
		//calling cheaking leap year or not
		ly.getcheckyear(year);
		
		
		

	}

}
