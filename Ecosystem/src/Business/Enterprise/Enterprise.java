/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Entity.Entity;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author Huangdong Wen
 */
public class Enterprise extends Entity{
    public enum EnterpriseType {
        Insurance("Insurance"),
        Bank("Bank"),
        OrganBank("OrganBank"),
        Logistics("Logistics"),
        Hospital("Hospital"),
        BloodBank("BloodBank"),
        Goverment("Goverment"),
        Pharmacy("Pharmacy");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    private OrganizationDirectory organizationDirectory;
    public Enterprise() {
        organizationDirectory=new OrganizationDirectory();
    }

}
