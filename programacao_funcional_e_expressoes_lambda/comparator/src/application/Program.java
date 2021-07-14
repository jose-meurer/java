package application;

import entities.MyComparator;
import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 450.0));
        list.add(new Product("Cellphone", 390.0));

        list.sort(new MyComparator());

        for (Product prod : list) {
            System.out.println(prod);
        }
    }
}
