/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.frontDesk;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Entity.TimeSlot;
import Business.Organization.DoctorOrganization;
import Business.Organization.FrontDeskEmployeeOrganization;
import Business.Organization.Organization;
import Business.Request.Request;
import Business.UserAccount.UserAccount;
import UserInterface.account.CreateJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Huangdong Wen <wen.hu@husky.neu.edu>
 */
public class FrontDeskJPanel extends javax.swing.JPanel {

    /**
     * Creates new form frontDeskJPanel
     */
    private JPanel userProcessContainer;
    private Business business;
    private UserAccount userAccount;
    private FrontDeskEmployeeOrganization organization;
    private Enterprise enterprise;
    private UserAccount a;

    public FrontDeskJPanel(JPanel userProcessContainer, UserAccount account, FrontDeskEmployeeOrganization organization, Enterprise enterprise, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.enterprise = enterprise;
        this.organization = organization;
        populateSpe();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        speTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        availTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtPatient = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtBirth = new javax.swing.JTextField();
        makeAptmBtn = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        createBtn = new javax.swing.JButton();
        createBtn1 = new javax.swing.JButton();
        createBtn2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1280, 800));

        speTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "name", "specialties"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(speTable);

        availTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "From", "To"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(availTable);

        jLabel1.setText("Specialities");

        jLabel2.setText("Available Time");

        jButton1.setText("Select");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Patient Name");

        jLabel4.setText("Birthday");

        txtBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBirthActionPerformed(evt);
            }
        });

        makeAptmBtn.setText("make an appointment");
        makeAptmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeAptmBtnActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Doctor Name");

        jButton3.setText("Search");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel6.setText("Appointment");

        createBtn.setBackground(new java.awt.Color(219, 140, 194));
        createBtn.setForeground(new java.awt.Color(0, 0, 0));
        createBtn.setText("Search");

        createBtn1.setBackground(new java.awt.Color(217, 83, 79));
        createBtn1.setForeground(new java.awt.Color(255, 255, 255));
        createBtn1.setText("Create");
        createBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtn1ActionPerformed(evt);
            }
        });

        createBtn2.setBackground(new java.awt.Color(219, 140, 194));
        createBtn2.setForeground(new java.awt.Color(255, 255, 255));
        createBtn2.setText("Confirm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(504, 504, 504)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(makeAptmBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(37, 37, 37))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(createBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(17, 17, 17)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtPatient, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBirth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(createBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addGap(145, 145, 145))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createBtn2)
                            .addComponent(createBtn)
                            .addComponent(createBtn1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jLabel2))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(makeAptmBtn))
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int selectedRow = speTable.getSelectedRow();
        //Employee e;
        if (selectedRow >= 0) {
            a = (UserAccount) speTable.getValueAt(selectedRow, 0);
            populateAvailTable();
        } else {
            JOptionPane.showMessageDialog(null, "Please select any row");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBirthActionPerformed

    private void makeAptmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeAptmBtnActionPerformed
        Request r=new Request();
        String name=txtPatient.getText();
        UserAccount user=new UserAccount();
        user.setUsername(name);
        r.setSender(user); 
        r.setReceiver(a);
        a.getRq().getWorkRequestList().add(r);     
    }//GEN-LAST:event_makeAptmBtnActionPerformed

    private void createBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtn1ActionPerformed
        CreateJPanel panel=new CreateJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("CreateAccountJPanel",panel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_createBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable availTable;
    private javax.swing.JButton createBtn;
    private javax.swing.JButton createBtn1;
    private javax.swing.JButton createBtn2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton makeAptmBtn;
    private javax.swing.JTable speTable;
    private javax.swing.JTextField txtBirth;
    private javax.swing.JTextField txtPatient;
    // End of variables declaration//GEN-END:variables

    private void populateSpe() {
        DefaultTableModel model = (DefaultTableModel) speTable.getModel();

        model.setRowCount(0);
        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (o instanceof DoctorOrganization) {
                for (UserAccount a : o.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[2];
                    row[0] = a;
                    row[1] = a.getEmployee().getSpecialities();
                    model.addRow(row);
                }
            }
        }

    }

    private void populateAvailTable() {
        DefaultTableModel model = (DefaultTableModel) availTable.getModel();

        model.setRowCount(0);

        for (TimeSlot ts : a.getEmployee().getAvailability()) {
            Object[] row = new Object[2];
            row[0] = ts.getFrom();
            row[1] = ts.getTo();
            model.addRow(row);
        }

    }
}
