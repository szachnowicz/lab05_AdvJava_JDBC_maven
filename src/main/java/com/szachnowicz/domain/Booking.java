package com.szachnowicz.domain;

import java.sql.Date;
import java.util.Scanner;

public class Booking {
    private int id;
    private int type;
    private int client;
    private String date;


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Booking() {

    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getClient() {
        return client;
    }

    public void setClient(int client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", client=" + client +
                ", date='" + date + '\'' +
                '}';
    }

    public static Booking getBookingInput() {

        Booking booking = new Booking();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj numer usługi");
        try {
            int i = scanner.nextInt();

            System.out.println("Podaj Date");
            String data = scanner.nextLine();
            booking.setDate(data);

        } catch (NumberFormatException e) {
            System.out.println("wprowadzono zła wartość");
        }

        return booking;
    }


    public static void findReservation() {
        Scanner scanner = new Scanner(System.in);






    }
}
