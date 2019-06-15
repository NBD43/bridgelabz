/******************************************************************************
 * 
 *  
 *  Purpose: To check the expression is balanced or not.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   25-05-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructureprograms;

import java.util.Scanner;

import com.bridgelabz.datastructure.Stack;

public class BalancedExpression {
	/*
	 * The main function is written to test Coupons class
	 */
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		Stack<Character> st = new Stack<Character>();
		System.out.println("Enter the Expression:");
		String str=scn.nextLine();
		
		
		for(int i=0;i<str.length();i++) {
			char current=str.charAt(i);
			
			if(current=='{' || current=='('||current=='[') {
				st.push(current);
			}
			char top=st.peek();
			if(current=='}'&& top=='{') {
				st.pop();
			}
			else if(current==')'&& top=='(') {
				st.pop();
			}
			else if(current==']'&& top=='[') {
				st.pop();
			}else break;
		}
		 
		if(st.isEmpty()==true ) {
			System.out.println("Balanced");
		}else 
			System.out.println("Unbalanced");
			
			
		
		
	
	}
		
}
	


