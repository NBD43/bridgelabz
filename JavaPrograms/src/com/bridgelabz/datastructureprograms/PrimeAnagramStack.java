/******************************************************************************
 * 
 *  
 *  Purpose: To stored primeAnagram numbers 1-1000 in 2D Array using Stack.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   28-05-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructureprograms;

import com.bridgelabz.datastructure.Stack;
import com.bridgelabz.datastructure.Utility;

public class PrimeAnagramStack {
	/*
	 * The main function is written to test PrimeAnagramStack class
	 */
	public static void main(String[] args) {
		System.out.println("printing PRIME+ ANAGRAM+ BY USING STACK");
		int range=1000;
		int []arr=Utility.primeAnagram(range);
		Stack<Integer> st=new Stack<Integer>();
		for(int i=arr.length-1;i>=0;i--) {
			st.push(arr[i]);
		}
		
		System.out.println("Reverse PRIME+ANAGRAM :");
		while(st.isEmpty()!=true) {
			System.out.print(st.pop()+"  ");
		}

	}

}
