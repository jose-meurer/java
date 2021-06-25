package application;

import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> listProducts = new ArrayList<>();

        System.out.print("Enter a file path: ");
        File sourceFile = new File(sc.nextLine());
        String sourceFolder = sourceFile.getParent();

//        File[] files = sourceFile.listFiles(File::isFile);
//        System.out.println();
//        System.out.println("FILES: ");
//        for (File file : files) {
//            System.out.println(file.getName());
//
//        }
//
//        System.out.println("Enter the file name: ");
//        String nameFile = sourceFile + "\\" + sc.next();

        try (BufferedReader sourceBr = new BufferedReader(new FileReader(sourceFile))) {

            String line = sourceBr.readLine();
            while (line != null) {
                String[] vect = line.split(",");
                String wordName = vect[0];
                String wordPrice = vect[1];
                String wordQuantity = vect[2];

                String name = wordName;
                double price = Double.parseDouble(wordPrice);
                int quantity = Integer.parseInt(wordQuantity);

                listProducts.add(new Product(name, price, quantity));

                line = sourceBr.readLine();
            }

            boolean success = new File(sourceFolder + "\\outProduct").mkdir();
            if (success) {
                System.out.println("Created folder");
            } else {
                System.out.println("Folder already exists");
            }

            String outFile = sourceFolder + "\\outProduct\\summary.csv";
            try (BufferedWriter outBw = new BufferedWriter(new FileWriter(outFile))) {

                for (Product product : listProducts) {
                    outBw.write(product.getName() + "," + String.format("%.2f", product.totalValue()));
                    outBw.newLine();
                }

                System.out.println(outFile + " --CREATED!--");

            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        sc.close();
    }
}
