/******************************************************************************
 * 
 *  
 *  Purpose: To print the possible permutation of the string using recursion.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   15-05-2019
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograming;

import com.bridgelabz.utilpackage.Utility;

public class PermuteString { 
	
	/**
	 * Function to swap the character
	 * @param s1: user input string.
	 * @param i: starting point
	 * @param j: i th value of loop 
	 * @return: returning the value of array
	 */
	public String swap(String s1,int i,int j) {
		//storing string into char array
		char []str=s1.toCharArray();
		char temp;
		temp=str[i];
		str[i]=str[j];
		str[j]=temp;
		return String.valueOf(str);
		
	}
	/**
	 * Function to print possible permutation
	 * @param s1:user inputString
	 * @param start: starting index value
	 * @param end: length of string
	 */
	public void getPermutation(String s1,int start,int end){
		if(start==end-1) {
			System.out.println(s1);
		}
		else {
			for(int i=start;i<end;i++) {
				s1=swap(s1,start,i);
				//calling recursive function  
				getPermutation(s1,start+1,end);
				s1=swap(s1,start,i);
					
				
			}
		}
		
	}
	/*
	 * The main function is written to test PowerOf2 class
	 */
    public static void main(String[]args) {
	   PermuteString prm=new PermuteString();
	   System.out.println("enter the string for permutation");
	   String s1=Utility.getString();
	   
	   int len=s1.length();
	   //initialize the stating index
	   int start=0;
	   //calling function to print permutation
	   prm.getPermutation(s1,start, len);
	   
	   
   }
}  