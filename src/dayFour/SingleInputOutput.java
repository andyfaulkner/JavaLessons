package dayFour;

import java.io.*;
import java.util.Scanner;

/**
 * Created by student on 30-Jun-16.
 */
public class SingleInputOutput {

    public static void main(String [] args){

//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter a String: ");
//
//        String str = input.nextLine();
//        System.out.println("Using Scanner: " + str);

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String st = null;
//        try {
//            st = br.readLine();
//            writeToFile(st);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("Using InputStreamReader: " + st);
        SingleInputOutput si = new SingleInputOutput();
        si.readFromFile();
    }

    static void writeToFile(String st) {
        System.out.println(System.getProperty("user.dir"));
        try {
            FileWriter fw = new FileWriter("result.txt");

            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(st);
            bw.close();
        } catch (IOException ex) {
            System.out.println("Error writing to file: " + ex);
        }
    }

    void readFromFile(){
        Scanner fileReader = new Scanner(getClass().getResourceAsStream("result.txt"));

        while (fileReader.hasNextLine()){

            String st = fileReader.nextLine();
            System.out.println(st);
        }
        fileReader.close();
    }
}
