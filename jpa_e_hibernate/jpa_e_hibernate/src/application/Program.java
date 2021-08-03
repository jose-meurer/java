package application;

import dominio.Person;

public class Program {

    public static void main(String[] args) {

        Person p1 = new Person(1, "Jose Meurer", "jose@gmail.com");
        Person p2 = new Person(1, "Joao Limeira", "joao@gmail.com");
        Person p3 = new Person(1, "Leticia da Silva", "leticia@gmail.com");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}
