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
public enum BloodType {

    AP("A+"),
    AN("A-"),
    BP("B+"),
    BN("B-"),
    ABP("AB+"),
    ABN("AB-"),
    OP("O+"),
    ON("O-"),
    UNKNOWN("UNKNOWN");
    private String value;

    private BloodType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
