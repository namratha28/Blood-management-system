/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount.AbstractFactory;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;

import Business.Organization.Organization;

import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Huangdong Wen <wen.hu@husky.neu.edu>
 */
public class UserAccountFactory extends AccountFactory {

    public UserAccountFactory(String spe, Enterprise e, String org, String username, String pw, String name, Date b) {
        super(spe, e, org, username, pw, name, b);
    }

    @Override
    public Employee getEmployee() {
        if (org.equals("Common User")) {
            return null;
        }
        return new Employee(spe, name);
    }

    @Override
    public Organization getOrganization() {
        Organization res = null;
        for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
            if (o.getName().equals(org)) {
                res = o;
                break;
            }
        }
        return res;
    }

    @Override
    public Role getRole() {
        return this.getOrganization().getSupportedRole().get(0);
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
