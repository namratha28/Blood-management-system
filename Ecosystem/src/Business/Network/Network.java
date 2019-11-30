/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author Huangdong Wen <wen.hu@husky.neu.edu>
 */
public class Network {
    private String name;
    private EnterpriseDirectory enterpriseDirectory;

    public Network(String name) {
        this.name=name;
        enterpriseDirectory = new EnterpriseDirectory();
    }

    public Network() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
