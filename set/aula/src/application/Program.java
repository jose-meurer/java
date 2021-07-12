package application;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        //Set<String> set = new HashSet<>(); // rapido porem nao ordenado (tabelaHash)
        //Set<String> set = new TreeSet<>(); // lento porem ordenado pelo compareTo ou Comparator (arvore rubro-negra)
        Set<String> set = new LinkedHashSet<>(); // velovidade intermediario porem ordenado na ordem que sao adicionados

        set.add("Abelha");
        set.add("Zebra");
        set.add("Vespa");
        set.add("Cupim");
        set.add("Cavalo");

        set.removeIf(x -> x.charAt(x.length() - 1) == 'a');

        for (String x : set) {
            System.out.println(x);
        }

        System.out.println("------------------------------");
        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

        //Faz a uniao das duas listas removendo duplicatas
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //Adiciona apenas os valores em comum entre as duas listas
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //Valores que existem na lista A mas que nao tem na lista B
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);


        System.out.println("------------------------------");
        //Testes
        Set<String> fraseSet = new LinkedHashSet<>();

        String frase = "hoje eu sai de casa para comprar pastel mas estava chovendo";

        String[] vect = frase.split(" ");
        for (int i = 0; i < vect.length; i++) {

            //palavra = palavra.substring(0,1).toUpperCase().concat(palavra.substring(1)); deixa a primeira letra maiuscula
            //Link referencia https://www.guj.com.br/t/resolvido-deixar-maiuscula-a-primeira-letra-da-string/55209
            String palavra = vect[i].substring(0, 1).toUpperCase().concat(vect[i].substring(1));

            fraseSet.add(palavra);
        }
        for (String x : fraseSet) {
            System.out.print(x + " ");
        }

        System.out.println();
        System.out.println("------------------------------");

        Set<Integer> setInt = new TreeSet<>();

        setInt.add(14);
        setInt.add(2);
        setInt.add(5);
        setInt.add(71);

        System.out.println(setInt);
        System.out.println(Collections.max(setInt));
        System.out.println(Collections.min(setInt));

        System.out.println("------------------------------");

        List<Integer> test1 = new ArrayList<>();

        test1.add(1);
        test1.add(1);
        test1.add(2);
        test1.add(2);
        test1.add(3);
        test1.add(3);

        Set<Integer> test2 = new LinkedHashSet<>(); //Nao aceita duplicatas
        test2.addAll(test1);
        test1.removeAll(test1); //Consigo remover as duplicatas e buscar pela posicao na lista
        test1.addAll(test2);

        System.out.println(test1.get(2));
    }
}
