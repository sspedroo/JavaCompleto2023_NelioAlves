package org.pedro.programacaoFuncionalAndLambda;

import org.pedro.herancaAndPolimorfismo.entities.exercise2.Product;
import org.pedro.programacaoFuncionalAndLambda.services.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ExampleFunctionThatReceiveFunction {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        ProductService ps = new ProductService();

        double sum = ps.filteredSim(list, p -> p.getName().startsWith("M"));
        System.out.println("Sum: " + sum);
    }
}
