/******************************************************************************
 * 
 *  
 *  Purpose: To find Number of possible Binary Search Tree.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   28-05-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructureprograms;

import java.util.Scanner;

public class NumberOfBinaryTree {
	/*
	 * The main function is written to test PalindromeChecker class
	 */
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("how many nodes u want :");
		int n=scn.nextInt();
		System.out.println("Enter the numbers");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
			
			long x=factnumber(arr[i]);
			System.out.println("Possible number of "+arr[i]+" node is "+x);
		}
	}
		/**
		 * Function to return possible number of nodes
		 * @param number:number of nodes
		 * @return value
		 */
		 public	static long factnumber(int number)
		   { 

				long value=factorial(2*number)/(factorial(number+1)*factorial(number));
				return value;
			}
		 /**
		  * Function to return the number.
		  * @param y: is number.
		  * @return factorial of number.
		  */
		 public static long factorial(long y)
			{
				long fact=1;
				for(long i=1;i<=y;i++)
				{
					fact=fact*i;
				}
				return fact;
		}

	

}
