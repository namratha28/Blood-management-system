/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Request;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Huangdong Wen <wen.hu@husky.neu.edu>
 */
public class RequestQueue {
     private List<Request> requestList;

    public RequestQueue() {
        requestList = new ArrayList<>();
    }

    public List<Request> getWorkRequestList() {
        return requestList;
    }
}
