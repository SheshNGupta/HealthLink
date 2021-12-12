/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HealthcareAccountantRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AccountantOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AccountantBillingRequest;
import Business.WorkQueue.GovernmentFundRequest;
import Business.WorkQueue.InsuranceWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.PharmaManagerRole.SendEmailJPanel;

/**
 *
 * @author Shesh Narayan
 */
public class ProcessMedicalBillingsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private AccountantOrganization accountantOrganization;
    private EcoSystem ecoSystem;

    /**
     * Creates new form ProcessMedicalBillingsJPanel
     */
    public ProcessMedicalBillingsJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, AccountantOrganization accountantOrganization, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.accountantOrganization = accountantOrganization;
        this.ecoSystem = ecoSystem;
        populateTable();
        populateInsuranceClaimTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        processRequestBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        btnAssignToMe = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblInsurance = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        emailBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(77, 154, 115));

        processRequestBtn.setBackground(new java.awt.Color(255, 204, 51));
        processRequestBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        processRequestBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsImages/yes.png"))); // NOI18N
        processRequestBtn.setText("Process Request");
        processRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processRequestBtnActionPerformed(evt);
            }
        });

        workRequestJTable.setBackground(new java.awt.Color(204, 255, 153));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "PatientId", "Patient Name", "Assigned Doctor", "Accountant ", "Status", "Billing Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        btnAssignToMe.setBackground(new java.awt.Color(255, 204, 51));
        btnAssignToMe.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAssignToMe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsImages/assign.png"))); // NOI18N
        btnAssignToMe.setText("AssignToMe");
        btnAssignToMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToMeActionPerformed(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(255, 204, 51));
        backJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Accountant: Patient Billing Area");

        tblInsurance.setBackground(new java.awt.Color(204, 255, 153));
        tblInsurance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Policy Number", "Accountant", "Insurance Agent", "Billing Amount", "Claim Amount", "Claim Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane2.setViewportView(tblInsurance);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Insurance Claim Status Table");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Patient Billing Table");

        emailBtn.setBackground(new java.awt.Color(255, 204, 51));
        emailBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        emailBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsImages/email_send.png"))); // NOI18N
        emailBtn.setText("Send Email for Query");
        emailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(backJButton)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(117, 117, 117)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(245, 245, 245)
                                        .addComponent(jLabel3))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(274, 274, 274)
                                .addComponent(btnAssignToMe)
                                .addGap(69, 69, 69)
                                .addComponent(processRequestBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(331, 331, 331)
                                .addComponent(jLabel2)))
                        .addGap(0, 268, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(emailBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(backJButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAssignToMe, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(processRequestBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(emailBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(164, 164, 164))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void processRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processRequestBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row !");
            return;
        } else {

            AccountantBillingRequest accountBillingRequest = (AccountantBillingRequest) workRequestJTable.getValueAt(selectedRow, 5);

            if (accountBillingRequest.getReceiver() != null) {
                if (accountBillingRequest.getReceiver().equals(userAccount)) {
                    if(accountBillingRequest.getStatus().equalsIgnoreCase("Pending on Accountant"))
                    {
                    AccountantProcessRequestJPanel panel = new AccountantProcessRequestJPanel(userProcessContainer, userAccount, accountBillingRequest, enterprise, ecoSystem);
                    userProcessContainer.add("AccountantProcessRequestJPanel", panel);
                    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                    layout.next(userProcessContainer);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Cannot process Request as request is in  " + accountBillingRequest.getStatus());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Not authorised!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please assign the request first!");
            }
        }
//        }
    }//GEN-LAST:event_processRequestBtnActionPerformed

    private void btnAssignToMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToMeActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row !");
            return;
        } else {
            WorkRequest request = (AccountantBillingRequest) workRequestJTable.getValueAt(selectedRow, 5);
            if (request.getReceiver() == null) {

                request.setReceiver(userAccount);
                request.setStatus("Pending on Accountant");
                populateTable();
                JOptionPane.showMessageDialog(null, "Request succesfully assigned to you!");
//             else {
//                JOptionPane.showMessageDialog(null, "Can't assign this work request, as the work request is in " + request.getStatus() + " status");
//            }
            } else {
                JOptionPane.showMessageDialog(null, "The request is already assigned ");
            }
        }
    }//GEN-LAST:event_btnAssignToMeActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
//        Component[] componentArray = userProcessContainer.getComponents();
//        Component component = componentArray[componentArray.length - 1];
//        DoctorWorkAreaJPanel dwjp = (DoctorWorkAreaJPanel) component;
//        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void emailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        String to;
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from patient billing table!");
            return;
        } else {
            
            AccountantBillingRequest ins = (AccountantBillingRequest) workRequestJTable.getValueAt(selectedRow, 5);
            to= ins.getPatient().getEmail();
            SendEmailJPanel emailJPanel = new SendEmailJPanel(userProcessContainer,to,"Account");
            userProcessContainer.add("emailJPanel", emailJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_emailBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnAssignToMe;
    private javax.swing.JButton emailBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton processRequestBtn;
    private javax.swing.JTable tblInsurance;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : accountantOrganization.getWorkQueue().getWorkRequests()) {
            Object[] row = new Object[6];
            String status = request.getStatus();
            row[0] = ((AccountantBillingRequest) request).getPatient();
            row[1] = ((AccountantBillingRequest) request).getPatient().getPatientFirstName() + " " + ((AccountantBillingRequest) request).getPatient().getPatientLastName();
            row[2] = request.getSender().getEmployee().getName();
            if (status.equalsIgnoreCase("Sent to Treasurer") || status.equalsIgnoreCase("Sent to Secretary")) {
                row[2] = null;
            } else {
                row[3] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            }
            //row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[4] = request.getStatus();
            row[5] = ((AccountantBillingRequest) request);

            model.addRow(row);
        }

    }

    public void populateInsuranceClaimTable() {
        List<InsuranceWorkRequest> insuranceWorkRequests = new ArrayList<>();
        ArrayList<WorkRequest> workRequests = userAccount.getWorkQueue().getWorkRequests();
        for(WorkRequest workRequest : workRequests)
        {
            if(workRequest instanceof InsuranceWorkRequest)
            {
                insuranceWorkRequests.add((InsuranceWorkRequest) workRequest);
            }
        }
        
        DefaultTableModel model = (DefaultTableModel) tblInsurance.getModel();
        
        model.setRowCount(0);
        for(InsuranceWorkRequest insuranceWorkRequest: insuranceWorkRequests)
        {
            Object[] row = new Object[6];
         row[0]=insuranceWorkRequest;
         row[1] = userAccount.getEmployee().getName();
         row[2] = insuranceWorkRequest.getReceiver()==null?"":insuranceWorkRequest.getReceiver().getEmployee().getName();
         row[3] = insuranceWorkRequest.getBillAmount();
         row[4] = insuranceWorkRequest.getClaimAmount();
         row[5] = insuranceWorkRequest.getStatus();
         model.addRow(row);
            
        }
        //System.out.println("Insur"+ insuranceWorkRequests.size());
    }
}
