/*
 * To change this license heade(""), choose License Headers in Project Properties.
 * To change this template fil(""), choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Entity;

import java.util.LinkedList;

/**
 *
 * @author Huangdong Wen <wen.hu@husky.neu.edu>
 */
public enum Specialities {

    Allergology("Allergology"),
    Anaesthetics("Anaesthetics"),
    Cardiology("Cardiology"),
    surgery("surgery"),
    Dermatology("Dermatology"),
    Endocrinology("Endocrinology"),
    Gastroenterology("Gastroenterology"),
    Geriatrics("Geriatrics"),
    Hematology("Hematology"),
    Immunology("Immunology"),
    Nephrology("Nephrology"),
    Neuropsychiatry("Neuropsychiatry"),
    Neurology("Neurology"),
    Neurosurgery("Neurosurgery"),
    Ophthalmology("Ophthalmology"),
    Orthopaedics("Orthopaedics"),
    Otorhinolaryngology("Otorhinolaryngology"),
    Paediatrics("Paediatrics"),
    Pathology("Pathology"),
    Pharmacology("Pharmacology"),
    Psychiatry("Psychiatry"),
    Radiology("Radiology"),
    Rheumatology("Rheumatology"),
    Stomatology("Stomatology"),
    Urology("Urology"),
    Venereology("Venereology");
    private String value;

    private Specialities(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
