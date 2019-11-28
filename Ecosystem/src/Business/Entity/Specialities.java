/*
 * To change this license heade, choose License Headers in Project Properties.
 * To change this template fil, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Entity;

import java.util.LinkedList;

/**
 *
 * @author Huangdong Wen <wen.hu@husky.neu.edu>
 */
public enum Specialities {

    Allergology,
    Anaesthetics,
    Cardiology,
    surgery,
    Dermatology,
    Endocrinology,
    Gastroenterology,
    Geriatrics,
    Hematology,
    Immunology,
    Nephrology,
    Neuropsychiatry,
    Neurology,
    Neurosurgery,
    Ophthalmology,
    Orthopaedics,
    Otorhinolaryngology,
    Paediatrics,
    Pathology,
    Pharmacology,
    Psychiatry,
    Radiology,
    Rheumatology,
    Stomatology,
    Urology,
    Venereology;

    public static String[] names() {

        LinkedList<String> list = new LinkedList<String>();
        for (Specialities s : Specialities.values()) {
            list.add(s.name());
        }

        return list.toArray(new String[list.size()]);
    }
}
