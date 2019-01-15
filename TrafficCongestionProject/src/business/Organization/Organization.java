/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.CongestionProblem.CongestionProblem;
import business.CongestionProblem.CongestionProblemDirectory;
import business.CongestionSolutionConstruction.CongestionSolutionConstructionDirectory;
import business.CongestionSolutionEventHandler.CongestionSolutionEventHandlerDirectory;
import business.Employee.EmployeeDirectory;
import business.Location.LocationDirectory;
import business.Role.Role;
import business.UserAccount.UserAccountDirectory;
import business.WorkQueue.WorkQueue;
import java.util.ArrayList;


public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private LocationDirectory locationDirectory;
    private CongestionProblemDirectory congestionProblemDirectory;
    private CongestionSolutionConstructionDirectory congestionsolutionconstructiondirectory;
    private CongestionSolutionEventHandlerDirectory congestionSolutionEventHandlerDirectory;
    private int organizationID;
    private static int counter;
    
    public enum OrganizationType{
        TrafficCongestionManagement("Traffic Congestion Management Organization"),
        Commuter("Commuter Organization"),
        SystemEngineer("System Engineer Organization"),
        ConstructionManager("Construction Manager Organization"),
        ConstructionEmployee("Construction Employee Organization"),
        Government("Government Organization");
       
       
        
        
        private String value;
        private OrganizationType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
         
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        locationDirectory=new LocationDirectory();
        congestionProblemDirectory=new CongestionProblemDirectory();
        congestionSolutionEventHandlerDirectory=new CongestionSolutionEventHandlerDirectory();
        congestionsolutionconstructiondirectory=new CongestionSolutionConstructionDirectory();
        organizationID = counter;
        ++counter;
    }

    public CongestionSolutionConstructionDirectory getCongestionsolutionconstructiondirectory() {
        return congestionsolutionconstructiondirectory;
    }

    public void setCongestionsolutionconstructiondirectory(CongestionSolutionConstructionDirectory congestionsolutionconstructiondirectory) {
        this.congestionsolutionconstructiondirectory = congestionsolutionconstructiondirectory;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public void addCongestionProblems()
    {
        if(congestionProblemDirectory.getCongestionProblemList().isEmpty()){
        CongestionProblem cp1=congestionProblemDirectory.addCongestionProblem();
        cp1.setProblemName("Traffic Jam");
        CongestionProblem cp2=congestionProblemDirectory.addCongestionProblem();
        cp2.setProblemName("Bad Traffic Signal");
        CongestionProblem cp3=congestionProblemDirectory.addCongestionProblem();
        cp3.setProblemName("Work Zone");
        CongestionProblem cp4=congestionProblemDirectory.addCongestionProblem();
        cp4.setProblemName("Natural Calamity");
        CongestionProblem cp5=congestionProblemDirectory.addCongestionProblem();
        cp5.setProblemName("Too much Freight");
        CongestionProblem cp6=congestionProblemDirectory.addCongestionProblem();
        cp6.setProblemName("Traffic at Intersections");
        CongestionProblem cp7=congestionProblemDirectory.addCongestionProblem();
        cp7.setProblemName("Bottleneck");
        CongestionProblem cp8=congestionProblemDirectory.addCongestionProblem();
        cp8.setProblemName("Traffic due to Parking");
        CongestionProblem cp9=congestionProblemDirectory.addCongestionProblem();
        cp9.setProblemName("Road Damaged");
        CongestionProblem cp10=congestionProblemDirectory.addCongestionProblem();
        cp10.setProblemName("One way Needed");
        }
        
    }
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public CongestionProblemDirectory getCongestionProblemDirectory() {
        return congestionProblemDirectory;
    }

    public void setCongestionProblemDirectory(CongestionProblemDirectory congestionProblemDirectory) {
        this.congestionProblemDirectory = congestionProblemDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public CongestionSolutionEventHandlerDirectory getCongestionSolutionEventHandlerDirectory() {
        return congestionSolutionEventHandlerDirectory;
    }

    public void setCongestionSolutionEventHandlerDirectory(CongestionSolutionEventHandlerDirectory congestionSolutionEventHandlerDirectory) {
        this.congestionSolutionEventHandlerDirectory = congestionSolutionEventHandlerDirectory;
    }

    public LocationDirectory getLocationDirectory() {
        return locationDirectory;
    }

    public void setLocationDirectory(LocationDirectory locationDirectory) {
        this.locationDirectory = locationDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
