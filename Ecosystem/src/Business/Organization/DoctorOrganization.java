/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.Employee;

import Business.Organization.Organization.Type;
import Business.Role.DoctorRole;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Huangdong Wen <wen.hu@husky.neu.edu>
 */
public class DoctorOrganization extends Organization {

    //Map<Employee,String> doc_spe=new HashMap();
    public DoctorOrganization() {
        super(Type.Doctor.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DoctorRole());
        return roles;
    }

}
