package org.pedro.interfaces;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.pedro.herancaAndPolimorfismo.entities.exercise3.enums.Color;
import org.pedro.interfaces.AbstractShape;


public class Circle extends AbstractShape {

    private Double radius;

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return 0;
    }
}
