package org.pedro.herancaAndPolimorfismo.entities.exercise2;

import lombok.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsedProduct extends Product{

    private LocalDate manufactureDate;

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return name + " (used) $" + price +
                " (Manufacture date: " + manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ")";
    }
}
