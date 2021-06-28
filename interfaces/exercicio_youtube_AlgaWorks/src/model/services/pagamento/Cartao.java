package model.services.pagamento;

public class Cartao {

    private String nomeTitular;
    private String numeroCartao;

    public Cartao(String nomeTitular, String numeroCartao) {
        this.nomeTitular = nomeTitular;
        this.numeroCartao = numeroCartao;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
}
