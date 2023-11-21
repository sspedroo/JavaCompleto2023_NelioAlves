package org.pedro.programacaoFuncionalAndLambda;

import org.pedro.herancaAndPolimorfismo.entities.exercise2.Product;
import org.pedro.programacaoFuncionalAndLambda.util.ProductFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

public class ExampleFunction {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));


        //Versão = implementação da interface
        List<String> upperCaseNames = list.stream().map(new ProductFunction()).toList();
        upperCaseNames.forEach(System.out::println);
        System.out.println("-".repeat(30));

        //Versão = Reference method com método estático
        List<String> list1 = list.stream().map(Product::staticUpperCaseNameFunction).toList();
        list1.forEach(System.out::println);
        System.out.println("-".repeat(30));

        //Versão  = Reference method com método não estatico
        List<String> list2 = list.stream().map(Product::nonstaticUpperCaseNameFunction).toList();
        list2.forEach(System.out::println);
        System.out.println("-".repeat(30));

        //Versão  = Expressão lambda declarada
        Function<Product, String> function = p -> p.getName().toUpperCase();
        List<String> list3 = list.stream().map(function).toList();
        list3.forEach(System.out::println);
        System.out.println("-".repeat(30));

        //Versão  = Expressão lambda inline
        List<String> list4 = list.stream().map(p -> p.getName().toUpperCase()).toList();
        list4.forEach(System.out::println);
        System.out.println("-".repeat(30));



    }
}
