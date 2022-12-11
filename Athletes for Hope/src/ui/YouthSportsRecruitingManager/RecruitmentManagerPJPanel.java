/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.YouthSportsRecruitingManager;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Organization.TalentRecruitmentOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
/**
 *
 * @author puranjaimendiratta
 */
public class RecruitmentManagerPJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RecruitmentManagerPJPanel
     */
    private JPanel userProcCont;
    private EcoSystem bus;
    private UserAccount usrAccnt;
    private TalentRecruitmentOrganization CVOrg; 
    public RecruitmentManagerPJPanel(JPanel userProcCont, UserAccount usrAccnt, Organization CVOrg,Enterprise enterprise,EcoSystem bus) {
        initComponents();
        this.userProcCont = userProcCont;
        this.usrAccnt = usrAccnt;
        this.bus = bus;
        this.CVOrg = (TalentRecruitmentOrganization)CVOrg;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jCasePanel = new javax.swing.JPanel();
        jCaseVolunteerPanel = new javax.swing.JScrollPane();
        tblCaseReq = new javax.swing.JTable();
        btnViewReport = new javax.swing.JButton();
        lblCaseReq = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(244, 241, 222));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCasePanel.setBackground(new java.awt.Color(244, 241, 222));
        jCasePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCaseReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Case No.", "Name ", "Location", "Network", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jCaseVolunteerPanel.setViewportView(tblCaseReq);

        jCasePanel.add(jCaseVolunteerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 580, 100));

        btnViewReport.setBackground(new java.awt.Color(129, 178, 154));
        btnViewReport.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        btnViewReport.setForeground(new java.awt.Color(61, 64, 91));
        btnViewReport.setText("View Report");
        btnViewReport.setBorderPainted(false);
        btnViewReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnViewReportMouseEntered(evt);
            }
        });
        btnViewReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewReportActionPerformed(evt);
            }
        });
        jCasePanel.add(btnViewReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 126, 44));

        lblCaseReq.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        lblCaseReq.setForeground(new java.awt.Color(61, 64, 91));
        lblCaseReq.setText("Case Requests");
        jCasePanel.add(lblCaseReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        jPanel2.add(jCasePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 670, 420));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewReportMouseEntered

    }//GEN-LAST:event_btnViewReportMouseEntered

    private void btnViewReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewReportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnViewReport;
    private javax.swing.JPanel jCasePanel;
    private javax.swing.JScrollPane jCaseVolunteerPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCaseReq;
    private javax.swing.JTable tblCaseReq;
    // End of variables declaration//GEN-END:variables
}
