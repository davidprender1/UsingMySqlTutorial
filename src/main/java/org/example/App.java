package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/usingMySqlTutorial";  // Change 'testdb' if needed
        String username = "root";  // Your MySQL username
        String password = "password";      // Your MySQL password (blank if none)

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected successfully!");
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
}
