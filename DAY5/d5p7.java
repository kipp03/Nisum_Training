package maryada;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.ResultSet;

public class d5p7 {

    public static void main(String []args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String username = "root";
        String password = "root";

        String sql = "SELECT * FROM STUDENTS where name LIKE 'SA%'";

        Connection connection = DriverManager.getConnection(url,username,password);
        PreparedStatement statement = connection.prepareStatement(sql);

        ResultSet res  = statement.executeQuery(sql);
        System.out.println(res);
        while(res.next()){
            int id = res.getInt("id");
            String name = res.getString("name");
            int age = res.getInt("age");

            System.out.println(id + ","+name + ","+age);
        }



    }
}