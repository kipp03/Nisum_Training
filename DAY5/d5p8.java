package maryada;
import java.sql.SQLException;
import java.sql.*;



public class d5p8{
    public static void main(String[] args) throws  SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String username = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url, username, password);
        String query1 = "INSERT INTO ACCOUNTS VALUES (?,?,?)";
        String query2 = "INSERT INTO STUDENTS VALUES (?,?,?)";


        connection.setAutoCommit(false);
        try{
            PreparedStatement statement1 = connection.prepareStatement(query1);
            PreparedStatement statement2 = connection.prepareStatement(query2);
            statement1.setInt(1,1260);
            statement1.setString(2,"Maryada");
            statement1.setInt(3,5000);
            statement1.executeUpdate();
            System.out.println("1 ROW IS INSERTED IN TABLE ACCOUNTS ");

            statement2.setInt(1,1260);
            statement2.setString(2,"Maryada");
            statement2.setInt(3,21);
            statement2.executeUpdate();
            System.out.println("1 ROW IS INSERTED IN TABLE STUDENTS");




            connection.commit();

        }
        catch(Exception e){
            System.out.println("Transaction is commited");
            connection.rollback();
        }




    }
}
