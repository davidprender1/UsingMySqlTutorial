package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/usingMySqlTutorial"; // your database name
        String username = "root"; // your MySQL username
        String password = "password"; // your MySQL password

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected successfully!");

            // --------- Create a Table (CREATE action) ----------
            String createTableSQL = "CREATE TABLE IF NOT EXISTS student ("
                    + "id INT PRIMARY KEY AUTO_INCREMENT, "
                    + "name VARCHAR(50) NOT NULL, "
                    + "email VARCHAR(50) NOT NULL"
                    + ")";

            Statement stmt = conn.createStatement();
            stmt.execute(createTableSQL);
            System.out.println("Table 'student' created successfully!");

            // --------- End of CRUD action ----------

        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
}

