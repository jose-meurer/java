package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> setStudentA = new HashSet<>(); //Poderia ter feito em apenas uma lista, mas caso precisa-se consultar o historico no futuro nao daria
        Set<Integer> setStudentB = new HashSet<>();
        Set<Integer> setStudentC = new HashSet<>();

        System.out.print("How many students for course A? ");
        int courseA = sc.nextInt();

        for (int i = 0; i < courseA; i++) {
            int IdStudent = sc.nextInt();

            setStudentA.add(IdStudent);
        }

        System.out.print("How many students for course B? ");
        int courseB = sc.nextInt();

        for (int i = 0; i < courseB; i++) {
            int IdStudent = sc.nextInt();

            setStudentB.add(IdStudent);
        }

        System.out.print("How many students for course C? ");
        int courseC = sc.nextInt();

        for (int i = 0; i < courseC; i++) {
            int IdStudent = sc.nextInt();

            setStudentC.add(IdStudent);
        }

        Set<Integer> setTotalStudent = new HashSet<>(setStudentA);
        setTotalStudent.addAll(setStudentB); //adiciona todos que nao sao duplicatas
        setTotalStudent.addAll(setStudentC);

        System.out.println();
        System.out.println("Total students: " + setTotalStudent.size());

        sc.close();
    }
}
