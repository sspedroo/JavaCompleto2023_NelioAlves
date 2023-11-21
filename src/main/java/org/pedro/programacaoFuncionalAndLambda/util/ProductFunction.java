package org.pedro.programacaoFuncionalAndLambda.util;

import org.pedro.herancaAndPolimorfismo.entities.exercise2.Product;

import java.util.function.Function;

public class ProductFunction implements Function<Product, String> {
    @Override
    public String apply(Product product) {
        return product.getName().toUpperCase();
    }
}
