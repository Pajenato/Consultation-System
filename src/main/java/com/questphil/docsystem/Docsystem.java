/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.questphil.docsystem;

import com.questphil.docsystem.patients.DocPatientRecords;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author russe
 */
public class Docsystem {

    public static void main(String[] args) {
//        addForm form = new addForm();
//        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        form.user = "Cashier2";
//        form.setVisible(true);
        DocPatientRecords form = new DocPatientRecords();
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setMinimumSize(new Dimension(600, 900));
        form.setVisible(true);

    }
}
