package dayTwo.AddressBookProgram;

import java.util.Objects;
import java.util.Scanner;

/**
 * Created by student on 28-Jun-16.
 */
public class Program {

    static AddressBook book = new AddressBook();

    public static void main(String[]args) {

//        book.addNewContact("Andy", "Faulkner", new Address("Hill Top Farm", "Frodsham", "Cheshire", "WA6 6TA"), "07779025430", "andy@andy.com");
//        book.addNewContact("Will", "Davies", new Address("123 This Street", "This Town", "This City", "N16 9PQ"), "0207666666", "will@this.com");
        System.out.println("Welcome to BOOM address book");
        menu();

    }

    static void menu(){
        int choice;
        do {
            System.out.println("----- Menu -----");
            System.out.println("1. Add a new contact");
            System.out.println("2. Edit a contact");
            System.out.println("3. Sort contacts");
            System.out.println("4. Remove a contact");
            System.out.println("5. Display the address book");
            System.out.println("6. Exit");
            System.out.println("Choose an option: ");

            Scanner s = new Scanner(System.in);
            choice = Integer.parseInt(s.nextLine());


        } while (choice < 1 || choice > 6);
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
                    displayAddressBook();
                    break;
                case  6:
                    break;
                default :
                    break;
            }
        }
    }

    static void editContact() {
        System.out.println("Enter first name of contact to edit: ");
        String contactSearch;
        Scanner scan = new Scanner(System.in);
        contactSearch = scan.nextLine();
            for (Contact c : book.getContact()) {
                if (c != null) {
                    if (Objects.equals(contactSearch, c.getPerson().getFirstName())) {
                        Contact temp = inputScreen();


                    }
                }

            }
        menu();
    }

    static Contact inputScreen(){

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

        Contact temp = new Contact(new Person(firstName, lastName), new Address(data[0], data[1], data[2], data[3]), phoneNumber, email);

        return temp;
    }

    static void getDetails(){

        Contact temp;
        temp = inputScreen();
        book.addNewContact(temp);

        menu();
    }

    static void displayAddressBook(){
        for (Contact c : book.getContact()) {
            if (c != null) {
                System.out.println("First name: " + c.getPerson().getFirstName());
                System.out.println("Last name: " + c.getPerson().getLastName());
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("Telephone number: " + c.getPhoneNumber());
                System.out.println("Email: " + c.getEmail());
                System.out.println("-----------------");
            }
        }
        menu();
    }

}

