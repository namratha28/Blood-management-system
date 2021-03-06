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
import Bussiness.WorkQueue.WorkQueue;
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
    private Employee employee;
    private Role role;
    private WorkQueue workQueue;
    private Person person;
    private int id;
    private ArrayList<String> events;
    private ArrayList<String> eventLocations;
    private ArrayList<String> eventDates;
    private ArrayList<String> eventTimes;

    public ArrayList<String> getEventLocations() {
        return eventLocations;
    }

    public void setEventLocations(ArrayList<String> eventLocations) {
        this.eventLocations = eventLocations;
    }

    public ArrayList<String> getEventDates() {
        return eventDates;
    }

    public void setEventDates(ArrayList<String> eventDates) {
        this.eventDates = eventDates;
    }

    public ArrayList<String> getEventTimes() {
        return eventTimes;
    }

    public void setEventTimes(ArrayList<String> eventTimes) {
        this.eventTimes = eventTimes;
    }

    public ArrayList<String> getEvents() {
        return events;
        
    }

    public void setEvents(ArrayList<String> events) {
        this.events = events;
    }

    public UserAccount() {
        id = count;
        count++;
        workQueue = new WorkQueue();
        this.person = new Person();
        this.events = new ArrayList<String>();
        this.eventLocations = new ArrayList<String>();
        this.eventDates = new ArrayList<String>();
        this.eventTimes = new ArrayList<String>();
    }



    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    @Override
    public String toString() {
        return username;
    }

}
