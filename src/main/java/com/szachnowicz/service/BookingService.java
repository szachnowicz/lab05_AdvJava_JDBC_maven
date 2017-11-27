package com.szachnowicz.service;

import com.szachnowicz.domain.Booking;
import com.szachnowicz.domain.Client;
import org.sqlite.SQLiteDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookingService {


    private static final String INSERT = "INSERT INTO BOOKING(TYPE ,CILENT_ID,DATE) VALUES(?,?,?)";

    public static void addNewBooking(SQLiteDataSource dataSource, Booking newBooking) {
        Connection connection = null;
//        Booking booking = Booking.getBookingInput();
        try {
            connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(INSERT);
            statement.setInt(1, newBooking.getType());
            statement.setInt(2, newBooking.getClient());
            statement.setString(3, newBooking.getDate());
            int i = statement.executeUpdate();

            System.out.println("dodano " + i + "nową rezerwacje");


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


}
