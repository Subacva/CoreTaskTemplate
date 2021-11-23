package jm.task.core.jdbc.util;



import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/database?autoReconnect=true&useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "qwe123";
    static Connection connection;

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}