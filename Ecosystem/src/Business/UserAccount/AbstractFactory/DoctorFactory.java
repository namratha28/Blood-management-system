/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount.AbstractFactory;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Entity.Person;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Role.DoctorRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Huangdong Wen <wen.hu@husky.neu.edu>
 */
public class DoctorFactory extends AccountFactory {

  

    public DoctorFactory(String spe, Enterprise e, String username, String pw, String name, Date b) {
        super(spe,e,username,pw,name,b);

    }

    @Override
    public Employee getEmployee() {
        return new Employee(spe, name);
    }

    @Override
    public Role getRole() {
        return new DoctorRole();
    }

    @Override
    public Organization getOrganization() {
        Organization res = null;
        for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
            if (o instanceof DoctorOrganization) {
                res = o;
                break;
            }
        }
        return res;
    }

    @Override
    public boolean addEmployee() {
        return this.getOrganization().getEmployeeDirectory().getEmployeeList().add(getEmployee());

    }

    @Override
    public UserAccount addAccount() {
        return this.getOrganization().getUserAccountDirectory().createUserAccount(username, pw, this.getEmployee(),
                p, this.getRole());

    }

}
