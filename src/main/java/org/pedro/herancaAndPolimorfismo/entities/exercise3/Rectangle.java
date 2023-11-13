package org.pedro.herancaAndPolimorfismo.entities.exercise3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.pedro.herancaAndPolimorfismo.entities.exercise3.enums.Color;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Rectangle extends Shape{
    private Double width;
    private Double height;

    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return height * width;
    }
}
