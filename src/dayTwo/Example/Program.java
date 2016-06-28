package dayTwo.Example;

import java.util.ArrayList;
import java.util.Collection;

import static dayTwo.Example.PersonCreation.*;

/**
 * Created by student on 28-Jun-16.
 */
public class Program {

    public static void main(String[] args){

        Collection<Person> people = new ArrayList<>();
        people.add(alex);
        PersonCreation.setPerson();
        people.add(john);

        for (Person p : people)
        {
            System.out.println(p);
        }

    }
}
