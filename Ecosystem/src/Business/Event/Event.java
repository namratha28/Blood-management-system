/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Event;

import Business.Request.Request;
import Bussiness.WorkQueue.HospitalInnerRequest;
import Bussiness.WorkQueue.WorkRequest;
import java.util.Observable;

/**
 *
 * @author Huangdong Wen <wen.hu@husky.neu.edu>
 */
public class Event extends Observable {

    private String eventName;

    public Event(String eventName) {
        this.eventName = eventName;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void produce( WorkRequest r){
        System.out.println(r.getSender()+" submit an event:"+r.getMessage());
        setChanged();
        notifyObservers(r);
    }

    public void produce(Message m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
