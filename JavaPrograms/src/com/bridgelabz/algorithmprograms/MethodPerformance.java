/****************************************************************************** 
 *  Purpose: To print performance of the method with sorted output.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   17-05-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import com.bridgelabz.utilpackage.Utility;

public class MethodPerformance {
	
	 /*
	  * The main function is written to test MerthodPerformance  class
	  */
	public static void main(String[] args) throws InterruptedException {
		int a[]= {4,5,6,8,2,1,9};
		String []str= {"Tv","Pc","mobile","watch","ipad","Ac","laptop"};
		Utility.getStart();
		int leng=a.length;
		long t1,t2,t3,t4,t5,t6,t7;
		
		t1=System.nanoTime();
		//calling Binary search for Integer 
		int b=Utility.binarySearch(a, 8, 0, 6);
		System.out.println("value  found at index:"+b);
		
		 t2=System.nanoTime();
		 //calling Binary search for String.
		 int c= Utility.binarySearch(str, "Ac");
		 if(c!=-1) {
			  System.out.println("string is not found");
		 }else System.out.println("string is found");
		 
		t3=System.nanoTime();
		//calling Bubble sort for integer array
		Utility.bubbleSort(a);
		System.out.println("Bubble Sort:");
		Utility.printArray(a);
		t4=System.nanoTime();
		//calling Bubble sort for string array
		Utility.bubbleSort(str);
		System.out.println("Bubble Sort:");
		Utility.printArray(str);
		t5=System.nanoTime();
		
		//calling Insertion sort for integer array
		Utility.insertionSort(a);
		System.out.println("Insertion Sort:");
		Utility.printArray(a);
		t6=System.nanoTime();
		//calling Insertion sort for string array
		Utility.insertionSort(str);
		System.out.println("Insertion Sort:");
		Utility.printArray(str);
		t7=System.nanoTime();
		
		System.out.println("performance of binery search for string  :"+(t2-t1)/1000);
		System.out.println("performance of binery search for string  :"+(t3-t2)/1000);
		System.out.println("performance of bubble sort for integer   :"+(t4-t3)/1000);
		System.out.println("performance of bubble sort for string    :"+(t5-t4)/1000);
		System.out.println("performance of insertion sort for integer:"+(t6-t5)/1000);
		System.out.println("performance of insertion for string      :"+(t7-t6)/1000);

	}

}
