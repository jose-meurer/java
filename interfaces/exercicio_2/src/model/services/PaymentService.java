package model.services;

public interface PaymentService {

    Double paymentFee(double amount);

    Double interest(double amount, int months);
}
