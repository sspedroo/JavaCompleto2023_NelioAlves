package org.pedro.interfaces.application;

import org.pedro.interfaces.entities.CarRental;
import org.pedro.interfaces.entities.Vehicle;
import org.pedro.interfaces.services.BrazilTaxService;
import org.pedro.interfaces.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        CarRental cr = CarRental.builder()
                        .start(start)
                        .finish(finish)
                        .vehicle(new Vehicle(carModel))
                        .build();

        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
        //BrazilTaxService da certo pq é um upcasting de TaxService

        rentalService.processInvoice(cr);

        System.out.println("FATURA: ");
        System.out.println("Pagamento básico: " + cr.getInvoice().getBasicPayment());
        System.out.println("Imposto: " + cr.getInvoice().getTax());
        System.out.println("Valor total: " + cr.getInvoice().getTotalPayment());

        sc.close();
    }
}
