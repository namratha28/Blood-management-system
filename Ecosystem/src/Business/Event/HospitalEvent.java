/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Event;

import Bussiness.WorkQueue.HospitalInnerRequest;
import java.util.Observable;

/**
 *
 * @author Huangdong Wen <wen.hu@husky.neu.edu>
 */
public class HospitalEvent extends Observable {

    private String eventName;


    public HospitalEvent(String eventName) {
        this.eventName = eventName;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    
    public void produce( HospitalInnerRequest r){
        System.out.println(r.getSender()+" submit an event:"+r.getMessage());
        setChanged();
        notifyObservers(r);

    }

}
