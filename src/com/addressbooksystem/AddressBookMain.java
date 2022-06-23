package com.addressbooksystem;
/*
 * ---------------------------Address Book System---------------------------
 * 
 * @Dnyandeo Bansode
 * 
 * */
public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("---------------------------Welcome to Address Book System Program---------------------------");
		AddressBook addressBook = new AddressBook();
		addressBook.addContacts();
	}
}
