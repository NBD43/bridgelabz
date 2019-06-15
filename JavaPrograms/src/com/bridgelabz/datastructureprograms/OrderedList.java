/******************************************************************************
 * 
 *  
 *  Purpose: To search word from orderlist and delete it else add it..
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

import com.bridgelabz.datastructure.LinkedList;

public class OrderedList {
	
	//to perform insertion sort on int array
	public static void bubbleSort(int a[]) {
		int leng=a.length;
		for(int i=0;i<leng-1;i++) {
			for(int j=0;j<leng-i-1;j++) {
				if(a[j] > a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
			
		}
	}

	public static void main(String[] args) throws IOException {
		//linked list object created
		LinkedList<Integer> l1=new LinkedList<Integer>();
		//location file stored
		File f1=new File("/home/bridgeit/number.txt");
		//read the file
		BufferedReader br=new BufferedReader(new FileReader(f1));
		
		String str;
		str=br.readLine();
		
		if(str!=null) {
			System.out.println("File Contains are:"+str);
		}else System.out.println("File is empty");
		
		
		String[] strarr=str.split(" ");
		//passing value String to Integer array
		int [] intarr= new int[strarr.length];
		for(int i=0;i<strarr.length;i++) {
			intarr[i]=Integer.parseInt(strarr[i]);
		}
		//sorting Integer Array
		bubbleSort(intarr);
		for(int i=0;i<intarr.length;i++) {
			l1.insert(intarr[i]);
		
		}
		System.out.println("LinkedList Contains:");
		l1.show();
		
		Scanner scn=new Scanner(System.in);
		System.out.println("\nEnter the number");
		Integer search=scn.nextInt();
		
		if(l1.searchIt(search)) {
			System.out.println("Number Is Found");
			l1.delete(search);
			System.out.println("Number Is deleted");
			l1.show();
		}
		else {
			//System.out.println("Number Is Found");
			l1.insert(search);
			System.out.println("Number is Added");
			l1.show();
		}
		br.close();
		scn.close();

	}

}
