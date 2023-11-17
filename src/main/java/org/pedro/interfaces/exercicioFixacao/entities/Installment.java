package org.pedro.interfaces.exercicioFixacao.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Installment {
    //parcela
    private LocalDate dueDate;
    private Double amount;
}
