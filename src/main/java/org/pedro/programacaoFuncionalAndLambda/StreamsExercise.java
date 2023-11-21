package org.pedro.programacaoFuncionalAndLambda;

import org.pedro.herancaAndPolimorfismo.entities.exercise2.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class StreamsExercise {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            List<Product> list = new ArrayList<>();
            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

           double average =  list.stream()
                    .map(Product::getPrice)
                    .reduce(0.0, (x,y) -> x + y / list.size());
            System.out.println("Average price: " + average);

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names = list.stream()
                    .filter(p -> p.getPrice() < average)
                    .map(Product::getName)
                    .sorted(comp.reversed())
                    .toList();
            names.forEach(System.out::println);

        } catch (IOException e){
        System.out.println("Error: " + e.getMessage());
        }
    }
}
