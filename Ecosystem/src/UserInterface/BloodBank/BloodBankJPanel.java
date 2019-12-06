/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.BloodBank;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.BloodCollectionStationOrganization;
import Business.Organization.NurseOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Bussiness.WorkQueue.DonorRequest;
import Bussiness.WorkQueue.WorkRequest;
import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.StandardBarPainter;
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
            Enterprise enterprise,EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.bloodCollectionStationOrganization = (BloodCollectionStationOrganization) organization;
        this.enterprise = enterprise;
        this.business=business;
        System.out.print("bloodBank");
        populateTable();
        viewTable();
        viewTable1();
        }
    
    public void viewTable(){
        DefaultCategoryDataset dcd = new DefaultCategoryDataset();
        ArrayList<WorkRequest> list = bloodCollectionStationOrganization.getWorkQueue().getWorkRequestList();
        HashMap<String,Integer> count=new HashMap<String,Integer>();
        int cnt=0;
        for (WorkRequest workRequest : userAccount.getWorkQueue().getWorkRequestList()) {
            if (workRequest instanceof DonorRequest) {
                if (workRequest.getStatus() != null && workRequest.getStatus().equals("Completed")) {
                    
                    String Blood = ((DonorRequest) workRequest).getBlood();
                    cnt=count.getOrDefault(Blood,0)+1;
                    count.put(Blood,cnt);
                    dcd.addValue(count.get(Blood),"BLood Group", Blood);
                       System.out.println(Blood);
                       
                    
                }

            }
        }
        barGraph(dcd,"Blood donated by donors","Blood Group","Number of DOnors");
        
    }
    
     public void viewTable1(){
        DefaultCategoryDataset dcd1 = new DefaultCategoryDataset();
        ArrayList<WorkRequest> list = bloodCollectionStationOrganization.getWorkQueue().getWorkRequestList();
        HashMap<LocalDate,Integer> count=new HashMap<LocalDate,Integer>();
        int cnt=0;
        for (WorkRequest workRequest : userAccount.getWorkQueue().getWorkRequestList()) {
            if (workRequest instanceof DonorRequest) {
                if (workRequest.getStatus() != null && workRequest.getStatus().equals("Completed")) {
                    
                    LocalDate date = ((DonorRequest) workRequest).getDate();
                    cnt=count.getOrDefault(date,0)+1;
                    count.put(date,cnt);
                    dcd1.addValue(count.get(date),"BLood Group", date);
                       System.out.println(date);
                       
                    //System.out.println(Blood+" "+count);
                }

            }
        }
        barGraph1(dcd1,"Donors on date","Date","Number of DOnors");
        
    }
    
    private void barGraph(DefaultCategoryDataset dataset,String tHeader,String bHeader,String lHeader){

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
        jPanel1.add(CP,BorderLayout.CENTER);
        jPanel1.validate();
    }
    
    private void barGraph1(DefaultCategoryDataset dataset,String tHeader,String bHeader,String lHeader){

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
        jPanel2.add(CP,BorderLayout.CENTER);
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
          if(labrequest.getStatus().equalsIgnoreCase("completed")){
              DonorRequest req= new DonorRequest();
                row[0] = labrequest;
              
                //row[1] = labrequest.getSender()==null? null : labrequest.getSender().getUsername();
                //row[2] = docrequest.getSender().getEmployee().getName();
                row[1] = labrequest.getReceiver() == null ? null : labrequest.getReceiver().getEmployee().getName();
                row[2]=req.getBlood();
                row[3]=req.getDate();
                row[4] = labrequest.getStatus();

                System.out.println(row[2]);

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

        setBackground(new java.awt.Color(51, 51, 51));

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

        jLabel1.setText("Blood Bank Organisation");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 302, Short.MAX_VALUE)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
