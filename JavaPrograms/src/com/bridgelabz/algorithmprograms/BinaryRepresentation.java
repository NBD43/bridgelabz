/******************************************************************************
 * 
 *  
 *  Purpose: to convert decimal Number to Binary Representation.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   18-05-2019
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utilpackage.Utility;

public class BinaryRepresentation {
	
	/*
	 * The main function is written to test SquareRoot  class
	 */
	public static void main(String[] args) {
		System.out.println("enter the decimal Number");
		int num=Utility.getInteger();
		int bnum=toBinary(num);
		System.out.println("Bineary representation:\n"+bnum);

	}
	/**
	 * Function to convert decimal to binary
	 * @param num: decimal number
	 * @return:binary number
	 */
	public static int toBinary(int num) {
		if (num == 0)  
            return 0;   
        else
        	return (num % 2 + 10 *  
                toBinary(num / 2)); 
	}

}
