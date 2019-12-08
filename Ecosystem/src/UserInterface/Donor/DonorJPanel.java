/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Donor;

import Business.EcoSystem;
import Business.Enterprise.BloodBankEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.PharmacyEnterprise;
import Business.Network.Network;
import Business.Organization.BloodCollectionStationOrganization;
import Business.Organization.DoctorOrganization;
import Business.Organization.EventsOrganization;
import Business.Organization.DonorOrganisation;
import Business.Organization.LabOrganization;
import Business.Organization.MedicalOrganisation;
import Business.Organization.NurseOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Bussiness.WorkQueue.DonorRequest;
import Bussiness.WorkQueue.MedicineRequest;
import Bussiness.WorkQueue.EventRequest;
import Bussiness.WorkQueue.WorkRequest;
import UserInterface.CreateEvents.ViewEventJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author namratha
 */
public class DonorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DonorJPanel
     */
    
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private DonorOrganisation donorOrganisation;
    private EventsOrganization eventOrganization;
    private Organization organization;
    private Enterprise enterprise;

    public DonorJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, 
            Enterprise enterprise,EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.organization = organization;
        this.donorOrganisation = (DonorOrganisation) organization;
        this.enterprise = enterprise;
        this.business=business;
        
        populateTable();
        populateNetworkComboBox();
        populateBloodBankComboBox();
        populateGroupComboBox();
        checkForDisabled();
        }
    public Boolean checkForDisabled(){
       for (WorkRequest req: userAccount.getWorkQueue().getWorkRequestList()){
             DonorRequest request=(DonorRequest) req;
            if(request.isDetailsFilled()){
              
                nameLbl.setVisible(true);
                nameLbl.setText(request.getName());
                msgLabel.setText("You have already registered to donate blood");
                NameTxtField.setEnabled(false);
                ageTxtField.setEnabled(false);
                phNoTxtField.setEnabled(false);
                AddressTxtField.setEnabled(false);
                donateBtn.setEnabled(false);
                bloodGroupDropDown.setEnabled(false);
                bloodBankBtn.setEnabled(false);
                return true;
            
            }
            
       
       }
       return false;
    
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
     public void populateBloodBankComboBox()
{
         bloodBankBtn.removeAllItems();
         Organization org = null;
                for (Network network : business.getNetworkList()) {
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                        if (enterprise instanceof BloodBankEnterprise) {
                            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                                if (organization instanceof BloodCollectionStationOrganization) {
                                    for(UserAccount useraccount : organization.getUserAccountDirectory().getUserAccountList())
                                    bloodBankBtn.addItem(useraccount.toString());
                                    
                                }
                            }
                        }

                    }
                }
     }
     public void populateNetworkComboBox() {
         PharmacyJComboBox.removeAllItems();
         Organization org = null;
                for (Network network : business.getNetworkList()) {
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                        if (enterprise instanceof PharmacyEnterprise) {
                            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                                if (organization instanceof MedicalOrganisation) {
                                    for(UserAccount useraccount : organization.getUserAccountDirectory().getUserAccountList())
                                    PharmacyJComboBox.addItem(useraccount.toString());
                                    
                                }
                            }
                        }

                    }
                }
     }
    public void populateTable() {
        System.out.println("hi");
        DefaultTableModel model = (DefaultTableModel) MedicineListTable.getModel();

        model.setRowCount(0);
         MedicineRequest medicineRequest=new MedicineRequest();
        for (WorkRequest request : donorOrganisation.getWorkQueue().getWorkRequestList()) {
            if (request.getClass() != null) {
                String x = request.getClass().toString(); 
                //Business.WorkQueue.CarrierWorkRequest
                //String x = request.getReceiver().getRole().toString();
                
                //Business.WorkQueue.CarrierWorkRequest
                //String x = request.getReceiver().getRole().toString();
                if (x.contains("MedicineRequest")&& request.getSender().getUsername()==userAccount.getUsername()){
                    MedicineRequest medicineWorkRequest = (MedicineRequest) request;
                    Object[] row = new Object[5];
                    if(medicineWorkRequest.getMedicine()==null){
                        continue;
                    }
                    else{
                        row[1] = medicineWorkRequest.getMedicine();
                       // row[2] = medicineWorkRequest.getQuantity();
                        medicineWorkRequest.setSender(userAccount);
                        row[0] =medicineWorkRequest;
                        row[2]=medicineWorkRequest.getStatus();
                        row[3]=medicineWorkRequest.getReceiver();
                        model.addRow(row);
                    }
                    
                }
                
                if (x.contains("EventRequest")){
                  

                    EventRequest eventWorkRequest = (EventRequest) request;
                    System.out.print(eventWorkRequest);
                    Object[] row = new Object[5];
//                    if(eventWorkRequest.getEvent()==null){
//                        continue;
//                    }
                        row[1] = eventWorkRequest.getTitle();
                        row[2] = eventWorkRequest.getLocation();
                        eventWorkRequest.setSender(userAccount);
                        row[0] =eventWorkRequest;
                        row[3]=eventWorkRequest.getEventDate();
                        row[4]=eventWorkRequest.getTime();
                        model.addRow(row);
                    
                    
                }
            }
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

        ageTxtField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        phNoTxtField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NameTxtField = new javax.swing.JTextField();
        donateBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        AddressTxtField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        MedicineListTable = new javax.swing.JTable();
        chckAvailBtn = new javax.swing.JButton();
        PharmacyJComboBox = new javax.swing.JComboBox<>();
        requestMedicineBtn = new javax.swing.JButton();
        bloodBankBtn = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bloodGroupDropDown = new javax.swing.JComboBox<>();
        viewEventBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        msgLabel = new javax.swing.JLabel();

        ageTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTxtFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Name");

        jLabel2.setText("Age");

        phNoTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phNoTxtFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Phone Number");

        jLabel4.setText("Address");

        NameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTxtFieldActionPerformed(evt);
            }
        });

        donateBtn.setText("Donate");
        donateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donateBtnActionPerformed(evt);
            }
        });

        jLabel5.setText("Blood Group");

        AddressTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressTxtFieldActionPerformed(evt);
            }
        });

        MedicineListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sender", "Medicine", "Status", "Pharmacy"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(MedicineListTable);

        chckAvailBtn.setText("Check Availability");
        chckAvailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckAvailBtnActionPerformed(evt);
            }
        });

        PharmacyJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        PharmacyJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PharmacyJComboBoxActionPerformed(evt);
            }
        });

        requestMedicineBtn.setText("Request");
        requestMedicineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestMedicineBtnActionPerformed(evt);
            }
        });

        bloodBankBtn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("Select Blood Bank ");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Donor Potal");

        bloodGroupDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        viewEventBtn.setText("View Events");
        viewEventBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewEventBtnActionPerformed(evt);
            }
        });

        jButton1.setText("See Registrations");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Welcome: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(213, 213, 213)
                                .addComponent(PharmacyJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(chckAvailBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(requestMedicineBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(327, 327, 327)
                                .addComponent(donateBtn)
                                .addGap(18, 18, 18)
                                .addComponent(viewEventBtn)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(209, 209, 209)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 387, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(NameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(311, 311, 311)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel4))
                                                .addGap(38, 38, 38))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(jLabel2))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(jLabel1)))
                                                    .addGap(49, 49, 49))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addContainerGap()
                                                    .addComponent(jLabel6)
                                                    .addGap(29, 29, 29))))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bloodBankBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(phNoTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(ageTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(AddressTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(bloodGroupDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(389, 389, 389)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131)
                .addComponent(msgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(msgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phNoTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(bloodGroupDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddressTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bloodBankBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(donateBtn)
                    .addComponent(viewEventBtn)
                    .addComponent(jButton1))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PharmacyJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chckAvailBtn)
                    .addComponent(requestMedicineBtn))
                .addContainerGap(114, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ageTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTxtFieldActionPerformed

    private void phNoTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phNoTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phNoTxtFieldActionPerformed

    private void NameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTxtFieldActionPerformed

    private void AddressTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressTxtFieldActionPerformed

    private void donateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donateBtnActionPerformed
        // TODO add your handling code here:
        
        if ((!ageTxtField.getText().equals("")) && (!phNoTxtField.getText().equals(""))
                && (!NameTxtField.getText().equals("")) && (!AddressTxtField.getText().equals(""))
                && (!phNoTxtField.getText().equals(""))&& !checkForDisabled()) {

            boolean isError = false;
            try {
                
               
                
                DonorRequest donorrequest = new DonorRequest();
                donorrequest.setName(NameTxtField.getText());
                donorrequest.setAge(Integer.parseInt(ageTxtField.getText()));
                donorrequest.setAddressLine(AddressTxtField.getText());
                donorrequest.setBlood((bloodGroupDropDown.getSelectedItem().toString()));
                donorrequest.setPhoneNo(Integer.parseInt(phNoTxtField.getText()));
                donorrequest.setSender(userAccount);
                donorrequest.setBloodBank(bloodBankBtn.getSelectedItem().toString());
                donorrequest.setStatus("Sent");
                donorrequest.setDetailsFilled(true);
                
                
                
                System.out.println(donorrequest.getStatus());
                //System.out.println(donorrequest.getPhoneNo());
                Organization org = null;
                for (Network network : business.getNetworkList()) {
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                        if (enterprise instanceof BloodBankEnterprise) {
                            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                                if (organization instanceof LabOrganization) {
                                    org = organization;
                                     org.getWorkQueue().getWorkRequestList().add(donorrequest);
                                    System.out.println("lab org1"+org);
                                    System.out.println(org.getWorkQueue().getWorkRequestList());
                                    System.out.println(org.getName());
                                    break;
                                }
                            }
                        }

                    }
                }
                

                if (org != null) {
                    //System.out.println("userinterface.Farmer.RequestDoctorTreatmentWorkAreaJPanel.requestTestJButtonActionPerformed()");
                   
                    userAccount.getWorkQueue().getWorkRequestList().add(donorrequest);

                    //JOptionPane.showMessageDialog(null, "You have successfully submitted your treatment request !", "Information", JOptionPane.INFORMATION_MESSAGE);
                }
               
        //MedicineRequest MedicineRequest = (MedicineRequest) MedicineListTable.getValueAt(selectedRow, 0);
        String userAccountSelected = bloodBankBtn.getSelectedItem().toString();
        UserAccount UserAccountSel= null;
        Organization org1 = null;
        
          
                for (Network network : business.getNetworkList()) {
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                        if (enterprise instanceof BloodBankEnterprise) {
                            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                                if (organization instanceof BloodCollectionStationOrganization) {
                                    for(UserAccount useraccount : organization.getUserAccountDirectory().getUserAccountList()){
                                        System.out.println(useraccount.getUsername()+" "+userAccountSelected);
                                            if(useraccount.getUsername().equals(userAccountSelected)){
                                                 org1 = organization;
                                                 UserAccountSel=useraccount;
                                                   System.out.println("donate org"+org1+" "+UserAccountSel);
                                                 break;
                                            
                                            }
                                                 
                                    }
                                       
                                }
                            }
                        

                    }
                }
                }
                if (org1 != null) {
                    //System.out.println("userinterface.Farmer.RequestDoctorTreatmentWorkAreaJPanel.requestTestJButtonActionPerformed()");
                    org1.getWorkQueue().getWorkRequestList().add(donorrequest);
                    UserAccountSel.getWorkQueue().getWorkRequestList().add(donorrequest);

                    JOptionPane.showMessageDialog(null, "You have successfully your request !", "Information", JOptionPane.INFORMATION_MESSAGE);
                }

        
        
            }
            
            catch (Exception e3){
                isError = true;
                JOptionPane.showMessageDialog(null, "Please input the details in proper format", "Warning", JOptionPane.WARNING_MESSAGE);
            
                
            }
        }
        else{
            
          if(!checkForDisabled()){
               JOptionPane.showMessageDialog(null, "You have already registered to donate blood", "Warning", JOptionPane.WARNING_MESSAGE);
          }
          else{
               JOptionPane.showMessageDialog(null, "Please Fill all fields", "Warning", JOptionPane.WARNING_MESSAGE);
          
          }
          
        
        }

    }//GEN-LAST:event_donateBtnActionPerformed

    private void requestMedicineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestMedicineBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = MedicineListTable.getSelectedRow();
          if(selectedRow<0){
                JOptionPane.showMessageDialog(null, "No row selected ", "Information", JOptionPane.INFORMATION_MESSAGE);
               return;
        }
        MedicineRequest medicineRequest = (MedicineRequest) MedicineListTable.getValueAt(selectedRow, 0);
         Object selectedItem=PharmacyJComboBox.getSelectedItem();
         if(selectedItem==null){
               JOptionPane.showMessageDialog(null, "No Pharmacy available near you", "Information", JOptionPane.INFORMATION_MESSAGE);
               return;
        }
        String userAccountSelected = PharmacyJComboBox.getSelectedItem().toString();
        UserAccount UserAccountSel= null;
        Organization org = null;
         if(medicineRequest.getStatus().equals("Requested")) {
            JOptionPane.showMessageDialog(null, "Already Requested Pharmacy to deliver medicines", "Information", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
         if(medicineRequest.getStatus().equals("Completed")) {
            JOptionPane.showMessageDialog(null, "Medicine already recieved by donor ", "Information", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
         if(medicineRequest.getStatus().equals("Not available")) {
            JOptionPane.showMessageDialog(null, "Not available check with other pharmacy ", "Information", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
         
        if (selectedRow >= 0 &&  medicineRequest.getStatus().equalsIgnoreCase("Available") 
                &&(userAccountSelected==medicineRequest.getReceiver().getUsername())) {
          
                for (Network network : business.getNetworkList()) {
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                        if (enterprise instanceof PharmacyEnterprise) {
                            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                                if (organization instanceof MedicalOrganisation) {
                                    for(UserAccount useraccount : organization.getUserAccountDirectory().getUserAccountList()){
                                        System.out.println(useraccount.getUsername()+" "+userAccountSelected);
                                            if(useraccount.getUsername().equals(userAccountSelected)){
                                                 org = organization;
                                                 UserAccountSel=useraccount;
                                                   System.out.println(org+" "+UserAccountSel);
                                                 break;
                                            
                                            }
                                                 
                                    }
                                       
                                }
                            }
                        }

                    }
                }
              
                if (org != null) {
                    //System.out.println("userinterface.Farmer.RequestDoctorTreatmentWorkAreaJPanel.requestTestJButtonActionPerformed()");
                    org.getWorkQueue().getWorkRequestList().add(medicineRequest);
                    UserAccountSel.getWorkQueue().getWorkRequestList().add(medicineRequest);
                     medicineRequest.setStatus("Requested");
                     medicineRequest.setReceiver(UserAccountSel);
                     populateTable();
                    JOptionPane.showMessageDialog(null, "You have successfully submitted your Medicine request ", "Information", JOptionPane.INFORMATION_MESSAGE);
                }

        
        }
      
    }//GEN-LAST:event_requestMedicineBtnActionPerformed

    private void PharmacyJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PharmacyJComboBoxActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_PharmacyJComboBoxActionPerformed

    private void chckAvailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chckAvailBtnActionPerformed
        // TODO add your handling code here:

         int selectedRow = MedicineListTable.getSelectedRow();
           if(selectedRow<0){
                JOptionPane.showMessageDialog(null, "No row selected ", "Information", JOptionPane.INFORMATION_MESSAGE);
               return;
        }

        MedicineRequest medicineRequest = (MedicineRequest) MedicineListTable.getValueAt(selectedRow, 0);
        Object selectedItem=PharmacyJComboBox.getSelectedItem();
         if(selectedItem==null){
               JOptionPane.showMessageDialog(null, "No Pharmacy available near you", "Information", JOptionPane.INFORMATION_MESSAGE);
               return;
        }
        String userAccountSelected = PharmacyJComboBox.getSelectedItem().toString();
       
        if(medicineRequest.getStatus()!=null){
            
             if(medicineRequest.getStatus().equals("Requested")) {
                JOptionPane.showMessageDialog(null, "Already Requested to pharmacy to deliver medicine ", "Information", JOptionPane.INFORMATION_MESSAGE);
                return;
        }
         if(medicineRequest.getStatus().equals("Completed")) {
                JOptionPane.showMessageDialog(null, "Medicine already recieved by donor", "Information", JOptionPane.INFORMATION_MESSAGE);
                return;
        }
        }
       
        UserAccount UserAccountSel= null;
        Organization org = null;
        if (selectedRow >= 0) {
          
                for (Network network : business.getNetworkList()) {
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                        if (enterprise instanceof PharmacyEnterprise) {
                            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                                if (organization instanceof MedicalOrganisation) {
                                    for(UserAccount useraccount : organization.getUserAccountDirectory().getUserAccountList()){
                                        System.out.println(useraccount.getUsername()+" "+userAccountSelected);
                                            if(useraccount.getUsername().equals(userAccountSelected)){
                                                 org = organization;
                                                 UserAccountSel=useraccount;
                                                  
                                                   
                                                 break;
                                            
                                            }
                                                 
                                    }
                                       
                                }
                            }
                        }

                    }
                }
               Boolean avail=false;
              
               for(WorkRequest req:  UserAccountSel.getWorkQueue().getWorkRequestList()){
                   MedicineRequest req1=(MedicineRequest) req;
                   System.out.println(req1.getAvailMedicine());
                   System.out.println(medicineRequest.getMedicine());
                 if(req1.getAvailMedicine()!=null){
                     if(req1.getAvailMedicine().equalsIgnoreCase(medicineRequest.getMedicine())){
                         System.out.println("avilable");
                         medicineRequest.setReceiver(UserAccountSel);
                         avail=true;
                  }
                 
                 }
                  
               }
                if (avail == true) {
                    //System.out.println("userinterface.Farmer.RequestDoctorTreatmentWorkAreaJPanel.requestTestJButtonActionPerformed()");
                    medicineRequest.setStatus("available");
                    JOptionPane.showMessageDialog(null, "Avialable", "Information", JOptionPane.INFORMATION_MESSAGE);
                    populateTable();
                }
                if(avail == false){
                    medicineRequest.setStatus("Not available");
                    JOptionPane.showMessageDialog(null, "Not Avialable", "Information", JOptionPane.INFORMATION_MESSAGE);
                    populateTable();
                }

        
        }
        
          if(medicineRequest.getStatus().equals("Not Available")) {
            JOptionPane.showMessageDialog(null, "Not available check with other pharmacy ", "Information", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

    }//GEN-LAST:event_chckAvailBtnActionPerformed

    private void viewEventBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewEventBtnActionPerformed
        // TODO add your handling code here:
        DonorViewEventsJPanel dviewEventJPanel = new DonorViewEventsJPanel(userProcessContainer, userAccount, enterprise, business, organization );
        userProcessContainer.add("DViewEventJPanel", dviewEventJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewEventBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ViewRegEventsJPanel regPanel = new ViewRegEventsJPanel(userProcessContainer, enterprise, userAccount );
        userProcessContainer.add("regPanel", regPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressTxtField;
    private javax.swing.JTable MedicineListTable;
    private javax.swing.JTextField NameTxtField;
    private javax.swing.JComboBox<String> PharmacyJComboBox;
    private javax.swing.JTextField ageTxtField;
    private javax.swing.JComboBox<String> bloodBankBtn;
    private javax.swing.JComboBox<String> bloodGroupDropDown;
    private javax.swing.JButton chckAvailBtn;
    private javax.swing.JButton donateBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel msgLabel;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField phNoTxtField;
    private javax.swing.JButton requestMedicineBtn;
    private javax.swing.JButton viewEventBtn;
    // End of variables declaration//GEN-END:variables
}
