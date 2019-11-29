/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Event;

import java.util.Date;

/**
 *
 * @author Huangdong Wen <wen.hu@husky.neu.edu>
 */
public class Message {

    private String eventName;
    private String eventType;

    private Date eventDate;

    private final String content;

    public Message(String eventName, String eventType, String content) {
        this.eventName = eventName;
        this.eventType = eventType;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

}
