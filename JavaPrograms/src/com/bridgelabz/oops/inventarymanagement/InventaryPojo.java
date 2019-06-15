/******************************************************************************
 * 
 *  
 *  Purpose: To create and  Inventary and stored in json .
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   31-05-2019
 *
 ******************************************************************************/
package com.bridgelabz.oops.inventarymanagement;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonEncoding;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.utilpackage.Utility;

public class InventaryPojo {
	public static void main(String[] args) {
	try {
			JsonFactory jfactory = new JsonFactory();
			/*** write to file ***/
			String path="/home/bridgeit/eclipse-workspace/JavaPrograms/src/com/bridgelabz/oops/inventarymanagement/Inventory.json";
			JsonGenerator jGenerator = jfactory.createJsonGenerator(new File(path), JsonEncoding.UTF8);
			jGenerator.writeStartObject(); // {
			System.out.println("enter the number type you want");
			int n1=Utility.getInteger();
			int count1=0;
			while(n1>count1) {
				System.out.println("Enter the Field:");
				String field=Utility.getString();
				jsonFile(jGenerator,field);
				count1++;
			}
			jGenerator.writeEndObject(); // }
			System.out.println("Json file created !!");
			jGenerator.close();
			JsonParser jParser = jfactory.createJsonParser(new File(path));
			while (jParser.nextToken() != JsonToken.END_OBJECT) {
				System.out.print(jParser.getText());
			}
//			System.out.println("]}");
		} catch (Exception e) {
				e.printStackTrace();
		}
	}
	
	public static void jsonFile(JsonGenerator jGenerator,String field) {
		try {
			jGenerator.writeFieldName(field);//"field":
			jGenerator.writeStartArray();//[
		
			System.out.println("enter the number type you want");
			int n=Utility.getInteger();
			int count=0;
			while(n>count) {
				System.out.println("enter the name:");
				String name=Utility.getString();
				System.out.println("enter the Weight:");
				int weight =Utility.getInteger();
				System.out.println("enter the Price:");
				int price =Utility.getInteger();
				jGenerator.writeStartObject();//{
				jGenerator.writeStringField("name:", name); // "name" : "Satya"
				jGenerator.writeNumberField("weight:", weight); //
				jGenerator.writeNumberField("price:", price);
				jGenerator.writeEndObject(); // }
				count++;
			}
		
			jGenerator.writeEndArray(); // ]
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
	}

}
