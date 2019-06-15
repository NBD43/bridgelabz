/******************************************************************************
 * 
 *  
 *  Purpose: To check string is Anagram or not.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   16-05-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utilpackage.Utility;
public class Anagram {
	
	
	/*
	 * The main function is written to test Anagram  class
	 */
	public static void main(String[] args) {
		boolean b;
		System.out.println("enter the string1 for Anagram ");
		String s1=Utility.getString();
		System.out.println("enter the string2 for Anagram");
		String s2=Utility.getString();
		//calling function to check the Strings
		b=Utility.anagramChecker(s1, s2);
		if(b==true) {
			System.out.println("string are Anagram");
		}else System.out.println("string are not Anagram");
		

	}

}
