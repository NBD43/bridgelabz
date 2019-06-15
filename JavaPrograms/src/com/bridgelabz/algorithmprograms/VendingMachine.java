/******************************************************************************
 * 
 *  
 *  Purpose: to calculate the minimum number of Notes as well as the Notes
 *            to be returned by the Vending Machine as a Change.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   18-05-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utilpackage.Utility;

public class VendingMachine {
	/*
	 * The main function is written to test VendingMachine  class
	 */
	public static void main(String[] args) {
		System.out.println("enter the amount:");
		int amount=Utility.getInteger();
		noteSearcher(amount);
	}
	/**
	 * Function to print min number of notes for amount.
	 * @param amount :withdraw money.
	 */
	public static void noteSearcher(int amount) {
		int[]notes= {1000,500,100,50,10,5,2,1};
		int[]numNotes=new int[8];
		for (int i=0;i<8;i++) {
			//increase the count for each note.
			if(amount>=notes[i]) {
				numNotes[i]=amount/notes[i];
				amount=amount-(numNotes[i]*notes[i]);
			}
		}
		System.out.println("Number of notes are");
		for(int i=0;i<8;i++) {
			if(numNotes[i]!=0) {
				System.out.println(notes[i]+"--->"+numNotes[i]);
			}
		}
		
	}

}
