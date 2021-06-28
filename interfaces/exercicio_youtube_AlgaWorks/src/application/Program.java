package application;

import model.entities.Checkout;
import model.entities.Compra;
import model.services.impressao.Impressora;
import model.services.impressao.impressoras.ImpressoraEpson;
import model.services.impressao.impressoras.ImpressoraHP;
import model.services.pagamento.Cartao;
import model.services.pagamento.Operadora;
import model.services.pagamento.operadoras.Cielo;
import model.services.pagamento.operadoras.RedeCard;

public class Program {
    public static void main(String[] args) {

        //Link da video aula https://youtu.be/BAu7Ih5WlT8

        Operadora operadora = new RedeCard();
        Impressora impressora = new ImpressoraHP();

        Cartao cartao = new Cartao("José Meurer", "213");

        Compra compra = new Compra(30.0, "Mortadela", "José Meurer");

       // Checkout checkout = new Checkout(new Cielo(), new ImpressoraEpson());
        Checkout checkout = new Checkout(operadora, impressora);
        checkout.fecharCompra(compra, cartao);
    }
}
