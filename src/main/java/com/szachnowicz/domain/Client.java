package com.szachnowicz.domain;

import java.util.Scanner;

public class Client {
    private int id;
    private String name;
    private boolean served;
    private String telNo;

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
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

    public boolean isServed() {
        return served;
    }

    public void setServed(boolean served) {
        this.served = served;
    }


    @Override
    public String toString() {
        return "Client " +
                " id = "  + id +
                ", name= ' " + name + '\'' +
                ", served= " + served +
                ", telNo= ' " + telNo + '\'' +
                '}';
    }

    public static Client getClientIput() {
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj Imie i nazwisko");
        client.setName(scanner.nextLine());

        System.out.println(" numer Telefonu");
        client.setTelNo(scanner.nextLine());

        client.setServed(false);

        System.out.println(client.toString());
        return client;
    }
}
