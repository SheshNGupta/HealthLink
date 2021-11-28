/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Shesh Narayan
 */
public class OrderDirectory {
    
    private List<Order> orders = new ArrayList<>();

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public void addOrder(Order order)
    {
        Random rand = new Random();
        int rand_int1 = rand.nextInt(100000);
        order.setNumber("Order_no_"+String.valueOf(rand_int1));
        this.orders.add(order);
        
    }
    
}
