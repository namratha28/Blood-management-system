/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.Network;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Business {

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
        networkList = new ArrayList<>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }


 
}
