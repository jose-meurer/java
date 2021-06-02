import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /**Expressoes comparativas**/
//        <     menor
//        >     maior
//        <=    menor igual
//        >=    maior igual
//        ==    igual
//        !=    diferente

        /**Expressoes logicas**/
//        &&  E
//        ||  OU
//        !   NAO (Inverte o resultado)

        /** Aula 40 **/

        /**Inves de escrever**/
//        double preco = 34.5;
//        double desconto;
//        if (preco < 20.0){
//            desconto = preco * 0.1;
//        }else{
//            desconto = preco * 0.05;
//        }
//        System.out.println("Desconto: " + desconto);

        /** Pode se usar expressao condicional ternaria para simplificar **/

        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        System.out.println("Desconto: " + desconto);

        /**Aula 39**/
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Digite o dia da semana: ");
//        int x = sc.nextInt();
//
//        String dia;
//
//        switch (x) {
//            case 1:
//                dia = "Domingo";
//                break;
//            case 2:
//                dia = "Segunda";
//                break;
//            case 3:
//                dia = "Terca";
//                break;
//            case 4:
//                dia = "Quarta";
//                break;
//            case 5:
//                dia = "Quinta";
//                break;
//            case 6:
//                dia = "Sexta";
//                break;
//            case 7:
//                dia = "Sabado";
//                break;
//            default:
//                dia = "Valor Invalido";
//                break;
//        }
//        System.out.println("Dia da semana: " + dia);
//
//        sc.close();

        /**Aula 38**/
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Quantos minutos foram utilizados? ");
//        int minutos = sc.nextInt();
//
//        double plano = 50.00;
//        if (minutos <= 100) {
//            System.out.printf("Valor a pagar: R$ %.2f%n", plano);
//
//        } else {
//            minutos -= 100;
//            plano += minutos * 2;
//            System.out.printf("Valor a pagar: R$ %.2f%n", plano);
//
//        }
//
//        sc.close();

    }
}
