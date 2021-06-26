package application;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        try {
            System.out.println("Enter rental data: ");
            System.out.print("Car model: ");
            String carModel = sc.nextLine();
            System.out.print("Pickup (dd/MM/yyy hh:mm): ");
            Date dateStart = sdf.parse(sc.nextLine());
            System.out.print("Return (dd/MM/yyy hh:mm): ");
            Date dateFinish = sdf.parse(sc.nextLine());

            CarRental carRental = new CarRental(dateStart, dateFinish, new Vehicle(carModel));

            System.out.print("Enter price per hour: ");
            double priceHour = sc.nextDouble();
            System.out.print("Enter price per day: ");
            double priceDay = sc.nextDouble();

            RentalService rentalService = new RentalService(priceDay, priceHour, new BrazilTaxService());

            rentalService.processInvoice(carRental);

            System.out.println();
            System.out.println("INVOICE: ");
            System.out.printf("Basic payment: %.2f%n", carRental.getInvoice().getBasicPayment());
            System.out.printf("Tax: %.2f%n", carRental.getInvoice().getTax());
            System.out.printf("Total paymnet: %.2f%n", carRental.getInvoice().getTotalPayment());

            sc.close();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } finally {

            sc.close();
        }
    }
}
