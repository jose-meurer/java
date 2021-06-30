package application;

import entities.Employee;

import java.io.*;
import java.util.*;

public class Program {
    public static void main(String[] args) throws InterruptedException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();

        File path = new File("in.csv");

        Thread.sleep(500);
        if (!path.isFile()) {
            System.out.println("Diretorio do arquivo está incorreto, programa encerrado!");
            System.exit(0);
        }

        System.out.print("Which order do you want (name, salary)? ");
        String order = sc.next().toUpperCase();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String lineBR = br.readLine();
            lineBR = br.readLine(); // Pula a primeira linha que é Employee,salary;

            while (lineBR != null) {
                String[] list = lineBR.split(",");

                employeeList.add(new Employee(list[0], Double.parseDouble(list[1]), order));
                lineBR = br.readLine();
            }
            Collections.sort(employeeList);

            for (Employee employee : employeeList) {
                System.out.println(employee);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
