package model.entities;

import model.services.impressao.Imprimivel;
import model.services.pagamento.Autorizavel;

public class Compra implements Autorizavel, Imprimivel {

    private double valorTotal;
    private String nomeProduto;
    private String nomeCliente;

    public Compra(double valorTotal, String nomeProduto, String nomeCliente) {
        this.valorTotal = valorTotal;
        this.nomeProduto = nomeProduto;
        this.nomeCliente = nomeCliente;
    }

    @Override
    public double getValorTotal() {
        return this.valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    @Override
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    @Override
    public String getCabecalhoPagina() {
        return "Nome do cliente: " + getNomeCliente();
    }

    @Override
    public String getCorpoPagina() {
        return "Produto: " + this.getNomeProduto() + " = " + this.getValorTotal();
    }
}
