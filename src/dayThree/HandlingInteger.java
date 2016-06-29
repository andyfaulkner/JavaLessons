package dayThree;

import java.util.Scanner;

/**
 * Created by student on 29-Jun-16.
 */
public class HandlingInteger {

    public static void main (String[] args){
        System.out.println("Enter a number between 1 and 10: ");
        int yourNum = 0;
        while (true){
            Scanner value = new Scanner(System.in);
            try {
                yourNum = Integer.parseInt(value.nextLine());
                if (yourNum > 10 || yourNum < 1){
                    throw new Exception("Your input isn't within the requested values");
                }
            } catch (NumberFormatException e){
                System.out.println("Invalid input");
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Your number is valid " + yourNum);
            break;
        }
    }
}
