package entities;

public class Icms implements Imposto{

    private Double valor;

    public Icms(){
        super();
    }

    public Icms(Double valor) {
        super();
        this.valor = valor;
    }

    @Override
    public Double calcular(){
        return this.valor * 0.10;
    }
}
