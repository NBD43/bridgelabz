/*******************************************************************************
 *  Purpose: To use this Functions multiple times
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   14-05-2019
 *
 ******************************************************************************/
 package com.bridgelabz.utilpackage;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility {
	public static Scanner sc=new Scanner(System.in);
	public static long start;
	public static Pattern pattern = null;

	

		//to get integer as a input from scanner 
		public static int getInteger() {
			return sc.nextInt();
		}
		//to get integer as a input from scanner 
		public static long getLong() {
			return sc.nextLong();
		}
		
		//to get double as a input from scanner 
		public static double getDouble() {
			return sc.nextDouble();	
		}
			
	
		//to get String as a input from scanner 
		public static String getString() {
			return (sc.next());	
		}
		
	
		//to get boolean as a input from scanner 
		public static boolean getBoolean() {
			return sc.nextBoolean();
			
		}
		public static String inputString(String string) {
			System.out.println(string);
			return (sc.nextLine());
		}

		public static int inputInteger(String string) {
			System.out.println(string);
			return (Integer.parseInt(sc.nextLine()));
		}

		public static long inputLong(String string) {
			System.out.println(string);
			return (Long.parseLong(sc.nextLine()));
		}

		public static double inputDouble(String string) {
			System.out.println(string);
			return (Double.parseDouble(sc.nextLine()));
		}
		//to display array on console using printWriter
		public static void toPrintArray(int a[][],int m,int n) {
			PrintWriter pw = new PrintWriter(System.out);
			for (int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					pw.write(a[i][j]+" ");
					
				}
				pw.write("\n");
			}
			pw.flush();  
			pw.close();

		}
		//to print random number 
		public static int newRandom(int min, int max) {
		    Random r = new Random();
		    return r.nextInt((max - min) + 1) + min;
		}
		
		
		//Function is used to start stopwatch
		 public static void getStart() {
			 start=System.currentTimeMillis();
			 //System.out.println("start"+start);
		 }
		 
		// Function is used to stop and display elapse time
		 public static void elapsedTime() {
			 long stop=System.currentTimeMillis();
			 //System.out.println("stop"+stop);
			 double elapse=(stop-start)/1000.0;
			System.out.println("elapse time: "+elapse);
		 }
		//to print integer array
		 public static void printArray(int a[])
		    {
		        int leng = a.length;
		        for (int i=0; i<leng; i++)
		            System.out.print(a[i] + " ");
		        System.out.println();
		    }
		 //to print String array
		 public static void printArray(String a[])
		    {
		        int leng = a.length;
		        for (int i=0; i<leng; i++)
		            System.out.print(a[i] + " ");
		        System.out.println();
		    }
		 //to stored the array in integer
		 public static void storeArray(int arr[],int leng) {
				for(int i=0;i<leng;i++) {
					System.out.println("enter the "+i+"  elements:");
					arr[i]=Utility.getInteger();
				}
				
			}
		 //to store array in String
		  public static void storeArray(String arr[],int leng) {
				for(int i=0;i<leng;i++) {
					System.out.println("enter the "+i+"  elements:");
					arr[i]=Utility.getString();
				}
				
			}
		
