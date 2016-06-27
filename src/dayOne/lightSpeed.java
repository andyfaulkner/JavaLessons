package dayOne;

/**
 * Created by student on 27-Jun-16.
 */
public class lightSpeed {

    public static void main(String[] args){

        int lightSpeed;
        long days;
        long seconds;
        long distance;

        lightSpeed = 186282;
        days = 7;
        seconds = days * 24 * 60 * 60;

        distance =  lightSpeed * seconds;

        System.out.println("In " + days);
        System.out.println(" days  light will travel about....");
        System.out.println(distance + " miles.");
    }
}
