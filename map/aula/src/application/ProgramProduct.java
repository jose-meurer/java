package application;

import entities.Product;

import java.util.*;

public class ProgramProduct {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Map<Product, Double> stock = new TreeMap<>();

        Product p1 = new Product("TV", 900.0);
        Product p2 = new Product("Computer", 1200.0);
        Product p3 = new Product("Keyboard", 200.0);
        Product p4 = new Product("Mouse", 120.0);
        Product p5 = new Product("Cellphone", 650.0);

        stock.put(p1, 230.0);
        stock.put(p2, 212.0);
        stock.put(p3, 870.0);
        stock.put(p4, 50.0);
        stock.put(p5, 12.0);

        Product ps = new Product("TV", 900.0);

        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
    }
}
