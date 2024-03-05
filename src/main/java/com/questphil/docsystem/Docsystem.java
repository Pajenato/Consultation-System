/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.questphil.docsystem;

import com.questphil.docsystem.dao.PatientDao;
import com.questphil.docsystem.dao.impl.PatientDaoImpl;
import com.questphil.docsystem.entity.PatientEntity;
import com.questphil.docsystem.forms.addForm;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import javax.swing.JFrame;

/**
 *
 * @author russe
 */
public class Docsystem {

    public static void main(String[] args) {
        addForm form = new addForm();
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.user = "Cashier2";
        form.setVisible(true);
    }
}
