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

    public static boolean staticProductPredicate(Product p){
        return p.getPrice() >= 100.0;
    }
    //Metodo estatico trabalha como produto que vc passar como argumento


    public boolean nonStaticProductPredicate(){
        return price >= 100.0;
    }
    //Metodo não estatico trabalha com o proprio objeto instancia

    public static void staticPriceUpdateConsumer(Product p){
        p.setPrice(p.getPrice() * 1.10);
    }

    public void nonstaticPriceUpdateConsumer(){
        price = price * 1.10;
    }

    public static String staticUpperCaseNameFunction(Product p ){
        return p.getName().toUpperCase();
    }

    public String nonstaticUpperCaseNameFunction(){
        return name.toUpperCase();
    }

}
