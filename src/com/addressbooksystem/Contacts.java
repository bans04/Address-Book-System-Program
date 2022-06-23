package com.addressbooksystem;

public class Contacts {
	String fName;
	String lName;
	String address;
	String city;
	String state;
	long zip;
	long phoneNo;
	String eMail;
	
	public Contacts() {
	}
	
	/*public Contacts(String fName, String lName, String address, String state, String city, long zip, long phoneNo, String eMail) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.address = address;
		this.state = state;
		this.city = city;
		this.zip = zip;
		this.phoneNo = phoneNo;
		this.eMail = eMail;
		
		
	}*/

	@Override
	public String toString() {
		return "Contacts [fName=" + fName + ", lName=" + lName + ", address=" + address + ", city=" + city + ", zip="
				+ zip + ", phoneNo=" + phoneNo + ", eMail=" + eMail + "]";
	}
}
