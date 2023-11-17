package org.pedro.interfaces.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CarRental {
    private LocalDateTime start;
    private LocalDateTime finish;

    private Vehicle vehicle;
    private Invoice invoice;

    public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle){
        this.start = start;
        this.finish = finish;
        this.vehicle = vehicle;
    }


}
