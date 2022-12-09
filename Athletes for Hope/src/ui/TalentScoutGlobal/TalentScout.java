/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.TalentScoutGlobal;

/**
 *
 * @author puranjaimendiratta
 */
public class TalentScout extends javax.swing.JPanel {

    /**
     * Creates new form TalentScout
     */
    public TalentScout() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jVolunteerSplitPanel = new javax.swing.JSplitPane();
        jPanel09 = new javax.swing.JPanel();
        lblCaseReporter = new javax.swing.JLabel();
        btnViewStatus = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jVolunteerSplitPanel.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel09.setBackground(new java.awt.Color(129, 178, 154));
        jPanel09.setLayout(new java.awt.GridBagLayout());

        lblCaseReporter.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        lblCaseReporter.setForeground(new java.awt.Color(61, 64, 91));
        lblCaseReporter.setText("Welcome Case Reporter");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 112, 0, 0);
        jPanel09.add(lblCaseReporter, gridBagConstraints);

        btnViewStatus.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        btnViewStatus.setForeground(new java.awt.Color(61, 64, 91));
        btnViewStatus.setText("View Status");
        btnViewStatus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnViewStatus.setBorderPainted(false);
        btnViewStatus.setContentAreaFilled(false);
        btnViewStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnViewStatusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnViewStatusMouseExited(evt);
            }
        });
        btnViewStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewStatusActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 47, 11, 84);
        jPanel09.add(btnViewStatus, gridBagConstraints);

        btnReport.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        btnReport.setForeground(new java.awt.Color(61, 64, 91));
        btnReport.setText("Report");
        btnReport.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReport.setBorderPainted(false);
        btnReport.setContentAreaFilled(false);
        btnReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReportMouseExited(evt);
            }
        });
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 57;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 74, 11, 0);
        jPanel09.add(btnReport, gridBagConstraints);

        jVolunteerSplitPanel.setTopComponent(jPanel09);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.GridBagLayout());
        jVolunteerSplitPanel.setRightComponent(jPanel10);

        jPanel8.add(jVolunteerSplitPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 0, 1110, 530));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 530));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -5, 1110, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewStatusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewStatusMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewStatusMouseEntered

    private void btnViewStatusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewStatusMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewStatusMouseExited

    private void btnViewStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewStatusActionPerformed
        // TODO add your handling code here:
        CaseReporterViewStatusJPanel reportJPanel1=new CaseReporterViewStatusJPanel(userProcessContainer,userAccount,HSOrganization,HSenterprise,business);
        jVolunteerSplitPanel.setBottomComponent(reportJPanel1);
    }//GEN-LAST:event_btnViewStatusActionPerformed

    private void btnReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportMouseEntered
        btnReport.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportMouseEntered

    private void btnReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportMouseExited
        btnReport.setForeground(Color.white);        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportMouseExited

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        ReportJPanel reportJPanel=new ReportJPanel(userProcessContainer,business,userAccount,HSOrganization,network);
        jVolunteerSplitPanel.setBottomComponent(reportJPanel);
        //ReportJFrame r = new ReportJFrame(system,network,ua,org);
    }//GEN-LAST:event_btnReportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnViewStatus;
    private javax.swing.JPanel jPanel09;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSplitPane jVolunteerSplitPanel;
    private javax.swing.JLabel lblCaseReporter;
    // End of variables declaration//GEN-END:variables
}
