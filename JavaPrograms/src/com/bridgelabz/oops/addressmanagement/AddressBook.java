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
package com.bridgelabz.oops.addressmanagement;


import java.io.File;

import com.bridgelabz.utilpackage.*;


public class AddressBook {
	//@SuppressWarnings("static-access")
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws Exception {
		String firstName,lastName;
		AddressBookManager manager = new AddressBookManager(); // create object of addressbookManager class
		int repeat = 1;
		while (repeat == 1) {
			System.out.println("==============****WELCOME TO NBD ADDRESSBOOK***=====================");
			System.out.println("1.NEW ADDRESS BOOK\n2.ADD PERSON TO CONTACT \n3.ADDRESS BOOK MODIFICATION");
			int choice = Utility.getInteger(); // get user's choice
			switch (choice) {
			// to create address book
			case 1:
				System.out.println("Enter address book name");
				String addressBookName = Utility.getString();
				if (AddressBookManager.createAddressBook(addressBookName)) // call method to create new addressbook
					System.out.println("new Address Book created");
				else
					System.out.println("address book already created");
				break;
			// to add person in address book
			case 2:
				manager.printFileNames();
				System.out.println("Enter file Name::");
				addressBookName = Utility.getString();
				System.out.println("Enter person first name: ");
				firstName = Utility.getString();
				System.out.println("Enter person last name: ");
				lastName = Utility.getString();
				// to add new person to specified addressbook
				AddressBookManager.addPersonInAddressBook(addressBookName, firstName, lastName);
				break;
				// perform different operation on address book
			case 3:
				// manage
				manager.printFileNames();
				System.out.println("Enter File Name");
				addressBookName = Utility.getString();
				boolean exist = new File("/home/bridgeit/eclipse-workspace/JavaPrograms/src/com/bridgelabz/oops/addressmanagement/" + addressBookName).exists(); // check if file exists or not
				long fileLength = new File("/home/bridgeit/eclipse-workspace/JavaPrograms/src/com/bridgelabz/oops/addressmanagement/" + addressBookName).length();
				if (exist == false || fileLength == 0)
					System.out.println("invalid choice");
				else {
					// if file exists then print file data
					System.out.println("\ncontent of address book:");
					AddressBookManager.openAddressbook(addressBookName);
					System.out.println("1. to Edit person details\n2. to delete person\n3. to sort person by name and zip\n4. to print person details\n5. exit");
					choice = Utility.getInteger(); // get users choice
					switch (choice) {
					case 1:
						System.out.println("Enter person first name:");
						firstName = Utility.getString();
						manager.editPerson(firstName, addressBookName); // method to edit persons details
						break;
					// delete person
					case 2:
						System.out.println("Enter person first name:");
						firstName = Utility.getString();
						manager.delete(firstName, addressBookName); // method to delete data
						break;
					// sort person by name or by zip
					case 3:
						System.out.println("press 1. for sort by name and 2. for sort by zip:");
						choice = Utility.getInteger();
						if (choice == 1)
							manager.sortByName(addressBookName); // sort data by name
						if (choice == 2)
							manager.sortByZip(addressBookName); // sort data by zip
						break;
					// person details
					case 4:
						System.out.println("Enter First name of person ");
						firstName = Utility.getString();
						manager.print(addressBookName, firstName); // display data
						break;
					case 5:
						break;
					default:
						System.out.println("Invalid choice");
						break;
					}
				}
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
			System.out.println("To continue press 1 \n and for exit press any number ");
			repeat = Utility.getInteger();
		}
		if (repeat != 1) {
			System.out.println("Exit");
		}
	}
}
