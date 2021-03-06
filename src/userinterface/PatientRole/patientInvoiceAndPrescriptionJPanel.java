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
        
        
        try{
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
    
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Nothing to display ");
        }
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
        invoicejPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Patient Invoice");
        invoicejPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 27, 550, -1));

        lblPatientId.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPatientId.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPatientId.setText("Patient ID:");
        invoicejPanel.add(lblPatientId, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 87, 77, -1));
        invoicejPanel.add(txtPatientId, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 85, 164, -1));

        txtAreaReceipt.setColumns(20);
        txtAreaReceipt.setRows(5);
        txtAreaReceipt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(txtAreaReceipt);

        invoicejPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 78, 313, 241));

        btnPrint.setBackground(new java.awt.Color(255, 204, 51));
        btnPrint.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsImages/printer.png"))); // NOI18N
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        invoicejPanel.add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 92, -1));

        btnBack.setBackground(new java.awt.Color(255, 204, 51));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        invoicejPanel.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 93, 31));

        lblPatientName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPatientName.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPatientName.setText("Patient Name:");
        invoicejPanel.add(lblPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 113, -1, -1));
        invoicejPanel.add(txtPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 111, 164, -1));

        lblPolicyNumber.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPolicyNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblPolicyNumber.setText("Policy Number, if any :");
        invoicejPanel.add(lblPolicyNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 165, -1, -1));
        invoicejPanel.add(txtPolicyNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 163, 164, -1));

        lblDoctorName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDoctorName.setForeground(new java.awt.Color(255, 255, 255));
        lblDoctorName.setText("Consulted By :");
        invoicejPanel.add(lblDoctorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 139, -1, -1));
        invoicejPanel.add(txtDoctorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 137, 164, -1));

        lblClaimAmount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblClaimAmount.setForeground(new java.awt.Color(255, 255, 255));
        lblClaimAmount.setText("Claim Amount:");
        invoicejPanel.add(lblClaimAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 191, -1, -1));
        invoicejPanel.add(txtClaimAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 189, 164, -1));

        lblTotalAmount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTotalAmount.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalAmount.setText("Total Bill Amount:");
        invoicejPanel.add(lblTotalAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 217, -1, -1));
        invoicejPanel.add(txtBillAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 215, 164, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(invoicejPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(invoicejPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
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
