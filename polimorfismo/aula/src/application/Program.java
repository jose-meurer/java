package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> emp = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("Employee #" + (i + 1) + " data:");
            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine().toUpperCase();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            ch = Character.toUpperCase(ch);
            if (ch == 'Y'){
                System.out.print("Additional charge: ");
                double addCharge = sc.nextDouble();

                emp.add(new OutsourcedEmployee(name, hours, valuePerHour, addCharge));
            }
            else{
                emp.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println();
        System.out.println("PAYMENTS: ");
        for (Employee x : emp){
            System.out.println(x);
        }

        sc.close();
    }
}
