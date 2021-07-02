package service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFileService {

    public static void createFile(Scanner sc, BufferedWriter bw) throws IOException {
        System.out.println("How many products will be registered? ");
        int quantity = sc.nextInt();

        for (int i = 0; i < quantity; i++) {
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();

            bw.write(productName + "," + String.format("%.2f", productPrice));
            bw.newLine();
            bw.flush();
        }
    }
}
