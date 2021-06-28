package model.services.impressao.impressoras;

import model.services.impressao.Impressora;
import model.services.impressao.Imprimivel;

public class ImpressoraHP implements Impressora {

    @Override
    public void imprimir(Imprimivel imprimivel) {
        System.out.println("::::::::::: IMPRIMINDO NA IMPRESSORA HP :::::::::::");
        System.out.println(imprimivel.getCabecalhoPagina());
        System.out.println("::::::::::::::::::::::");
        System.out.println(imprimivel.getCorpoPagina());
    }
}
