/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.sysadmin;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.TalentRecruitmentOrganization;
import business.Organization.TalentScoutOrganization;
import business.Organization.Organization;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
/**
 *
 * @author puranjaimendiratta
 */
public class ManageNetworkJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageNetworkJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private HashMap<String, Integer> chart;
    int bostoncases,seattlecases;
    
    private HashMap<String, Integer> piechartsea;
    
    public ManageNetworkJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        chart= new HashMap<String,Integer>();
        //piechartbos=new HashMap<String,Integer>();
        piechartsea=new HashMap<String,Integer>();

        populateNetworkTable();
    }
    
    private void populateNetworkTable() {
        DefaultTableModel model = (DefaultTableModel) tableNetworks.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            Object[] row = new Object[1];
            row[0] = network;
            model.addRow(row);
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

        jPanel1 = new javax.swing.JPanel();
        lblManageNetworks = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableNetworks = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtEnterNameOfNetwork = new javax.swing.JTextField();
        btnAddNewNetwork = new javax.swing.JButton();
        btnDeleteNetwork = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblManageNetworks.setBackground(new java.awt.Color(255, 255, 255));
        lblManageNetworks.setFont(new java.awt.Font("Monaco", 1, 24)); // NOI18N
        lblManageNetworks.setForeground(new java.awt.Color(230, 126, 34));
        lblManageNetworks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageNetworks.setText("Manage Networks");
        jPanel1.add(lblManageNetworks, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 805, 40));

        tableNetworks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableNetworks);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 340, 130));

        jLabel2.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        jLabel2.setText("Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 70, -1));

        txtEnterNameOfNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnterNameOfNetworkActionPerformed(evt);
            }
        });
        jPanel1.add(txtEnterNameOfNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 216, -1));

        btnAddNewNetwork.setBackground(new java.awt.Color(51, 102, 255));
        btnAddNewNetwork.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        btnAddNewNetwork.setForeground(new java.awt.Color(255, 255, 255));
        btnAddNewNetwork.setText("ADD");
        btnAddNewNetwork.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddNewNetworkMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddNewNetworkMouseEntered(evt);
            }
        });
        btnAddNewNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewNetworkActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddNewNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 90, -1));

        btnDeleteNetwork.setBackground(new java.awt.Color(51, 102, 255));
        btnDeleteNetwork.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        btnDeleteNetwork.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteNetwork.setText("Remove");
        btnDeleteNetwork.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteNetworkMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteNetworkMouseEntered(evt);
            }
        });
        btnDeleteNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteNetworkActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeleteNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 120, -1));

        jButton2.setBackground(new java.awt.Color(51, 102, 255));
        jButton2.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("View Cases");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, -1, -1));

        jButton3.setBackground(new java.awt.Color(51, 102, 255));
        jButton3.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Report");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtEnterNameOfNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnterNameOfNetworkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnterNameOfNetworkActionPerformed

    private void btnAddNewNetworkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddNewNetworkMouseExited
        btnAddNewNetwork.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddNewNetworkMouseExited

    private void btnAddNewNetworkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddNewNetworkMouseEntered
        btnAddNewNetwork.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddNewNetworkMouseEntered

    private void btnAddNewNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewNetworkActionPerformed
        // TODO add your handling code here:

        if( txtEnterNameOfNetwork.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "please enter all mandatory fields");
            return;
        }
        String name = txtEnterNameOfNetwork.getText();

        Network network = system.createAndAddNetwork();
        network.setNameOfNetwork(name);

        populateNetworkTable();
        txtEnterNameOfNetwork.setText("");
    }//GEN-LAST:event_btnAddNewNetworkActionPerformed

    private void btnDeleteNetworkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteNetworkMouseExited
        btnDeleteNetwork.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteNetworkMouseExited

    private void btnDeleteNetworkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteNetworkMouseEntered
        btnDeleteNetwork.setForeground(new Color(0,128,128));// TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteNetworkMouseEntered

    private void btnDeleteNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteNetworkActionPerformed
        // TODO add your handling code here:

        int selectedRow = tableNetworks.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to delete the account", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            Network p=(Network) tableNetworks.getValueAt(selectedRow, 0);

            for (Network network : system.getNetworkList()) {
                if(p==network){
                    system.getNetworkList().remove(p);
                    break;
                }
            }
            JOptionPane.showMessageDialog(null, "You have successfully deleted the account");
            populateNetworkTable();
        }
    }//GEN-LAST:event_btnDeleteNetworkActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        //chart.clear();

        updateData();
        //System.out.println("5");
        updateChart();
        //System.out.println("6");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void updateChart() {
  
    DefaultCategoryDataset d=new DefaultCategoryDataset();
        Set keys=chart.keySet();
        Iterator it=keys.iterator();
        
        while(it.hasNext())
        {
            Object cityname=it.next().toString();
            int casesdata= (int) chart.get(cityname);
            d.setValue(casesdata, "No of cases", (Comparable) cityname);
            
        }
        
        JFreeChart barc=ChartFactory.createBarChart("Summary of cases", "City/Network", "No of cases", d, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot plt=barc.getCategoryPlot();
        //plt.setRangeGridlinePaint(Color.black);
        
        ChartFrame cp=new ChartFrame("No of cases by network",barc);
        //cp.removeAll();
        cp.setVisible(true);
        cp.setSize(600,600);
    }
    
    private void updateData(){
    for(Network n : system.getNetworkList()){
          
            Enterprise e = n.getEnterpriseDirectory().searchEnterprisebyType(Enterprise.EnterpriseType.NGO);
            
            for (Organization o : e.getOrganizationDirectory().getOrganizationList()){
               
                if (o instanceof TalentRecruitmentOrganization){
               
                int count = o.getWorkQueue().getTalentScoutWorkRequestList().size();
                System.out.println(count);
                chart.put(n.toString(), count);
                
            }}
        }    
  }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        int selectedRow = tableNetworks.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please choose a network");
            return;
        }
        Network network= (Network) tableNetworks.getValueAt(selectedRow, 0);
        Enterprise e= network.getEnterpriseDirectory().searchEnterprisebyType(Enterprise.EnterpriseType.NGO);

        for (Organization o: e.getOrganizationDirectory().getOrganizationList())
        {   Organization org=null;

            if(o instanceof TalentRecruitmentOrganization)
            {
                org=o;
                this.UpdatePieData(org);

            }
            // updateSeattlePieChart(network);
        }
        updateSeattlePieChart(network);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void UpdatePieData(Organization org) {
     
       
//      piechartsea.clear();
//      piechartsea.put("Labor",org.getWorkQueue().getcountbytypesa("Labor"));
//      piechartsea.put("Physical Abuse", org.getWorkQueue().getcountbytypesa("Physical Abuse"));
//      piechartsea.put("Sexual Abuse", org.getWorkQueue().getcountbytypesa("Sexual Abuse"));
//      piechartsea.put("Harrassment", org.getWorkQueue().getcountbytypesa("Harrassment"));
//      piechartsea.put("Other", org.getWorkQueue().getcountbytypesa("Other"));
      piechartsea.clear();
      piechartsea.put("Labor",org.getWorkQueue().getcountbytypesa("Labor"));
      piechartsea.put("Physical Abuse", org.getWorkQueue().getcountbytypesa("Physical Abuse"));
      piechartsea.put("Sexual Abuse", org.getWorkQueue().getcountbytypesa("Sexual Abuse"));
      piechartsea.put("Harrassment", org.getWorkQueue().getcountbytypesa("Harrassment"));
      piechartsea.put("Other", org.getWorkQueue().getcountbytypesa("Other"));
      //this.updateSeattlePieChart();
        
    }

    private void updateSeattlePieChart(Network network) {
    
        DefaultPieDataset ddd=new DefaultPieDataset();
        Set keys=piechartsea.keySet();
        Iterator it=keys.iterator();
        keys.size();
        System.out.print(keys.size());
      
        while(it.hasNext())
        {
            Object type=it.next().toString();
            int caspiedata= (int) piechartsea.get(type);
            ddd.setValue((Comparable) type, caspiedata);
        }
            JFreeChart seapie=ChartFactory.createPieChart(network.toString() + " cases summary.", ddd, true, true, true);
            PiePlot p=(PiePlot) seapie.getPlot();
            ChartFrame cp=new ChartFrame("No of cases by type in " + network.toString(),seapie);
            cp.setVisible(true);
            cp.setSize(600,600);
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewNetwork;
    private javax.swing.JButton btnDeleteNetwork;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageNetworks;
    private javax.swing.JTable tableNetworks;
    private javax.swing.JTextField txtEnterNameOfNetwork;
    // End of variables declaration//GEN-END:variables
}
