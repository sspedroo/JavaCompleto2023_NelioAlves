package org.pedro.excecoes.entities;

import lombok.*;
import org.pedro.excecoes.exceptions.DomainException;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

@Setter
@Getter
@NoArgsConstructor
public class Reservation {
    private Integer roomNumber;
    @Setter(AccessLevel.NONE)
    private LocalDate checkIn;
    @Setter(AccessLevel.NONE)
    private LocalDate checkOut;

    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) throws DomainException {
        if (!checkOut.isAfter(checkIn)){
            throw new DomainException("Check-out date must be after check-in date");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public long duration(){
        return Duration.between(checkIn.atStartOfDay(), checkOut.atStartOfDay()).toDays();
        //duration between usa um instant entao quando se usa LocalDate, precisamos adaptar
    }

    public void updateDates(LocalDate checkIn, LocalDate checkOut) throws DomainException{
        LocalDate now = LocalDate.now();
        if (checkIn.isBefore(now) || checkOut.isBefore(now)){
            throw new DomainException("Reservation dates for update must be future dates");
        }
        if (!checkOut.isAfter(checkIn)){
            throw new DomainException("Check-out date must be after check-in date");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Room " + roomNumber +
                ", check-in: " + checkIn.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                ", check-out " + checkOut.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                ", " +
                duration() +
                " nights";
    }
}
