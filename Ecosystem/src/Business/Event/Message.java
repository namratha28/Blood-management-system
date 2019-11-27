/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Event;

/**
 *
 * @author Huangdong Wen <wen.hu@husky.neu.edu>
 */
public class Message {

    private final String name;
    private final String content;

    public Message(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public String getName() {
        return name;
    }
}
