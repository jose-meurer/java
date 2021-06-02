package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program_2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos produtos serao? ");
        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Nome do produto: ");
            sc.nextLine();
            String name = sc.nextLine().toUpperCase();
            System.out.print("Valor: ");
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
            System.out.println("Produto cadastrado: " + vect[i]);
        }

        double soma = 0.0;
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getPrice();
        }
        double avg = soma / vect.length;

        System.out.printf("AVERAGE PRICE = %.2f%n", avg);

        sc.close();
    }
}
