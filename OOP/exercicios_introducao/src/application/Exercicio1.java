package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle width and heigth: ");
        Rectangle rectangle = new Rectangle();
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.println(rectangle);

        sc.close();
    }
}
