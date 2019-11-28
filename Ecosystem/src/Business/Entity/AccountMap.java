/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Entity;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.AbstractFactory.AccountFactory;
import Business.UserAccount.AbstractFactory.DoctorFactory;
import java.util.Date;

/**
 *
 * @author Huangdong Wen <wen.hu@husky.neu.edu>
 */
public class AccountMap {


    public static AccountFactory getFactoryByRole(String role, String spe, Enterprise e, String username, String pw, String name, Date b) {
        AccountFactory a = null;
        if (role.equals(Organization.Type.Doctor.getValue())) {
            a = new DoctorFactory(spe, e, username, pw, name, b);
        }if (role.equals(Organization.Type.Nurse.getValue())) {
            a = new DoctorFactory(spe, e, username, pw, name, b);
        }
        
        
        

        return a;
    }
}
