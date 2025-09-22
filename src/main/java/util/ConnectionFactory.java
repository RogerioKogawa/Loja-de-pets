package main.java.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection getConnection() throws SQLException {
        String user = "rogerio";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/produtos_vendidos";
        return DriverManager.getConnection(url, user, password);
    }
}