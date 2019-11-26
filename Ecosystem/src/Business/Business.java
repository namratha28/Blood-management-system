/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author Administrator
 */
public class Business {

    private static volatile Business business;

    private EnterpriseDirectory enterpriseDirectory;

    public static Business getInstance() {
        if (business == null) {
            synchronized (Business.class) {
                if (business == null) {
                    business = new Business();
                }
            }
        }
        return business;
    }

    private Business() {
        enterpriseDirectory = new EnterpriseDirectory();
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
}
