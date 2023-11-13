package org.pedro.herancaAndPolimorfismo.entities.exercise3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.pedro.herancaAndPolimorfismo.entities.exercise3.enums.Color;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Shape {
    private Color color;

    public abstract double area();
}
