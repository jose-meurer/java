package application;

import entities.List;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List list = new List();

        int opcao;
        do {
            showMenu();
            opcao = sc.nextInt();

            switch (opcao) {
                case 1: {
                    System.out.print("Digite o valor: ");
                    list.add(sc.nextDouble());
                    break;
                }
                case 2: {
                    System.out.println(list.toString());
                    break;
                }
                case 3: { //Adicionado a opcao pesquisa
                    System.out.print("Valor da busca: ");
                    double value = sc.nextDouble();
                    System.out.println(list.pesquisa(value));
                    break;
                }
                case 4: {
                    System.out.println("Programa finalizado");
                    break;
                }
                default: {
                    System.out.println("Opcao invalida");
                }
            }

        } while (opcao != 4);

        sc.close();
    }

    private static void showMenu() {
        System.out.println("1 - Adicionar elemento na lista");
        System.out.println("2 - Mostrar lista");
        System.out.println("3 - Pesquisar na lista");
        System.out.println("4 - Sair");
    }
}
