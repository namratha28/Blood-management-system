/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Entity.BloodType;
import Business.Entity.Person;
import Business.Request.RequestQueue;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AED_DEVOPS
 */
public class UserAccount {

    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private Person info;
    protected RequestQueue rq;

    public UserAccount() {
        this.rq = new RequestQueue();
        this.info = new Person();
        this.employee = new Employee();
    }

    public UserAccount(Employee employee, Person info, RequestQueue rq) {
        this.employee = employee;
        this.info = info;
        this.rq = new RequestQueue();
    }

    public RequestQueue getRq() {
        return rq;
    }

    public void setRq(RequestQueue rq) {
        this.rq = rq;
    }

    public Person getInfo() {
        return info;
    }

    public void setInfo(Person info) {
        this.info = info;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    @Override
    public String toString() {
        return username;
    }

}
