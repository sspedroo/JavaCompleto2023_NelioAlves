package org.pedro.programacaoFuncionalAndLambda.util;

import org.pedro.herancaAndPolimorfismo.entities.exercise2.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product product) {
        return product.getPrice() >= 100.0;
    }
}
