/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.FrontDeskRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Huangdong Wen <wen.hu@husky.neu.edu>
 */
public class FrontDeskEmployeeOrganization extends Organization{

    public FrontDeskEmployeeOrganization() {
        super(Type.FrontDesk.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new FrontDeskRole());
        return roles;
    }
    
}
