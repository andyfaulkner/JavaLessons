package dayThree.factoryPattern;

/**
 * Created by student on 29-Jun-16.
 */
public class DogFactory {
    public static Dog makeDog(dogBreed breed){
        Dog dog = null;
        switch (breed){
            case HUSKY:
                dog = new Husky();
                break;
            case LABRADOR:
                dog = new Labrador();
                break;
        }
        return dog;
    }
}
