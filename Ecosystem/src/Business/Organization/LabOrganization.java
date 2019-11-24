/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;


/**
 *
 * @author Huangdong Wen <wen.hu@husky.neu.edu>
 */
public class LabOrganization extends Organization {

    public LabOrganization() {
        super(Type.Lab.getValue());
    }

    @Override
    public ArrayList<String> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
