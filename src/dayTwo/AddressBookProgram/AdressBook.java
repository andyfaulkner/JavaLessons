package dayTwo.AddressBookProgram;

/**
 * Created by student on 28-Jun-16.
 */
public class AdressBook {
    private Contact[] contacts = new Contact [100];
    int counter = 0;


    public void addNewContact(String firstName, String lastName, Address address, String phoneNumber, String email){
        contacts[counter + 1] = new Contact(new Person(firstName, lastName), address, phoneNumber, email);
        counter++;
    }

    public Contact[] getContact(){
        return contacts;
    }


}
