package dayTwo.Example;

/**
 * Created by student on 28-Jun-16.
 */
public class PersonCreation {

    final static Person alex = new Person();
    final static Person john = new Person("John", "Doe");

    static void setPerson(){
        alex.setFirstName("Alex");
        alex.setLastName("Kennedy");
    }


}
