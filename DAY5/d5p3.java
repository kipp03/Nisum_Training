package maryada;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

public class d5p3 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String username = "root";
        String password = "root";


        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement();

             ResultSet rs = statement.executeQuery("SELECT * FROM students");

        ) {


            if (connection != null) {
                System.out.println("Connected to the database successfully.");
            }


            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double p = rs.getDouble("age");
                System.out.println(id + ", " + name + ", " + p);
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
}