/******************************************************************************
 * 
 *  
 *  Purpose: using Binary Search the Word from Word List
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   19-05-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

import com.bridgelabz.utilpackage.Utility;

public class WordFinder {
	/**
	 * Function to read the File
	 * @param filename:demo.txt
	 * @return: data of the file
	 * @throws Exception: if file is not found
	 */
	public static String readFileAsString(String filename)throws Exception{
		String data="";
		data=new String(Files.readAllBytes(Paths.get(filename)));
		return data;
	}

	/*
	 * The main function is written to BubbleSort class
	 */
	public static void main(String[] args) throws Exception {
		//read the file from the source
		String d=readFileAsString("/home/bridgeit/eclipse-workspace/JavaPrograms/src/com/bridgelabz/algorithmprograms/demo.txt");
		//split the string into array
		String[] a=d.trim().split(",");
		String x="NBD";
		//sorting array
		Arrays.sort(a);
		
		int r=Utility.binarySearch(a, x);
		if(r==-1) {
			System.out.println("string not found"+r);
		}else {
			System.out.println("String"+x+"found at position:"+r);
		}
		

	}

}
