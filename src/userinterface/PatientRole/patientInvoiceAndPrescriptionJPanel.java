/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.PatientRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientVisitWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author Nikita
 */

import java.awt.print.PrinterException;
import javax.swing.JOptionPane;


public class patientInvoiceAndPrescriptionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form patientInvoiceAndPrescriptionJPanel
     */
    
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem ecoSystem;
    
    private PatientVisitWorkRequest visitWorkRequest;
    
     
    public patientInvoiceAndPrescriptionJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, EcoSystem ecoSystem, PatientVisitWorkRequest visitWorkRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.ecoSystem = ecoSystem;
        this.visitWorkRequest = visitWorkRequest;
        double claimAmount =0.0;
        
        txtPatientId.setText(userAccount.getCus().getPatientId());
        txtPatientName.setText(userAccount.getCus().getPatientFirstName()+" "+userAccount.getCus().getPatientLastName());
        txtDoctorName.setText(visitWorkRequest.getAssignedDoctor().getEmployee().getName());
        txtBillAmount.setText(String.valueOf(visitWorkRequest.getBillAmount()));
        txtPolicyNumber.setText(visitWorkRequest.getPatient().getInsuranceCustomer().getInsurancePolicyNumber());
        if(visitWorkRequest.getPatient().getInsuranceCustomer()!=null)
        {
        claimAmount = visitWorkRequest.getBillAmount()*visitWorkRequest.getPatient().getInsuranceCustomer().getInsurance().getCoverage();
        }
        txtClaimAmount.setText(String.valueOf(claimAmount/100));
        setEditableFalse();
        
        
        String patientId = String.format(txtPatientId.getText());
        String patientName = String.format(txtPatientName.getText());
        String doctorName = String.format(txtDoctorName.getText());
        String billAmount = String.format(txtBillAmount.getText());
        String clmAmount = String.format(txtClaimAmount.getText());
        String policyNumber = String.format(txtPolicyNumber.getText());
        
        txtAreaReceipt.append("\t Patient invoice\n\n"+ " Patient ID: "+patientId+ "\n Patient Name: "+patientName+ "\n Consulted By: "+doctorName+ "\n Policy Number: "+policyNumber+ "\n Claim Amount: "+clmAmount+ "\n Total Bill Amount: "+billAmount+ "\n\n \t Thank You For Visiting" + "\n\n \t Please Take Care");
    }
    
    public void setEditableFalse(){
        txtPatientId.setEditable(false);
        txtPatientName.setEditable(false);
        txtDoctorName.setEditable(false);
        txtBillAmount.setEditable(false);
        txtClaimAmount.setEditable(false);
        txtPolicyNumber.setEditable(false); 
        txtAreaReceipt.setEditable(false);
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        invoicejPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblPatientId = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaReceipt = new javax.swing.JTextArea();
        btnPrint = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblPatientName = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        lblPolicyNumber = new javax.swing.JLabel();
        txtPolicyNumber = new javax.swing.JTextField();
        lblDoctorName = new javax.swing.JLabel();
        txtDoctorName = new javax.swing.JTextField();
        lblClaimAmount = new javax.swing.JLabel();
        txtClaimAmount = new javax.swing.JTextField();
        lblTotalAmount = new javax.swing.JLabel();
        txtBillAmount = new javax.swing.JTextField();

        invoicejPanel.setBackground(new java.awt.Color(77, 154, 115));
        invoicejPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Patient Invoice");

        lblPatientId.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPatientId.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPatientId.setText("Patient ID:");

        txtAreaReceipt.setColumns(20);
        txtAreaReceipt.setRows(5);
        txtAreaReceipt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(txtAreaReceipt);

        btnPrint.setBackground(new java.awt.Color(255, 204, 51));
        btnPrint.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 204, 51));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblPatientName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPatientName.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPatientName.setText("Patient Name:");

        lblPolicyNumber.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPolicyNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblPolicyNumber.setText("Policy Number, if any :");

        lblDoctorName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDoctorName.setForeground(new java.awt.Color(255, 255, 255));
        lblDoctorName.setText("Consulted By :");

        lblClaimAmount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblClaimAmount.setForeground(new java.awt.Color(255, 255, 255));
        lblClaimAmount.setText("Claim Amount:");

        lblTotalAmount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTotalAmount.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalAmount.setText("Total Bill Amount:");

        javax.swing.GroupLayout invoicejPanelLayout = new javax.swing.GroupLayout(invoicejPanel);
        invoicejPanel.setLayout(invoicejPanelLayout);
        invoicejPanelLayout.setHorizontalGroup(
            invoicejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(invoicejPanelLayout.createSequentialGroup()
                .addGroup(invoicejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(invoicejPanelLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(invoicejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(invoicejPanelLayout.createSequentialGroup()
                                .addComponent(lblPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(invoicejPanelLayout.createSequentialGroup()
                                .addGroup(invoicejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPolicyNumber)
                                    .addComponent(lblPatientName)
                                    .addComponent(lblDoctorName)
                                    .addComponent(lblClaimAmount)
                                    .addComponent(lblTotalAmount))
                                .addGroup(invoicejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(invoicejPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(invoicejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtPatientName)
                                            .addComponent(txtPolicyNumber)
                                            .addComponent(txtDoctorName)
                                            .addComponent(txtClaimAmount)
                                            .addComponent(txtBillAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(invoicejPanelLayout.createSequentialGroup()
                                        .addGap(157, 157, 157)
                                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE))))
                    .addGroup(invoicejPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        invoicejPanelLayout.setVerticalGroup(
            invoicejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invoicejPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(invoicejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(invoicejPanelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(invoicejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPatientId)
                            .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(invoicejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPatientName)
                            .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(invoicejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDoctorName)
                            .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(invoicejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPolicyNumber)
                            .addComponent(txtPolicyNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(invoicejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtClaimAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblClaimAmount))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(invoicejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTotalAmount)
                            .addComponent(txtBillAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(invoicejPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrint)
                .addGap(18, 18, 18)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(invoicejPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(invoicejPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
        //String printData = txtAreaReceipt.getText();
        //txtAreaReceipt.print();
        //PrinterJob job = PrinterJob.getPrinterJob();
        try {
                boolean complete = txtAreaReceipt.print();
                if (complete) {
                    /* show a success message  */
                   JOptionPane.showMessageDialog(null,"Printed"); 
                } else {
                    /*show a message indicating that printing was cancelled */
                    JOptionPane.showMessageDialog(null,"Couldnot print because of technical issues!");
                }
            } catch (PrinterException pe) {
                /* Printing failed, report to the user */
                }   
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPrint;
    private javax.swing.JPanel invoicejPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblClaimAmount;
    private javax.swing.JLabel lblDoctorName;
    private javax.swing.JLabel lblPatientId;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblPolicyNumber;
    private javax.swing.JLabel lblTotalAmount;
    private javax.swing.JTextArea txtAreaReceipt;
    private javax.swing.JTextField txtBillAmount;
    private javax.swing.JTextField txtClaimAmount;
    private javax.swing.JTextField txtDoctorName;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPolicyNumber;
    // End of variables declaration//GEN-END:variables
}
