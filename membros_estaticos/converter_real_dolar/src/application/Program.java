package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What os the dollar price? ");
        double priceDolar = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double quantityDolar = sc.nextDouble();

        double priceTotal = CurrencyConverter.result(priceDolar, quantityDolar);

        System.out.printf("Amount to be paid in reais = %.2f%n", priceTotal);

        sc.close();
    }
}
