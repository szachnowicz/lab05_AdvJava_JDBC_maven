package com.szachnowicz.service;

import com.szachnowicz.domain.Booking;
import com.szachnowicz.domain.Client;
import org.sqlite.SQLiteDataSource;

import java.sql.*;
import java.util.Scanner;

public class ClientService {

    private static String INSERT = "INSERT INTO CLIENT(NAME,BOOKING_ID,SERVED,TEL_NO) VALUES(?,?,?,?)";
    private static String SELECT_ALL = "SELECT * FROM CLIENT";

    public static void addNewClient(SQLiteDataSource dataSource) {
        Connection connection = null;

        Client client = Client.getClientIput();

        try {
            connection = dataSource.getConnection();
            PreparedStatement newClientStatment = connection.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
            newClientStatment.setString(1, client.getName());
            newClientStatment.setInt(2, -1);
            newClientStatment.setBoolean(3, false);
            newClientStatment.setString(4, client.getTelNo());
            int insertedRows = newClientStatment.executeUpdate();

            ResultSet rs = newClientStatment.getGeneratedKeys();
            rs.next();
            int cilentID = rs.getInt(1);
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


    public static void updateClient(SQLiteDataSource dataSource, Client client) {

    }


    public static void getAllClients(SQLiteDataSource dataSource) {

        ResultSet executeQuery = null;
        int i = 0;

        try {
            Connection conn = dataSource.getConnection();

            Statement stmt  = conn.createStatement();
            ResultSet resultSet =  stmt.executeQuery(SELECT_ALL);

            while (resultSet.next())
            {
                System.out.print(" ID : "+resultSet.getInt("ID"));
                System.out.print(", Name : "+resultSet.getString("NAME"));
                System.out.print(", BOOKING ID :  "+resultSet.getInt("BOOKING_ID"));
                System.out.print(", TEL: NO : "+resultSet.getString("TEL_NO"));
                System.out.println();
            }

                // loop through the result set

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

    }

}
