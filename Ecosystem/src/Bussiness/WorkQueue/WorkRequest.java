/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness.WorkQueue;

import Business.UserAccount.UserAccount;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author namratha
 */
public abstract class WorkRequest {

    private UserAccount sender;
    private UserAccount receiver;
    private UserAccount patient;

    private String status;
    private Date requestDate;
    private Date resolveDate;

    private String message;
    private String complaintMessage;
    private String freeMed;
    private int quantity;
    private Date appointmentDate;
    private String comments;
    private String medicine;

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public UserAccount getPatient() {
        return patient;
    }

    public void setPatient(UserAccount patient) {
        this.patient = patient;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFreeMed() {
        return freeMed;
    }

    public void setFreeMed(String freeMed) {
        this.freeMed = freeMed;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
    private LocalDate date;

    public String getComplaintMessage() {
        return complaintMessage;
    }

    public void setComplaintMessage(String complaintMessage) {
        this.complaintMessage = complaintMessage;
    }

    public LocalDate getDate() {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        date.format(formatter);
        return date;
    }

    public void setDate(LocalDate date) {
        
        this.date = date;
    }

    public WorkRequest() {
        requestDate = new Date();
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

   

}
