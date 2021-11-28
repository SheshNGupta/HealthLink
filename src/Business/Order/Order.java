/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;


import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shesh Narayan
 */
public class Order {
    
    private String item;
    private String number;
    private Patient customer;
    private UserAccount customerRole;
    private UserAccount deliveryRole;
    private double amount;
    List<ItemList> items;

    

    public Order() {
        items = new ArrayList<ItemList>();
    }
    

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Patient getCustomer() {
        return customer;
    }

    public void setCustomer(Patient customer) {
        this.customer = customer;
    }

    public UserAccount getCustomerRole() {
        return customerRole;
    }

    public void setCustomerRole(UserAccount customerRole) {
        this.customerRole = customerRole;
    }

    public UserAccount getDeliveryRole() {
        return deliveryRole;
    }

    public void setDeliveryRole(UserAccount deliveryRole) {
        this.deliveryRole = deliveryRole;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public List<ItemList> getItems() {
        return items;
    }

    public void setItems(List<ItemList> items) {
        this.items = items;
    }
    @Override
    public String toString() {
        return number;
    }
 
}
