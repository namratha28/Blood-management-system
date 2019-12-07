/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Entity;

/**
 *
 * @author Huangdong Wen <wen.hu@husky.neu.edu>
 */
public enum HospitalStatus {
    WAITING_FOR_APPOINTMENT("WAITING_FOR_APPOINTMENT"),
    WAITING_FOR_SURGERY("WAITING_FOR_SURGERY"),
    WAITING_FOR_BLOOD("WAITING_FOR_BLOOD"),
    WAITING_FOR_NURSE("WAITING_FOR_NURSE"),
    WAITING_FOR_DOCTOR("WAITING_FOR_DOCTOR"),
    WAITING_FOR_BLOODTEST("WAITING_FOR_BLOODTEST"),
    BLOOD_READY("BLOOD_READY"),
    URGENT("URGENT"),
    CLOSE("CLOSE"),
    NO_STATUS("NO_STATUS");
     
        private String value;

        private HospitalStatus(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
}
