/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.UserAccount;

import java.util.ArrayList;
import business.Employee.Employee;
import business.Role.Role;


/**
 *
 * @author Puranjai
 */


public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccntList;

    public UserAccountDirectory() {
        userAccntList = new ArrayList<UserAccount>();
    }

    public ArrayList<UserAccount> getUserAccntList() {
        return userAccntList;
    }
    
    public UserAccount authenticateUserAccnt(String username, String password){
        for (UserAccount ua : userAccntList)
            if (ua.getUsername().equals(username) && ua.getPwd().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccnt(String username, String password, Employee employee, Role role){
        UserAccount userAccnt = new UserAccount();
        userAccnt.setUsername(username);
        userAccnt.setPwd(password);
        userAccnt.setEmp(employee);
        userAccnt.setRole(role);
        userAccntList.add(userAccnt);
        return userAccnt;
    }
    
    
    
    
    
}