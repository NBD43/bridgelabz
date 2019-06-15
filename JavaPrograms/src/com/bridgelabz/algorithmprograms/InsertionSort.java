/******************************************************************************
 * 
 *  
 *  Purpose: To  Read the strings from standard input and prints them in sorted order.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   17-05-2019
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprograms;


import java.util.List;
import com.bridgelabz.utilpackage.Utility;

public class InsertionSort {
	
	/*
	 * The main function is written to InsertionSort class
	 */
	public static void main(String[] args) {
		System.out.println("enter the elements you want to enter:");
		int leng=Utility.getInteger();
		
		String arr[]=new String[leng];
		//storing user values in array
		Utility.storeArray(arr, leng);
		System.out.println("UnSorted List:");
		Utility.printArray(arr);
		//calling bubble sort function 
		Utility.insertionSort(arr);
		System.out.println("Sorted List:");
		//calling to print array
		Utility.printArray(arr);
		
		
		
	}
	

}
