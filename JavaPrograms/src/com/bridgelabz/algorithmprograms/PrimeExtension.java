/******************************************************************************
 * 
 *  
 *  Purpose: To print prime number  which is anagram and palindrome
 *
 *  @author  Nilesh Dahiphale
 *  @version 2.0
 *  @since   17-05-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import com.bridgelabz.utilpackage.Utility;


public class PrimeExtension {
     /*
	  * The main function is written to test Prime class
	  */
	public static void main(String[] args) {
		//to store the prime no 1 to n
		List<Integer> prino = new ArrayList<Integer>();
		//to store anagram with prime
		List<Integer> angno = new ArrayList<Integer>();
		//to store prime+anagram+palandrome
		Set<Integer> palno = new HashSet<Integer>();
		
		System.out.println("enter the n value");
		int n=Utility.getInteger();
		//to get prime no
		for(int i=2;i<n;i++) {
			int prime=Utility.getPrimeNumber(i);
			if(prime!=0) {
				//System.out.print(prime+"\t");
				prino.add(prime);
			}
		}
		
		
		//to get prime+anagram
		for(int k=0;k<prino.size();k++) {
			 for(int l=k+1;l<prino.size();l++) {
					 boolean b2=Utility.getAnagram(prino.get(k),prino.get(l));
					 if(b2==true) {
						if(!prino.get(k).equals(angno) &&  !prino.get(k).equals(angno)) { 
							angno.add(prino.get(k));
							angno.add(prino.get(l));
						}
					 }
			 }
		}
		//to get prime+Anagram+palindrome
		for(int i=0;i<angno.size();i++) {
			boolean b3=Utility.checkPalindrome(angno.get(i));
			if(b3==true) {
				palno.add( angno.get(i));
			}
		}
		
	
		System.out.println("prime no:");
		System.out.println(prino);
		System.out.println("prime with Anagram");
		System.out.println(angno);
		System.out.println("prime with Anagram and palaindrome");
		System.out.println(palno);



	}
	

}
