/******************************************************************************
 * 
 *  
 *  Purpose: to sort the string array using mergeSort.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   18-05-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utilpackage.Utility;

public class MergeSort {
	/**
	 * Function to sort the Array.
	 * @param list: array
	 * @return :sorted array
	 */
	public static String[] mergeSort(String[] list) {
        String [] sorted = new String[list.length];
        if (list.length == 1) {
            sorted = list;
        } else {
            int mid = list.length/2;
            String[] left = null; 
            String[] right = null;
            if ((list.length % 2) == 0) {
                left = new String[list.length/2];
                right = new String[list.length/2];
            } else { 
                left = new String[list.length/2];
                right = new String[(list.length/2)+1];
            }
            int x=0;
            int y=0;
            for ( ; x < mid; x++) {
                left[x] = list[x];
            }
            for ( ; x < list.length; x++) {
                right[y++] = list[x];
            }
            left = mergeSort(left);
            right = mergeSort(right);
            sorted = mergeArray(left,right);
        }

        return sorted;
    }
	/**
	 * Function to merge the array.
	 * @param left:sub array of main.
	 * @param right: sub array of main.
	 * @return
	 */
    private static String[] mergeArray(String[] left, String[] right) {
        String[] merged = new String[left.length+right.length];
        int lIndex = 0;
        int rIndex = 0;
        int mIndex = 0;
        int comp = 0;
        while (lIndex < left.length || rIndex < right.length) {
            if (lIndex == left.length) {
                merged[mIndex++] = right[rIndex++];
            } else if (rIndex == right.length) {
                merged[mIndex++] = left[lIndex++];
            } else {  
                comp = left[lIndex].compareTo(right[rIndex]);
                if (comp > 0) {
                    merged[mIndex++] = right[rIndex++];
                } else if (comp < 0) {
                    merged[mIndex++] = left[lIndex++];
                } else { 
                    merged[mIndex++] = left[lIndex++];
                }
            }   
        }
        return merged;
    }
    /*
	 * The main function is written to test SquareRoot  class
	 */
	public static void main(String[] args) {
		System.out.println("how many elements u want to enter:");
		int leng=Utility.getInteger();
		String [] arr=new String[leng];
		//calling function for Storing the array
		Utility.storeArray(arr, leng);
		System.out.println("unsorted array:");
		Utility.printArray(arr);
		//calling function to sort the array
		String[] sortArr = mergeSort(arr);
		System.out.println("sorted array:");
		Utility.printArray(sortArr);
		

	}

}
