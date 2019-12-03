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
public class CommonUserAccountFactory extends AccountFactory {

    public CommonUserAccountFactory(Enterprise e, Organization org, String username, String pw, String name, Date b) {
        super(null, e, org, username, pw, name, b);
    }

    @Override
    public Employee getEmployee() {
        return null;
    }

    @Override
    public Organization getOrganization() {
        return org;
    }

    @Override
    public Role getRole() {
        return this.getOrganization().getSupportedRole().get(0);
    }

    @Override
    public boolean addEmployee() {
        return false;
    }

    @Override
    public UserAccount addAccount() {
        return this.getOrganization().getUserAccountDirectory().createUserAccount(username, pw, this.getEmployee(),
                p, this.getRole());
    }

}
