/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author namratha
 */
public class DonorRequest extends WorkRequest{
    private UserAccount sender;
    private UserAccount receiver;
    private UserAccount bloodBank;

    public UserAccount getBloodBank() {
        return bloodBank;
    }

    public void setBloodBank(UserAccount bloodBank) {
        this.bloodBank = bloodBank;
    }
    private String status;
    private Date requestDate;
    private Date resolveDate;
     private UserAccount Medicinesender;
    private UserAccount Medicinereceiver;
    private String Medicinestatus;
    private Date requestMedicineDate;
    private String medicine;
    private int quantity;
    private UserAccount labTechnician;

    public UserAccount getLabTechnician() {
        return labTechnician;
    }

  
    public UserAccount getMedicinesender() {
        return Medicinesender;
    }

    public void setMedicinesender(UserAccount Medicinesender) {
        this.Medicinesender = Medicinesender;
    }

    public UserAccount getMedicinereceiver() {
        return Medicinereceiver;
    }

    public void setMedicinereceiver(UserAccount Medicinereceiver) {
        this.Medicinereceiver = Medicinereceiver;
    }

    public String getMedicinestatus() {
        return Medicinestatus;
    }

    public void setMedicinestatus(String Medicinestatus) {
        this.Medicinestatus = Medicinestatus;
    }

    public Date getRequestMedicineDate() {
        return requestMedicineDate;
    }

    public void setRequestMedicineDate(Date requestMedicineDate) {
        this.requestMedicineDate = requestMedicineDate;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
