/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.FrontDeskEmployeeOrganization;
import Business.Role.DoctorRole;
import Business.Role.FrontDeskRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;

/**
 *
 * @author AED_DEVOPS
 */
public class ConfigureABusiness {

    public static Business configure() {
        // Three roles: LabAssistant, Doctor, Admin

        Business business = Business.getInstance();
//        AdminOrganization ad = new AdminOrganization();
//        business.getOrganizationDirectory().getOrganizationList().add(ad);
//        Employee employee = new Employee();
//        employee.setName("roxanne");
//        UserAccount userAccount = new UserAccount();
//
//        userAccount.setUsername("admin");
//        userAccount.setPassword("admin");
//        userAccount.setRole("Admin");
//        userAccount.setPerson(employee);
//
//        ad.getEmployeeDirectory().getEmployeeList().add(employee);
//        ad.getUserAccountDirectory().getUserAccountList().add(userAccount);
        
        Enterprise e=new HospitalEnterprise();
        business.getEnterpriseDirectory().getEnterpriseList().add(e);
        DoctorOrganization doctor = new DoctorOrganization();
        e.getOrganizationDirectory().getOrganizationList().add(doctor);
        //business.getOrganizationDirectory().getOrganizationList().add(doctor);
        Employee doc = new Employee();
        doc.setName("Jackie");          
        doc.setDesc("ALLERGY & IMMUNOLOGY");

        UserAccount userAccount_doc = new UserAccount();
        Role role_doc=new DoctorRole();
        userAccount_doc.setUsername("doctor");
        userAccount_doc.setPassword("doctor");
        userAccount_doc.setRole(role_doc);
        userAccount_doc.setEmployee(doc);

        doctor.getEmployeeDirectory().getEmployeeList().add(doc);
        doctor.getUserAccountDirectory().getUserAccountList().add(userAccount_doc);
        
        FrontDeskEmployeeOrganization fd = new FrontDeskEmployeeOrganization();
        e.getOrganizationDirectory().getOrganizationList().add(fd);
        Employee fde = new Employee();
        fde.setName("Katie");
        UserAccount userAccount_fde = new UserAccount();
        Role role_fde=new FrontDeskRole();
        userAccount_fde.setUsername("fd");
        userAccount_fde.setPassword("fd");
        userAccount_fde.setRole(role_fde);
        userAccount_fde.setEmployee(fde);

        fd.getEmployeeDirectory().getEmployeeList().add(fde);
        fd.getUserAccountDirectory().getUserAccountList().add(userAccount_fde);

//        LabOrganization lab = new LabOrganization();
//        business.getOrganizationDirectory().getOrganizationList().add(lab);
//        Employee employee_lab = new Employee();
//        employee_lab.setName("Ben");
//        UserAccount userAccount_lab = new UserAccount();
//
//        userAccount_lab.setUsername("lab");
//        userAccount_lab.setPassword("lab");
//        userAccount_lab.setRole("lab");
//        userAccount_lab.setPerson(employee_lab);
//
//        lab.getEmployeeDirectory().getEmployeeList().add(employee_lab);
//        lab.getUserAccountDirectory().getUserAccountList().add(userAccount_lab);

        return business;
    }

}
