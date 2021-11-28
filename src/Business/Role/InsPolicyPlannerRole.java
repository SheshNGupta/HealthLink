/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.InsPolicyPlannerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.InsurancePlannerRole.InsurancePlannerWorkAreaJPanel;

/**
 *
 * @author Shesh Narayan
 */
public class InsPolicyPlannerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new InsurancePlannerWorkAreaJPanel(userProcessContainer, account, (InsPolicyPlannerOrganization)organization, enterprise);
    }
    
}
