/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AdminOrganization;
import Business.Organization.DoctorOrganization;
import Business.Organization.FrontDeskEmployeeOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.admin.HospitalAdminJPanel;
import UserInterface.doctor.DoctorJPanel;
import UserInterface.frontDesk.FrontDeskJPanel;
import javax.swing.JPanel;

/**
 *
 * @author namratha
 */
public class HospitalAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new HospitalAdminJPanel(userProcessContainer, account, (AdminOrganization) organization,
                enterprise, business);
    }
}
