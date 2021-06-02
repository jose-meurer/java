package application;
import entities.Student;
import java.util.Locale;

public class Exercicio3 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Student student = new Student();
        student.enterData();
        student.showResult();
    }
}
