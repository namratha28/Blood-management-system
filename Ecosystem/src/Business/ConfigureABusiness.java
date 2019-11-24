/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Organization.AdminOrganization;
import Business.Organization.DoctorOrganization;
import Business.Organization.LabOrganization;
import Business.UserAccount.UserAccount;

/**
 *
 * @author AED_DEVOPS
 */
public class ConfigureABusiness {

    public static Business configure() {
        // Three roles: LabAssistant, Doctor, Admin

        Business business = Business.getInstance();
        AdminOrganization ad = new AdminOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(ad);
        Employee employee = new Employee();
        employee.setName("roxanne");
        UserAccount userAccount = new UserAccount();

        userAccount.setUsername("admin");
        userAccount.setPassword("admin");
        userAccount.setRole("Admin");
        userAccount.setEmployee(employee);

        ad.getEmployeeDirectory().getEmployeeList().add(employee);
        ad.getUserAccountDirectory().getUserAccountList().add(userAccount);

        DoctorOrganization doctor = new DoctorOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(doctor);
        Employee employee_doc = new Employee();
        employee_doc.setName("Jackie");
        UserAccount userAccount_doc = new UserAccount();

        userAccount_doc.setUsername("doctor");
        userAccount_doc.setPassword("doctor");
        userAccount_doc.setRole("Doctor");
        userAccount_doc.setEmployee(employee_doc);

        doctor.getEmployeeDirectory().getEmployeeList().add(employee_doc);
        doctor.getUserAccountDirectory().getUserAccountList().add(userAccount_doc);

        LabOrganization lab = new LabOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(lab);
        Employee employee_lab = new Employee();
        employee_lab.setName("Ben");
        UserAccount userAccount_lab = new UserAccount();

        userAccount_lab.setUsername("lab");
        userAccount_lab.setPassword("lab");
        userAccount_lab.setRole("lab");
        userAccount_lab.setEmployee(employee_lab);

        lab.getEmployeeDirectory().getEmployeeList().add(employee_lab);
        lab.getUserAccountDirectory().getUserAccountList().add(userAccount_lab);

        return business;
    }

}
