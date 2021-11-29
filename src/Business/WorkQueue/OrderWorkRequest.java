/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;


import Business.Order.Order;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Shesh Narayan
 */
public class OrderWorkRequest extends WorkRequest {

    private String registrationDate;
    private String reasonForVisit;
    private UserAccount hospitalAdmin;
    private String orderMessage;
    private double billAmount;
    private UserAccount assignedTransport;
    private Order order;
 
    
    public OrderWorkRequest(String Date, String reasonForVisit) {
        this.registrationDate = Date;
        this.reasonForVisit = reasonForVisit;
        
    }
    
    public OrderWorkRequest() {
        
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String Date) {
        this.registrationDate = Date;
    }

    public String getReasonForVisit() {
        return reasonForVisit;
    }

    public void setReasonForVisit(String reasonForVisit) {
        this.reasonForVisit = reasonForVisit;
    }

    

    
    

    public UserAccount getHospitalAdmin() {
        return hospitalAdmin;
    }

    public void setHospitalAdmin(UserAccount hospitalAdmin) {
        this.hospitalAdmin = hospitalAdmin;
    }

    public String getOrderMessage() {
        return orderMessage;
    }

    public void setOrderMessage(String orderMessage) {
        this.orderMessage = orderMessage;
    }

    

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public UserAccount getAssignedTransport() {
        return assignedTransport;
    }

    public void setAssignedTransport(UserAccount assignedTransport) {
        this.assignedTransport = assignedTransport;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return orderMessage;
    }

}
