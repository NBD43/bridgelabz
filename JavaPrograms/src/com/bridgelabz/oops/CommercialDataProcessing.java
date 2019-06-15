package com.bridgelabz.oops;




import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.utilpackage.Utility;

public class CommercialDataProcessing {

	static ObjectMapper mapper = new ObjectMapper();
	// static LinkedList<CommercialPOJO> ours = new LinkedList<>();// arraylist to
	// store transaction data
	public static LinkedList<CommercialPOJO> data = new LinkedList<>();

	public static void main(String args[]) throws Exception {
		int choice = 0;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		CommercialPOJO com = new CommercialPOJO();
		do {
			System.out.println("Enter the choice:");
			System.out.println("1. ADD STOCK");
			System.out.println("2. REMOVE STOCK");
			System.out.println("3. DISPLAY ");
			System.out.println("4. BUY STOCK ");
			System.out.println("5. SELL STOCK");
			System.out.println("6. EXIT");
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
				//String stringValue=new String(Integer.toString(price));
				//stringValue=Integer.toString(price);
				com.setSymbolValue(price);
				// get current time
				String date = (dtf.format(now));
				com.setDate(date);

				// add new data
				saveFile(com);
				System.out.println("data added successfully ");
				break;

			case 2:
				// to remove data
				removeData();
				System.out.println("data removed successfully");
				break;

			case 3:
				// to display data
				displayInformation();
				break;

			case 4:
				// to buy symbol
				System.out.println("Which symbol you want to buy:");
				String symbol = Utility.getString();
				System.out.println("enter company name:");
				String name1 = Utility.getString();
				System.out.println("enter symbol price:");
				String price1 = Utility.getString();

				com.setCompanyName(name1);
				com.setSymbol(symbol);
				com.setSymbolValue(price1);
				date = (dtf.format(now));
				com.setDate(date);
				// add new data
				saveFile(com);
				System.out.println("transaction successful...buyed");
				break;

			case 5:
				// to sell data
				removeData();
				break;

			case 6:
				System.out.println("Exiting");
				System.exit(0);
			default:
				System.out.println("Invalid Entry Retype");
			}

		} while (choice >7);

	}

	// to remove data
	private static void removeData() throws JsonMappingException, IOException,JsonGenerationException {
		try {

			data = mapper.readValue(
					new File(
							"/home/bridgeit/eclipse-workspace/JavaPrograms/src/com/bridgelabz/oops/commercialStockData.json"),
					new TypeReference<LinkedList<CommercialPOJO>>() {
					});
		} catch (IOException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		System.out.println("Enter Symbol");
		String symbol = Utility.getString();
		int i = 0;
		for (i = 0; i < data.size(); i++) {
			if (i == data.size()) { // to check list is empty or not
				System.out.println("Invalid ");
			} else if (data.get(i).getSymbol().equals(symbol)) { // if symbol found then remove it
				data.remove(i);
			}
		}
		try {
			mapper.writeValue(
					new File(
							"/home/bridgeit/eclipse-workspace/JavaPrograms/src/com/bridgelabz/oops/commercialStockData.json"),
					data);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

//to display data
	public static void displayInformation() throws JsonMappingException, IOException {
		// TODO Auto-generated method stub
		LinkedList<CommercialPOJO> data1 = mapper.readValue(
				new File("/home/bridgeit/eclipse-workspace/JavaPrograms/src/com/bridgelabz/oops/commercialStockData.json"),
				new TypeReference<LinkedList<CommercialPOJO>>() {
				});

		int i = 0;
		int size = data1.size();
		if (size == 0)
			System.out.println("\nno data found");
		else {
			System.out.println("Name\tsymbol\tvalue");
			for (i = 0; i < data1.size(); i++) {
				System.out.println(data1.get(i).getCompanyName() + "\t  " + data1.get(i).getSymbol() + "\t"
						+ data1.get(i).getSymbolValue());
			}
		}
	}

//to save data 
	public static void saveFile(CommercialPOJO com) throws JsonGenerationException,IOException,JsonParseException{

		try {
			data = mapper.readValue(
					new File(
							"/home/bridgeit/eclipse-workspace/JavaPrograms/src/com/bridgelabz/oops/commercialStockData.json"),
					new TypeReference<LinkedList<CommercialPOJO>>() {
					});
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		data.add(com);
		try {
			mapper.writeValue(
					new File(
							"/home/bridgeit/eclipse-workspace/JavaPrograms/src/com/bridgelabz/oops/commercialStockData.json"),
					data);

			
			// write data to file
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
