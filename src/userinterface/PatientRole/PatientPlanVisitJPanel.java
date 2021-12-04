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
import Business.Map.MapViewer;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.InsAgentOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.InsuranceWorkRequest;
import Business.WorkQueue.OrderWorkRequest;
import Business.WorkQueue.PatientVisitWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import userinterface.PharmaManagerRole.SendEmailJPanel;

/**
 *
 * @author Shesh Narayan
 */
public class PatientPlanVisitJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount userAccount;
    EcoSystem ecoSystem;
   
    

    public PatientPlanVisitJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise,EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.ecoSystem = business;
        patientId.setText(userAccount.getCus().getPatientId());
        patientName.setText(userAccount.getCus().getPatientFirstName()+" "+userAccount.getCus().getPatientLastName());
        populateTable();
       
    }
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        for(Network net:ecoSystem.getNetworks()){
            for(Enterprise enter: net.getEnterpriseDirectory().getEnterpriseList()){
                if ((enter instanceof HealthCenterEnterprise)&&(net.getZip()==enter.getZipcode()))
                {
                    
                        
                            
                                    String website = "https://www.google.com";
                                    Object[] row = new Object[5];
                                    row[0] = enter.getName();
                                    row[1] = net.getName();
                                    row[2] = enter.getAddress();
                                    row[3] = enter.getEmail();
                                    row[4] = website;
                                    model.addRow(row);
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
        backJButton = new javax.swing.JButton();
        Mapbtn = new javax.swing.JButton();
        dirBtn = new javax.swing.JButton();
        emailBtn = new javax.swing.JButton();
        webBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

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
                "Hospital", "Network", "Address", "Email", "WebSite"
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 638, 130));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Patient Id:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        patientId.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        patientId.setForeground(new java.awt.Color(255, 255, 255));
        add(patientId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 178, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Patient Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, -1, -1));

        patientName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        patientName.setForeground(new java.awt.Color(255, 255, 255));
        add(patientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 170, 30));

        backJButton.setBackground(new java.awt.Color(255, 204, 51));
        backJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        Mapbtn.setBackground(new java.awt.Color(255, 204, 51));
        Mapbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Mapbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsImages/map.png"))); // NOI18N
        Mapbtn.setText("View on Map");
        Mapbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MapbtnActionPerformed(evt);
            }
        });
        add(Mapbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));

        dirBtn.setBackground(new java.awt.Color(255, 204, 51));
        dirBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        dirBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsImages/direction.png"))); // NOI18N
        dirBtn.setText("View Directions");
        dirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dirBtnActionPerformed(evt);
            }
        });
        add(dirBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        emailBtn.setBackground(new java.awt.Color(255, 204, 51));
        emailBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        emailBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsImages/email_send.png"))); // NOI18N
        emailBtn.setText("Send Email Query");
        emailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailBtnActionPerformed(evt);
            }
        });
        add(emailBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, -1, -1));

        webBtn.setBackground(new java.awt.Color(255, 204, 51));
        webBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        webBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsImages/web.png"))); // NOI18N
        webBtn.setText("View Website");
        webBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                webBtnActionPerformed(evt);
            }
        });
        add(webBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Plan Your Next Visit Portal ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PatientWorkAreaJPanel dwjp = (PatientWorkAreaJPanel) component;
        dwjp.populateTable();
        dwjp.populateInsTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void dirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dirBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please select a row first");
            return;
        }
        String location= workRequestJTable.getValueAt(selectedRow, 2).toString(); 
        if (location.trim().isEmpty()){
          JOptionPane.showMessageDialog(null, "Select a row first");  
        }else{
        SwingUtilities.invokeLater(new Runnable() {
 
            @Override
            public void run() {
                MapViewer browser = new MapViewer();
                browser.setVisible(true);
                browser.loadURL("https://www.google.com/maps/dir/?api=1&destination="+location.trim());
            }
        });
        }
    }//GEN-LAST:event_dirBtnActionPerformed

    private void MapbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MapbtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please select a row first");
            return;
        }
        String location= workRequestJTable.getValueAt(selectedRow, 2).toString(); 
        if (location.trim().isEmpty()){
          JOptionPane.showMessageDialog(null, "Select a row first");  
        }else{
        SwingUtilities.invokeLater(new Runnable() {
 
            @Override
            public void run() {
                MapViewer browser = new MapViewer();
                browser.setVisible(true);
                browser.loadURL("https://www.google.com/maps/search/?api=1&query="+location.trim());
            }
        });
        }
    }//GEN-LAST:event_MapbtnActionPerformed

    private void webBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_webBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please select a row first");
            return;
        }
        String location= workRequestJTable.getValueAt(selectedRow,4).toString(); 
        if (location.trim().isEmpty()){
          JOptionPane.showMessageDialog(null, "Select a row first");  
        }else{
        SwingUtilities.invokeLater(new Runnable() {
 
            @Override
            public void run() {
                MapViewer browser = new MapViewer();
                browser.setVisible(true);
                browser.loadURL(location.trim());
            }
        });
        }
    }//GEN-LAST:event_webBtnActionPerformed

    private void emailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        String to="";
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please select a row first");
            return;
        }else {
            to= workRequestJTable.getValueAt(selectedRow,3).toString();
            SendEmailJPanel emailJPanel = new SendEmailJPanel(userProcessContainer,to,"Customer");
            userProcessContainer.add("emailJPanel", emailJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
         
        
    }//GEN-LAST:event_emailBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Mapbtn;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton dirBtn;
    private javax.swing.JButton emailBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel patientId;
    private javax.swing.JLabel patientName;
    private javax.swing.JButton webBtn;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}

