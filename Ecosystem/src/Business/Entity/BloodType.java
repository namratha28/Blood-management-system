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

    A("A"),
    B("B"),
    AB("AB"),
    O("O"),
    X("X"),
    UNKNOWN("UNKNOWN");
    private String value;

    private BloodType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
