package com.addressbooksystem;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookManagement {
	//Contacts contacts;
	//ArrayList<Contacts> contactsList = new ArrayList<>();
	AddressBookRepository addressBookRepository = new AddressBookRepository();
	Scanner sc = new Scanner(System.in);
	
	public void addContacts() {
		Contacts contacts = new Contacts();
		 System.out.println("Enter the contacts details..| ");
	     System.out.print("Enter First Name:-> ");
	     String fName = sc.next();
	     boolean isPresent = addressBookRepository.checkContacts(fName);
	     
	     if(isPresent != true) {
	    	 contacts.fName = fName;
	
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
		     System.out.println("Contact add successfully..|");
		     System.out.println();
	     }
	}
	
	public void showsContacts() {
		addressBookRepository.showsContacts();
	}
	
	public void editContacts() {
		System.out.print("Enter first name of Contacts that U want to Edit:-> ");
		String fName = sc.next();
		Contacts contact = addressBookRepository.getContacts(fName);
		
		System.out.print("Enter new First Name:-> ");
		contact.fName = sc.next();
		
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
	
	public void deletContacts() {
		System.out.print("Enter contacts first name that U want to Delet:-> ");
		String fName = sc.next();
		Contacts contact = addressBookRepository.getContacts(fName);
		addressBookRepository.removeContact(contact);
	}
	
	public void searchPersonInCity() {
		System.out.print("Enter city name in which you want to find person:-> ");
		String city = sc.next();
		addressBookRepository.getPerson(city);
	}
	
	public void searchPersonInState() {
		System.out.print("Enter state name in which you want to find person:-> ");
		String state = sc.next();
		addressBookRepository.getPersonInState(state);
	}
}
