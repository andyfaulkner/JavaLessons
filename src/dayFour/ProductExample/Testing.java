package dayFour.ProductExample;
import org.junit.*;

import static dayFour.ProductExample.bookDatabase.generated.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

/**
 * Created by student on 01-Jul-16.
 */

public class Testing {

    Connection conn;
    String username = "root";
    String password = "Password100";
    String url = "jdbc:mysql://localhost:3306/bookDatabase?UseSSL=false";
    Statement statement;
    ResultSet rs;
    ResultSetMetaData metaData;


    public void connectToDB() throws Exception{
        //get the driver

    }

    @Test
    public void retrieveData() throws Exception {

        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(url, username, password);

//        //When
//        statement = conn.createStatement();
//        rs = statement.executeQuery("Select * from Books where title='Bypass Gemini'");
//
//        //Then
//        metaData = rs.getMetaData();
//
//        List<String> result = new ArrayList<>();
//        int colCount = metaData.getColumnCount();
//        int rowCount = 0;
//        while (rs.next()){
//            for (int i = 1; i <= colCount; i++){
//                String st = rs.getString(i);
//                result.add(st);
//            }
//            rowCount++;
//        }
//
//        //Now
//        Assert.assertEquals("Does not match", "7.99", result.get(4));
//        conn.close();



    }
}
