package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgramCoringasDelimitados {
    public static void main(String[] args) {

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircle = new ArrayList<>();
        myCircle.add(new Circle(2.0));
        myCircle.add(new Circle(3.0));

        System.out.println("Total area: " + totalArea(myShapes));

        //OPERACAO COVARIANCIA
        List<Integer> intList = Arrays.asList(5, 10);

        //Caso precise consultar no futuro sobre  Arrays.asList e List.of
        //https://pt.stackoverflow.com/questions/243874/qual-a-diferen%C3%A7a-entre-arrays-aslist-e-list-of

        List<? extends Number> list = intList; //Qualquer tipo que extender Number

        Number x = list.get(0); //Consigo buscar
        //list.add(20); //Mas nao consigo inserir
        // pq Number nao sabe se a lista é de Integer, Double, Float etc...

        //OPERACAO CONTRAVARIANCIA
        List<Object> myObjs = new ArrayList<>();
        myObjs.add("Maria");
        myObjs.add("Alex");

        List<? super Number> myNums = myObjs; //Qualquer SUPER TIPO de Number

        myNums.add(10);
        myNums.add(3.14); // Consigo inserir

        //Number y = myNums.get(0); // Mas nao consigo buscar
        // Nao consigo buscar pq o tipo da lista aceita Number ou super tipo de Number, Number é um Object mas um Object nao é um Number
        // Se fosse Object y = myNums.get(0); daria certo.

        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);


        copy(myInts, myObjs);
        showList(myObjs);

        copy(myDoubles, myObjs);
        showList(myObjs);

        System.out.println(myObjs.get(3));

        List<Number> nn = new ArrayList<>();
        nn.add(9);
        nn.add(3);

        test(myDoubles, nn);
        System.out.println(nn);
    }

    private static void test(List<? extends Double> source, List<? super Double> destiny) {
        for (Double x : source) {
            destiny.add(x);
        }
    }

    private static void showList(List<?> list) {
        for (Object x : list) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    private static void copy(List<? extends Number> source, List<? super Number> destiny) {
        // Exemplo pratico de Covariancia e Contravariancia
        for (Number number : source) {
            destiny.add(number);
        }
    }

    private static double totalArea(List<? extends Shape> list) { //Qualquer tipo que extender Shape pode usar
        //list.add(new Circle(3.0)); //Nao compila
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }
}
