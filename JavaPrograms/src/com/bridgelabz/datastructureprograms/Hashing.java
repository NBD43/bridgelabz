/******************************************************************************
 * 
 *  
 *  Purpose: To find Number using Hashing in a slot.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   28-05-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructureprograms;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.datastructure.*;
public class Hashing {
	public static LinkedList slot[]=new LinkedList[11];
	public static Scanner scn=new Scanner(System.in);
	/**
	 * Function to take user Input in String
	 * @param s: user input.
	 * @return the user input.
	 */
	public static String stringInput(String s) {
		System.out.print(s);
		String string =scn.nextLine();
		return string;
	}
	/**
	 * Function to sort number stored in slot.
	 * @param str : input string.
	 * @return  index slot to stored. 
	 */
	public static int hash(String str) {
		int index=Integer.parseInt(str)%11;
		return index;
	}
	/*
	 * The main function is written to test Hashing  class
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String path="/home/bridgeit/number.txt";
		
		for(int i=0;i<11;i++) {
			slot[i]=new LinkedList();
		}
		//to read the file
		BufferedReader br=new BufferedReader(new FileReader(path));
		String str=br.readLine();
		System.out.println(str);
		String[] strA=str.split(" ");
		//to stored number in slot list
		 for(int i=0;i<strA.length;i++) {
			 int slotNum=hash(strA[i]);
			 slot[slotNum].insert(strA[i]);
		 }
		 System.out.println();
		 //to print linked list
		 for(int i=0;i<11;i++) {
			 System.out.print(i+"==>");
			 slot[i].show();
			 System.out.println();
		 }
		 
		 String key=stringInput("enter the element to search:");
		 int slotNumber=hash(key);
		 boolean value=slot[slotNumber].searchIt(key);
		 
		 
		 if(value) {
			 System.out.println("element Found at slot "+slotNumber+"and deleted");
			 slot[slotNumber].delete(key);
		 }
		 else {
			 System.out.println("element not Found at slot "+slotNumber+"and added");
			 slot[slotNumber].insert(key);
		 }
		 //to print the linked list
		 System.out.println();
		 for(int i=0;i<11;i++) {
			 System.out.print(i+"==>");
			 slot[i].show();
			 System.out.println();
		 }
		 
		 
		 
	
	}

}
