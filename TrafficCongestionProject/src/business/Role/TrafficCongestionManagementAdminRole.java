/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.AdministrativeRole.TrafficCongestionManagementAdminJPanel;


public class TrafficCongestionManagementAdminRole extends Role{

    public static Organization.OrganizationType[] types = {Organization.OrganizationType.TrafficCongestionManagement};
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new TrafficCongestionManagementAdminJPanel(userProcessContainer, enterprise,business);
    }

    
    
}
