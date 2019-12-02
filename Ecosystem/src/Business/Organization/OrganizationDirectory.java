/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
import Business.Enterprise.BloodBankEnterprise;
import Business.Enterprise.GovermentEnterprise;
import Business.Enterprise.HospitalEnterprise;
import java.util.ArrayList;


/**
 *
 * @author Huangdong Wen <wen.hu@husky.neu.edu>
 */
public class OrganizationDirectory {
    
   private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Organization.Type type) {
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Admin.getValue())) {
            organization = new AdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.BloodBankAdmin.getValue())) {
            organization = new BloodBankAdminOrganisation();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.InsuranceAdmin.getValue())) {
            organization = new InsuranceCompEmployeeOrganization();
            organizationList.add(organization);
        }  else if (type.getValue().equals(Organization.Type.Donor.getValue())) {
            organization = new DonorOrganisation();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.BloodBank.getValue())) {
            organization = new BloodCollectionStationOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Organization.Type.LogisticsAdmin.getValue())) {
            organization = new LogisticsEmployeeOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.HospitalAdmin.getValue())) {
            organization = new HospitalOrganisation();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.GovermentAdmin.getValue())) {
            organization = new GovEmployeeOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.PharmacyAdmin.getValue())) {
            organization = new MedicineInventoryOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Nurse.getValue())) {
            organization = new NurseOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Doctor.getValue())) {
            organization = new DoctorOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.FrontDesk.getValue())) {
            organization = new FrontDeskEmployeeOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Lab.getValue())) {
            organization = new LabOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Common.getValue())) {
            organization = new CommonUserOrganization();
            organizationList.add(organization);
        }

        return organization;
    }
}