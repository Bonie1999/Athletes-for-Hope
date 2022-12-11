/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.Mainframe;

import ui.Mainframe.MainJFrame;
import business.DB4OUtil.DB4OUtil;
import business.EcoSystem;
import business.Employee.Employee;
import business.Enterprise.Enterprise;
import business.Enterprise.EnterpriseDirectory;
import business.Network.Network;
import business.Organization.Organization;
import business.Role.TalentScoutRole;
import business.UserAccount.UserAccount;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import static java.time.Clock.system;
import java.util.Properties;
import javax.imageio.ImageIO;
import javax.mail.Message;
import javax.mail.Session;
import javax.swing.ImageIcon;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Transport;
import javax.swing.JOptionPane;
/**
 *
 * @author hp
 */
public class SignUpJFrame extends javax.swing.JFrame {

    /**
     * Creates new form SignUpJFrame
     */
    EnterpriseDirectory enterpriseDirectory;
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public SignUpJFrame() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        this.setSize(1080, 680);
        this.setExtendedState(MainJFrame.MAXIMIZED_BOTH);
        populateNetworkComboBox();
    }
    
    private void populateNetworkComboBox(){
        networkJComboBox.removeAllItems();
        
        for (Network network : system.getNetworkList()){
            networkJComboBox.addItem(network);
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
        java.awt.GridBagConstraints gridBagConstraints;

        detailsjPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fnamejLabel = new javax.swing.JLabel();
        contactjLabel = new javax.swing.JLabel();
        usernamejLabel = new javax.swing.JLabel();
        passwordjLabel = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        contactTextField = new javax.swing.JTextField();
        usernameJTextField = new javax.swing.JTextField();
        signupjButton = new javax.swing.JButton();
        passwordJPasswordField = new javax.swing.JPasswordField();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 700));
        setPreferredSize(new java.awt.Dimension(800, 700));

        detailsjPanel.setBackground(new java.awt.Color(242, 204, 143));
        detailsjPanel.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(224, 122, 95));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Talent Scout Volunteer Upload your details below:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 86;
        gridBagConstraints.ipady = 33;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 142, 0, 0);
        detailsjPanel.add(jLabel1, gridBagConstraints);

        fnamejLabel.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        fnamejLabel.setForeground(new java.awt.Color(61, 64, 91));
        fnamejLabel.setText("Full Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 46;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 142, 0, 0);
        detailsjPanel.add(fnamejLabel, gridBagConstraints);

        contactjLabel.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        contactjLabel.setForeground(new java.awt.Color(61, 64, 91));
        contactjLabel.setText("Contact Number");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 142, 0, 0);
        detailsjPanel.add(contactjLabel, gridBagConstraints);

        usernamejLabel.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        usernamejLabel.setForeground(new java.awt.Color(61, 64, 91));
        usernamejLabel.setText("Username");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 45;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 142, 0, 0);
        detailsjPanel.add(usernamejLabel, gridBagConstraints);

        passwordjLabel.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        passwordjLabel.setForeground(new java.awt.Color(61, 64, 91));
        passwordjLabel.setText("Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 48;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 142, 0, 0);
        detailsjPanel.add(passwordjLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 125;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 27, 0, 0);
        detailsjPanel.add(nameJTextField, gridBagConstraints);

        contactTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactTextFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 125;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 27, 0, 0);
        detailsjPanel.add(contactTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 125;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 27, 0, 0);
        detailsjPanel.add(usernameJTextField, gridBagConstraints);

        signupjButton.setBackground(new java.awt.Color(129, 178, 154));
        signupjButton.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        signupjButton.setForeground(new java.awt.Color(61, 64, 91));
        signupjButton.setText("Sign Up");
        signupjButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signupjButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signupjButtonMouseExited(evt);
            }
        });
        signupjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupjButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 51, 20, 0);
        detailsjPanel.add(signupjButton, gridBagConstraints);

        passwordJPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordJPasswordFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 125;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 27, 0, 0);
        detailsjPanel.add(passwordJPasswordField, gridBagConstraints);

        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 74;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 27, 0, 0);
        detailsjPanel.add(networkJComboBox, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(61, 64, 91));
        jLabel2.setText("City");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 142, 0, 0);
        detailsjPanel.add(jLabel2, gridBagConstraints);
        detailsjPanel.add(jLabel3, new java.awt.GridBagConstraints());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Mainframe/Volunteer-scaled.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(detailsjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(detailsjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contactTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactTextFieldActionPerformed

    private void signupjButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupjButtonMouseExited
        signupjButton.setForeground(Color.BLACK);
    }//GEN-LAST:event_signupjButtonMouseExited

    private void signupjButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupjButtonMouseEntered
        signupjButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_signupjButtonMouseEntered

    private void signupjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupjButtonActionPerformed

        if(nameJTextField.getText().isEmpty() || contactTextField.getText().isEmpty() ||
            "ssgetText()".isEmpty() || usernameJTextField.getText().isEmpty() ||
            passwordJPasswordField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please fill all details", "Info", JOptionPane.INFORMATION_MESSAGE);
        }else{

            Network network = (Network) networkJComboBox.getSelectedItem();

            String username = usernameJTextField.getText();
            String password = String.valueOf(passwordJPasswordField.getPassword());
            String name = nameJTextField.getText();
            String contactno=contactTextField.getText();
            //long contact=Long.parseLong(contactno);
            //   String email="aaa@gmail.com";

            if(isNumber(contactno)){
                // JOptionPane.showMessageDialog(null, "Info added!", "Info", JOptionPane.INFORMATION_MESSAGE);
                long contact = Long.parseLong(contactno);

            }
            else{
                JOptionPane.showMessageDialog(null, "Contact should be a number!", "Warning", JOptionPane.INFORMATION_MESSAGE);
            }

            int length= contactno.length();
            if(length<10||length>10)
            {
                contactTextField.setEditable(true);
                JOptionPane.showMessageDialog(null, "Contact should be 10 digits!", "Warning", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            else
            {
                contactTextField.setEditable(false);

            }

            String validate="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
            //            if(1==0)
            //            {
                //                JOptionPane.showMessageDialog(null, "Please enter valid email");
                //                return;
                //            }
            System.out.println("start1");
            boolean x = true;

            if(network.getEnterpriseDirectory().searchEnterprisebyType(Enterprise.EnterpriseType.TalentScoutGlobal)==null){
                x=false;
            }

            if(x==true){
                Enterprise enterprise = network.getEnterpriseDirectory().searchEnterprisebyType(Enterprise.EnterpriseType.TalentScoutGlobal);
                System.out.println("start2");
                if(enterprise.getOrganizationDirectory().searchOrganizationbyname("TalentScoutOrganization")==null){
                    System.out.println("start3");
                    Organization.Type type = (Organization.Type) Organization.Type.TalentScout;
                    Organization org= enterprise.getOrganizationDirectory().createOrganization(type);
                    Employee employee= org.getEmployeeDirectory().createEmployee(name);
                }
                else{
                    System.out.println("start4");

                    Organization org = enterprise.getOrganizationDirectory().searchOrganizationbyname("TalentScoutOrganization");
                    Employee employee= org.getEmployeeDirectory().createEmployee(name);
                    if(org.getUserAccountDirectory().CheckIsValidInput(password)){
                        UserAccount userAccount=org.getUserAccountDirectory().createUserAccnt(username, password, employee, new TalentScoutRole());
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Password should have a minimum length of 8 and contain atleast 1 Uppercase, 1 Lowercase, 1 Special character and 1 Digit ");
                        passwordJPasswordField.setText("");
                        return;
                    }
                }
            }
            else{
                Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise("HS", Enterprise.EnterpriseType.TalentScoutGlobal);
                if(enterprise.getOrganizationDirectory().searchOrganizationbyname("TalentScoutOrganization")==null){
                    System.out.println("start3");
                    Organization.Type type = (Organization.Type) Organization.Type.TalentScout;
                    Organization org= enterprise.getOrganizationDirectory().createOrganization(type);
                    Employee employee= org.getEmployeeDirectory().createEmployee(name);
                    if(org.getUserAccountDirectory().CheckIsValidInput(password)){
                        UserAccount userAccount=org.getUserAccountDirectory().createUserAccnt(username, password, employee, new TalentScoutRole());
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Password should have a minimum length of 8 and contain atleast 1 Uppercase, 1 Lowercase, 1 Special character and 1 Digit ");
                        passwordJPasswordField.setText("");
                        return;
                    }

                }
                else{
                    //System.out.println("start4");
                    Organization org = enterprise.getOrganizationDirectory().searchOrganizationbyname("TalentScoutOrganization");
                    Employee employee= org.getEmployeeDirectory().createEmployee(name);
                    if(org.getUserAccountDirectory().CheckIsValidInput(password)){
                        UserAccount userAccount=org.getUserAccountDirectory().createUserAccnt(username, password, employee, new TalentScoutRole());
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Password should have a minimum length of 8 and contain atleast 1 Uppercase, 1 Lowercase, 1 Special character and 1 Digit ");
                        passwordJPasswordField.setText("");
                        return;
                    }
                }
            }

            this.setVisible(false);
            Enterprise enterprise = network.getEnterpriseDirectory().searchEnterprisebyType(Enterprise.EnterpriseType.TalentScoutGlobal);
            Organization org = enterprise.getOrganizationDirectory().searchOrganizationbyname("TalentScoutOrganization");
            UserAccount ua= org.getUserAccountDirectory().authenticateUserAccnt(username, password);
            //ReportJFrame r = new ReportJFrame(system,network,ua,org);
            dB4OUtil.storeSystem(system);
            SignInJFrame s = new SignInJFrame();
            s.setVisible(true);
        }
    }//GEN-LAST:event_signupjButtonActionPerformed

    private void passwordJPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordJPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordJPasswordFieldActionPerformed

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed

    }//GEN-LAST:event_networkJComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(SignUpJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpJFrame().setVisible(true);
            }
        });
    }
    
    public static boolean isNumber(String price){
        try{
            Long.parseLong(price);
            return true;    
        }
        catch(Exception e)
        {
             return false;
        }  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contactTextField;
    private javax.swing.JLabel contactjLabel;
    private javax.swing.JPanel detailsjPanel;
    private javax.swing.JLabel fnamejLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JLabel passwordjLabel;
    private javax.swing.JButton signupjButton;
    private javax.swing.JTextField usernameJTextField;
    private javax.swing.JLabel usernamejLabel;
    // End of variables declaration//GEN-END:variables
}
