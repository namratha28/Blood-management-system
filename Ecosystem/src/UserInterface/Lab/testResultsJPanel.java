/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Lab;

import Business.EcoSystem;
import Business.Enterprise.BloodBankEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.BloodCollectionStationOrganization;
import Business.Organization.DonorOrganisation;
import Business.Organization.LabOrganization;
import Business.Organization.MedicalOrganisation;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Bussiness.WorkQueue.DonorRequest;
import Bussiness.WorkQueue.MedicineRequest;
import Bussiness.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author namratha
 */
public class testResultsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form testResultsJPanel
     */
     private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private DonorRequest request;
    private Enterprise enterprise;

    public testResultsJPanel(JPanel userProcessContainer, UserAccount account, DonorRequest request,
            Enterprise enterprise,EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.request = (DonorRequest) request;
        this.enterprise = enterprise;
        this.business=business; 
        initComponents();
        populateGroupComboBox();
    }
     public void populateGroupComboBox()
      {
         bloodGroupDropDown.removeAllItems();
         bloodGroupDropDown.addItem("A+");
         bloodGroupDropDown.addItem("A-");
         bloodGroupDropDown.addItem("B+");
         bloodGroupDropDown.addItem("B-");
         bloodGroupDropDown.addItem("O+");
         bloodGroupDropDown.addItem("O-");
         bloodGroupDropDown.addItem("AB+");
         bloodGroupDropDown.addItem("AB-");
                                 
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BPTxtField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tempTxtField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        HRTxtField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        platlatesTxtField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        healthyYesBtn = new javax.swing.JRadioButton();
        HealthyNoBtn = new javax.swing.JRadioButton();
        AntibioticYes = new javax.swing.JRadioButton();
        AntibioticNo = new javax.swing.JRadioButton();
        VaccineYes = new javax.swing.JRadioButton();
        vaccineNo = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        InfectionYes = new javax.swing.JRadioButton();
        InfectionNo = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        AspirinYes = new javax.swing.JRadioButton();
        AspirinNo = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        bloodYes = new javax.swing.JRadioButton();
        BloodNo = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        MedicineTxtField = new javax.swing.JTextField();
        PrescribeMedicineBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MedicineListTable = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        bloodGroupDropDown = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("BP");

        BPTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPTxtFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Temperature");

        tempTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempTxtFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Heart Rate");

        HRTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HRTxtFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Platlates");

        platlatesTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                platlatesTxtFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Are You");

        healthyYesBtn.setText("Yes");

        HealthyNoBtn.setText("No");

        AntibioticYes.setText("Yes");

        AntibioticNo.setText("No");

        VaccineYes.setText("Yes");
        VaccineYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VaccineYesActionPerformed(evt);
            }
        });

        vaccineNo.setText("No");

        jLabel6.setText("In the past 48 hours");

        jLabel7.setText("Have you taken aspirin or anything that has aspirin in it?");

        InfectionYes.setText("Yes");

        InfectionNo.setText("No");

        jLabel8.setText("In the past 8 weeks, have you");

        jLabel9.setText("Donated blood, platelets or plasma?");

        AspirinYes.setText("Yes");
        AspirinYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AspirinYesActionPerformed(evt);
            }
        });

        AspirinNo.setText("No");

        jLabel10.setText("Had any vaccinations or other shots?");

        bloodYes.setText("Yes");
        bloodYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodYesActionPerformed(evt);
            }
        });

        BloodNo.setText("No");

        jLabel11.setText("Feeling healthy and well today?");

        jLabel12.setText("Currently taking any antibiotic?");

        jLabel13.setText("Currently taking any other medication for an infection?");

        submitBtn.setText("Submit Result");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        jLabel14.setText("Medicine");

        PrescribeMedicineBtn.setText("Prescribe Medicines");
        PrescribeMedicineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrescribeMedicineBtnActionPerformed(evt);
            }
        });

        MedicineListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Donor", "Medicine"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(MedicineListTable);

        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel16.setText("ENTER TEST REPORTS");

        jLabel15.setText("Blood Group");

        bloodGroupDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel13))
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(healthyYesBtn)
                                            .addComponent(AntibioticYes)
                                            .addComponent(InfectionYes)
                                            .addComponent(AspirinYes)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(38, 38, 38)
                                        .addComponent(bloodGroupDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AspirinNo)
                                    .addComponent(InfectionNo)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(HealthyNoBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(AntibioticNo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1)
                                        .addGap(140, 140, 140))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(VaccineYes)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(vaccineNo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bloodYes)
                                        .addGap(24, 24, 24)
                                        .addComponent(BloodNo)))))
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(platlatesTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(HRTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tempTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(95, 95, 95)
                                .addComponent(BPTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 554, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(PrescribeMedicineBtn)
                                        .addGap(263, 263, 263))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(33, 33, 33)
                                        .addComponent(MedicineTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(233, 233, 233)
                                .addComponent(jLabel16)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(submitBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backBtn)
                        .addGap(390, 390, 390))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(BPTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(tempTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14)
                                    .addComponent(MedicineTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(HRTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(PrescribeMedicineBtn)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(platlatesTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel15)
                                            .addComponent(bloodGroupDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel11))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(healthyYesBtn)
                                    .addComponent(HealthyNoBtn))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(AntibioticYes)
                                .addComponent(AntibioticNo))
                            .addComponent(jLabel12)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InfectionYes)
                    .addComponent(InfectionNo)
                    .addComponent(jLabel13))
                .addGap(46, 46, 46)
                .addComponent(jLabel6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AspirinYes)
                            .addComponent(AspirinNo))))
                .addGap(28, 28, 28)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BloodNo)
                    .addComponent(bloodYes))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(VaccineYes)
                        .addComponent(vaccineNo)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(submitBtn)
                        .addContainerGap(47, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backBtn)
                        .addGap(27, 27, 27))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BPTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BPTxtFieldActionPerformed

    private void tempTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tempTxtFieldActionPerformed

    private void HRTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HRTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HRTxtFieldActionPerformed

    private void platlatesTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_platlatesTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_platlatesTxtFieldActionPerformed

    private void VaccineYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VaccineYesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VaccineYesActionPerformed

    private void AspirinYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AspirinYesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AspirinYesActionPerformed

    private void bloodYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodYesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodYesActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
       
       
        
        
        Boolean sel=true;
        Boolean error=false;
        try{
         int Bp=Integer.parseInt(BPTxtField.getText());
        int Hr=Integer.parseInt(HRTxtField.getText());
        int temp=Integer.parseInt(tempTxtField.getText());
        int pulse=Integer.parseInt(platlatesTxtField.getText());
        if (healthyYesBtn.isSelected() && AntibioticNo.isSelected() && InfectionNo.isSelected() && AspirinNo.isSelected() && 
                BloodNo.isSelected() && vaccineNo.isSelected() && (pulse>150000 && pulse<600000 ) &&(temp<100 && temp>96)
                && (Hr<80 &&Hr>60) && (Bp<140 && Bp>110)
                ) {
               sel=true;   
         }
        else{
        
          sel=false;
        }
        }
        catch (Exception e3){
              sel=false;
              error=true;
                JOptionPane.showMessageDialog(null, "Please input the details in proper format", "Warning", JOptionPane.WARNING_MESSAGE);
            
                
         }
