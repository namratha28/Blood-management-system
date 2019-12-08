/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Pharmacy;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.BloodCollectionStationOrganization;
import Business.Organization.MedicalOrganisation;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Bussiness.WorkQueue.DonorRequest;
import Bussiness.WorkQueue.MedicineRequest;
import Bussiness.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author namratha
 */
public class PharmacyJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PharmacyJPanel
     */
     private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private MedicalOrganisation medicalOrganisation;
    private Enterprise enterprise;

    public PharmacyJPanel(JPanel userProcessContainer, UserAccount account, Organization organization,
            Enterprise enterprise,EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.medicalOrganisation = (MedicalOrganisation) organization;
        this.enterprise = enterprise;
        this.business=business;
      
        populateTable();
        populateMedTable();
    }
     public void populateMedTable() {
     DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.setRowCount(0);
         
        //System.out.println(medicalOrganisation.getWorkQueue().getWorkRequestList());
             for (WorkRequest request :  medicalOrganisation.getWorkQueue().getWorkRequestList()) {
            if (request.getClass() != null) {
                String x = request.getClass().toString();
                //Business.WorkQueue.CarrierWorkRequest
                //String x = request.getReceiver().getRole().toString();
                System.out.println(x);
                MedicineRequest req=(MedicineRequest) request;
                if (x.contains("MedicineRequest")&&req.getSender()!=null && req.getSender()==userAccount){
                    Object[] row = new Object[3];
                    row[0]=req;
                    row[1] = req.getAvailMedicine();
                    
                    model.addRow(row);
                  
                     }
                
            }
        }
     }
     public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();

        model.setRowCount(0);
         
      
             for (WorkRequest request :  medicalOrganisation.getWorkQueue().getWorkRequestList()) {
            if (request.getClass() != null) {
                String x = request.getClass().toString();
               
                 
                System.out.println(x);
                MedicineRequest req=(MedicineRequest)request;
                if (x.contains("MedicineRequest")){
                    if(request.getMedicine()!=null){
                        Object[] row = new Object[5];
                        row[1]=request.getMedicine();
                        row[0] = req;
                      
                        row[2]=request.getStatus();

                        model.addRow(row);
                    
                    }
                    
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

        jLabel1 = new javax.swing.JLabel();
        medicineTxtField = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        delBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Medicine");

        addBtn.setBackground(new java.awt.Color(255, 168, 125));
        addBtn.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        addBtn.setForeground(new java.awt.Color(254, 254, 254));
        addBtn.setText("ADD Medicine");
        addBtn.setPreferredSize(new java.awt.Dimension(197, 41));
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Pharmacy", "Medicine"
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
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Requester", "Medicine", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Medicines List");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("List of Requesters for Medicine");

        delBtn.setBackground(new java.awt.Color(255, 168, 125));
        delBtn.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        delBtn.setForeground(new java.awt.Color(254, 254, 254));
        delBtn.setText("Delete");
        delBtn.setPreferredSize(new java.awt.Dimension(197, 41));
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 168, 125));
        jButton1.setForeground(new java.awt.Color(254, 254, 254));
        jButton1.setText("Send Medicine");
        jButton1.setPreferredSize(new java.awt.Dimension(197, 41));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel2.setText("Pharmacy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(59, 59, 59)
                                .addComponent(medicineTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)
                                        .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel2)))
                .addContainerGap(509, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medicineTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
         if (!medicineTxtField.getText().equals("")) {

            boolean isError = false;
            try {
                
                //System.out.println("size" + enterprise.getOrganizationDirectory().getOrganizationList().size());
                MedicineRequest medicineRequest = new MedicineRequest();
                medicineRequest.setAvailMedicine(medicineTxtField.getText());
                medicineRequest.setSender(userAccount);
               
                medicalOrganisation.getWorkQueue().getWorkRequestList().add(medicineRequest);
                //System.out.println(medicineRequest);
                userAccount.getWorkQueue().getWorkRequestList().add(medicineRequest);
                populateMedTable();
            }
             catch (Exception e3){
                isError = true;
                JOptionPane.showMessageDialog(null, "Please input the details in proper format", "Warning", JOptionPane.WARNING_MESSAGE);
            
                
            }}
         else{
            JOptionPane.showMessageDialog(null, "Please enter medicine", "Warning", JOptionPane.WARNING_MESSAGE);
         }
    }//GEN-LAST:event_addBtnActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        // TODO add your handling code here:
         int selectedRow = jTable1.getSelectedRow();
         if(selectedRow<0){
           JOptionPane.showMessageDialog(null, "Please select a row", "Warning", JOptionPane.WARNING_MESSAGE);
           return;
         }
         MedicineRequest MedicineRequest = (MedicineRequest) jTable1.getValueAt(selectedRow, 0);
         
         medicalOrganisation.getWorkQueue().getWorkRequestList().remove(MedicineRequest);
         populateMedTable();
    }//GEN-LAST:event_delBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
           int selectedRow = jTable2.getSelectedRow();
           if(selectedRow<0){
              JOptionPane.showMessageDialog(null, "Please select a row", "Warning", JOptionPane.WARNING_MESSAGE);
           }
           MedicineRequest MedicineRequest = (MedicineRequest) jTable2.getValueAt(selectedRow, 0);
           MedicineRequest.setStatus("completed");
           populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton delBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField medicineTxtField;
    // End of variables declaration//GEN-END:variables
}
