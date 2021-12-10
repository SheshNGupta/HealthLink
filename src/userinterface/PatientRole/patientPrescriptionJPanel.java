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
import java.awt.print.PrinterException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Nikita
 */
public class patientPrescriptionJPanel extends javax.swing.JPanel {
    
    
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem ecoSystem;
    
    private PatientVisitWorkRequest visitWorkRequest;

    /**
     * Creates new form patientPrescriptionJPanel
     */
    
    
    public patientPrescriptionJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, EcoSystem ecoSystem, PatientVisitWorkRequest visitWorkRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.ecoSystem = ecoSystem;
        this.visitWorkRequest = visitWorkRequest;
        
        try{
        
        txtPatientIdP.setText(userAccount.getCus().getPatientId());
        txtPatientNameP.setText(userAccount.getCus().getPatientFirstName()+" "+userAccount.getCus().getPatientLastName());
        txtConsultedBy.setText(visitWorkRequest.getAssignedDoctor().getEmployee().getName());
        txtPrescription.setText(visitWorkRequest.getPrescription());
        
        setEditableFalse();
        
        String patientIdp = String.format(txtPatientIdP.getText());
        String patientNamep = String.format(txtPatientNameP.getText());
        String doctorNamep = String.format(txtConsultedBy.getText());
        String prescription = String.format(txtPrescription.getText());
        
        txtAreaPrescription.append("\t Patient Prescription\n\n"+ " Patient ID: "+patientIdp+ "\n Patient Name: "+patientNamep+ "\n Consulted By: "+doctorNamep+ "\n Prescription: "+prescription+ "\n\n \t Thank You For Visiting" + "\n\n \t Please Take Care");
        }catch(Exception e ){
        
            JOptionPane.showMessageDialog(null, "Nothing to display ");
            
        }
        
    }

    
    public void setEditableFalse(){
        txtPatientIdP.setEditable(false);
        txtPatientNameP.setEditable(false);
        txtConsultedBy.setEditable(false);
        txtPrescription.setEditable(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrescription = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblPatientidp = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblConsultedBy = new javax.swing.JLabel();
        lblTreatment = new javax.swing.JLabel();
        txtPatientIdP = new javax.swing.JTextField();
        txtPatientNameP = new javax.swing.JTextField();
        txtConsultedBy = new javax.swing.JTextField();
        txtPrescription = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaPrescription = new javax.swing.JTextArea();
        btnPrintP = new javax.swing.JButton();
        btnback = new javax.swing.JButton();

        jPanelPrescription.setBackground(new java.awt.Color(77, 154, 115));
        jPanelPrescription.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Patient Prescription");
        jPanelPrescription.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 44, 551, -1));

        lblPatientidp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPatientidp.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientidp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPatientidp.setText("Patient ID:");
        jPanelPrescription.add(lblPatientidp, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 115, 77, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Patient Name:");
        jPanelPrescription.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 146, -1, -1));

        lblConsultedBy.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblConsultedBy.setForeground(new java.awt.Color(255, 255, 255));
        lblConsultedBy.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblConsultedBy.setText("Consulted by:");
        jPanelPrescription.add(lblConsultedBy, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 177, 87, -1));

        lblTreatment.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTreatment.setForeground(new java.awt.Color(255, 255, 255));
        lblTreatment.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTreatment.setText("Treatment:");
        jPanelPrescription.add(lblTreatment, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 206, 87, -1));
        jPanelPrescription.add(txtPatientIdP, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 113, 178, -1));
        jPanelPrescription.add(txtPatientNameP, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 144, 178, -1));
        jPanelPrescription.add(txtConsultedBy, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 175, 178, -1));
        jPanelPrescription.add(txtPrescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 206, 178, 109));

        txtAreaPrescription.setColumns(20);
        txtAreaPrescription.setRows(5);
        jScrollPane1.setViewportView(txtAreaPrescription);

        jPanelPrescription.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 113, 359, 202));

        btnPrintP.setBackground(new java.awt.Color(255, 204, 51));
        btnPrintP.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPrintP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsImages/printer.png"))); // NOI18N
        btnPrintP.setText("Print");
        btnPrintP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintPActionPerformed(evt);
            }
        });
        jPanelPrescription.add(btnPrintP, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 88, -1));

        btnback.setBackground(new java.awt.Color(255, 204, 51));
        btnback.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnback.setText("<< Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanelPrescription.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnPrintPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintPActionPerformed
        // TODO add your handling code here:
        try {
                boolean complete = txtAreaPrescription.print();
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
    }//GEN-LAST:event_btnPrintPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrintP;
    private javax.swing.JButton btnback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanelPrescription;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblConsultedBy;
    private javax.swing.JLabel lblPatientidp;
    private javax.swing.JLabel lblTreatment;
    private javax.swing.JTextArea txtAreaPrescription;
    private javax.swing.JTextField txtConsultedBy;
    private javax.swing.JTextField txtPatientIdP;
    private javax.swing.JTextField txtPatientNameP;
    private javax.swing.JTextField txtPrescription;
    // End of variables declaration//GEN-END:variables
}
