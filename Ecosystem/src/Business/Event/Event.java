/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Event;

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

    
    public void produce(Event event, Message m){
        System.out.println(m.getName()+":"+event.eventName+"submit an event");
        setChanged();
        notifyObservers(m);

    }

}
