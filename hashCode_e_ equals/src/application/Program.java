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

        Client c1 = new Client("Maria", "maria@gmail.com", 45);
        Client c2 = new Client("Alex", "alex@gmail.com", 12);

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
        for (int i = 0; i < 1000; i++) {
            if (i % 2 != 0) {
                name += "g";
            } else {
                name += "k";
            }
            clients.add(new Client(name, "null@null.com", null));
        }

        String search = "Josekgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgkgk";

//        int x = 0;
//        for (Client client : clients) {
//            if (client.getName().hashCode() == search.hashCode()) {
//                System.out.println("Está na posicao " + x + " da lista.");

//                if (client.getName().equals(search)) {
//                    System.out.println("Equals confirma");
//                }
//            }
//            x++;
//        }

        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getName().hashCode() == search.hashCode()) {
                System.out.println("Está na posicao " + i + " da lista.");

                if (clients.get(i).getName().equals(search)) {
                    System.out.println("Equals confirma");
                }
            }
        }

//        System.out.println("------------");
//        int pos = 0;
//        for (Client client : clients) {
//            System.out.println("Posicao " + pos + ":  " + client.getName());
//            pos++;
//        }
        }
    }
