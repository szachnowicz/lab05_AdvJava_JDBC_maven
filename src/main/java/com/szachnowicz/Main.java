package com.szachnowicz;

import com.szachnowicz.domain.Booking;
import com.szachnowicz.domain.ServiceType;
import com.szachnowicz.service.BookingService;
import com.szachnowicz.service.ClientService;
import com.szachnowicz.service.PriceService;
import org.sqlite.SQLiteDataSource;
import org.sqlite.SQLiteJDBCLoader;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean initialize = SQLiteJDBCLoader.initialize();

        SQLiteDataSource dataSource = new SQLiteDataSource();
        dataSource.setUrl("jdbc:sqlite:TIER_SHOP.sqlite");


        Scanner scanner = new Scanner(System.in);

        System.out.println("Sytem obsługi serwisu wymiany opon");
        while (true) {
            System.out.println("Prosze wybrać operacje : ");
            System.out.println("1. Dodaj nowego Klienta");
            System.out.println("2. Dodaj nową rezerwacje ");
            System.out.println("3. Wyświetl pierwsza w kolejce rezerwacje");
            System.out.println("4. Cennnik ");
            System.out.println("5. Znajdz rezerwacje ");

            try {

                int choose = scanner.nextInt();

                if (choose == 1) {
                    ClientService.addNewClient(dataSource);
                }


                if (choose == 2) {
                    ClientService.getAllClients(dataSource);
                    System.out.println("Podaj numer Cilenta dla którego chesz zrobić rezerwacje ");
                    int clientID = scanner.nextInt();
                    ServiceType.getAllServices(dataSource);
                    System.out.println("Podaj numer usługi ");
                    int seviceID = scanner.nextInt();
                    System.out.println("Podaj Date");

                    String date = scanner.next();

                    Booking newBooking = new Booking();
                    newBooking.setClient(clientID);
                    newBooking.setType(seviceID);
                    newBooking.setDate(date);
                    System.out.println(newBooking);
                    BookingService.addNewBooking(dataSource, newBooking);


                }

                if (choose == 4) {
                    PriceService.getAll(dataSource);
                }


                if (choose == 5) {
                    Booking.findReservation();

                }


            } catch (InputMismatchException e) {
                System.out.println("Wpisano  zły numer - prosze podać jeszcze raz ");
                scanner.next();
                continue;
            }

        }


    }
}
