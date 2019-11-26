/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Entity;

import Business.Role.Role;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Huangdong Wen <wen.hu@husky.neu.edu>
 */
public class Person extends Entity{
    int age;
    boolean isDisabled;
    int contributionScore;
    BloodType type;
    boolean donors;
    List<Integer> donationHistory;
    List<Integer> treatmentHistory;

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
