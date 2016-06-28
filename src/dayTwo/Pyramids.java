package dayTwo;

import java.util.Scanner;

/**
 * Created by student on 28-Jun-16.
 */
public class Pyramids {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sizeOfPyramid = Integer.parseInt(input.nextLine());
        drawPyramid(sizeOfPyramid);
    }


    static void drawPyramid(int sizeOfPyramid) {
        int towerBuilder = 1;
        int towerHeight = sizeOfPyramid;

        for (int i = 0; i < sizeOfPyramid; i++) {
            for (int j = towerHeight; j > 0; j--) {
                System.out.print(' ');
            }
            for (int k = 0; k < towerBuilder; k++){
                System.out.print(towerBuilder + " ");
            }
            System.out.println();
            towerBuilder++;
            towerHeight--;
        }
    }

}