/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;

import business.Organization.Organization;
import business.Organization.OrganizationDirectory;

public abstract class Enterprise extends Organization{

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    
    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
    }
    
    public enum EnterpriseType{
        TrafficCongestionManagement("TrafficCongestionManagement"),
        InputEnterprise("InputEnterprise"),
        ConstructionDepartment("ConstructionDepartment");
        
        private String value;

        private EnterpriseType(String value) {
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

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

}
