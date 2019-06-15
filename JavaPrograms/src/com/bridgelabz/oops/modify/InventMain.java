package com.bridgelabz.oops.modify;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.codehaus.jackson.util.DefaultPrettyPrinter;


import com.bridgelabz.utilpackage.Utility;

public class InventMain {
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
		List<Inventory> stocks = new ArrayList<>();

		int numOfStocks = Utility.inputInteger("how many  no. of Inventory");
		int count = 1;
		while (count <= numOfStocks) {
			String name = Utility.inputString("enter  name: ");
			int weight = Utility.inputInteger("enter Weight: ");
			double price = Utility.inputDouble("enter price : ");
			System.out.println();
			Inventory stock = new Inventory();
			stock.setName(name);
			stock.setWeight(weight);
			stock.setPrice(price);
			name = name.toUpperCase();
			//String str = name.substring(0, 3);
			if (name.length() < 3) {
				name = name.substring(0, name.length());
			}
			stocks.add(stock);

			count++;
		}
		writer.writeValue(
				new File("/home/bridgeit/eclipse-workspace/JavaPrograms/src/com/bridgelabz/oops/stockmanagement/Stock.json"),
				stocks);

		InventPort portfolio = new InventPort();
		portfolio.setStocks(stocks);
		// Print the stock portfolio
		System.out.println("SL No \t Name\t\t Total Inventory\t    PerKg Price\t Inventory Value");
		System.out.println(
				"========================================================================================================");
		count = 1;
		for (Inventory s : portfolio.getStocks()) {
			System.out.printf("%2d\t %-15s\t\t %3s\t\t%-3f\t\t%-3f\n", count, s.getName(),
					s.getWeight(), s.getPrice(), s.getPrice() * s.getWeight());
			count++;
		}
		System.out.println("\n Total Inventory Value = " + portfolio.getTotalStockValue());

	}

}
