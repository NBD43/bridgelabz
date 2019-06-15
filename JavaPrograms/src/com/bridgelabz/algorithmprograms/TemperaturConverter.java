/******************************************************************************
 * 
 *  
 *  Purpose: To convert Fahrenheit Temperature to Celsius or viceversa.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   18-05-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utilpackage.Utility;

public class TemperaturConverter {
	
	/*
	 * The main function is written to test TempratureConvertert class
	 */
	 public static void main(String[] args) {
		System.out.println("Enter the number:\n1.Fahrenheit to Celsius "
				                 + "\n2.Celsius to Fahrenheit");
		int ch=Utility.getInteger();
		//calling function for conversion
		double convert=Utility.temperaturConversion(ch);
		System.out.println("Converted Temprature:\n"+convert);

	}

	
}
