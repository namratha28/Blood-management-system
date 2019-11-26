/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Entity.Entity;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;



/**
 *
 * @author AED_DEVOPS
 */
public abstract class Organization extends Entity{

    private String name;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;
//    private Map<Employee,List<TimeSlot>> map;
//
//    public Map<Employee, List<TimeSlot>> getMap() {
//        return map;
//    }
//
//    public void setMap(Map<Employee, List<TimeSlot>> map) {
//        this.map = map;
//    }
    
    
    public enum Type{
        Admin("Admin Organization") {
            //@Override
            public Organization createOrganization() {
                return new AdminOrganization();
            }
        }, Doctor("Doctor Organization"){
            public Organization createOrganization() {
                return new DoctorOrganization();
            }
        }, Lab("Lab Organization"){
            public Organization createOrganization() {
                return new LabOrganization();
            }
        }, FrontDesk("Front Desk Organization"){
            public Organization createOrganization() {
                return new FrontDeskEmployeeOrganization();
            }
        },
        Gov("Gov Organization"){
            public Organization createOrganization() {
                return new GovEmployeeOrganization();
            }
        }, Logistics("Logistics Organization"){
            public Organization createOrganization() {
                return new LogisticsEmployeeOrganization();
            }
        }, Medicine("Medicine Organization"){
            public Organization createOrganization() {
                return new MedicineInventoryOrganization();
            }
        }, Insurance("Insurance Organization"){
            public Organization createOrganization() {
                return new InsuranceCompEmployeeOrganization();
            }
        }, Nurse("Nurse Organization"){
            public Organization createOrganization() {
                return new NurseOrganization();
            }
        }, BloodInventory("BloodInventory Organization"){
            public Organization createOrganization() {
                return new BloodInventoryOrganization();
            }
        }, OrganInventory("OrganInventory Organization"){
            public Organization createOrganization() {
                return new OrganInventoryOrganization();
            }
        }, Bank("Bank Organization"){
            public Organization createOrganization() {
                return new BankEmployeeOrganization();
            }
        }, LabAssistant("LabAssistant Organization"){
            public Organization createOrganization() {
                return new LabAssistantOrganization();
            }
        }, Station("Station Organization"){
            public Organization createOrganization() {
                return new BloodCollectionStationOrganization();
            }
        };
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
        public Organization createOrganization(Type t) {
            return t.createOrganization();
        }
        public abstract Organization createOrganization() ;
    }

    public Organization(String name) {
        this.name = name;
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
