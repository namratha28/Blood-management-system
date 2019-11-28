/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount.AbstractFactory;

import Business.Employee.Employee;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Huangdong Wen <wen.hu@husky.neu.edu>
 */
public interface AccountFactory {

    Employee getEmployee();

    Role getRole();

    Organization getOrganization();

    boolean addEmployee();

    UserAccount addAccount();
}
