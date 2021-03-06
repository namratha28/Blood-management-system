/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Doctor;

import Business.EcoSystem;
import Business.Enterprise.BloodBankEnterprise;
import Business.Enterprise.Enterprise;
import Business.Entity.BloodType;
import Business.Entity.HospitalStatus;
import Business.Network.Network;
import Business.Organization.BloodCollectionStationOrganization;
import Business.Organization.CommonUserOrganization;
import Business.Organization.FrontDeskEmployeeOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.Role.HospitalLabRole;
import Business.Role.LabRole;
import Business.UserAccount.UserAccount;
import Bussiness.WorkQueue.DonorRequest;
import Bussiness.WorkQueue.HospitalInnerRequest;
import Bussiness.WorkQueue.WorkRequest;

import java.awt.CardLayout;
import java.awt.Component;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Huangdong Wen <wen.hu@husky.neu.edu>
 */
public class DoctorWQJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private WorkRequest wr;
    private Enterprise enterprise;
    private UserAccount next;
    private UserAccount curr;
    private EcoSystem business;
    private HospitalInnerRequest nextWorkRequest;
    private HospitalStatus lastStatus;
    private HospitalStatus status;

    public DoctorWQJPanel(WorkRequest wr, JPanel userProcessContainer, EcoSystem business, Enterprise enterprise,
            UserAccount userAccount) {
        initComponents();
        this.business = business;
        this.userProcessContainer = userProcessContainer;
        this.wr = wr;
        this.enterprise = enterprise;
        this.curr = userAccount;
        populatePatientInfo();
        populateSpeComboBox();
        populateStaff();
        populateBloodTypeComboBox();
        setInfoFieldEnable(false);
        setFieldEnable(false);
        dueTxt.setText("12/08/19 09:00:00");
    }

    private void setInfoFieldEnable(boolean b) {
        birthdayTxt.setEnabled(b);
        nameTxt.setEnabled(b);
    }

    private void populatePatientInfo() {
        nameTxt.setText(wr.getPatient().getPerson().getName());
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String strDate = dateFormat.format(curr.getPerson().getBirthday());
        birthdayTxt.setText(String.valueOf(strDate));
        bloodPTxt.setText(String.valueOf(wr.getPatient().getPerson().getBloodPress()));
        tempTxt.setText(String.valueOf(wr.getPatient().getPerson().getTemperature()));
        pulseTxt.setText(String.valueOf(wr.getPatient().getPerson().getPulse()));
        populateTreatementHistory();
    }

    private void setFieldEnable(boolean b) {
        tempTxt.setEnabled(b);
        bloodPTxt.setEnabled(b);
        pulseTxt.setEnabled(b);
    }

    private void populateBloodTypeComboBox() {
        btCombo.removeAllItems();
        if (curr.getRole() instanceof HospitalLabRole) {
            for (BloodType s : BloodType.values()) {
                btCombo.addItem(s);
            }
            return;
        }
        btCombo.addItem(wr.getPatient().getPerson().getType());
    }

    private void populateStaff() {
        staffcombo.removeAllItems();
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (!(org instanceof CommonUserOrganization)) {
                for (UserAccount acc : org.getUserAccountDirectory().getUserAccountList()) {
                    staffcombo.addItem(acc);
                }
            }
        }
    }

    private void populateSpeComboBox() {
        statuscombo.removeAllItems();
        for (HospitalStatus s : HospitalStatus.values()) {
            statuscombo.addItem(s);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        birthdayTxt = new javax.swing.JTextField();
        bloodPTxt = new javax.swing.JTextField();
        pulseTxt = new javax.swing.JTextField();
        tempTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        massageTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        statuscombo = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        staffcombo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        historyTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dueTxt = new javax.swing.JTextField();
        btCombo = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(254, 254, 254));

        jLabel4.setText("Blood Type");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setText("Patient Inforamtion");

        jLabel2.setText("name");

        jLabel5.setText("age");

        jLabel6.setText("blood pressure");

        jLabel8.setText("temperature");

        jLabel9.setText("Message");

        jButton1.setBackground(new java.awt.Color(255, 168, 125));
        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(254, 254, 254));
        jButton1.setText("Send Request");
        jButton1.setPreferredSize(new java.awt.Dimension(197, 41));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setText("Status");

        statuscombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setText("Pulse");

        btnBack.setBackground(new java.awt.Color(255, 168, 125));
        btnBack.setForeground(java.awt.Color.white);
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel3.setText("staff");

        staffcombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        historyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor/Nurse", "Date", "Message", "Status"
            }
        ));
        jScrollPane1.setViewportView(historyTable);

        jLabel7.setText("Treatment History");

        jLabel12.setText("Due");

        btCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        btCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(297, 297, 297)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8))
                                .addGap(489, 489, 489)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(statuscombo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel12))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(staffcombo, 0, 182, Short.MAX_VALUE)
                                            .addComponent(dueTxt)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(594, 594, 594)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(birthdayTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(massageTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 925, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(132, 132, 132)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bloodPTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(241, 241, 241)
                                                .addComponent(jLabel4))
                                            .addComponent(pulseTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tempTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(253, 253, 253)))))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(jLabel1))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bloodPTxt)
                            .addComponent(birthdayTxt))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pulseTxt)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(statuscombo, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                                    .addComponent(tempTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(staffcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(98, 98, 98)))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(dueTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(massageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        Component[] comps = this.userProcessContainer.getComponents();
        for (Component comp : comps) {
            if (comp instanceof DoctorJPanel) {
                DoctorJPanel m = (DoctorJPanel) comp;
                m.populateRqTable();
            }
        }
        layout.previous(userProcessContainer);
    }// GEN-LAST:event_btnBackActionPerformed
    // 11/11/19 08:00:00

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        wr.getPatient().getPerson().setType((BloodType) btCombo.getSelectedItem());
        status = (HospitalStatus) statuscombo.getSelectedItem();

        setNextWorkRequest();
        if (status == HospitalStatus.CLOSE) {

        } else if (status == HospitalStatus.URGENT) {
            if (lastStatus == null) {
                enterprise.getWorkQueue().getWorkRequestList().remove(nextWorkRequest);
                enterprise.getWorkQueue().getWorkRequestList().add(nextWorkRequest);
                lastStatus = HospitalStatus.URGENT;
            }
        } else if (status == HospitalStatus.WAITING_FOR_BLOOD) {
            if (lastStatus != null) {
                enterprise.getWorkQueue().getWorkRequestList().remove(nextWorkRequest);
            }

            //addFrontDeskWorkQueue();
            sendDonorWorkRequest();

        } else {
            moveToNextWorkQueue();
        }
        removeOldWorkRequest();
        populateTreatementHistory();
        JOptionPane.showMessageDialog(null, "send request");
    }

    private void sendDonorWorkRequest() {
        DonorRequest dr = new DonorRequest();
        dr.setSender(curr);
        dr.setBlood(wr.getPatient().getPerson().getType().getValue());
        dr.setRequestDate(new Date());
        //dr.setPatient(wr.getPatient());
        dr.setReceiver(wr.getPatient());
        dr.setStatus("");

        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise instanceof BloodBankEnterprise) {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof BloodCollectionStationOrganization) {
                            if (organization != null) {
                                organization.getWorkQueue().getWorkRequestList().add(dr);
                            }
                        }
                    }
                }
            }
        }
    }

    private void addFrontDeskWorkQueue() {
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof FrontDeskEmployeeOrganization) {

                organization.getWorkQueue().getWorkRequestList().remove(nextWorkRequest);
                organization.getWorkQueue().getWorkRequestList().add(nextWorkRequest);
            }
        }
    }

    private void setNextWorkRequest() {
        if (nextWorkRequest == null) {
            nextWorkRequest = new HospitalInnerRequest();
        }

        String due = dueTxt.getText();
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yy HH:mm:ss");
        Date b = null;

        try {
            b = format.parse(due);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Format MM/dd/yy HH:mm:ss");
        }

        nextWorkRequest.setAppointmentDate(b);
        nextWorkRequest.setSender(curr);
        nextWorkRequest.setMessage(massageTxt.getText());
        nextWorkRequest.setPatient(wr.getPatient());
        nextWorkRequest.setRequestDate(new Date());
        nextWorkRequest.setStatus(status.getValue());
    }

    private void moveToNextWorkQueue() {
        if (lastStatus != null) {
            enterprise.getWorkQueue().getWorkRequestList().remove(nextWorkRequest);
        }
        next = (UserAccount) staffcombo.getSelectedItem();
        nextWorkRequest.setReceiver(next);
        next.getWorkQueue().getWorkRequestList().remove(nextWorkRequest);
        next.getWorkQueue().getWorkRequestList().add(nextWorkRequest);
    }

    private void removeOldWorkRequest() {
        wr.setResolveDate(new Date());
        wr.setStatus(status.getValue());
        wr.setMessage(massageTxt.getText());
        if (wr.getPatient().getPerson().getTreatmentHistory() != null) {
            wr.getPatient().getPerson().getTreatmentHistory().remove(wr);
            wr.getPatient().getPerson().getTreatmentHistory().add(wr);
        }
        curr.getWorkQueue().getWorkRequestList().remove(wr);
    }

    private void btComboActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btComboActionPerformed
        // wr.getPatient().getPerson().setType((BloodType) btCombo.getSelectedItem());
    }// GEN-LAST:event_btComboActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField birthdayTxt;
    private javax.swing.JTextField bloodPTxt;
    private javax.swing.JComboBox btCombo;
    private javax.swing.JButton btnBack;
    private javax.swing.JTextField dueTxt;
    private javax.swing.JTable historyTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField massageTxt;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField pulseTxt;
    private javax.swing.JComboBox staffcombo;
    private javax.swing.JComboBox statuscombo;
    private javax.swing.JTextField tempTxt;
    // End of variables declaration//GEN-END:variables

    private void populateTreatementHistory() {
        DefaultTableModel model = (DefaultTableModel) historyTable.getModel();
        model.setRowCount(0);
        if (wr.getPatient().getPerson().getTreatmentHistory() != null) {
            for (WorkRequest r : wr.getPatient().getPerson().getTreatmentHistory()) {
                Object[] row = new Object[4];
                row[0] = r.getReceiver();
                row[1] = r.getResolveDate();
                row[2] = r.getMessage();
                row[3] = r.getStatus();

                model.addRow(row);
            }
        }

    }

}
