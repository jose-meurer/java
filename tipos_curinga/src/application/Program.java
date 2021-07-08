package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        //List<Object> myObjs = new ArrayList<>(); // Erro de compilacao
        List<?> myObjs = new ArrayList<>();
        List<Integer> myNumbers = new ArrayList<>();
        myObjs = myNumbers;

        Object obj;
        Integer x = 10;
        obj = x; //Object é um super tipo de Integer, mas um tipo list Object nao é um super tipo de list Integer

        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

        List<String> myString = Arrays.asList("Jose", "Maria", "Joao");
        printList(myString);
    }

    public static void printList(List<?> list) {
        //list.add(15); //Erro de compilacao, o compilador nao sabe o tipo da lista
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
