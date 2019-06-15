/******************************************************************************
 * 
 *  
 *  Purpose: To print 2 power N table.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   14-05-2019
 *
 ******************************************************************************/

package com.bridgelabz.functionalprograming;

import com.bridgelabz.utilpackage.Utility;

public class PowerOf2 {
	
	 /**
	  * Function to print table 
	  *
	  * @param n is to print table upto n  
	  */
	public void getTable(int n) {
		int t = 0;// to store and update the value
		
		//if condition to check given n is in range or not
		if(n>0 && n<31) {
			
			//to print table upto n is less than equal to n
			for(int i=1;i<=n;i++) {
				if(i==1) {
					t=2;
					System.out.println("2 power "+i+" is:"+t);
				}else {
					t=t*2;
					System.out.println("2 power "+i+" is:"+t);
				}
			}
		}else System.out.println("Enter value in between 0 and 31");
	}
	
	 /*
	  * The main function is written to test PowerOf2 class
	  */

	public static void main(String[] args) {
		PowerOf2 pow=new PowerOf2();
		//enter the power of n
		int n=Integer.parseInt(args[0]);
		//calling function to print table
		pow.getTable(n);
		
		

	}

}
