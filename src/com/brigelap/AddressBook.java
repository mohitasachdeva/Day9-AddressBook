package com.brigelap;
import java.io.*;
import java.util.Scanner;
public class AddressBook {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(" Welcome to the Address Book Programme");
        Contacts contact = addContact();
        System.out.println(contact);
        //Contacts editedContact = editContact(contact);
        //System.out.println(editedContact);
    }

    private static Contacts addContact() {
        Contacts contact = new Contacts();
        System.out.println("Enter first name:");
        contact.setFirstName(scanner.next());
        System.out.println("Enter last name:");
        contact.setLastName(scanner.next());
        System.out.println("Enter address:");
        contact.setAddress(scanner.next());
        return contact;
    }

   // private static Contacts editContact(Contacts contact) {
     //   System.out.println("Edit first name");
       // contact.setFirstName(scanner.next());
        //return contact;
    }


