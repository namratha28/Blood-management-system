/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AED_DEVOPS
 */
public class EnterpriseDirectory {
    private List<Enterprise> enterpriseDirectory;
    
    public EnterpriseDirectory() {
        enterpriseDirectory=new ArrayList<>();
    }
    
//    public boolean add(Enterprise e){
//        return enterpriseDirectory.add(e);
//    }

    public List<Enterprise> getEnterpriseList() {
        return enterpriseDirectory;
    }
    
//    public Enterprise createEnterprise(String name){
//        Enterprise enterprise = new Enterprise(name) {
//            @Override
//            public ArrayList<Role> getSupportedRole() {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//        };
//        enterprise.setName(name);
//        enterpriseDirectory.add(enterprise);
//        return enterprise;
//    }
    
}
