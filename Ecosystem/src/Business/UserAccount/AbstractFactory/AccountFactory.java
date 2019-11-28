/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount.AbstractFactory;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Entity.Person;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Huangdong Wen <wen.hu@husky.neu.edu>
 */
public abstract class AccountFactory {
    protected  String spe;
    protected  Enterprise e;
    protected  Person p;
    protected  String username;
    protected  String pw;
    protected  String name;
    
    AccountFactory(String spe, Enterprise e, String username, String pw, String name, Date b){
        this.spe = spe;
        this.e = e;
        p = new Person(name, b);
        this.username = username;
        this.pw = pw;
        this.name = name;
    }
    
    public abstract Employee getEmployee();
    public abstract Role getRole();
    public abstract Organization getOrganization();
    public abstract boolean addEmployee();
    public abstract UserAccount addAccount();
}
