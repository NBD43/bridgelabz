package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utilpackage.Utility;

public class Binary {
	static int swapNibbles(int x) 
	{ 
	    return ((x & 0x0F) << 4 | (x & 0xF0) >> 4); 
	} 
	  
	// Driver code 
	public static void main(String arg[]) 
	{ 
	    System.out.println("enter the number in decimal");
		int x = Utility.getInteger(); 
	    
	    System.out.print("swapNibles:"+swapNibbles(x)); 
	} 
	
	  

}
