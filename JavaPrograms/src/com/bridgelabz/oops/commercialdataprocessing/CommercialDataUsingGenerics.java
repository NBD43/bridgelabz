/******************************************************************************
 * 
 *  
 *  Purpose: To perform CommercialDataProcessing using genrics.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   01-06-2019
 *
 ******************************************************************************/package com.bridgelabz.oops.commercialdataprocessing;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.oops.CommercialPOJO;

import com.bridgelabz.utilpackage.*;

public class CommercialDataUsingGenerics {
	static ObjectMapper mapper = new ObjectMapper();

	// static LinkedList<CommercialPOJO> ours = new LinkedList<>();// arraylist to
	// store transaction data
	public static LinkedList<CommercialPOJO> list = new LinkedList<>();

	public static void main(String args[]) throws Exception {
		int choice = 0;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		CommercialPOJO com = new CommercialPOJO();
		do {
			System.out.println("\n1. Add data to the stock");
			System.out.println("2. Remove data from the stock");
			System.out.println("3. display list of stock ");
			System.out.println("4. buy symbol from stock ");
			System.out.println("5. sell symbol from stock");
			System.out.println("6. For Exit the stock management");
			choice = Utility.getInteger();
			switch (choice) {
			case 1:
				// to add new data
				System.out.println("Enter company Name:");
				String name = Utility.getString();

				System.out.println("Enter symbol:");
				String number = Utility.getString();

				System.out.println("Enter Price");
				String price = Utility.getString();

				com.setCompanyName(name);
				com.setSymbol(number);
				com.setSymbolValue(price);
				// get current time
				String date = (dtf.format(now));
				com.setDate(date);
				list.add(com);
				// add new data
				// saveFile(com);
				System.out.println("data added successfully ");
				break;

			case 2:
				// to remove data
				list.deleteFront();
				System.out.println("data removed successfully");
				break;

			case 3:
				// to display data
				list.display();
				break;

			case 4:
				System.out.println("Exiting");
				break;
			default:
				System.out.println("Invalid Entry Retype");
			}

		} while (choice <= 4 && choice > 0);

	}

}
