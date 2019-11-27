/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Entity;

import Business.Request.RequestQueue;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Huangdong Wen <wen.hu@husky.neu.edu>
 */
public class Person  {

    private int age;
    private boolean isDisabled;
    private int contributionScore;
    private BloodType type;
    private boolean donors;
    List<Integer> donationHistory;
    List<Integer> treatmentHistory;

    public Person() {
       
    }

    public Person(int age, boolean isDisabled, int contributionScore, BloodType type, boolean donors, List<Integer> donationHistory, List<Integer> treatmentHistory) {
        this.age = age;
        this.isDisabled = isDisabled;
        this.contributionScore = contributionScore;
        this.type = type;
        this.donors = donors;
        this.donationHistory = donationHistory;
        this.treatmentHistory = treatmentHistory;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    public int getContributionScore() {
        return contributionScore;
    }

    public void setContributionScore(int contributionScore) {
        this.contributionScore = contributionScore;
    }

    public BloodType getType() {
        return type;
    }

    public void setType(BloodType type) {
        this.type = type;
    }

    public boolean isDonors() {
        return donors;
    }

    public void setDonors(boolean donors) {
        this.donors = donors;
    }

    public List<Integer> getDonationHistory() {
        return donationHistory;
    }

    public void setDonationHistory(List<Integer> donationHistory) {
        this.donationHistory = donationHistory;
    }

    public List<Integer> getTreatmentHistory() {
        return treatmentHistory;
    }

    public void setTreatmentHistory(List<Integer> treatmentHistory) {
        this.treatmentHistory = treatmentHistory;
    }


}
