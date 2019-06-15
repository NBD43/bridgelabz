/******************************************************************************
 * 
 *  
 *  Purpose: To perform bank counter operations.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   24-05-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructureprograms;

import java.util.Scanner;

public class BankCounterTest {
	
	/*
	 * The main function is written to test Coupons class
	 */
	public static void main(String[] args) {
		
		BankCounter b1=new BankCounter();
		Scanner scn=new Scanner(System.in);
		int ch=0;
		do {
			System.out.println("Enter the choice :"
					+ "\n 1.Deposit \n2.Withdraw"
					+ "\n3.Number of people \n4.Exit");
			ch=scn.nextInt();
			
			switch(ch) {
			case 1: System.out.println("Enter amount to Deposit:");
	        		b1.insert(scn.nextInt());
	        		b1.display();
	        		break;
	       
			case 2:System.out.println("Enter amount to be withdrawal:");
	         	   scn.nextInt();
	         	   b1.remove();
	         	   System.out.println("The avilable balance is::");
	         	   b1.display();
	         	   break;
	       
			case 3:int num=b1.getSize();
				  	System.out.println("The number of people in queue:"+num); 
				  	break;
			case 4:System.exit(0);
			
			default:System.out.println("you entered wrong choice");
	        		break;
			}
			
		}while(ch<5);

	}

}
