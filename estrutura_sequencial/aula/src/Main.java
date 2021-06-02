import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double vinteCinco = 25.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(vinteCinco);
        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de " + vinteCinco + " = " + C);

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + "elevado ao quadrado = " + B);
        System.out.println("5 elevado ao quadrado = " + C);

        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("Valor absoluto de  " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);

//        Scanner sc = new Scanner(System.in);
//
//        String s1, s2, s3;
//        int x;
//
//        System.out.println("Favor inserir as informacoes: ");
//        x = sc.nextInt();
//        sc.nextLine();
//        s1 = sc.nextLine();
//        s2 = sc.nextLine();
//        s3 = sc.nextLine();
//
//        System.out.println("Dados Digitados: ");
//        System.out.println(x);
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
//
//        sc.close();
//
//        int a, b;
//        double resultado;
//
//        a = 10;
//        b = 3;
//
//        resultado = (double) a / b;
//
//        System.out.printf("Resultado: %.9" +
//                "f", resultado);
//
//        int b, B, h, resultado;
//
//        b = 6;
//        B = 8;
//        h = 5;
//
//        resultado = (b + B) / 2 * h;
//
//        System.out.println(resultado);
//
//        String product1 = "Computer";
//        String product2 = "Office desk";
//
//        int age = 30;
//        int code = 5290;
//        char gender = 'F';
//
//        double price1 = 2100.0;
//        double price2 = 650.50;
//        double measure = 53.234567;
//
//        System.out.printf("Products: %n %s, which price is $ %.2f %n", product1, price1);
//        System.out.printf(" %s, which price is $ %.2f %n", product2, price2);
//        System.out.printf(" Record: %d years old, code %d and gender: %s %n", age, code, gender);
//        System.out.printf(" Measure with eight decimal places : %.8f %n", measure);
//        System.out.printf(" Rouded (three decimal places): %.3f %n", measure);
//        Locale.setDefault(Locale.US);
//        System.out.printf(" US decimal point: %.3f %n", measure);
    }
}
