package com.learning.api.jackson;

public class UserDetails {
	
	private String userName;
	private String firstName;
	private String lastName;
	private String emailID;
	private Address address;
	private PhoneNo[] phoneNo;
	
	
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public PhoneNo[] getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(PhoneNo[] phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
	
	

}
