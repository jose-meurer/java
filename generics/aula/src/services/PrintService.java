package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> { // T denomina o tipo de objeto que irá ser tratado, declarado no main(neste programa)
                                            //Resumo, a classe é generica, e trata o tipo de objeto que é declara na hora
    List<T> valueList = new ArrayList<>();

    public PrintService() {
    }

    public void addValue(T x) {
        valueList.add(x);
    }

    public T first() {
        if (valueList.isEmpty()) {
            throw new IllegalStateException("Error: List is empty");
        }
        return valueList.get(0);
    }

    public void print() {
        System.out.print("[");
        if (!valueList.isEmpty()) {
            System.out.print(valueList.get(0));
        }
        for (int i = 1; i < valueList.size(); i++) {
            System.out.print(", " + valueList.get(i));
        }
        System.out.println("]");
    }
}
