package com.bridgelabz.oops;

import java.io.File;



import java.io.IOException;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class InventoryManagement {
		public static void main(String[] args) {
			String Path="/home/bridgeit/eclipse-workspace/JavaPrograms/src/com/bridgelabz/oops/MyJson.json";
			File file=new File(Path);
			
			
			//creating object of objectMapper class
			ObjectMapper mapper=new ObjectMapper();
			try {
				JsonNode rootNode=mapper.readTree(file);
				JsonNode inventory=rootNode.get("Rice");
				System.out.println("=====ALL TYPES OF RICE ARE=====");
				
				//printing all inventary present in Rice
				for(JsonNode node:inventory)
				{
					//System.out.println(""+node);
					String name=node.path("name").asText();
					int weight=node.path("weight").asInt();
					int price=node.path("price").asInt();
					
					System.out.println("Name:"+name+"\nPrice: "+price+"\nWeight: "+weight);
					System.out.println("total: "+price*weight+" Rs"+"\n");
				}
	
				JsonNode inventory1=rootNode.get("Pulses");
				
				System.out.println("====ALL TYPES OF PULSES====");
				for(JsonNode node:inventory1)
				{
					//System.out.println(""+node);
					String name=node.path("name").asText();
					int price=node.path("price").asInt();
					int weight=node.path("weight").asInt();
					
					System.out.println("Name:"+name+"\nPrice: "+price+"\nWeight: "+weight);
					System.out.println("total: "+price*weight+" Rs"+"\n");
				}
				
				JsonNode inventory2=rootNode.get("Wheat");
				System.out.println("====ALL TYPES OF WHEATS ARE====");
				for(JsonNode node:inventory2)
				{
					//System.out.println(""+node);
					String name=node.path("name").asText();
					int price=node.path("price").asInt();
					int weight=node.path("weight").asInt();
					
					System.out.println("Name:"+name+"\nPrice: "+price+"\nWeight: "+weight);
					System.out.println("total: "+price*weight+" Rs"+"\n");
				}
			
			} catch (IOException e) {
				System.out.println(""+e.getMessage());		
				e.printStackTrace();
			}
		
	}
}

