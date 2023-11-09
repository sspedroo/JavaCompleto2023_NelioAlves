package org.pedro.dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConverterGlobalParaLocal {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now().plusDays(2);
        Instant d03 = Instant.now();

        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());

        System.out.println("r1 = " + r1);

        System.out.println("-".repeat(50));

        int n = 1;
        for (String s : ZoneId.getAvailableZoneIds()){
            System.out.println(n+ ": " + s);
            n++;
        }
    }
}
