/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.TrafficCongestionManagementRole;
import business.Role.Role;
import java.util.ArrayList;


public class TrafficCongestionManagementOrganization extends Organization {
    public TrafficCongestionManagementOrganization()
    {
        super(Organization.OrganizationType.TrafficCongestionManagement.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles=new ArrayList<>();
        roles.add(new TrafficCongestionManagementRole());
        return roles;
    }
}
