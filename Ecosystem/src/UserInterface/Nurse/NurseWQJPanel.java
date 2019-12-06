/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Nurse;

import Business.EcoSystem;
import Business.Enterprise.BloodBankEnterprise;
import Business.Enterprise.Enterprise;
import Business.Entity.HospitalStatus;
import Business.Entity.Person;
import Business.Network.Network;
import Business.Organization.BloodCollectionStationOrganization;
import Business.Organization.CommonUserOrganization;
import Business.Organization.FrontDeskEmployeeOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.Role.LabRole;
import Business.UserAccount.UserAccount;
import Bussiness.WorkQueue.DonorRequest;
import Bussiness.WorkQueue.HospitalInnerRequest;
import Bussiness.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Huangdong Wen <wen.hu@husky.neu.edu>
 */
public class NurseWQJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private WorkRequest wr;
    private HospitalInnerRequest wrinner;
    private Enterprise e;
    private UserAccount next;
    private UserAccount curr;
    DonorRequest dr;
    HospitalStatus lastStatus;
    EcoSystem business;

    public NurseWQJPanel(WorkRequest wr, JPanel userProcessContainer, EcoSystem business, Enterprise e, UserAccount curr) {
        initComponents();
        this.business = business;
        this.userProcessContainer = userProcessContainer;
        this.wr = wr;
        this.e = e;
        this.curr = curr;
        populatePatientInfo();
        populateSpeComboBox();
        populateNurse();
//        populateBloodTypeComboBox();
        dueTxt.setText("11/22/80 00:00:00");
        saveBtn.setEnabled(false);
        setFieldEnable(false);
        setInfoFieldEnable(false);
    }

    private void populateNurse() {
        staffcombo.removeAllItems();
        //nursecombo.addItem("None");
        for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ageTxt = new javax.swing.JTextField();
        bloodPTxt = new javax.swing.JTextField();
        typeTxt = new javax.swing.JTextField();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        historyTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dueTxt = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        staffcombo = new javax.swing.JComboBox();

        jLabel4.setText("Blood Type");

        jLabel1.setText("Patient Inforamtion");

        jLabel2.setText("name");

        jLabel5.setText("birthday");

        jLabel6.setText("blood pressure");

        jLabel8.setText("temperature");

        jLabel9.setText("Message");

        jButton1.setText("Send Request");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setText("Status");

        statuscombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setText("Pulse");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

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

        saveBtn.setText("save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("staff");

        staffcombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7)
                        .addComponent(jLabel9)
                        .addComponent(massageTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(105, 105, 105)
                                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(typeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(214, 214, 214)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel6)
                                .addComponent(jLabel10))
                            .addGap(71, 71, 71)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(updateBtn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(tempTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bloodPTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pulseTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(statuscombo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addGap(30, 30, 30)
                            .addComponent(staffcombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(68, 68, 68)
                            .addComponent(jLabel12)
                            .addGap(18, 18, 18)
                            .addComponent(dueTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(297, 297, 297)
                        .addComponent(jLabel1)))
                .addGap(247, 419, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nameTxt)
                            .addComponent(bloodPTxt)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageTxt))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(typeTxt))
                        .addGap(98, 98, 98))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pulseTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tempTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saveBtn)
                            .addComponent(updateBtn))
                        .addGap(44, 44, 44)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(staffcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(statuscombo)
                        .addComponent(jLabel12)
                        .addComponent(dueTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(massageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(11, 11, 11)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        HospitalStatus status = (HospitalStatus) statuscombo.getSelectedItem();
        if (wrinner == null) {
            wrinner = new HospitalInnerRequest();
        }
        wrinner.setSender(curr);
        wrinner.setMessage(massageTxt.getText());
        wrinner.setPatient(wr.getPatient());
        wrinner.setRequestDate(new Date());
        wrinner.setStatus(status.getValue());
        String due = dueTxt.getText();
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yy HH:mm:ss");
        Date b = null;

        try {
            b = format.parse(due);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }

        wrinner.setAppointmentDate(b);
        wrinner.setStatus(status.getValue());
        if (status == HospitalStatus.CLOSE) {

        } else if (status == HospitalStatus.URGENT) {
            if (lastStatus == null) {
                e.getWorkQueue().getWorkRequestList().remove(wrinner);
                e.getWorkQueue().getWorkRequestList().add(wrinner);
                lastStatus = HospitalStatus.URGENT;
            } else {

            }
        } else if (status == HospitalStatus.WAITING_FOR_BLOOD) {

            if (lastStatus != null) {
                e.getWorkQueue().getWorkRequestList().remove(wrinner);
            }

            for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof FrontDeskEmployeeOrganization) {
                    organization = organization;
                    organization.getWorkQueue().getWorkRequestList().remove(wrinner);
                    organization.getWorkQueue().getWorkRequestList().add(wrinner);
                }
            }

            DonorRequest dr = new DonorRequest();
            dr.setReceiver(wr.getPatient());
            dr.setBlood(wr.getPatient().getPerson().getType().getValue());
            dr.setRequestDate(new Date());

            Organization org = null;
            for (Network network : business.getNetworkList()) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise instanceof BloodBankEnterprise) {
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            if (organization instanceof BloodCollectionStationOrganization) {
                                org = organization;
                                if (org != null) {

                                    org.getWorkQueue().getWorkRequestList().add(dr);
                                }
                            }
                        }
                    }
                }
            }

        } else {
            next = (UserAccount) staffcombo.getSelectedItem();
            System.out.println(next.toString());
            if (next.getRole() instanceof LabRole) {
                for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
                    if ((org instanceof LabOrganization)) {
                        dr = new DonorRequest();
                        dr.setSender(curr);
                        dr.setRequestDate(new Date());
                        dr.setReceiver(wr.getPatient());
                        org.getWorkQueue().getWorkRequestList().remove(dr);
                        org.getWorkQueue().getWorkRequestList().add(dr);
                    }
                }
            } else {
                if (lastStatus != null) {
                    e.getWorkQueue().getWorkRequestList().remove(wrinner);
                }
                wrinner.setReceiver(next);
                next.getWorkQueue().getWorkRequestList().remove(wrinner);
                next.getWorkQueue().getWorkRequestList().add(wrinner);
            }
        }
        wr.setResolveDate(new Date());
        wr.setStatus(status.getValue());
        wr.setMessage(massageTxt.getText());
        System.out.println(status.getValue());
        if (wr.getPatient().getPerson().getTreatmentHistory() != null) {
            wr.getPatient().getPerson().getTreatmentHistory().remove(wr);
            wr.getPatient().getPerson().getTreatmentHistory().add(wr);
        }
        curr.getWorkQueue().getWorkRequestList().remove(wr);
        populateTreatementHistory();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        setFieldEnable(true);
        saveBtn.setEnabled(true);


    }//GEN-LAST:event_updateBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        Person p = wr.getPatient().getPerson();
        p.setPulse(Integer.valueOf(pulseTxt.getText()));
        p.setTemperature(Integer.valueOf(tempTxt.getText()));
        p.setBloodPress(Integer.valueOf(bloodPTxt.getText()));
        setFieldEnable(false);
    }//GEN-LAST:event_saveBtnActionPerformed
    private void setFieldEnable(boolean b) {
        tempTxt.setEnabled(b);
        bloodPTxt.setEnabled(b);
        pulseTxt.setEnabled(b);
    }

    private void setInfoFieldEnable(boolean b) {
        ageTxt.setEnabled(b);
        nameTxt.setEnabled(b);
        typeTxt.setEnabled(b);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageTxt;
    private javax.swing.JTextField bloodPTxt;
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
    private javax.swing.JButton saveBtn;
    private javax.swing.JComboBox staffcombo;
    private javax.swing.JComboBox statuscombo;
    private javax.swing.JTextField tempTxt;
    private javax.swing.JTextField typeTxt;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables

    private void populatePatientInfo() {
        nameTxt.setText(wr.getPatient().getPerson().getName());
        ageTxt.setText(String.valueOf(wr.getPatient().getPerson().getBirthday()));
        bloodPTxt.setText(String.valueOf(wr.getPatient().getPerson().getBloodPress()));
        tempTxt.setText(String.valueOf(wr.getPatient().getPerson().getTemperature()));
        typeTxt.setText(String.valueOf(wr.getPatient().getPerson().getType()));
        System.out.println(wr.getPatient().getPerson().getType());
        pulseTxt.setText(String.valueOf(wr.getPatient().getPerson().getPulse()));
        populateTreatementHistory();
    }

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
