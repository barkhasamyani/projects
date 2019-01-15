
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


public abstract class Role {
    
    public enum RoleType{
        TrafficCongestionManagementAdmin("Traffic Congestion Management Admin"),
        TrafficCongestionManagement("Traffic Congestion Management"),
        InputEnterpriseAdmin("Input Enterprise Admin"),
        Commuter("Commuter"),
        SystemEngineer("System Engineer"),
        ConstructionAdmin("Construction Admin"),
        ConstructionManager("Construction Manager"),
        ConstructionRole("Construction Role");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}