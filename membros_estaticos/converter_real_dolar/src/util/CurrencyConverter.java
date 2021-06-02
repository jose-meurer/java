package util;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double result(double dolar, double quantity) {
        return dolar * quantity * (1.0 + IOF);
    }
}
