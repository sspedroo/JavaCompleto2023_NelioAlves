package org.pedro.interfaces.services;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.pedro.interfaces.entities.CarRental;
import org.pedro.interfaces.entities.Invoice;

import java.time.Duration;

@Data
@AllArgsConstructor
public class RentalService {

    private Double pricePerHour;
    private Double pricePerDay;

    private TaxService taxService;

    public void processInvoice(CarRental carRental){
        long minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60.0;

        double basicPayment;

        if (hours <= 12.0){
            basicPayment = pricePerHour * Math.ceil(hours);
        } else {
            basicPayment = pricePerDay * Math.ceil(hours / 24);
        }

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