//        if (HealthyNoBtn.isSelected()) {
//               sel=false;   
//         }
//        if(AntibioticNo.isSelected()){
//               sel=true;
//        }
//        if(AntibioticYes.isSelected()){
//                sel=true;
//        }
//        if(InfectionNo.isSelected()){
//                sel=false;
//        }
//        if(InfectionYes.isSelected()){
//                sel=true;
//        }
//        if(AspirinNo.isSelected()){
//            sel=false;
//        }
//        if(AspirinYes.isSelected()){
//           sel=true;
//        }
//        if(BloodNo.isSelected()){
//            sel=false;
//        }
//        if(bloodYes.isSelected()){
//            sel=true;
//        }
//        if(VaccineYes.isSelected()){
//            sel=true;
//        }
//        if(vaccineNo.isSelected()){
//              sel=false;
//        }
          
        if(sel==false && error == false){
          
            request.setStatus("Not approved");
            JOptionPane.showMessageDialog(null, "You are not eligible to donate blood", "Information", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        else if(sel==true && error== false){
             request.setStatus("Completed");
             JOptionPane.showMessageDialog(null, "Test Successful", "Information", JOptionPane.INFORMATION_MESSAGE);
             Organization org = null;
                for (Network network : business.getNetworkList()) {
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                        if (enterprise instanceof BloodBankEnterprise) {
                            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                                if (organization instanceof BloodCollectionStationOrganization) {
                                    org = organization;
                                    break;
                                }
                            }
                        }

                    }
                }

                if (org != null) {
                    System.out.println("userinterface.Farmer.RequestDoctorTreatmentWorkAreaJPanel.requestTestJButtonActionPerformed()");
                    org.getWorkQueue().getWorkRequestList().add(request);
                    userAccount.getWorkQueue().getWorkRequestList().add(request);
                    
             
        }
        }
             
    }//GEN-LAST:event_submitBtnActionPerformed
