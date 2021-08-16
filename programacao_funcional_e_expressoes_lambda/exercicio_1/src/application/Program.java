package application;

import entities.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> productList = new ArrayList<>();

        String path = "in.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);

                productList.add(new Product(name, price));
                line = br.readLine();
            }

            double average = productList.stream().mapToDouble(p -> p.getPrice()).average().getAsDouble();
            System.out.println("Average price: " + String.format("%.2f", average));

            Comparator<String> comp = (p1, p2) -> p1.toUpperCase().compareTo(p2.toUpperCase());
            List<String> names = productList.stream().filter(p -> p.getPrice() < average).map(p -> p.getName()).sorted(comp.reversed()).collect(Collectors.toList());

            names.forEach(System.out::println);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
