package entities;
import java.util.Scanner;

public class Student {

    public String name;
    public double grade1, grade2, grade3;

    public void enterData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name and three grades: ");
        name = sc.nextLine();
        grade1 = sc.nextDouble();
        grade2 = sc.nextDouble();
        grade3 = sc.nextDouble();

        sc.close();
    }

    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }

    public double missingPoints() {
        if (finalGrade() < 60.0) {
            return 60.0 - finalGrade();
        } else {
            return finalGrade();
        }
    }

    public String passOrFailed() {
        if (finalGrade() < 60.0) {
            return "FAILED"
                    + "\n"
                    + String.format("MISSING %.2f POINTS", missingPoints());
        } else {
            return "PASS";
        }
    }

    public String toString() {
        return name.toUpperCase()
                + "\n"
                + "FINAL GRADE = "
                + String.format("%.2f%n", finalGrade())
                + passOrFailed();
    }

    public void showResult(){
        System.out.println(toString());
    }
}
