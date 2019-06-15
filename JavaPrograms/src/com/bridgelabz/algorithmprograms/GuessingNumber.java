/******************************************************************************
 * 
 *  
 *  Purpose: to think a number and always guesses the answer
 *  		 with n questions.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   18-05-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utilpackage.Utility;

public class GuessingNumber {

	
	/**
	 * Function to guess the answer with n question
	 * @param low :lowest value
	 * @param high:highest value
	 * @return :recursion or guess value
	 */
	public static int search(int low, int high) {
		if((high-low)==1) {
			return low;
		}
		
		int mid=low+(high-low)/2;
		System.out.println("the number is between 0 and "+mid);
		if(Utility.getBoolean()==true) {
			return search(low, mid);
		}else return search(mid,high);
		
		
	}
	/*
	 * The main function is written to test GussingNumber  class
	 */
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int N= (int) Math.pow(2, n);
		System.out.println("think a number between 0 and"+(N-1));
		int guess=search(0,N);
		System.out.println("your guessing number is:"+guess);
		

	}

}
