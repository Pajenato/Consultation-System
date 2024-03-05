/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consultapp.db;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
/**
 *
 * @author User
 */
public class Database {
    public static Connection connect() {
        String driver = "com.mysql.cj.jdbc.Driver";
        String ipAddress = "127.0.0.1";
        String port = "3306";
        String dbName = "dbdoc";
        String dbUser = "rush";
        String dbPassword = "admin";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://" 
                    + ipAddress + ":" + port + "/" + dbName, dbUser, dbPassword);
            return con;
            
        } catch (ClassNotFoundException | SQLException ex){
                System.out.println(ex.getMessage());
//                Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        return null;
    }        
}
