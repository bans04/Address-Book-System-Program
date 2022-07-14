package com.addressbooksystem;
import java.util.HashMap;
import java.util.Scanner;

/*
 * ---------------------------Address Book System---------------------------
 * Print Welcome Message
 * Uc1:-> Ability to create a Contacts in Address Book with first and last names, address, city, state, zip, phone number and email...
 * Uc2:-> Ability to add a new Contact to Address Book
 * Uc3:-> Ability to edit existing contact person using their name
 * Uc4:-> Ability to delete a person using person's name
 * Uc5:-> Ability to add multiple person to Address Book
 * Uc6:-> Refactor to add multiple Address Book to the System. Each Address Book has a unique Name
 * 
 * @Dnyandeo Bansode
 * 
 * */
public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("---------------------------Welcome to Address Book System Program---------------------------");
		AddressBookManagement addressBook = new AddressBookManagement();
		
		Scanner scanner = new Scanner(System.in);
		HashMap<String, AddressBookManagement> addressBookSystem = new HashMap<>();
		System.out.print("Enter Unique Addressbook Name:-> ");
		String addressBookNameAsKey = scanner.nextLine().toUpperCase();
		AddressBookManagement addressBookNameValue = new AddressBookManagement();

		/**
		 * addressBookNameAsKey - key , addressBookNameValue- value(can create multiple
		 * contact, edit, delete operation)
		 */
		addressBookSystem.put(addressBookNameAsKey, addressBookNameValue);
		
		while(true) {
			System.out.println("1.Add Contacts \n2.Shows Contacts \n3.Edit Contacts \n4.Delet Contacts");
			System.out.print("Enter Your Choice:-> ");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				addressBook.addContacts();
				break;
				
			case 2:
				addressBook.showsContacts();
				break;
				
			case 3:
				addressBook.editContacts();
				break;
				
			case 4:
				addressBook.deletContacts();
				break;
			}
		}
	}
}
