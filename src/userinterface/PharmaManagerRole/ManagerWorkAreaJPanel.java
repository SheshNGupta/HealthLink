/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PharmaManagerRole;

import userinterface.GovernmentTreasurerRole.*;
import Business.Enterprise.Enterprise;
import Business.Order.Order;
import Business.Organization.HealthOfficerOrganization;
import Business.Organization.ManagerOrganization;
import Business.Organization.Organization;
import Business.Organization.TreasurerOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.GovernmentFundRequest;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.OrderWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import userinterface.LabAssistantRole.LabAssitantProcessRequestJPanel;

/**
 *
 * @author Shesh Narayan
 */
public class ManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TreasurerWorkAreaJPanel
     */
    private JPanel jPanel;
    private UserAccount userAccount;
    private ManagerOrganization managerOrganization;
    private Enterprise enterprise;
    List<Order> completed = new ArrayList<>();
    List<Order> inProgress = new ArrayList<>();

    public ManagerWorkAreaJPanel(JPanel jpanel, UserAccount userAccount, Organization organization, Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;
        this.jPanel = jpanel;
        this.managerOrganization = (ManagerOrganization) organization;
        this.userAccount = userAccount;

        populateTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        requestGovSecretaryBtn = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        checkStatsBtn = new javax.swing.JButton();
        btnEmail = new javax.swing.JButton();

        setBackground(new java.awt.Color(77, 154, 115));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manger Work Area ");

        workRequestJTable.setBackground(new java.awt.Color(153, 255, 153));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Sender", "Receiver", "Status", "Amount", "Message", "Location"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        btnAssign.setBackground(new java.awt.Color(255, 204, 51));
        btnAssign.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAssign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsImages/assign.png"))); // NOI18N
        btnAssign.setText("Assign To Me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        requestGovSecretaryBtn.setBackground(new java.awt.Color(255, 204, 51));
        requestGovSecretaryBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        requestGovSecretaryBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsImages/yes.png"))); // NOI18N
        requestGovSecretaryBtn.setText("Process Request");
        requestGovSecretaryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestGovSecretaryBtnActionPerformed(evt);
            }
        });

        btnMenu.setBackground(new java.awt.Color(255, 204, 51));
        btnMenu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsImages/prescription.png"))); // NOI18N
        btnMenu.setText("Manage Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        checkStatsBtn.setBackground(new java.awt.Color(255, 204, 51));
        checkStatsBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        checkStatsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsImages/chart.png"))); // NOI18N
        checkStatsBtn.setText("Check Order Stats");
        checkStatsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkStatsBtnActionPerformed(evt);
            }
        });

        btnEmail.setBackground(new java.awt.Color(255, 204, 51));
        btnEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsImages/email_send.png"))); // NOI18N
        btnEmail.setText("Send Email");
        btnEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnMenu)
                            .addGap(18, 18, 18)
                            .addComponent(btnEmail)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnAssign)
                            .addGap(18, 18, 18)
                            .addComponent(requestGovSecretaryBtn)
                            .addGap(18, 18, 18)
                            .addComponent(checkStatsBtn))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requestGovSecretaryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkStatsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(187, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first from the table to view details");
            return;
        } else {
            WorkRequest request = (OrderWorkRequest) workRequestJTable.getValueAt(selectedRow, 5);
            if (request.getStatus().equals("Sent to Pharma")) {
                request.setReceiver(userAccount);
                request.setStatus("Pending on Manager");
                populateTable();
                JOptionPane.showMessageDialog(null, "Success !! Request is assigned to you ");
            } else {
                JOptionPane.showMessageDialog(null, "Can't assign this work request, as the work request is in " + request.getStatus() + " status", "Warning!", JOptionPane.WARNING_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnAssignActionPerformed

    private void requestGovSecretaryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestGovSecretaryBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first from the table to view details");
            return;
        } else {
            OrderWorkRequest request = (OrderWorkRequest) workRequestJTable.getValueAt(selectedRow, 5);
            if (request.getStatus().equalsIgnoreCase("Sent to Pharma")) {
                JOptionPane.showMessageDialog(null, "Please assign selected request first");
                return;
            }
            if (request.getStatus().equalsIgnoreCase("Accepted")) {
                JOptionPane.showMessageDialog(null, "Request already completed", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (!userAccount.equals(request.getReceiver())) {
                JOptionPane.showMessageDialog(null, "Not Authorized", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (!userAccount.equals(request.getReceiver())) {
                JOptionPane.showMessageDialog(null, "Not Authorized", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (!userAccount.getEmployee().equals(request.getReceiver().getEmployee())) {
                JOptionPane.showMessageDialog(null, "Request assigned to other Officer", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (request.getStatus().equals("Rejected")) {
                JOptionPane.showMessageDialog(null, "Cannot process a Rejected Request", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            //request.setStatus("Processing");
            ManagerProcessRequestJPanel managerProcessWorkRequestJPanel = new ManagerProcessRequestJPanel(jPanel, request, enterprise, userAccount);
            jPanel.add("ManagerProcessWorkRequestJPanel", managerProcessWorkRequestJPanel);
            CardLayout layout = (CardLayout) jPanel.getLayout();
            layout.next(jPanel);
        }
    }//GEN-LAST:event_requestGovSecretaryBtnActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        ManageMenuJPanel managerProcessWorkRequestJPanel = new ManageMenuJPanel(jPanel, enterprise);
            jPanel.add("MnagerProcessWorkRequestJPanel", managerProcessWorkRequestJPanel);
            CardLayout layout = (CardLayout) jPanel.getLayout();
            layout.next(jPanel);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void checkStatsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkStatsBtnActionPerformed
        // TODO add your handling code here:
        DefaultPieDataset defaultPieDataset = new DefaultPieDataset();
        defaultPieDataset.setValue("Orders still under Progress", inProgress.size());
        defaultPieDataset.setValue("Order Completed Successfully", completed.size());
        JFreeChart chart = ChartFactory.createPieChart("Order Status Pie Chart", defaultPieDataset, true, true, true);
        PiePlot piePlot =(PiePlot) chart.getPlot();
        ChartFrame frame = new ChartFrame("Order Status Pie Chart", chart);
        frame.setVisible(true);
        frame.setSize(500,500);
    }//GEN-LAST:event_checkStatsBtnActionPerformed

    private void btnEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmailActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        String to="";
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first from the table to view details");
            return;
        } else {
            OrderWorkRequest request = (OrderWorkRequest) workRequestJTable.getValueAt(selectedRow, 5);
            to = request.getSender().getEmployee().getEmail();
            SendEmailJPanel emailJPanel = new SendEmailJPanel(jPanel,to);
            jPanel.add("emailJPanel", emailJPanel);
            CardLayout layout = (CardLayout) jPanel.getLayout();
            layout.next(jPanel);
        }
    }//GEN-LAST:event_btnEmailActionPerformed

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);

        for (WorkRequest request : managerOrganization.getWorkQueue().getWorkRequests()) {
            String status = request.getStatus();
            Object[] row = new Object[6];
            row[0] = request.getSender().getEmployee().getName();
            if (status.equalsIgnoreCase("Sent to Pharma")) {
                row[1] = null;
            } else {
                row[1] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            }
            row[2] = status;
            row[3] = ((OrderWorkRequest) request).getBillAmount();
            row[4] = ((OrderWorkRequest) request).getMessage();
            row[5] = request;

            model.addRow(row);
            if(status.equals("Accepted"))
            {
              completed.add(((OrderWorkRequest) request).getOrder());
            }
            else
            {
               inProgress.add(((OrderWorkRequest) request).getOrder()); 
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnEmail;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton checkStatsBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton requestGovSecretaryBtn;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
