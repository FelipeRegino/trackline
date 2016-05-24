package helpers;

import java.sql.*;

/**
 *
 * @author Felipe
 */
public class MyConnect {
    public static Connection connection;
    
    public MyConnect() throws ClassNotFoundException, SQLException {
        
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost/locationdatabase", "root", "");
        System.out.println("Conexão com banco de dados realizada");
    }
    
    public static void main(String[] args) {
        try {
            new MyConnect();
        } catch (Exception e) {
            System.out.println("ERRO de conexão: " + e);
        }
    }
}
