package model.services.impressao.impressoras;

import model.services.impressao.Impressora;
import model.services.impressao.Imprimivel;

public class ImpressoraEpson implements Impressora {

    @Override
    public void imprimir(Imprimivel imprimivel) {
        System.out.println("IMPRIMINDO NA IMPRESSORA EPSON: " + "\n" + imprimivel.getCabecalhoPagina() + "\n" + imprimivel.getCorpoPagina());
    }
}
