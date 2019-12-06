/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.BloodBankRole;
import Business.Role.Pharmacy;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author namratha
 */
public class MedicalOrganisation extends Organization {
    public MedicalOrganisation() {
        super(Organization.Type.Pharmacy.getValue());
    }

    @Override
   public ArrayList<Role> getSupportedRole() {

        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new Pharmacy());
        return roles;
    } 
}
