/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PatientRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HealthCenterEnterprise;
import Business.Enterprise.InsuranceCompanyEnterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.InsAgentOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.InsuranceWorkRequest;
import Business.WorkQueue.PatientVisitWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.AdministrativeRole.ViewAllOrderJPanel;

/**
 *
 * @author Shesh Narayan
 */
public class PatientWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount userAccount;
    EcoSystem ecoSystem;
   
    

    public PatientWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise,EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.ecoSystem = business;
        patientId.setText(userAccount.getCus().getPatientId());
        patientName.setText(userAccount.getCus().getPatientFirstName()+" "+userAccount.getCus().getPatientLastName());
        populateTable();
        populateInsTable();
        addImage();
        
    }
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        for(Network net:ecoSystem.getNetworks()){
            for(Enterprise enter: net.getEnterpriseDirectory().getEnterpriseList()){
                if ((enter instanceof HealthCenterEnterprise)&&(net.getZip()==enter.getZipcode()))
                {
                    for (Organization org : enter.getOrganizationDirectory().getOrganizations()) 
                    {
                        if (org instanceof DoctorOrganization) 
                        {
                            for (WorkRequest request : org.getWorkQueue().getWorkRequests()) 
                            {
                                if(((PatientVisitWorkRequest) request).getPatient().getPatientId()==userAccount.getCus().getPatientId())
                                {
                                    String status = request.getStatus();
                                    Object[] row = new Object[5];
                                    row[0] = request;
                                    row[1] = status;
                                    row[2] = ((PatientVisitWorkRequest) request).getBillAmount();
                                    row[3] = ((PatientVisitWorkRequest) request).getPatient().getInsuranceCustomer().getInsurancePolicyNumber();
                                    if(((PatientVisitWorkRequest) request).getAssignedDoctor()!=null)
                                    {
                                        row[4] = ((PatientVisitWorkRequest) request).getAssignedDoctor().getEmployee().getName();
                                    }
                                    else

                                    {
                                        row[4] ="Not Assigned";
                                    }


                                    model.addRow(row);
                                }
                            }
                        }
                    }
                    
                }
            }
            
        }
        
    }
    
    public void populateInsTable() {
        DefaultTableModel model = (DefaultTableModel) insTable.getModel();
        model.setRowCount(0);
        for(Network net:ecoSystem.getNetworks()){
            for(Enterprise enter: net.getEnterpriseDirectory().getEnterpriseList()){
                if (enter instanceof InsuranceCompanyEnterprise)
                {
                    for (Organization org : enter.getOrganizationDirectory().getOrganizations()) 
                    {
                        if (org instanceof InsAgentOrganization) 
                        {
                            for (WorkRequest request : org.getWorkQueue().getWorkRequests()) 
                            {
                                if(((InsuranceWorkRequest) request).getSsn().equals(userAccount.getCus().getSsn()))
                                {
                                    String status = request.getStatus();
                                    Object[] row = new Object[5];
                                    row[0] = request;
                                    row[1] = status;
                                    row[2] = ((InsuranceWorkRequest) request).getBillAmount();
                                    row[3] = ((InsuranceWorkRequest) request).getClaimAmount();
                                    row[4] = ((InsuranceWorkRequest) request).getAgent();
                                    model.addRow(row);
                                }
                            }
                        }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        patientId = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        patientName = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        insTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnprescription = new javax.swing.JButton();
        personImageLabels = new javax.swing.JLabel();

        setBackground(new java.awt.Color(77, 154, 115));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setBackground(new java.awt.Color(153, 255, 153));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Reason", "Status", "Amount", "Policy Number", "Assigned Doctor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 638, 130));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Patient Id:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        patientId.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        patientId.setForeground(new java.awt.Color(255, 255, 255));
        add(patientId, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 178, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Patient Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, -1, -1));

        patientName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        patientName.setForeground(new java.awt.Color(255, 255, 255));
        add(patientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 170, 30));

        insTable.setBackground(new java.awt.Color(153, 255, 153));
        insTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Policy Number", "Status", "Bill Amount", "Claim Amount", "Assigned Agent"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(insTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 640, 130));

        jButton1.setBackground(new java.awt.Color(255, 204, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsImages/view.png"))); // NOI18N
        jButton1.setText("View Hospitals");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 140, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Patients Portal");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 204, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsImages/printer.png"))); // NOI18N
        jButton2.setText("Print Invoice");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 440, -1, -1));

        btnprescription.setBackground(new java.awt.Color(255, 204, 51));
        btnprescription.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnprescription.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsImages/printer.png"))); // NOI18N
        btnprescription.setText("Print Prescription");
        btnprescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprescriptionActionPerformed(evt);
            }
        });
        add(btnprescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 150, 30));
        add(personImageLabels, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 130, 120));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        PatientPlanVisitJPanel patientPlanVisitJPanel = new PatientPlanVisitJPanel(userProcessContainer, userAccount,enterprise, ecoSystem);
        userProcessContainer.add("PatientPlanVisitJPanel", patientPlanVisitJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
        JOptionPane.showMessageDialog(null,"Please select a row first");
        return;
        }
        PatientVisitWorkRequest visit = (PatientVisitWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);

        patientInvoiceAndPrescriptionJPanel manageInvoiceAndPrescriptionJPanel = new patientInvoiceAndPrescriptionJPanel (userProcessContainer, userAccount, enterprise, ecoSystem,visit );
        userProcessContainer.add("manageInvoiceAndPrescriptionJPanel ", manageInvoiceAndPrescriptionJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnprescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprescriptionActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please select a row first");
            return;
        }
        PatientVisitWorkRequest visit2 = (PatientVisitWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);

        patientPrescriptionJPanel managePrescriptionJPanel = new patientPrescriptionJPanel (userProcessContainer, userAccount, enterprise, ecoSystem,visit2 );
        userProcessContainer.add("managePrescriptionJPanel ", managePrescriptionJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
        
    }//GEN-LAST:event_btnprescriptionActionPerformed


    public void addImage(){
        //        Addded by Bharat
        String Path;
        Path = patientId.getText()+".jpg";
        ImageIcon icon = new ImageIcon(Path);
        Image img = icon.getImage();
        Image imagescaled = img.getScaledInstance(130,120,Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imagescaled);
        personImageLabels.setIcon(scaledIcon);
// 
    }
          

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnprescription;
    private javax.swing.JTable insTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel patientId;
    private javax.swing.JLabel patientName;
    private javax.swing.JLabel personImageLabels;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}

