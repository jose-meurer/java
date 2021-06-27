package model.services;

public class Paypal implements PaymentService{

    private static final double MONTHLY_INTEREST = 0.01;
    private static final double FEE_PERCENTAGE = 0.02;

    @Override
    public Double paymentFee(double amount) {
        return amount * FEE_PERCENTAGE;
    }

    @Override
    public Double interest(double amount, int months) {
        return amount * MONTHLY_INTEREST * months;
    }
}
