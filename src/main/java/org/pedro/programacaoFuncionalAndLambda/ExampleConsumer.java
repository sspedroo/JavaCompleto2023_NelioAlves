package org.pedro.programacaoFuncionalAndLambda;

import org.pedro.herancaAndPolimorfismo.entities.exercise2.Product;
import org.pedro.programacaoFuncionalAndLambda.util.ProductConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class ExampleConsumer {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));


        //Versão =  Implementação da interface
        list.forEach(new ProductConsumer());
        list.forEach(System.out::println);

        //Versão =  reference method com metodo estático
        list.forEach(Product::staticPriceUpdateConsumer);
        list.forEach(System.out::println);

        //Versão = reference method com método não estático
        list.forEach(Product::nonstaticPriceUpdateConsumer);
        list.forEach(System.out::println);

        //Versão = expressão lambda declarada
        Consumer<Product> consumer = p -> {p.setPrice(p.getPrice() * 1.10);};
        list.forEach(consumer);
        list.forEach(System.out::println);

        //Versão  = expressão lambda inline
        list.forEach(p -> p.setPrice(p.getPrice() * 1.10));
        list.forEach(System.out::println);


    }
}
