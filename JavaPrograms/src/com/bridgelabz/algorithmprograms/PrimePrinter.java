/******************************************************************************
 * 
 *  
 *  Purpose: To print the N Prime Number.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   16-05-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utilpackage.Utility;

public class PrimePrinter {

	/*
	 * The main function is written to PrimePrinter class
	 */
	public static void main(String[] args) {
		System.out.println("enter the n value to print upto ");
		int n = Utility.getInteger();
		
		for (int i = 2; i <= n; i++) {
			//calling function prime from utility
			int prime = Utility.getPrimeNumber(i);
			if(prime!=0) {
			System.out.print(prime+"\t");
			}
		}

	}

	
		

}
