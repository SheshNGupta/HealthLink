/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import static Business.Organization.Organization.Type.InsuranceFinanceOrganization;
import java.util.ArrayList;

/**
 *
 * @author Shesh Narayan
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizations() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        
        //Adding HealthCenter Organizations
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabAssistantOrganization();
            organizationList.add(organization);
        }
        
         else if(type.getValue().equals(Type.Patient.getValue()))
        {
            organization = new PatientOrganization();
            organizationList.add(organization);
                    
        }
        
        else if(type.getValue().equals(Type.Accountant.getValue()))
        {
            organization = new AccountantOrganization();
            organizationList.add(organization);
                    
        }
        
        //Adding Government Organizations
        
        else if(type.getValue().equals(Type.HealthcareOfficer.getValue()))
        {
            organization = new HealthOfficerOrganization();
            organizationList.add(organization);
                    
        }
        
         else if(type.getValue().equals(Type.Secretary.getValue()))
        {
            organization = new SecretaryOrganization();
            organizationList.add(organization);
                    
        }
         else if(type.getValue().equals(Type.Treasurer.getValue()))
        {
            organization = new TreasurerOrganization();
            organizationList.add(organization);
                    
        }
                //Adding Insurance Organizations
                
          else if(type.getValue().equals(Type.InsuranceAgent.getValue()))
        {
            organization = new InsAgentOrganization();
            organizationList.add(organization);
                    
        } 
          else if(type.getValue().equals(Type.InsuranceFinanceOrganization.getValue()))
        {
            organization = new InsFinanceOrganization();
            organizationList.add(organization);
                    
        }
          else if(type.getValue().equals(Type.InsurancePolicyPlanner.getValue()))
        {
            organization = new InsPolicyPlannerOrganization();
            organizationList.add(organization);
                    
        }
          //Adding Pharma Organizations
        else if(type.getValue().equals(Type.Transport.getValue()))
        {
            organization = new TransportOrganization();
            organizationList.add(organization);
                    
        }
        else if(type.getValue().equals(Type.Manager.getValue()))
        {
            organization = new ManagerOrganization();
            organizationList.add(organization);
                    
        }
        
        

       
        return organization;
    }
}