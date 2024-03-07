package com.questphil.docsystem.patients;

import com.questphil.docsystem.backend.dao.PatientDao;
import com.questphil.docsystem.backend.dao.impl.PatientDaoImpl;
import com.questphil.docsystem.backend.entity.PatientEntity;
import com.questphil.docsystem.backend.utils.EntityManagerProvider;
import com.questphil.docsystem.frontend.utils.MultiColumnRowFilter;
import jakarta.persistence.EntityManager;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ReceptionistPatientRecords extends javax.swing.JFrame {

    public void setTable() {
        DefaultTableModel tableModel = (DefaultTableModel) patientsTable.getModel();
        // Database query
        EntityManager entityManager = EntityManagerProvider.getEntityManager();
        PatientDao patientDao = new PatientDaoImpl(entityManager, PatientEntity.class);

        List<PatientEntity> patientList = patientDao.findAll();
        for (PatientEntity patient : patientList) {

            String lastName = patient.getLastName();
            String firstName = patient.getFirstName();
            String middleInitial = patient.getMiddleInitial();
            String address = patient.getAddress();
            tableModel.addRow(new Object[]{firstName, lastName, middleInitial, address});
        }
    }

    public void searchPatients() {
        TableRowSorter<DefaultTableModel> tableSorter = (TableRowSorter<DefaultTableModel>) patientsTable.getRowSorter();

        String text = searchField.getText().trim();
        if (text.length() == 0) {
            tableSorter.setRowFilter(null);
        } else {
            Set<Integer> columnIndicesToSearch = Set.of(0, 1, 2, 3); // 4 Columns to search
            // Create a RowFilter that will search in all columns
            tableSorter.setRowFilter(new MultiColumnRowFilter(columnIndicesToSearch, text));
        }
    }

    public void addPlaceholder() {
        searchField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (searchField.getText().equals("Search")) {
                    searchField.setText("");
                    searchField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (searchField.getText().isEmpty()) {
                    searchField.setText("Search");
                    searchField.setForeground(Color.GRAY);
                }
            }
        });
    }

    public ReceptionistPatientRecords() {
        initComponents();

        DefaultTableModel tableModel = (DefaultTableModel) patientsTable.getModel();
        TableRowSorter<DefaultTableModel> tableSorter = new TableRowSorter<>(tableModel);
        List<RowSorter.SortKey> sortKeys = new ArrayList<>();

        sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
        tableSorter.setSortKeys(sortKeys);

        patientsTable.setModel(tableModel);
        patientsTable.setRowSorter(tableSorter);

        setTable();
        addPlaceholder();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientsTable = new javax.swing.JTable();
        logoutBtn = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        userLabel = new javax.swing.JLabel();
        userField = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();
        salesButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setExtendedState(DocPatientRecords.MAXIMIZED_BOTH);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1280, 900));

        jPanel1.setBackground(new java.awt.Color(214, 216, 222));
        jPanel1.setMaximumSize(new java.awt.Dimension(1090, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(1090, 800));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel2.setMaximumSize(new java.awt.Dimension(700, 800));
        jPanel2.setMinimumSize(new java.awt.Dimension(700, 800));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(700, 800));

        title.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        title.setText("Patient Records");

        patientsTable.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        patientsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Last Name", "First Name", "M.I", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        patientsTable.setRowHeight(25);
        patientsTable.setShowGrid(false);
        jScrollPane1.setViewportView(patientsTable);

        logoutBtn.setBackground(new java.awt.Color(30, 30, 30));
        logoutBtn.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(250, 250, 250));
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/white-close-sm-icon.png"))); // NOI18N
        logoutBtn.setText("Log out");
        logoutBtn.setToolTipText("");
        logoutBtn.setActionCommand("Logout");
        logoutBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        logoutBtn.setBorderPainted(false);
        logoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        logoutBtn.setFocusPainted(false);
        logoutBtn.setMaximumSize(new java.awt.Dimension(100, 40));
        logoutBtn.setMinimumSize(new java.awt.Dimension(100, 40));
        logoutBtn.setPreferredSize(new java.awt.Dimension(100, 40));
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutBtnMouseExited(evt);
            }
        });
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        addButton.setBackground(new java.awt.Color(45, 134, 166));
        addButton.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(250, 250, 250));
        addButton.setText("Add");
        addButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        addButton.setBorderPainted(false);
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addButton.setFocusPainted(false);
        addButton.setMaximumSize(new java.awt.Dimension(100, 40));
        addButton.setMinimumSize(new java.awt.Dimension(100, 40));
        addButton.setPreferredSize(new java.awt.Dimension(100, 40));
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addButtonMouseExited(evt);
            }
        });
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        searchField.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 15)); // NOI18N
        searchField.setMargin(new java.awt.Insets(5, 5, 5, 5));
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });

        userLabel.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        userLabel.setText("User: ");

        userField.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        userField.setText("doctor");

        editButton.setBackground(new java.awt.Color(45, 134, 166));
        editButton.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        editButton.setForeground(new java.awt.Color(250, 250, 250));
        editButton.setText("Edit");
        editButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        editButton.setBorderPainted(false);
        editButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        editButton.setFocusPainted(false);
        editButton.setMaximumSize(new java.awt.Dimension(100, 40));
        editButton.setMinimumSize(new java.awt.Dimension(100, 40));
        editButton.setPreferredSize(new java.awt.Dimension(100, 40));
        editButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editButtonMouseExited(evt);
            }
        });
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        salesButton.setBackground(new java.awt.Color(45, 134, 166));
        salesButton.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        salesButton.setForeground(new java.awt.Color(250, 250, 250));
        salesButton.setText("Sales");
        salesButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        salesButton.setBorderPainted(false);
        salesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        salesButton.setFocusPainted(false);
        salesButton.setMaximumSize(new java.awt.Dimension(100, 40));
        salesButton.setMinimumSize(new java.awt.Dimension(100, 40));
        salesButton.setPreferredSize(new java.awt.Dimension(100, 40));
        salesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salesButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salesButtonMouseExited(evt);
            }
        });
        salesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(salesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(searchField)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 399, Short.MAX_VALUE)
                        .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(userLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 200;
        jPanel1.add(jPanel2, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1296, 939));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutBtnMouseEntered

    private void logoutBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutBtnMouseExited

    private void addButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_addButtonMouseEntered

    private void addButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_addButtonMouseExited

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addButtonActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        searchPatients();
    }//GEN-LAST:event_searchFieldKeyReleased

    private void editButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_editButtonMouseEntered

    private void editButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_editButtonMouseExited

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editButtonActionPerformed

    private void salesButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_salesButtonMouseEntered

    private void salesButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_salesButtonMouseExited

    private void salesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salesButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ReceptionistPatientRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReceptionistPatientRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReceptionistPatientRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReceptionistPatientRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ReceptionistPatientRecords().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton editButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JTable patientsTable;
    private javax.swing.JButton salesButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel title;
    private javax.swing.JLabel userField;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
