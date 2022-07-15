package com.addressbooksystem;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class AddressBookRepository {
	Set<Contacts> contactsList = new HashSet<>();
	
	public void addContacts(Contacts contacts) {
		contactsList.add(contacts);
	}
	
	public Contacts getContacts(String fName) {
		Contacts contact1 = null;
		if(contactsList.isEmpty()) {
			System.out.println("Contacts List is Empty..|");
		}else {
			for(Contacts contact : contactsList) {
				if(contact.fName.equals(fName)) {
					contact1 = contact;
				}else {
					System.out.println("Contact not found..|");
				}
			}
		}
			return contact1;
	}
	
	public void showsContacts() {
		if(contactsList.isEmpty()) {
			System.out.println("Address Book is Empty..|");
		}else {
			for(Contacts contact : contactsList) {
				System.out.println(contact);
			}
		}
	}
	
	public void removeContact(Contacts contact) {
		if(contactsList.isEmpty()) {
			System.out.println("Address Book is Empty..|");
		}else {
		contactsList.remove(contact);
		System.out.println(contact + " removed successfully..|");
		}
	}
	
	public boolean checkContacts(String fName) {
		for (Contacts contacts : contactsList) {
			if(contacts.fName.equals(fName)) {
				System.out.println("Contact allready present in contacts..|");
				System.out.println();
				return true;
			}
		}
		return false;
	}
	
	public void getPerson(String city) {
		System.out.println("Persons in " + city + " city:-> ");
		for (Contacts contacts : contactsList) {
			if(contacts.city.equals(city)) {
				System.out.print(contacts.fName + ", ");
			}else {
				System.out.println();
				System.out.println("No one person in " + city);
			}
		}System.out.println();
	}
	
	public void getPersonInState(String state) {
		System.out.println("Persons in " + state + " state:-> ");
		for (Contacts contacts : contactsList) {
			if(contacts.state.equals(state)) {
				System.out.print(contacts.state + ", ");
			}else {
				System.out.println();
				System.out.println("No one person in " + state);
			}
		}System.out.println();
	}
}
