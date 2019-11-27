/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Organization.AdminOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.AdminJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Huangdong Wen <wen.hu@husky.neu.edu>
 */
public class AdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Business business) {
        return new AdminJPanel(userProcessContainer, account, (AdminOrganization) organization,
                enterprise, business);
    }
    
}
