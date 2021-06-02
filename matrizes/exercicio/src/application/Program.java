package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Line numbers: ");
        int l = sc.nextInt();
        System.out.print("Column numbers: ");
        int c = sc.nextInt();

        int[][] mat = new int[l][c];

        for (int i = 0; i < mat.length; i++) {
            System.out.println("Line numbers " + i + " :");
            for (int x = 0; x < mat[i].length; x++) {
                mat[i][x] = sc.nextInt();
            }
        }

//        for (int i = 0; i < mat.length; i++) {
//            System.out.println();
//            for (int x = 0; x < mat[i].length; x++) {
//                System.out.print("[" + mat[i][x] + "] ");
//            }
//        }

        for (int[] vetor : mat){ //Imprimir na tela a leitura da matriz com laco for each
            System.out.println();
            for (int elemento : vetor){
                System.out.print("["+ elemento + "] ");
            }
        }

        System.out.println();
        System.out.print("Qual valor deseja encontrar? ");
        int value = sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int x = 0; x < mat[i].length; x++) {
                if (mat[i][x] == value) {
                    System.out.println();
                    System.out.println("Position " + i + "," + x + ":");

                    if (x >= 1) {
                        System.out.println("Left: " + mat[i][x - 1]);
                    }
                    if (x < (mat[i].length - 1)) {
                        System.out.println("Right: " + mat[i][x + 1]);
                    }
                    if (i >= 1) {
                        System.out.println("Up: " + mat[i - 1][x]);
                    }
                    if (i < (mat.length - 1)) {
                        System.out.println("Down: " + mat[i + 1][x]);
                    }
                }
            }
        }

        sc.close();
    }
}
