import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /** Exercicio 6 Estrutura Sequencial **/
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;

        System.out.print("Digite os tres valores: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double triangulo = a * c / 2;
        double circulo = pi * c * c;
        double trapezio = (a + b) * c / 2;
        double quadrado = b * b;
        double retangulo = a * b;


        System.out.printf("Triangulo: %.3f%n", triangulo);
        System.out.printf("Circulo: %.3f%n", circulo);
        System.out.printf("Trapezio: %.3f%n", trapezio);
        System.out.printf("Quadrado: %.3f%n", quadrado);
        System.out.printf("Retangulo: %.3f%n", retangulo);

        sc.close();


        /** Exercicio 5 Estrutura Sequencial **/
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Digite os valores da peça 1: ");
//        int codigo1 = sc.nextInt();
//        int numeroPecas1 = sc.nextInt();
//        double valorPeca1 = sc.nextDouble();
//
//        System.out.print("Digite os valores da peça 2: ");
//        int codigo2 = sc.nextInt();
//        int numeroPecas2 = sc.nextInt();
//        double valorPeca2 = sc.nextDouble();
//
//        double pagar1 = numeroPecas1 * valorPeca1;
//        double pagar2 = numeroPecas2 * valorPeca2;
//        double pagarTotal = pagar1 + pagar2;
//
//        System.out.printf("Valor a pagar: %.2f", pagarTotal);
//
//
//        sc.close();

        /** Exercicio 4 Estrutura Sequencial **/
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Digite o numero do funcionario: ");
//        int numeroFuncionario = sc.nextInt();
//
//        System.out.print("Digite o numero de horas trabalhadas: ");
//        int numeroHoras = sc.nextInt();
//
//        System.out.print("Digite o valor recebido por hora: ");
//        double valorHora = sc.nextDouble();
//
//        double salarioFuncionario = numeroHoras * valorHora;
//
//        System.out.printf("Number: %d%nSalary: %.2f%n", numeroFuncionario, salarioFuncionario);
//
//        sc.close();

        /** Exercicio 3 Estrutura Sequencial **/
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Digite o primeiro valor: ");
//        int a = sc.nextInt();
//
//        System.out.print("Digite o segundo valor: ");
//        int b = sc.nextInt();
//
//        System.out.print("Digite o terceiro valor: ");
//        int c = sc.nextInt();
//
//        System.out.print("Digite o quarto valor: ");
//        int d = sc.nextInt();
//
//        int diferenca = a * b - c * d;
//        System.out.print("Diferença: " + diferenca);
//
//        sc.close();

        /** Exercicio 2 Estrutura Sequencial **/
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        double pi = 3.14159;
//
//        System.out.print("Digite o valor do raio do circulo: ");
//        double raio = sc.nextDouble();
//
//        double area = pi * raio * raio;
//
//        System.out.printf("Resultado: %.4f%n", area);
//
//        sc.close();

        /** Exercicio 1 Estrutura Sequencial **/
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Digite o primeiro valor: ");
//        int x = sc.nextInt();
//
//        System.out.print("Digite o segundo valor: ");
//        int y = sc.nextInt();
//
//        int resultado = x + y;
//        System.out.println("Resultado da soma: " + resultado);
//
//        sc.close();

        /** Exercicio aula youtube **/
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        double largura, comprimento, valorMetroQuadrado, area, preco;
//
//        System.out.print("Digite a largura do terreno: ");
//        largura = sc.nextDouble();
//
//        System.out.print("Digite o comprimento do terreno: ");
//        comprimento = sc.nextDouble();
//
//        System.out.print("Digite o valor do metro quadrado: ");
//        valorMetroQuadrado = sc.nextDouble();
//
//        area = (largura * comprimento);
//        System.out.printf("Area do terreno: %.2f %n", area);
//
//        preco = (area * valorMetroQuadrado);
//        System.out.printf("Valor do terreno: %.2f %n", preco);
//
//        sc.close();

    }
}
