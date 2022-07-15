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
		}
	}
	
	public boolean checkContacts(String fName) {
		for (Contacts contacts : contactsList) {
			if(contacts.fName.equals(fName)) {
				System.out.println("Contact allready present in contacts..|");
				return true;
			}
		}
		return false;
	}
}
