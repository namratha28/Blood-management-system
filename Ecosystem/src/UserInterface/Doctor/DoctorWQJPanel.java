/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Doctor;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Entity.HospitalStatus;
import Business.Event.HospitalEvent;
import Business.Organization.CommonUserOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.NurseOrganization;
import Business.Organization.Organization;
import Business.Role.LabRole;
import Business.UserAccount.UserAccount;
import Bussiness.WorkQueue.DonorRequest;
import Bussiness.WorkQueue.HospitalInnerRequest;
import Bussiness.WorkQueue.WorkRequest;

import java.awt.CardLayout;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Huangdong Wen <wen.hu@husky.neu.edu>
 */
public class DoctorWQJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private WorkRequest wr;

    private Enterprise e;
    private UserAccount next;
    private UserAccount curr;
    HospitalInnerRequest wrinner;
    DonorRequest dr;
    HospitalStatus lastStatus;

    public DoctorWQJPanel(WorkRequest wr, JPanel userProcessContainer, Enterprise e, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.wr = wr;
        this.e = e;
        this.curr = userAccount;
        populatePatientInfo();
        populateSpeComboBox();
        populateStaff();

        dueTxt.setText("11/22/80 00:00:00");
    }

    private void populateStaff() {
        staffcombo.removeAllItems();
        for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
            if (!(org instanceof CommonUserOrganization)) {
//                if(org instanceof LabOrganization){
//                    staffcombo.addItem(org);
//                }

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
        jLabel3 = new javax.swing.JLabel();
        staffcombo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        historyTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dueTxt = new javax.swing.JTextField();

        jLabel4.setText("Blood Type");

        jLabel1.setText("Patient Inforamtion");

        jLabel2.setText("name");

        jLabel5.setText("age");

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
                                .addGap(594, 594, 594)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                            .addComponent(dueTxt))))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(massageTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 925, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                        .addComponent(jLabel4)
                                        .addGap(71, 71, 71)
                                        .addComponent(typeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(pulseTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tempTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))))
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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(typeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bloodPTxt)
                            .addComponent(ageTxt))
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
                .addComponent(jButton1)
                .addGap(93, 93, 93))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
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
    }//GEN-LAST:event_btnBackActionPerformed
//11/11/19 08:00:00
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
    private javax.swing.JComboBox staffcombo;
    private javax.swing.JComboBox statuscombo;
    private javax.swing.JTextField tempTxt;
    private javax.swing.JTextField typeTxt;
    // End of variables declaration//GEN-END:variables

    private void populatePatientInfo() {
        nameTxt.setText(wr.getPatient().getPerson().getName());
        ageTxt.setText(String.valueOf(wr.getPatient().getPerson().getAge()));
        bloodPTxt.setText(String.valueOf(wr.getPatient().getPerson().getBloodPress()));
        tempTxt.setText(String.valueOf(wr.getPatient().getPerson().getTemperature()));
        typeTxt.setText(wr.getPatient().getPerson().getType().getValue());
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
