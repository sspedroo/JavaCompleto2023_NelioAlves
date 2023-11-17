package org.pedro.interfaces.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Invoice {
    private Double basicPayment;
    private Double tax;

    public Double getTotalPayment(){
        return getBasicPayment() + getTax();
    }
}
