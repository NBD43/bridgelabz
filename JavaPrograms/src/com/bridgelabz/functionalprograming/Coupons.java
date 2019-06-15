/******************************************************************************
 * 
 *  
 *  Purpose: To Generate N coupons with distinct numbers.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   14-05-2019
 *
 ******************************************************************************/

package com.bridgelabz.functionalprograming;


import com.bridgelabz.utilpackage.Utility;


public class Coupons {
	
	  /**
	    * Function to check and print coupon number
	    *
	    * @param n is to print n coupons
	    */
	public void displayCoupons(int n) {
		int ran = 0,min=1000,max=9999;
		boolean b=false;
		
		int a[] = new int[n];
		
		//outer for loop for print n coupons
		for(int i=0;i<n;i++) {
			
			
			/*
			 *if i=0 is there then directly store coupon number 
			 *    else it will generate coupon number and check previous coupon number  
			 */
			if(i==0) {
				a[i]=Utility.newRandom(min,max);
			}
			else {
				//inner for loop for checking coupon number
				for(int j=i-1;j>=0;j--) {
					ran=Utility.newRandom(min,max);
					//if true then dont store coupon else store
					if (a[i]==ran) {
						b=false;
					}
					else{
						b=true;
					}
				}
					
					if(b=true) 
					{
						a[i]=ran;
						
					}
				
			}System.out.println(i+1+"noCoupon Numbers are:"+a[i]);
		}
	}
	
	 /*
	  * The main function is written to test Coupons class
	  */
	 public static void main(String[] args) {
		Coupons cpn=new Coupons();
		System.out.println("How many coupans do u want to generate:");
		int n= Utility.getInteger();
		
		//calling to generate coupon 
		cpn.displayCoupons(n);
		
		
	}

}
