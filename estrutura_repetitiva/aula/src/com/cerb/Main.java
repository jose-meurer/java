package com.cerb;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /** aula 55 **/
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resposta;
        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = sc.nextDouble();
            double formula = celsius * 9.0 / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", formula);
            System.out.print("Deseja repetir: ");
            resposta = sc.next().charAt(0);
        } while (resposta != 'n');

        sc.close();


        /** Exemplo aula 4 **/
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Digite os valores: ");
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//
//        int soma = 0;
//        for (int i = Math.min(x, y) + 1; i < Math.max(x, y); i++) {
//            if (i % 2 != 0) {
//                soma += i;
//            }
//        }
//
//        System.out.println(soma);
//
//        sc.close();

        /** Exemplo aula 3 **/
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Digite o valor: ");
//        int n = sc.nextInt();
//
//        int resultado = 0;
//        for (int i = 1; i <= 10; i++) {
//            resultado = i * n;
//            System.out.println(i + " x " + n + " = " + resultado);
//        }
//
//        sc.close();


        /** Exemplo aula 2 **/
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Digite a idade: ");
//        int idade = sc.nextInt();
//
//        if (idade >= 0) {
//            int idadeTotal = 0;
//            int quantidade = 0;
//
//            while (idade >= 0) {
//                idadeTotal += idade;
//                quantidade++;
//
//                System.out.print("Digite a idade: ");
//                idade = sc.nextInt();
//            }
//            double idadeMedia = (double) idadeTotal / quantidade;
//            System.out.printf("Idade Media: %.2f%n", idadeMedia);
//        } else {
//            System.out.println("Impossivel calcular");
//        }
//
//        sc.close();

        /** Exemplo aula 1 **/
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Digite x: ");
//        int x = sc.nextInt();
//
//        System.out.print("Digite y: ");
//        int y = sc.nextInt();
//
//        while (x != y) {
//
//            if (x > y) {
//                System.out.println("Decrescente");
//            } else {
//                System.out.println("Crescente");
//            }
//            System.out.print("Digite x: ");
//            x = sc.nextInt();
//
//            System.out.print("Digite y: ");
//            y = sc.nextInt();
//        }
//        System.out.println("Programa encerrado...");
//
//        sc.close();


//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        int x = sc.nextInt();
//        int soma = 0;
//
//        while (x != 0) {
//            soma += x;
//            x = sc.nextInt();
//        }
//
//        System.out.println("Soma: " + soma);
//
//        sc.close();
    }
}
