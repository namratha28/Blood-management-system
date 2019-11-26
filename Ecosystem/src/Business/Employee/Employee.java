/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Entity.Person;
import Business.Entity.TimeSlot;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 *
 * @author AED_DEVOPS
 */
public class Employee extends Person{
    
    private String name;
    private int id;
    private static int count = 1;
    private List<TimeSlot> availability;
    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Employee() {
        id = count;
        count++;
        this.availability = new ArrayList<TimeSlot>();
    }

    public List<TimeSlot> getAvailability() {
        return availability;
    }

    public void setAvailability(List<TimeSlot> a) {
        this.availability = a;
    }

    public void addAvailability(TimeSlot a) {
        this.availability.add(a);
    }

    public void removeAvailability(TimeSlot a) {
        this.availability.remove(a);
    }


    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
