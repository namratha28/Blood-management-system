/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.EventAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author dell_owner
 */
public class EventsOrganization extends Organization {
     public EventsOrganization() {
        super(Organization.Type.Events.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new EventAdminRole());
        return roles;
    }
}