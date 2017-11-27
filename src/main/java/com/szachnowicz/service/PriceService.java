package com.szachnowicz.service;

import org.sqlite.SQLiteDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PriceService {


    private static final String SELECT_ALL = "SELECT *  FROM PRICES";

    public static void getAll(SQLiteDataSource dataSource) {

        ResultSet executeQuery = null;
        int i = 0;

        try

        {
            Connection conn = dataSource.getConnection();

            Statement stmt = conn.createStatement();
            ResultSet resultSet = stmt.executeQuery(SELECT_ALL);

            while (resultSet.next()) {
                System.out.print(" ID : " + resultSet.getInt("ID"));
                System.out.print(", TYPE : " + resultSet.getString("TYPE"));
                System.out.print(", PRICE :  " + resultSet.getInt("PRICE"));

                System.out.println();
            }



        } catch (
                SQLException e)

        {
            System.out.println(e.getMessage());
        }
    }


}
