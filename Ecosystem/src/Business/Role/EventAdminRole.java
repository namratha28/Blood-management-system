/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.BloodCollectionStationOrganization;
import Business.Organization.EventsOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import UserInterface.CreateEvents.CreateEventJPanel;
import javax.swing.JPanel;

/**
 *
 * @author namratha
 */
public class EventAdminRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new CreateEventJPanel(userProcessContainer, account, (EventsOrganization) organization,
                enterprise, business);
    }
}
