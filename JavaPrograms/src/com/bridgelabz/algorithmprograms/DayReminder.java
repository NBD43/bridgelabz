/******************************************************************************
 * 
 *  
 *  Purpose: To find the day of the week from date.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   18-05-2019
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utilpackage.Utility;

public class DayReminder {
	//weeks days
	static final String DAYS[]= {"Sunday","Monday","Tuesday","wednesday","Thusday","Friday","Satarday"};
	/*
	 * The main function is written to test DayReminder  class
	 */
	public static void main(String[] args) {
		System.out.println("enter the date:");
		int d=Utility.getInteger();
		
		System.out.println("enter the month");
		int mon=Utility.getInteger();
		
		System.out.println("enter the year");
		int y=Utility.getInteger();
		//calling function to print the day
		 int day = Utility.dayofweek(d, mon, y); 
		 System.out.print(DAYS[day]); 

	}
	

}