//=======================Algorithm functions========================================		
		
		//Function to check number is palindrome or not
		public static boolean checkPalindrome(Integer n) {
			boolean b1;
		     int sum = 0, r;
			 int temp = n;    
		     while(n>0)
			   {    
		        r = n % 10;   
		        sum = (sum*10)+r;    
		        n = n/10;    
		       }    
		      if(temp==sum) {    
		        //number is palindrome
		        b1=true;
		      }
		      else {    
		       //Not a palindrome
		        b1=false;
		      }
		      
			return b1;    
		}
		/**
		 * function is used to check the integer are they anagram 
		 * @param i1:1st integer 
		 * @param i2:2nd integer
		 */
		public static boolean anagramChecker(Integer i1, Integer i2) {
			int l,l1,l2,present=0,notPresent=0;
			boolean b1=false;
			String s1=i1.toString();
			String s2=i2.toString();
			l1=s1.length();
			l2=s2.length();
			//to check the length
			if(l1==l2) {
				l=l1;
				//to check 1st String char
				for(int i=0;i<l;i++) {
					present=0;
					//to check 2nd String char
					for(int j=0;j<l;j++) {
						if(s1.charAt(i)==s2.charAt(j)) {
							present=1;
							break;
						}
					}
					if(present==0) {
						notPresent=1;
						break;
					}
				}
				if (notPresent==1) {
					//strings are not Anagram"
					b1=false;
				}
				else {
					//strings are Anagram
					b1=true;
				}
		}
			return b1;
		}
		/**
		 * function is used to check the strings are they anagram 
		 * @param s1:1st String 
		 * @param s2:2nd String
		 */
		public static boolean anagramChecker(String s1,String s2) {
			int l,l1,l2,present=0,notPresent=0;
			boolean b1;
			l1=s1.length();
			l2=s2.length();
			//to check the length
			if(l1==l2) {
				l=l1;
				//to check 1st String char
				for(int i=0;i<l;i++) {
					present=0;
					//to check 2nd String char
					for(int j=0;j<l;j++) {
						if(s1.charAt(i)==s2.charAt(j)) {
							present=1;
							break;
						}
					}
					if(present==0) {
						notPresent=1;
						break;
					}
				}
				if (notPresent==1) {
					//strings are not Anagram"
					b1=false;
				}
				else {
					//strings are Anagram
					b1=true;
				}
				
			}
			else {
				//enter both string of same length
				b1=false;
			}
			return b1;
		}
		
		
		/**
		 * Function to print n prime number.
		 * 
		 * @param n: number upto printed
		 */
		public static int getPrimeNumber(int n) {
			
				int reminder=0,pr=0;	
				for(int i=2;i<n;i++){
					  if(n%i==0){
						  reminder++;
						  break;
					  }
				}
				if(reminder==0) {
					pr=n;
				}
				return pr;
		}
		
		/**
		 * 
		 * @param i1: fist Integer
		 * @param i2: Second Integer
		 * @return: true or false for anagram
		 */
		public static boolean getAnagram(Integer i1,Integer i2) {
			//converting Integer to String
			String s1=i1.toString();
			String s2=i2.toString();
			//converting String to char Array
			char[] str1=s1.toCharArray();
			char[] str2=s2.toCharArray();
			//
			int n1=str1.length;
			int n2=str2.length;
			if(n1!=n2) {
				return false;
				
			}
			//char array to sort
			Arrays.sort(str1);
			Arrays.sort(str2);
			
			for(int i=0;i<n1;i++) {
				if(str1[i]!=str2[i]) {
					return false;
				}
			}
			
			return true;
			
		}
		//binary Search method for a String
		public static int binarySearch(String[] arr, String x) 
	    { 
	        int l = 0, r = arr.length - 1; 
	        while (l <= r) { 
	            int m = l + (r - l) / 2; 
	            int res = x.compareTo(arr[m]);
	            if (res == 0) 
	                return m; 
	            if (res > 0) 
	                l = m + 1; 
	            else
	                r = m - 1; 
	        } 
	  
	        return -1; 
	    } 
		
		//binary search for Integer
		public static int binarySearch(int a[],int val,int low,int high) {
			int index=Integer.MAX_VALUE;
			while(low<=high) {
				int mid=(low+high)/2;
				if(a[mid] < val) {
					low=mid+1;
					
				}else if(a[mid] > val) {
					high=mid-1;
				}else if(a[mid]==val) {
					index=mid;
					break;
				}
			}
			return index;
			
		}
		//to perform Integer bubble sort
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
		//to perform String bubble sort
		public static void bubbleSort(String[]a) {
			int leng=a.length;
			String temp;
			for (int j=0;j<a.length;j++) {
				for(int i=j+1;i<a.length;i++) {
					if(a[i].compareTo(a[j])<0) {
						temp= a[j];
						a[j]=a[i];
						a[i]= temp;
					}
				}
				
			}
		}
		
		//to perform insertion sort on int array
		public static void insertionSort(int a[]) {
			int leng=a.length;
			for(int i=0;i<leng;i++) {
				int key=a[i];
				int j=i-1;
				while((j>-1) && (a[j]>key)){
					a[j+1]=a[j];
					j--;
				}
				a[j+1]=key;
			}
		}
		//to perform insertion sort on String array
		public static void insertionSort(Comparable a[]) {
			Comparable temp;
			for(int i=1;i<a.length;i++) {
				temp=a[i];
				int j=0;
				
				for(j=i;j>0;j--) {
					if(temp.compareTo(a[j-1])<0) {
						a[j]=a[j-1];
					}else break;
				}
				a[j]=temp;
			}
		}
		
		/**
		 * Function to return the day of the week.
		 * @param d:date
		 * @param m:month
		 * @param y:year
		 * @return: the day of that date.
		 */
		public static int dayofweek(int d, int m, int y) {
			
			int y1=y-(14-m)/12;
			int x=y1 + y1/4 -y1/100 + y1/400;
			int m1=m+ 12*((14-m)/12)-2;
			int day=(d+x+31*m1/12)%7;
			
			return day;
		}
		/**
		 * Function to convert  Fahrenhit temperature in Celsius or viceversa
		 * @param ch
		 * @return
		 */
		public static double temperaturConversion(int ch) {
			double far,cels;
			switch (ch) {
			case 1: System.out.println("Enter the temprature in Fahrenhit");
				  far=Utility.getDouble();
		    	  cels=(far-32)*5/9;
		    	  return cels;
			case 2: System.out.println("Enter the temprature in celsius");
					cels=Utility.getDouble();
					 far=((9*cels)/5)+32;
				  return far;
			default:System.out.println("enter the correct choice");
				break;
			}
			
			return 0;
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

		
	//==================================OOPS==========================================//
		
		//for validating username
		public static boolean validateName(String txt) {

			String regx = "[a-zA-Z]+\\.?";
			pattern = Pattern.compile(regx, Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(txt);
			return matcher.find();

		}
	//for validating mobile NUmber
		public static boolean validatemobileNumber(String mobileNo) {
			String regex = "^[0-9]{10}$";
			pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher((mobileNo));
			return matcher.find();

		}
	//for validating Full Name
		public static boolean validateFullName(String fullName) {
			String regex = "^([a-zA-Z]{2,}\\s[a-zA-z]{1,}'?-?[a-zA-Z]{2,}\\s?([a-zA-Z]{1,})?)";
			pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(fullName);
			return matcher.find();

		}
	//for validating date
		public static boolean validateDate(String Date) {
			String regex = "\\d{2}/\\d{2}/\\d{4}";
			pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(Date);
			return matcher.find();

		}
		


		

}
