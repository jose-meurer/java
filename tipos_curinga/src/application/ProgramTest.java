package application;

import entities.Circle;
import entities.Intermediario;
import entities.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgramTest {
    public static void main(String[] args) {

        List<Integer> myInt = new ArrayList<>();
        myInt.add(9);
        myInt.add(4);
        myInt.add(245);
        myInt.add(98);

        List<Double> myDouble = new ArrayList<>();
        myDouble.add(4.0);
        myDouble.add(34.0);
        myDouble.add(4.40);
        myDouble.add(41.20);
        myDouble.add(5.10);
        myDouble.add(9.20);

        List<?> myQuestion = new ArrayList<>();
        //myQuestion.add(9); //Nao posso

        List<Object> myObject = new ArrayList<>();
        myObject.add("Luiz");
        myObject.add("José");
        myObject.add(19);
        myObject.add('a');
        myObject.add(34.9810);

        test(myInt, myObject);

        myObject.add("Joao");

        myObject.remove(Integer.valueOf(245));

        System.out.println("teste" + test2(myObject));

        System.out.println(myObject);

        List<? extends Number> testX = Arrays.asList(9, 4, 1);
        //testX.add(19); // Nao
        testX.get(1); //Sim

        List<? super Number> testY = new ArrayList<>();
        testY.add(19);
        testY.add(122.5);
        testY.add(3131313L);

        Object xx = testY.get(1);
        System.out.println(testY.get(2));

    }

    private static void test3(List<? extends Intermediario> source, List<? super Intermediario> target) {
        target.add(source.get(0));
        Circle circle = new Circle(3.0);
        target.add(circle);
    }

    private static <T> T test2(List<T> list) {
        T x = list.get(0);
        list.add(x);
        return x;
    }

    private static void test1(List<?> list) {
       // int x = list.get(2); // nao
       // Number x = list.get(2); //Nao
        Object x = list.get(2); //Sim
        System.out.println(x);
    }

    private static void test(List<? extends Number> source, List<? super Number> target) {
        for (Number number : source) {
            target.add(number);
        }
    }
}
