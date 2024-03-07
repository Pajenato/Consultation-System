/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consultationapp;

import consultationapp.database.Database;
import consultationapp.cashier.OpenCashier;

/**
 *
 * @author Octagram
 */
public class ConsultationApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Database.connect();
        OpenCashier openCashier = new OpenCashier();
        openCashier.setVisible(true);
    }
    
}
