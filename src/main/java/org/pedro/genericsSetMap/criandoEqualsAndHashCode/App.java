package org.pedro.genericsSetMap.criandoEqualsAndHashCode;

public class App {
    public static void main(String[] args) {
        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria2@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));

        System.out.println(c1 == c2); //Compara a referencia de memória do objeto
        String s1 = "oi";
        String s2 = "oi";
        System.out.println(s1 == s2);
    }
}
