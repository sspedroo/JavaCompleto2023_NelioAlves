package org.pedro.interfaces.exercicioFixacao.entities;

import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Contract {
    private Integer number;
    private LocalDate date;
    private Double totalValue;

    @Setter(AccessLevel.NONE)
    private List<Installment> installments = new ArrayList<>();

    public Contract(Integer number, LocalDate date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }
}
