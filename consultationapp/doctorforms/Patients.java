package consultationapp.doctorforms;

import consultationapp.constants.Constants;
import consultationapp.database.Database;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Patients extends javax.swing.JFrame {

    public Patients() {
        initComponents();
        table.setModel(Database.getAllPatients());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        logoutBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        userLabel = new javax.swing.JLabel();
        userField = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setExtendedState(Patients.MAXIMIZED_BOTH);
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

        table.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
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
        table.setRowHeight(25);
        table.setShowGrid(false);
        jScrollPane1.setViewportView(table);

        logoutBtn.setBackground(new java.awt.Color(30, 30, 30));
        logoutBtn.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(250, 250, 250));
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/consultationapp/icons/white-close-sm-icon.png"))); // NOI18N
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

        editBtn.setBackground(new java.awt.Color(45, 134, 166));
        editBtn.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        editBtn.setForeground(new java.awt.Color(250, 250, 250));
        editBtn.setText("Edit");
        editBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        editBtn.setBorderPainted(false);
        editBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        editBtn.setFocusPainted(false);
        editBtn.setMaximumSize(new java.awt.Dimension(100, 40));
        editBtn.setMinimumSize(new java.awt.Dimension(100, 40));
        editBtn.setPreferredSize(new java.awt.Dimension(100, 40));
        editBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editBtnMouseExited(evt);
            }
        });
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
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
        userLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        userField.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        userField.setText("Doctor");
        userField.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(searchField)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(userField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(userLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void editBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_editBtnMouseEntered

    private void editBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBtnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_editBtnMouseExited

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        searchPatients();
    }//GEN-LAST:event_searchFieldKeyReleased

    public void searchPatients() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        table.setRowSorter(sorter);

        String text = searchField.getText().trim();
        if (text.length() == 0) {
            sorter.setRowFilter(null);
        } else {
            // Create a RowFilter that will search in all columns
            RowFilter<DefaultTableModel, Object> rowFilter = RowFilter.regexFilter("(?i)" + text);
            sorter.setRowFilter(rowFilter);
        }
    }
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
            java.util.logging.Logger.getLogger(Patients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Patients().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JTextField searchField;
    private javax.swing.JTable table;
    private javax.swing.JLabel title;
    private javax.swing.JLabel userField;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
