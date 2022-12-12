/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.HealthInsurance;

import business.EcoSystem;
import business.Network.Network;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import business.WorkQueue.TalentScoutWorkRequest;
import business.WorkQueue.InsuranceAgentWorkRequest;
import business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author hp
 */
public class HealthInsuranceRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HealthInsuranceRequestJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    InsuranceAgentWorkRequest request;
    Network network;
    public HealthInsuranceRequestJPanel(JPanel userProcessContainer, EcoSystem system, UserAccount userAccount,Organization organization,Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.organization=organization;
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

        lblHeader = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLawyerManageRequest = new javax.swing.JTable();
        btnAssignRequest = new javax.swing.JButton();
        btnViewCaseReport = new javax.swing.JButton();
        btnEncounter = new javax.swing.JButton();
        btnCaseComplete = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        lblHeader.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(255, 146, 1));
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Manage Requests");

        tblLawyerManageRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Child Name", "Enrollment Time", "Status", "Assigned to"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblLawyerManageRequest);

        btnAssignRequest.setBackground(new java.awt.Color(255, 146, 1));
        btnAssignRequest.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        btnAssignRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnAssignRequest.setText("Assign Request");
        btnAssignRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAssignRequestMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAssignRequestMouseExited(evt);
            }
        });
        btnAssignRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignRequestActionPerformed(evt);
            }
        });

        btnViewCaseReport.setBackground(new java.awt.Color(255, 146, 1));
        btnViewCaseReport.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        btnViewCaseReport.setForeground(new java.awt.Color(255, 255, 255));
        btnViewCaseReport.setText("View Case Report");
        btnViewCaseReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnViewCaseReportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnViewCaseReportMouseExited(evt);
            }
        });
        btnViewCaseReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCaseReportActionPerformed(evt);
            }
        });

        btnEncounter.setBackground(new java.awt.Color(255, 146, 1));
        btnEncounter.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        btnEncounter.setForeground(new java.awt.Color(255, 255, 255));
        btnEncounter.setText("Consultation");
        btnEncounter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEncounterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEncounterMouseExited(evt);
            }
        });
        btnEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncounterActionPerformed(evt);
            }
        });

        btnCaseComplete.setBackground(new java.awt.Color(255, 146, 1));
        btnCaseComplete.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        btnCaseComplete.setForeground(new java.awt.Color(255, 255, 255));
        btnCaseComplete.setText(" Case Complete");
        btnCaseComplete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCaseCompleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCaseCompleteMouseExited(evt);
            }
        });
        btnCaseComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaseCompleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAssignRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnViewCaseReport)
                        .addGap(18, 18, 18)
                        .addComponent(btnEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCaseComplete)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(149, 149, 149))
            .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssignRequest)
                    .addComponent(btnViewCaseReport)
                    .addComponent(btnEncounter)
                    .addComponent(btnCaseComplete))
                .addGap(133, 133, 133))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignRequestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAssignRequestMouseEntered
        btnAssignRequest.setForeground(new Color(0,128,128));         // TODO add your handling code here:
    }//GEN-LAST:event_btnAssignRequestMouseEntered

    private void btnAssignRequestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAssignRequestMouseExited
        btnAssignRequest.setForeground(Color.black);         // TODO add your handling code here:
    }//GEN-LAST:event_btnAssignRequestMouseExited

    private void btnAssignRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignRequestActionPerformed

        int selectedRow = tblLawyerManageRequest.getSelectedRow();
        WorkRequest request = (InsuranceAgentWorkRequest)tblLawyerManageRequest.getValueAt(selectedRow, 2);
        if (CheckOpenCases(userAccount) == 0){
            request.setReceiver(userAccount);
            request.setStatus("Accepted");
            populateTable();
        }else
        {
            JOptionPane.showMessageDialog(null, "Only one case can be accepted at a time");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnAssignRequestActionPerformed

    private void btnViewCaseReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewCaseReportMouseEntered
        btnViewCaseReport.setForeground(new Color(0,128,128));         // TODO add your handling code here:
    }//GEN-LAST:event_btnViewCaseReportMouseEntered

    private void btnViewCaseReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewCaseReportMouseExited
        btnViewCaseReport.setForeground(Color.black);         // TODO add your handling code here:
    }//GEN-LAST:event_btnViewCaseReportMouseExited

    private void btnViewCaseReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCaseReportActionPerformed

        int selectedRow = tblLawyerManageRequest.getSelectedRow();
        String sta=tblLawyerManageRequest.getValueAt(selectedRow, 2).toString();
        String status="Waiting";
        //        if(sta.equalsIgnoreCase(status))
        //        {
            //            JOptionPane.showMessageDialog(null, "Access Denied");
            //        }
        //        else{
            if (selectedRow < 0){
                return;
            }

            InsuranceAgentWorkRequest request = (InsuranceAgentWorkRequest)tblLawyerManageRequest.getValueAt(selectedRow, 2);

            if (request.getReceiver()!=userAccount){
                JOptionPane.showMessageDialog(this, "You cannot view the report of this case. Access Denied.");
            }else{

                HealthInsuranceCaseReportJPanel caseReportJPanel = new HealthInsuranceCaseReportJPanel(userProcessContainer,system,request.getTalentScoutWorkRequest(),userAccount,network);
                userProcessContainer.add("caseReportJPanel", caseReportJPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
                /*CaseReportJPanel casereportJPanel=new CaseReportJPanel(userProcessContainer,system,request);
                casereportJPanel.setVisible(true);*/
                // }

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewCaseReportActionPerformed

    private void btnEncounterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEncounterMouseEntered
        btnEncounter.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_btnEncounterMouseEntered

    private void btnEncounterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEncounterMouseExited
        btnEncounter.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btnEncounterMouseExited

    private void btnEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncounterActionPerformed

        int selectedRow = tblLawyerManageRequest.getSelectedRow();

        String sta=tblLawyerManageRequest.getValueAt(selectedRow, 2).toString();
        String status="Waiting";
        //        if(sta.equalsIgnoreCase(status))
        //        {
            //            JOptionPane.showMessageDialog(null, "Access Denied");
            //        }
        //        else{
            if (selectedRow < 0){
                return;
            }
            InsuranceAgentWorkRequest request = (InsuranceAgentWorkRequest)tblLawyerManageRequest.getValueAt(selectedRow, 2);

            if (request.getReceiver()!=userAccount){
                JOptionPane.showMessageDialog(this, "You cannot view the report of this case. Access Denied.");
            }
            else{
                HealthInsuranceConsultationJPanel lencounterJPanel = new HealthInsuranceConsultationJPanel(userProcessContainer,system,userAccount,network,organization,request);
                userProcessContainer.add("caseReportJPanel", lencounterJPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
            // }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEncounterActionPerformed

    private void btnCaseCompleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCaseCompleteMouseEntered
        btnCaseComplete.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_btnCaseCompleteMouseEntered

    private void btnCaseCompleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCaseCompleteMouseExited
        btnCaseComplete.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btnCaseCompleteMouseExited

    private void btnCaseCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaseCompleteActionPerformed
        int selectedRow = tblLawyerManageRequest.getSelectedRow();

        String sts="Waiting";
        String sta=tblLawyerManageRequest.getValueAt(selectedRow, 2).toString();
        if(sts.equalsIgnoreCase(sta))
        {
            JOptionPane.showMessageDialog(null, "Access Denied");
        }
        else{
            if (selectedRow < 0){
                return;
            }

            WorkRequest request = (InsuranceAgentWorkRequest)tblLawyerManageRequest.getValueAt(selectedRow, 2);
            request.setReceiver(userAccount);
            request.setStatus("Case Completed");
            populateTable();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCaseCompleteActionPerformed
    
    private void populateTable() {
        DefaultTableModel model= (DefaultTableModel) tblLawyerManageRequest.getModel();
        Object[] row=new Object[4];
        model.setRowCount(0);
        
         for(InsuranceAgentWorkRequest request : organization.getWorkQueue().getInsuranceAgentWorkRequestList())
         {
         
            row[0]=request.getTalentScoutWorkRequest().getChildName();
            row[1] = request.getTalentScoutWorkRequest().getDoe();
            row[2] = request;
            if (request.getReceiver()==null){
              row[3] = "Not Assigned";
            }else{
              row[3] = request.getReceiver();
            }
            
            model.addRow(row);
        }
        
    }
    
    private int CheckOpenCases(UserAccount userAccount) {
        int a = 0;
        for(InsuranceAgentWorkRequest request : organization.getWorkQueue().getInsuranceAgentWorkRequestList())
        {
        
          if (request.getReceiver()==userAccount){
              if (request.getStatus().equalsIgnoreCase("Accepted")){
                  a = a + 1;
              }
          } 
        }
        return a; 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignRequest;
    private javax.swing.JButton btnCaseComplete;
    private javax.swing.JButton btnEncounter;
    private javax.swing.JButton btnViewCaseReport;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JTable tblLawyerManageRequest;
    // End of variables declaration//GEN-END:variables
}
