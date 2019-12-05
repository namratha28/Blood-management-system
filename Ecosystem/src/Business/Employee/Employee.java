/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Entity.TimeSlot;
import Business.Event.HospitalEvent;
import Bussiness.WorkQueue.WorkRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 *
 *
 * @author AED_DEVOPS
 */
public class Employee implements Observer {

    private static int count = 1;
    private List<TimeSlot> availability;
    protected int id;
    protected String specialities;
    protected String name;
    protected int ranking;

    public Employee(String name) {
        this.availability = new ArrayList<TimeSlot>();
        this.name = name;
        this.ranking = 0;
        this.id = count;
        count++;

    }

    public Employee(String spe, String name) {
        this.availability = new ArrayList<TimeSlot>();
        this.name = name;
        this.specialities = spe;
        this.ranking = 0;
        id = count;
        count++;
    }

    public String getSpecialities() {
        return specialities;
    }

    public void setSpecialities(String specialities) {
        this.specialities = specialities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
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

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", availability=" + availability + ", Specialities=" + specialities + '}';
    }

    @Override
    public void update(Observable o, Object o1) {
        HospitalEvent e = (HospitalEvent) o;
        WorkRequest m = (WorkRequest) o1;
        System.out.println(this.getName() + "get the event:" + e.getEventName() + "-" + m.getMessage());
    }

}
