/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AccountantOrganization;
import Business.Organization.Organization;
import Business.Organization.TransportOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.HealthcareAccountantRole.AccountantWorkAreaJPanel;
import userinterface.PharmaTransportRole.TransportWorkAreaJPanel;

/**
 *
 * @author Shesh Narayan
 */
public class TransportRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem ecosystem) {
        return new TransportWorkAreaJPanel(userProcessContainer, account, (TransportOrganization)organization, enterprise);
    }
    
}
