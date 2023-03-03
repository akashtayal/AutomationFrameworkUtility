package com.learning.api.jackson;

public class UserDetailsPOJO {
	
	private String userName;
	private String firstName;
	private String lastName;
	private String emailID;
	private AddressPOJO address;
	private PhoneNoPOJO[] phoneNo;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public AddressPOJO getAddress() {
		return address;
	}
	public void setAddress(AddressPOJO address) {
		this.address = address;
	}
	public PhoneNoPOJO[] getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(PhoneNoPOJO[] phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
	
	

}
