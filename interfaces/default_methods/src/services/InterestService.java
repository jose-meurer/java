package services;

public interface InterestService {

    double getInterest();

    default double payment(double amount, int months) {
        if (months < 1 || amount <= 0) {
            throw new RuntimeException("Error: invalid data.");
        }
        return amount * Math.pow(1.0 + getInterest() / 100, months);
    }
}
