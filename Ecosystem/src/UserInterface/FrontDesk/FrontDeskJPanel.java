/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FrontDesk;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Entity.HospitalStatus;
import Business.Organization.CommonUserOrganization;
import Business.Organization.FrontDeskEmployeeOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Bussiness.WorkQueue.DonorRequest;
import Bussiness.WorkQueue.HospitalInnerRequest;
import Bussiness.WorkQueue.WorkRequest;
import java.awt.CardLayout;
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
public class FrontDeskJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private FrontDeskEmployeeOrganization organization;
    private Enterprise enterprise;
    private WorkRequest wr;
    private UserAccount next;
    private UserAccount curr;
    private HospitalInnerRequest wrinner;
    private DonorRequest dr;
    private int selectedRow = -1;
    private HospitalStatus lastStatus;

    /**
     * Creates new form FrontJPanel
     */
    public FrontDeskJPanel(JPanel userProcessContainer, UserAccount account, FrontDeskEmployeeOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.curr = account;
        this.business = business;
        this.enterprise = enterprise;
        this.organization = organization;
        populateWrTable();
        populateStaff();
        populateSpeComboBox();
        populateRqTable();
        dueTxt.setText("12/08/19 09:00:00");
    }

    private void populateStaff() {
        staffcombo.removeAllItems();
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
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

    private void populateRqTable() {
        DefaultTableModel model = (DefaultTableModel) rqTable.getModel();
        model.setRowCount(0);

        for (WorkRequest rq : organization.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[5];
            row[0] = rq;
            row[1] = rq.getReceiver();
            // row[2] = rq.getSender();
            row[2] = rq.getStatus();
            row[3] = rq.getResolveDate();
            model.addRow(row);
        }

    }

    private void populateWrTable() {
        DefaultTableModel model = (DefaultTableModel) wrTable.getModel();
        model.setRowCount(0);
        for (WorkRequest rq : enterprise.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[4];
            row[0] = rq;
            row[1] = rq.getAppointmentDate();
            row[2] = rq.getMessage();
            row[3] = rq.getStatus();
            model.addRow(row);
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

        selectBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        appBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        wrTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        dueTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        staffcombo = new javax.swing.JComboBox();
        massageTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        statuscombo = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        rqTable = new javax.swing.JTable();

        selectBtn.setBackground(new java.awt.Color(255, 168, 125));
        selectBtn.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        selectBtn.setForeground(new java.awt.Color(254, 254, 254));
        selectBtn.setText("Select");
        selectBtn.setPreferredSize(new java.awt.Dimension(197, 41));
        selectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Front Desk Dash Board");

        appBtn.setBackground(new java.awt.Color(255, 168, 125));
        appBtn.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        appBtn.setForeground(new java.awt.Color(254, 254, 254));
        appBtn.setText("Appointment");
        appBtn.setPreferredSize(new java.awt.Dimension(197, 41));
        appBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appBtnActionPerformed(evt);
            }
        });

        cancelBtn.setBackground(new java.awt.Color(255, 168, 125));
        cancelBtn.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(254, 254, 254));
        cancelBtn.setText("Cancel");
        cancelBtn.setPreferredSize(new java.awt.Dimension(197, 41));
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Emergency");

        wrTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "from", "due", "event", "Status"
            }
        ));
        jScrollPane2.setViewportView(wrTable);

        jLabel12.setText("Due");

        jLabel4.setText("staff");

        staffcombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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

        jLabel5.setText("Work Queue");

        rqTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "from", "patient", "Status", "resolve time"
            }
        ));
        jScrollPane3.setViewportView(rqTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(747, 747, 747)
                        .addComponent(appBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(statuscombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addGap(30, 30, 30)
                                        .addComponent(staffcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(68, 68, 68)
                                        .addComponent(jLabel12)
                                        .addGap(112, 112, 112))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(massageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dueTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(selectBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(appBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(staffcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(statuscombo)
                        .addComponent(jLabel12)
                        .addComponent(dueTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(massageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
private void delFdWq(WorkRequest wr) {
        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (o instanceof FrontDeskEmployeeOrganization) {
                o.getWorkQueue().getWorkRequestList().remove(wr);
            }

        }
    }
    private void selectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBtnActionPerformed
        selectedRow = rqTable.getSelectedRow();
        if (selectedRow >= 0) {
            wr = (WorkRequest) rqTable.getValueAt(selectedRow, 0);
            //delFdWq(wr);
        } else {
            JOptionPane.showMessageDialog(null, "Please select any row");
        }
    }//GEN-LAST:event_selectBtnActionPerformed

    private void appBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appBtnActionPerformed
        FrontDeskApptJPanel panel = new FrontDeskApptJPanel(userProcessContainer, curr, organization,
                enterprise, business);
        userProcessContainer.add("CreateEmployeeJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_appBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        selectedRow = rqTable.getSelectedRow();
        if (selectedRow >= 0) {
            wr = (WorkRequest) rqTable.getValueAt(selectedRow, 0);
            delFdWq(wr);
            populateRqTable();
        } else {
            JOptionPane.showMessageDialog(null, "Please select any row");
        }
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select any row");
            return;
        }

        HospitalStatus status = (HospitalStatus) statuscombo.getSelectedItem();
        if (wrinner == null) {
            wrinner = new HospitalInnerRequest();
        }
        wrinner.setSender(curr);
        wrinner.setMessage(massageTxt.getText());
        wrinner.setPatient(wr.getReceiver());
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
                enterprise.getWorkQueue().getWorkRequestList().remove(wrinner);
                enterprise.getWorkQueue().getWorkRequestList().add(wrinner);
                lastStatus = HospitalStatus.URGENT;
            } else {

            }
        } else {
            if (lastStatus != null) {
                enterprise.getWorkQueue().getWorkRequestList().remove(wrinner);
            }

            next = (UserAccount) staffcombo.getSelectedItem();
            wrinner.setReceiver(next);
            next.getWorkQueue().getWorkRequestList().remove(wrinner);
            next.getWorkQueue().getWorkRequestList().add(wrinner);

        }
        wr.setResolveDate(new Date());
        wr.setStatus(status.getValue());
        wr.setMessage(massageTxt.getText());
        System.out.println(status.getValue());
        if (wr.getReceiver().getPerson().getTreatmentHistory() != null) {
            wr.getReceiver().getPerson().getTreatmentHistory().remove(wr);
            wr.getReceiver().getPerson().getTreatmentHistory().add(wr);
        }//receiver is patient here

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof FrontDeskEmployeeOrganization) {
                organization.getWorkQueue().getWorkRequestList().remove(wr);
            }
        }
        populateRqTable();
        JOptionPane.showMessageDialog(null, "send request");

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton appBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextField dueTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField massageTxt;
    private javax.swing.JTable rqTable;
    private javax.swing.JButton selectBtn;
    private javax.swing.JComboBox staffcombo;
    private javax.swing.JComboBox statuscombo;
    private javax.swing.JTable wrTable;
    // End of variables declaration//GEN-END:variables
}
