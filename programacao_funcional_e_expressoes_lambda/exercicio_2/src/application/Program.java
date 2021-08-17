package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<>();

        String path = "in.csv";
        try (BufferedReader bf = new BufferedReader(new FileReader(path))) {
            String line = bf.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                String email = fields[1];
                Double salary = Double.parseDouble(fields[2]);

                employeeList.add(new Employee(name, email, salary));
                line = bf.readLine();
            }

            System.out.print("Enter salary: ");
            double salaryfilter = sc.nextDouble();

            System.out.println("Email of people whose salary is more than " + String.format("%.2f", salaryfilter));

            Comparator<String> comp = (p1, p2 ) -> p1.toUpperCase().compareTo(p2.toUpperCase()); // opcional
            List<String> emailList = employeeList.stream().filter(p -> p.getSalary() > salaryfilter)
                    .map(p -> p.getEmail()).sorted(comp).collect(Collectors.toList());

            emailList.forEach(System.out::println);

            double sumM = employeeList.stream().filter(p -> p.getName().startsWith("M"))
                    .mapToDouble(p -> p.getSalary()).sum();

            System.out.println("Sum of salary of people name starts with 'M': " + String.format("%.2f", sumM));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
