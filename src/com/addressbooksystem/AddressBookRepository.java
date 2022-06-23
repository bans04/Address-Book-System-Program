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
		for(Contacts contact : contactsList) {
			if(contact.fName.equals(fName)) {
				contact1 = contact;
			}
		}
		System.out.println(contact1);
		return contact1;
	}
	
	public void showsContacts() {
		for(Contacts contact : contactsList) {
			System.out.println(contact);
		}
	}
}
