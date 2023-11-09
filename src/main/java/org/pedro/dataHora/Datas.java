package org.pedro.dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now(); //usa a data-hora local
        Instant d03 = Instant.now(); //usa a data-hora global (Londres)

        LocalDate d04 = LocalDate.parse("2023-10-16");
        LocalDateTime d05 = LocalDateTime.parse("2023-10-01T11:37:26");
        Instant d06 = Instant.parse("2023-10-01T11:37:26Z");
        Instant d07 = Instant.parse("2023-10-01T11:37:26-03:00");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate d08 = LocalDate.parse("20/07/2023", formatter);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2023 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        LocalDate d10 = LocalDate.of(2023, 10, 15);
        LocalDateTime d11 = LocalDateTime.of(2023, 11, 11, 7, 23);

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);
    }
}
