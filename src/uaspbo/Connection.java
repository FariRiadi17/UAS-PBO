/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uaspbo;
import java.sql.*;
/**
 *
 * @author riadi
 */
public class Connection {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/uas-pbo";
    static final String USER = "root";
    static final String PASS = "";
    
    public static java.sql.Connection conn;
    public static Statement stmt;
    public static ResultSet rs;

    public static java.sql.Connection koneksi()
    {
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            return conn;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return conn;
    }
}
