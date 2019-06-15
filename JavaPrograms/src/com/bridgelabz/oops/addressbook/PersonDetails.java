/******************************************************************************
 * 
 *  
 *  Purpose: Pojo class of PersonDetails.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   03-06-2019
 *
 ******************************************************************************/
package com.bridgelabz.oops.addressbook;

public class PersonDetails {
	private String firstName;
	private String lastName;
	private Address address;
	private PhoneNumber phoneNumber;
	@Override
	public String toString() {
		return "PersonalDetails [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	

}
