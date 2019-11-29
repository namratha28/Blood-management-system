/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.account;

import Business.Enterprise.Enterprise;

import Business.Entity.Specialities;
import Business.Organization.CommonUserOrganization;
import Business.Organization.Organization;
import Business.UserAccount.AbstractFactory.AccountFactory;
import Business.UserAccount.AbstractFactory.UserAccountFactory;
import java.awt.CardLayout;
import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Huangdong Wen <wen.hu@husky.neu.edu>
 */
public class CreateEmployeeJPanel extends javax.swing.JPanel {

    private String username;
    private String pw;
    private String name;
    private String birthday;
    private Enterprise e;
    private JPanel userProcessContainer;

        //ROLE_STRATEGY_MAP.put(roleKey.NURSE,new NurseRole());
//
//    private interface roleKey {
//
//        String DOCTOR = "DOCTOR";
//        String NURSE = "NURSE";
//        String LAB="LAB";
//        String FRONTDESK="FRONTDESK";
//        String ADMIN="ADMIN";
//    }
    /**
     * Creates new form CreateJPanel
     */
    public CreateEmployeeJPanel(JPanel userProcessContainer, Enterprise e) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.e = e;
        List<String> role_str = new ArrayList<>();

        for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
            role_str.add(o.getName());

        }

        roleCombo.setModel(new javax.swing.DefaultComboBoxModel(role_str.toArray()));

        Field[] fields_spe = Specialities.class.getFields();
        String[] arr_spe = Specialities.names();
        speComboBox.setModel(new javax.swing.DefaultComboBoxModel(arr_spe));
        speComboBox.setEnabled(false);
        //speTxt.setEnabled(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createBtn = new javax.swing.JButton();
        nameTxt = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        birthdayTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        pwTxt = new javax.swing.JTextField();
        roleCombo = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        speComboBox = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create Account");

        jLabel2.setText("username");

        jLabel3.setText("password");

        jLabel4.setText("name");

        jLabel5.setText("birthday");

        roleCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        roleCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleComboActionPerformed(evt);
            }
        });

        jLabel6.setText("specialities");

        speComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("organization");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(339, 339, 339)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 2, Short.MAX_VALUE)
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(roleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(speComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(createBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(pwTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(nameTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(birthdayTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(278, 278, 278)))
                .addGap(384, 384, 384))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(137, 137, 137)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pwTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(birthdayTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(speComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(170, 170, 170)
                .addComponent(createBtn)
                .addContainerGap(250, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {birthdayTxt, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, nameTxt, pwTxt, roleCombo, speComboBox, usernameTxt});

    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        username = usernameTxt.getText();
        pw = pwTxt.getText();
        name = nameTxt.getText();
        birthday = birthdayTxt.getText();
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yy");
        Date b = null;
        try {
            b = format.parse(birthday);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }

        String selected = roleCombo.getSelectedItem().toString();
        AccountFactory f = null;
        String spe = null;
        if (selected == Organization.Type.Doctor.getValue()) {
            spe = speComboBox.getSelectedItem().toString();
            // f = new DoctorFactory(spe, e, username, pw, name, b);
        } else {
            spe = selected;
        }
        f = new UserAccountFactory(spe, e, selected, username, pw, name, b);
        //f=ROLE_STRATEGY_MAP.get(selected);
        if (f != null) {
            f.addEmployee();
            f.addAccount();
        }
        //Role role = ROLE_STRATEGY_MAP.get(selected);
        JOptionPane.showMessageDialog(null, "Create Account Successfully");
    }//GEN-LAST:event_createBtnActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void roleComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleComboActionPerformed
        String selected = roleCombo.getSelectedItem().toString();
        if (selected == Organization.Type.Doctor.getValue()) {
            speComboBox.setEnabled(true);
            // speTxt.setEnabled(false);
        } else {
            speComboBox.setEnabled(false);
            // speTxt.setEnabled(true);
        }
    }//GEN-LAST:event_roleComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField birthdayTxt;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField pwTxt;
    private javax.swing.JComboBox roleCombo;
    private javax.swing.JComboBox speComboBox;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
