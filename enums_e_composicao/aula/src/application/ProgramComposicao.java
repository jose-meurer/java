package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ProgramComposicao {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String department = sc.nextLine();
        System.out.print("Responsible for the department: ");
        String responsibleDepartment = sc.nextLine();
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine().toUpperCase();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel),
                baseSalary, new Department(department, responsibleDepartment));

        System.out.println();
        System.out.print("How many contracts to his worker? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Enter contract #" + (i + 1) + " data: ");
            System.out.print("Date (DD/MM/YYY): ");
            Date contractDate = sdf.parse(sc.next()); //Se for utilizar nextLine(),fazer um next() antes, pois vai ler a quebra de linha e dar erro.
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            double hours = sc.nextDouble();

            worker.addContract(new HourContract(contractDate, valuePerHour, hours));
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println(worker);
        System.out.printf("Income for %s : %.2f%n", monthAndYear, worker.income(month, year));

        sc.close();
    }
}
