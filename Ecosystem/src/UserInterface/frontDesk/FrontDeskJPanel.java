/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.frontDesk;

import Business.Business;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Entity.TimeSlot;
import Business.Organization.DoctorOrganization;
import Business.Organization.FrontDeskEmployeeOrganization;
import Business.Organization.Organization;
import Business.Request.Request;
import Business.UserAccount.UserAccount;
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
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtPatient = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtBirth = new javax.swing.JTextField();
        makeAptmBtn = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();

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
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
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

        jLabel1.setText("specialities");

        jLabel2.setText("Available Time");

        jButton1.setText("Select");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Search");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(29, 29, 29)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(4, 4, 4)
                                .addComponent(txtPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(makeAptmBtn))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButton2)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(makeAptmBtn)
                    .addComponent(jButton1))
                .addGap(101, 101, 101))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable availTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
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
                    row[1] = a.getEmployee().getDesc();
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
