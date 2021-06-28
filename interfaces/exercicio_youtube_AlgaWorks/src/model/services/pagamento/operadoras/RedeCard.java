package model.services.pagamento.operadoras;

import model.services.pagamento.Autorizavel;
import model.services.pagamento.Cartao;
import model.services.pagamento.Operadora;

public class RedeCard  implements Operadora {

    @Override
    public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
        return cartao.getNomeTitular().equals(autorizavel.getNomeCliente()) && cartao.getNumeroCartao().startsWith("213") && autorizavel.getValorTotal() <= 500.0;
    }
}

