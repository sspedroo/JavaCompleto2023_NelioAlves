package org.pedro.herancaAndPolimorfismo.entities.exercise2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ImportedProduct extends Product{
    private Double customsFee;

    @Override
    public String priceTag() {
        return name + " $ " + totalPrice() + " (Customs fee: $ " + customsFee + ")";
    }

    public Double totalPrice(){
        return price + customsFee;
    }
}
