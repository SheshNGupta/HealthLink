package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Role.EnterpriseAdminRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Shesh Narayan
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem ecosystem = EcoSystem.getInstance();
//        Check Bharat
//Check Shesh
        //Hey There        
        //Commit by Bharat
        //Commit by Nikita
        //Comit for Creating the whole ecosystem
        String email="gupta.shes@northeastern.edu";
        
        
        //Create a network
        Network network = ecosystem.createAndAddNetwork();
        network.setName("Boston");
        network.setZip(2120);
        Network network1 = ecosystem.createAndAddNetwork();
        network1.setName("New York");
        network1.setZip(2121);
        Network network2 = ecosystem.createAndAddNetwork();
        network2.setName("California");
        network2.setZip(2122);
        //create an enterprise
        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            if(type.toString().equals("HealthCenter"))
            {
                Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise("healthbos", type, 2120,"1493 Cambridge St, Cambridge, MA 02139");
                Enterprise enterprise1 = network1.getEnterpriseDirectory().createAndAddEnterprise("healthnew", type, 2121,"170 William St, New York, NY 10038");
                Enterprise enterprise2 = network2.getEnterpriseDirectory().createAndAddEnterprise("healthcal", type, 2122,"100 S Raymond Ave, Alhambra, CA 91801");
                //have some employees
                Employee employee = enterprise.getEmployeeDirectory().createEmployee("healthbos");
                employee.setEmail(email);
                UserAccount userAccount= enterprise.getUserAccountDirectory().createUserAccount("healthbos", "Money_1234", employee, new EnterpriseAdminRole());
                
                Employee employee1 = enterprise.getEmployeeDirectory().createEmployee("healthnew");
                employee1.setEmail(email);
                UserAccount userAccount1= enterprise1.getUserAccountDirectory().createUserAccount("healthnew", "Money_1234", employee1, new EnterpriseAdminRole());
                
                Employee employee2 = enterprise.getEmployeeDirectory().createEmployee("healthcal");
                employee2.setEmail(email);
                UserAccount userAccount2= enterprise2.getUserAccountDirectory().createUserAccount("healthcal", "Money_1234", employee1, new EnterpriseAdminRole());
            
            }
            if(type.toString().equals("Pharma"))
            {
                Enterprise enterprise3 = network.getEnterpriseDirectory().createAndAddEnterprise("pharmabos", type, 2120,"1630 Tremont St, Crossing, MA 02120");
                Enterprise enterprise4 = network1.getEnterpriseDirectory().createAndAddEnterprise("pharmanew", type, 2121,"530 5th Ave, New York, NY 10036");
                Enterprise enterprise5 = network2.getEnterpriseDirectory().createAndAddEnterprise("pharmacal", type, 2122,"322 3rd St, California, PA 15419");
                //have some employees
                Employee employee3 = enterprise3.getEmployeeDirectory().createEmployee("pharmabos");
                employee3.setEmail(email);
                UserAccount userAccount3= enterprise3.getUserAccountDirectory().createUserAccount("pharmabos", "Money_1234", employee3, new EnterpriseAdminRole());
                
                Employee employee4 = enterprise4.getEmployeeDirectory().createEmployee("pharmanew");
                employee4.setEmail(email);
                UserAccount userAccount4= enterprise4.getUserAccountDirectory().createUserAccount("pharmanew", "Money_1234", employee4, new EnterpriseAdminRole());
                
                Employee employee5 = enterprise5.getEmployeeDirectory().createEmployee("pharmacal");
                employee5.setEmail(email);
                UserAccount userAccount5= enterprise5.getUserAccountDirectory().createUserAccount("pharmacal", "Money_1234", employee5, new EnterpriseAdminRole());
            
            
            }
            if(type.toString().equals("Government"))
            {
                Enterprise enterprise6 = network.getEnterpriseDirectory().createAndAddEnterprise("govbos", type, 2120,"15 Sudbury St, Boston, MA 02203");
                Enterprise enterprise7 = network1.getEnterpriseDirectory().createAndAddEnterprise("govnew", type, 2121,"W Houston St Entrance, 201 Varick St Ste 1023, New York, 10014");
                Enterprise enterprise8 = network2.getEnterpriseDirectory().createAndAddEnterprise("govcal", type, 2122,"34 Civic Center Plaza, Santa Ana, CA 92701");
                //have some employees
                Employee employee6 = enterprise6.getEmployeeDirectory().createEmployee("govbos");
                employee6.setEmail(email);
                UserAccount userAccount6= enterprise6.getUserAccountDirectory().createUserAccount("govbos", "Money_1234", employee6, new EnterpriseAdminRole());
                
                Employee employee7 = enterprise7.getEmployeeDirectory().createEmployee("govnew");
                employee7.setEmail(email);
                UserAccount userAccount7= enterprise7.getUserAccountDirectory().createUserAccount("govnew", "Money_1234", employee7, new EnterpriseAdminRole());
                
                Employee employee8 = enterprise8.getEmployeeDirectory().createEmployee("govcal");
                employee8.setEmail(email);
                UserAccount userAccount8= enterprise8.getUserAccountDirectory().createUserAccount("govcal", "Money_1234", employee8, new EnterpriseAdminRole());
            
            }
            if(type.toString().equals("InsuranceCompany"))
            {
                Enterprise enterprise9 = network.getEnterpriseDirectory().createAndAddEnterprise("insbos", type, 2120,"1560 Tremont St, Boston, MA 02120");
                Enterprise enterprise10 = network1.getEnterpriseDirectory().createAndAddEnterprise("insnew", type, 2121,"32 Old Slip 30th Fl, New York, NY 10005");
                Enterprise enterprise11 = network2.getEnterpriseDirectory().createAndAddEnterprise("inscal", type, 2122,"11022 Winners Cir # 100, Los Alamitos, CA 90720");
                //have some employees
                Employee employee9 = enterprise9.getEmployeeDirectory().createEmployee("insbos");
                employee9.setEmail(email);
                UserAccount userAccount9= enterprise9.getUserAccountDirectory().createUserAccount("insbos", "Money_1234", employee9, new EnterpriseAdminRole());
                
                Employee employee10 = enterprise10.getEmployeeDirectory().createEmployee("insnew");
                employee10.setEmail(email);
                UserAccount userAccount10= enterprise10.getUserAccountDirectory().createUserAccount("insnew", "Money_1234", employee10, new EnterpriseAdminRole());
                
                Employee employee11 = enterprise11.getEmployeeDirectory().createEmployee("inscal");
                employee11.setEmail(email);
                UserAccount userAccount11= enterprise11.getUserAccountDirectory().createUserAccount("inscal", "Money_1234", employee11, new EnterpriseAdminRole());
            
            }
        }
        //initialize some organizations
        
            
        //create user account
        
        
        Employee sysemployee = ecosystem.getEmployeeDirectory().createEmployee("sysadmin");
        
        UserAccount userAccount = ecosystem.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", sysemployee, new SystemAdminRole());
        
        return ecosystem;
    }
    
}
