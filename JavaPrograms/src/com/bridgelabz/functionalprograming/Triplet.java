/******************************************************************************
 * 
 *  
 *  Purpose: To print Sum of three Integer adds to ZERO
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   14-05-2019
 *
 ******************************************************************************/

package com.bridgelabz.functionalprograming;
import com.bridgelabz.utilpackage.Utility;;

public class Triplet {
	
	/**
	  * Function to print number of distinct triplets
	  * @param a is array with initialization
	  * @param n is length of an array 
	  */
	public void findTiplet(int[] a, int n)
	{
		boolean found=false ;
		for(int i=0;i<n-2;i++) //for 1st value 
		{
			for(int j=i+1;j<n-1;j++) //for 2nd value
			{
				for(int k=j+1;k<n;k++) //for 3rd value 
				{
					//if sum of three elements zero its triplet
					if(a[i]+a[j]+a[k]==0) 
					{
						found=true;
						System.out.println("Triplet are :"+a[i]+ " "+a[j]+ " "+a[k] );
					}else {
						found=false;
					}
					
				}
			}
		}
		//if triplets are not there
		if(found==false)
		{
			System.out.println("triplets not exist");
		}
		
		
	}
		
	
	 /*
	  * The main function is written to test Triplet  class
	  */
	public static void main(String[] args) {
		Triplet tpt=new Triplet();
		System.out.println("enter the array size:");
		int n=Utility.getInteger();
		
		
		int  a[]= new int[n];//initialized array
		
		//get values from user
		for(int i=0;i<n;i++) {
			System.out.println("enter the value"+i+"position");
			a[i]=Utility.getInteger();
		}
		//calling function to find triplet 
		tpt.findTiplet(a,n);
		

	}

}
