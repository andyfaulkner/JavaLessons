package dayFour.CouponApp;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
/**
 * Created by student on 30-Jun-16.
 */
public class CouponAppProgram {

    JFrame mainFrame;
    JPanel panel;
    JButton saveButton;
    JComboBox couponPicker;



    public CouponAppProgram(){

        mainFrame = new JFrame("Coupon App");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(400,100);
        mainFrame.setResizable(false);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setBackground(Color.CYAN);

        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setSize(400,100);
        panel.setBackground(Color.GRAY);

        couponPicker = new JComboBox(getFileData());
        panel.add(couponPicker, BorderLayout.WEST);


        saveButton = new JButton("Save to File");
        saveButton.addActionListener(event -> {
                    String dataForFile = (String) couponPicker.getSelectedItem();
                    writeToFile(dataForFile);
                    JOptionPane.showMessageDialog(null, "Item saved to file");
                }

        );

        panel.add(saveButton, BorderLayout.EAST);
        mainFrame.add(panel);
        mainFrame.setVisible(true);
    }

    public static void main (String [] args){

        new CouponAppProgram();
    }

    public String[] getFileData(){

        Scanner fileReader = new Scanner(getClass().getResourceAsStream("data.txt"));
        int count = 0;
        String[] st = new String[6];
        while (fileReader.hasNextLine()){
            st[count] = fileReader.nextLine();
            count++;
        }
        fileReader.close();
        return st;
    }

    static void writeToFile(String st) {
        try {
            FileWriter fw = new FileWriter("coupon.txt");

            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(st);
            bw.close();
        } catch (IOException ex) {
            System.out.println("Error writing to file: " + ex);
        }
    }
}

