/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Octagram
 */
package consultationapp.database;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Database {

    private static Connection connection;
    private static PreparedStatement preparedStatement;
    private static ResultSet resultSet;

    // Constants for database configuration
    private static final String DATABASE_NAME = "dbdoc";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String IP_FILE_PATH = "C:\\Users\\Public\\IPadd.txt";

    // Method to establish database connection
    public static void connect() {
        try {
            String ipAddress = readIPAddressFromFile();
            if (ipAddress != null) {
                establishConnection(ipAddress);
            } else {
                configureDatabase();
            }
        } catch (IOException ex) {
            configureDatabase();
        }
    }

    // Method to read IP address from file
    private static String readIPAddressFromFile() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(IP_FILE_PATH))) {
            return reader.readLine();
        } catch (FileNotFoundException ex) {
            return null;
        }
    }

    // Method to configure database connection
    private static void configureDatabase() {
        String newIP = JOptionPane.showInputDialog(null, new JLabel("Cannot connect to the database! Enter new IP address:", 0), "IP Address", -1);
        if (newIP != null) {
            establishConnection(newIP);
        } else {
            System.exit(-1);
        }
    }

    // Method to establish database connection with given IP address
    private static void establishConnection(String newIP) {
        try {
            String url = "jdbc:mysql://" + newIP + "/" + DATABASE_NAME;
            String username = "root";
            String password = "";
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(url, username, password);
            saveIPAddressToFile(newIP);
        } catch (ClassNotFoundException | SQLException ex) {
            configureDatabase();
        }
    }

    // Method to save IP address to file
    private static void saveIPAddressToFile(String ipAddress) {
        try (PrintWriter writer = new PrintWriter(IP_FILE_PATH)) {
            writer.println(ipAddress);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
            System.exit(-1);
        }
    }

    // Method to run SQL query
    public static boolean runQuery(String query) {
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error running the query! Info: \n" + ex.getMessage());
            return false;
        }
    }

    // Method to get single value from SQL query result
    public static String getValue(String query, String col) {
        try {
            String value = "";
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                value = resultSet.getString(col);
            }
            return value;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error running the query! Info: \n" + ex.getMessage());
            return null;
        }
    }
    
    public static DefaultTableModel getAllPatients() {
        connect();
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Last Name");
        model.addColumn("First Name");
        model.addColumn("M.I");
        model.addColumn("Address");

        String query = "SELECT * FROM qpd_doc order by lastname"; // Assuming patients is your table name

        try {
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String lastName = resultSet.getString("lastname");
                String firstName = resultSet.getString("firstname");
                String mi = resultSet.getString("MI");
                String address = resultSet.getString("address");

                model.addRow(new Object[]{lastName, firstName, mi, address});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error retrieving patients from the database: " + ex.getMessage());
        }

        return model;
    }
    
    
}

