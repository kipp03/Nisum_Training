package maryada;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class d5p5 {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String username = "root";
        String password = "root";
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID to update: ");
        int id = sc.nextInt();

        String sql = "UPDATE STUDENTS SET NAME = 'Samarth' WHERE ID = ?";

        try (
                Connection connection = DriverManager.getConnection(url, username, password);
                PreparedStatement statement = connection.prepareStatement(sql)
        ) {
            statement.setInt(1, id);

            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Updated successfully.");
            } else {
                System.out.println("ID not found.");
            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }

        sc.close();
    }
}
