package com.bridgelabz.oops.inventarymanagement;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.ObjectMapper;

public class InventoryDisplay {
	
	public static void main(String[] args) {
		String Path="/home/bridgeit/eclipse-workspace/JavaPrograms/src/com/bridgelabz/oops/inventarymanagement/Inv.json";
		File file=new File(Path);
	
		try {
			JsonFactory jfactory = new JsonFactory();
			JsonParser jParser = jfactory.createJsonParser(new File(Path));
			while (jParser.nextToken() != JsonToken.END_OBJECT) {
				String fieldname = jParser.getCurrentName();
				
				if ("Rice".equals(fieldname)) {
					jParser.nextToken(); 
					while (jParser.nextToken() != JsonToken.END_ARRAY) {
					
						while (jParser.nextToken() != JsonToken.END_OBJECT) {
							 fieldname = jParser.getCurrentName();
							if ("name".equals(fieldname)) {
								
								jParser.nextToken();
								System.out.println("name"+jParser.getText()); // display mkyong
							}
							if ("weight".equals(fieldname)) {
								
								jParser.nextToken();
								System.out.println("weight:"+jParser.getIntValue()); // display 29
							}
							if ("price".equals(fieldname)) {
								
								jParser.nextToken();
								System.out.println("price "+jParser.getIntValue()); // display 29
							}
							System.out.println();
						}
					}
				}
			}
			jParser.close();
				
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
