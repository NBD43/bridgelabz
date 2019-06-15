/******************************************************************************
 * 
 *  
 *  Purpose: To print N harmonic no and Nth harmonic value
 *
 *  @author  Nilesh
 *  @version 1.0
 *  @since   13-05-2019
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograming;

import com.bridgelabz.utilpackage.Utility;

public class HarmonicNumber {
	 /**
	  * Function to print n harmonic no & nth value 
	  *
	  * @param n is to print harmonic number upto n  
	  */
	
	public void getHarmonicValue(int n) {
		double hn = 0;//to store and update harmonic number
		
		 /*
		  * to print n harmonic number from 1 to n
		  */
		  for (int i=1;i<=n;i++) { 
			   if(i==n) {
				   System.out.print(" 1/"+i);
		        }else System.out.print(" 1/"+i+" +"); 
		  }   
		   System.out.println(); 
		  /*
		   * to print nth harmonic number variable 
		   * j should declared double to get correct value  
		   */
		   for (double j=1;j<n;j++) {
			 hn=hn+(1/j);
		}
		
		System.out.println("the nth harmonic value is:"+hn);
		
	}
	
	 /*
	  * The main function is written to test Harmonic  class
	  */

	public static void main(String[] args) {
		HarmonicNumber hno=new HarmonicNumber();
		System.out.println("Enter the no to print n harmonic values:");
		int n=Utility.getInteger();
		//calling to print harmonic number
		hno.getHarmonicValue(n);

	}

}
