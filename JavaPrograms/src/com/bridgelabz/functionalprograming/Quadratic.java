/******************************************************************************
 * 
 *  
 *  Purpose: To find the roots of given quadratic equation
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   14-05-2019
 *
 ******************************************************************************/

package com.bridgelabz.functionalprograming;

import com.bridgelabz.utilpackage.Utility;

public class Quadratic {
	
	/**
	 *  Function to print the  roots of given  
	 *   equation a*x*x + b*x +c
	 *  
	 * @param a  to store value of a
	 * @param b  to store value of b
	 * @param c  to store value of c
	 */
	public void  qudraticRoot(double a,double b,double c) {
		double delta =0.0,root1=0.0,root2=0.0;
		//get delta value
		delta = b*b-4*a*c;
		
		//to get absolute (Positive) value of a double value.
		delta=Math.abs(delta);
		double sqrt=Math.sqrt(delta);
		//logic to find root
		 root1 = (double)(-b+sqrt)/(2.0*a);
		 root2 = (double)(-b-sqrt)/(2.0*a);
		
		System.out.println("root1 is:"+root1);
		System.out.println("root2 is:"+root2);
		
	}
	
	/*
	 * The main function is written to test Quadratic class
	 */
	public static void main(String[] args) {
		Quadratic qdr=new Quadratic();
		System.out.println("enter the value of a:");
		double a=Utility.getDouble();
		
		System.out.println("enter the value of b:");
		double b=Utility.getDouble();
		
		System.out.println("enter the value of c:");
		double c=Utility.getDouble();
		//calling function to find roots
		qdr.qudraticRoot(a, b, c);
		

	}

}
