package application;

import entities.Pessoa;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CriacaoStream {

    public static void main(String[] args) {

        // Link referencia: https://www.oracle.com/br/technical-resources/articles/java-stream-api.html

        //Ciar uma stream a partir de um List
        List<String> itens = new ArrayList<>();
        itens.add("um");
        itens.add("dois");
        itens.add("tres");
        Stream<String> stream = itens.stream();
        System.out.println(Arrays.toString(stream.toArray()));

        System.out.println();
        System.out.println("---------------------------------------------");
        Map<String, String> map = new HashMap<>();
        map.put("key1", "abacate");
        map.put("key2", "melancia");
        map.put("key3", "manga");
        Stream<String> stream1 = map.keySet().stream(); // retorna a key
        Stream<String> stream2 = map.values().stream(); // retorna os valores
        System.out.println(Arrays.toString(stream2.toArray()));

        System.out.println();
        System.out.println("---------------------------------------------");
        Stream<Integer> numbersFromValues = Stream.of(1, 2, 3, 4 ,5); // .of nao pode ser modificada
        IntStream numbersFromArray = Arrays.stream(new int[] {1, 2, 3, 4, 5}); //Arrays. tem tamanho fixo
        System.out.println(Arrays.toString(numbersFromValues.toArray()));
        System.out.println(Arrays.toString(numbersFromArray.toArray()));

        System.out.println();
        System.out.println("---------------------------------------------");

        // Algumas das operações intermediárias mais utilizadas são: filter(), map(), sorted(), limit() e distinct().

        // List
        Pessoa pessoa = new Pessoa();
        List<Pessoa> pessoas = pessoa.populaPessoas();
        Stream<Pessoa> stream3 = pessoas.stream().filter(p -> p.getNacionalidade().equals("Brasil"));
        System.out.println(Arrays.toString(stream3.toArray()));

        System.out.println();
        System.out.println("---------------------------------------------");

        // Map
        Stream<Integer> stream4 = pessoas.stream().filter(p -> p.getNacionalidade().equals("Brasil")).map(Pessoa::getIdade);
        System.out.println(Arrays.toString(stream4.toArray()));

        System.out.println();
        System.out.println("---------------------------------------------");

        // Exemplo de uso do método sorted().
        Stream<Pessoa> stream5 = pessoas.stream().filter(p -> p.getNacionalidade().equals("Brasil")).sorted(Comparator.comparing(Pessoa::getNome));
        System.out.println(Arrays.toString(stream5.toArray()));

        // Distinct
        System.out.println();
        System.out.println("---------------------------------------------");
        Stream<Pessoa> stream6 = pessoas.stream().distinct();
        System.out.println(Arrays.toString(stream6.toArray()));

        // Limit
        System.out.println();
        System.out.println("---------------------------------------------");
        Stream<Pessoa> stream7 = pessoas.stream().limit(3);
        System.out.println(Arrays.toString(stream7.toArray()));

        // ForEach
        System.out.println();
        System.out.println("---------------------------------------------");
        pessoas.stream().forEach(p -> System.out.println(p.getNome()));

        // Average
        System.out.println();
        System.out.println("---------------------------------------------");
        double media = pessoas.stream().filter(p -> p.getNacionalidade().equals("Brasil")).mapToInt(p -> p.getIdade()).average().getAsDouble();
        System.out.println(media);

        //Collect
        System.out.println();
        System.out.println("---------------------------------------------");
        List<Pessoa> pessoasComM = pessoas.stream().filter(p -> p.getNome().startsWith("M")).collect(Collectors.toList());
        System.out.println(pessoasComM);

        // Count
        System.out.println();
        System.out.println("---------------------------------------------");
        long qt = pessoas.stream().filter(p -> p.getNome().startsWith("N")).count();
        System.out.println(qt);

        // Allmatch
        System.out.println();
        System.out.println("---------------------------------------------");
        boolean todosMexicanos = pessoas.stream().allMatch(p -> p.getNacionalidade().equals("Mexico"));
        System.out.println(todosMexicanos);

    }
}
