/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consultapp.Database;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
/**
 *
 * @author User
 */
public class DBConnect {
    public static void main(String[] args){
        try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbdoc","root","");
    System.out.println(con);    
        } catch (ClassNotFoundException | SQLException ex){
                Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
}
