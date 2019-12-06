/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AdminOrganization;
import Business.Organization.BloodCollectionStationOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.BloodBank.BloodBankJPanel;

import javax.swing.JPanel;
import UserInterface.BloodBankAdmin.BloodBankAdminWorkAreaJPanel;

/**
 *
 * @author namratha
 */


public class BloodBankAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new BloodBankAdminWorkAreaJPanel(userProcessContainer,
                enterprise);
    }
    
}

