package dayThree.factoryPattern;

/**
 * Created by student on 29-Jun-16.
 */
public class DogProgramme {

    public static void main(String [] args){
        Dog dog1 = DogFactory.makeDog(dogBreed.HUSKY);
        dog1.bark();
        dog1.doubleCoat = true;
        Husky husky1 = (Husky) dog1;
        husky1.speak();

        Husky dog2 = (Husky) DogFactory.makeDog(dogBreed.HUSKY);
        dog1.bark();
        dog1.doubleCoat = true;

        dog2.speak();

    }
}
