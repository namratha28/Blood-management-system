/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Entity;

import java.util.List;

/**
 *
 * @author roxanne
 */
public class Person extends Entity{
    int age;
    boolean isDisabled;
    int contributionScore;
    BloodType type;
    boolean donors;
    List<Integer> donationHistory;
    List<Integer> treatmentHistory;
    
}
