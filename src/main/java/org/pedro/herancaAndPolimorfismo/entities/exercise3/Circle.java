package org.pedro.herancaAndPolimorfismo.entities.exercise3;

import lombok.*;
import org.pedro.herancaAndPolimorfismo.entities.exercise3.enums.Color;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Circle extends Shape{
    private Double radius;

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
