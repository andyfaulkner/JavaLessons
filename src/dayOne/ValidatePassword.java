package dayOne;

import java.awt.*;
import javax.swing.*;

/**
 * Created by student on 27-Jun-16.
 */
public class ValidatePassword {

    JFrame mainFrame;
    JPanel panel;
    JButton btnValidate;
    JTextArea passwordText;

    boolean result;

    //constructor


    public ValidatePassword() {
        mainFrame = new JFrame("Password validation");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(400,100);
        mainFrame.setResizable(false);
        mainFrame.setLayout(new FlowLayout());
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setBackground(Color.CYAN);

        panel = new JPanel();
        panel.setSize(400,100);
        panel.setBackground(Color.GRAY);


        //add component to the panel
        passwordText = new JTextArea("",1,15);
        panel.add(passwordText, BorderLayout.WEST);

        btnValidate = new JButton("Validate");
        btnValidate.addActionListener(event -> {
            result = checkPassword(passwordText.getText());
            if(result) {
                JOptionPane.showMessageDialog(null, "Your password meets the requirements");
            } else {
                JOptionPane.showMessageDialog(null, "Your password doesn't meet the requirements");
            }
        });

        panel.add(btnValidate, BorderLayout.EAST);
        mainFrame.add(panel);
        mainFrame.setVisible(true);

    }

    public static void main(String[] args){

        new ValidatePassword();

    }

    static boolean checkPassword(String password){
        boolean lower = false;
        boolean upper = false;
        boolean special = false;
        boolean chkNumber = false;
        char[] chkPassword = password.toCharArray();
        if (chkPassword.length > 8){
            for (char c : chkPassword){
                if (Character.isUpperCase(c)){
                    upper = true;
                }else if (Character.isLowerCase(c)){
                    lower = true;
                } else if (Character.isDigit(c)){
                    chkNumber = true;
                } else if (c == '#' || c == '£' || c == '$' || c == '@' || c == '%'){
                    special = true;
                }
             }
        }
        return (lower && upper && special && chkNumber);
    }
}
