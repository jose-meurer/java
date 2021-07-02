package application;


import entities.Product;
import service.CalculationService;
import service.CreateFileService;

import java.io.*;
import java.util.*;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();

        File path = new File("in.csv");

        if (!path.isFile() && !path.exists()) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(path));) {
                CreateFileService.createFile(sc, bw);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");

                productList.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Most expensive: ");
        System.out.println(CalculationService.max(productList));
        //System.out.println(Collections.max(productList));

        sc.close();
    }

}
