package org.pedro.herancaAndPolimorfismo.entities.exercise;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OutsourcedEmployee extends Employee {
    private Double additionalCharge;
    @Override
    public double payment() {
        return super.payment() + (additionalCharge * 1.10);
    }
}
