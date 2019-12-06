/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.BloodCollectionStationOrganization;
import Business.Organization.MedicalOrganisation;

import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.BloodBank.BloodBankJPanel;
import UserInterface.Pharmacy.PharmacyJPanel;
import UserInterface.PharmacyAdmin.PharmacyAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author namratha
 */
public class Pharmacy extends Role{
    @Override
   public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PharmacyJPanel(userProcessContainer, account, (MedicalOrganisation) organization,
                enterprise, business);
    }
}
