package application;

import entities.Client;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        //Equals

        String a = "Maria";
        String b = "Alex";

        System.out.println(a.equals(b));

        //HashCode

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Alex", "alex@gmail.com");

        System.out.println("------------");
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));

        System.out.println("------------");
        System.out.println(c1 == c2);
        System.out.println("Memory address: ");
        System.out.println(c1);
        System.out.println(c2);

        String s1 = "Test";
        String s2 = "Test";

        System.out.println("------------");
        System.out.println(s1 == s2);


        System.out.println("---------Test---------");

        List<Client> clients = new ArrayList<>();

        String name = "Jose";
        for (int i = 0; i < 10000; i++) {
            if (i % 2 != 0) {
                name += "g";
            } else {
                name +="k";
            }
            clients.add(new Client(name));
        }

        String search = "Josekgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgk";

        int x = 0;
        for (Client client : clients) {
            if (client.getName().hashCode() == search.hashCode()) {
                System.out.println("Está na posicao " + x + " da lista.");
                if (client.getName().equals(search)) {
                    System.out.println("Equals confirma");
                }
            }
            x++;
        }
        
//        System.out.println("------------");
//        int pos = 0;
//        for (Client client : clients) {
//            System.out.println("Posicao " + pos + ":  " + client.getName());
//            pos++;
//        }
    }
}
