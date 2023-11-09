package org.pedro.dataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosComDataHora {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.now().minusDays(3);
        LocalDate d01pastWeek = d01.minusWeeks(1);
        LocalDate d01nextWeek = d01.plusWeeks(1);

        LocalDateTime d02 = LocalDateTime.now().plusDays(1);
        LocalDateTime d02PastWeek = d02.minusWeeks(1);
        LocalDateTime d02Nextweek = d02.plusDays(7);

        Instant d03 = Instant.now();
        Instant d03PastWeek = d03.minus(7, ChronoUnit.DAYS); //Aqui eu estou escolhendo primeiro o valor que vou diminuir (7) e dps oq eu vou
        //diminuir (DAYS), assim é uma maneira de se lidar com o Instant
        Instant d03NextWeek = d03.plus(7, ChronoUnit.DAYS);

        System.out.println("d01 = " + d01);
        System.out.println("d01pastWeek = " + d01pastWeek);
        System.out.println("d01nextWeek = " + d01nextWeek);

        System.out.println("d03PastWeek = " + d03PastWeek);
        System.out.println("d03NextWeek = " + d03NextWeek);

        Duration t1 = Duration.between(d02PastWeek, d02);
        System.out.println("Duração: " + t1.toDays() + " dias");

        Duration t2 = Duration.between(d01pastWeek.atStartOfDay(), d01nextWeek.atStartOfDay());
        System.out.println("Duração: " + t2.toDays());
    }
}
