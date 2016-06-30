package dayFour.ProductExample;

import java.sql.*;
import static dayFour.ProductExample.ProductGUI.bookList;

/**
 * Created by student on 30-Jun-16.
 */
public class mySQLdb {
    Connection conn;
    Statement statement;
    ResultSet rs = null;

    mySQLdb(Connection connection){ this.conn = connection; }

    private void createTable(Statement statement) throws SQLException{
        statement.executeUpdate("CREATE TABLE Books ("
                + "Id INTEGER NOT NULL AUTO_INCREMENT,"
                + "Title VARCHAR(40) NOT NULL,"
                + "Author VARCHAR(40) NOT NULL,"
                + "Synopsis VARCHAR(100) NOT NULL,"
                + "Price DOUBLE NOT NULL,"
                + "PRIMARY KEY (ID))");
    }

    private void CreateBookList() throws SQLException{

        for(Books b : bookList) {
            PreparedStatement statement = conn.prepareStatement("INSERT INTO " +
                    "Books (title, author, synopsis, price)" +
                    "Values (?,?,?,?)");

            statement.setString(1, b.getTitle());
            statement.setString(2, b.getAuthor());
            statement.setString(3, b.getSynopsis());
            statement.setDouble(4, b.getPrice());

            statement.executeUpdate();
            statement.close();
        }
    }

    public void createDatabaseTables() throws SQLException {
        Statement statement = conn.createStatement();
        createTable(statement);
        statement.close();
        CreateBookList();
    }
}
