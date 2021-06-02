package application;

import entitites.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroQuartos = 10;
        Rent[] rent = new Rent[numeroQuartos];

        System.out.print("Quantos quartos serao alugados? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine().toUpperCase();
            System.out.print("Email: ");
            String email = sc.nextLine().toLowerCase();
            System.out.print("Room: ");
            int nRoom = sc.nextInt();

            while (nRoom < 0 || nRoom > (rent.length - 1)) {
                System.out.print("Quarto invalido, escolha de 0 á " + (rent.length - 1) + ": ");
                nRoom = sc.nextInt();
            }

            if (rent[nRoom] != null) {
                while (rent[nRoom] != null) {
                    System.out.println();
                    System.out.println("Quarto alugado, favor escolher outro: ");

                    System.out.print("Quartos disponiveis: ");
                    for (int x = 0; x < rent.length; x++) {
                        if (rent[x] == null) {
                            System.out.print(" - " + x);
                        }
                    }

                    System.out.println();
                    System.out.print("Room: ");
                    nRoom = sc.nextInt();

                    while (nRoom < 0 || nRoom > rent.length) {
                        System.out.print("Quarto invalido, escolha de 0 á " + rent.length + ": ");
                        nRoom = sc.nextInt();

                    }
                }
            }
            rent[nRoom] = new Rent(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms:");
        for (int i = 0; i < rent.length; i++) {
            if (rent[i] != null) {
                System.out.println(i + ": " + rent[i].getName() + ", " + rent[i].getEmail());
            }
        }

        sc.close();
    }
}
