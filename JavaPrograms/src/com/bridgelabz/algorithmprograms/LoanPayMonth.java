/******************************************************************************
 * 
 *  
 *  Purpose: to Find Montly payment for given Loan with rate of intrest and year.  
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   18-05-2019
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprograms;

public class LoanPayMonth {

	/*
	 * The main function is written to test LoanPayMonth class
	 */
	public static void main(String[] args) {
		double loan,year,rate,pay;
		//Principal loan amount
		 loan=Double.parseDouble(args[0]);
		//Rate of Interest
		 year=Double.parseDouble(args[1]);
		//Year to return Money
		 rate=Double.parseDouble(args[2]);
		 //calling function for  monthly pay 
		 pay=montlyPayment(loan, year, rate);
		
		 System.out.println("principle of loan amount:"+loan);
		 System.out.println("rate of intrest:"+rate);
		 System.out.println("years:"+year+" year");
		 System.out.println("monthly payment is:"+pay);
	}
	/**
	 * Function to print monthly payment for loan.
	 * @param P :principle of loan amount
	 * @param Y :year to return money
	 * @param R :rate of interest
	 * @return :monthly pay
	 */
	public  static double montlyPayment(double P, double Y, double R) {
		double n=12*Y;
		double r=R/(12*100);
		
		double payment=(P*r)/(1-Math.pow((1+r), (-n)));
		return payment;
		
	}

}
