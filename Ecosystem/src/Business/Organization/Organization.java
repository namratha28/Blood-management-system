/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Entity.Entity;
import Business.Request.RequestQueue;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author AED_DEVOPS
 */
public abstract class Organization {

    protected String name;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;
    protected RequestQueue rq;

    public RequestQueue getRq() {
        return rq;
    }

    public void setRq(RequestQueue rq) {
        this.rq = rq;
    }

    public enum Type {

        Admin("Admin Organization") {
                    //@Override
                    public Organization createOrganization() {
                        return new AdminOrganization();
                    }
                }, Doctor("Doctor Organization") {
                    public Organization createOrganization() {
                        return new DoctorOrganization();
                    }
                }, Lab("Lab Organization") {
                    public Organization createOrganization() {
                        return new LabOrganization();
                    }
                }, FrontDesk("Front Desk Organization") {
                    public Organization createOrganization() {
                        return new FrontDeskEmployeeOrganization();
                    }
                }, Gov("Gov Organization") {
                    public Organization createOrganization() {
                        return new GovEmployeeOrganization();
                    }
                }, Logistics("Logistics Organization") {
                    public Organization createOrganization() {
                        return new LogisticsEmployeeOrganization();
                    }
                }, Medicine("Medicine Organization") {
                    public Organization createOrganization() {
                        return new MedicineInventoryOrganization();
                    }
                }, Insurance("Insurance Organization") {
                    public Organization createOrganization() {
                        return new InsuranceCompEmployeeOrganization();
                    }
                }, Nurse("Nurse Organization") {
                    public Organization createOrganization() {
                        return new NurseOrganization();
                    }
                }, BloodInventory("BloodInventory Organization") {
                    public Organization createOrganization() {
                        return new BloodInventoryOrganization();
                    }
                }, OrganInventory("OrganInventory Organization") {
                    public Organization createOrganization() {
                        return new OrganInventoryOrganization();
                    }
                }, Bank("Bank Organization") {
                    public Organization createOrganization() {
                        return new BankEmployeeOrganization();
                    }
                }, LabAssistant("LabAssistant Organization") {
                    public Organization createOrganization() {
                        return new LabAssistantOrganization();
                    }
                }, Station("Station Organization") {
                    public Organization createOrganization() {
                        return new BloodCollectionStationOrganization();
                    }
                }, Common("Common User") {
                    @Override
                    public Organization createOrganization() {
                        return new CommonUserOrganization();
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

        public abstract Organization createOrganization();
    }

    public Organization(String name) {
        super();
        this.name = name;
        this.employeeDirectory = new EmployeeDirectory();
        this.userAccountDirectory = new UserAccountDirectory();
        this.organizationID = counter;
        ++counter;
    }

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
   public abstract ArrayList<Role> getSupportedRole();
    @Override
    public String toString() {
        return name;
    }
}
