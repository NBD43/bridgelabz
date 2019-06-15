/******************************************************************************
 * 
 *  
 *  Purpose: To stored primeAnagram numbers 1-1000 in 2D Array.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   25-05-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructureprograms;

import com.bridgelabz.datastructure.Utility;

public class PrimeAnagram {
	/*
	 * The main function is written to test PrimeAnagram class
	 */
	public static void main(String []args) {
		System.out.println("to stored the prime anagram in 2d Array");
		int[][] arr=new int[13][13];
		int primeAnagram[]=Utility.primeAnagram(1000);
		int k=0, f=0;
		//System.out.println(arr.length);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=primeAnagram[k];
				k++;
				if(k==158) {
				f = 1;
					break;
				}
			}
			if(f==1)
				break;
		}
		//to display 2d Array.
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i][j]!=0)
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	
				
			
		
		
	}

}
