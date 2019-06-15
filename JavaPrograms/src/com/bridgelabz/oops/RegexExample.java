/******************************************************************************
 * 
 *  
 *  Purpose: To perform validations on diffrent fields.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   30-05-2019
 *
 ******************************************************************************/package com.bridgelabz.oops;

import com.bridgelabz.utilpackage.Utility;

public class RegexExample {

	public static void main(String[] args) {
		
		String name = null, fullName = null, date = null,mobile=null;
		String msg = "Hello <<name>>, We have your full\n"
				+ "name as <<full name>> in our system. your contact number is 91-XXXXXXXXXX.\n"
				+ "Please,let us know in case of any clarification Thank you BridgeLabz XX/XX/XXXX.";
		System.out.println("Enter the First Name:");
		name=Utility.getString();
		System.out.println("Enter The Full Name:");
		fullName=Utility.getString();
		System.out.println("Enter the Mobile Number:");
		mobile=Utility.getString();
		System.out.println("Enter the date:");
		date=Utility.getString();
		System.out.println("===================Orignal Message================");
		System.out.println(msg);
		System.out.println();
		if (Utility.validateName(name)) {
			msg = msg.replaceAll("<<name>>", name);
		}
		if(Utility.validateFullName(fullName)) {
			msg=msg.replaceAll("<<full name>>", fullName);
		}
		if(Utility.validatemobileNumber(mobile)) {
			msg=msg.replaceAll("XXXXXXXXXX",mobile);
		}
		if(Utility.validateDate(date)) {
			msg=msg.replaceAll("XX/XX/XXXX", date);
		}
		 
		System.out.println("===================Modified Message================");
		System.out.println(msg);
		System.out.println();
	}

}
