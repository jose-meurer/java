package application;

import model.entities.Account;
import model.exceptions.DomainExcpetion;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data: ");
            System.out.print("Number: ");
            Integer numberAccount = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holderAccount = sc.nextLine().toUpperCase();
            System.out.print("Initial balance: ");
            Double initialBalance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            Double withdrawLimit = sc.nextDouble();

            Account acc = new Account(numberAccount, holderAccount, withdrawLimit);
            acc.deposit(initialBalance);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            acc.withdraw(sc.nextDouble());
            System.out.println("New balance: " + String.format("%.2f", acc.getBalance()));

        } catch (DomainExcpetion e) {
            System.out.println("Withdraw error: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Incorrect data, try again");
        }

        System.out.println("Finished Program");

        sc.close();
    }
}
