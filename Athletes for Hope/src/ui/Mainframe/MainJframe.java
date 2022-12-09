/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.Mainframe;

/**
 *
 * @author puranjaimendiratta
 */
public class MainJframe extends javax.swing.JFrame {

    /**
     * Creates new form MainJframe
     */
    public MainJframe() {
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

        TopPanel = new javax.swing.JPanel();
        NamejLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SignupjButton = new javax.swing.JButton();
        SigninjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 700));

        TopPanel.setBackground(new java.awt.Color(129, 178, 154));
        TopPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NamejLabel.setFont(new java.awt.Font("Monaco", 1, 48)); // NOI18N
        NamejLabel.setForeground(new java.awt.Color(61, 64, 91));
        NamejLabel.setText("Women Abuse Reporting System");
        TopPanel.add(NamejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 780, 80));

        jPanel1.setBackground(new java.awt.Color(244, 241, 222));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(244, 241, 222));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, -180, 1070, 830));

        SignupjButton.setBackground(new java.awt.Color(129, 178, 154));
        SignupjButton.setFont(new java.awt.Font("Monaco", 1, 24)); // NOI18N
        SignupjButton.setForeground(new java.awt.Color(61, 64, 91));
        SignupjButton.setText("Sign Up");
        SignupjButton.setBorderPainted(false);
        SignupjButton.setContentAreaFilled(false);
        SignupjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupjButtonActionPerformed(evt);
            }
        });
        jPanel1.add(SignupjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 140, -1));

        SigninjButton.setBackground(new java.awt.Color(129, 178, 154));
        SigninjButton.setFont(new java.awt.Font("Monaco", 1, 24)); // NOI18N
        SigninjButton.setForeground(new java.awt.Color(61, 64, 91));
        SigninjButton.setText("Sign In");
        SigninjButton.setBorderPainted(false);
        SigninjButton.setContentAreaFilled(false);
        SigninjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SigninjButtonActionPerformed(evt);
            }
        });
        jPanel1.add(SigninjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 170, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1412, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1410, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 859, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(109, 109, 109)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignupjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupjButtonActionPerformed
        this.dispose();
        SignUpJFrame eng = new SignUpJFrame();
        eng.setVisible(true);
    }//GEN-LAST:event_SignupjButtonActionPerformed

    private void SigninjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SigninjButtonActionPerformed
        this.dispose();
        SignInJFrame eng = new SignInJFrame();
        eng.setVisible(true);
    }//GEN-LAST:event_SigninjButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NamejLabel;
    private javax.swing.JButton SigninjButton;
    private javax.swing.JButton SignupjButton;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
