import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /**Exercicio 8 pdf**/
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu salario: ");
        double salario = sc.nextDouble();

        double imposto;
        if (salario <= 2000.00) {
            System.out.println("Isento");

        } else if (salario > 2000.01 && salario <= 3000.00) {
            salario -= 2000.00;
            imposto = salario * 0.08;
            System.out.printf("Total a pagar: R$ %.2f%n", imposto);

        } else if (salario > 3000.01 && salario <= 4500.00) {
            salario -= 3000.00;
            imposto = salario * 0.18 + 1000 * 0.08;
            System.out.printf("Total a pagar: R$ %.2f%n", imposto);

        } else {
            salario -= 4500;
            imposto = salario * 0.28 + 1000 * 0.08 + 1500 * 0.18;
            System.out.printf("Total a pagar: R$ %.2f%n", imposto);

        }

        sc.close();

        /**Exercicio 7 pdf**/
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Digite o valor x: ");
//        double x = sc.nextDouble();
//        System.out.println("Digite o valor y: ");
//        double y = sc.nextDouble();
//
//        if (y == 0 && x == 0) {
//            System.out.println("Origem");
//        } else if (y == 0) {
//            System.out.println("Eixo X");
//        } else if (x == 0) {
//            System.out.println("Eixo Y");
//        } else if (y > 0 && x > 0) {
//            System.out.println("Q1");
//        } else if (y > 0 && x < 0) {
//            System.out.println("Q2");
//        } else if (y < 0 && x < 0) {
//            System.out.println("Q3");
//        } else if (y < 0 && x > 0) {
//            System.out.println("Q4");
//        }
//
//        sc.close();

        /**Exercicio 6 pdf**/
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Digite o valor: ");
//        double numero = sc.nextDouble();
//
//        if (numero >= 0 && numero <= 100) {
//            if (numero <= 25) {
//                System.out.println("Intervalo (0,25)");
//            } else if (numero <= 50) {
//                System.out.printf("Intervalo (25,50)");
//            } else if (numero <= 75) {
//                System.out.println("Intervalo (50,75)");
//            } else {
//                System.out.println("Intervalo (75,100)");
//            }
//        }else{
//            System.out.println("Fora de intervalo");
//        }
//
//        sc.close();

        /**Exercicio 5 pdf**/
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Digite o codigo do item: ");
//        int codigo = sc.nextInt();
//
//        System.out.print("Digite a quantidade: ");
//        double quantidade = sc.nextDouble();
//
//        if (codigo == 1) {
//            quantidade = quantidade * 4.00;
//
//        } else if (codigo == 2) {
//            quantidade = quantidade * 4.50;
//
//        } else if (codigo == 3) {
//            quantidade = quantidade * 5.00;
//
//        } else if (codigo == 4) {
//            quantidade = quantidade * 2.00;
//
//        } else if (codigo == 5) {
//            quantidade = quantidade * 1.50;
//
//        }
//        System.out.printf("Total: R$%.2f%n", quantidade);
//
//        sc.close();

        /**Exercicio 4 pdf**/
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Digite o primeiro valor: ");
//        int horaInicial = sc.nextInt();
//
//        System.out.print("Digite o segundo valor: ");
//        int horaFim = sc.nextInt();
//
//        int duracao;
//
//        if (horaInicial < horaFim) {
//            duracao = horaFim - horaInicial;
//        } else {
//            duracao = 24 - horaInicial + horaFim;
//        }
//
//        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
//
//        sc.close();

        /**Exercicio 3 pdf**/
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Digite o primeiro valor: ");
//        int n1 = sc.nextInt();
//
//        System.out.print("Digite o segundo valor: ");
//        int n2 = sc.nextInt();
//
//        if (n1 % n2 == 0 || n2 % n1 == 0) {
//            System.out.println("Sao Multiplos");
//        } else {
//            System.out.println("Nao sao Multiplos");
//        }
//
//        sc.close();

        /**Exercicio 2 pdf**/
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Digite o valor: ");
//        int n = sc.nextInt();
//
//        if (n % 2 == 0) {
//            System.out.println("PAR");
//        } else {
//            System.out.println("IMPAR");
//        }
//
//        sc.close();

        /**Exercicio 1 pdf**/
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Digite o valor: ");
//        int n = sc.nextInt();
//
//        if (n >= 0) {
//            System.out.println("NAO NEGATIVO");
//        } else {
//            System.out.println("NEGATIVO");
//        }
//
//        sc.close();

        /** Exercicio 3 youtube **/
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Digite o primeiro valor: ");
//        int n1 = sc.nextInt();
//
//        System.out.print("Digite o segundo valor: ");
//        int n2 = sc.nextInt();
//
//        System.out.print("Digite o terceiro valor: ");
//        int n3 = sc.nextInt();
//
//        if (n1 < n2 && n1 < n3) {
//            System.out.println("Menor = " + n1);
//        } else if (n2 < n3) {
//            System.out.println("Menor = " + n2);
//        } else {
//            System.out.println("Menor = " + n3);
//        }
//
//        sc.close();

        /** Exercicio 2 youtube **/
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Digite o primeiro valor: ");
//        double a = sc.nextDouble();
//
//        System.out.print("Digite o segundo valor: ");
//        double b = sc.nextDouble();
//
//        System.out.print("Digite o terceiro valor: ");
//        double c = sc.nextDouble();
//
//        double delta = b * b - 4 * a * c;
//
//        if (a != 0 && delta >= 0.0) {
//            double r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
//            double r2 = (-b - Math.sqrt(delta)) / (2.0 * a);
//
//            System.out.printf(" R1 = %.5f%n R2 = %.5f%n", r1, r2);
//        } else {
//            System.out.println("Impossivel calcular");
//        }
//        sc.close();


        /** Exercicio 1 youtube **/
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Digite a primeira nota do aluno: ");
//        double nota1 = sc.nextDouble();
//
//        System.out.print("Digite a segunda nota do aluno: ");
//        double nota2 = sc.nextDouble();
//
//        double resultado = nota1 + nota2;
//
//        if (resultado >= 60.0) {
//            System.out.println("Resultado: " + resultado + "\n" + "Aprovado");
//        } else {
//            System.out.println("Resultado: " + resultado + "\n" + "Reprovado");
//        }
//
//
//        sc.close();
    }
}
