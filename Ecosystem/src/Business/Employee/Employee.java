/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Entity.Entity;
import Business.Entity.TimeSlot;
import Business.Event.Event;
import Business.Event.Message;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 *
 *
 * @author AED_DEVOPS
 */
public class Employee extends Entity implements Observer {

    private String name;
    private int id;
    private static int count = 1;
    private List<TimeSlot> availability;
    private String desc;

    public Employee() {
        super();
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void update(Observable o, Object o1) {
        Event e = (Event) o;
        Message m = (Message) o1;
        System.out.println(getName() + "get the event:" + e.getEventName() + "-" + m.getContent());

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
