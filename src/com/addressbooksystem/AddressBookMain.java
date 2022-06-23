package com.addressbooksystem;

import java.util.Scanner;

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
		Scanner scanner = new Scanner(System.in);
		//addressBook.addContacts();
		
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
