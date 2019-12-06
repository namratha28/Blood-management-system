/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.FrontDeskEmployeeOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.FrontDesk.FrontDeskApptJPanel;
import UserInterface.FrontDesk.FrontDeskJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Huangdong Wen <wen.hu@husky.neu.edu>
 */
public class FrontDeskRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
                return new FrontDeskJPanel(userProcessContainer, account, (FrontDeskEmployeeOrganization) organization,
                enterprise, business);
    }
    
}
