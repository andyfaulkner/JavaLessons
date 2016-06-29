package dayTwo.AddressBookProgram;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 28-Jun-16.
 */
public class Contact {
    //this person reference to a single person in a single contact
    private Person p;
    private List<Address> addresses = new ArrayList<>();

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String phoneNumber;
    private String email;

    //set a contact with a single person and a single address
    public Contact(Person p, Address address, String phoneNumber, String email) {
        this.p = p;
        addresses.add(address);
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    //add an address from a collection
    public void addAddress (Address address){
        addresses.add(address);
    }
    //remove and address based on index number
    public void removeAddress (int index){
        addresses.remove(index);
    }

//    public String[][] getAddress(int c){
//        String[][] addressData = new String[3][4];
//        List<Address> singlePersonAddress = new ArrayList<>(addresses.get(c));
//        for (int i = 0; i < singlePersonAddress.size(); i++){
//            for (int j = 0; j < 4; j++){
//                singlePersonAddress[i][j] = singlePersonAddress.get(c);
//            }
//        }
//        return addressData;
//    }

    public Person getPerson(){
        return p;
    }
}
