package application;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class ProgramSomaPares {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Integer> listInt = Arrays.asList(5, 6, 7, 8 , 9 , 10);

        System.out.println("Soma do numeros pares: " + somaIterator(listInt));

        System.out.println("---------------------------------------------");

        System.out.println("Soma dos pares: " + somaIteratorForEach(listInt));

        System.out.println("---------------------------------------------");

        //somar os valores de uma list com lambda
        int sum = listInt.stream().filter(x -> x % 2 == 0).mapToInt(x -> x).sum();
        System.out.println(sum);

    }

    // Calculo da soma de valores inteiros pares antes do Java5
    private static int somaIterator(List list) {
        Iterator it = list.iterator();
        int soma = 0;
        while (it.hasNext()) {
            int num = (int) it.next();
            if (num % 2 == 0) {
                soma += num;
            }
        }
        return soma;
    }

    //Laço melhorado do Java 5
    private static int somaIteratorForEach (List<Integer> list) {
        int soma = 0;
        for (int num : list) {
            if (num % 2 == 0) {
                soma += num;
            }
        }
        return soma;
    }
}
