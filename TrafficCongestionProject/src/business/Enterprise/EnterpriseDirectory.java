/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;

import java.util.ArrayList;


public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.TrafficCongestionManagement){
            enterprise = new TrafficCongestionManagement(name);
        }
    else  if (type == Enterprise.EnterpriseType.InputEnterprise){
            enterprise = new InputEnterprise(name);
            enterpriseList.add(enterprise);
        }
           else  if (type == Enterprise.EnterpriseType.ConstructionDepartment){
            enterprise = new ConstructionDepartment(name);
            enterpriseList.add(enterprise);
        } 
        return enterprise;
    }
    
    public boolean checkIfUsernameIsUnique(String username) {

        for(Enterprise enterprise:enterpriseList){
            if(enterprise.getName().equals(username))
                return false;
        }
        return true;
    }
    
}
