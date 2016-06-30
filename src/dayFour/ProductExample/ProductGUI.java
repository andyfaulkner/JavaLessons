package dayFour.ProductExample;

import static dayFour.ProductExample.BookGeneration.*;
import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 30-Jun-16.
 */
public class ProductGUI extends JFrame {

    private JTextField title, author, synopsis, price;
    private JButton btnPrevious, btnNext;
    public int bookIndex = 0;
    public static List<Books> bookList = new ArrayList<>();

    Connection conn;
    String username = "root";
    String password = "Password100";
    String url = "jdbc:mysql://localhost:3306/bookDatabase?UseSSL=false";

    ProductGUI() {
        super("Books List");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem newMenuItem = new JMenuItem("New");
        newMenuItem.addActionListener(event -> {
            displayBook(bookIndex);
        });

        fileMenu.add(newMenuItem);
        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        createComponents();

        setVisible(true);

        bookList.add(readyPlayerOne);
        bookList.add(bypass);
        bookList.add(lonFalling);

        JMenuItem dataDB = new JMenuItem("Create Database");
        dataDB.addActionListener(event -> {
            try{
                implementDb();
            } catch (Exception e){
                e.printStackTrace();
            }
        });
        fileMenu.add(dataDB);
    }



    public void createComponents() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));



        //field panel setup
        panel.add(createFieldComponents(), BorderLayout.CENTER);
        panel.add(createButtonComponents(), BorderLayout.SOUTH);

        setContentPane(panel);

    }

    public JPanel createButtonComponents() {
        JPanel btnPanel = new JPanel();
        btnPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

        btnPrevious = new JButton("Previous");
        btnPrevious.addActionListener(event -> {
            try{
                if(bookIndex < 0) {

                } else {
                    bookIndex--;
                    displayBook(bookIndex);
                }
            } catch (ArrayIndexOutOfBoundsException e){
                bookIndex = bookList.size() -1;
                displayBook(bookIndex);
            }
        });
        btnPanel.add(btnPrevious);

        btnNext = new JButton("Next");
        btnNext.addActionListener(event -> {
            if (bookIndex > bookList.size() -2) {
                bookIndex = 0;
                displayBook(bookIndex);
            } else {
                bookIndex++;
                displayBook(bookIndex);
            }
        });
        btnPanel.add(btnNext);

        return btnPanel;
    }

    public JPanel createFieldComponents(){
        JPanel feildpanel = new JPanel();
        feildpanel.setLayout(new GridLayout(4,2,5,5));

        feildpanel.add(new JLabel("Title"));
        title = new JTextField();
        feildpanel.add(title);

        feildpanel.add(new JLabel("Author"));
        author = new JTextField();
        feildpanel.add(author);

        feildpanel.add(new JLabel("Synopsis"));
        synopsis = new JTextField();
        feildpanel.add(synopsis);

        feildpanel.add(new JLabel("Price"));
        price = new JTextField();
        feildpanel.add(price);

        return feildpanel;
    }

    public void displayBook (int c){

        title.setText(bookList.get(c).getTitle());
        author.setText(bookList.get(c).getAuthor());
        synopsis.setText(bookList.get(c).getSynopsis());
        price.setText("£" + String.valueOf(bookList.get(c).getPrice()));

    }

    public void implementDb() throws Exception{
        //get the driver
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(url, username, password);
        new mySQLdb(conn).createDatabaseTables();
        conn.close();
    }

    public static void main (String [] args){
        new ProductGUI();
    }
}

