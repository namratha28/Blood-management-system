/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Entity;

import Business.Request.RequestQueue;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Huangdong Wen <wen.hu@husky.neu.edu>
 */
public abstract class Entity {

    protected int id;
    protected String name;

    protected String address;
    protected int zipcode;
    protected RequestQueue rq;

    public abstract ArrayList<Role> getSupportedRole();

    public Entity() {
        rq = new RequestQueue();
    }

    public RequestQueue getRq() {
        return rq;
    }

    public void setRq(RequestQueue rq) {
        this.rq = rq;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

}
