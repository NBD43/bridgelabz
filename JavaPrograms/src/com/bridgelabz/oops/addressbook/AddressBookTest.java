/******************************************************************************
 * 
 *  
 *  Purpose: To perform Address Book operations.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   03-06-2019
 *
 ******************************************************************************/
package com.bridgelabz.oops.addressbook;

import java.io.File;
import java.io.IOException;

import com.bridgelabz.utilpackage.Utility;

public class AddressBookTest {
	static String path="/home/bridgeit/eclipse-workspace/JavaPrograms/src/com/bridgelabz/oops/addressmanagement/";

	public static void main(String[] args) throws IOException {
		String firstName,lastName;
		AddressBookFunction manager= new AddressBookFunction();
		int repeat=1;
		while(repeat==1) {
			System.out.println("========Welcome to NBD Address Book=====");
			System.out.println("1.Create new Address Book\n2.Add People to Contact\n.3.Modify Address Book\n4.Exit");
			System.out.println("Enter the choice:");
			int choice = Utility.getInteger();
			switch(choice) {
			case 1:
				System.out.println("Enter the New AddressBook");
				String addressBookName=Utility.getString();
				if(AddressBookFunction.createAddressBook(addressBookName)) {
					System.out.println("Address book created...");
				}else {
					System.out.println("Address book is aready present..");
				}
				break;
				
			case 2:
				manager.printFileName();
				System.out.println("Enter the File Name:");
				addressBookName=Utility.getString();
				System.out.println("Enter the First Name:");
				firstName=Utility.getString();
				System.out.println("Enter the Last Name:");
				lastName=Utility.getString();
				AddressBookFunction.addPersonToContact(addressBookName,firstName,lastName);
				break;
			case 3:
				manager.printFileName();
				System.out.println("Enter the File Name");
				addressBookName=Utility.getString();
				boolean exist=new File(path+addressBookName).exists();
				long fileLength= new File(path+addressBookName).length();
				if(exist==false||fileLength==0) {
					System.out.println("Invalid choice");
				}else {
					System.out.println("==========Content of AddressBook============");
					AddressBookFunction.createAddressBook(addressBookName);
					System.out.println("1.Edit Contact\n2.Delete Contact\n3.Sort By\n4.Display 5.Exit");
					System.out.println("Enter the choice");
					choice=Utility.getInteger();
					switch(choice) {
					case 1:
						System.out.println("Enter the FirstName");
						firstName=Utility.getString();
						manager.editPerson(firstName,addressBookName);
						break;
					case 2:
						System.out.println("Enter the FirstName");
						firstName=Utility.getString();
						manager.delete(firstName,addressBookName);
						break;
					case 3:
						System.out.println("1.sort by Name\n2.sort by Zip\n Enter the choice:");
						choice=Utility.getInteger();
						if(choice==1) {
							manager.sortByName(addressBookName);
						}
						if(choice==2) {
							manager.sortByZip(addressBookName);
						}
						break;
					case 4:
						System.out.println("Enter the FirstName");
						firstName=Utility.getString();
						manager.print(addressBookName,firstName);
						break;
					case 5:
						System.exit(0);
					}
				}
				break;
			case 4:
				System.out.println("Exit");
				System.exit(0);
			}
			
		}
		System.out.println("press 1 to continue");
		repeat=Utility.getInteger();
		

	}

	

}
