package application;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ParcelGenerator;
import model.services.Paypal;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter contract data: ");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Date (dd/MM/yyyy): ");
        Date dateContract = sdf.parse(sc.next());
        System.out.print("Contract value: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, dateContract, totalValue);

        System.out.print("Enter number of installments: ");
        int numberInstalment = sc.nextInt();

        ParcelGenerator pg = new ParcelGenerator(new Paypal());
        pg.processContract(contract, numberInstalment);

        System.out.println();
        System.out.println("Installments: ");
        for (Installment x : contract.getListInstallment()) {
            System.out.println(sdf.format(x.getDueDate()) + " - " + String.format("%.2f", x.getAmount()));
        }

        String path = "out.csv";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {

            bw.write("INSTALLMENTS: ");
            bw.newLine();
            for (Installment x : contract.getListInstallment()) {
                bw.write("Date: " + sdf.format(x.getDueDate()) + " - Value: " + String.format("%.2f", x.getAmount()));
                bw.newLine();
            }

            System.out.println();
            System.out.println(path + " - Created!");

        } catch (IOException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
