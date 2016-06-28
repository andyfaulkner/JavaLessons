package dayTwo.AddressBookProgram;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by student on 28-Jun-16.
 */
public class Program {

    static AdressBook book = new AdressBook();

    public static void main(String[]args) {


        int choice;
        do {
            System.out.println("Welcome to BOOM address book");
            System.out.println("1. Add a new contact");
            System.out.println("2. Edit a contact");
            System.out.println("3. Sort contacts");
            System.out.println("4. Remove a contact");
            System.out.println("5. Exit");
            System.out.println("Choose an option: ");

            Scanner s = new Scanner(System.in);
            choice = Integer.parseInt(s.nextLine());


        } while (choice < 1 || choice > 5);
        {

            switch (choice) {
                case 1:
                    getDetails();
                    break;
                case 2:
                    editContact();
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case  5:

                    break;
            }
        }
    }

    static void editContact() {
        System.out.println("Enter first name of contact to edit: ");
        String contactSearch;
        Scanner scan = new Scanner(System.in);
        contactSearch = scan.nextLine();

        for (Contact c : book.getContact()){
            if (c.getPerson().getFirstName() == contactSearch){

            }
        }

    }

    static void getDetails(){
        String firstName, lastName, address, email, phoneNumber;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter first name: ");
        firstName = s.nextLine();

        System.out.println("Enter last name: ");
        lastName = s.nextLine();

        System.out.println("Enter address: ");
        address = s.nextLine();
        String[] data = address.split(",");

        System.out.println("Enter phone number: ");
        phoneNumber = s.nextLine();
        System.out.println("Enter email: ");
        email = s.nextLine();

        book.addNewContact(firstName, lastName, new Address(data[0], data[1], data[2], data[3]), phoneNumber, email);

        for (Contact c : book.getContact()) {
            if(c != null){
                System.out.println(c.getPerson().getFirstName());
            }
        }
    }

}

