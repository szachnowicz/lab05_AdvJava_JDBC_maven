package com.szachnowicz.domain;

import static org.junit.jupiter.api.Assertions.*;

class BookingTest {
    @org.junit.jupiter.api.BeforeEach
    void setUp() {






    }

    @org.junit.jupiter.api.Test
    void getBookingInput() {
        Booking booking = Booking.getBookingInput();
        System.out.println(booking.toString());

    }

}