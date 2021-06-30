package application;

import services.BrazilInterestService;
import services.InterestService;
import services.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();
        System.out.print("Country (Brazil, Usa): ");
        sc.nextLine();
        String country = sc.next().toLowerCase();

        double totalValue = 0.0;
        if (country.equals("brazil")) {
             InterestService is = new BrazilInterestService(2.0);
             totalValue = is.payment(amount, months);
        }
        else if (country.equals("usa")) {
             InterestService is = new UsaInterestService(1.0);
             totalValue = is.payment(amount, months);
        }
        else {
            System.out.println("Invalid country");
            System.exit(0);
        }

        System.out.println("Payment after " + months + " months: ");
        System.out.println(String.format("%.2f", totalValue));

        sc.close();
    }
}
