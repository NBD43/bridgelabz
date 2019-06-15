/******************************************************************************
 * 
 *  
 *  Purpose: To find the effective temperature by using temperature t (in Fahrenheit)
 *                      and the wind speed v (in miles per hour)
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   15-05-2019
 *
 ******************************************************************************/

package com.bridgelabz.functionalprograming;

public class WindChill {
	/*
	 * The main function is written to test WindChill  class
	 */
	public static void main(String[] args) {
		//enter temperature command line in Fahrenheit
        double t = Double.parseDouble(args[0]);
        //enter wind speed command line
        double v = Double.parseDouble(args[1]);
        //value of temp<50
        if(t<50 ) {
        	//value of wind speed between 3 and 120
        	if(v<120 && v>3) {
      
        		double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
        		System.out.println("Temperature = " + t);
        		System.out.println("Wind speed  = " + v);
        		System.out.println("effective temperature to be = " + w);
        	}else System.out.println("pls enter the wind speed in range 3 to 120 ");
        }else System.out.println("pls enter the temprature below 50");
    }

}
