package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> prod = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i + 1) + " data: ");
            System.out.print("Commin, used or imported (c/u/i)? ");
            char status = sc.next().charAt(0);
            status = Character.toLowerCase(status);
            System.out.print("Name: ");
            sc.nextLine();
            String nameProduct = sc.nextLine().toUpperCase();
            System.out.print("Price: ");
            Double priceProduct = sc.nextDouble();

            switch (status) {  //Professor utilizou if/else, achei o switch mais interessante de usar.
                case 'i':
                    System.out.print("Customs fee: ");
                    Double fee = sc.nextDouble();
                    prod.add(new ImportedProduct(nameProduct, priceProduct, fee));
                    break;
                case 'u':
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    Date dateManufacture = sdf.parse(sc.next());
                    prod.add(new UsedProduct(nameProduct, priceProduct, dateManufacture));
                    break;
                default:
                    prod.add(new Product(nameProduct, priceProduct));
                    break;
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product list : prod) {
            System.out.println(list.priceTag());
        }

        sc.close();
    }
}
