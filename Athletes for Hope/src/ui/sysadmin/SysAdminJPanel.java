/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.sysadmin;

/**
 *
 * @author puranjaimendiratta
 */
public class SysAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SysAdminJPanel
     */
    public SysAdminJPanel() {
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
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        lblWelcomeSysAdmin = new javax.swing.JLabel();
        btnManageEnterprises = new javax.swing.JButton();
        btnManageEnterpriseAdministrator = new javax.swing.JButton();
        btnManageNetworks = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel2.setBackground(new java.awt.Color(253, 235, 208));
        jPanel2.setToolTipText("");
        jPanel2.setInheritsPopupMenu(true);
        jPanel2.setLayout(new java.awt.GridBagLayout());

        lblWelcomeSysAdmin.setBackground(java.awt.Color.white);
        lblWelcomeSysAdmin.setFont(new java.awt.Font("Monaco", 1, 24)); // NOI18N
        lblWelcomeSysAdmin.setForeground(new java.awt.Color(51, 102, 255));
        lblWelcomeSysAdmin.setText("Welcome System Admin");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 0);
        jPanel2.add(lblWelcomeSysAdmin, gridBagConstraints);

        btnManageEnterprises.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        btnManageEnterprises.setForeground(new java.awt.Color(51, 102, 255));
        btnManageEnterprises.setText("Manage Enterprises");
        btnManageEnterprises.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageEnterprises.setBorderPainted(false);
        btnManageEnterprises.setContentAreaFilled(false);
        btnManageEnterprises.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnManageEnterprisesMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnManageEnterprisesMouseEntered(evt);
            }
        });
        btnManageEnterprises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterprisesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 52, 26, 0);
        jPanel2.add(btnManageEnterprises, gridBagConstraints);

        btnManageEnterpriseAdministrator.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        btnManageEnterpriseAdministrator.setForeground(new java.awt.Color(51, 102, 255));
        btnManageEnterpriseAdministrator.setText("Manage Enterprise Administrators ");
        btnManageEnterpriseAdministrator.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageEnterpriseAdministrator.setBorderPainted(false);
        btnManageEnterpriseAdministrator.setContentAreaFilled(false);
        btnManageEnterpriseAdministrator.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnManageEnterpriseAdministratorMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnManageEnterpriseAdministratorMouseEntered(evt);
            }
        });
        btnManageEnterpriseAdministrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseAdministratorActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 35, 26, 38);
        jPanel2.add(btnManageEnterpriseAdministrator, gridBagConstraints);

        btnManageNetworks.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        btnManageNetworks.setForeground(new java.awt.Color(51, 102, 255));
        btnManageNetworks.setText("Manage Networks");
        btnManageNetworks.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageNetworks.setBorderPainted(false);
        btnManageNetworks.setContentAreaFilled(false);
        btnManageNetworks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnManageNetworksMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnManageNetworksMouseEntered(evt);
            }
        });
        btnManageNetworks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNetworksActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 52, 26, 0);
        jPanel2.add(btnManageNetworks, gridBagConstraints);

        jSplitPane1.setTopComponent(jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 824, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 287, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageEnterprisesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageEnterprisesMouseExited
        btnManageEnterprises.setForeground(Color.white);        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageEnterprisesMouseExited

    private void btnManageEnterprisesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageEnterprisesMouseEntered
        btnManageEnterprises.setForeground(Color.BLACK);        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageEnterprisesMouseEntered

    private void btnManageEnterprisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterprisesActionPerformed
        // TODO add your handling code here:
        ManageEnterpriseJPanel manageEnterpriseJPanel=new ManageEnterpriseJPanel(userProcessContainer, ecosystem);
        jSplitPane1.setBottomComponent(manageEnterpriseJPanel);
        /*userProcessContainer.add("manageEnterpriseJPanel",manageEnterpriseJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);*/
    }//GEN-LAST:event_btnManageEnterprisesActionPerformed

    private void btnManageEnterpriseAdministratorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageEnterpriseAdministratorMouseExited
        btnManageEnterpriseAdministrator.setForeground(Color.white);        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageEnterpriseAdministratorMouseExited

    private void btnManageEnterpriseAdministratorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageEnterpriseAdministratorMouseEntered
        btnManageEnterpriseAdministrator.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageEnterpriseAdministratorMouseEntered

    private void btnManageEnterpriseAdministratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseAdministratorActionPerformed
        // TODO add your handling code here:
        ManageEnterpriseAdminJPanel manageEnterpriseAdminJPanel=new ManageEnterpriseAdminJPanel(userProcessContainer, ecosystem);
        jSplitPane1.setBottomComponent(manageEnterpriseAdminJPanel);
        /*userProcessContainer.add("manageEnterpriseAdminJPanel",manageEnterpriseAdminJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);*/
    }//GEN-LAST:event_btnManageEnterpriseAdministratorActionPerformed

    private void btnManageNetworksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageNetworksMouseExited
        btnManageNetworks.setForeground(Color.white);        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageNetworksMouseExited

    private void btnManageNetworksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageNetworksMouseEntered
        btnManageNetworks.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageNetworksMouseEntered

    private void btnManageNetworksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNetworksActionPerformed
        // TODO add your handling code here:
        ManageNetworkJPanel manageNetworkJPanel=new ManageNetworkJPanel(userProcessContainer, ecosystem);
        jSplitPane1.setBottomComponent(manageNetworkJPanel);
        /*userProcessContainer.add("manageNetworkJPanel",manageNetworkJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);*/
    }//GEN-LAST:event_btnManageNetworksActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageEnterpriseAdministrator;
    private javax.swing.JButton btnManageEnterprises;
    private javax.swing.JButton btnManageNetworks;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblWelcomeSysAdmin;
    // End of variables declaration//GEN-END:variables
}
