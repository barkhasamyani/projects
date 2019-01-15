/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;


import business.Role.ConstructionEmployeeRole;
import business.Role.Role;
import java.util.ArrayList;


public class ConstructionEmployeeOrganization extends Organization {
     public ConstructionEmployeeOrganization() 
    {
        super(Organization.OrganizationType.ConstructionEmployee.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ConstructionEmployeeRole());
        return roles;    }
}
