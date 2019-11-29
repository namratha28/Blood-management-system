/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;


/**
 *
 * @author @author AED_DEVOPS
 */
public abstract class Enterprise  {

    private int ranking;
    private String name;

    private int enterpriseID;
    private static int counter;
    private OrganizationDirectory organizationDirectory;

    public Enterprise(String name) {
        organizationDirectory = new OrganizationDirectory();
        this.name = name;
        enterpriseID = counter;
        ++counter;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

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

}
