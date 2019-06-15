/******************************************************************************
 * 
 *  
 *  Purpose: To print prime number which is anagram and palindrom.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0(error)
 *  @since   16-05-2019
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.bridgelabz.utilpackage.Utility;

public class primePalindrome {
	

	public static void main(String[] args) {
		 List<Integer> palno = new ArrayList<Integer>();
		 List<Integer> angno = new ArrayList<Integer>();

		System.out.println("enter the n value");
		int n=Utility.getInteger();
		
		for(int i=2;i<n;i++) {
			int prime=Utility.getPrimeNumber(i);
			if(prime!=0) {
				//System.out.print(prime+" ");
				boolean b1=Utility.checkPalindrome(prime);
				if(b1==true) {
					
					
					palno.add(prime);
				}
			}
		}
		System.out.println("prime with palandrome");
		System.out.println("\n"+palno);
		
		//======================================================================
		for(int i=2;i<n;i++) {
			int prime=Utility.getPrimeNumber(i);
			if(prime!=0) {
				//System.out.print(prime+"\t");
				angno.add(prime);
			}
		}
		System.out.println("prime no:");
		System.out.println("\n"+angno);
		System.out.println("prime with anagram");
		 for(int k=0;k<angno.size();k++) {
			 for(int l=0;l<angno.size();l++) {
				 if(angno.get(k)==angno.get(l)) {
					 boolean b2=Utility.anagramChecker(angno.get(k),angno.get(l));
					 if(b2==true) {
						 
						 System.out.print(angno.get(l)+" ");
					 }
				 }
				 
			 }
		 }
		
		
				
			
		
	}

	
}
	
	
		
		
		
		
		
			
	


