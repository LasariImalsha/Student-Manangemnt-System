package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    // 1 rule
    private static DBConnection dbConnection = null;
    private Connection connection;

    //2 rule
    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ijse", "root", "1234");
    }

    // 3 rule
    public static DBConnection getInstance() throws SQLException, ClassNotFoundException {
        /*if (dbConnection == null) {
            dbConnection = new DBConnection();
        }
        return dbConnection;*/
        return (dbConnection==null)? dbConnection= new DBConnection(): dbConnection;
    }

    public Connection getConnection() {
        return connection; // DBConnection.getInstance().getConnection();
    }
}
