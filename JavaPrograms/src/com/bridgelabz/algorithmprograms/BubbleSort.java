/******************************************************************************
 * 
 *  
 *  Purpose:  Read the values in integers prints them in sorted order
 *              using Bubble Sort.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   17-05-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utilpackage.Utility;

public class BubbleSort {
	
	/*
	 * The main function is written to BubbleSort class
	 */
	public static void main(String[] args) {
		System.out.println("enter the elements you want to enter:");
		int leng=Utility.getInteger();
		int arr[]=new int[leng];
		//storing user values in array
		Utility.storeArray(arr, leng);
		System.out.println("UnSorted List:");
		Utility.printArray(arr);
		//calling bubble sort function 
		Utility.bubbleSort(arr);
		System.out.println("Sorted List:");
		//calling to print array
		Utility.printArray(arr);
		
	}

}
