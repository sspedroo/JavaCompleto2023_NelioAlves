package org.pedro.herancaAndPolimorfismo.entities.exercise;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
    private String name;
    private Integer hours;
    private Double valuePerHour;

    public double payment(){
       return valuePerHour * hours;
    }
}
