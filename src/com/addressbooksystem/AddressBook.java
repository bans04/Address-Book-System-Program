package com.addressbooksystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	Contacts contacts = new Contacts();
	ArrayList<Contacts> contactsList = new ArrayList<>();
	
	public void addContacts() {
		 System.out.println("Enter the contacts details:-> ");
		 Scanner sc = new Scanner(System.in);
		 
	     System.out.print("Enter First Name : ");
	     contacts.fName = sc.nextLine();

	     System.out.print("Enter Last name : ");
	     contacts.lName= sc.next();
	        
	     System.out.print("Enter Address:-> ");
	     contacts.address = sc.next();

	     System.out.print("Enter City name:-> ");
	     contacts.city = sc.next();

	     System.out.print("Enter State name:-> ");
	     contacts.state = sc.next();

	     System.out.print("Enter pin number:-> ");
	     contacts.zip = sc.nextLong();

	     System.out.print("Enter Phone No:-> ");
	     contacts.phoneNo = sc.nextLong();

	     System.out.print("Enter Email ID:-> ");
	     contacts.eMail = sc.next();
	     
	     contactsList.add(contacts);
	}
}
