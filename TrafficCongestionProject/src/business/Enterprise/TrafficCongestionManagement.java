/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;

import business.Role.Role;
import java.util.ArrayList;


public class TrafficCongestionManagement extends Enterprise {
    
    public TrafficCongestionManagement(String name)
    {
        super(name,Enterprise.EnterpriseType.TrafficCongestionManagement);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
