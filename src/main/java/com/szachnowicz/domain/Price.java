package com.szachnowicz.domain;

public class Price {
    private int id;
    private String type;
    private int price;

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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Price(int id, String type, int price) {

        this.id = id;
        this.type = type;
        this.price = price;
    }
}
