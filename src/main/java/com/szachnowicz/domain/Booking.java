package com.szachnowicz.domain;

import java.sql.Date;

public class Booking {
    private int id;
    private String type;
    private Client client;
    private Date date;

    public Booking(int id, String type, Client client, Date date) {
        this.id = id;
        this.type = type;
        this.client = client;
        this.date = date;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
