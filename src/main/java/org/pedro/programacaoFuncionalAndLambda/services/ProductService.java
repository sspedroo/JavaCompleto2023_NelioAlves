package org.pedro.programacaoFuncionalAndLambda.services;

import org.pedro.herancaAndPolimorfismo.entities.exercise2.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {
    public double filteredSim(List<Product> list, Predicate<Product> criterio) {
        double sum = 0.0;
        for (Product p : list){
            if (criterio.test(p)) {
                sum += p.getPrice();
            }
        }
        return sum;
    }
}
