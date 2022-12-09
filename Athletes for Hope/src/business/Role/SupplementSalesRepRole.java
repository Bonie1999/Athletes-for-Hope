/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Role;
import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.PharmacyOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import ui.Pharmacy.PharmacistJPanel;
import javax.swing.JPanel;

/**
 *
 * @author nishank
 */
public class SupplementSalesRepRole {
        @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new PharmacistJPanel(userProcessContainer, account, organization,enterprise,business);
    }

}
