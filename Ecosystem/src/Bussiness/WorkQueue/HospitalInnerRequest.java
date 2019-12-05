/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness.WorkQueue;

import Business.UserAccount.UserAccount;

/**
 *
 * @author Huangdong Wen <wen.hu@husky.neu.edu>
 */
public class HospitalInnerRequest extends WorkRequest{
    
    private UserAccount patient;

    public UserAccount getPatient() {
        return patient;
    }

    public void setPatient(UserAccount patient) {
        this.patient = patient;
    }
    
}
