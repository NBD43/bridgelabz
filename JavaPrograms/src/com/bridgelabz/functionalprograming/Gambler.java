/******************************************************************************
 * 
 *  
 *  Purpose: Print Number of Wins and Percentage of Win and Loss.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   13-05-2019
 *
 ******************************************************************************/

package com.bridgelabz.functionalprograming;


import com.bridgelabz.utilpackage.Utility;

public class Gambler { 
	
	 /**
	    * Function to print percentage of win,number of win & average bets
	    * @param stake :to store how much cash user have
	    * @param goal: to store how much amount required to win 
	    * @param trials:to store how many times u have to play
	    */
	 public void getResult(int stake,int goal,int trials) {
		 int bets = 0;   //to store how many times he/she loss     
	        int wins = 0; //to store how many times he/she wins
	        /*
	         * outer for loop for how many times u want play
	         */
	        for (int t = 0; t < trials; t++)
	        {
	        	/*
	        	 * play till your cash exactly equal to goal
	        	 */
	        	 int cash = stake;
		        while (cash > 0 && cash < goal)
	            {
	                bets++;
	                if (Math.random() < 0.5) cash++;     
	                else                     cash--;     
	            }
	    
		        if (cash == goal) wins++; 
	        }

	        double perWin=100.0 * wins /trials;//percent of win
	        double avg = 1.0 *  bets/trials;//avg of bets
	        
	        System.out.println(wins + " wins outof " + trials+"trials");
	        System.out.println("Percent of win = " +perWin);
	        System.out.println("no of bets:"+bets);
	        System.out.println("Avg no bets = " +avg);
	       
	}
	
	 /*
	  * The main function is written to test Gambler class
	  */
     public static void main(String[] args) {
    	Gambler gam=new Gambler();
    	
    	System.out.println("enter stake/cash:");
        int stake  = Utility.getInteger();
        
        System.out.println("enter the goal but goal > stake:");
        int goal   = Utility.getInteger(); 
        
        System.out.println("enter the no of trials:");
        int trials = Utility.getInteger(); 
        
        //calling getResult method 
        gam.getResult(stake, goal, trials);

       
    }

}

