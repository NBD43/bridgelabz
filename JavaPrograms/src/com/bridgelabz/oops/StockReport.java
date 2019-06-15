package com.bridgelabz.oops;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class StockReport {
	static int count = 0;

	public static void main(String[] args) {
		String Path="/home/bridgeit/eclipse-workspace/JavaPrograms/src/com/bridgelabz/oops/stock.json";
		File file=new File(Path);
		
		
		//creating object of objectMapper class
		ObjectMapper mapper=new ObjectMapper();
		try {
			JsonNode rootNode=mapper.readTree(file);
			JsonNode inventory=rootNode.get("Stock");
			System.out.println("==========ALL TYPES Stock Records==========");
			
			//printing all inventary present in Rice
			for(JsonNode node:inventory)
			{
				//System.out.println(""+node);
				String stockName=node.path("Stock_Name").asText();
				int sharePrice=node.path("Share_Prize").asInt();
				int numberOfShare=node.path("Number_of_shares").asInt();
				
				
				System.out.println(++count+")"+" Name:"+stockName+"\nPrice: "+sharePrice+"\nNumber of Shares: "+numberOfShare);
				System.out.println("total: "+sharePrice*numberOfShare+" Rs"+"\n");
				System.out.println("===============================================");
			}

	
		}catch (IOException e) {
			System.out.println(""+e.getMessage());		
			e.printStackTrace();
		}
	
}
}
