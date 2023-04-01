package br.com.atacado.dominio;

import java.time.LocalDate;

public class Frota extends BaseTransporte {

    public Frota(int codigo, String descricao, LocalDate datainsert) {
        super(codigo, descricao, datainsert);
    }

    public Frota() {
    }

    

}
