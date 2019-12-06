/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Request.RequestQueue;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Bussiness.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author AED_DEVOPS
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;

    public enum Type {

        Admin("AdminOrganization"),
        BloodBankAdmin("BloodBankAdmin"),
        BloodBank("BloodBank"),
        InsuranceAdmin("Insurance"),
        LogisticsAdmin("Logistics"),
        MarketAdmin("Market"),
        HospitalAdmin("Hospital Admin"),
        GovermentAdmin("Gov"),
        PharmacyAdmin("PharmacyAdmin"),
        Pharmacy("Pharmacy"),
        Nurse("Nurse"),
        Doctor("Doctor"),
        FrontDesk("FrontDesk"),
        Lab("Lab"),
        Donor("Donor"),
        Common("CommonUser"),
        HospitalLab("HospitalLab"),;

        private String value;

        private Type(String value) {
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
