package maryada;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class d5p2 {  public static void main(String []args) throws  SQLException{
    String url = "jdbc:mysql://localhost:3306/jdbc";
    String username = "root";
    String password = "root";

    Connection connection = DriverManager.getConnection(url,username,password);
    System.out.println("Connected: "+connection);

    Statement statement = connection.createStatement();

    statement.executeUpdate("INSERT INTO students VALUES (1,'Maryada',22)");

}

}
