package org.pedro.herancaAndPolimorfismo.entities.exercise2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    protected String name;
    protected Double price;

    public String priceTag(){
        return name + " $ " + price;
    }
}
