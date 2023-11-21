package org.pedro.programacaoFuncionalAndLambda;

import org.pedro.herancaAndPolimorfismo.entities.exercise2.Product;
import org.pedro.programacaoFuncionalAndLambda.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ExemplePredicate {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.0));
        list.add(new Product("HD Case", 80.90));

        //Versão - Implementação da interface
        list.removeIf(new ProductPredicate());

        //Versão - reference method  static
        //Coloco o nome da classe onde o método está, depois dois pontos "::" e o nome do método
        list.removeIf(Product::staticProductPredicate);

        //Versão - reference method non static
        list.removeIf(Product::nonStaticProductPredicate);


        Predicate<Product> pred = (p -> p.getPrice() >= 100);
        //Expressão lambda declarada
        list.removeIf(pred);

        //Expressão lambda inline
        list.removeIf(p -> p.getPrice() >= 100);





        for (Product p : list){
            System.out.println(p);
        }
    }
}
