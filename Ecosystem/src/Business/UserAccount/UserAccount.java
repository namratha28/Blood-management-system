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

    private static int count = 1;
    private String username;
    private String password;
    private int id;
    private Employee employee;
    private Role role;
    private Person person;
    protected RequestQueue rq;

    public UserAccount() {
        id = count;
        count++;
        this.rq = new RequestQueue();
        this.person = new Person();
//        this.employee = new Employee();
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public UserAccount(Employee employee, Person person, RequestQueue rq) {
        this.employee = employee;
        this.person = person;
        this.rq = new RequestQueue();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RequestQueue getRq() {
        return rq;
    }

    public void setRq(RequestQueue rq) {
        this.rq = rq;
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
