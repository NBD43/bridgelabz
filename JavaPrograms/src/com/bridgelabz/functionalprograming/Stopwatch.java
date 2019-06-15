/******************************************************************************
 * 
 *  
 *  Purpose: To find elapse time between start and stop in stopwatch.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   16-05-2019
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograming;

import com.bridgelabz.utilpackage.Utility;


public class Stopwatch {
	
	 /*
	  * The main function is written to test stopwatch  class
	  */
	public static void main(String[] args) {
		
		System.out.println("enter 1 to start the stop watch");
		   int ch=Utility.getInteger();
		
		   if(ch==1) 
		   {
			   //calling start function
			   Utility.getStart();
		   }
		   
		   System.out.println("enter 2 to stop the stop watch");
		   
		   int ch2=Utility.getInteger();
		   
		   if(ch2==2)
		   {
			   //calling stop function
			   Utility.elapsedTime();
			  
		   }
	        
		
	}

	

}
