/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Organization.ConstructionEmployeeOrganization;
import business.Organization.ConstructionManagerOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.ConstructionEmployeeRole.ConstructionEmployeeWorkAreaJPanel;


public class ConstructionEmployeeRole extends Role{
      @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ConstructionEmployeeWorkAreaJPanel(userProcessContainer, account, (ConstructionEmployeeOrganization)organization, enterprise);
    }
    
}
