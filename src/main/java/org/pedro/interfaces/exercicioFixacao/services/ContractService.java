package org.pedro.interfaces.exercicioFixacao.services;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.pedro.interfaces.exercicioFixacao.entities.Contract;
import org.pedro.interfaces.exercicioFixacao.entities.Installment;

import java.util.List;

@AllArgsConstructor
@Data
public class ContractService {

    private OnlinePaymentService paymentService;

    public void processContract(Contract contract, Integer months){
        List<Installment> installments = contract.getInstallments();
        double installmentBeforeInterest = contract.getTotalValue() / months;

        for (int i = 0; i < months; i++){
            Double interest = paymentService.interest(installmentBeforeInterest, i + 1);
            Double paymentFee = paymentService.paymentFee(interest + installmentBeforeInterest);

            Double totalWithInterestAndPaymentFee = installmentBeforeInterest + (interest + paymentFee);


            Installment installment = new Installment(contract.getDate().plusMonths(i + 1), totalWithInterestAndPaymentFee);
            installments.add(installment);
        }
    }
}
