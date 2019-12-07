/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Lab;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.DonorOrganisation;
import Business.Organization.LabOrganization;
import Business.Organization.NurseOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Bussiness.WorkQueue.DonorRequest;
import Bussiness.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author namratha
 */


public class LabJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LabJPanel
     */
    
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private LabOrganization labOrganization;
    private Enterprise enterprise;

    public LabJPanel(JPanel userProcessContainer, UserAccount account, Organization organization,
            Enterprise enterprise,EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.labOrganization = (LabOrganization) organization;
        this.enterprise = enterprise;
        this.business=business;
        populateTable();
        }
    
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest labrequest :  labOrganization.getWorkQueue().getWorkRequestList()) {
            System.out.println("lab panel"+labOrganization.getWorkQueue().getWorkRequestList());
            DonorRequest request=(DonorRequest) labrequest;//**
            Object[] row = new Object[10];
         
            row[0] = labrequest;
            row[1]= request.getName();
            row[2]=request.getBlood();
            row[4] = labrequest.getDate();
           
            row[3] = request.getLabTechnician() == null ? null : request.getLabTechnician().getEmployee().getName();
            row[5] = labrequest.getStatus();
            row[6]= request.getBloodBank();
            System.out.println(row[1]);

            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        assignBtn = new javax.swing.JButton();
        processBtn = new javax.swing.JButton();

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Sender", "Name", "Blood Group", "Reciever", "Date", "Status", "Blood Bank"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        assignBtn.setBackground(new java.awt.Color(255, 168, 125));
        assignBtn.setForeground(new java.awt.Color(254, 254, 254));
        assignBtn.setText("Assign to me");
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });

        processBtn.setBackground(new java.awt.Color(255, 168, 125));
        processBtn.setForeground(new java.awt.Color(254, 254, 254));
        processBtn.setText("Process");
        processBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(assignBtn)
                        .addGap(197, 197, 197)
                        .addComponent(processBtn)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(processBtn)
                    .addComponent(assignBtn))
                .addContainerGap(183, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = workRequestJTable.getSelectedRow();
       
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row", "Information", JOptionPane.INFORMATION_MESSAGE);
            return;
         
        }
         DonorRequest labRequest =(DonorRequest)  workRequestJTable.getValueAt(selectedRow, 0);
        if(labRequest.getStatus().equalsIgnoreCase("completed")){
            JOptionPane.showMessageDialog(null, "Blood donation completed");
            return;
        }
        
         if(labRequest.getStatus().equalsIgnoreCase("pending")){
            JOptionPane.showMessageDialog(null, "Blood donation in process");
            return;
        }
         
         if(labRequest.getStatus().equalsIgnoreCase("processing")){
            JOptionPane.showMessageDialog(null, "Blood donation in process");
            return;
        }
          if(labRequest.getStatus().equalsIgnoreCase("sent")){
             labRequest.setLabTechnician(userAccount);
              labRequest.setStatus("Pending");
          }
        //labRequest.s("");
       
        populateTable();
    }//GEN-LAST:event_assignBtnActionPerformed

    private void processBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processBtnActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = workRequestJTable.getSelectedRow();
     
        if (selectedRow < 0) {
                JOptionPane.showMessageDialog(null, "Please select a row", "Information", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
           DonorRequest labRequest = (DonorRequest) workRequestJTable.getValueAt(selectedRow, 0);
        if (selectedRow >= 0) {
           if(labRequest.getStatus().equalsIgnoreCase("sent")){
            JOptionPane.showMessageDialog(null, "Assign to Lab technician");
            return;
        }
            
          if(labRequest.getStatus().equalsIgnoreCase("completed")){
            JOptionPane.showMessageDialog(null, "Blood donation completed");
            return;
        }
        
         if(labRequest.getStatus().equalsIgnoreCase("pending")&& labRequest.getLabTechnician().getUsername()!=userAccount.getUsername()){
            JOptionPane.showMessageDialog(null, "Blood donation in pending by other lab technician");
            return;
        }
         
         if(labRequest.getStatus().equalsIgnoreCase("processing")&& labRequest.getLabTechnician()!=userAccount){
            JOptionPane.showMessageDialog(null, "Blood donation in process by other lab technician");
            return;
        }
            
           
            labRequest.setStatus("Processing");
            populateTable();
            testResultsJPanel testResultContainer = new testResultsJPanel(userProcessContainer, userAccount, labRequest, enterprise, business);
            userProcessContainer.add("processWorkRequestJPanel", testResultContainer);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        } else {
            JOptionPane.showMessageDialog(null, "Please Select any row");
        }
         
    }//GEN-LAST:event_processBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processBtn;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
