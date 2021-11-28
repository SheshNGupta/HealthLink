/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author Shesh Narayan
 */
public class Employee {
    
    private String name;
    private int id;
    private static int count = 1;
    private String email;

    public Employee() {
        id = count;
        count++;
        this.email="gupta.shes@northeastern.edu";
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
