package application;

import entities.Product;

import java.util.HashSet;
import java.util.Set;

public class Program {

    public static void main(String[] args) {

        Set<Product> set = new HashSet<>();

        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        Product prod = new Product("Notebook", 1200.0);

        System.out.println(set.contains(prod));


        Product prod1 = new Product("Notebook", 1200.0);
        System.out.println(prod);
        System.out.println(prod1); //Sem implementar na classe o hashcode e equals compara com o endereco de memoria

        System.out.println(prod.equals(prod1));
    }
}
