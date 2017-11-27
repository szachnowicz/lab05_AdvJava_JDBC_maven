package com.szachnowicz.domain;

import org.sqlite.SQLiteDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ServiceType {
    private static final String SELECT_ALL = "SELECT * FROM SERVICE_TYPE";
    private String type;
    private int id;
    private Price price;
    private int times;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public static void getAllServices(SQLiteDataSource dataSource) {


        ResultSet executeQuery = null;
        int i = 0;

        try {
            Connection conn = dataSource.getConnection();

            Statement stmt = conn.createStatement();
            ResultSet resultSet = stmt.executeQuery(SELECT_ALL);

            while (resultSet.next()) {
                System.out.print(" ID : " + resultSet.getInt("ID"));
                System.out.print(", Type : " + resultSet.getString("TYPE"));
                System.out.println();
            }

            // loop through the result set

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }


    }
}