public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) MedicineListTable.getModel();

        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            if (request.getClass() != null) {
                String x = request.getClass().toString();
                //Business.WorkQueue.CarrierWorkRequest
                //String x = request.getReceiver().getRole().toString();
                if(x.contains("MedicineRequest")){
                    MedicineRequest medicineWorkRequest = (MedicineRequest) request;
                    Object[] row = new Object[2];
                    row[1] = medicineWorkRequest.getMedicine();
                    row[0] = medicineWorkRequest;

                    model.addRow(row);
                }
              
            }
        }
    }
    private void PrescribeMedicineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrescribeMedicineBtnActionPerformed
        // TODO add your handling code here:
       
        String medicineName = MedicineTxtField.getText();
       
       
        
        MedicineRequest  medicineRequest=new MedicineRequest();
     
        medicineRequest.setSender(request.getSender());
        medicineRequest.setMedicine(medicineName);
        System.out.println(medicineRequest);
       

        Organization org = null;
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise instanceof BloodBankEnterprise) {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof DonorOrganisation) {
                            org = organization;
                            //                            System.out.println("orgname" + organization.getName());
                            org.getWorkQueue().getWorkRequestList().add(medicineRequest);
                            break;
                        }
                    }
                }

            }
        }

        if (org != null) {

            userAccount.getWorkQueue().getWorkRequestList().add(medicineRequest);
            JOptionPane.showMessageDialog(null, "Requested medicines successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
            populateRequestTable();

        }
    }//GEN-LAST:event_PrescribeMedicineBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LabJPanel dwjp = (LabJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AntibioticNo;
    private javax.swing.JRadioButton AntibioticYes;
    private javax.swing.JRadioButton AspirinNo;
    private javax.swing.JRadioButton AspirinYes;
    private javax.swing.JTextField BPTxtField;
    private javax.swing.JRadioButton BloodNo;
    private javax.swing.JTextField HRTxtField;
    private javax.swing.JRadioButton HealthyNoBtn;
    private javax.swing.JRadioButton InfectionNo;
    private javax.swing.JRadioButton InfectionYes;
    private javax.swing.JTable MedicineListTable;
    private javax.swing.JTextField MedicineTxtField;
    private javax.swing.JButton PrescribeMedicineBtn;
    private javax.swing.JRadioButton VaccineYes;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox<String> bloodGroupDropDown;
    private javax.swing.JRadioButton bloodYes;
    private javax.swing.JRadioButton healthyYesBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField platlatesTxtField;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTextField tempTxtField;
    private javax.swing.JRadioButton vaccineNo;
    // End of variables declaration//GEN-END:variables
}
