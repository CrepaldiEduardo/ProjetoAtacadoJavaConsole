package br.com.atacado.dominio;

import java.time.LocalDate;

public class Frota extends Veiculo {

    public Frota() {
    }

    public Frota(int codigo, String descricao, LocalDate datainsert) {
        super(codigo, descricao, datainsert);
    }

}
