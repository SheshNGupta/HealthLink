/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Order.OrderDirectory;
import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Shesh Narayan
 */
public class PharmaEnterprise extends Enterprise {
    private OrderDirectory orderDirectory;
    HashMap<String, Double> menu;

    public PharmaEnterprise(String name, int zip,String address) {
        super(name, EnterpriseType.Pharma, zip,address);
        orderDirectory = new OrderDirectory();
        menu = new HashMap();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    @Override
    public List<Organization.Type> getAllOrganizationTypes() {
        List<Organization.Type> orgTypes = new ArrayList<>();
        orgTypes.add(Organization.Type.Transport);
        orgTypes.add(Organization.Type.Manager);
        //orgTypes.add(Organization.Type.Treasurer);

        return orgTypes;
    }
    
    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(OrderDirectory orderDirectory) {
        this.orderDirectory = orderDirectory;
    }

    public HashMap<String, Double> getMenu() {
        return menu;
    }

    public void setMenu(HashMap<String, Double> menu) {
        this.menu = menu;
    }

}
