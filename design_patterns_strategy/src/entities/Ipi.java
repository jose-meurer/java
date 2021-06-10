package entities;

public class Ipi implements Imposto{

    private Double valor;

    public Ipi(){
        super();
    }

    public Ipi(Double valor){
        this.valor = valor;
    }

    @Override
    public Double calcular(){
        return this.valor * 0.20;
    }

}
