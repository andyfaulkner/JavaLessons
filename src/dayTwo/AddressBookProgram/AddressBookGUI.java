package dayTwo.AddressBookProgram;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Andy on 6/30/2016.
 */
public class AddressBookGUI extends JFrame {

    //Global variable declaration
    JFrame mainFrame;
    JPanel panelAddress, panelControls;
    JMenuBar menuBar;
    JButton btnNext, btnPrevious, btnSave;
    JTextArea txtFirstName, txtLastName, txtStret, txtCity, txtCounty, txtPostcode, txtTelephoneNumber, txtEmail;
    JMenu fileMenu, editMenu, sortMenu;
    JMenuItem openDatabase, addAddress, sortSubMenuLast, sortSubMenuFirst;

    //constructor to call all the methods to display the gui
    public AddressBookGUI(){

        mainWindowConfig();

    }


    //Setup for the main window for the application
    public void mainWindowConfig(){
        mainFrame = new JFrame("Address Book Application");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(380,360);
        mainFrame.setResizable(false);
        mainFrame.setLocationRelativeTo(null);

        //Call the methods to create the different sections
        menuBarConfig();
        addressPanelConfig();
        controlPanelConfig();

        //add the panels to the frame
        mainFrame.add(menuBar, BorderLayout.NORTH);
        mainFrame.add(panelAddress, BorderLayout.CENTER);
        mainFrame.add(panelControls,  BorderLayout.SOUTH);

        //set everything to visible
        mainFrame.setVisible(true);
    }

    //Setup for the top menu bar
    public void menuBarConfig() {
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        menuBar.add(fileMenu);
        openDatabase = new JMenuItem("Open Address Book");
        fileMenu.add(openDatabase);
        editMenu = new JMenu("Edit");
        addAddress = new JMenuItem("Add New Address");
        addAddress.addActionListener(event -> {
            //event to be added for the add address function
            addAddressMethod();
        });
        editMenu.add(addAddress);
        sortMenu = new JMenu("Sort by Last Name");
        sortSubMenuFirst = new JMenuItem("Sort by First Name");
        sortSubMenuFirst.addActionListener(event -> {
            //Sort by first name function to be added
        });
        editMenu.add(sortMenu);
        sortMenu.add(sortSubMenuFirst);
        sortSubMenuLast = new JMenuItem("Sort by Last Name");
        sortSubMenuLast.addActionListener(event -> {
            //event to be added for the sort address by last name function
        });
        sortMenu.add(sortSubMenuLast);

        menuBar.add(editMenu);

    }

    //setup fro the address panel
    public void addressPanelConfig(){
        panelAddress = new JPanel(new GridLayout(8,2,15,15));
        panelAddress.setSize(380,300);
        panelAddress.setBackground(Color.lightGray);

        JLabel lblFirstName = new JLabel("First Name: ");
        panelAddress.add(lblFirstName);
        txtFirstName = new JTextArea();
        panelAddress.add(txtFirstName);

        JLabel lblLastName = new JLabel("Last Name: ");
        panelAddress.add(lblLastName);
        txtLastName = new JTextArea();
        panelAddress.add(txtLastName);

        JLabel lblStreet = new JLabel("Street: ");
        panelAddress.add(lblStreet);
        txtStret = new JTextArea();
        panelAddress.add(txtStret);

        JLabel lblCity = new JLabel("City: ");
        panelAddress.add(lblCity);
        txtCity = new JTextArea();
        panelAddress.add(txtCity);

        JLabel lblCounty = new JLabel("County: ");
        panelAddress.add(lblCounty);
        txtCounty = new JTextArea();
        panelAddress.add(txtCounty);

        JLabel lblPostcode = new JLabel("Postcode: ");
        panelAddress.add(lblPostcode);
        txtPostcode = new JTextArea();
        panelAddress.add(txtPostcode);

        JLabel lblTelephone = new JLabel("Telephone Number: ");
        panelAddress.add(lblTelephone);
        txtTelephoneNumber = new JTextArea();
        panelAddress.add(txtTelephoneNumber);

        JLabel lblEmail = new JLabel("Email: ");
        panelAddress.add(lblEmail);
        txtEmail = new JTextArea();
        panelAddress.add(txtEmail);

    }

    //setup for the control panel
    public void controlPanelConfig(){
        panelControls = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panelControls.setSize(400, 50);
        panelControls.setBackground(Color.lightGray);
        btnPrevious = new JButton("<< Previous");
        btnPrevious.addActionListener(event -> {
            //previous record button function
        });
        panelControls.add(btnPrevious);
        btnNext = new JButton("Next >>");
        btnNext.addActionListener(event -> {
            //next button function
        });
        panelControls.add(btnNext);
        btnSave = new JButton("Save Contact");
        btnSave.addActionListener(event -> {
            //record save function to be added
            btnPrevious.setVisible(true);
            btnNext.setVisible(true);
            btnSave.setVisible(false);
        });
        btnSave.setVisible(false);
        panelControls.add(btnSave);

    }

    public void addAddressMethod(){

        btnPrevious.setVisible(false);
        btnNext.setVisible(false);
        btnSave.setVisible(true);
        txtFirstName.setText("");
        txtLastName.setText("");
        txtStret.setText("");
        txtCity.setText("");
        txtCounty.setText("");
        txtPostcode.setText("");
        txtTelephoneNumber.setText("");
        txtEmail.setText("");
    }

}
