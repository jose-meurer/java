package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the size of the matriz? ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        for (int i = 0; i < mat.length; i++) {
            for (int x = 0; x < mat[i].length; x++) {
                System.out.println("Number:" + "[" + i + "]" + "[" + x + "] : ");
                mat[i][x] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal: ");
        for (int i = 0; i < mat.length && i < mat[i].length; i++) {
            System.out.print(mat[i][i] + " ");
        }

        System.out.println();
        System.out.print("Negative numbers = ");
        int negative = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int x = 0; x < mat[i].length; x++) {
                if (mat[i][x] < 0) {
                    negative++;
                }
            }
        }
        System.out.println(negative);

        System.out.println();
        System.out.println("MATRIZ: ");
        for (int i = 0; i < mat.length; i++) {
            for (int x = 0; x < mat[i].length; x++) {
                System.out.print("[" + mat[i][x] + "] ");
            }
            System.out.println();
        }

        sc.close();
    }
}
