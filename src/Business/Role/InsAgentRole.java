/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.InsAgentOrganization;
import Business.Organization.Organization;
import Business.Organization.TreasurerOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.GovernmentTreasurerRole.TreasurerWorkAreaJPanel;
import userinterface.InsuranceAgentRole.InsuranceAgentWorkAreaJPanel;

/**
 *
 * @author Shesh Narayan
 */
public class InsAgentRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
     return new InsuranceAgentWorkAreaJPanel(userProcessContainer, account, (InsAgentOrganization)organization, enterprise);
    }
    
}
