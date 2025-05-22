package maryada;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class d5p4 {

    public static void main(String []args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String username = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url,username,password);
        System.out.println("Connected: "+connection);

        PreparedStatement statement = connection.prepareStatement("INSERT INTO STUDENTS VALUES (2,'Shweta',21)");

        int rs =  statement.executeUpdate();

        System.out.println("Inserted Successfully"+rs);

    }
}