/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consultapp;

import consultapp.forms.addForm;
import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class ConsultApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        addForm form = new addForm();
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setVisible(true);
    }
    
}
