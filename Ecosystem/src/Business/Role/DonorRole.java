/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.BloodCollectionStationOrganization;
import Business.Organization.DonorOrganisation;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.Donor.DonorJPanel;
import UserInterface.Donor.DonorJPanel;
import javax.swing.JPanel;

/**
 *
 * @author namratha
 */
public class DonorRole extends Role{
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DonorJPanel(userProcessContainer, account, (DonorOrganisation) organization,
                enterprise, business);
    }
}
