package org.pedro.programacaoFuncionalAndLambda.util;

import org.pedro.herancaAndPolimorfismo.entities.exercise2.Product;

import java.util.function.Consumer;

public class ProductConsumer implements Consumer<Product> {
    @Override
    public void accept(Product product) {
        product.setPrice(product.getPrice() * 1.10);
    }
}
