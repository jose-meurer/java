package com.cerb;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /** Exercicio 10 pdf **/
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int quadrado = i * i;
            int cubo = i * quadrado;

            System.out.print(i + " ");
            System.out.print(quadrado + " ");
            System.out.println(cubo);
        }

        sc.close();

        /** Exercicio 9 pdf **/
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Numero: ");
//        int n = sc.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//
//            if (n % i == 0) {
//                System.out.println(i);
//            }
//        }
//
//        sc.close();

        /** Exercicio 8 pdf outra forma **/
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Valor: ");
//        int n = sc.nextInt();
//
//        int fatorial = 1;
//        for (int i = 1; i <= n; i++ ){
//            fatorial *= i;
//        }
//        System.out.println(fatorial);
//
//        sc.close();

        /** Exercicio 8 pdf **/
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Valor: ");
//        int n = sc.nextInt();
//
//        int resultado = n;
//        for (int i = 1; i < n; i++) {
//            resultado *= (n - i);
//        }
//        if (resultado != 0) {
//            System.out.println(resultado);
//        } else {
//            System.out.println("1");
//        }
//        sc.close();

        /** Exercicio 7 pdf **/
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Digite o valor: ");
//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; i++) {
//
//            System.out.print("Digite os 2 valores: ");
//            double x = sc.nextDouble();
//            double y = sc.nextDouble();
//
//            if (y != 0) {
//                x /= y;
//                System.out.printf("%.1f%n", x);
//            } else {
//                System.out.println("Divisao impossivel");
//            }
//        }
//
//        sc.close();

        /** Exercicio 6 pdf **/
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Digite o numero de casos que sera lido: ");
//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; i++) {
//
//            System.out.print("Digite os valores: ");
//            double peso2 = sc.nextDouble();
//            double peso3 = sc.nextDouble();
//            double peso5 = sc.nextDouble();
//
//            double media = (peso2 * 2.0 + peso3 * 3.0 + peso5 * 5.0) / 10;
//            System.out.printf("Resultado media: %.1f%n", media);
//        }
//
//        sc.close();

        /** Exercicio 5 pdf **/
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Digite quantos valores serao lidos: ");
//        int n = sc.nextInt();
//
//        int in = 0;
//        int out = 0;
//        for (int i = 0; i < n; i++) {
//            System.out.print("Valor: ");
//            int x = sc.nextInt();
//            if (x >= 10 && x <= 20) {
//                in++;
//            } else {
//                out++;
//            }
//        }
//        System.out.println(in + " in");
//        System.out.println(out + " out");
//
//
//        sc.close();

        /** Exercicio 4 pdf **/
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Digite os valores: ");
//        int x = sc.nextInt();
//
//        for (int i = 1; i <= x; i++) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }
//
//        sc.close();

        /** Exercicio 3 pdf **/
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        int alcool = 0;
//        int gasolina = 0;
//        int diesel = 0;
//
//        System.out.print("Qual combustivel abastecido?( 1.Álcool 2.Gasolina 3.Diesel 4.Fim) ");
//        int combustivel = sc.nextInt();
//
//        while (combustivel != 4) {
//            if (combustivel == 1) {
//                alcool++;
//                System.out.print("Proximo: ");
//            }
//            else if (combustivel == 2) {
//                gasolina++;
//                System.out.print("Proximo: ");
//            }
//            else if (combustivel == 3) {
//                System.out.print("Proximo: ");
//                diesel++;
//            }
//            else {
//                System.out.print("Numero invalido, digite novamente: ");
//            }
//            combustivel = sc.nextInt();
//        }
//
//        System.out.printf("MUITO OBRIGADO%nAlcool: %d%nGasolina: %d%nDiesel: %d%n ", alcool, gasolina, diesel);
//
//        sc.close();

        /** Exercicio 2 pdf **/
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Digite as coordenadas(X,Y): ");
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//
//        while (x != 0 && y != 0) {
//            if (x > 0 && y > 0) {
//                System.out.println("Primeiro");
//            } else if (x < 0 && y > 0) {
//                System.out.println("Segundo");
//            } else if (x < 0 && y < 0) {
//                System.out.println("Terceiro");
//            } else {
//                System.out.println("Quarto");
//            }
//
//            System.out.println("Digite novas coordenadas: ");
//             x = sc.nextInt();
//             y = sc.nextInt();
//        }
//
//        sc.close();

        /** Exercicio 1 pdf **/
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Digite a senha: ");
//        int senha = sc.nextInt();
//
//        while (senha != 2002) {
//            System.out.println("Senha Invalida");
//            System.out.print("Digite a senha novamente: ");
//            senha = sc.nextInt();
//        }
//        System.out.println("Acesso Permitido");
//
//        sc.close();
    }
}
