package org.pedro.interfaces;

import lombok.Data;
import org.pedro.herancaAndPolimorfismo.entities.exercise3.enums.Color;

@Data
public abstract class AbstractShape implements Shape{
    private Color color;

    public AbstractShape(Color color) {
        this.color = color;
    }
}
