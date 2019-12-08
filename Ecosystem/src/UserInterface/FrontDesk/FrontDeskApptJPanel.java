/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FrontDesk;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Entity.HospitalStatus;
import Business.Entity.Specialities;
import Business.Entity.TimeSlot;
import Business.Organization.CommonUserOrganization;
import Business.Organization.DoctorOrganization;
import Business.Organization.FrontDeskEmployeeOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Bussiness.WorkQueue.HospitalInnerRequest;
import UserInterface.Account.CreateJPanel;
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
public class FrontDeskApptJPanel extends javax.swing.JPanel {

    /**
     * Creates new form frontDeskJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private FrontDeskEmployeeOrganization organization;
    private Enterprise enterprise;
    private UserAccount patient;
    private UserAccount doctor;
    private TimeSlot ts;

    public FrontDeskApptJPanel(JPanel userProcessContainer, UserAccount account,
            FrontDeskEmployeeOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.enterprise = enterprise;
        this.organization = organization;
        populateDoctorTable();
        populateCommonUser();
        populateDoctorTableComboBox();
    }

    private void populateDoctorTableComboBox() {
        speComboBox.removeAllItems();
        for (Specialities s : Specialities.values()) {
            speComboBox.addItem(s);
        }
    }

    private void populateDoctorTable() {
        DefaultTableModel model = (DefaultTableModel) speTable.getModel();

        model.setRowCount(0);
        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (o instanceof DoctorOrganization) {
                for (UserAccount a : o.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[2];
                    row[0] = a;
                    row[1] = a.getEmployee().getSpecialities();
                    model.addRow(row);
                }
            }
        }
    }

    private void populateAvailTable() {
        DefaultTableModel model = (DefaultTableModel) availTable.getModel();
        model.setRowCount(0);
        for (TimeSlot ts : doctor.getEmployee().getAvailability()) {
            Object[] row = new Object[2];
            row[0] = ts;
            row[1] = ts.getTo();
            model.addRow(row);
        }

    }

    public void populateCommonUser() {
        DefaultTableModel model = (DefaultTableModel) commonUserTable.getModel();

        model.setRowCount(0);
        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (o instanceof CommonUserOrganization) {
                for (UserAccount a : o.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[2];
                    row[0] = a;
                    row[1] = a.getPerson().getBirthday();
                    model.addRow(row);
                }
            }
        }
    }

    private void populateApptTable() {
        DefaultTableModel model = (DefaultTableModel) apptTable.getModel();

        model.setRowCount(0);

        Object[] row = new Object[4];
        row[0] = patient;
        row[1] = patient.getPerson().getBirthday();
        row[2] = doctor;
        row[3] = ts;
        model.addRow(row);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        commonUserTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        speTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        availTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        chkAvailBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtPatient = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtBirth = new javax.swing.JTextField();
        makeAptmBtn = new javax.swing.JButton();
        speComboBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        docNameTxt = new javax.swing.JTextField();
        searchDocBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        commonUserTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        createBtn1 = new javax.swing.JButton();
        selectBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        apptTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        commonUserTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "name", "birthday", "Contribution Score", "Last Visit"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(commonUserTable1);

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1280, 800));

        speTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "name", "specialties"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(speTable);

        availTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "From", "To"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(availTable);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel1.setText("Specialities");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel2.setText("Available Time");

        chkAvailBtn.setBackground(new java.awt.Color(255, 168, 125));
        chkAvailBtn.setForeground(new java.awt.Color(254, 254, 254));
        chkAvailBtn.setText("Check Availability");
        chkAvailBtn.setPreferredSize(new java.awt.Dimension(197, 41));
        chkAvailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAvailBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel3.setText("Patient Name");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel4.setText("Birthday");

        txtBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBirthActionPerformed(evt);
            }
        });

        makeAptmBtn.setBackground(new java.awt.Color(255, 168, 125));
        makeAptmBtn.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        makeAptmBtn.setForeground(new java.awt.Color(254, 254, 254));
        makeAptmBtn.setText("Make an Appointment");
        makeAptmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeAptmBtnActionPerformed(evt);
            }
        });

        speComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel5.setText("Doctor Name");

        searchDocBtn.setBackground(new java.awt.Color(255, 168, 125));
        searchDocBtn.setForeground(new java.awt.Color(254, 254, 254));
        searchDocBtn.setText("Search");
        searchDocBtn.setPreferredSize(new java.awt.Dimension(197, 41));
        searchDocBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchDocBtnActionPerformed(evt);
            }
        });

        commonUserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "name", "birthday", "Contribution Score", "Last Visit"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(commonUserTable);

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel6.setText("Appointment");

        searchBtn.setBackground(new java.awt.Color(255, 168, 125));
        searchBtn.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(254, 254, 254));
        searchBtn.setText("Search");
        searchBtn.setPreferredSize(new java.awt.Dimension(197, 41));
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        createBtn1.setBackground(new java.awt.Color(255, 168, 125));
        createBtn1.setForeground(new java.awt.Color(254, 254, 254));
        createBtn1.setText("Create");
        createBtn1.setPreferredSize(new java.awt.Dimension(197, 41));
        createBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtn1ActionPerformed(evt);
            }
        });

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

        jLabel7.setText("Doctor Information");

        jLabel8.setText("Patient Information");

        apptTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "patient", "birthday", "doctor", "time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(apptTable);

        btnBack.setBackground(new java.awt.Color(255, 168, 125));
        btnBack.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(254, 254, 254));
        btnBack.setText("<< Back");
        btnBack.setPreferredSize(new java.awt.Dimension(197, 41));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(makeAptmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(18, 18, 18)
                                                .addComponent(chkAvailBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel2))
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1067, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(261, 261, 261))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(360, 360, 360)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(39, 39, 39)
                                                .addComponent(txtPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(44, 44, 44)
                                                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(createBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(141, 141, 141)
                                                .addComponent(selectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(633, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(29, 29, 29)
                        .addComponent(docNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(speComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(searchDocBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(createBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(docNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(speComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchDocBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7)
                        .addComponent(chkAvailBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141)
                .addComponent(makeAptmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void chkAvailBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_chkAvailBtnActionPerformed
        int selectedRow = speTable.getSelectedRow();
        if (selectedRow >= 0) {
            doctor = (UserAccount) speTable.getValueAt(selectedRow, 0);
            populateAvailTable();
        } else {
            JOptionPane.showMessageDialog(null, "Please select any row");
        }

    }// GEN-LAST:event_chkAvailBtnActionPerformed

    private void txtBirthActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtBirthActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtBirthActionPerformed

    private void makeAptmBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_makeAptmBtnActionPerformed
        HospitalInnerRequest wr = new HospitalInnerRequest();
        if (patient == null) {
            JOptionPane.showMessageDialog(null, "Please select a patient");
            return;
        }
        wr.setSender(userAccount);
        wr.setPatient(patient);
        wr.setReceiver(doctor);
        int selectedRow = availTable.getSelectedRow();
        wr.setRequestDate(new Date());
        wr.setStatus(HospitalStatus.WAITING_FOR_APPOINTMENT.getValue());
        if (selectedRow >= 0) {
            ts = (TimeSlot) availTable.getValueAt(selectedRow, 0);
            wr.setAppointmentDate(ts.getFrom());
            doctor.getEmployee().getAvailability().remove(ts);
            populateApptTable();
            populateAvailTable();
        } else {
            JOptionPane.showMessageDialog(null, "Please select any row");
        }

        doctor.getWorkQueue().getWorkRequestList().add(wr);
        patient.getWorkQueue().getWorkRequestList().add(wr);
    }

    private void createBtn1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_createBtn1ActionPerformed
        CreateJPanel panel = new CreateJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("CreateAccountJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }// GEN-LAST:event_createBtn1ActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_searchBtnActionPerformed
        String birthday = txtBirth.getText();
        String name = txtPatient.getText();
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yy");
        Date b = null;
        if (!birthday.equals("")) {
            try {
                b = format.parse(birthday);
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
        }

        DefaultTableModel model = (DefaultTableModel) commonUserTable.getModel();

        model.setRowCount(0);
        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (o instanceof CommonUserOrganization) {
                for (UserAccount a : o.getUserAccountDirectory().getUserAccountList()) {
                    if ((name.equals("") || a.getPerson().getName().equals(name))
                            && (b == null || a.getPerson().getBirthday().toString().equals(b.toString()))) {
                        Object[] row = new Object[2];
                        row[0] = a;
                        row[1] = a.getPerson().getBirthday();
                        model.addRow(row);
                    }
                }
            }
        }
    }// GEN-LAST:event_searchBtnActionPerformed

    private void selectBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_selectBtnActionPerformed
        int selectedRow = commonUserTable.getSelectedRow();
        if (selectedRow >= 0) {
            patient = (UserAccount) commonUserTable.getValueAt(selectedRow, 0);
            populateApptTable();
        } else {
            JOptionPane.showMessageDialog(null, "Please select any row");
        }
    }// GEN-LAST:event_selectBtnActionPerformed

    private void searchDocBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_searchDocBtnActionPerformed
        String name = docNameTxt.getText();
        Specialities spe = (Specialities) speComboBox.getSelectedItem();
        DefaultTableModel model = (DefaultTableModel) speTable.getModel();

        model.setRowCount(0);
        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (o instanceof DoctorOrganization) {
                for (UserAccount a : o.getUserAccountDirectory().getUserAccountList()) {
                    if ((name.equals("") || a.getEmployee().getName().equals(name))
                            && (spe == null || a.getEmployee().getSpecialities().equals(spe.getValue()))) {
                        Object[] row = new Object[2];
                        row[0] = a;
                        row[1] = a.getPerson().getBirthday();
                        model.addRow(row);
                    }
                }
            }
        }
    }// GEN-LAST:event_searchDocBtnActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }// GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable apptTable;
    private javax.swing.JTable availTable;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton chkAvailBtn;
    private javax.swing.JTable commonUserTable;
    private javax.swing.JTable commonUserTable1;
    private javax.swing.JButton createBtn1;
    private javax.swing.JTextField docNameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton makeAptmBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton searchDocBtn;
    private javax.swing.JButton selectBtn;
    private javax.swing.JComboBox speComboBox;
    private javax.swing.JTable speTable;
    private javax.swing.JTextField txtBirth;
    private javax.swing.JTextField txtPatient;
    // End of variables declaration//GEN-END:variables

}
