package dayThree.factoryPattern;

/**
 * Created by student on 29-Jun-16.
 */
public class Husky extends Dog implements Robotic {

    @Override
    public void speak() {
        System.out.println("Husky speaks!");
    }

    @Override
    public Object trackObject() {
        return null;
    }

    @Override
    public void remoteControl() {

    }
}
