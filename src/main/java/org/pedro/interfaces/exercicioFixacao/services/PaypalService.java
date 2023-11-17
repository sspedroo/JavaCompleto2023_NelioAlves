package org.pedro.interfaces.exercicioFixacao.services;

public class PaypalService implements OnlinePaymentService{

    //paymentFee = taxa de pagamento
    @Override
    public Double paymentFee(Double amount) {
        return  amount * 0.02;
    }


    //interest = juros
    @Override
    public Double interest(Double amount, Integer months) {
        return amount + ((amount * 0.01) * months);
    }
}
