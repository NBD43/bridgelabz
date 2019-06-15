/******************************************************************************
 * 
 *  
 *  Purpose: To stored primeAnagram numbers 1-1000 in 2D Array using Queue .
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   27-05-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructureprograms;

import com.bridgelabz.datastructure.Utility;

public class PrimeAnagramQueue {
	/*
	 * The main function is written to test PrimeAnagramQueue class
	 */
	public static void main(String[] args) {
		System.out.println("printing PRIME+ ANAGRAM+ BY USING QUEUE");
		Queue<Integer> q1=new Queue<Integer>();
		int range=1000;
		int [] arr=Utility.primeAnagram(range);
		for(int i=0;i<arr.length;i++) {
			q1.enqueue(arr[i]);
		}
		q1.display();
	}

}
