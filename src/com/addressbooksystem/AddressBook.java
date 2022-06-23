package com.addressbooksystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	Contacts contacts = new Contacts();
	//ArrayList<Contacts> contactsList = new ArrayList<>();
	AddressBookRepository addressBookRepository = new AddressBookRepository();
	Scanner sc = new Scanner(System.in);
	
	public void addContacts() {
		 System.out.println("Enter the contacts details..| ");
		// Scanner sc = new Scanner(System.in);
		 
	     System.out.print("Enter First Name:-> ");
	     contacts.fName = sc.nextLine();

	     System.out.print("Enter Last name:-> ");
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
	     
	     addressBookRepository.addContacts(contacts);
	}
	
	public void showsContacts() {
		addressBookRepository.showsContacts();
	}
	
	public void editContacts() {
		System.out.print("Enter first name of Contacts that U want to Edit:-> ");
		String fName = sc.next();
		Contacts contact = addressBookRepository.getContacts(fName);
		
		System.out.print("Enter new First Name:-> ");
		contacts.fName = sc.next();
		
		System.out.print("Enter new Last Name:-> ");
		contact.lName = sc.next();
		
		System.out.print("Enter new Address:-> ");
		contact.address = sc.next();
		
		System.out.print("Enter new City Name:-> ");
		contact.city = sc.next();
		
		System.out.print("Enter new State Name:-> ");
		contact.state = sc.next();
		
		System.out.print("Enter new zip:-> ");
		contact.zip = sc.nextLong();
		
		System.out.print("Enter new Phone No:-> ");
		contact.phoneNo = sc.nextLong();
		
		System.out.print("Enter new E-Mail:-> ");
		contact.eMail = sc.next();
		
		addressBookRepository.addContacts(contact);
	}
}
