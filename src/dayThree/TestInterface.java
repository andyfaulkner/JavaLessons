package dayThree;

/**
 * Created by student on 29-Jun-16.
 */
interface Callback
{
    void callback(int param); //no implementation
}

class Client implements Callback
{
    @Override
    public void callback(int param) {
        System.out.println("Callback with limo");
    }
}

class AnotherClient implements Callback
{
    @Override
    public void callback(int param) {
        System.out.println("Callback without limo");
    }
}

public class TestInterface {

}
