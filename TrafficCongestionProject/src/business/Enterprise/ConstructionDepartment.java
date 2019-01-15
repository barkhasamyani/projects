/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;

import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author barkhasamyani
 */
public class ConstructionDepartment extends Enterprise {

    public ConstructionDepartment(String name) {
        super(name,Enterprise.EnterpriseType.ConstructionDepartment);
    }
    
  
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
