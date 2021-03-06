/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.BloodBank;

import Business.EcoSystem;
import Business.Enterprise.BloodBankEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Entity.HospitalStatus;
import Business.Network.Network;
import Business.Organization.BloodCollectionStationOrganization;
import Business.Organization.CommonUserOrganization;
import Business.Organization.FrontDeskEmployeeOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Bussiness.WorkQueue.DonorRequest;
import Bussiness.WorkQueue.WorkRequest;
import java.awt.BorderLayout;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author namratha
 */
public class BloodBankJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BloodBankJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private BloodCollectionStationOrganization bloodCollectionStationOrganization;
    private Enterprise enterprise;

    public BloodBankJPanel(JPanel userProcessContainer, UserAccount account, Organization organization,
            Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.bloodCollectionStationOrganization = (BloodCollectionStationOrganization) organization;
        this.enterprise = enterprise;
        this.business = business;
        System.out.print("bloodBank");
        populateTable();
        populateRequestTable();
        viewTable();
        viewTable1();
    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) patientsTable.getModel();

        model.setRowCount(0);

        for (WorkRequest labrequest : bloodCollectionStationOrganization.getWorkQueue().getWorkRequestList()) {
            System.out.println("populate");

            DonorRequest req = (DonorRequest) labrequest;
            Object[] row = new Object[5];
            if ((labrequest.getSender() != null && labrequest.getReceiver() != null)
                    && ((req.getStatus() == "") || (req.getStatus() == "BLOOD_READY"))) {
                System.out.println("hd" + labrequest.getStatus());

                row[0] = labrequest;
                row[1] = labrequest.getReceiver();
                row[2] = labrequest.getBlood();
                //row[3]=req.getRecievedDate();
                row[3] = req.getDate();
                row[4] = labrequest.getStatus();

                // System.out.println(row[0]);
                model.addRow(row);

            }

        }
    }

    public void viewTable() {
        DefaultCategoryDataset dcd = new DefaultCategoryDataset();
        ArrayList<WorkRequest> list = bloodCollectionStationOrganization.getWorkQueue().getWorkRequestList();
        HashMap<String, Integer> count = new HashMap<String, Integer>();
        int cnt = 0;
        for (WorkRequest workRequest : userAccount.getWorkQueue().getWorkRequestList()) {
            if (workRequest instanceof DonorRequest) {
                if (workRequest.getStatus() != null && workRequest.getStatus().equals("Completed")) {

                    String Blood = ((DonorRequest) workRequest).getBlood();
                    cnt = count.getOrDefault(Blood, 0) + 1;
                    count.put(Blood, cnt);
                    dcd.addValue(count.get(Blood), "BLood Group", Blood);
                }
            }
        }
        barGraph(dcd, "Blood donated by donors", "Blood Group", "Number of DOnors");

    }

    public void viewTable1() {
        DefaultCategoryDataset dcd1 = new DefaultCategoryDataset();
        ArrayList<WorkRequest> list = bloodCollectionStationOrganization.getWorkQueue().getWorkRequestList();
        HashMap<LocalDate, Integer> count = new HashMap<LocalDate, Integer>();
        int cnt = 0;
        for (WorkRequest workRequest : userAccount.getWorkQueue().getWorkRequestList()) {
            if (workRequest instanceof DonorRequest) {
                if (workRequest.getStatus() != null && workRequest.getStatus().equals("Completed")) {

                    LocalDate date = ((DonorRequest) workRequest).getDate();
                    cnt = count.getOrDefault(date, 0) + 1;
                    count.put(date, cnt);
                    dcd1.addValue(count.get(date), "BLood Group", date);

                }

            }
        }
        barGraph1(dcd1, "Donors on date", "Date", "Number of DOnors");

    }

    private void barGraph(DefaultCategoryDataset dataset, String tHeader, String bHeader, String lHeader) {

        JFreeChart chart = ChartFactory.createBarChart3D(
                tHeader, // Title
                bHeader, // x-axis Label
                lHeader, // y-axis Label
                dataset, // Dataset
                PlotOrientation.VERTICAL, // Plot Orientation
                true, // Show Legend
                true, // Use tooltips
                false // Configure chart to generate URLs?
        );
        jPanel1.removeAll();
        jPanel1.setLayout(new java.awt.BorderLayout());
        ChartPanel CP = new ChartPanel(chart);
        jPanel1.add(CP, BorderLayout.CENTER);
        jPanel1.validate();
    }

    private void barGraph1(DefaultCategoryDataset dataset, String tHeader, String bHeader, String lHeader) {

        JFreeChart chart = ChartFactory.createBarChart3D(
                tHeader, // Title
                bHeader, // x-axis Label
                lHeader, // y-axis Label
                dataset, // Dataset
                PlotOrientation.VERTICAL, // Plot Orientation
                true, // Show Legend
                true, // Use tooltips
                false // Configure chart to generate URLs?
        );
        jPanel2.removeAll();
        jPanel2.setLayout(new java.awt.BorderLayout());
        ChartPanel CP = new ChartPanel(chart);
        jPanel2.add(CP, BorderLayout.CENTER);
        jPanel2.validate();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest labrequest : userAccount.getWorkQueue().getWorkRequestList()) {
            //System.out.println(labrequest);
            Object[] row = new Object[5];
            // row[0] = request.getDate();
            //row[0] = request;
            if (labrequest.getStatus().equalsIgnoreCase("completed")) {
                DonorRequest req = new DonorRequest();
                row[0] = labrequest;

                //row[1] = labrequest.getSender()==null? null : labrequest.getSender().getUsername();
                //row[2] = docrequest.getSender().getEmployee().getName();
                row[1] = labrequest.getReceiver();
                row[2] = labrequest.getBlood();
                row[3] = req.getDate();
                row[4] = labrequest.getStatus();

                model.addRow(row);

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

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        patientsTable = new javax.swing.JTable();
        RequestBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(254, 254, 254));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Donor", "Receiver", "Blood Type", "Date", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setText("Blood Bank Organisation");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 166, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 302, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 166, Short.MAX_VALUE)
        );

        patientsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Sender", "Patient", "Blood Type", "Recieved Date", "status"
            }
        ));
        jScrollPane2.setViewportView(patientsTable);

        RequestBtn.setBackground(new java.awt.Color(255, 168, 125));
        RequestBtn.setForeground(new java.awt.Color(254, 254, 254));
        RequestBtn.setText("Approve and send");
        RequestBtn.setPreferredSize(new java.awt.Dimension(197, 41));
        RequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("Blood Bank Donors List");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setText("Recipient List");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(797, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(149, 149, 149)
                        .addComponent(RequestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(181, 181, 181))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RequestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(635, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = patientsTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        DonorRequest donorRequest = (DonorRequest) patientsTable.getValueAt(selectedRow, 0);
        UserAccount patient = donorRequest.getReceiver();
        UserAccount sender = donorRequest.getSender();
        System.out.println(patient);
        System.out.println(sender);
        if (donorRequest.getStatus().equals(HospitalStatus.BLOOD_READY.getValue())) {
            JOptionPane.showMessageDialog(null, "Already blood sent to patient", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        for (WorkRequest labrequest : userAccount.getWorkQueue().getWorkRequestList()) {
            //System.out.println(labrequest);
            Object[] row = new Object[5];

            if (labrequest.getReceiver() == null && labrequest.getBlood().equalsIgnoreCase(donorRequest.getBlood())) {
                donorRequest.setStatus(HospitalStatus.BLOOD_READY.getValue());
                donorRequest.setResolveDate(new Date());
                /*******pay attention to this code******/
                labrequest.setReceiver(donorRequest.getSender());
                System.out.println("req" + donorRequest.getStatus());
                break;
            }
        }
        Enterprise eps = null;

        if (donorRequest.getStatus().equals(HospitalStatus.BLOOD_READY.getValue())) {
            populateTable();
            populateRequestTable();
            for (Network network : business.getNetworkList()) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise instanceof HospitalEnterprise) {
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            if (organization instanceof CommonUserOrganization) {
                                for (UserAccount user : organization.getUserAccountDirectory().getUserAccountList()) {
                                    if (user == patient) {
                                        eps = enterprise;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            for (Network network : business.getNetworkList()) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise instanceof BloodBankEnterprise) {
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            if (organization instanceof BloodCollectionStationOrganization) {
                                organization.getWorkQueue().getWorkRequestList().add(donorRequest);
                            }
                        }

                    }
                }
            }
            if (eps != null) {
                for (Organization organization : eps.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof FrontDeskEmployeeOrganization) {
                        organization.getWorkQueue().getWorkRequestList().add(donorRequest);
                    }
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "NOT AVAILABLE", "Warning", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_RequestBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RequestBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable patientsTable;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
