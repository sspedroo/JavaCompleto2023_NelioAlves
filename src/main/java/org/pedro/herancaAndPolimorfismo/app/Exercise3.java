package org.pedro.herancaAndPolimorfismo.app;

import org.pedro.herancaAndPolimorfismo.entities.exercise3.Circle;
import org.pedro.herancaAndPolimorfismo.entities.exercise3.Rectangle;
import org.pedro.herancaAndPolimorfismo.entities.exercise3.Shape;
import org.pedro.herancaAndPolimorfismo.entities.exercise3.enums.Color;

import java.util.*;

public class Exercise3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Shape> list = new LinkedList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or cicle (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            if (ch == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(color, width, height));
            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for (Shape shape : list){
            System.out.println(shape.area());
        }

        sc.close();
    }
}
