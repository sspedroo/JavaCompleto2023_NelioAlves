package org.pedro.enums.entities;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class HourContract {
    private LocalDate date;
    private Double valuePerHour;
    private Integer hours;

    public double totalValue(){
        return valuePerHour * hours;
    }
}
