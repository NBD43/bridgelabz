/******************************************************************************
 * 
 *  
 *  Purpose: To perform ClinicManagement operations.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   03-06-2019
 *
 ******************************************************************************/
package com.bridgelabz.oops.cliniquemanagement;

import java.util.Date;


import com.bridgelabz.utilpackage.Utility;

public class ClinicManagement {
	static Date date;
	public static void main(String []args) {
		int choice=0;
		do {
			System.out.println("===========Clinic Management==========");
			System.out.println("1.Add Doctor or patient\n2.search the Doctor\n3.Display Details\n4.Exit ");
			System.out.println("Enter the choice:");
			choice=Utility.getInteger();
			switch (choice) {
			case 1:
				new DoctorPatientImplementation().operarion();
				break;
			case 2:
				new SearchingImplementation().operation();
				break;
			case 3:
				new InformationDisplayImplementation().operation();
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Invalid choice");
				break;
			
			}
			
		}while(choice<5);
		
	}

}
