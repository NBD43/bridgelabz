/******************************************************************************
 * 
 *  
 *  Purpose: To print Percentage of Head vs Tails
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   14-05-2019
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograming;

import com.bridgelabz.utilpackage.Utility;

public class CoinProbability {
	
	 /**
	  * Function to print probability head vs tail
	  *
	  * @param n is number of flip  
	  */
	public void getProbability(int n) {
		int tail=0,head=0;
		double r,perTail,perHead;
		if(n>0){
			/*
			 * to get tails vs heads count 
			 */
			for(int i=1;i<=n;i++){
				//to store random no
				r=Math.random();
				if(r<0.5){
					tail=tail+1;
				
				}else{
					head=head+1;
				}
			}
			//tail percent
			perTail=(tail*100)/n;
			// head percent
			perHead=(head*100)/n;
			System.out.println("For"+n+"Times flip coin percentage of tail:"+perTail+"% & head is:"+perHead+"%");
			
		}
	}
	
	 /*
	  * The main function is written to test CoinProbability  class
	  */
	public static void main(String[] args) {
		CoinProbability cp=new CoinProbability();
		int n;
		System.out.println("How many no of times you want to flip the coin:");
		n=Utility.getInteger();
		//calling to get percent head vs tail
		cp.getProbability(n);
		
		
		

	}

}
