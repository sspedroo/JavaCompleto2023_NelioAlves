package org.pedro.interfaces.exercicioFixacao.application;

import org.pedro.interfaces.exercicioFixacao.entities.Contract;
import org.pedro.interfaces.exercicioFixacao.entities.Installment;
import org.pedro.interfaces.exercicioFixacao.services.ContractService;
import org.pedro.interfaces.exercicioFixacao.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do contrato");
        System.out.print("Número: ");
        Integer number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.print("Valor do contrato: ");
        Double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, date, totalValue);


        System.out.print("Entre com o número de parcelas: ");
        Integer months = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, months);

        System.out.println();
        System.out.println("Parcelas: ");
        for (Installment installment : contract.getInstallments()){
            System.out.println(installment.getDueDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                    + " - R$ " + installment.getAmount());
        }

        sc.close();
    }
}
