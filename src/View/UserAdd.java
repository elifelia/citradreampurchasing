/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Bean.DatabaseConnection;
import Bean.DepartmentBean;
import Bean.UserBean;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author HP PC
 */
public class UserAdd extends javax.swing.JFrame {

    Connection con;
    Statement st;
    private DefaultComboBoxModel tableModel = new DefaultComboBoxModel();
    DepartmentBean department = new DepartmentBean();

    /**
     * Creates new form UserAdd
     */
    public UserAdd() {

        initComponents();
        fillCombo();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/icon.png")));
        passConf_check.getDocument().addDocumentListener(new PassListener());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        username_text = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        pass_text = new javax.swing.JPasswordField();
        dept_combo = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        passConf_check = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        prf_check = new javax.swing.JCheckBox();
        prv_check = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        pof_check = new javax.swing.JCheckBox();
        md_check = new javax.swing.JCheckBox();
        rf_check = new javax.swing.JCheckBox();
        poi_check = new javax.swing.JCheckBox();
        pov_check = new javax.swing.JCheckBox();
        save_button = new javax.swing.JButton();
        reset_button = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        rfv_check = new javax.swing.JCheckBox();
        password = new javax.swing.JLabel();
        reset_button1 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Insert New User");
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("User Registration");

        jLabel3.setText("FORM");

        jLabel4.setText("User Name");

        jLabel5.setText("Password");

        dept_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dept_comboActionPerformed(evt);
            }
        });

        jLabel6.setText("Department");

        passConf_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passConf_checkActionPerformed(evt);
            }
        });

        jLabel7.setText("Password Confirm");

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel8.setText("insert new user's login information below");

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel9.setText("define new user's program section");

        prf_check.setText("Purchase Request Form");
        prf_check.setToolTipText("user can access the PR-Insert Form");

        prv_check.setText("Purchase Request View");
        prv_check.setToolTipText("user can access the PR-View Form");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pr.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/po.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rr.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/md.png"))); // NOI18N
        jLabel13.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        pof_check.setText("Purchase Order Form");

        md_check.setText("Master Data");

        rf_check.setText("Receiving Form");

        poi_check.setText("Product Inactivating");

        pov_check.setText("Purchase Order View");
        pov_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pov_checkActionPerformed(evt);
            }
        });

        save_button.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        save_button.setText("Save");
        save_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_buttonActionPerformed(evt);
            }
        });

        reset_button.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        reset_button.setText("Reset");
        reset_button.setToolTipText("");
        reset_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_buttonActionPerformed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/corner.png"))); // NOI18N

        status.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        status.setForeground(new java.awt.Color(255, 0, 0));

        rfv_check.setText("Receiving Form View");

        password.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        password.setForeground(new java.awt.Color(255, 0, 0));
        password.setText("");

        reset_button1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        reset_button1.setText("View");
        reset_button1.setToolTipText("");
        reset_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator2)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(390, 390, 390)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(rf_check, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rfv_check, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(0, 17, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel13)
                                            .addGap(21, 21, 21)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(md_check)))))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(prf_check)
                            .addComponent(prv_check))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pov_check)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(save_button)
                                        .addGap(18, 18, 18)
                                        .addComponent(reset_button)
                                        .addGap(18, 18, 18)
                                        .addComponent(reset_button1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(pof_check)
                                    .addComponent(poi_check))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passConf_check)
                            .addComponent(dept_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(username_text)
                            .addComponent(pass_text, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(password)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(status)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(username_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pass_text)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passConf_check, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(status)
                    .addComponent(password))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dept_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(md_check)
                    .addComponent(rf_check)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(prf_check)
                        .addComponent(pof_check)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rfv_check)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(prv_check)
                                .addComponent(pov_check)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(poi_check)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(save_button)
                            .addComponent(reset_button)
                            .addComponent(reset_button1))
                        .addGap(20, 20, 20))
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reset_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_buttonActionPerformed
        username_text.setText(null);
        pass_text.setText(null);
        passConf_check.setText(null);
        dept_combo.setSelectedIndex(1);
        rfv_check.setSelected(false);
        password.setText(null);
