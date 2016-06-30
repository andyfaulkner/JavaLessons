package dayTwo.AddressBookProgram;



/**
 * Created by student on 28-Jun-16.
 */
public class AddressBook {
    public static Contact[] contacts = new Contact [100];
    int counter = 0;


    public void addNewContact(Contact contact){
        contacts[counter + 1] = contact;
        counter++;
    }

    public Contact[] getContact(){
        return contacts;
    }

    public void sortByFirstName(){

    }

}
