package com.szachnowicz;

import com.szachnowicz.service.ClientService;
import org.sqlite.SQLiteDataSource;
import org.sqlite.SQLiteJDBCLoader;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean initialize = SQLiteJDBCLoader.initialize();

        SQLiteDataSource dataSource = new SQLiteDataSource();
        dataSource.setUrl("jdbc:sqlite:TIER_SHOP.sqlite");

        int i = 0;
//        try {
//            ResultSet executeQuery = dataSource.getConnection()
//                    .createStatement().executeQuery("select * from \"PRICES\"");
//            while (executeQuery.next()) {
//                i++;
//                System.out.println("out: " + executeQuery.getMetaData().getColumnLabel(i));
//
//            }
//
//
//        } catch (SQLException ex) {
//            System.out.println("ERROR" + ex);
//        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sytem obsługi serwisu wymiany opon");
        while (true) {
            System.out.println("Prosze wybrać operacje : ");
            System.out.println("1. Dodaj nowego Klienta");
            System.out.println("2. Dodaj nową rezerwacje ");
            System.out.println("3. Wyświetl pierwsza w kolejce rezerwacje");
            try {

                int choose = scanner.nextInt();
//
//                if(choose == 1)
//                {
//                    ClientService.addNewClient(dataSource);
//                }


                if(choose == 2)
                {
                    ClientService.addNewClient(dataSource);
                }


            } catch (InputMismatchException e) {
                System.out.println("Wpisano  zły numer - prosze podać jeszcze raz ");
                scanner.next();
                continue;
            }

        }


    }
}
