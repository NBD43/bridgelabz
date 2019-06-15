/******************************************************************************
 * 
 *  
 *  Purpose: Pojo Of PhoneNumber.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   03-06-2019
 *
 ******************************************************************************/
package com.bridgelabz.oops.addressbook;

public class PhoneNumber {
private long mobileNumber;

public long getMobileNumber() {
	return mobileNumber;
}

public void setMobileNumber(long mobileNumber) {
	this.mobileNumber = mobileNumber;
}

@Override
public String toString() {
	return "PhoneNumber [mobileNumber=" + mobileNumber + "]";
}

}
