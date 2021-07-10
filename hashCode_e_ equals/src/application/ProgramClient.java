package application;

import entities.Client;
import service.ServiceSearchClient;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramClient {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Client> listClient = new ArrayList<>();

        listClient.add(new Client("MARIA", "maria@gmail.com", 53));
        listClient.add(new Client("JOSE", "jose@gmail.com", 34));
        listClient.add(new Client("JOAO", "joao@gmail.com", 12));
        listClient.add(new Client("EDUARDO", "eduardo@gmail.com", 82));
        listClient.add(new Client("NICOLAS", "nicolas@gmail.com", 42));
        listClient.add(new Client("NICOLE", "nicole@gmail.com", 87));
        listClient.add(new Client("LETICIA", "leticia@gmail.com", 21));
        listClient.add(new Client("AMANDA", "amanda@gmail.com", 35));
        listClient.add(new Client("LUCAS", "lucas@gmail.com", 57));
        listClient.add(new Client("HENRIQUE", "henrique@gmail.com", 51));
        listClient.add(new Client("MARCIA", "marcia@gmail.com", 19));

        System.out.print("Deseja buscar por nome, email ou idade (n/e/i)? ");
        char searchChar = Character.toLowerCase(sc.next().charAt(0));

        while(searchChar != 'n' && searchChar != 'e' && searchChar != 'i') {
            searchChar = sc.next().charAt(0);
        }

        Client clientSearch = null;

        if (searchChar == 'n') {
            System.out.print("Nome do cliente: ");
            sc.nextLine();
            String name = sc.nextLine().toUpperCase();
            clientSearch = ServiceSearchClient.searchClient(listClient, name, null, searchChar);
        }
        if (searchChar == 'e') {
            System.out.print("Email do cliente: ");
            sc.nextLine();
            String email = sc.nextLine().toLowerCase();
            clientSearch = ServiceSearchClient.searchClient(listClient, email, null, searchChar);
        }
        if (searchChar == 'i') {
            System.out.print("Idade do cliente: ");
            int idade = sc.nextInt();
            clientSearch = ServiceSearchClient.searchClient(listClient, null, idade, searchChar);
        }

        if (clientSearch == null) {
            System.out.println("Nenhum cliente encontrado!");
            System.exit(0);
        }

        System.out.println();
        System.out.println(clientSearch);

        sc.close();
    }


}
