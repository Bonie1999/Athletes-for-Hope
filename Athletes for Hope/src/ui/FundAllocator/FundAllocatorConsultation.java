/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.FundAllocator;

import business.EcoSystem;
import business.Consultation.ConsultationFundAllocator;
import business.Network.Network;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import business.WorkQueue.FundAllocatorWorkRequest;
import business.WorkQueue.TalentScoutWorkRequest;
import business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
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
 * @author nishank
 */
public class FundAllocatorConsultation extends javax.swing.JPanel {

    /**
     * Creates new form FundAllocatorConsultation
     */
    JPanel userProcessContainer;
    EcoSystem system;
    FundAllocatorWorkRequest request;
    UserAccount userAccount;
    Network network;
    Organization organization;
    public FundAllocatorConsultation(JPanel userProcessContainer, EcoSystem system,UserAccount userAccount,Network network, Organization organization, FundAllocatorWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
      
        this.userAccount = userAccount;
        this.network = network;
        this.organization=organization;
        this.request=request;
        populateName();
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
        lblHeader = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCounsellorEncounterDetails = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblEncounterNo = new javax.swing.JLabel();
        txtEncounterNo = new javax.swing.JTextField();
        lblMinutesofMeeting = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaMinutesofMeeting = new javax.swing.JTextArea();
        txtName = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(244, 241, 222));

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(61, 64, 91));
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Encounters");

        lblName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblName.setText("Patient Name:");

        tblCounsellorEncounterDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Encounter No.", "Minutes of Meeting"
            }
        ));
        jScrollPane1.setViewportView(tblCounsellorEncounterDetails);

        btnUpdate.setBackground(new java.awt.Color(129, 178, 154));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateMouseExited(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(129, 178, 154));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBackMouseExited(evt);
            }
        });
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblEncounterNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEncounterNo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblEncounterNo.setText("Encounter no.");

        txtEncounterNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEncounterNoActionPerformed(evt);
            }
        });

        lblMinutesofMeeting.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMinutesofMeeting.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblMinutesofMeeting.setText("Minutes of Meeting:");

        txtAreaMinutesofMeeting.setColumns(20);
        txtAreaMinutesofMeeting.setRows(5);
        jScrollPane2.setViewportView(txtAreaMinutesofMeeting);

        txtName.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(lblEncounterNo)))
                    .addComponent(lblMinutesofMeeting, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEncounterNo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(134, 134, 134))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addGap(62, 62, 62))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(btnUpdate))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                        .addGap(222, 222, 222))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEncounterNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEncounterNo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMinutesofMeeting)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addComponent(btnUpdate)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

    private void btnUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseEntered
        btnUpdate.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateMouseEntered

    private void btnUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseExited
        btnUpdate.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateMouseExited

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        if(txtEncounterNo.getText().equalsIgnoreCase("") && txtAreaMinutesofMeeting.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "Please fill out the necessary fields");
        }
        else{
            ConsultationFundAllocator en=new ConsultationFundAllocator();
            en.setEn(txtEncounterNo.getText());
            en.setMinutes(txtAreaMinutesofMeeting.getText());
            request.getFAConsult().add(en);
            //organization.getCounsellorencounterdir().getEncounters().add(en);
            // for(CounsellarWorkRequest request : organization.getWorkQueue().getCounsellarworkRequestList()){
                //organization.getCounsellorencounterdir().getEncounterDirectory().put(request.getHelpSeekerWorkRequest().getNameofvictim(), organization.getCounsellorencounterdir().getEncounters());
                //}
            /* Object r=jTextField1.getText();
            Object s=jTextArea1.getText();
            DefaultTableModel model= (DefaultTableModel) jTable1.getModel();

            model.setValueAt(r, i, 0);
            model.setValueAt(s, i, 1);
            i++;
            */
            populateName();
            txtEncounterNo.setText("");
            txtAreaMinutesofMeeting.setText("");

            /*String FromEmail="sexualawareness.help@gmail.com";
            String FromEmailPass="Fin@lProject21";
            String Subject = "Sign up successful";

            Properties properties=new Properties();
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.smtp.host", "smtp.gmail.com");
            properties.put("mail.smtp.port", "587");

            Session session=Session.getDefaultInstance(properties, new javax.mail.Authenticator(){
                @Override
                protected PasswordAuthentication getPasswordAuthentication(){
                    return new PasswordAuthentication(FromEmail,FromEmailPass);
                }
            });

            try
            {
                Message msg=new MimeMessage(session);
                msg.setFrom(new InternetAddress(FromEmail));
                msg.addRecipients(Message.RecipientType.TO, InternetAddress.parse(request.getHelpSeekerWorkRequest().getEmail()));
                msg.setSubject("Invitation for a session with Counselor, " + request.getHelpSeekerWorkRequest().getNameofvictim() );
                msg.setText("Dear "+ request.getHelpSeekerWorkRequest().getNameofvictim()+"\n"+"I am here to help you. Join me through the following link for the next encounter."+"\n"+"zoom1.link"+"\n"+"Best");
                Transport.send(msg);
            }catch(Exception e)
            {
                System.out.println(""+e);
            } */

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseEntered
        btnBack.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackMouseEntered

    private void btnBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseExited
        btnBack.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackMouseExited

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        FundAllocator sysAdminwjp = (FundAllocator) component;
        //sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtEncounterNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEncounterNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEncounterNoActionPerformed
private void populateName() {
        
        txtName.setText(request.getHswr().getChildName());
       
        
        DefaultTableModel model= (DefaultTableModel) tblCounsellorEncounterDetails.getModel();
        Object[] row=new Object[2];
        model.setRowCount(0);
        for (ConsultationFundAllocator CE: request.getFAConsult()){
            row[0] = CE.getEn();
            row[1] = CE.getMinutes();
            model.addRow(row);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEncounterNo;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblMinutesofMeeting;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable tblCounsellorEncounterDetails;
    private javax.swing.JTextArea txtAreaMinutesofMeeting;
    private javax.swing.JTextField txtEncounterNo;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
