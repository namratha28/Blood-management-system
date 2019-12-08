/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Donor;

import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import Bussiness.WorkQueue.DonorRequest;
import Bussiness.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dell_owner
 */
public class ViewRegEventsJPanel extends javax.swing.JPanel {
    private UserAccount userAccount;

    /**
     * Creates new form ViewRegEventsJPanel
     */
    private JPanel userProcessContainer;

    public ViewRegEventsJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;

        this.userAccount = userAccount;
        populateTable();
    }
    
    
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) regEvents.getModel();
        Object[] newIdentifiers = new Object[]{"Event", "Location", "Date", "Time"};
        model.setColumnIdentifiers(newIdentifiers);
        model.setRowCount(0);
        for(int i = 0; i < userAccount.getEvents().size(); i++) {
            Object[] row = new Object[4];
            row[0] = userAccount.getEvents().get(i);
            row[1] = userAccount.getEventLocations().get(i);
            row[2] = userAccount.getEventDates().get(i);
            row[3] = userAccount.getEventTimes().get(i);
           
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
        regEvents = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();

        regEvents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        regEvents.setGridColor(new java.awt.Color(254, 254, 254));
        jScrollPane1.setViewportView(regEvents);

        backBtn.setBackground(new java.awt.Color(253, 134, 75));
        backBtn.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        backBtn.setForeground(new java.awt.Color(254, 254, 254));
        backBtn.setText("BACK");
        backBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable regEvents;
    // End of variables declaration//GEN-END:variables
}
