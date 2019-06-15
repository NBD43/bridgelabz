/******************************************************************************
 * 
 *  
 *  Purpose: To print possible factors of given number.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   14-05-2019
 *
 ******************************************************************************/

package com.bridgelabz.functionalprograming;

import com.bridgelabz.utilpackage.Utility;

public class Factors {
	
	/**
	  * Function to get factors of number
	  *
	  * @param n is number which factor to find  
	  */
	   public void getPossibleFactors(int n) {
		   /*
		    * divide number by 2 until it divides
		    */
		   while(n%2==0) {
	        	System.out.print(2+" ");
	        	n=n/2;
	        }
	        
	        for (int i=3;i<i*i;i=i+2) {
	        	/*
	 		    * divide number by i until it divides
	 		    */
	        	while(n%i==0) {
	        		System.out.print(i+" ");
		        	n=n/i;
	        	}
	        }
	        /*
	         * if number is not Divisible then 
	         *  number  itself is factor 
	         */
	        if(n>2) {
	        	System.out.print(n);
	        }
	   }
	 
	   /*
		* The main function is written to test Factors class
		*/
	    public static void main (String[] args) 
	    { 
	       
	        Factors fc=new Factors();
	        System.out.println("enter no for factorization:");
	        int n=Utility.getInteger();
	        System.out.println("Factors of"+n+" is:");
	        //calling function to print n possible factors
	        fc.getPossibleFactors(n);
	       
	        
	    } 
	} 


