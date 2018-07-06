package com.Securiter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Hello world to test programming is running, just a thing I do
        System.out.println("Hello world!");

        //create a new contact, initialise it and sysout in order to check it's properly working.
        Contact con1 = new Contact("Adi", "0756482160");
        System.out.println(con1.name);
        System.out.println(con1.phoneNum);

        //newline McNewLineson
        System.out.println(" ");

        //add more contacts
        Contact con2 = new Contact("Andrei", "0755555555");
        Contact con3 = new Contact("Martin", "0756482888");

        //create a new ContactsManager
        ContactsManager myConMan = new ContactsManager();

        //adding contacts to ContactsManager
        myConMan.addContact(con1);
        myConMan.addContact(con2);
        myConMan.addContact(con3);

        //searching for a contact and storing it in a variable
        Contact result = myConMan.searchContact("Andrei");
        Contact result2 = myConMan.searchContact("Martin");
        Contact result3 = myConMan.searchContact("Adi");

        //output searched contact's phone number
        System.out.println(result.phoneNum);
        System.out.println(result2.phoneNum);
        System.out.println(result3.phoneNum);


        BookBorrowed booky = new BookBorrowed("Adi", "Padureanu");

        booky.borrowBook();


        System.out.println(booky.isBookBorrowed());
        System.out.println(booky.isSameBook(booky));

        System.out.println("Enter your address: ");
        Scanner scanner = new Scanner(System.in);
        String address = scanner.nextLine();
        System.out.println("You live at: " + address);

        System.out.println("Enter your grade: ");
        Scanner scanner2 = new Scanner(System.in);
        int grade = scanner2.nextInt();
        if (grade > 90) {
            System.out.println("Wow! you did well!");
        } else {
            System.out.println("Not bad, but you can do better next time!");
        }

    }
}
