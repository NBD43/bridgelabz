/******************************************************************************
 * 
 *  
 *  Purpose: Print function to print 2 Dimensional Array. In Java use PrintWriter 
 *            to print the output to the screen.
 *
 *  @author   Nilesh Dahiphale
 *  @version 1.0
 *  @since   14-05-2019
 *
 ******************************************************************************/

package com.bridgelabz.functionalprograming;

import java.io.*;

import com.bridgelabz.utilpackage.Utility;


public class MultidimensionalArray {
	
	static int m;//to store the number of rows
	static int n;//to store the number of columns
	
	 /*
	  * The main function is written to test Multidimension  class
	  */
	public static void main(String[] args) {
		
		MultidimensionalArray arr=new MultidimensionalArray();
		
		System.out.println("enter the row value M:");
		 m=Utility.getInteger();
		System.out.println("enter the column value n");
		 n=Utility.getInteger();
		int[][] a= new int[m][n];
		
		/*
		 * for loop to get values for multidimensional array
		 */
		for (int i=0;i<m;i++)  
		{
			for(int j=0;j<n;j++) 
			{
				System.out.println("enter "+i+" of "+j+"value:");
				a[i][j]=Utility.getInteger();
			}
		}
			
		//calling to print array
		Utility.toPrintArray(a, m, n);
		
	}
}
