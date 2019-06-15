/******************************************************************************
 * 
 *  
 *  Purpose: To search word from unorderlist and delete it else add it.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   24-05-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructureprograms;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import com.bridgelabz.datastructure.*;

public class UnorderedList {
	/*
	 * The main function is written to test UnorderedList class
	 */
	public static void main(String[] args) throws IOException {	
		//object of linked list
		LinkedList<String> l1=new LinkedList<String>();
		//location of the File
		File f1=new File("/home/bridgeit/nbd.txt");
		// to read the file
		BufferedReader br=new BufferedReader(new FileReader(f1));
		
		String str;
		str=br.readLine();
		
		if(str!=null) {
			System.out.println("file contains are :"+str);
		}else System.out.println("String is Empty");
		
		//spliting word in Array
		String []strarr=str.split(" ");
		for(int i=0;i<strarr.length;i++) {
	
			l1.insert(strarr[i]);
		}
		System.out.println("Linked list Contains:");
		l1.show();
		
		Scanner scn=new Scanner(System.in);
		System.out.println("\nEnter search string:");
		String search=scn.nextLine();
		
		if(l1.searchIt(search)) {
			System.out.println("String Is Found");
			l1.delete(search);
			System.out.println("String deleted");
			l1.show();
		}
		else {
			System.out.println("String Is not Found");
			l1.insert(search);
			System.out.println("String Is Added");
			l1.show();
		}
		
		scn.close();
		br.close();

	}
}


