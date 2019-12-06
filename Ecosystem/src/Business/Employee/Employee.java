/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Entity.TimeSlot;
import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 * @author AED_DEVOPS
 */
public class Employee {

    private static int count = 1;
    private List<TimeSlot> availability;

    public Employee() {
        id = count;
        count++;
    }

    protected int id;
    protected String specialities;
    protected String name;
    protected int ranking;
    protected String notice;

    public Employee(String name) {
        this.availability = new ArrayList<TimeSlot>();
        this.name = name;
        this.ranking = 0;
        this.id = count;
        count++;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public Employee(String spe, String name) {
        this.availability = new ArrayList<TimeSlot>();
        this.name = name;
        this.specialities = spe;
        this.ranking = 0;
        id = count;
        count++;
        this.notice = "";
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
        return name;
    }

//    @Override
//    public void update(Observable o, Object o1) {
//        HospitalInnerRequest workR = (HospitalInnerRequest) o1;
//        notice=workR.getMessage();
//        System.out.println(this.getName() + " get the event:" + workR.getMessage());
//    }

}
