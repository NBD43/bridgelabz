/******************************************************************************
 * 
 *  
 *  Purpose: To perform CommercialDataProcessing using Queue.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   01-06-2019
 *
 ******************************************************************************/package com.bridgelabz.oops.commercialdataprocessing;


import java.io.File;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.datastructureprograms.*;

import com.bridgelabz.oops.CommercialPOJO;
public class StoreTransactionDateInQueue {

	public static void main(String args[]) throws JsonMappingException, IOException {
		String companyName = null;
		String symbol = null;
		// object of queue class
		ObjectMapper mapper = new ObjectMapper();
		Queue<String> queue = new Queue<>(); // create object of queue class
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); // set date and time format
		LocalDateTime now = LocalDateTime.now(); // get current time
		String date = (dtf.format(now));
		// read file data into linked list
		LinkedList<CommercialPOJO> data1 = mapper.readValue(new File(
				"/home/bridgeit/eclipse-workspace/JavaPrograms/src/com/bridgelabz/oops/commercialdataprocessing/commercialStockData.json"),
				new TypeReference<LinkedList<CommercialPOJO>>() {
				});
		int i = 0;
		int size = data1.size();
		// check if file is empty
		if (size == 0)
			System.out.println("\nno data found");
		// if file is not empty then print details
		else {

			for (i = 0; i < data1.size(); i++) {
				StringBuffer buffer=new StringBuffer();
				companyName = data1.get(i).getCompanyName().trim();
				buffer.append(companyName+" ");
				
				symbol = data1.get(i).getSymbol().trim();
				buffer.append(symbol+" ");
				date = data1.get(i).getDate().trim();
				buffer.append(date+" ");
				queue.enqueue(buffer.toString()) ;// add data to queue
			}
		}
		System.out.println("  company\tsymbol\t  date & time of transaction\n");
		queue.display();

	}

}
