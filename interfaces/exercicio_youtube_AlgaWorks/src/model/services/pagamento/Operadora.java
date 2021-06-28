package model.services.pagamento;

public interface Operadora {

    boolean autorizar(Autorizavel autorizavel, Cartao cartao);
}
