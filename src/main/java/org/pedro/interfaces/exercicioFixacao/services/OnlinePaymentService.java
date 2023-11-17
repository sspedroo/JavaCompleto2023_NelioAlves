package org.pedro.interfaces.exercicioFixacao.services;

public interface OnlinePaymentService {
    Double paymentFee(Double amount);

    Double interest(Double amount, Integer months);
}
