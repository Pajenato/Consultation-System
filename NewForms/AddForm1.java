/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package consultationapp.forms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import consultationapp.database.DatabaseConnect;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AddForm1 extends javax.swing.JFrame {
    
    private String user;

    public AddForm1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        firstnameField = new javax.swing.JTextField();
        genderSelect = new javax.swing.JComboBox<>();
        lastnameField = new javax.swing.JTextField();
        middleInitialField = new javax.swing.JTextField();
        ageField = new javax.swing.JSpinner();
        dateOfBirthField = new com.toedter.calendar.JDateChooser();
        contactField = new javax.swing.JTextField();
        addressField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(214, 216, 222));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(25, 114, 124), 4, true));

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel1.setText("Patient Records");

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 15)); // NOI18N
        jLabel3.setText("Last Name");

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 15)); // NOI18N
        jLabel4.setText("Contact");

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 15)); // NOI18N
        jLabel5.setText("Age");

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 15)); // NOI18N
        jLabel6.setText("M.I");

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 15)); // NOI18N
        jLabel7.setText("First Name");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 15)); // NOI18N
        jLabel8.setText("Gender");

        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 15)); // NOI18N
        jLabel9.setText("Birth Date");

        jLabel10.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 15)); // NOI18N
        jLabel10.setText("Address");

        addBtn.setBackground(new java.awt.Color(45, 134, 166));
        addBtn.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        addBtn.setForeground(new java.awt.Color(250, 250, 250));
        addBtn.setText("Add");
        addBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        addBtn.setBorderPainted(false);
        addBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addBtn.setFocusPainted(false);
        addBtn.setMaximumSize(new java.awt.Dimension(100, 40));
        addBtn.setMinimumSize(new java.awt.Dimension(100, 40));
        addBtn.setPreferredSize(new java.awt.Dimension(100, 40));
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(0, 0, 0));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("BACK");
        backButton.setBorder(null);
        backButton.setBorderPainted(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        firstnameField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        firstnameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        firstnameField.setMargin(new java.awt.Insets(2, 5, 2, 5));
        firstnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameFieldActionPerformed(evt);
            }
        });

        genderSelect.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        genderSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        genderSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderSelectActionPerformed(evt);
            }
        });

        lastnameField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lastnameField.setMargin(new java.awt.Insets(2, 5, 2, 5));
        lastnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameFieldActionPerformed(evt);
            }
        });

        middleInitialField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        middleInitialField.setMargin(new java.awt.Insets(2, 5, 2, 5));
        middleInitialField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middleInitialFieldActionPerformed(evt);
            }
        });

        ageField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        dateOfBirthField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dateOfBirthField.setPreferredSize(new java.awt.Dimension(85, 28));

        contactField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        contactField.setMargin(new java.awt.Insets(2, 5, 2, 5));
        contactField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactFieldActionPerformed(evt);
            }
        });

        addressField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addressField.setMargin(new java.awt.Insets(2, 5, 2, 5));
        addressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(dateOfBirthField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(genderSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(firstnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressField)
                            .addComponent(contactField)
                            .addComponent(lastnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 637, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(middleInitialField, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(middleInitialField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(dateOfBirthField, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(contactField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(950, 400));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        if (fieldsHaveErrors()) {
            return;
        }
        DatabaseConnect.connect();
        Connection con = DatabaseConnect.con;
        
        String query =    "SELECT * FROM qpd_doc "
                        + "WHERE lastname = '" + lastnameField.getText() 
                        + "' AND firstname = '" + firstnameField.getText() 
                        + "' AND MI = '" + middleInitialField.getText() + "'";
        try {
            PreparedStatement command = con.prepareStatement(query);
            ResultSet result = command.executeQuery();
            if (result.next()) {
                JOptionPane.showMessageDialog(null, "Patient already exists.");
            } else {
                String formattedDate = "1970-01-01"; // Default date value
                Date selectedDate = dateOfBirthField.getDate();
                if (selectedDate != null) {
                    var sdf = new SimpleDateFormat("yyyy-MM-dd");
                    formattedDate = sdf.format(selectedDate);
                }

                String query2 =   "INSERT INTO qpd_doc (fullname1, fullname2, firstname, MI, lastname, address, birthdate, age, gender, contact, added, famhis, pastmedhis, allergies, meds) "
                                + "VALUES ('" + lastnameField.getText() + " " + firstnameField.getText() + " " + middleInitialField.getText() + "', "
                                + "'" + firstnameField.getText() + " " + middleInitialField.getText() + " " + lastnameField.getText() + "', "
                                + "'" + firstnameField.getText() + "', "
                                + "'" + middleInitialField.getText() + "', "
                                + "'" + lastnameField.getText() + "', "
                                + "'" + addressField.getText() + "', "
                                + "'" + formattedDate + "', "
                                + "'" + ageField.getValue() + "', "
                                + "'" + genderSelect.getSelectedItem().toString() + "', "
                                + "'" + contactField.getText() + "', "
                                + "'" + user + "', "
                                + "'', '', '', '')";

                if (!DatabaseConnect.runQuery(query2)) {
                    return;
                }
                JOptionPane.showMessageDialog(null, "Added successfully.");
                setAllValue();
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddForm1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void genderSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderSelectActionPerformed

    private void firstnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameFieldActionPerformed

    private void lastnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameFieldActionPerformed

    private void middleInitialFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middleInitialFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_middleInitialFieldActionPerformed

    private void contactFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactFieldActionPerformed

    private void addressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressFieldActionPerformed

    private boolean fieldsHaveErrors() {
        if (lastnameField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Last name cannot be empty.");
            return true;
        }
        if (firstnameField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "First name cannot be empty.");
            return true;
        }
        return false;
    }
    
    public void setAllValue() {
        firstnameField.setText("");
        lastnameField.setText("");
        middleInitialField.setText("");
        ageField.setValue(0);
        addressField.setText("");
        dateOfBirthField.setCalendar(null);
        genderSelect.setSelectedIndex(0);
        contactField.setText("");
    }
    
    public void who(String user2) {
        this.user = user2;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AddForm1().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField addressField;
    private javax.swing.JSpinner ageField;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField contactField;
    private com.toedter.calendar.JDateChooser dateOfBirthField;
    private javax.swing.JTextField firstnameField;
    private javax.swing.JComboBox<String> genderSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastnameField;
    private javax.swing.JTextField middleInitialField;
    // End of variables declaration//GEN-END:variables
}
