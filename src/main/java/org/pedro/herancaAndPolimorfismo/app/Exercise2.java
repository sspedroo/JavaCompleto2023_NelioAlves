package org.pedro.herancaAndPolimorfismo.app;

import org.pedro.herancaAndPolimorfismo.entities.exercise2.ImportedProduct;
import org.pedro.herancaAndPolimorfismo.entities.exercise2.Product;
import org.pedro.herancaAndPolimorfismo.entities.exercise2.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> productList = new LinkedList<>();

        int numberProducts;
        System.out.print("Enter the number of products: ");
        numberProducts = sc.nextInt();

        for (int i = 1; i <= numberProducts; i++){
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            String definition = sc.next();
            if (definition.equals("c")){
                Product product = new Product();
                System.out.print("Name: ");
                product.setName(sc.next());
                System.out.print("Price: ");
                product.setPrice(sc.nextDouble());
                productList.add(product);
            } else if (definition.equals("u")) {
                UsedProduct usedProduct = new UsedProduct();
                System.out.print("Name: ");
                usedProduct.setName(sc.next());
                System.out.print("Price: ");
                usedProduct.setPrice(sc.nextDouble());
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                usedProduct.setManufactureDate
                        (LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                productList.add(usedProduct);
            } else {
                ImportedProduct product = new ImportedProduct();
                System.out.print("Name: ");
                product.setName(sc.next());
                System.out.print("Price: ");
                product.setPrice(sc.nextDouble());
                System.out.print("Customs fee: ");
                product.setCustomsFee(sc.nextDouble());
                productList.add(product);
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product p : productList){
            System.out.println(p.priceTag());
        }

    }
}