//        pre_check.setSelected(false);
        prf_check.setSelected(false);
        prv_check.setSelected(false);
//        poa_check.setSelected(false);
        pov_check.setSelected(false);
        pof_check.setSelected(false);
        rf_check.setSelected(false);
        poi_check.setSelected(false);
        md_check.setSelected(false);
    }//GEN-LAST:event_reset_buttonActionPerformed

    private void save_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_buttonActionPerformed
        if (password.getText().equals("Password Match!")) {
            UserBean ub = new UserBean();
            ub.simpanUser(ub.setUSERid(dept_combo.getSelectedItem().toString()), username_text.getText(),
                    pass_text.getText(), dept_combo.getSelectedItem().toString(),
                    prf_check.isSelected(), prv_check.isSelected(),
                    pof_check.isSelected(), pov_check.isSelected(),
                    poi_check.isSelected(), rf_check.isSelected(),
                    rfv_check.isSelected(), md_check.isSelected());
            JOptionPane.showMessageDialog(null, "User's data insertion success!");
        } else {
            JOptionPane.showMessageDialog(null, "User's data insertion failed, Please try again.");
            username_text.setText(null);
            passConf_check.setText(null);
            pass_text.setText(null);
            password.setText(null);
            dept_combo.setSelectedIndex(1);
            rfv_check.setSelected(false);
            prf_check.setSelected(false);
            prv_check.setSelected(false);
            pov_check.setSelected(false);
            pof_check.setSelected(false);
            rf_check.setSelected(false);
            poi_check.setSelected(false);
            md_check.setSelected(false);
        }
    }//GEN-LAST:event_save_buttonActionPerformed

    private void pov_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pov_checkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pov_checkActionPerformed

    private void passConf_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passConf_checkActionPerformed

    }//GEN-LAST:event_passConf_checkActionPerformed

    private void dept_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dept_comboActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_dept_comboActionPerformed

    private void reset_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_button1ActionPerformed
        // TODO add your handling code here:
        TableUser tc = new TableUser();
        tc.setVisible(true);
        tc.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_reset_button1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserAdd().setVisible(true);
            }
        });
    }

    private class PassListener implements DocumentListener {

        @Override
        public void insertUpdate(DocumentEvent e) {
            if (pass_text.getText().equals(passConf_check.getText())) {
                password.setForeground(Color.GREEN);
                password.setText("Password Match!");
            } else {
                password.setText("Password doesn't Match!");
            }
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            if (pass_text.getText().equals(passConf_check.getText())) {
                password.setForeground(Color.GREEN);
                password.setText("Password Match!");
            } else {
                password.setText("Password doesn't Match!");
            }
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            if (pass_text.getText().equals(passConf_check.getText())) {
                password.setForeground(Color.GREEN);
                password.setText("Password Match!");
            } else {
                password.setText("Password doesn't Match!");
            }
        }
    }

    PreparedStatement pst;
    ResultSet rs;

    private void fillCombo() {
        try {
            DatabaseConnection db = new DatabaseConnection();
            String query = "SELECT department_id FROM hcdy_department";
            con = db.getConnection();
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();

            while (rs.next()) {
                String dept = rs.getString("department_id");
                dept_combo.addItem(dept);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox dept_combo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JCheckBox md_check;
    private javax.swing.JPasswordField passConf_check;
    private javax.swing.JPasswordField pass_text;
    private javax.swing.JLabel password;
    private javax.swing.JCheckBox pof_check;
    private javax.swing.JCheckBox poi_check;
    private javax.swing.JCheckBox pov_check;
    private javax.swing.JCheckBox prf_check;
    private javax.swing.JCheckBox prv_check;
    private javax.swing.JButton reset_button;
    private javax.swing.JButton reset_button1;
    private javax.swing.JCheckBox rf_check;
    private javax.swing.JCheckBox rfv_check;
    private javax.swing.JButton save_button;
    private javax.swing.JLabel status;
    private javax.swing.JTextField username_text;
    // End of variables declaration//GEN-END:variables
}
