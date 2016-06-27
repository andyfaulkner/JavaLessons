package dayOne;

import java.util.Scanner;

/**
 * Created by student on 27-Jun-16.
 */
public class binaryProgram {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String binary = input.nextLine();

        binaryValue(binary);

    }

    static void binaryValue(String binary){

        int total = 0, mul = 1;

        for(int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                total += mul;
            }
            mul = mul * 2;
        }
        System.out.print(total);
    }
}
