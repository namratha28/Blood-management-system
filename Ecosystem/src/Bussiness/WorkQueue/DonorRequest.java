/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author namratha
 */
public class DonorRequest extends WorkRequest{
    private UserAccount sender;
    private UserAccount receiver;
    private String bloodBank;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private UserAccount labTechnician;
    private UserAccount eventsender;
    private UserAccount eventreceiver;
    private String eventstatus;
    private String eventtitle;
    private String eventlocation;
    private String eventdate;
    private String eventtime;
    private String eventimage;
    private boolean isEventReq;
    private String regeventtitle;
    private String regeventlocation;
    private String regeventdate;
    private String regeventtime;
    private boolean detailsFilled=false;

    public boolean isDetailsFilled() {
        return detailsFilled;
    }

    public void setDetailsFilled(boolean detailsFilled) {
        this.detailsFilled = detailsFilled;
    }

    public String getRegeventtitle() {
        return regeventtitle;
    }

    public void setRegeventtitle(String regeventtitle) {
        this.regeventtitle = regeventtitle;
    }

    public String getRegeventlocation() {
        return regeventlocation;
    }

    public void setRegeventlocation(String regeventlocation) {
        this.regeventlocation = regeventlocation;
    }

    public String getRegeventdate() {
        return regeventdate;
    }

    public void setRegeventdate(String regeventdate) {
        this.regeventdate = regeventdate;
    }

    public String getRegeventtime() {
        return regeventtime;
    }

    public void setRegeventtime(String regeventtime) {
        this.regeventtime = regeventtime;
    }

    public UserAccount getEventsender() {
        return eventsender;
    }

    public void setEventsender(UserAccount eventsender) {
        this.eventsender = eventsender;
    }

    public UserAccount getEventreceiver() {
        return eventreceiver;
    }

    public void setEventreceiver(UserAccount eventreceiver) {
        this.eventreceiver = eventreceiver;
    }

    public String getEventstatus() {
        return eventstatus;
    }

    public void setEventstatus(String eventstatus) {
        this.eventstatus = eventstatus;
    }

    public String getEventtitle() {
        return eventtitle;
    }

    public void setEventtitle(String eventtitle) {
        this.eventtitle = eventtitle;
    }

    public String getEventlocation() {
        return eventlocation;
    }

    public void setEventlocation(String eventlocation) {
        this.eventlocation = eventlocation;
    }

    public String getEventdate() {
        return eventdate;
    }

    public void setEventdate(String eventdate) {
        this.eventdate = eventdate;
    }

    public String getEventtime() {
        return eventtime;
    }

    public void setEventtime(String eventtime) {
        this.eventtime = eventtime;
    }

    public String getEventimage() {
        return eventimage;
    }

    public void setEventimage(String eventimage) {
        this.eventimage = eventimage;
    }

    public boolean getIsEventReq() {
        return isEventReq;
    }

    public void setIsEventReq(boolean isEventReq) {
        this.isEventReq = isEventReq;
    }
    
    public String getBloodBank() {
        return bloodBank;
    }

    public void setBloodBank(String bloodBank) {
        this.bloodBank = bloodBank;
    }

    public UserAccount getLabTechnician() {
        return labTechnician;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getRecievedDate() {
        return recievedDate;
    }

    public void setRecievedDate(Date recievedDate) {
        this.recievedDate = recievedDate;
    }
    private int price;
    private Date recievedDate;
    
    private String testResult;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    private String Name;
    private String middleName;
    private String lastName;
    private int age;
    private String sex;
    private String addressLine;
    
    private String DOB;
    private int phoneNo;
    
    private float BP;
    private float pulse;
    private float hemoglobin;
    private float temperature;
    private boolean healthy;
    private boolean antibiotics;
    private boolean infection;
    private boolean aspirin;
    private boolean vaccine;
    private boolean Donatedblood;
    private String blood;

    public boolean isDonatedblood() {
        return Donatedblood;
    }

    public void setDonatedblood(boolean Donatedblood) {
        this.Donatedblood = Donatedblood;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public boolean isHealthy() {
        return healthy;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    public boolean isAntibiotics() {
        return antibiotics;
    }

    public void setAntibiotics(boolean antibiotics) {
        this.antibiotics = antibiotics;
    }

    public boolean isInfection() {
        return infection;
    }

    public void setInfection(boolean infection) {
        this.infection = infection;
    }

    public boolean isAspirin() {
        return aspirin;
    }

    public void setAspirin(boolean aspirin) {
        this.aspirin = aspirin;
    }

    public boolean isVaccine() {
        return vaccine;
    }

    public void setVaccine(boolean vaccine) {
        this.vaccine = vaccine;
    }

    

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public float getBP() {
        return BP;
    }

    public void setBP(float BP) {
        this.BP = BP;
    }

    public float getPulse() {
        return pulse;
    }

    public void setPulse(float pulse) {
        this.pulse = pulse;
    }

    public float getHemoglobin() {
        return hemoglobin;
    }

    public void setHemoglobin(float hemoglobin) {
        this.hemoglobin = hemoglobin;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
        @Override
    public String toString() {
        return sender.getUsername();
    }

    public void setLabTechnician(UserAccount labTechnician) {
        this.labTechnician = labTechnician; //To change body of generated methods, choose Tools | Templates.
    }
   
}
