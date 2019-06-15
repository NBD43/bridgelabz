/******************************************************************************
 * 
 *  
 *  Purpose: Replacing a Word  from a String with subString  
 *
 *  @author   Nilesh Dahiphale
 *  @version 1.0
 *  @since   14-05-2019
 *
 ******************************************************************************/

package com.bridgelabz.functionalprograming;

import com.bridgelabz.utilpackage.Utility;

public class StringReplace {
	 /*
	  * The main function is written to test StringReplace  class
	  */
	 public static void main(String[] args) {
		String s1="hello <<username>>,how are you?";
		
		
		System.out.println("enter the username:\n");
		String s2=Utility.getString();
		//call replace function replacing word with substring 
		String s3=s1.replace("<<username>>", s2);
		System.out.println("modified string:\n"+s3);
	}

}
