/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Business extends Enterprise{

    private static volatile Business business;
    private ArrayList<Network> networkList;
 

    public static Business getInstance() {
        if (business == null) {
            synchronized (Business.class) {
                if (business == null) {
                    business = new Business();
                }
            }
        }
        return business;
    }

    private Business() {
        super(null);
        networkList = new ArrayList<>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 

 
}
