/******************************************************************************
 * 
 *  
 *  Purpose: to compute the square root of a nonnegative number.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   18-05-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

public class SquareRoot {
	/*
	 * The main function is written to test SquareRoot  class
	 */
	public static void main(String[] args) {
		 double c = Double.parseDouble(args[0]);
		 if(c>0) {
			 //calling function to get square root
			 double sdrt=getSqrt(c);
			 System.out.println("square root:"+sdrt);
		 }else {
			 System.out.println("enter the positive value");
		 }
	  
	}
	/**
	 * Function square root of positive no
	 * @param c: is anumber
	 * @return: return square root
	 */
	public static double getSqrt(double c) {
		double epsilon = 1.0e-15; 
	    double t = c;
	    
	    while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2.0;
        }
		return t;
	    
		
	}

}
