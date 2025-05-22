package maryada;

import java.sql.*;
import java.util.Scanner;

public class d5p6 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String username = "root";
        String password = "root";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID to delete: ");
        int id = sc.nextInt();

        String selectSql = "SELECT * FROM STUDENTS WHERE ID=?";
        String deleteSql = "DELETE FROM STUDENTS WHERE ID=?";

        try (
                Connection connection = DriverManager.getConnection(url, username, password);
                PreparedStatement selectStmt = connection.prepareStatement(selectSql);
                PreparedStatement deleteStmt = connection.prepareStatement(deleteSql)
        ) {

            selectStmt.setInt(1, id);
            ResultSet rs = selectStmt.executeQuery();

            if (rs.next()) {
                System.out.println("Student Found:");
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Age: " + rs.getInt("age"));

                System.out.print("Are you sure you want to delete this record? (yes/no): ");
                sc.nextLine();  // consume leftover newline
                String confirmation = sc.nextLine();

                if (confirmation.equalsIgnoreCase("yes")) {
                    deleteStmt.setInt(1, id);
                    int rowsAffected = deleteStmt.executeUpdate();
                    if (rowsAffected > 0) {
                        System.out.println("Deleted successfully.");
                    } else {
                        System.out.println("Error occurred while deleting.");
                    }
                } else {
                    System.out.println("Deletion cancelled.");
                }
            } else {
                System.out.println("No student found with ID: " + id);
            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }

        sc.close();
    }
}
