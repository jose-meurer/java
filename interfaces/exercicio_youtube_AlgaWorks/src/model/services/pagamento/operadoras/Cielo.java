package model.services.pagamento.operadoras;

import model.services.pagamento.Autorizavel;
import model.services.pagamento.Cartao;
import model.services.pagamento.Operadora;

public class Cielo implements Operadora {


    @Override
    public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
        return cartao.getNomeTitular().equals(autorizavel.getNomeCliente()) && cartao.getNumeroCartao().startsWith("456") && autorizavel.getValorTotal() <= 50.0;
    }
}
