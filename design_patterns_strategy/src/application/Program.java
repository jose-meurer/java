package application;

import entities.CalculadoraDeImposto;
import entities.Icms;
import entities.Imposto;
import entities.Ipi;

public class Program {
    public static void main(String[] args) {

        CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
        Imposto icms = new Icms(100.0); //Teste passando interface como tipo.
        Ipi ipi = new Ipi(100.0); //Teste passando filha como tipo.

        System.out.println(calculadora.calcular(icms));

        //System.out.println(ipi.calcular()); //Teste
        System.out.println(calculadora.calcular(ipi));

    }
}
