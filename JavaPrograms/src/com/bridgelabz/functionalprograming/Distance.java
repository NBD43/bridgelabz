/******************************************************************************
 * 
 *  
 *  Purpose: To Find Euclidean distance from the point (x, y) to the origin (0, 0)
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   14-05-2019
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograming;

import com.bridgelabz.utilpackage.Utility;

public class Distance {
	/*
	 * The main function is written to test Distance class
	 */

	public static void main(String[] args) {
		//enter the x value
		int x=Integer.parseInt(args[0]);
		
		//enter the y value
		int y=Integer.parseInt(args[1]);
		
		//logic for euclidean distance
		double distance = Math.sqrt(x*x + y*y);

		System.out.println("Euclidean distance from  ("+x+"," +y+") to the origin (0, 0):\n"+distance);
	}

}
