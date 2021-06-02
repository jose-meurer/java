package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account = new Account();

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String accountHolder = sc.nextLine().toUpperCase();

        System.out.print("Is there an initial deposit (y/n)? ");
        char resp = sc.next().charAt(0);

        do {
            if (resp == 'y' || resp == 'Y') {
                System.out.print("Enter initial deposit value: ");
                double initialDeposit = sc.nextDouble();
                account = new Account(accountNumber, accountHolder, initialDeposit);
            } else if (resp == 'n' || resp == 'N') {
                account = new Account(accountNumber, accountHolder);
            } else {
                System.out.println("Invalid response");
                System.out.print("Is there an initial deposit (y/n)? ");
                resp = sc.next().charAt(0);
            }
        } while (resp != 'y' && resp != 'Y' && resp != 'n' && resp != 'N');

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(account);

        sc.close();
    }
}
