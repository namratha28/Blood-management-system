/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Entity;

import Bussiness.WorkQueue.WorkRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Huangdong Wen <wen.hu@husky.neu.edu>
 */
public class Person {

    private String name;
    private Date birthday;
    private int age;
    private boolean isDisabled;
    private int contributionScore;
    private BloodType type;
    private boolean donors;
    private int pulse;
    private int temperature;
    private int bloodPress;
    List<WorkRequest> donationHistory;
    List<WorkRequest> treatmentHistory;

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getBloodPress() {
        return bloodPress;
    }

    public void setBloodPress(int bloodPress) {
        this.bloodPress = bloodPress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Person() {
    }

    public Person(String name, Date b) {
        this.name = name;
        this.birthday = b;
        this.type = BloodType.UNKNOWN;
        this.treatmentHistory = new ArrayList<WorkRequest>();
    }

    public Person(int age, boolean isDisabled, int contributionScore, BloodType type, boolean donors, List<WorkRequest> donationHistory, List<WorkRequest> treatmentHistory) {
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

    @Override
    public String toString() {
        return name;
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

    public List<WorkRequest> getDonationHistory() {
        return donationHistory;
    }

    public void setDonationHistory(List<WorkRequest> donationHistory) {
        this.donationHistory = donationHistory;
    }

    public List<WorkRequest> getTreatmentHistory() {
        return treatmentHistory;
    }

    public void setTreatmentHistory(List<WorkRequest> treatmentHistory) {
        this.treatmentHistory = treatmentHistory;
    }

}
